package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0560c0;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0640w0;
import androidx.core.view.C0551a;
import androidx.core.view.C0568e0;
import androidx.core.view.InterfaceC0564d0;
import androidx.core.widget.AbstractC0674i;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.C0814a;
import androidx.recyclerview.widget.C0815b;
import androidx.recyclerview.widget.C0826m;
import androidx.recyclerview.widget.C0830q;
import androidx.recyclerview.widget.C0831r;
import androidx.recyclerview.widget.RunnableC0819f;
import com.umeng.analytics.pro.C3395q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a0.AbstractC0000a;
import p020b0.AbstractC1031a;
import p331t.AbstractC6880k;
import p373w.AbstractC7342g;
import p389x.AbstractC7445b;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0564d0 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final C0781c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    C0826m mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC0789h mAdapter;
    C0814a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0792k mChildDrawingOrderCallback;
    C0815b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0793l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0819f mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0801t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0794m mItemAnimator;
    private AbstractC0794m.a mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0796o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC0797p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0806y mObserver;
    private List<InterfaceC0799r> mOnChildAttachStateListeners;
    private AbstractC0800s mOnFlingListener;
    private final ArrayList<InterfaceC0801t> mOnItemTouchListeners;
    final List<AbstractC0787f0> mPendingAccessibilityImportanceChange;
    C0807z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    RunnableC0819f.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0804w mRecycler;
    InterfaceC0805x mRecyclerListener;
    final List<InterfaceC0805x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0802u mScrollListener;
    private List<AbstractC0802u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0568e0 mScrollingChildHelper;
    final C0779b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0785e0 mViewFlinger;
    private final C0831r.b mViewInfoProcessCallback;
    final C0831r mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    class RunnableC0776a implements Runnable {
        RunnableC0776a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0777a0 {
        private AbstractC0797p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private int f3208a;

            /* renamed from: b */
            private int f3209b;

            /* renamed from: c */
            private int f3210c;

            /* renamed from: d */
            private int f3211d;

            /* renamed from: e */
            private Interpolator f3212e;

            /* renamed from: f */
            private boolean f3213f;

            /* renamed from: g */
            private int f3214g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m3829e() {
                if (this.f3212e != null && this.f3210c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3210c >= 1) {
                } else {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m3830a() {
                if (this.f3211d >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public void m3831b(int i10) {
                this.f3211d = i10;
            }

            /* renamed from: c */
            void m3832c(RecyclerView recyclerView) {
                int i10 = this.f3211d;
                if (i10 >= 0) {
                    this.f3211d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f3213f = false;
                } else {
                    if (this.f3213f) {
                        m3829e();
                        recyclerView.mViewFlinger.m3864e(this.f3208a, this.f3209b, this.f3210c, this.f3212e);
                        int i11 = this.f3214g + 1;
                        this.f3214g = i11;
                        if (i11 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f3213f = false;
                        return;
                    }
                    this.f3214g = 0;
                }
            }

            /* renamed from: d */
            public void m3833d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3208a = i10;
                this.f3209b = i11;
                this.f3210c = i12;
                this.f3212e = interpolator;
                this.f3213f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3211d = -1;
                this.f3213f = false;
                this.f3214g = 0;
                this.f3208a = i10;
                this.f3209b = i11;
                this.f3210c = i12;
                this.f3212e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        /* loaded from: classes.dex */
        public class b {
            PointF computeScrollVectorForPosition(int i10);
        }

        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.mLayout.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public AbstractC0797p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.scrollToPosition(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i10, int i11) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = computeScrollVectorForPosition.x;
                if (f10 != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m3832c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.mState, this.mRecyclingAction);
                boolean m3830a = this.mRecyclingAction.m3830a();
                this.mRecyclingAction.m3832c(recyclerView);
                if (m3830a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m3863d();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void onSeekTargetStep(int i10, int i11, C0779b0 c0779b0, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, C0779b0 c0779b0, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        void start(RecyclerView recyclerView, AbstractC0797p abstractC0797p) {
            recyclerView.mViewFlinger.m3865f();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC0797p;
            int i10 = this.mTargetPosition;
            if (i10 != -1) {
                recyclerView.mState.f3216a = i10;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.m3863d();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void stop() {
            if (!this.mRunning) {
                return;
            }
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f3216a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    class RunnableC0778b implements Runnable {
        RunnableC0778b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0794m abstractC0794m = RecyclerView.this.mItemAnimator;
            if (abstractC0794m != null) {
                abstractC0794m.mo3904u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public static class C0779b0 {

        /* renamed from: b */
        private SparseArray f3217b;

        /* renamed from: m */
        int f3228m;

        /* renamed from: n */
        long f3229n;

        /* renamed from: o */
        int f3230o;

        /* renamed from: p */
        int f3231p;

        /* renamed from: q */
        int f3232q;

        /* renamed from: a */
        int f3216a = -1;

        /* renamed from: c */
        int f3218c = 0;

        /* renamed from: d */
        int f3219d = 0;

        /* renamed from: e */
        int f3220e = 1;

        /* renamed from: f */
        int f3221f = 0;

        /* renamed from: g */
        boolean f3222g = false;

        /* renamed from: h */
        boolean f3223h = false;

        /* renamed from: i */
        boolean f3224i = false;

        /* renamed from: j */
        boolean f3225j = false;

        /* renamed from: k */
        boolean f3226k = false;

        /* renamed from: l */
        boolean f3227l = false;

        /* renamed from: a */
        void m3834a(int i10) {
            if ((this.f3220e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3220e));
        }

        /* renamed from: b */
        public boolean m3835b() {
            return this.f3222g;
        }

        /* renamed from: c */
        public int m3836c() {
            if (this.f3223h) {
                return this.f3218c - this.f3219d;
            }
            return this.f3221f;
        }

        /* renamed from: d */
        public int m3837d() {
            return this.f3231p;
        }

        /* renamed from: e */
        public int m3838e() {
            return this.f3232q;
        }

        /* renamed from: f */
        public int m3839f() {
            return this.f3216a;
        }

        /* renamed from: g */
        public boolean m3840g() {
            if (this.f3216a != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public boolean m3841h() {
            return this.f3223h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public void m3842i(AbstractC0789h abstractC0789h) {
            this.f3220e = 1;
            this.f3221f = abstractC0789h.getItemCount();
            this.f3223h = false;
            this.f3224i = false;
            this.f3225j = false;
        }

        /* renamed from: j */
        public boolean m3843j() {
            return this.f3227l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3216a + ", mData=" + this.f3217b + ", mItemCount=" + this.f3221f + ", mIsMeasuring=" + this.f3225j + ", mPreviousLayoutItemCount=" + this.f3218c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3219d + ", mStructureChanged=" + this.f3222g + ", mInPreLayout=" + this.f3223h + ", mRunSimpleAnimations=" + this.f3226k + ", mRunPredictiveAnimations=" + this.f3227l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: classes.dex */
    class InterpolatorC0780c implements Interpolator {
        InterpolatorC0780c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    static class C0781c0 extends C0793l {
        C0781c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C0793l
        /* renamed from: a */
        protected EdgeEffect mo3844a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    class C0782d implements C0831r.b {
        C0782d() {
        }

        @Override // androidx.recyclerview.widget.C0831r.b
        /* renamed from: a */
        public void mo3845a(AbstractC0787f0 abstractC0787f0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(abstractC0787f0.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C0831r.b
        /* renamed from: b */
        public void mo3846b(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar, AbstractC0794m.b bVar2) {
            RecyclerView.this.animateAppearance(abstractC0787f0, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.C0831r.b
        /* renamed from: c */
        public void mo3847c(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar, AbstractC0794m.b bVar2) {
            RecyclerView.this.mRecycler.m3966O(abstractC0787f0);
            RecyclerView.this.animateDisappearance(abstractC0787f0, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.C0831r.b
        /* renamed from: d */
        public void mo3848d(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar, AbstractC0794m.b bVar2) {
            abstractC0787f0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo3886b(abstractC0787f0, abstractC0787f0, bVar, bVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo3888d(abstractC0787f0, bVar, bVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0783d0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C0784e implements C0815b.b {
        C0784e() {
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: a */
        public View mo3849a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: b */
        public void mo3850b(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: c */
        public int mo3851c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: d */
        public void mo3852d() {
            int mo3851c = mo3851c();
            for (int i10 = 0; i10 < mo3851c; i10++) {
                View mo3849a = mo3849a(i10);
                RecyclerView.this.dispatchChildDetached(mo3849a);
                mo3849a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: e */
        public int mo3853e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: f */
        public AbstractC0787f0 mo3854f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: g */
        public void mo3855g(int i10) {
            View mo3849a = mo3849a(i10);
            if (mo3849a != null) {
                AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(mo3849a);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(256);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: h */
        public void mo3856h(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: i */
        public void mo3857i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: j */
        public void mo3858j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0815b.b
        /* renamed from: k */
        public void mo3859k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    /* loaded from: classes.dex */
    public class RunnableC0785e0 implements Runnable {

        /* renamed from: a */
        private int f3235a;

        /* renamed from: b */
        private int f3236b;

        /* renamed from: c */
        OverScroller f3237c;

        /* renamed from: d */
        Interpolator f3238d;

        /* renamed from: e */
        private boolean f3239e;

        /* renamed from: f */
        private boolean f3240f;

        RunnableC0785e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3238d = interpolator;
            this.f3239e = false;
            this.f3240f = false;
            this.f3237c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m3860a(int i10, int i11) {
            boolean z10;
            int height;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m3861c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC0616q0.m2620f0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void m3862b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3236b = 0;
            this.f3235a = 0;
            Interpolator interpolator = this.f3238d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3238d = interpolator2;
                this.f3237c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3237c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m3863d();
        }

        /* renamed from: d */
        void m3863d() {
            if (this.f3239e) {
                this.f3240f = true;
            } else {
                m3861c();
            }
        }

        /* renamed from: e */
        public void m3864e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = m3860a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3238d != interpolator) {
                this.f3238d = interpolator;
                this.f3237c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3236b = 0;
            this.f3235a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3237c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3237c.computeScrollOffset();
            }
            m3863d();
        }

        /* renamed from: f */
        public void m3865f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3237c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m3865f();
                return;
            }
            this.f3240f = false;
            this.f3239e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3237c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f3235a;
                int i14 = currY - this.f3236b;
                this.f3235a = currX;
                this.f3236b = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i13);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    consumeFlingInHorizontalStretch -= i11;
                    consumeFlingInVerticalStretch -= i10;
                    AbstractC0777a0 abstractC0777a0 = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC0777a0 != null && !abstractC0777a0.isPendingInitialRun() && abstractC0777a0.isRunning()) {
                        int m3836c = RecyclerView.this.mState.m3836c();
                        if (m3836c == 0) {
                            abstractC0777a0.stop();
                        } else if (abstractC0777a0.getTargetPosition() >= m3836c) {
                            abstractC0777a0.setTargetPosition(m3836c - 1);
                            abstractC0777a0.onAnimation(i11, i10);
                        } else {
                            abstractC0777a0.onAnimation(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i10, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i15 = consumeFlingInHorizontalStretch - iArr6[0];
                int i16 = consumeFlingInVerticalStretch - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i15 == 0) || (!z11 && i16 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AbstractC0777a0 abstractC0777a02 = RecyclerView.this.mLayout.mSmoothScroller;
                if (abstractC0777a02 != null && abstractC0777a02.isPendingInitialRun()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m4203b();
                    }
                } else {
                    m3863d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0819f runnableC0819f = recyclerView7.mGapWorker;
                    if (runnableC0819f != null) {
                        runnableC0819f.m4199f(recyclerView7, i11, i10);
                    }
                }
            }
            AbstractC0777a0 abstractC0777a03 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC0777a03 != null && abstractC0777a03.isPendingInitialRun()) {
                abstractC0777a03.onAnimation(0, 0);
            }
            this.f3239e = false;
            if (this.f3240f) {
                m3861c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C0786f implements C0814a.a {
        C0786f() {
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: a */
        public void mo3866a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: b */
        public void mo3867b(C0814a.b bVar) {
            m3874i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: c */
        public void mo3868c(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: d */
        public void mo3869d(C0814a.b bVar) {
            m3874i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: e */
        public AbstractC0787f0 mo3870e(int i10) {
            AbstractC0787f0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (RecyclerView.this.mChildHelper.m4140n(findViewHolderForPosition.itemView)) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
                }
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: f */
        public void mo3871f(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: g */
        public void mo3872g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0814a.a
        /* renamed from: h */
        public void mo3873h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3219d += i11;
        }

        /* renamed from: i */
        void m3874i(C0814a.b bVar) {
            int i10 = bVar.f3350a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.onItemsMoved(recyclerView, bVar.f3351b, bVar.f3353d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.onItemsUpdated(recyclerView2, bVar.f3351b, bVar.f3353d, bVar.f3352c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsRemoved(recyclerView3, bVar.f3351b, bVar.f3353d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.mLayout.onItemsAdded(recyclerView4, bVar.f3351b, bVar.f3353d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0787f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        AbstractC0789h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC0787f0 mShadowedHolder = null;
        AbstractC0787f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C0804w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC0787f0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        private void m3875a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                m3875a();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0 && AbstractC0616q0.m2597O(this.itemView)) {
                return true;
            }
            return false;
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final AbstractC0789h getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC0789h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i10) {
            if ((i10 & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !AbstractC0616q0.m2597O(this.itemView)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((C0798q) this.itemView.getLayoutParams()).f3267c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = AbstractC0616q0.m2659z(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (i11 ^ (-1)));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10;
            int i11 = this.mIsRecyclableCount;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                if (!RecyclerView.sDebugAssertionsEnabled) {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z10 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i10 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void setScrapContainer(C0804w c0804w, boolean z10) {
            this.mScrapContainer = c0804w;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.m3966O(this);
        }

        boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0788g {

        /* renamed from: a */
        static final /* synthetic */ int[] f3243a;

        static {
            int[] iArr = new int[AbstractC0789h.a.values().length];
            f3243a = iArr;
            try {
                iArr[AbstractC0789h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3243a[AbstractC0789h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0789h {
        private final C0790i mObservable = new C0790i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(AbstractC0787f0 abstractC0787f0, int i10) {
            boolean z10;
            if (abstractC0787f0.mBindingAdapter == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                abstractC0787f0.mPosition = i10;
                if (hasStableIds()) {
                    abstractC0787f0.mItemId = getItemId(i10);
                }
                abstractC0787f0.setFlags(1, 519);
                AbstractC6880k.m26792a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            abstractC0787f0.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (abstractC0787f0.itemView.getParent() == null && AbstractC0616q0.m2599Q(abstractC0787f0.itemView) != abstractC0787f0.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC0787f0.isTmpDetached() + ", attached to window: " + AbstractC0616q0.m2599Q(abstractC0787f0.itemView) + ", holder: " + abstractC0787f0);
                }
                if (abstractC0787f0.itemView.getParent() == null && AbstractC0616q0.m2599Q(abstractC0787f0.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC0787f0);
                }
            }
            onBindViewHolder(abstractC0787f0, i10, abstractC0787f0.getUnmodifiedPayloads());
            if (z10) {
                abstractC0787f0.clearPayload();
                ViewGroup.LayoutParams layoutParams = abstractC0787f0.itemView.getLayoutParams();
                if (layoutParams instanceof C0798q) {
                    ((C0798q) layoutParams).f3267c = true;
                }
                AbstractC6880k.m26793b();
            }
        }

        boolean canRestoreState() {
            int i10 = C0788g.f3243a[this.mStateRestorationPolicy.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final AbstractC0787f0 createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                AbstractC6880k.m26792a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                AbstractC0787f0 onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                AbstractC6880k.m26793b();
            }
        }

        public int findRelativeAdapterPositionIn(AbstractC0789h abstractC0789h, AbstractC0787f0 abstractC0787f0, int i10) {
            if (abstractC0789h == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m3876a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m3877b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.m3879d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.m3881f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.m3878c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.m3879d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.m3881f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.m3882g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.m3882g(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(AbstractC0787f0 abstractC0787f0, int i10);

        public void onBindViewHolder(AbstractC0787f0 abstractC0787f0, int i10, List<Object> list) {
            onBindViewHolder(abstractC0787f0, i10);
        }

        public abstract AbstractC0787f0 onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(AbstractC0787f0 abstractC0787f0) {
            return false;
        }

        public void onViewAttachedToWindow(AbstractC0787f0 abstractC0787f0) {
        }

        public void onViewDetachedFromWindow(AbstractC0787f0 abstractC0787f0) {
        }

        public void onViewRecycled(AbstractC0787f0 abstractC0787f0) {
        }

        public void registerAdapterDataObserver(AbstractC0791j abstractC0791j) {
            this.mObservable.registerObserver(abstractC0791j);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.m3883h();
        }

        public void unregisterAdapterDataObserver(AbstractC0791j abstractC0791j) {
            this.mObservable.unregisterObserver(abstractC0791j);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.m3880e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.m3880e(i10, i11, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static class C0790i extends Observable {
        C0790i() {
        }

        /* renamed from: a */
        public boolean m3876a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m3877b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void m3878c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        /* renamed from: d */
        public void m3879d(int i10, int i11) {
            m3880e(i10, i11, null);
        }

        /* renamed from: e */
        public void m3880e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        /* renamed from: f */
        public void m3881f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        /* renamed from: g */
        public void m3882g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        /* renamed from: h */
        public void m3883h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0791j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0791j {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public class InterfaceC0792k {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static class C0793l {
        /* renamed from: a */
        protected abstract EdgeEffect mo3844a(RecyclerView recyclerView, int i10);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0794m {

        /* renamed from: a */
        private a f3248a = null;

        /* renamed from: b */
        private ArrayList f3249b = new ArrayList();

        /* renamed from: c */
        private long f3250c = 120;

        /* renamed from: d */
        private long f3251d = 120;

        /* renamed from: e */
        private long f3252e = 250;

        /* renamed from: f */
        private long f3253f = 250;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        /* loaded from: classes.dex */
        public class a {
            /* renamed from: a */
            void mo3910a(AbstractC0787f0 abstractC0787f0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            public int f3254a;

            /* renamed from: b */
            public int f3255b;

            /* renamed from: c */
            public int f3256c;

            /* renamed from: d */
            public int f3257d;

            /* renamed from: a */
            public b m3911a(AbstractC0787f0 abstractC0787f0) {
                return m3912b(abstractC0787f0, 0);
            }

            /* renamed from: b */
            public b m3912b(AbstractC0787f0 abstractC0787f0, int i10) {
                View view = abstractC0787f0.itemView;
                this.f3254a = view.getLeft();
                this.f3255b = view.getTop();
                this.f3256c = view.getRight();
                this.f3257d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m3884e(AbstractC0787f0 abstractC0787f0) {
            int i10 = abstractC0787f0.mFlags & 14;
            if (abstractC0787f0.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = abstractC0787f0.getOldPosition();
                int absoluteAdapterPosition = abstractC0787f0.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i10 | 2048;
                }
                return i10;
            }
            return i10;
        }

        /* renamed from: a */
        public abstract boolean mo3885a(AbstractC0787f0 abstractC0787f0, b bVar, b bVar2);

        /* renamed from: b */
        public abstract boolean mo3886b(AbstractC0787f0 abstractC0787f0, AbstractC0787f0 abstractC0787f02, b bVar, b bVar2);

        /* renamed from: c */
        public abstract boolean mo3887c(AbstractC0787f0 abstractC0787f0, b bVar, b bVar2);

        /* renamed from: d */
        public abstract boolean mo3888d(AbstractC0787f0 abstractC0787f0, b bVar, b bVar2);

        /* renamed from: f */
        public abstract boolean mo3889f(AbstractC0787f0 abstractC0787f0);

        /* renamed from: g */
        public boolean mo3890g(AbstractC0787f0 abstractC0787f0, List list) {
            return mo3889f(abstractC0787f0);
        }

        /* renamed from: h */
        public final void m3891h(AbstractC0787f0 abstractC0787f0) {
            m3901r(abstractC0787f0);
            a aVar = this.f3248a;
            if (aVar != null) {
                aVar.mo3910a(abstractC0787f0);
            }
        }

        /* renamed from: i */
        public final void m3892i() {
            if (this.f3249b.size() <= 0) {
                this.f3249b.clear();
            } else {
                AbstractC0272b.m941a(this.f3249b.get(0));
                throw null;
            }
        }

        /* renamed from: j */
        public abstract void mo3893j(AbstractC0787f0 abstractC0787f0);

        /* renamed from: k */
        public abstract void mo3894k();

        /* renamed from: l */
        public long m3895l() {
            return this.f3250c;
        }

        /* renamed from: m */
        public long m3896m() {
            return this.f3253f;
        }

        /* renamed from: n */
        public long m3897n() {
            return this.f3252e;
        }

        /* renamed from: o */
        public long m3898o() {
            return this.f3251d;
        }

        /* renamed from: p */
        public abstract boolean mo3899p();

        /* renamed from: q */
        public b m3900q() {
            return new b();
        }

        /* renamed from: r */
        public void m3901r(AbstractC0787f0 abstractC0787f0) {
        }

        /* renamed from: s */
        public b m3902s(C0779b0 c0779b0, AbstractC0787f0 abstractC0787f0) {
            return m3900q().m3911a(abstractC0787f0);
        }

        /* renamed from: t */
        public b m3903t(C0779b0 c0779b0, AbstractC0787f0 abstractC0787f0, int i10, List list) {
            return m3900q().m3911a(abstractC0787f0);
        }

        /* renamed from: u */
        public abstract void mo3904u();

        /* renamed from: v */
        public void m3905v(long j10) {
            this.f3250c = j10;
        }

        /* renamed from: w */
        public void m3906w(long j10) {
            this.f3253f = j10;
        }

        /* renamed from: x */
        void m3907x(a aVar) {
            this.f3248a = aVar;
        }

        /* renamed from: y */
        public void m3908y(long j10) {
            this.f3252e = j10;
        }

        /* renamed from: z */
        public void m3909z(long j10) {
            this.f3251d = j10;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    private class C0795n implements AbstractC0794m.a {
        C0795n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m.a
        /* renamed from: a */
        public void mo3910a(AbstractC0787f0 abstractC0787f0) {
            abstractC0787f0.setIsRecyclable(true);
            if (abstractC0787f0.mShadowedHolder != null && abstractC0787f0.mShadowingHolder == null) {
                abstractC0787f0.mShadowedHolder = null;
            }
            abstractC0787f0.mShadowingHolder = null;
            if (!abstractC0787f0.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(abstractC0787f0.itemView) && abstractC0787f0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(abstractC0787f0.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0796o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0779b0 c0779b0) {
            getItemOffsets(rect, ((C0798q) view.getLayoutParams()).m3926b(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0779b0 c0779b0) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0779b0 c0779b0) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0797p {
        boolean mAutoMeasure;
        C0815b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C0830q mHorizontalBoundCheck;
        private final C0830q.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        AbstractC0777a0 mSmoothScroller;
        C0830q mVerticalBoundCheck;
        private final C0830q.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: classes.dex */
        class a implements C0830q.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: a */
            public View mo3919a(int i10) {
                return AbstractC0797p.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: b */
            public int mo3920b(View view) {
                return AbstractC0797p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C0798q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: c */
            public int mo3921c() {
                return AbstractC0797p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: d */
            public int mo3922d() {
                return AbstractC0797p.this.getWidth() - AbstractC0797p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: e */
            public int mo3923e(View view) {
                return AbstractC0797p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C0798q) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        /* loaded from: classes.dex */
        class b implements C0830q.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: a */
            public View mo3919a(int i10) {
                return AbstractC0797p.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: b */
            public int mo3920b(View view) {
                return AbstractC0797p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C0798q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: c */
            public int mo3921c() {
                return AbstractC0797p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: d */
            public int mo3922d() {
                return AbstractC0797p.this.getHeight() - AbstractC0797p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C0830q.b
            /* renamed from: e */
            public int mo3923e(View view) {
                return AbstractC0797p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C0798q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        /* loaded from: classes.dex */
        public class c {
            /* renamed from: a */
            void mo3924a(int i10, int i11);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f3261a;

            /* renamed from: b */
            public int f3262b;

            /* renamed from: c */
            public boolean f3263c;

            /* renamed from: d */
            public boolean f3264d;
        }

        public AbstractC0797p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C0830q(aVar);
            this.mVerticalBoundCheck = new C0830q(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        /* renamed from: a */
        private void m3913a(View view, int i10, boolean z10) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z10 && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m4299p(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m4286b(childViewHolderInt);
            }
            C0798q c0798q = (C0798q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int m4139m = this.mChildHelper.m4139m(view);
                    if (i10 == -1) {
                        i10 = this.mChildHelper.m4135g();
                    }
                    if (m4139m != -1) {
                        if (m4139m != i10) {
                            this.mRecyclerView.mLayout.moveView(m4139m, i10);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    }
                } else {
                    this.mChildHelper.m4129a(view, i10, false);
                    c0798q.f3267c = true;
                    AbstractC0777a0 abstractC0777a0 = this.mSmoothScroller;
                    if (abstractC0777a0 != null && abstractC0777a0.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m4131c(view, i10, view.getLayoutParams(), false);
            }
            if (c0798q.f3268d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + c0798q.f3265a);
                }
                childViewHolderInt.itemView.invalidate();
                c0798q.f3268d = false;
            }
        }

        /* renamed from: b */
        private void m3914b(int i10, View view) {
            this.mChildHelper.m4132d(i10);
        }

        /* renamed from: c */
        private int[] m3915c(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i10 = left - paddingLeft;
            int min = Math.min(0, i10);
            int i11 = top - paddingTop;
            int min2 = Math.min(0, i11);
            int i12 = width2 - width;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() == 1) {
                if (max == 0) {
                    max = Math.max(min, i12);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* renamed from: d */
        private boolean m3916d(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i10 >= width || rect.right - i10 <= paddingLeft || rect.top - i11 >= height || rect.bottom - i11 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private static boolean m3917e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i10) {
                    return false;
                }
                return true;
            }
            if (size < i10) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private void m3918f(C0804w c0804w, int i10, View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i10);
                c0804w.m3960H(childViewHolderInt);
            } else {
                detachViewAt(i10);
                c0804w.m3961I(view);
                this.mRecyclerView.mViewInfoStore.m4295k(childViewHolderInt);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0797p.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3175a, i10, i11);
            dVar.f3261a = obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            dVar.f3262b = obtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            dVar.f3263c = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            dVar.f3264d = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i10, C0798q c0798q) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m4286b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m4299p(childViewHolderInt);
            }
            this.mChildHelper.m4131c(view, i10, c0798q, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(C0798q c0798q) {
            return c0798q != null;
        }

        public abstract void collectAdjacentPrefetchPositions(int i10, int i11, C0779b0 c0779b0, c cVar);

        public void collectInitialPrefetchPositions(int i10, c cVar) {
        }

        public int computeHorizontalScrollExtent(C0779b0 c0779b0) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C0779b0 c0779b0) {
            return 0;
        }

        public int computeHorizontalScrollRange(C0779b0 c0779b0) {
            return 0;
        }

        public int computeVerticalScrollExtent(C0779b0 c0779b0) {
            return 0;
        }

        public int computeVerticalScrollOffset(C0779b0 c0779b0) {
            return 0;
        }

        public int computeVerticalScrollRange(C0779b0 c0779b0) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C0804w c0804w) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m3918f(c0804w, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C0804w c0804w) {
            m3918f(c0804w, this.mChildHelper.m4139m(view), view);
        }

        public void detachAndScrapViewAt(int i10, C0804w c0804w) {
            m3918f(c0804w, i10, getChildAt(i10));
        }

        public void detachView(View view) {
            int m4139m = this.mChildHelper.m4139m(view);
            if (m4139m >= 0) {
                m3914b(m4139m, view);
            }
        }

        public void detachViewAt(int i10) {
            m3914b(i10, getChildAt(i10));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, C0804w c0804w) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c0804w);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            AbstractC0794m abstractC0794m = this.mRecyclerView.mItemAnimator;
            if (abstractC0794m != null) {
                abstractC0794m.mo3893j(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m4140n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m3841h() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract C0798q generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public C0798q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0798q) {
                return new C0798q((C0798q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C0798q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C0798q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((C0798q) view.getLayoutParams()).f3266b.bottom;
        }

        public View getChildAt(int i10) {
            C0815b c0815b = this.mChildHelper;
            if (c0815b != null) {
                return c0815b.m4134f(i10);
            }
            return null;
        }

        public int getChildCount() {
            C0815b c0815b = this.mChildHelper;
            if (c0815b != null) {
                return c0815b.m4135g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.mClipToPadding) {
                return true;
            }
            return false;
        }

        public int getColumnCountForAccessibility(C0804w c0804w, C0779b0 c0779b0) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((C0798q) view.getLayoutParams()).f3266b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((C0798q) view.getLayoutParams()).f3266b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m4140n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            AbstractC0789h abstractC0789h;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                abstractC0789h = recyclerView.getAdapter();
            } else {
                abstractC0789h = null;
            }
            if (abstractC0789h != null) {
                return abstractC0789h.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return AbstractC0616q0.m2579B(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((C0798q) view.getLayoutParams()).f3266b.left;
        }

        public int getMinimumHeight() {
            return AbstractC0616q0.m2581C(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return AbstractC0616q0.m2583D(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return AbstractC0616q0.m2587F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return AbstractC0616q0.m2589G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((C0798q) view.getLayoutParams()).m3926b();
        }

        public int getRightDecorationWidth(View view) {
            return ((C0798q) view.getLayoutParams()).f3266b.right;
        }

        public int getRowCountForAccessibility(C0804w c0804w, C0779b0 c0779b0) {
            return -1;
        }

        public int getSelectionModeForAccessibility(C0804w c0804w, C0779b0 c0779b0) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((C0798q) view.getLayoutParams()).f3266b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((C0798q) view.getLayoutParams()).f3266b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.m4300q(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C0804w c0804w, C0779b0 c0779b0) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC0777a0 abstractC0777a0 = this.mSmoothScroller;
            if (abstractC0777a0 != null && abstractC0777a0.isRunning()) {
                return true;
            }
            return false;
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12;
            if (this.mHorizontalBoundCheck.m4278b(view, 24579) && this.mVerticalBoundCheck.m4278b(view, 24579)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                return z12;
            }
            return !z12;
        }

        public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((C0798q) view.getLayoutParams()).f3266b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
            C0798q c0798q = (C0798q) view.getLayoutParams();
            Rect rect = c0798q.f3266b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c0798q).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c0798q).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c0798q).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0798q).bottomMargin);
        }

        public void measureChild(View view, int i10, int i11) {
            C0798q c0798q = (C0798q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i12, ((ViewGroup.MarginLayoutParams) c0798q).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i13, ((ViewGroup.MarginLayoutParams) c0798q).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0798q)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i10, int i11) {
            C0798q c0798q = (C0798q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0798q).leftMargin + ((ViewGroup.MarginLayoutParams) c0798q).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c0798q).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c0798q).topMargin + ((ViewGroup.MarginLayoutParams) c0798q).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c0798q).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0798q)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void offsetChildrenVertical(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public void onAdapterChanged(AbstractC0789h abstractC0789h, AbstractC0789h abstractC0789h2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i10, C0804w c0804w, C0779b0 c0779b0) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfo(C7458h0 c7458h0) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c7458h0);
        }

        public void onInitializeAccessibilityNodeInfoForItem(C0804w c0804w, C0779b0 c0779b0, View view, C7458h0 c7458h0) {
        }

        public View onInterceptFocusSearch(View view, int i10) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        }

        public abstract void onLayoutChildren(C0804w c0804w, C0779b0 c0779b0);

        public void onLayoutCompleted(C0779b0 c0779b0) {
        }

        public void onMeasure(C0804w c0804w, C0779b0 c0779b0, int i10, int i11) {
            this.mRecyclerView.defaultOnMeasure(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public abstract void onRestoreInstanceState(Parcelable parcelable);

        public abstract Parcelable onSaveInstanceState();

        public void onScrollStateChanged(int i10) {
        }

        void onSmoothScrollerStopped(AbstractC0777a0 abstractC0777a0) {
            if (this.mSmoothScroller == abstractC0777a0) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(C0804w c0804w, C0779b0 c0779b0, View view, int i10, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                AbstractC0616q0.m2620f0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m4143q(childCount);
            }
        }

        public void removeAndRecycleAllViews(C0804w c0804w) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c0804w);
                }
            }
        }

        void removeAndRecycleScrapInt(C0804w c0804w) {
            int m3978j = c0804w.m3978j();
            for (int i10 = m3978j - 1; i10 >= 0; i10--) {
                View m3982n = c0804w.m3982n(i10);
                AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m3982n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(m3982n, false);
                    }
                    AbstractC0794m abstractC0794m = this.mRecyclerView.mItemAnimator;
                    if (abstractC0794m != null) {
                        abstractC0794m.mo3893j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0804w.m3956D(m3982n);
                }
            }
            c0804w.m3973e();
            if (m3978j > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C0804w c0804w) {
            removeView(view);
            c0804w.m3959G(view);
        }

        public void removeAndRecycleViewAt(int i10, C0804w c0804w) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            c0804w.m3959G(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.m4142p(view);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.m4143q(i10);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public abstract int scrollHorizontallyBy(int i10, C0804w c0804w, C0779b0 c0779b0);

        public abstract void scrollToPosition(int i10);

        public abstract int scrollVerticallyBy(int i10, C0804w c0804w, C0779b0 c0779b0);

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m3967P();
                }
            }
        }

        void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i11, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.mRecyclerView.mTempRect.set(i14, i15, i12, i13);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldMeasureChild(View view, int i10, int i11, C0798q c0798q) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m3917e(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c0798q).width) && m3917e(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c0798q).height)) {
                return false;
            }
            return true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldReMeasureChild(View view, int i10, int i11, C0798q c0798q) {
            if (this.mMeasurementCacheEnabled && m3917e(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c0798q).width) && m3917e(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c0798q).height)) {
                return false;
            }
            return true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, C0779b0 c0779b0, int i10);

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(AbstractC0777a0 abstractC0777a0) {
            AbstractC0777a0 abstractC0777a02 = this.mSmoothScroller;
            if (abstractC0777a02 != null && abstractC0777a0 != abstractC0777a02 && abstractC0777a02.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC0777a0;
            abstractC0777a0.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            AbstractC0777a0 abstractC0777a0 = this.mSmoothScroller;
            if (abstractC0777a0 != null) {
                abstractC0777a0.stop();
            }
        }

        public abstract boolean supportsPredictiveItemAnimations();

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i10) {
            m3913a(view, i10, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i10) {
            m3913a(view, i10, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C0804w c0804w) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(C0804w c0804w, C0779b0 c0779b0, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            AbstractC0789h abstractC0789h = this.mRecyclerView.mAdapter;
            if (abstractC0789h != null) {
                accessibilityEvent.setItemCount(abstractC0789h.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(C0804w c0804w, C0779b0 c0779b0, C7458h0 c7458h0) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c7458h0.m28602a(8192);
                c7458h0.m28626o0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c7458h0.m28602a(4096);
                c7458h0.m28626o0(true);
            }
            c7458h0.m28601Z(C7458h0.b.m28643a(getRowCountForAccessibility(c0804w, c0779b0), getColumnCountForAccessibility(c0804w, c0779b0), isLayoutHierarchical(c0804w, c0779b0), getSelectionModeForAccessibility(c0804w, c0779b0)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfoForItem(View view, C7458h0 c7458h0) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m4140n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c7458h0);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C0779b0 c0779b0, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(C0804w c0804w, C0779b0 c0779b0, int i10, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i11;
            int i12;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i10 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i11 = paddingTop;
                    i12 = paddingLeft;
                }
                i11 = paddingTop;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i11 = paddingTop;
                    i12 = paddingLeft;
                }
                i11 = paddingTop;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityActionForItem(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] m3915c = m3915c(view, rect);
            int i10 = m3915c[0];
            int i11 = m3915c[1];
            if ((z11 && !m3916d(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0797p.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(View view, int i10) {
            attachView(view, i10, (C0798q) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public C0798q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new C0798q(context, attributeSet);
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public class InterfaceC0799r {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0800s {
        public abstract boolean onFling(int i10, int i11);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public class InterfaceC0801t {
        /* renamed from: a */
        void mo3931a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo3932b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo3933c(boolean z10);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0802u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public static class C0803v {

        /* renamed from: a */
        SparseArray f3269a = new SparseArray();

        /* renamed from: b */
        int f3270b = 0;

        /* renamed from: c */
        Set f3271c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList f3272a = new ArrayList();

            /* renamed from: b */
            int f3273b = 5;

            /* renamed from: c */
            long f3274c = 0;

            /* renamed from: d */
            long f3275d = 0;

            a() {
            }
        }

        /* renamed from: i */
        private a m3934i(int i10) {
            a aVar = (a) this.f3269a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f3269a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        /* renamed from: a */
        void m3935a() {
            this.f3270b++;
        }

        /* renamed from: b */
        void m3936b(AbstractC0789h abstractC0789h) {
            this.f3271c.add(abstractC0789h);
        }

        /* renamed from: c */
        public void m3937c() {
            for (int i10 = 0; i10 < this.f3269a.size(); i10++) {
                a aVar = (a) this.f3269a.valueAt(i10);
                Iterator it = aVar.f3272a.iterator();
                while (it.hasNext()) {
                    AbstractC0000a.m0a(((AbstractC0787f0) it.next()).itemView);
                }
                aVar.f3272a.clear();
            }
        }

        /* renamed from: d */
        void m3938d() {
            this.f3270b--;
        }

        /* renamed from: e */
        void m3939e(AbstractC0789h abstractC0789h, boolean z10) {
            this.f3271c.remove(abstractC0789h);
            if (this.f3271c.size() == 0 && !z10) {
                for (int i10 = 0; i10 < this.f3269a.size(); i10++) {
                    SparseArray sparseArray = this.f3269a;
                    ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f3272a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        AbstractC0000a.m0a(((AbstractC0787f0) arrayList.get(i11)).itemView);
                    }
                }
            }
        }

        /* renamed from: f */
        void m3940f(int i10, long j10) {
            a m3934i = m3934i(i10);
            m3934i.f3275d = m3945l(m3934i.f3275d, j10);
        }

        /* renamed from: g */
        void m3941g(int i10, long j10) {
            a m3934i = m3934i(i10);
            m3934i.f3274c = m3945l(m3934i.f3274c, j10);
        }

        /* renamed from: h */
        public AbstractC0787f0 m3942h(int i10) {
            a aVar = (a) this.f3269a.get(i10);
            if (aVar != null && !aVar.f3272a.isEmpty()) {
                ArrayList arrayList = aVar.f3272a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((AbstractC0787f0) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                        return (AbstractC0787f0) arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: j */
        void m3943j(AbstractC0789h abstractC0789h, AbstractC0789h abstractC0789h2, boolean z10) {
            if (abstractC0789h != null) {
                m3938d();
            }
            if (!z10 && this.f3270b == 0) {
                m3937c();
            }
            if (abstractC0789h2 != null) {
                m3935a();
            }
        }

        /* renamed from: k */
        public void m3944k(AbstractC0787f0 abstractC0787f0) {
            int itemViewType = abstractC0787f0.getItemViewType();
            ArrayList arrayList = m3934i(itemViewType).f3272a;
            if (((a) this.f3269a.get(itemViewType)).f3273b <= arrayList.size()) {
                AbstractC0000a.m0a(abstractC0787f0.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(abstractC0787f0)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                abstractC0787f0.resetInternal();
                arrayList.add(abstractC0787f0);
            }
        }

        /* renamed from: l */
        long m3945l(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return ((j10 / 4) * 3) + (j11 / 4);
        }

        /* renamed from: m */
        boolean m3946m(int i10, long j10, long j11) {
            long j12 = m3934i(i10).f3275d;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        boolean m3947n(int i10, long j10, long j11) {
            long j12 = m3934i(i10).f3274c;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public final class C0804w {

        /* renamed from: a */
        final ArrayList f3276a;

        /* renamed from: b */
        ArrayList f3277b;

        /* renamed from: c */
        final ArrayList f3278c;

        /* renamed from: d */
        private final List f3279d;

        /* renamed from: e */
        private int f3280e;

        /* renamed from: f */
        int f3281f;

        /* renamed from: g */
        C0803v f3282g;

        public C0804w() {
            ArrayList arrayList = new ArrayList();
            this.f3276a = arrayList;
            this.f3277b = null;
            this.f3278c = new ArrayList();
            this.f3279d = Collections.unmodifiableList(arrayList);
            this.f3280e = 2;
            this.f3281f = 2;
        }

        /* renamed from: B */
        private void m3948B(AbstractC0789h abstractC0789h) {
            m3949C(abstractC0789h, false);
        }

        /* renamed from: C */
        private void m3949C(AbstractC0789h abstractC0789h, boolean z10) {
            C0803v c0803v = this.f3282g;
            if (c0803v != null) {
                c0803v.m3939e(abstractC0789h, z10);
            }
        }

        /* renamed from: M */
        private boolean m3950M(AbstractC0787f0 abstractC0787f0, int i10, int i11, long j10) {
            abstractC0787f0.mBindingAdapter = null;
            abstractC0787f0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC0787f0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != RecyclerView.FOREVER_NS && !this.f3282g.m3946m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (abstractC0787f0.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(abstractC0787f0.itemView, recyclerView.getChildCount(), abstractC0787f0.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC0787f0, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(abstractC0787f0.itemView);
            }
            this.f3282g.m3940f(abstractC0787f0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m3951b(abstractC0787f0);
            if (RecyclerView.this.mState.m3841h()) {
                abstractC0787f0.mPreLayoutPosition = i11;
            }
            return true;
        }

        /* renamed from: b */
        private void m3951b(AbstractC0787f0 abstractC0787f0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC0787f0.itemView;
                if (AbstractC0616q0.m2659z(view) == 0) {
                    AbstractC0616q0.m2654w0(view, 1);
                }
                C0826m c0826m = RecyclerView.this.mAccessibilityDelegate;
                if (c0826m == null) {
                    return;
                }
                C0551a m4250n = c0826m.m4250n();
                if (m4250n instanceof C0826m.a) {
                    ((C0826m.a) m4250n).m4253o(view);
                }
                AbstractC0616q0.m2636n0(view, m4250n);
            }
        }

        /* renamed from: q */
        private void m3952q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3952q((ViewGroup) childAt, true);
                }
            }
            if (!z10) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m3953r(AbstractC0787f0 abstractC0787f0) {
            View view = abstractC0787f0.itemView;
            if (view instanceof ViewGroup) {
                m3952q((ViewGroup) view, false);
            }
        }

        /* renamed from: u */
        private void m3954u() {
            if (this.f3282g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                    this.f3282g.m3936b(RecyclerView.this.mAdapter);
                }
            }
        }

        /* renamed from: A */
        void m3955A() {
            for (int i10 = 0; i10 < this.f3278c.size(); i10++) {
                AbstractC0000a.m0a(((AbstractC0787f0) this.f3278c.get(i10)).itemView);
            }
            m3948B(RecyclerView.this.mAdapter);
        }

        /* renamed from: D */
        void m3956D(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m3960H(childViewHolderInt);
        }

        /* renamed from: E */
        void m3957E() {
            for (int size = this.f3278c.size() - 1; size >= 0; size--) {
                m3958F(size);
            }
            this.f3278c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m4203b();
            }
        }

        /* renamed from: F */
        void m3958F(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "Recycling cached view at index " + i10);
            }
            AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(i10);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + abstractC0787f0);
            }
            m3970a(abstractC0787f0, true);
            this.f3278c.remove(i10);
        }

        /* renamed from: G */
        public void m3959G(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m3960H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.mo3893j(childViewHolderInt);
            }
        }

        /* renamed from: H */
        void m3960H(AbstractC0787f0 abstractC0787f0) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (!abstractC0787f0.isScrap() && abstractC0787f0.itemView.getParent() == null) {
                if (!abstractC0787f0.isTmpDetached()) {
                    if (!abstractC0787f0.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = abstractC0787f0.doesTransientStatePreventRecycling();
                        AbstractC0789h abstractC0789h = RecyclerView.this.mAdapter;
                        if (abstractC0789h != null && doesTransientStatePreventRecycling && abstractC0789h.onFailedToRecycleView(abstractC0787f0)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (RecyclerView.sDebugAssertionsEnabled && this.f3278c.contains(abstractC0787f0)) {
                            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC0787f0 + RecyclerView.this.exceptionLabel());
                        }
                        if (!z10 && !abstractC0787f0.isRecyclable()) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d(RecyclerView.TAG, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
                            }
                        } else {
                            if (this.f3281f > 0 && !abstractC0787f0.hasAnyOfTheFlags(526)) {
                                int size = this.f3278c.size();
                                if (size >= this.f3281f && size > 0) {
                                    m3958F(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m4205d(abstractC0787f0.mPosition)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.m4205d(((AbstractC0787f0) this.f3278c.get(i10)).mPosition)) {
                                            break;
                                        } else {
                                            i10--;
                                        }
                                    }
                                    size = i10 + 1;
                                }
                                this.f3278c.add(size, abstractC0787f0);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                m3970a(abstractC0787f0, true);
                                z12 = z11;
                                RecyclerView.this.mViewInfoStore.m4300q(abstractC0787f0);
                                if (z12 && !z13 && doesTransientStatePreventRecycling) {
                                    AbstractC0000a.m0a(abstractC0787f0.itemView);
                                    abstractC0787f0.mBindingAdapter = null;
                                    abstractC0787f0.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            z12 = z11;
                        }
                        z13 = false;
                        RecyclerView.this.mViewInfoStore.m4300q(abstractC0787f0);
                        if (z12) {
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0787f0 + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC0787f0.isScrap());
            sb2.append(" isAttached:");
            if (abstractC0787f0.itemView.getParent() != null) {
                z12 = true;
            }
            sb2.append(z12);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: I */
        void m3961I(View view) {
            AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3277b == null) {
                    this.f3277b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3277b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f3276a.add(childViewHolderInt);
        }

        /* renamed from: J */
        void m3962J(C0803v c0803v) {
            m3948B(RecyclerView.this.mAdapter);
            C0803v c0803v2 = this.f3282g;
            if (c0803v2 != null) {
                c0803v2.m3938d();
            }
            this.f3282g = c0803v;
            if (c0803v != null && RecyclerView.this.getAdapter() != null) {
                this.f3282g.m3935a();
            }
            m3954u();
        }

        /* renamed from: K */
        void m3963K(AbstractC0783d0 abstractC0783d0) {
        }

        /* renamed from: L */
        public void m3964L(int i10) {
            this.f3280e = i10;
            m3967P();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0787f0 m3965N(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0804w.m3965N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        /* renamed from: O */
        void m3966O(AbstractC0787f0 abstractC0787f0) {
            if (abstractC0787f0.mInChangeScrap) {
                this.f3277b.remove(abstractC0787f0);
            } else {
                this.f3276a.remove(abstractC0787f0);
            }
            abstractC0787f0.mScrapContainer = null;
            abstractC0787f0.mInChangeScrap = false;
            abstractC0787f0.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P */
        public void m3967P() {
            int i10;
            AbstractC0797p abstractC0797p = RecyclerView.this.mLayout;
            if (abstractC0797p != null) {
                i10 = abstractC0797p.mPrefetchMaxCountObserved;
            } else {
                i10 = 0;
            }
            this.f3281f = this.f3280e + i10;
            for (int size = this.f3278c.size() - 1; size >= 0 && this.f3278c.size() > this.f3281f; size--) {
                m3958F(size);
            }
        }

        /* renamed from: Q */
        boolean m3968Q(AbstractC0787f0 abstractC0787f0) {
            if (abstractC0787f0.isRemoved()) {
                if (RecyclerView.sDebugAssertionsEnabled && !RecyclerView.this.mState.m3841h()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
                }
                return RecyclerView.this.mState.m3841h();
            }
            int i10 = abstractC0787f0.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.m3841h() && RecyclerView.this.mAdapter.getItemViewType(abstractC0787f0.mPosition) != abstractC0787f0.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && abstractC0787f0.getItemId() != RecyclerView.this.mAdapter.getItemId(abstractC0787f0.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0787f0 + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: R */
        void m3969R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3278c.size() - 1; size >= 0; size--) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(size);
                if (abstractC0787f0 != null && (i12 = abstractC0787f0.mPosition) >= i10 && i12 < i13) {
                    abstractC0787f0.addFlags(2);
                    m3958F(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m3970a(AbstractC0787f0 abstractC0787f0, boolean z10) {
            C0551a c0551a;
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0787f0);
            View view = abstractC0787f0.itemView;
            C0826m c0826m = RecyclerView.this.mAccessibilityDelegate;
            if (c0826m != null) {
                C0551a m4250n = c0826m.m4250n();
                if (m4250n instanceof C0826m.a) {
                    c0551a = ((C0826m.a) m4250n).m4252n(view);
                } else {
                    c0551a = null;
                }
                AbstractC0616q0.m2636n0(view, c0551a);
            }
            if (z10) {
                m3975g(abstractC0787f0);
            }
            abstractC0787f0.mBindingAdapter = null;
            abstractC0787f0.mOwnerRecyclerView = null;
            m3977i().m3944k(abstractC0787f0);
        }

        /* renamed from: c */
        public void m3971c() {
            this.f3276a.clear();
            m3957E();
        }

        /* renamed from: d */
        void m3972d() {
            int size = this.f3278c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC0787f0) this.f3278c.get(i10)).clearOldPosition();
            }
            int size2 = this.f3276a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((AbstractC0787f0) this.f3276a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f3277b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((AbstractC0787f0) this.f3277b.get(i12)).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m3973e() {
            this.f3276a.clear();
            ArrayList arrayList = this.f3277b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m3974f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.m3836c()) {
                if (!RecyclerView.this.mState.m3841h()) {
                    return i10;
                }
                return RecyclerView.this.mAdapterHelper.m4113m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.m3836c() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        void m3975g(AbstractC0787f0 abstractC0787f0) {
            InterfaceC0805x interfaceC0805x = RecyclerView.this.mRecyclerListener;
            if (interfaceC0805x != null) {
                interfaceC0805x.mo3992a(abstractC0787f0);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.mRecyclerListeners.get(i10).mo3992a(abstractC0787f0);
            }
            AbstractC0789h abstractC0789h = RecyclerView.this.mAdapter;
            if (abstractC0789h != null) {
                abstractC0789h.onViewRecycled(abstractC0787f0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m4300q(abstractC0787f0);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + abstractC0787f0);
            }
        }

        /* renamed from: h */
        AbstractC0787f0 m3976h(int i10) {
            int size;
            int m4113m;
            ArrayList arrayList = this.f3277b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3277b.get(i11);
                    if (!abstractC0787f0.wasReturnedFromScrap() && abstractC0787f0.getLayoutPosition() == i10) {
                        abstractC0787f0.addFlags(32);
                        return abstractC0787f0;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m4113m = RecyclerView.this.mAdapterHelper.m4113m(i10)) > 0 && m4113m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m4113m);
                    for (int i12 = 0; i12 < size; i12++) {
                        AbstractC0787f0 abstractC0787f02 = (AbstractC0787f0) this.f3277b.get(i12);
                        if (!abstractC0787f02.wasReturnedFromScrap() && abstractC0787f02.getItemId() == itemId) {
                            abstractC0787f02.addFlags(32);
                            return abstractC0787f02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C0803v m3977i() {
            if (this.f3282g == null) {
                this.f3282g = new C0803v();
                m3954u();
            }
            return this.f3282g;
        }

        /* renamed from: j */
        int m3978j() {
            return this.f3276a.size();
        }

        /* renamed from: k */
        public List m3979k() {
            return this.f3279d;
        }

        /* renamed from: l */
        AbstractC0787f0 m3980l(long j10, int i10, boolean z10) {
            for (int size = this.f3276a.size() - 1; size >= 0; size--) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3276a.get(size);
                if (abstractC0787f0.getItemId() == j10 && !abstractC0787f0.wasReturnedFromScrap()) {
                    if (i10 == abstractC0787f0.getItemViewType()) {
                        abstractC0787f0.addFlags(32);
                        if (abstractC0787f0.isRemoved() && !RecyclerView.this.mState.m3841h()) {
                            abstractC0787f0.setFlags(2, 14);
                        }
                        return abstractC0787f0;
                    }
                    if (!z10) {
                        this.f3276a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0787f0.itemView, false);
                        m3956D(abstractC0787f0.itemView);
                    }
                }
            }
            int size2 = this.f3278c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0787f0 abstractC0787f02 = (AbstractC0787f0) this.f3278c.get(size2);
                if (abstractC0787f02.getItemId() == j10 && !abstractC0787f02.isAttachedToTransitionOverlay()) {
                    if (i10 == abstractC0787f02.getItemViewType()) {
                        if (!z10) {
                            this.f3278c.remove(size2);
                        }
                        return abstractC0787f02;
                    }
                    if (!z10) {
                        m3958F(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC0787f0 m3981m(int i10, boolean z10) {
            View m4133e;
            int size = this.f3276a.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3276a.get(i11);
                if (!abstractC0787f0.wasReturnedFromScrap() && abstractC0787f0.getLayoutPosition() == i10 && !abstractC0787f0.isInvalid() && (RecyclerView.this.mState.f3223h || !abstractC0787f0.isRemoved())) {
                    abstractC0787f0.addFlags(32);
                    return abstractC0787f0;
                }
            }
            if (!z10 && (m4133e = RecyclerView.this.mChildHelper.m4133e(i10)) != null) {
                AbstractC0787f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m4133e);
                RecyclerView.this.mChildHelper.m4145s(m4133e);
                int m4139m = RecyclerView.this.mChildHelper.m4139m(m4133e);
                if (m4139m != -1) {
                    RecyclerView.this.mChildHelper.m4132d(m4139m);
                    m3961I(m4133e);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f3278c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC0787f0 abstractC0787f02 = (AbstractC0787f0) this.f3278c.get(i12);
                if (!abstractC0787f02.isInvalid() && abstractC0787f02.getLayoutPosition() == i10 && !abstractC0787f02.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f3278c.remove(i12);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + abstractC0787f02);
                    }
                    return abstractC0787f02;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m3982n(int i10) {
            return ((AbstractC0787f0) this.f3276a.get(i10)).itemView;
        }

        /* renamed from: o */
        public View m3983o(int i10) {
            return m3984p(i10, false);
        }

        /* renamed from: p */
        View m3984p(int i10, boolean z10) {
            return m3965N(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: s */
        void m3985s() {
            int size = this.f3278c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0798q c0798q = (C0798q) ((AbstractC0787f0) this.f3278c.get(i10)).itemView.getLayoutParams();
                if (c0798q != null) {
                    c0798q.f3267c = true;
                }
            }
        }

        /* renamed from: t */
        void m3986t() {
            int size = this.f3278c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(i10);
                if (abstractC0787f0 != null) {
                    abstractC0787f0.addFlags(6);
                    abstractC0787f0.addChangePayload(null);
                }
            }
            AbstractC0789h abstractC0789h = RecyclerView.this.mAdapter;
            if (abstractC0789h == null || !abstractC0789h.hasStableIds()) {
                m3957E();
            }
        }

        /* renamed from: v */
        void m3987v(int i10, int i11) {
            int size = this.f3278c.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(i12);
                if (abstractC0787f0 != null && abstractC0787f0.mPosition >= i10) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + abstractC0787f0 + " now at position " + (abstractC0787f0.mPosition + i11));
                    }
                    abstractC0787f0.offsetPosition(i11, false);
                }
            }
        }

        /* renamed from: w */
        void m3988w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3278c.size();
            for (int i16 = 0; i16 < size; i16++) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(i16);
                if (abstractC0787f0 != null && (i15 = abstractC0787f0.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        abstractC0787f0.offsetPosition(i11 - i10, false);
                    } else {
                        abstractC0787f0.offsetPosition(i12, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForMove cached child " + i16 + " holder " + abstractC0787f0);
                    }
                }
            }
        }

        /* renamed from: x */
        void m3989x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3278c.size() - 1; size >= 0; size--) {
                AbstractC0787f0 abstractC0787f0 = (AbstractC0787f0) this.f3278c.get(size);
                if (abstractC0787f0 != null) {
                    int i13 = abstractC0787f0.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC0787f0 + " now at position " + (abstractC0787f0.mPosition - i11));
                        }
                        abstractC0787f0.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        abstractC0787f0.addFlags(8);
                        m3958F(size);
                    }
                }
            }
        }

        /* renamed from: y */
        void m3990y(AbstractC0789h abstractC0789h, AbstractC0789h abstractC0789h2, boolean z10) {
            m3971c();
            m3949C(abstractC0789h, true);
            m3977i().m3943j(abstractC0789h, abstractC0789h2, z10);
            m3954u();
        }

        /* renamed from: z */
        void m3991z() {
            m3954u();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class InterfaceC0805x {
        /* renamed from: a */
        void mo3992a(AbstractC0787f0 abstractC0787f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public class C0806y extends AbstractC0791j {
        C0806y() {
        }

        /* renamed from: a */
        void m3993a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    AbstractC0616q0.m2620f0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3222g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.m4116p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4118r(i10, i11, obj)) {
                m3993a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4119s(i10, i11)) {
                m3993a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4120t(i10, i11, i12)) {
                m3993a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4121u(i10, i11)) {
                m3993a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0791j
        public void onStateRestorationPolicyChanged() {
            AbstractC0789h abstractC0789h;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (abstractC0789h = recyclerView.mAdapter) != null && abstractC0789h.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    static {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 19 && i10 != 20) {
            z10 = false;
        } else {
            z10 = true;
        }
        FORCE_INVALIDATE_DISPLAY_LIST = z10;
        if (i10 >= 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = z11;
        POST_UPDATES_ON_ANIMATION = true;
        if (i10 >= 21) {
            z12 = true;
        } else {
            z12 = false;
        }
        ALLOW_THREAD_GAP_WORK = z12;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0780c();
        sDefaultEdgeEffectFactory = new C0781c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC0787f0 abstractC0787f0) {
        boolean z10;
        View view = abstractC0787f0.itemView;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mRecycler.m3966O(getChildViewHolder(view));
        if (abstractC0787f0.isTmpDetached()) {
            this.mChildHelper.m4131c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.mChildHelper.m4130b(view, true);
        } else {
            this.mChildHelper.m4138k(view);
        }
    }

    private void animateChange(AbstractC0787f0 abstractC0787f0, AbstractC0787f0 abstractC0787f02, AbstractC0794m.b bVar, AbstractC0794m.b bVar2, boolean z10, boolean z11) {
        abstractC0787f0.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(abstractC0787f0);
        }
        if (abstractC0787f0 != abstractC0787f02) {
            if (z11) {
                addAnimatingView(abstractC0787f02);
            }
            abstractC0787f0.mShadowedHolder = abstractC0787f02;
            addAnimatingView(abstractC0787f0);
            this.mRecycler.m3966O(abstractC0787f0);
            abstractC0787f02.setIsRecyclable(false);
            abstractC0787f02.mShadowingHolder = abstractC0787f0;
        }
        if (this.mItemAnimator.mo3886b(abstractC0787f0, abstractC0787f02, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(AbstractC0787f0 abstractC0787f0) {
        WeakReference<RecyclerView> weakReference = abstractC0787f0.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0787f0.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            abstractC0787f0.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && AbstractC0674i.m2963b(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(((-i11) / FLING_DESTRETCH_FACTOR) * AbstractC0674i.m2965d(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 < 0 && edgeEffect2 != null && AbstractC0674i.m2963b(edgeEffect2) != DECELERATION_RATE) {
            float f10 = i11;
            int round2 = Math.round((f10 / FLING_DESTRETCH_FACTOR) * AbstractC0674i.m2965d(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
        return i10;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(AbstractC0797p.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0797p) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            AbstractC7445b.m28552b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z10 = true;
        this.mState.m3834a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3225j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m4290f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0779b0 c0779b0 = this.mState;
        if (!c0779b0.f3226k || !this.mItemsChanged) {
            z10 = false;
        }
        c0779b0.f3224i = z10;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0779b0.f3223h = c0779b0.f3227l;
        c0779b0.f3221f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3226k) {
            int m4135g = this.mChildHelper.m4135g();
            for (int i10 = 0; i10 < m4135g; i10++) {
                AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4134f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m4289e(childViewHolderInt, this.mItemAnimator.m3903t(this.mState, childViewHolderInt, AbstractC0794m.m3884e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f3224i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m4287c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3227l) {
            saveOldPositions();
            C0779b0 c0779b02 = this.mState;
            boolean z11 = c0779b02.f3222g;
            c0779b02.f3222g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0779b02);
            this.mState.f3222g = z11;
            for (int i11 = 0; i11 < this.mChildHelper.m4135g(); i11++) {
                AbstractC0787f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m4134f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m4293i(childViewHolderInt2)) {
                    int m3884e = AbstractC0794m.m3884e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        m3884e |= 4096;
                    }
                    AbstractC0794m.b m3903t = this.mItemAnimator.m3903t(this.mState, childViewHolderInt2, m3884e, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, m3903t);
                    } else {
                        this.mViewInfoStore.m4285a(childViewHolderInt2, m3903t);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3220e = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m3834a(6);
        this.mAdapterHelper.m4111j();
        this.mState.f3221f = this.mAdapter.getItemCount();
        this.mState.f3219d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f3285c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C0779b0 c0779b0 = this.mState;
        c0779b0.f3223h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0779b0);
        C0779b0 c0779b02 = this.mState;
        c0779b02.f3222g = false;
        if (c0779b02.f3226k && this.mItemAnimator != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0779b02.f3226k = z10;
        c0779b02.f3220e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m3834a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0779b0 c0779b0 = this.mState;
        c0779b0.f3220e = 1;
        if (c0779b0.f3226k) {
            for (int m4135g = this.mChildHelper.m4135g() - 1; m4135g >= 0; m4135g--) {
                AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4134f(m4135g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC0794m.b m3902s = this.mItemAnimator.m3902s(this.mState, childViewHolderInt);
                    AbstractC0787f0 m4291g = this.mViewInfoStore.m4291g(changedHolderKey);
                    if (m4291g != null && !m4291g.shouldIgnore()) {
                        boolean m4292h = this.mViewInfoStore.m4292h(m4291g);
                        boolean m4292h2 = this.mViewInfoStore.m4292h(childViewHolderInt);
                        if (m4292h && m4291g == childViewHolderInt) {
                            this.mViewInfoStore.m4288d(childViewHolderInt, m3902s);
                        } else {
                            AbstractC0794m.b m4297n = this.mViewInfoStore.m4297n(m4291g);
                            this.mViewInfoStore.m4288d(childViewHolderInt, m3902s);
                            AbstractC0794m.b m4296m = this.mViewInfoStore.m4296m(childViewHolderInt);
                            if (m4297n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m4291g);
                            } else {
                                animateChange(m4291g, childViewHolderInt, m4297n, m4296m, m4292h, m4292h2);
                            }
                        }
                    } else {
                        this.mViewInfoStore.m4288d(childViewHolderInt, m3902s);
                    }
                }
            }
            this.mViewInfoStore.m4298o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C0779b0 c0779b02 = this.mState;
        c0779b02.f3218c = c0779b02.f3221f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0779b02.f3226k = false;
        c0779b02.f3227l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f3277b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC0797p.mPrefetchMaxCountObserved = 0;
            abstractC0797p.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m3967P();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m4290f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0801t interfaceC0801t = this.mInterceptingOnItemTouchListener;
        if (interfaceC0801t == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0801t.mo3931a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC0801t interfaceC0801t = this.mOnItemTouchListeners.get(i10);
            if (interfaceC0801t.mo3932b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0801t;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m4135g = this.mChildHelper.m4135g();
        if (m4135g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < m4135g; i12++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4134f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC0787f0 findViewHolderForAdapterPosition;
        C0779b0 c0779b0 = this.mState;
        int i10 = c0779b0.f3228m;
        if (i10 == -1) {
            i10 = 0;
        }
        int m3836c = c0779b0.m3836c();
        for (int i11 = i10; i11 < m3836c; i11++) {
            AbstractC0787f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(m3836c, i10);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0787f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0798q) view.getLayoutParams()).f3265a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0798q c0798q = (C0798q) view.getLayoutParams();
        Rect rect2 = c0798q.f3266b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0798q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0798q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0798q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0798q).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0568e0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0568e0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double log = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        double d10 = f10;
        Double.isNaN(d10);
        double d11 = this.mPhysicalCoef * SCROLL_FRICTION;
        double d12 = f10;
        Double.isNaN(d12);
        double exp = Math.exp((d12 / (d10 - 1.0d)) * log);
        Double.isNaN(d11);
        return (float) (d11 * exp);
    }

    private void handleMissingPreInfoForChangeError(long j10, AbstractC0787f0 abstractC0787f0, AbstractC0787f0 abstractC0787f02) {
        int m4135g = this.mChildHelper.m4135g();
        for (int i10 = 0; i10 < m4135g; i10++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4134f(i10));
            if (childViewHolderInt != abstractC0787f0 && getChangedHolderKey(childViewHolderInt) == j10) {
                AbstractC0789h abstractC0789h = this.mAdapter;
                if (abstractC0789h != null && abstractC0789h.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0787f0 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0787f0 + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0787f02 + " cannot be found but it is necessary for " + abstractC0787f0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int m4135g = this.mChildHelper.m4135g();
        for (int i10 = 0; i10 < m4135g; i10++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4134f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (AbstractC0616q0.m2577A(this) == 0) {
            AbstractC0616q0.m2656x0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0815b(new C0784e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        if (this.mLayout.getLayoutDirection() == 1) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                i12 = -1;
            } else {
                i12 = 0;
            }
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                if (c10 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
                        }
                        if (i12 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c10 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i12 >= 0) {
                    return false;
                }
                return true;
            }
            if (c10 <= 0 && (c10 != 0 || i12 * i11 <= 0)) {
                return false;
            }
            return true;
        }
        if (c10 >= 0 && (c10 != 0 || i12 * i11 >= 0)) {
            return false;
        }
        return true;
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        float y10;
        float x10;
        int i14;
        int i15;
        int i16;
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i17 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = abstractC0797p.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollVertically) {
            i13 = (canScrollHorizontally ? 1 : 0) | 2;
        } else {
            i13 = canScrollHorizontally ? 1 : 0;
        }
        if (motionEvent == null) {
            y10 = getHeight() / 2.0f;
        } else {
            y10 = motionEvent.getY();
        }
        if (motionEvent == null) {
            x10 = getWidth() / 2.0f;
        } else {
            x10 = motionEvent.getX();
        }
        int releaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, y10);
        int releaseVerticalGlow = i11 - releaseVerticalGlow(i11, x10);
        startNestedScroll(i13, i12);
        if (canScrollHorizontally) {
            i14 = releaseHorizontalGlow;
        } else {
            i14 = 0;
        }
        if (canScrollVertically) {
            i15 = releaseVerticalGlow;
        } else {
            i15 = 0;
        }
        if (dispatchNestedPreScroll(i14, i15, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        if (canScrollHorizontally) {
            i16 = releaseHorizontalGlow;
        } else {
            i16 = 0;
        }
        if (canScrollVertically) {
            i17 = releaseVerticalGlow;
        }
        scrollByInternal(i16, i17, motionEvent, i12);
        RunnableC0819f runnableC0819f = this.mGapWorker;
        if (runnableC0819f != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            runnableC0819f.m4199f(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            return true;
        }
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m4124y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m4122w();
        } else {
            this.mAdapterHelper.m4111j();
        }
        boolean z13 = false;
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z10 = false;
        } else {
            z10 = true;
        }
        C0779b0 c0779b0 = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z12 = this.mDataSetHasChangedAfterLayout) || z10 || this.mLayout.mRequestedSimpleAnimations) && (!z12 || this.mAdapter.hasStableIds()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        c0779b0.f3226k = z11;
        C0779b0 c0779b02 = this.mState;
        if (c0779b02.f3226k && z10 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z13 = true;
        }
        c0779b02.f3227l = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.AbstractC0674i.m2965d(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.AbstractC0674i.m2965d(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.AbstractC0674i.m2965d(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.AbstractC0674i.m2965d(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.AbstractC0616q0.m2618e0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        AbstractC0787f0 abstractC0787f0;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.m4135g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.m4140n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f3229n != -1 && this.mAdapter.hasStableIds()) {
                    abstractC0787f0 = findViewHolderForItemId(this.mState.f3229n);
                } else {
                    abstractC0787f0 = null;
                }
                if (abstractC0787f0 != null && !this.mChildHelper.m4140n(abstractC0787f0.itemView) && abstractC0787f0.itemView.hasFocusable()) {
                    view = abstractC0787f0.itemView;
                } else if (this.mChildHelper.m4135g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i10 = this.mState.f3230o;
                    if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            AbstractC0616q0.m2618e0(this);
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && AbstractC0674i.m2963b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -AbstractC0674i.m2965d(this.mLeftGlow, -width, 1.0f - height);
                if (AbstractC0674i.m2963b(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && AbstractC0674i.m2963b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float m2965d = AbstractC0674i.m2965d(this.mRightGlow, width, height);
                    if (AbstractC0674i.m2963b(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = m2965d;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && AbstractC0674i.m2963b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -AbstractC0674i.m2965d(this.mTopGlow, -height, width);
                if (AbstractC0674i.m2963b(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && AbstractC0674i.m2963b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float m2965d = AbstractC0674i.m2965d(this.mBottomGlow, height, 1.0f - width);
                    if (AbstractC0674i.m2963b(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = m2965d;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0798q) {
            C0798q c0798q = (C0798q) layoutParams;
            if (!c0798q.f3267c) {
                Rect rect = c0798q.f3266b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z11 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        abstractC0797p.requestChildRectangleOnScreen(this, view, rect3, z11, z10);
    }

    private void resetFocusInfo() {
        C0779b0 c0779b0 = this.mState;
        c0779b0.f3229n = -1L;
        c0779b0.f3228m = -1;
        c0779b0.f3230o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j10;
        int absoluteAdapterPosition;
        AbstractC0787f0 abstractC0787f0 = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            abstractC0787f0 = findContainingViewHolder(view);
        }
        if (abstractC0787f0 == null) {
            resetFocusInfo();
            return;
        }
        C0779b0 c0779b0 = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j10 = abstractC0787f0.getItemId();
        } else {
            j10 = -1;
        }
        c0779b0.f3229n = j10;
        C0779b0 c0779b02 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (abstractC0787f0.isRemoved()) {
            absoluteAdapterPosition = abstractC0787f0.mOldPosition;
        } else {
            absoluteAdapterPosition = abstractC0787f0.getAbsoluteAdapterPosition();
        }
        c0779b02.f3228m = absoluteAdapterPosition;
        this.mState.f3230o = getDeepestFocusedViewWithId(abstractC0787f0.itemView);
    }

    private void setAdapterInternal(AbstractC0789h abstractC0789h, boolean z10, boolean z11) {
        AbstractC0789h abstractC0789h2 = this.mAdapter;
        if (abstractC0789h2 != null) {
            abstractC0789h2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m4124y();
        AbstractC0789h abstractC0789h3 = this.mAdapter;
        this.mAdapter = abstractC0789h;
        if (abstractC0789h != null) {
            abstractC0789h.registerAdapterDataObserver(this.mObserver);
            abstractC0789h.onAttachedToRecyclerView(this);
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.onAdapterChanged(abstractC0789h3, this.mAdapter);
        }
        this.mRecycler.m3990y(abstractC0789h3, this.mAdapter, z10);
        this.mState.f3222g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i10) < AbstractC0674i.m2963b(edgeEffect) * i11) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && AbstractC0674i.m2963b(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            AbstractC0674i.m2965d(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && AbstractC0674i.m2963b(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            AbstractC0674i.m2965d(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && AbstractC0674i.m2963b(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            AbstractC0674i.m2965d(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && AbstractC0674i.m2963b(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            AbstractC0674i.m2965d(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m3865f();
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.stopSmoothScroller();
        }
    }

    void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            AbstractC0616q0.m2618e0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(AbstractC0796o abstractC0796o, int i10) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(abstractC0796o);
        } else {
            this.mItemDecorations.add(i10, abstractC0796o);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0799r interfaceC0799r) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0799r);
    }

    public void addOnItemTouchListener(InterfaceC0801t interfaceC0801t) {
        this.mOnItemTouchListeners.add(interfaceC0801t);
    }

    public void addOnScrollListener(AbstractC0802u abstractC0802u) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0802u);
    }

    public void addRecyclerListener(InterfaceC0805x interfaceC0805x) {
        boolean z10;
        if (interfaceC0805x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC7342g.m28322b(z10, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC0805x);
    }

    void animateAppearance(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar, AbstractC0794m.b bVar2) {
        abstractC0787f0.setIsRecyclable(false);
        if (this.mItemAnimator.mo3885a(abstractC0787f0, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar, AbstractC0794m.b bVar2) {
        addAnimatingView(abstractC0787f0);
        abstractC0787f0.setIsRecyclable(false);
        if (this.mItemAnimator.mo3887c(abstractC0787f0, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(AbstractC0787f0 abstractC0787f0) {
        AbstractC0794m abstractC0794m = this.mItemAnimator;
        if (abstractC0794m != null && !abstractC0794m.mo3890g(abstractC0787f0, abstractC0787f0.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C0798q) && this.mLayout.checkLayoutParams((C0798q) layoutParams)) {
            return true;
        }
        return false;
    }

    void clearOldPositions() {
        int m4137j = this.mChildHelper.m4137j();
        for (int i10 = 0; i10 < m4137j; i10++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m3972d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0799r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0802u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollRange(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null || !abstractC0797p.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollRange(this.mState);
    }

    void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            AbstractC0616q0.m2618e0(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.m4116p()) {
                return;
            }
            if (this.mAdapterHelper.m4115o(4) && !this.mAdapterHelper.m4115o(11)) {
                AbstractC6880k.m26792a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m4122w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m4110i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                AbstractC6880k.m26793b();
                return;
            }
            if (this.mAdapterHelper.m4116p()) {
                AbstractC6880k.m26792a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                AbstractC6880k.m26793b();
                return;
            }
            return;
        }
        AbstractC6880k.m26792a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        AbstractC6880k.m26793b();
    }

    void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(AbstractC0797p.chooseSize(i10, getPaddingLeft() + getPaddingRight(), AbstractC0616q0.m2583D(this)), AbstractC0797p.chooseSize(i11, getPaddingTop() + getPaddingBottom(), AbstractC0616q0.m2581C(this)));
    }

    void dispatchChildAttached(View view) {
        AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC0789h abstractC0789h = this.mAdapter;
        if (abstractC0789h != null && childViewHolderInt != null) {
            abstractC0789h.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC0799r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC0789h abstractC0789h = this.mAdapter;
        if (abstractC0789h != null && childViewHolderInt != null) {
            abstractC0789h.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC0799r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchLayout() {
        boolean z10;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f3225j = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f3220e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (!this.mAdapterHelper.m4117q() && !z10 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().m2441a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().m2442b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2443c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m2446f(i10, i11, i12, i13, iArr);
    }

    void dispatchOnScrollStateChanged(int i10) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.onScrollStateChanged(i10);
        }
        onScrollStateChanged(i10);
        AbstractC0802u abstractC0802u = this.mScrollListener;
        if (abstractC0802u != null) {
            abstractC0802u.onScrollStateChanged(this, i10);
        }
        List<AbstractC0802u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        AbstractC0802u abstractC0802u = this.mScrollListener;
        if (abstractC0802u != null) {
            abstractC0802u.onScrolled(this, i10, i11);
        }
        List<AbstractC0802u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0787f0 abstractC0787f0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0787f0.itemView.getParent() == this && !abstractC0787f0.shouldIgnore() && (i10 = abstractC0787f0.mPendingAccessibilityState) != -1) {
                AbstractC0616q0.m2654w0(abstractC0787f0.itemView, i10);
                abstractC0787f0.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            this.mItemDecorations.get(i12).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo3899p()) {
            z14 = z10;
        }
        if (z14) {
            AbstractC0616q0.m2618e0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect mo3844a = this.mEdgeEffectFactory.mo3844a(this, 3);
        this.mBottomGlow = mo3844a;
        if (this.mClipToPadding) {
            mo3844a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo3844a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect mo3844a = this.mEdgeEffectFactory.mo3844a(this, 0);
        this.mLeftGlow = mo3844a;
        if (this.mClipToPadding) {
            mo3844a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo3844a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect mo3844a = this.mEdgeEffectFactory.mo3844a(this, 2);
        this.mRightGlow = mo3844a;
        if (this.mClipToPadding) {
            mo3844a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo3844a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect mo3844a = this.mEdgeEffectFactory.mo3844a(this, 1);
        this.mTopGlow = mo3844a;
        if (this.mClipToPadding) {
            mo3844a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo3844a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(C0779b0 c0779b0) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f3237c;
            c0779b0.f3231p = overScroller.getFinalX() - overScroller.getCurrX();
            c0779b0.f3232q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c0779b0.f3231p = 0;
            c0779b0.f3232q = 0;
        }
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int m4135g = this.mChildHelper.m4135g() - 1; m4135g >= 0; m4135g--) {
            View m4134f = this.mChildHelper.m4134f(m4135g);
            float translationX = m4134f.getTranslationX();
            float translationY = m4134f.getTranslationY();
            if (f10 >= m4134f.getLeft() + translationX && f10 <= m4134f.getRight() + translationX && f11 >= m4134f.getTop() + translationY && f11 <= m4134f.getBottom() + translationY) {
                return m4134f;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public AbstractC0787f0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public AbstractC0787f0 findViewHolderForAdapterPosition(int i10) {
        AbstractC0787f0 abstractC0787f0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m4137j = this.mChildHelper.m4137j();
        for (int i11 = 0; i11 < m4137j; i11++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (this.mChildHelper.m4140n(childViewHolderInt.itemView)) {
                    abstractC0787f0 = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return abstractC0787f0;
    }

    public AbstractC0787f0 findViewHolderForItemId(long j10) {
        AbstractC0789h abstractC0789h = this.mAdapter;
        AbstractC0787f0 abstractC0787f0 = null;
        if (abstractC0789h != null && abstractC0789h.hasStableIds()) {
            int m4137j = this.mChildHelper.m4137j();
            for (int i10 = 0; i10 < m4137j; i10++) {
                AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (this.mChildHelper.m4140n(childViewHolderInt.itemView)) {
                        abstractC0787f0 = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return abstractC0787f0;
    }

    public AbstractC0787f0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public AbstractC0787f0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i10);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z14 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (i10 == 2) {
                    i12 = 130;
                } else {
                    i12 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i12) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.canScrollHorizontally()) {
                if (this.mLayout.getLayoutDirection() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 ^ z13) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i11) != null) {
                    z14 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
                z11 = z14;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (!isPreferredNextFocus(view, view2, i10)) {
            return super.focusSearch(view, i10);
        }
        return view2;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            return abstractC0797p.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            return abstractC0797p.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0789h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(AbstractC0787f0 abstractC0787f0) {
        if (!abstractC0787f0.hasAnyOfTheFlags(524) && abstractC0787f0.isBound()) {
            return this.mAdapterHelper.m4109e(abstractC0787f0.mPosition);
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            return abstractC0797p.getBaseline();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(AbstractC0787f0 abstractC0787f0) {
        if (this.mAdapter.hasStableIds()) {
            return abstractC0787f0.getItemId();
        }
        return abstractC0787f0.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(View view) {
        AbstractC0787f0 childViewHolderInt;
        AbstractC0789h abstractC0789h = this.mAdapter;
        if (abstractC0789h == null || !abstractC0789h.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0787f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0826m getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0793l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC0794m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        C0798q c0798q = (C0798q) view.getLayoutParams();
        if (!c0798q.f3267c) {
            return c0798q.f3266b;
        }
        if (this.mState.m3841h() && (c0798q.m3927c() || c0798q.m3929e())) {
            return c0798q.f3266b;
        }
        Rect rect = c0798q.f3266b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0798q.f3267c = false;
        return rect;
    }

    public AbstractC0796o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC0797p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0800s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0803v getRecycledViewPool() {
        return this.mRecycler.m3977i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2448k();
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.m4116p()) {
            return false;
        }
        return true;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C0814a(new C0786f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0818e(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R$dimen.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        AbstractC0794m abstractC0794m = this.mItemAnimator;
        if (abstractC0794m != null && abstractC0794m.mo3899p()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0564d0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m2450m();
    }

    void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i10);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int m4137j = this.mChildHelper.m4137j();
        for (int i10 = 0; i10 < m4137j; i10++) {
            ((C0798q) this.mChildHelper.m4136i(i10).getLayoutParams()).f3267c = true;
        }
        this.mRecycler.m3985s();
    }

    void markKnownViewsInvalid() {
        int m4137j = this.mChildHelper.m4137j();
        for (int i10 = 0; i10 < m4137j; i10++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m3986t();
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int m4135g = this.mChildHelper.m4135g();
        for (int i11 = 0; i11 < m4135g; i11++) {
            this.mChildHelper.m4134f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int m4135g = this.mChildHelper.m4135g();
        for (int i11 = 0; i11 < m4135g; i11++) {
            this.mChildHelper.m4134f(i11).offsetTopAndBottom(i10);
        }
    }

    void offsetPositionRecordsForInsert(int i10, int i11) {
        int m4137j = this.mChildHelper.m4137j();
        for (int i12 = 0; i12 < m4137j; i12++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f3222g = true;
            }
        }
        this.mRecycler.m3987v(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m4137j = this.mChildHelper.m4137j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < m4137j; i16++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i16 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f3222g = true;
            }
        }
        this.mRecycler.m3988w(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int m4137j = this.mChildHelper.m4137j();
        for (int i13 = 0; i13 < m4137j; i13++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f3222g = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f3222g = true;
                }
            }
        }
        this.mRecycler.m3989x(i10, i11, z10);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.m3991z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC0819f.f3450e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.f r1 = (androidx.recyclerview.widget.RunnableC0819f) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.f r1 = new androidx.recyclerview.widget.f
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.AbstractC0616q0.m2649u(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.f r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3454c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.f r0 = r5.mGapWorker
            r0.m4198a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0819f runnableC0819f;
        super.onDetachedFromWindow();
        AbstractC0794m abstractC0794m = this.mItemAnimator;
        if (abstractC0794m != null) {
            abstractC0794m.mo3894k();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m4294j();
        this.mRecycler.m3955A();
        AbstractC0000a.m1b(this);
        if (ALLOW_THREAD_GAP_WORK && (runnableC0819f = this.mGapWorker) != null) {
            runnableC0819f.m4201j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            return false;
        }
        boolean canScrollHorizontally = abstractC0797p.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x10;
                            this.mInitialTouchX = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y10;
                            this.mInitialTouchY = y10;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x11 - this.mInitialTouchX;
                        int i11 = y11 - this.mInitialTouchY;
                        if (canScrollHorizontally != 0 && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchX = x11;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (canScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = canScrollHorizontally;
            if (canScrollVertically) {
                i12 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i12, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC6880k.m26792a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        AbstractC6880k.m26793b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (abstractC0797p.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (!z10 && this.mAdapter != null) {
                if (this.mState.f3220e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i10, i11);
                this.mState.f3225j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f3225j = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0779b0 c0779b0 = this.mState;
            if (c0779b0.f3227l) {
                c0779b0.f3223h = true;
            } else {
                this.mAdapterHelper.m4111j();
                this.mState.f3223h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f3227l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0789h abstractC0789h = this.mAdapter;
        if (abstractC0789h != null) {
            this.mState.f3221f = abstractC0789h.getItemCount();
        } else {
            this.mState.f3221f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f3223h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0807z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0807z c0807z = (C0807z) parcelable;
        this.mPendingSavedState = c0807z;
        super.onRestoreInstanceState(c0807z.m4828a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0807z c0807z = new C0807z(super.onSaveInstanceState());
        C0807z c0807z2 = this.mPendingSavedState;
        if (c0807z2 != null) {
            c0807z.m3994b(c0807z2);
        } else {
            AbstractC0797p abstractC0797p = this.mLayout;
            if (abstractC0797p != null) {
                c0807z.f3285c = abstractC0797p.onSaveInstanceState();
            } else {
                c0807z.f3285c = null;
            }
        }
        return c0807z;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            AbstractC0616q0.m2620f0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(AbstractC0787f0 abstractC0787f0, AbstractC0794m.b bVar) {
        abstractC0787f0.setFlags(0, 8192);
        if (this.mState.f3224i && abstractC0787f0.isUpdated() && !abstractC0787f0.isRemoved() && !abstractC0787f0.shouldIgnore()) {
            this.mViewInfoStore.m4287c(getChangedHolderKey(abstractC0787f0), abstractC0787f0);
        }
        this.mViewInfoStore.m4289e(abstractC0787f0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        AbstractC0794m abstractC0794m = this.mItemAnimator;
        if (abstractC0794m != null) {
            abstractC0794m.mo3894k();
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m3971c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m4144r = this.mChildHelper.m4144r(view);
        if (m4144r) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m3966O(childViewHolderInt);
            this.mRecycler.m3960H(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!m4144r);
        return m4144r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(AbstractC0796o abstractC0796o) {
        boolean z10;
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            abstractC0797p.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0796o);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0799r interfaceC0799r) {
        List<InterfaceC0799r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0799r);
    }

    public void removeOnItemTouchListener(InterfaceC0801t interfaceC0801t) {
        this.mOnItemTouchListeners.remove(interfaceC0801t);
        if (this.mInterceptingOnItemTouchListener == interfaceC0801t) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC0802u abstractC0802u) {
        List<AbstractC0802u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0802u);
        }
    }

    public void removeRecyclerListener(InterfaceC0805x interfaceC0805x) {
        this.mRecyclerListeners.remove(interfaceC0805x);
    }

    void repositionShadowingViews() {
        AbstractC0787f0 abstractC0787f0;
        int m4135g = this.mChildHelper.m4135g();
        for (int i10 = 0; i10 < m4135g; i10++) {
            View m4134f = this.mChildHelper.m4134f(i10);
            AbstractC0787f0 childViewHolder = getChildViewHolder(m4134f);
            if (childViewHolder != null && (abstractC0787f0 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC0787f0.itemView;
                int left = m4134f.getLeft();
                int top = m4134f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).mo3933c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int m4137j = this.mChildHelper.m4137j();
        for (int i10 = 0; i10 < m4137j; i10++) {
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4136i(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = abstractC0797p.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i10 = 0;
            }
            if (!canScrollVertically) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        if (i19 == 0 && i21 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0560c0.m2430a(motionEvent, C3395q.a.f14875s)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z10 || i14 != 0 || i13 != 0) {
            return true;
        }
        return false;
    }

    void scrollStep(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        AbstractC6880k.m26792a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i10 != 0) {
            i12 = this.mLayout.scrollHorizontallyBy(i10, this.mRecycler, this.mState);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.mLayout.scrollVerticallyBy(i11, this.mRecycler, this.mState);
        } else {
            i13 = 0;
        }
        AbstractC6880k.m26793b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0797p.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0826m c0826m) {
        this.mAccessibilityDelegate = c0826m;
        AbstractC0616q0.m2636n0(this, c0826m);
    }

    public void setAdapter(AbstractC0789h abstractC0789h) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0789h, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0792k interfaceC0792k) {
        if (interfaceC0792k == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    boolean setChildImportantForAccessibilityInternal(AbstractC0787f0 abstractC0787f0, int i10) {
        if (isComputingLayout()) {
            abstractC0787f0.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(abstractC0787f0);
            return false;
        }
        AbstractC0616q0.m2654w0(abstractC0787f0.itemView, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0793l c0793l) {
        AbstractC7342g.m28327g(c0793l);
        this.mEdgeEffectFactory = c0793l;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(AbstractC0794m abstractC0794m) {
        AbstractC0794m abstractC0794m2 = this.mItemAnimator;
        if (abstractC0794m2 != null) {
            abstractC0794m2.mo3894k();
            this.mItemAnimator.m3907x(null);
        }
        this.mItemAnimator = abstractC0794m;
        if (abstractC0794m != null) {
            abstractC0794m.m3907x(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.m3964L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(AbstractC0797p abstractC0797p) {
        if (abstractC0797p == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0794m abstractC0794m = this.mItemAnimator;
            if (abstractC0794m != null) {
                abstractC0794m.mo3894k();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m3971c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m3971c();
        }
        this.mChildHelper.m4141o();
        this.mLayout = abstractC0797p;
        if (abstractC0797p != null) {
            if (abstractC0797p.mRecyclerView == null) {
                abstractC0797p.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC0797p + " is already attached to a RecyclerView:" + abstractC0797p.mRecyclerView.exceptionLabel());
            }
        }
        this.mRecycler.m3967P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m2451n(z10);
    }

    public void setOnFlingListener(AbstractC0800s abstractC0800s) {
        this.mOnFlingListener = abstractC0800s;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0802u abstractC0802u) {
        this.mScrollListener = abstractC0802u;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(C0803v c0803v) {
        this.mRecycler.m3962J(c0803v);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0805x interfaceC0805x) {
        this.mRecyclerListener = interfaceC0805x;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            Log.d(TAG, "setting scroll state to " + i10 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0783d0 abstractC0783d0) {
        this.mRecycler.m3963K(abstractC0783d0);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i10 = AbstractC7445b.m28551a(accessibilityEvent);
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = i10;
        }
        this.mEatenAccessibilityChangeFlags |= i11;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0797p.smoothScrollToPosition(this, this.mState, i10);
        }
    }

    void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m2452p(i10);
    }

    void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0564d0
    public void stopNestedScroll() {
        getScrollingChildHelper().m2454r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(AbstractC0789h abstractC0789h, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0789h, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int m4137j = this.mChildHelper.m4137j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < m4137j; i14++) {
            View m4136i = this.mChildHelper.m4136i(i14);
            AbstractC0787f0 childViewHolderInt = getChildViewHolderInt(m4136i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C0798q) m4136i.getLayoutParams()).f3267c = true;
            }
        }
        this.mRecycler.m3969R(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().m2444d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().m2447g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0787f0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.m4137j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.m4136i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m4140n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().m2449l(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().m2453q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().m2455s(i10);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C0807z extends AbstractC1031a {
        public static final Parcelable.Creator<C0807z> CREATOR = new a();

        /* renamed from: c */
        Parcelable f3285c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0807z createFromParcel(Parcel parcel) {
                return new C0807z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0807z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0807z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0807z[] newArray(int i10) {
                return new C0807z[i10];
            }
        }

        C0807z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3285c = parcel.readParcelable(classLoader == null ? AbstractC0797p.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m3994b(C0807z c0807z) {
            this.f3285c = c0807z.f3285c;
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3285c, 0);
        }

        C0807z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10;
        this.mObserver = new C0806y();
        this.mRecycler = new C0804w();
        this.mViewInfoStore = new C0831r();
        this.mUpdateChildViewsRunnable = new RunnableC0776a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C0816c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0785e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC0819f.b() : null;
        this.mState = new C0779b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0795n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0778b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C0782d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = AbstractC0640w0.m2828b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = AbstractC0640w0.m2830d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m3907x(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (AbstractC0616q0.m2659z(this) == 0) {
            AbstractC0616q0.m2654w0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0826m(this));
        int[] iArr = R$styleable.f3175a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC0616q0.m2632l0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(R$styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_android_clipToPadding, true);
        boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
            AbstractC0616q0.m2632l0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
            z10 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        } else {
            z10 = true;
        }
        setNestedScrollingEnabled(z10);
        AbstractC0000a.m3d(this, true);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().m2445e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public static class C0798q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0787f0 f3265a;

        /* renamed from: b */
        final Rect f3266b;

        /* renamed from: c */
        boolean f3267c;

        /* renamed from: d */
        boolean f3268d;

        public C0798q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3266b = new Rect();
            this.f3267c = true;
            this.f3268d = false;
        }

        /* renamed from: a */
        public int m3925a() {
            return this.f3265a.getBindingAdapterPosition();
        }

        /* renamed from: b */
        public int m3926b() {
            return this.f3265a.getLayoutPosition();
        }

        /* renamed from: c */
        public boolean m3927c() {
            return this.f3265a.isUpdated();
        }

        /* renamed from: d */
        public boolean m3928d() {
            return this.f3265a.isRemoved();
        }

        /* renamed from: e */
        public boolean m3929e() {
            return this.f3265a.isInvalid();
        }

        /* renamed from: f */
        public boolean m3930f() {
            return this.f3265a.needsUpdate();
        }

        public C0798q(int i10, int i11) {
            super(i10, i11);
            this.f3266b = new Rect();
            this.f3267c = true;
            this.f3268d = false;
        }

        public C0798q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3266b = new Rect();
            this.f3267c = true;
            this.f3268d = false;
        }

        public C0798q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3266b = new Rect();
            this.f3267c = true;
            this.f3268d = false;
        }

        public C0798q(C0798q c0798q) {
            super((ViewGroup.LayoutParams) c0798q);
            this.f3266b = new Rect();
            this.f3267c = true;
            this.f3268d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p != null) {
            return abstractC0797p.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        AbstractC0797p abstractC0797p = this.mLayout;
        if (abstractC0797p == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC0797p.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 == Integer.MIN_VALUE || i12 > 0) {
            if (z10) {
                int i13 = i10 != 0 ? 1 : 0;
                if (i11 != 0) {
                    i13 |= 2;
                }
                startNestedScroll(i13, 1);
            }
            this.mViewFlinger.m3864e(i10, i11, i12, interpolator);
            return;
        }
        scrollBy(i10, i11);
    }

    public void addItemDecoration(AbstractC0796o abstractC0796o) {
        addItemDecoration(abstractC0796o, -1);
    }
}
