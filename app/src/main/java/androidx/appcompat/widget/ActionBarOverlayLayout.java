package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0584i0;
import androidx.core.view.C0609o1;
import androidx.core.view.InterfaceC0572f0;
import androidx.core.view.InterfaceC0576g0;
import androidx.core.view.InterfaceC0580h0;
import p276p.C6134g;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0413k1, InterfaceC0580h0, InterfaceC0572f0, InterfaceC0576g0 {

    /* renamed from: F */
    static final int[] f1453F = {R$attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    ViewPropertyAnimator f1454A;

    /* renamed from: B */
    final AnimatorListenerAdapter f1455B;

    /* renamed from: C */
    private final Runnable f1456C;

    /* renamed from: D */
    private final Runnable f1457D;

    /* renamed from: E */
    private final C0584i0 f1458E;

    /* renamed from: a */
    private int f1459a;

    /* renamed from: b */
    private int f1460b;

    /* renamed from: c */
    private ContentFrameLayout f1461c;

    /* renamed from: d */
    ActionBarContainer f1462d;

    /* renamed from: e */
    private InterfaceC0417l1 f1463e;

    /* renamed from: f */
    private Drawable f1464f;

    /* renamed from: g */
    private boolean f1465g;

    /* renamed from: h */
    private boolean f1466h;

    /* renamed from: i */
    private boolean f1467i;

    /* renamed from: j */
    private boolean f1468j;

    /* renamed from: k */
    boolean f1469k;

    /* renamed from: l */
    private int f1470l;

    /* renamed from: m */
    private int f1471m;

    /* renamed from: n */
    private final Rect f1472n;

    /* renamed from: o */
    private final Rect f1473o;

    /* renamed from: p */
    private final Rect f1474p;

    /* renamed from: q */
    private final Rect f1475q;

    /* renamed from: r */
    private final Rect f1476r;

    /* renamed from: s */
    private final Rect f1477s;

    /* renamed from: t */
    private final Rect f1478t;

    /* renamed from: u */
    private C0609o1 f1479u;

    /* renamed from: v */
    private C0609o1 f1480v;

    /* renamed from: w */
    private C0609o1 f1481w;

    /* renamed from: x */
    private C0609o1 f1482x;

    /* renamed from: y */
    private InterfaceC0338d f1483y;

    /* renamed from: z */
    private OverScroller f1484z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0335a extends AnimatorListenerAdapter {
        C0335a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1454A = null;
            actionBarOverlayLayout.f1469k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1454A = null;
            actionBarOverlayLayout.f1469k = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0336b implements Runnable {
        RunnableC0336b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1463u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1454A = actionBarOverlayLayout.f1462d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1455B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0337c implements Runnable {
        RunnableC0337c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1463u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1454A = actionBarOverlayLayout.f1462d.animate().translationY(-ActionBarOverlayLayout.this.f1462d.getHeight()).setListener(ActionBarOverlayLayout.this.f1455B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0338d {
        /* renamed from: a */
        void mo1233a();

        /* renamed from: b */
        void mo1234b();

        /* renamed from: c */
        void mo1235c(boolean z10);

        /* renamed from: d */
        void mo1236d();

        /* renamed from: e */
        void mo1237e();

        /* renamed from: f */
        void mo1238f(int i10);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0339e extends ViewGroup.MarginLayoutParams {
        public C0339e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0339e(int i10, int i11) {
            super(i10, i11);
        }

        public C0339e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1460b = 0;
        this.f1472n = new Rect();
        this.f1473o = new Rect();
        this.f1474p = new Rect();
        this.f1475q = new Rect();
        this.f1476r = new Rect();
        this.f1477s = new Rect();
        this.f1478t = new Rect();
        C0609o1 c0609o1 = C0609o1.f2360b;
        this.f1479u = c0609o1;
        this.f1480v = c0609o1;
        this.f1481w = c0609o1;
        this.f1482x = c0609o1;
        this.f1455B = new C0335a();
        this.f1456C = new RunnableC0336b();
        this.f1457D = new RunnableC0337c();
        m1443v(context);
        this.f1458E = new C0584i0(this);
    }

    /* renamed from: A */
    private void m1438A() {
        m1463u();
        this.f1456C.run();
    }

    /* renamed from: B */
    private boolean m1439B(float f10) {
        this.f1484z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1484z.getFinalY() > this.f1462d.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m1440p() {
        m1463u();
        this.f1457D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m1441q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0339e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m1441q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private InterfaceC0417l1 m1442t(View view) {
        if (view instanceof InterfaceC0417l1) {
            return (InterfaceC0417l1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1443v(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1453F);
        boolean z11 = false;
        this.f1459a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1464f = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f1465g = z11;
        this.f1484z = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1444x() {
        m1463u();
        postDelayed(this.f1457D, 600L);
    }

    /* renamed from: y */
    private void m1445y() {
        m1463u();
        postDelayed(this.f1456C, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: a */
    public void mo1446a(Menu menu, InterfaceC0330j.a aVar) {
        m1465z();
        this.f1463e.mo1781a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: b */
    public boolean mo1447b() {
        m1465z();
        return this.f1463e.mo1782b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: c */
    public void mo1448c() {
        m1465z();
        this.f1463e.mo1783c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0339e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: d */
    public boolean mo1449d() {
        m1465z();
        return this.f1463e.mo1784d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f1464f != null && !this.f1465g) {
            if (this.f1462d.getVisibility() == 0) {
                i10 = (int) (this.f1462d.getBottom() + this.f1462d.getTranslationY() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f1464f.setBounds(0, i10, getWidth(), this.f1464f.getIntrinsicHeight() + i10);
            this.f1464f.draw(canvas);
        }
    }

    @Override // androidx.core.view.InterfaceC0576g0
    /* renamed from: e */
    public void mo1450e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo1456k(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: f */
    public boolean mo1451f() {
        m1465z();
        return this.f1463e.mo1786f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m1465z();
        boolean m1441q = m1441q(this.f1462d, rect, true, true, false, true);
        this.f1475q.set(rect);
        AbstractC0466x2.m2026a(this, this.f1475q, this.f1472n);
        if (!this.f1476r.equals(this.f1475q)) {
            this.f1476r.set(this.f1475q);
            m1441q = true;
        }
        if (!this.f1473o.equals(this.f1472n)) {
            this.f1473o.set(this.f1472n);
            m1441q = true;
        }
        if (m1441q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: g */
    public boolean mo1452g() {
        m1465z();
        return this.f1463e.mo1787g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1462d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1458E.m2468a();
    }

    public CharSequence getTitle() {
        m1465z();
        return this.f1463e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: h */
    public boolean mo1453h() {
        m1465z();
        return this.f1463e.mo1788h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: i */
    public void mo1454i(int i10) {
        m1465z();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f1463e.mo1801u();
            return;
        }
        this.f1463e.mo1800t();
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    /* renamed from: j */
    public void mo1455j() {
        m1465z();
        this.f1463e.mo1789i();
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: k */
    public void mo1456k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: l */
    public boolean mo1457l(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: m */
    public void mo1458m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: n */
    public void mo1459n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0572f0
    /* renamed from: o */
    public void mo1460o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1465z();
        C0609o1 m2510v = C0609o1.m2510v(windowInsets, this);
        boolean m1441q = m1441q(this.f1462d, new Rect(m2510v.m2519i(), m2510v.m2521k(), m2510v.m2520j(), m2510v.m2518h()), true, true, false, true);
        AbstractC0616q0.m2621g(this, m2510v, this.f1472n);
        Rect rect = this.f1472n;
        C0609o1 m2522l = m2510v.m2522l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1479u = m2522l;
        boolean z10 = true;
        if (!this.f1480v.equals(m2522l)) {
            this.f1480v = this.f1479u;
            m1441q = true;
        }
        if (!this.f1473o.equals(this.f1472n)) {
            this.f1473o.set(this.f1472n);
        } else {
            z10 = m1441q;
        }
        if (z10) {
            requestLayout();
        }
        return m2510v.m2511a().m2513c().m2512b().m2529t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1443v(getContext());
        AbstractC0616q0.m2630k0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1463u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0339e c0339e = (C0339e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0339e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0339e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        m1465z();
        measureChildWithMargins(this.f1462d, i10, 0, i11, 0);
        C0339e c0339e = (C0339e) this.f1462d.getLayoutParams();
        int max = Math.max(0, this.f1462d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0339e).leftMargin + ((ViewGroup.MarginLayoutParams) c0339e).rightMargin);
        int max2 = Math.max(0, this.f1462d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0339e).topMargin + ((ViewGroup.MarginLayoutParams) c0339e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1462d.getMeasuredState());
        if ((AbstractC0616q0.m2593K(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f1459a;
            if (this.f1467i && this.f1462d.getTabContainer() != null) {
                measuredHeight += this.f1459a;
            }
        } else {
            measuredHeight = this.f1462d.getVisibility() != 8 ? this.f1462d.getMeasuredHeight() : 0;
        }
        this.f1474p.set(this.f1472n);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            this.f1481w = this.f1479u;
        } else {
            this.f1477s.set(this.f1475q);
        }
        if (!this.f1466h && !z10) {
            Rect rect = this.f1474p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i12 >= 21) {
                this.f1481w = this.f1481w.m2522l(0, measuredHeight, 0, 0);
            }
        } else if (i12 >= 21) {
            this.f1481w = new C0609o1.b(this.f1481w).m2533c(C6134g.m24434b(this.f1481w.m2519i(), this.f1481w.m2521k() + measuredHeight, this.f1481w.m2520j(), this.f1481w.m2518h() + 0)).m2531a();
        } else {
            Rect rect2 = this.f1477s;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m1441q(this.f1461c, this.f1474p, true, true, true, true);
        if (i12 >= 21 && !this.f1482x.equals(this.f1481w)) {
            C0609o1 c0609o1 = this.f1481w;
            this.f1482x = c0609o1;
            AbstractC0616q0.m2623h(this.f1461c, c0609o1);
        } else if (i12 < 21 && !this.f1478t.equals(this.f1477s)) {
            this.f1478t.set(this.f1477s);
            this.f1461c.m1491a(this.f1477s);
        }
        measureChildWithMargins(this.f1461c, i10, 0, i11, 0);
        C0339e c0339e2 = (C0339e) this.f1461c.getLayoutParams();
        int max3 = Math.max(max, this.f1461c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0339e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0339e2).rightMargin);
        int max4 = Math.max(max2, this.f1461c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0339e2).topMargin + ((ViewGroup.MarginLayoutParams) c0339e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1461c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f1468j && z10) {
            if (m1439B(f11)) {
                m1440p();
            } else {
                m1438A();
            }
            this.f1469k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1470l + i11;
        this.f1470l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1458E.m2469b(view, view2, i10);
        this.f1470l = getActionBarHideOffset();
        m1463u();
        InterfaceC0338d interfaceC0338d = this.f1483y;
        if (interfaceC0338d != null) {
            interfaceC0338d.mo1237e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f1462d.getVisibility() == 0) {
            return this.f1468j;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0580h0
    public void onStopNestedScroll(View view) {
        if (this.f1468j && !this.f1469k) {
            if (this.f1470l <= this.f1462d.getHeight()) {
                m1445y();
            } else {
                m1444x();
            }
        }
        InterfaceC0338d interfaceC0338d = this.f1483y;
        if (interfaceC0338d != null) {
            interfaceC0338d.mo1234b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        m1465z();
        int i11 = this.f1471m ^ i10;
        this.f1471m = i10;
        boolean z11 = false;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        InterfaceC0338d interfaceC0338d = this.f1483y;
        if (interfaceC0338d != null) {
            interfaceC0338d.mo1235c(!z11);
            if (!z10 && z11) {
                this.f1483y.mo1236d();
            } else {
                this.f1483y.mo1233a();
            }
        }
        if ((i11 & 256) != 0 && this.f1483y != null) {
            AbstractC0616q0.m2630k0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1460b = i10;
        InterfaceC0338d interfaceC0338d = this.f1483y;
        if (interfaceC0338d != null) {
            interfaceC0338d.mo1238f(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0339e generateDefaultLayoutParams() {
        return new C0339e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0339e generateLayoutParams(AttributeSet attributeSet) {
        return new C0339e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        m1463u();
        this.f1462d.setTranslationY(-Math.max(0, Math.min(i10, this.f1462d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0338d interfaceC0338d) {
        this.f1483y = interfaceC0338d;
        if (getWindowToken() != null) {
            this.f1483y.mo1238f(this.f1460b);
            int i10 = this.f1471m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                AbstractC0616q0.m2630k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1467i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1468j) {
            this.f1468j = z10;
            if (!z10) {
                m1463u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        m1465z();
        this.f1463e.setIcon(i10);
    }

    public void setLogo(int i10) {
        m1465z();
        this.f1463e.mo1793m(i10);
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f1466h = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1465g = z11;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    public void setWindowCallback(Window.Callback callback) {
        m1465z();
        this.f1463e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0413k1
    public void setWindowTitle(CharSequence charSequence) {
        m1465z();
        this.f1463e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    void m1463u() {
        removeCallbacks(this.f1456C);
        removeCallbacks(this.f1457D);
        ViewPropertyAnimator viewPropertyAnimator = this.f1454A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean m1464w() {
        return this.f1466h;
    }

    /* renamed from: z */
    void m1465z() {
        if (this.f1461c == null) {
            this.f1461c = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.f1462d = (ActionBarContainer) findViewById(R$id.action_bar_container);
            this.f1463e = m1442t(findViewById(R$id.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0339e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1465z();
        this.f1463e.setIcon(drawable);
    }
}
