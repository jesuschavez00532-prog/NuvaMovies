package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import androidx.core.view.C0609o1;
import androidx.core.view.InterfaceC0588j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p020b0.AbstractC1031a;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC0871a mAdapter;
    private List<InterfaceC0865i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC0866j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0862f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C0868l mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC0866j mOnPageChangeListener;
    private List<InterfaceC0866j> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC0867k mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0862f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<C0862f> COMPARATOR = new C0857a();
    private static final Interpolator sInterpolator = new InterpolatorC0858b();
    private static final C0870n sPositionComparator = new C0870n();

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    static class C0857a implements Comparator {
        C0857a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0862f c0862f, C0862f c0862f2) {
            return c0862f.f3657b - c0862f2.f3657b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: classes.dex */
    static class InterpolatorC0858b implements Interpolator {
        InterpolatorC0858b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    class RunnableC0859c implements Runnable {
        RunnableC0859c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C0860d implements InterfaceC0588j0 {

        /* renamed from: a */
        private final Rect f3654a = new Rect();

        C0860d() {
        }

        @Override // androidx.core.view.InterfaceC0588j0
        public C0609o1 onApplyWindowInsets(View view, C0609o1 c0609o1) {
            C0609o1 m2608Z = AbstractC0616q0.m2608Z(view, c0609o1);
            if (m2608Z.m2523n()) {
                return m2608Z;
            }
            Rect rect = this.f3654a;
            rect.left = m2608Z.m2519i();
            rect.top = m2608Z.m2521k();
            rect.right = m2608Z.m2520j();
            rect.bottom = m2608Z.m2518h();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C0609o1 m2623h = AbstractC0616q0.m2623h(ViewPager.this.getChildAt(i10), m2608Z);
                rect.left = Math.min(m2623h.m2519i(), rect.left);
                rect.top = Math.min(m2623h.m2521k(), rect.top);
                rect.right = Math.min(m2623h.m2520j(), rect.right);
                rect.bottom = Math.min(m2623h.m2518h(), rect.bottom);
            }
            return m2608Z.m2524o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC0861e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C0862f {

        /* renamed from: a */
        Object f3656a;

        /* renamed from: b */
        int f3657b;

        /* renamed from: c */
        boolean f3658c;

        /* renamed from: d */
        float f3659d;

        /* renamed from: e */
        float f3660e;

        C0862f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public class C0864h extends C0551a {
        C0864h() {
        }

        /* renamed from: n */
        private boolean m4458n() {
            AbstractC0871a abstractC0871a = ViewPager.this.mAdapter;
            if (abstractC0871a != null && abstractC0871a.getCount() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: f */
        public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0871a abstractC0871a;
            super.mo2381f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4458n());
            if (accessibilityEvent.getEventType() == 4096 && (abstractC0871a = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(abstractC0871a.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            super.mo2382g(view, c7458h0);
            c7458h0.m28599X(ViewPager.class.getName());
            c7458h0.m28626o0(m4458n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c7458h0.m28602a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c7458h0.m28602a(8192);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: j */
        public boolean mo2385j(View view, int i10, Bundle bundle) {
            if (super.mo2385j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0865i {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0866j {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0867k {
        void transformPage(View view, float f10);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    private class C0868l extends DataSetObserver {
        C0868l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C0869m extends AbstractC1031a {
        public static final Parcelable.Creator<C0869m> CREATOR = new a();

        /* renamed from: c */
        int f3669c;

        /* renamed from: d */
        Parcelable f3670d;

        /* renamed from: e */
        ClassLoader f3671e;

        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0869m createFromParcel(Parcel parcel) {
                return new C0869m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0869m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0869m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0869m[] newArray(int i10) {
                return new C0869m[i10];
            }
        }

        public C0869m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3669c + "}";
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3669c);
            parcel.writeParcelable(this.f3670d, i10);
        }

        C0869m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3669c = parcel.readInt();
            this.f3670d = parcel.readParcelable(classLoader);
            this.f3671e = classLoader;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    /* loaded from: classes.dex */
    public static class C0870n implements Comparator {
        C0870n() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0863g c0863g = (C0863g) view.getLayoutParams();
            C0863g c0863g2 = (C0863g) view2.getLayoutParams();
            boolean z10 = c0863g.f3661a;
            if (z10 != c0863g2.f3661a) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return c0863g.f3665e - c0863g2.f3665e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0862f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0859c();
        this.mScrollState = 0;
        initViewPager();
    }

    /* renamed from: a */
    private void m4436a(C0862f c0862f, int i10, C0862f c0862f2) {
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        C0862f c0862f3;
        C0862f c0862f4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f10 = this.mPageMargin / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (c0862f2 != null) {
            int i13 = c0862f2.f3657b;
            int i14 = c0862f.f3657b;
            if (i13 < i14) {
                float f13 = c0862f2.f3660e + c0862f2.f3659d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= c0862f.f3657b && i16 < this.mItems.size()) {
                    C0862f c0862f5 = this.mItems.get(i16);
                    while (true) {
                        c0862f4 = c0862f5;
                        if (i15 <= c0862f4.f3657b || i16 >= this.mItems.size() - 1) {
                            break;
                        }
                        i16++;
                        c0862f5 = this.mItems.get(i16);
                    }
                    while (i15 < c0862f4.f3657b) {
                        f13 += this.mAdapter.getPageWidth(i15) + f10;
                        i15++;
                    }
                    c0862f4.f3660e = f13;
                    f13 += c0862f4.f3659d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.mItems.size() - 1;
                float f14 = c0862f2.f3660e;
                while (true) {
                    i13--;
                    if (i13 < c0862f.f3657b || size < 0) {
                        break;
                    }
                    C0862f c0862f6 = this.mItems.get(size);
                    while (true) {
                        c0862f3 = c0862f6;
                        if (i13 >= c0862f3.f3657b || size <= 0) {
                            break;
                        }
                        size--;
                        c0862f6 = this.mItems.get(size);
                    }
                    while (i13 > c0862f3.f3657b) {
                        f14 -= this.mAdapter.getPageWidth(i13) + f10;
                        i13--;
                    }
                    f14 -= c0862f3.f3659d + f10;
                    c0862f3.f3660e = f14;
                }
            }
        }
        int size2 = this.mItems.size();
        float f15 = c0862f.f3660e;
        int i17 = c0862f.f3657b;
        int i18 = i17 - 1;
        if (i17 == 0) {
            f11 = f15;
        } else {
            f11 = -3.4028235E38f;
        }
        this.mFirstOffset = f11;
        int i19 = count - 1;
        if (i17 == i19) {
            f12 = (c0862f.f3659d + f15) - 1.0f;
        } else {
            f12 = Float.MAX_VALUE;
        }
        this.mLastOffset = f12;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            C0862f c0862f7 = this.mItems.get(i20);
            while (true) {
                i12 = c0862f7.f3657b;
                if (i18 <= i12) {
                    break;
                }
                f15 -= this.mAdapter.getPageWidth(i18) + f10;
                i18--;
            }
            f15 -= c0862f7.f3659d + f10;
            c0862f7.f3660e = f15;
            if (i12 == 0) {
                this.mFirstOffset = f15;
            }
            i20--;
            i18--;
        }
        float f16 = c0862f.f3660e + c0862f.f3659d + f10;
        int i21 = c0862f.f3657b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            C0862f c0862f8 = this.mItems.get(i22);
            while (true) {
                i11 = c0862f8.f3657b;
                if (i21 >= i11) {
                    break;
                }
                f16 += this.mAdapter.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.mLastOffset = (c0862f8.f3659d + f16) - 1.0f;
            }
            c0862f8.f3660e = f16;
            f16 += c0862f8.f3659d + f10;
            i22++;
            i21++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    /* renamed from: b */
    private void m4437b(boolean z10) {
        boolean z11;
        if (this.mScrollState == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4449n(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            C0862f c0862f = this.mItems.get(i10);
            if (c0862f.f3658c) {
                c0862f.f3658c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                AbstractC0616q0.m2620f0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    /* renamed from: c */
    private int m4438c(int i10, float f10, int i11, int i12) {
        float f11;
        if (Math.abs(i12) > this.mFlingDistance && Math.abs(i11) > this.mMinimumVelocity) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.mCurItem) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 += (int) (f10 + f11);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).f3657b, Math.min(i10, this.mItems.get(r4.size() - 1).f3657b));
        }
        return i10;
    }

    /* renamed from: d */
    private void m4439d(int i10, float f10, int i11) {
        InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageScrolled(i10, f10, i11);
        }
        List<InterfaceC0866j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC0866j interfaceC0866j2 = this.mOnPageChangeListeners.get(i12);
                if (interfaceC0866j2 != null) {
                    interfaceC0866j2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        InterfaceC0866j interfaceC0866j3 = this.mInternalPageChangeListener;
        if (interfaceC0866j3 != null) {
            interfaceC0866j3.onPageScrolled(i10, f10, i11);
        }
    }

    /* renamed from: e */
    private void m4440e(int i10) {
        InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageSelected(i10);
        }
        List<InterfaceC0866j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0866j interfaceC0866j2 = this.mOnPageChangeListeners.get(i11);
                if (interfaceC0866j2 != null) {
                    interfaceC0866j2.onPageSelected(i10);
                }
            }
        }
        InterfaceC0866j interfaceC0866j3 = this.mInternalPageChangeListener;
        if (interfaceC0866j3 != null) {
            interfaceC0866j3.onPageSelected(i10);
        }
    }

    /* renamed from: f */
    private void m4441f(int i10) {
        InterfaceC0866j interfaceC0866j = this.mOnPageChangeListener;
        if (interfaceC0866j != null) {
            interfaceC0866j.onPageScrollStateChanged(i10);
        }
        List<InterfaceC0866j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0866j interfaceC0866j2 = this.mOnPageChangeListeners.get(i11);
                if (interfaceC0866j2 != null) {
                    interfaceC0866j2.onPageScrollStateChanged(i10);
                }
            }
        }
        InterfaceC0866j interfaceC0866j3 = this.mInternalPageChangeListener;
        if (interfaceC0866j3 != null) {
            interfaceC0866j3.onPageScrollStateChanged(i10);
        }
    }

    /* renamed from: g */
    private void m4442g(boolean z10) {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (z10) {
                i10 = this.mPageTransformerLayerType;
            } else {
                i10 = 0;
            }
            getChildAt(i11).setLayerType(i10, null);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m4443h() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* renamed from: i */
    private Rect m4444i(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: j */
    private C0862f m4445j() {
        float f10;
        float f11;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = getScrollX() / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.mPageMargin / clientWidth;
        } else {
            f11 = 0.0f;
        }
        C0862f c0862f = null;
        float f13 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.mItems.size()) {
            C0862f c0862f2 = this.mItems.get(i12);
            if (!z10 && c0862f2.f3657b != (i10 = i11 + 1)) {
                c0862f2 = this.mTempItem;
                c0862f2.f3660e = f12 + f13 + f11;
                c0862f2.f3657b = i10;
                c0862f2.f3659d = this.mAdapter.getPageWidth(i10);
                i12--;
            }
            C0862f c0862f3 = c0862f2;
            f12 = c0862f3.f3660e;
            float f14 = c0862f3.f3659d + f12 + f11;
            if (!z10 && f10 < f12) {
                return c0862f;
            }
            if (f10 >= f14 && i12 != this.mItems.size() - 1) {
                int i13 = c0862f3.f3657b;
                float f15 = c0862f3.f3659d;
                i12++;
                z10 = false;
                i11 = i13;
                f13 = f15;
                c0862f = c0862f3;
            } else {
                return c0862f3;
            }
        }
        return c0862f;
    }

    /* renamed from: k */
    private static boolean m4446k(View view) {
        if (view.getClass().getAnnotation(InterfaceC0861e.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m4447l(float f10, float f11) {
        if ((f10 < this.mGutterSize && f11 > 0.0f) || (f10 > getWidth() - this.mGutterSize && f11 < 0.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m4448m(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i10);
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: n */
    private boolean m4449n(int i10) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0862f m4445j = m4445j();
        int clientWidth = getClientWidth();
        int i11 = this.mPageMargin;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = m4445j.f3657b;
        float f11 = ((i10 / f10) - m4445j.f3660e) / (m4445j.f3659d + (i11 / f10));
        this.mCalledSuper = false;
        onPageScrolled(i13, f11, (int) (i12 * f11));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: o */
    private boolean m4450o(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.mLastMotionX - f10;
        this.mLastMotionX = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        boolean z12 = false;
        C0862f c0862f = this.mItems.get(0);
        ArrayList<C0862f> arrayList = this.mItems;
        C0862f c0862f2 = arrayList.get(arrayList.size() - 1);
        if (c0862f.f3657b != 0) {
            f12 = c0862f.f3660e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (c0862f2.f3657b != this.mAdapter.getCount() - 1) {
            f13 = c0862f2.f3660e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.mLeftEdge.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.mRightEdge.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.mLastMotionX += scrollX - i10;
        scrollTo(i10, getScrollY());
        m4449n(i10);
        return z12;
    }

    /* renamed from: p */
    private void m4451p(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        C0862f infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f10 = Math.min(infoForPosition.f3660e, this.mLastOffset);
        } else {
            f10 = 0.0f;
        }
        int paddingLeft = (int) (f10 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            m4437b(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    /* renamed from: q */
    private void m4452q() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0863g) getChildAt(i10).getLayoutParams()).f3661a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    /* renamed from: r */
    private void m4453r(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* renamed from: s */
    private boolean m4454s() {
        this.mActivePointerId = -1;
        m4443h();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.mScrollingCacheEnabled != z10) {
            this.mScrollingCacheEnabled = z10;
        }
    }

    /* renamed from: t */
    private void m4455t(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        C0862f infoForPosition = infoForPosition(i10);
        if (infoForPosition != null) {
            i12 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f3660e, this.mLastOffset)));
        } else {
            i12 = 0;
        }
        if (z10) {
            smoothScrollTo(i12, 0, i11);
            if (z11) {
                m4440e(i10);
                return;
            }
            return;
        }
        if (z11) {
            m4440e(i10);
        }
        m4437b(false);
        scrollTo(i12, 0);
        m4449n(i12);
    }

    /* renamed from: u */
    private void m4456u() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.mDrawingOrderedChildren.add(getChildAt(i10));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        C0862f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f3657b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    C0862f addNewItem(int i10, int i11) {
        C0862f c0862f = new C0862f();
        c0862f.f3657b = i10;
        c0862f.f3656a = this.mAdapter.instantiateItem((ViewGroup) this, i10);
        c0862f.f3659d = this.mAdapter.getPageWidth(i10);
        if (i11 >= 0 && i11 < this.mItems.size()) {
            this.mItems.add(i11, c0862f);
        } else {
            this.mItems.add(c0862f);
        }
        return c0862f;
    }

    public void addOnAdapterChangeListener(InterfaceC0865i interfaceC0865i) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC0865i);
    }

    public void addOnPageChangeListener(InterfaceC0866j interfaceC0866j) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC0866j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0862f infoForChild;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f3657b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0863g c0863g = (C0863g) layoutParams;
        boolean m4446k = c0863g.f3661a | m4446k(view);
        c0863g.f3661a = m4446k;
        if (this.mInLayout) {
            if (!m4446k) {
                c0863g.f3664d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.m4444i(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.m4444i(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.pageLeft()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.m4444i(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.m4444i(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.pageRight()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.pageRight()
            goto Lcd
        Lc9:
            boolean r2 = r6.pageLeft()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C0863g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC0866j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m4449n(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            AbstractC0616q0.m2618e0(this);
            return;
        }
        m4437b(true);
    }

    void dataSetChanged() {
        boolean z10;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.mCurItem;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.mItems.size()) {
            C0862f c0862f = this.mItems.get(i11);
            int itemPosition = this.mAdapter.getItemPosition(c0862f.f3656a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i11);
                    i11--;
                    if (!z11) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c0862f.f3657b, c0862f.f3656a);
                    int i12 = this.mCurItem;
                    if (i12 == c0862f.f3657b) {
                        i10 = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = c0862f.f3657b;
                    if (i13 != itemPosition) {
                        if (i13 == this.mCurItem) {
                            i10 = itemPosition;
                        }
                        c0862f.f3657b = itemPosition;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                C0863g c0863g = (C0863g) getChildAt(i14).getLayoutParams();
                if (!c0863g.f3661a) {
                    c0863g.f3663c = 0.0f;
                }
            }
            setCurrentItemInternal(i10, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0862f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f3657b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0871a abstractC0871a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC0871a = this.mAdapter) == null || abstractC0871a.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z10 = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z10 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            AbstractC0616q0.m2618e0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0862f m4445j = m4445j();
                setCurrentItemInternal(m4438c(m4445j.f3657b, ((scrollX / clientWidth) - m4445j.f3660e) / m4445j.f3659d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            m4443h();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return pageRight();
                    }
                    return arrowScroll(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f10) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f10;
            float scrollX = getScrollX() - f10;
            float clientWidth = getClientWidth();
            float f11 = this.mFirstOffset * clientWidth;
            float f12 = this.mLastOffset * clientWidth;
            C0862f c0862f = this.mItems.get(0);
            C0862f c0862f2 = this.mItems.get(r4.size() - 1);
            if (c0862f.f3657b != 0) {
                f11 = c0862f.f3660e * clientWidth;
            }
            if (c0862f2.f3657b != this.mAdapter.getCount() - 1) {
                f12 = c0862f2.f3660e * clientWidth;
            }
            if (scrollX < f11) {
                scrollX = f11;
            } else if (scrollX > f12) {
                scrollX = f12;
            }
            int i10 = (int) scrollX;
            this.mLastMotionX += scrollX - i10;
            scrollTo(i10, getScrollY());
            m4449n(i10);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0863g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0871a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.mDrawingOrder == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0863g) this.mDrawingOrderedChildren.get(i11).getLayoutParams()).f3666f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    C0862f infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    C0862f infoForChild(View view) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            C0862f c0862f = this.mItems.get(i10);
            if (this.mAdapter.isViewFromObject(view, c0862f.f3656a)) {
                return c0862f;
            }
        }
        return null;
    }

    C0862f infoForPosition(int i10) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            C0862f c0862f = this.mItems.get(i11);
            if (c0862f.f3657b == i10) {
                return c0862f;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f10);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f10);
        this.mCloseEnough = (int) (2.0f * f10);
        this.mDefaultGutterSize = (int) (f10 * 16.0f);
        AbstractC0616q0.m2636n0(this, new C0864h());
        if (AbstractC0616q0.m2659z(this) == 0) {
            AbstractC0616q0.m2654w0(this, 1);
        }
        AbstractC0616q0.m2658y0(this, new C0860d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f12 = this.mPageMargin / width;
            int i11 = 0;
            C0862f c0862f = this.mItems.get(0);
            float f13 = c0862f.f3660e;
            int size = this.mItems.size();
            int i12 = c0862f.f3657b;
            int i13 = this.mItems.get(size - 1).f3657b;
            while (i12 < i13) {
                while (true) {
                    i10 = c0862f.f3657b;
                    if (i12 <= i10 || i11 >= size) {
                        break;
                    }
                    i11++;
                    c0862f = this.mItems.get(i11);
                }
                if (i12 == i10) {
                    float f14 = c0862f.f3660e;
                    float f15 = c0862f.f3659d;
                    f10 = (f14 + f15) * width;
                    f13 = f14 + f15 + f12;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i12);
                    f10 = (f13 + pageWidth) * width;
                    f13 += pageWidth + f12;
                }
                if (this.mPageMargin + f10 > scrollX) {
                    f11 = f12;
                    this.mMarginDrawable.setBounds(Math.round(f10), this.mTopPageBounds, Math.round(this.mPageMargin + f10), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f11 = f12;
                }
                if (f10 <= scrollX + r2) {
                    i12++;
                    f12 = f11;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m4448m(motionEvent);
                    }
                } else {
                    int i10 = this.mActivePointerId;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.mLastMotionX;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.mInitialMotionY);
                        if (f11 != 0.0f && !m4447l(this.mLastMotionX, f11) && canScroll(this, false, (int) f11, (int) x10, (int) y10)) {
                            this.mLastMotionX = x10;
                            this.mLastMotionY = y10;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i11 = this.mTouchSlop;
                        if (abs > i11 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            m4453r(true);
                            setScrollState(1);
                            if (f11 > 0.0f) {
                                f10 = this.mInitialMotionX + this.mTouchSlop;
                            } else {
                                f10 = this.mInitialMotionX - this.mTouchSlop;
                            }
                            this.mLastMotionX = f10;
                            this.mLastMotionY = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i11) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && m4450o(x10)) {
                            AbstractC0616q0.m2618e0(this);
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.mInitialMotionX = x11;
                this.mLastMotionX = x11;
                float y11 = motionEvent.getY();
                this.mInitialMotionY = y11;
                this.mLastMotionY = y11;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    m4453r(true);
                    setScrollState(1);
                } else {
                    m4437b(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        m4454s();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0863g) r9
            boolean r10 = r9.f3661a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f3662b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.m4439d(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0863g) r0
            boolean r0 = r0.f3661a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        C0862f infoForChild;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f3657b == this.mCurItem && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0869m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0869m c0869m = (C0869m) parcelable;
        super.onRestoreInstanceState(c0869m.m4828a());
        AbstractC0871a abstractC0871a = this.mAdapter;
        if (abstractC0871a != null) {
            abstractC0871a.restoreState(c0869m.f3670d, c0869m.f3671e);
            setCurrentItemInternal(c0869m.f3669c, false, true);
        } else {
            this.mRestoredCurItem = c0869m.f3669c;
            this.mRestoredAdapterState = c0869m.f3670d;
            this.mRestoredClassLoader = c0869m.f3671e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0869m c0869m = new C0869m(super.onSaveInstanceState());
        c0869m.f3669c = this.mCurItem;
        AbstractC0871a abstractC0871a = this.mAdapter;
        if (abstractC0871a != null) {
            c0869m.f3670d = abstractC0871a.saveState();
        }
        return c0869m;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.mPageMargin;
            m4451p(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0871a abstractC0871a;
        float f10;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC0871a = this.mAdapter) == null || abstractC0871a.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m4448m(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        m4455t(this.mCurItem, true, 0, false);
                        z10 = m4454s();
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z10 = m4454s();
                        } else {
                            float x10 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x10 - this.mLastMotionX);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                m4453r(true);
                                float f11 = this.mInitialMotionX;
                                if (x10 - f11 > 0.0f) {
                                    f10 = f11 + this.mTouchSlop;
                                } else {
                                    f10 = f11 - this.mTouchSlop;
                                }
                                this.mLastMotionX = f10;
                                this.mLastMotionY = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z10 = false | m4450o(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0862f m4445j = m4445j();
                float f12 = clientWidth;
                setCurrentItemInternal(m4438c(m4445j.f3657b, ((scrollX / f12) - m4445j.f3660e) / (m4445j.f3659d + (this.mPageMargin / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z10 = m4454s();
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x11 = motionEvent.getX();
            this.mInitialMotionX = x11;
            this.mLastMotionX = x11;
            float y11 = motionEvent.getY();
            this.mInitialMotionY = y11;
            this.mLastMotionY = y11;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z10) {
            AbstractC0616q0.m2618e0(this);
        }
        return true;
    }

    boolean pageLeft() {
        int i10 = this.mCurItem;
        if (i10 > 0) {
            setCurrentItem(i10 - 1, true);
            return true;
        }
        return false;
    }

    boolean pageRight() {
        AbstractC0871a abstractC0871a = this.mAdapter;
        if (abstractC0871a != null && this.mCurItem < abstractC0871a.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(InterfaceC0865i interfaceC0865i) {
        List<InterfaceC0865i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC0865i);
        }
    }

    public void removeOnPageChangeListener(InterfaceC0866j interfaceC0866j) {
        List<InterfaceC0866j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC0866j);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0871a abstractC0871a) {
        AbstractC0871a abstractC0871a2 = this.mAdapter;
        if (abstractC0871a2 != null) {
            abstractC0871a2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.mItems.size(); i10++) {
                C0862f c0862f = this.mItems.get(i10);
                this.mAdapter.destroyItem((ViewGroup) this, c0862f.f3657b, c0862f.f3656a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            m4452q();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = abstractC0871a;
        this.mExpectedAdapterCount = 0;
        if (abstractC0871a != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0868l();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z10 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z10) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC0865i> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty() && this.mAdapterChangeListeners.size() > 0) {
            AbstractC0272b.m941a(this.mAdapterChangeListeners.get(0));
            throw null;
        }
    }

    public void setCurrentItem(int i10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i10, boolean z10, boolean z11) {
        setCurrentItemInternal(i10, z10, z11, 0);
    }

    InterfaceC0866j setInternalPageChangeListener(InterfaceC0866j interfaceC0866j) {
        InterfaceC0866j interfaceC0866j2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC0866j;
        return interfaceC0866j2;
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i10;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0866j interfaceC0866j) {
        this.mOnPageChangeListener = interfaceC0866j;
    }

    public void setPageMargin(int i10) {
        int i11 = this.mPageMargin;
        this.mPageMargin = i10;
        int width = getWidth();
        m4451p(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, InterfaceC0867k interfaceC0867k) {
        setPageTransformer(z10, interfaceC0867k, 2);
    }

    void setScrollState(int i10) {
        boolean z10;
        if (this.mScrollState == i10) {
            return;
        }
        this.mScrollState = i10;
        if (this.mPageTransformer != null) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            m4442g(z10);
        }
        m4441f(i10);
    }

    void smoothScrollTo(int i10, int i11) {
        smoothScrollTo(i10, i11, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public static class C0863g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3661a;

        /* renamed from: b */
        public int f3662b;

        /* renamed from: c */
        float f3663c;

        /* renamed from: d */
        boolean f3664d;

        /* renamed from: e */
        int f3665e;

        /* renamed from: f */
        int f3666f;

        public C0863g() {
            super(-1, -1);
            this.f3663c = 0.0f;
        }

        public C0863g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3663c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f3662b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0863g(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void populate(int r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    void setCurrentItemInternal(int i10, boolean z10, boolean z11, int i11) {
        AbstractC0871a abstractC0871a = this.mAdapter;
        if (abstractC0871a != null && abstractC0871a.getCount() > 0) {
            if (!z11 && this.mCurItem == i10 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.mAdapter.getCount()) {
                i10 = this.mAdapter.getCount() - 1;
            }
            int i12 = this.mOffscreenPageLimit;
            int i13 = this.mCurItem;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.mItems.size(); i14++) {
                    this.mItems.get(i14).f3658c = true;
                }
            }
            boolean z12 = this.mCurItem != i10;
            if (this.mFirstLayout) {
                this.mCurItem = i10;
                if (z12) {
                    m4440e(i10);
                }
                requestLayout();
                return;
            }
            populate(i10);
            m4455t(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z10, InterfaceC0867k interfaceC0867k, int i10) {
        boolean z11 = interfaceC0867k != null;
        boolean z12 = z11 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC0867k;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.mDrawingOrder = z10 ? 2 : 1;
            this.mPageTransformerLayerType = i10;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z12) {
            populate();
        }
    }

    void smoothScrollTo(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            m4437b(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float distanceInfluenceForSnapDuration = f11 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((f10 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i13, scrollY, i14, i15, min);
        AbstractC0616q0.m2618e0(this);
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, z10, false);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(AbstractC0547a.m2324f(getContext(), i10));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0862f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0859c();
        this.mScrollState = 0;
        initViewPager();
    }
}
