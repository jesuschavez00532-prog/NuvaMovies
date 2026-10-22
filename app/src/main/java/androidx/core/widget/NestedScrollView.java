package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.R$attr;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import androidx.core.view.C0568e0;
import androidx.core.view.C0584i0;
import androidx.core.view.InterfaceC0564d0;
import androidx.core.view.InterfaceC0576g0;
import com.widget.bridge.OpenEffectBridge;
import java.util.ArrayList;
import p389x.AbstractC7466l0;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0576g0, InterfaceC0564d0 {

    /* renamed from: A */
    private static final C0655a f2433A = new C0655a();

    /* renamed from: B */
    private static final int[] f2434B = {R.attr.fillViewport};

    /* renamed from: a */
    private long f2435a;

    /* renamed from: b */
    private final Rect f2436b;

    /* renamed from: c */
    private OverScroller f2437c;

    /* renamed from: d */
    public EdgeEffect f2438d;

    /* renamed from: e */
    public EdgeEffect f2439e;

    /* renamed from: f */
    private int f2440f;

    /* renamed from: g */
    private boolean f2441g;

    /* renamed from: h */
    private boolean f2442h;

    /* renamed from: i */
    private View f2443i;

    /* renamed from: j */
    private boolean f2444j;

    /* renamed from: k */
    private VelocityTracker f2445k;

    /* renamed from: l */
    private boolean f2446l;

    /* renamed from: m */
    private boolean f2447m;

    /* renamed from: n */
    private int f2448n;

    /* renamed from: o */
    private int f2449o;

    /* renamed from: p */
    private int f2450p;

    /* renamed from: q */
    private int f2451q;

    /* renamed from: r */
    private final int[] f2452r;

    /* renamed from: s */
    private final int[] f2453s;

    /* renamed from: t */
    private int f2454t;

    /* renamed from: u */
    private int f2455u;

    /* renamed from: v */
    private C0657c f2456v;

    /* renamed from: w */
    private final C0584i0 f2457w;

    /* renamed from: x */
    private final C0568e0 f2458x;

    /* renamed from: y */
    private float f2459y;

    /* renamed from: z */
    private InterfaceC0656b f2460z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0655a extends C0551a {
        C0655a() {
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: f */
        public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.mo2381f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC7466l0.m28654a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC7466l0.m28655b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            int scrollRange;
            super.mo2382g(view, c7458h0);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c7458h0.m28599X(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                c7458h0.m28626o0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c7458h0.m28604b(C7458h0.a.f27523r);
                    c7458h0.m28604b(C7458h0.a.f27495C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c7458h0.m28604b(C7458h0.a.f27522q);
                    c7458h0.m28604b(C7458h0.a.f27497E);
                }
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: j */
        public boolean mo2385j(View view, int i10, Bundle bundle) {
            if (super.mo2385j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2877P(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m2877P(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0656b {
        /* renamed from: a */
        void mo1021a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public static class C0657c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0657c> CREATOR = new a();

        /* renamed from: a */
        public int f2461a;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0657c createFromParcel(Parcel parcel) {
                return new C0657c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0657c[] newArray(int i10) {
                return new C0657c[i10];
            }
        }

        C0657c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2461a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2461a);
        }

        C0657c(Parcel parcel) {
            super(parcel);
            this.f2461a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nestedScrollViewStyle);
    }

    /* renamed from: A */
    private static boolean m2849A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && m2849A((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m2850B(View view, int i10, int i11) {
        view.getDrawingRect(this.f2436b);
        offsetDescendantRectToMyCoords(view, this.f2436b);
        if (this.f2436b.bottom + i10 >= getScrollY() && this.f2436b.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m2851C(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2458x.m2445e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* renamed from: D */
    private void m2852D(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2451q) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f2440f = (int) motionEvent.getY(i10);
            this.f2451q = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2445k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m2853G() {
        VelocityTracker velocityTracker = this.f2445k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2445k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m2854H(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2438d
            float r0 = androidx.core.widget.AbstractC0674i.m2963b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f2438d
            float r4 = -r4
            float r4 = androidx.core.widget.AbstractC0674i.m2965d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2438d
            float r5 = androidx.core.widget.AbstractC0674i.m2963b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2438d
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f2439e
            float r0 = androidx.core.widget.AbstractC0674i.m2963b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f2439e
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.AbstractC0674i.m2965d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2439e
            float r5 = androidx.core.widget.AbstractC0674i.m2963b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2439e
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2854H(int, float):int");
    }

    /* renamed from: I */
    private void m2855I(boolean z10) {
        if (z10) {
            m2878Q(2, 1);
        } else {
            m2879S(1);
        }
        this.f2455u = getScrollY();
        AbstractC0616q0.m2618e0(this);
    }

    /* renamed from: J */
    private boolean m2856J(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        View m2867r = m2867r(z10, i11, i12);
        if (m2867r == null) {
            m2867r = this;
        }
        if (i11 < scrollY || i12 > i14) {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            m2864i(i13);
            z11 = true;
        }
        if (m2867r != findFocus()) {
            m2867r.requestFocus(i10);
        }
        return z11;
    }

    /* renamed from: K */
    private void m2857K(View view) {
        view.getDrawingRect(this.f2436b);
        offsetDescendantRectToMyCoords(view, this.f2436b);
        int m2881f = m2881f(this.f2436b);
        if (m2881f != 0) {
            scrollBy(0, m2881f);
        }
    }

    /* renamed from: L */
    private boolean m2858L(Rect rect, boolean z10) {
        boolean z11;
        int m2881f = m2881f(rect);
        if (m2881f != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, m2881f);
            } else {
                m2875M(0, m2881f);
            }
        }
        return z11;
    }

    /* renamed from: N */
    private void m2859N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2435a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2437c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            m2855I(z10);
        } else {
            if (!this.f2437c.isFinished()) {
                m2861a();
            }
            scrollBy(i10, i11);
        }
        this.f2435a = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: R */
    private boolean m2860R(MotionEvent motionEvent) {
        boolean z10;
        if (AbstractC0674i.m2963b(this.f2438d) != 0.0f) {
            AbstractC0674i.m2965d(this.f2438d, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC0674i.m2963b(this.f2439e) != 0.0f) {
            AbstractC0674i.m2965d(this.f2439e, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z10;
    }

    /* renamed from: a */
    private void m2861a() {
        this.f2437c.abortAnimation();
        m2879S(1);
    }

    /* renamed from: c */
    private boolean m2862c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static int m2863d(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2459y == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f2459y = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2459y;
    }

    /* renamed from: i */
    private void m2864i(int i10) {
        if (i10 != 0) {
            if (this.f2447m) {
                m2875M(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    /* renamed from: j */
    private boolean m2865j(int i10) {
        if (AbstractC0674i.m2963b(this.f2438d) != 0.0f) {
            this.f2438d.onAbsorb(i10);
        } else if (AbstractC0674i.m2963b(this.f2439e) != 0.0f) {
            this.f2439e.onAbsorb(-i10);
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private void m2866p() {
        this.f2444j = false;
        m2853G();
        m2879S(0);
        this.f2438d.onRelease();
        this.f2439e.onRelease();
    }

    /* renamed from: r */
    private View m2867r(boolean z10, int i10, int i11) {
        boolean z11;
        boolean z12;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 < top && bottom < i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (view == null) {
                    view = view2;
                    z13 = z11;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z13 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m2868v(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i11 < childAt.getTop() - scrollY || i11 >= childAt.getBottom() - scrollY || i10 < childAt.getLeft() || i10 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m2869w() {
        VelocityTracker velocityTracker = this.f2445k;
        if (velocityTracker == null) {
            this.f2445k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m2870x() {
        this.f2437c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2448n = viewConfiguration.getScaledTouchSlop();
        this.f2449o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2450p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m2871y() {
        if (this.f2445k == null) {
            this.f2445k = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m2872z(View view) {
        return !m2850B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m2873E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m2887u(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2437c
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2873E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean m2874F(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        if (z10) {
            this.f2436b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2436b;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2436b.top = getScrollY() - height;
            Rect rect2 = this.f2436b;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2436b;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return m2856J(i10, i11, i12);
    }

    /* renamed from: M */
    public final void m2875M(int i10, int i11) {
        m2859N(i10, i11, OpenEffectBridge.DEFAULT_TRAN_DUR_ANIM, false);
    }

    /* renamed from: O */
    void m2876O(int i10, int i11, int i12, boolean z10) {
        m2859N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* renamed from: P */
    void m2877P(int i10, int i11, boolean z10) {
        m2876O(i10, i11, OpenEffectBridge.DEFAULT_TRAN_DUR_ANIM, z10);
    }

    /* renamed from: Q */
    public boolean m2878Q(int i10, int i11) {
        return this.f2458x.m2453q(i10, i11);
    }

    /* renamed from: S */
    public void m2879S(int i10) {
        this.f2458x.m2455s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m2880b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m2850B(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f2436b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2436b);
            m2864i(m2881f(this.f2436b));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2864i(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && m2872z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2437c.isFinished()) {
            return;
        }
        this.f2437c.computeScrollOffset();
        int currY = this.f2437c.getCurrY();
        int i10 = currY - this.f2455u;
        this.f2455u = currY;
        int[] iArr = this.f2453s;
        boolean z10 = false;
        iArr[1] = 0;
        m2882g(0, i10, iArr, null, 1);
        int i11 = i10 - this.f2453s[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            m2873E(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f2453s;
            iArr2[1] = 0;
            m2883h(0, scrollY2, 0, i12, this.f2452r, 1, iArr2);
            i11 = i12 - this.f2453s[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f2438d.isFinished()) {
                        this.f2438d.onAbsorb((int) this.f2437c.getCurrVelocity());
                    }
                } else if (this.f2439e.isFinished()) {
                    this.f2439e.onAbsorb((int) this.f2437c.getCurrVelocity());
                }
            }
            m2861a();
        }
        if (!this.f2437c.isFinished()) {
            AbstractC0616q0.m2618e0(this);
        } else {
            m2879S(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m2884q(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2458x.m2441a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2458x.m2442b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return m2882g(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2458x.m2446f(i10, i11, i12, i13, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r7 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.f2438d
            boolean r1 = r1.isFinished()
            r2 = 0
            r3 = 21
            if (r1 != 0) goto L6d
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r2, r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L2f
            boolean r8 = androidx.core.widget.AbstractC0682q.m2978a(r10)
            if (r8 == 0) goto L2d
            goto L2f
        L2d:
            r8 = 0
            goto L3e
        L2f:
            int r8 = r10.getPaddingLeft()
            int r9 = r10.getPaddingRight()
            int r8 = r8 + r9
            int r4 = r4 - r8
            int r8 = r10.getPaddingLeft()
            int r8 = r8 + r2
        L3e:
            if (r7 < r3) goto L55
            boolean r7 = androidx.core.widget.AbstractC0682q.m2978a(r10)
            if (r7 == 0) goto L55
            int r7 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r7 = r7 + r9
            int r5 = r5 - r7
            int r7 = r10.getPaddingTop()
            int r6 = r6 + r7
        L55:
            float r7 = (float) r8
            float r6 = (float) r6
            r11.translate(r7, r6)
            android.widget.EdgeEffect r6 = r10.f2438d
            r6.setSize(r4, r5)
            android.widget.EdgeEffect r4 = r10.f2438d
            boolean r4 = r4.draw(r11)
            if (r4 == 0) goto L6a
            androidx.core.view.AbstractC0616q0.m2618e0(r10)
        L6a:
            r11.restoreToCount(r1)
        L6d:
            android.widget.EdgeEffect r1 = r10.f2439e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lda
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L94
            boolean r7 = androidx.core.widget.AbstractC0682q.m2978a(r10)
            if (r7 == 0) goto La3
        L94:
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r10.getPaddingLeft()
            int r2 = r2 + r7
        La3:
            if (r6 < r3) goto Lba
            boolean r3 = androidx.core.widget.AbstractC0682q.m2978a(r10)
            if (r3 == 0) goto Lba
            int r3 = r10.getPaddingTop()
            int r6 = r10.getPaddingBottom()
            int r3 = r3 + r6
            int r5 = r5 - r3
            int r3 = r10.getPaddingBottom()
            int r0 = r0 - r3
        Lba:
            int r2 = r2 - r4
            float r2 = (float) r2
            float r0 = (float) r0
            r11.translate(r2, r0)
            float r0 = (float) r4
            r2 = 0
            r3 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r3, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2439e
            r0.setSize(r4, r5)
            android.widget.EdgeEffect r0 = r10.f2439e
            boolean r0 = r0.draw(r11)
            if (r0 == 0) goto Ld7
            androidx.core.view.AbstractC0616q0.m2618e0(r10)
        Ld7:
            r11.restoreToCount(r1)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.draw(android.graphics.Canvas):void");
    }

    @Override // androidx.core.view.InterfaceC0576g0
    /* renamed from: e */
    public void mo1450e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m2851C(i13, i14, iArr);
    }

    /* renamed from: f */
    protected int m2881f(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    /* renamed from: g */
    public boolean m2882g(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2458x.m2444d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2457w.m2468a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void m2883h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2458x.m2445e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m2887u(0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0564d0
    public boolean isNestedScrollingEnabled() {
        return this.f2458x.m2450m();
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: k */
    public void mo1456k(View view, int i10, int i11, int i12, int i13, int i14) {
        m2851C(i13, i14, null);
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: l */
    public boolean mo1457l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: m */
    public void mo1458m(View view, View view2, int i10, int i11) {
        this.f2457w.m2470c(view, view2, i10, i11);
        m2878Q(2, i11);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: n */
    public void mo1459n(View view, int i10) {
        this.f2457w.m2471d(view, i10);
        m2879S(i10);
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: o */
    public void mo1460o(View view, int i10, int i11, int[] iArr, int i12) {
        m2882g(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2442h = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2444j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i10 = scrollY - verticalScrollFactorCompat;
                if (i10 < 0) {
                    scrollRange = 0;
                } else if (i10 <= scrollRange) {
                    scrollRange = i10;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2444j) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            m2852D(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f2451q;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2440f) > this.f2448n && (2 & getNestedScrollAxes()) == 0) {
                                this.f2444j = true;
                                this.f2440f = y10;
                                m2871y();
                                this.f2445k.addMovement(motionEvent);
                                this.f2454t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f2444j = false;
            this.f2451q = -1;
            m2853G();
            if (this.f2437c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AbstractC0616q0.m2618e0(this);
            }
            m2879S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!m2868v((int) motionEvent.getX(), y11)) {
                if (!m2860R(motionEvent) && this.f2437c.isFinished()) {
                    z10 = false;
                }
                this.f2444j = z10;
                m2853G();
            } else {
                this.f2440f = y11;
                this.f2451q = motionEvent.getPointerId(0);
                m2869w();
                this.f2445k.addMovement(motionEvent);
                this.f2437c.computeScrollOffset();
                if (!m2860R(motionEvent) && this.f2437c.isFinished()) {
                    z10 = false;
                }
                this.f2444j = z10;
                m2878Q(2, 0);
            }
        }
        return this.f2444j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2441g = false;
        View view = this.f2443i;
        if (view != null && m2849A(view, this)) {
            m2857K(this.f2443i);
        }
        this.f2443i = null;
        if (!this.f2442h) {
            if (this.f2456v != null) {
                scrollTo(getScrollX(), this.f2456v.f2461a);
                this.f2456v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m2863d = m2863d(scrollY, paddingTop, i14);
            if (m2863d != scrollY) {
                scrollTo(getScrollX(), m2863d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2442h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2446l && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!z10) {
            dispatchNestedFling(0.0f, f11, true);
            m2885s((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1460o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m2851C(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1458m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || m2872z(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0657c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0657c c0657c = (C0657c) parcelable;
        super.onRestoreInstanceState(c0657c.getSuperState());
        this.f2456v = c0657c;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0657c c0657c = new C0657c(super.onSaveInstanceState());
        c0657c.f2461a = getScrollY();
        return c0657c;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0656b interfaceC0656b = this.f2460z;
        if (interfaceC0656b != null) {
            interfaceC0656b.mo1021a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2850B(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f2436b);
            offsetDescendantRectToMyCoords(findFocus, this.f2436b);
            m2864i(m2881f(this.f2436b));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1457l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onStopNestedScroll(View view) {
        mo1459n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean m2884q(KeyEvent keyEvent) {
        this.f2436b.setEmpty();
        int i10 = 130;
        if (!m2862c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    return false;
                }
                if (keyEvent.isShiftPressed()) {
                    i10 = 33;
                }
                m2874F(i10);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return m2880b(130);
            }
            return m2886t(130);
        }
        if (!keyEvent.isAltPressed()) {
            return m2880b(33);
        }
        return m2886t(33);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2441g) {
            m2857K(view2);
        } else {
            this.f2443i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2858L(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            m2853G();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2441g = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void m2885s(int i10) {
        if (getChildCount() > 0) {
            this.f2437c.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2855I(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m2863d = m2863d(i10, width, width2);
            int m2863d2 = m2863d(i11, height, height2);
            if (m2863d != getScrollX() || m2863d2 != getScrollY()) {
                super.scrollTo(m2863d, m2863d2);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2446l) {
            this.f2446l = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2458x.m2451n(z10);
    }

    public void setOnScrollChangeListener(InterfaceC0656b interfaceC0656b) {
        this.f2460z = interfaceC0656b;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2447m = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return m2878Q(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0564d0
    public void stopNestedScroll() {
        m2879S(0);
    }

    /* renamed from: t */
    public boolean m2886t(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f2436b;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2436b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2436b;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2436b;
        return m2856J(i10, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean m2887u(int i10) {
        return this.f2458x.m2449l(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2436b = new Rect();
        this.f2441g = true;
        this.f2442h = false;
        this.f2443i = null;
        this.f2444j = false;
        this.f2447m = true;
        this.f2451q = -1;
        this.f2452r = new int[2];
        this.f2453s = new int[2];
        this.f2438d = AbstractC0674i.m2962a(context, attributeSet);
        this.f2439e = AbstractC0674i.m2962a(context, attributeSet);
        m2870x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2434B, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2457w = new C0584i0(this);
        this.f2458x = new C0568e0(this);
        setNestedScrollingEnabled(true);
        AbstractC0616q0.m2636n0(this, f2433A);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
