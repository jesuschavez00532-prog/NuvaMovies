package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import anet.channel.bytes.C0905a;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.p077uc.crashsdk.export.LogType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p020b0.AbstractC1031a;
import p032c0.C1336c;
import p282p5.AbstractC6216c;
import p320s.AbstractC6605a;
import p326s5.C6686i;
import p326s5.C6690m;
import p389x.C7458h0;
import p389x.InterfaceC7468m0;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0482b {

    /* renamed from: K */
    private static final int f9433K = R$style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f9434A;

    /* renamed from: B */
    WeakReference f9435B;

    /* renamed from: C */
    WeakReference f9436C;

    /* renamed from: D */
    private final ArrayList f9437D;

    /* renamed from: E */
    private VelocityTracker f9438E;

    /* renamed from: F */
    int f9439F;

    /* renamed from: G */
    private int f9440G;

    /* renamed from: H */
    boolean f9441H;

    /* renamed from: I */
    private Map f9442I;

    /* renamed from: J */
    private final C1336c.c f9443J;

    /* renamed from: a */
    private int f9444a;

    /* renamed from: b */
    private boolean f9445b;

    /* renamed from: c */
    private float f9446c;

    /* renamed from: d */
    private int f9447d;

    /* renamed from: e */
    private boolean f9448e;

    /* renamed from: f */
    private int f9449f;

    /* renamed from: g */
    private boolean f9450g;

    /* renamed from: h */
    private C6686i f9451h;

    /* renamed from: i */
    private C6690m f9452i;

    /* renamed from: j */
    private boolean f9453j;

    /* renamed from: k */
    private RunnableC2534f f9454k;

    /* renamed from: l */
    private ValueAnimator f9455l;

    /* renamed from: m */
    int f9456m;

    /* renamed from: n */
    int f9457n;

    /* renamed from: o */
    int f9458o;

    /* renamed from: p */
    float f9459p;

    /* renamed from: q */
    int f9460q;

    /* renamed from: r */
    float f9461r;

    /* renamed from: s */
    boolean f9462s;

    /* renamed from: t */
    private boolean f9463t;

    /* renamed from: u */
    int f9464u;

    /* renamed from: v */
    C1336c f9465v;

    /* renamed from: w */
    private boolean f9466w;

    /* renamed from: x */
    private int f9467x;

    /* renamed from: y */
    private boolean f9468y;

    /* renamed from: z */
    int f9469z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    public class RunnableC2529a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f9470a;

        /* renamed from: b */
        final /* synthetic */ int f9471b;

        RunnableC2529a(View view, int i10) {
            this.f9470a = view;
            this.f9471b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m10221f0(this.f9470a, this.f9471b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public class C2530b implements ValueAnimator.AnimatorUpdateListener {
        C2530b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f9451h != null) {
                BottomSheetBehavior.this.f9451h.m26097S(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    class C2531c extends C1336c.c {
        C2531c() {
        }

        @Override // p032c0.C1336c.c
        /* renamed from: a */
        public int mo6083a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // p032c0.C1336c.c
        /* renamed from: b */
        public int mo6084b(View view, int i10, int i11) {
            int i12;
            int m10201R = BottomSheetBehavior.this.m10201R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f9462s) {
                i12 = bottomSheetBehavior.f9434A;
            } else {
                i12 = bottomSheetBehavior.f9460q;
            }
            return AbstractC6605a.m25818b(i10, m10201R, i12);
        }

        @Override // p032c0.C1336c.c
        /* renamed from: e */
        public int mo6087e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f9462s) {
                return bottomSheetBehavior.f9434A;
            }
            return bottomSheetBehavior.f9460q;
        }

        @Override // p032c0.C1336c.c
        /* renamed from: j */
        public void mo6092j(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior.this.m10220e0(1);
            }
        }

        @Override // p032c0.C1336c.c
        /* renamed from: k */
        public void mo6093k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.m10209P(i11);
        }

        @Override // p032c0.C1336c.c
        /* renamed from: l */
        public void mo6094l(View view, float f10, float f11) {
            int i10;
            int i11 = 6;
            if (f11 < 0.0f) {
                if (BottomSheetBehavior.this.f9445b) {
                    i10 = BottomSheetBehavior.this.f9457n;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i12 = bottomSheetBehavior.f9458o;
                    if (top > i12) {
                        i10 = i12;
                    } else {
                        i10 = bottomSheetBehavior.f9456m;
                    }
                }
                i11 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f9462s && bottomSheetBehavior2.m10222h0(view, f11) && (view.getTop() > BottomSheetBehavior.this.f9460q || Math.abs(f10) < Math.abs(f11))) {
                    i10 = BottomSheetBehavior.this.f9434A;
                    i11 = 5;
                } else if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                    if (BottomSheetBehavior.this.f9445b) {
                        i10 = BottomSheetBehavior.this.f9460q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f9458o) < Math.abs(top2 - BottomSheetBehavior.this.f9460q)) {
                            i10 = BottomSheetBehavior.this.f9458o;
                        } else {
                            i10 = BottomSheetBehavior.this.f9460q;
                        }
                    }
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f9445b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f9457n) < Math.abs(top3 - BottomSheetBehavior.this.f9460q)) {
                            i10 = BottomSheetBehavior.this.f9457n;
                            i11 = 3;
                        } else {
                            i10 = BottomSheetBehavior.this.f9460q;
                            i11 = 4;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior3.f9458o;
                        if (top3 < i13) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f9460q)) {
                                i10 = BottomSheetBehavior.this.f9456m;
                                i11 = 3;
                            } else {
                                i10 = BottomSheetBehavior.this.f9458o;
                            }
                        } else if (Math.abs(top3 - i13) < Math.abs(top3 - BottomSheetBehavior.this.f9460q)) {
                            i10 = BottomSheetBehavior.this.f9458o;
                        } else {
                            i10 = BottomSheetBehavior.this.f9460q;
                            i11 = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior.this.m10223i0(view, i11, i10, true);
        }

        @Override // p032c0.C1336c.c
        /* renamed from: m */
        public boolean mo6095m(View view, int i10) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f9464u;
            if (i11 == 1 || bottomSheetBehavior.f9441H) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f9439F == i10) {
                WeakReference weakReference = bottomSheetBehavior.f9436C;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference weakReference2 = BottomSheetBehavior.this.f9435B;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    public class C2532d implements InterfaceC7468m0 {

        /* renamed from: a */
        final /* synthetic */ int f9475a;

        C2532d(int i10) {
            this.f9475a = i10;
        }

        @Override // p389x.InterfaceC7468m0
        public boolean perform(View view, InterfaceC7468m0.a aVar) {
            BottomSheetBehavior.this.m10219d0(this.f9475a);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes.dex */
    public class RunnableC2534f implements Runnable {

        /* renamed from: a */
        private final View f9482a;

        /* renamed from: b */
        private boolean f9483b;

        /* renamed from: c */
        int f9484c;

        RunnableC2534f(View view, int i10) {
            this.f9482a = view;
            this.f9484c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1336c c1336c = BottomSheetBehavior.this.f9465v;
            if (c1336c != null && c1336c.m6076k(true)) {
                AbstractC0616q0.m2620f0(this.f9482a, this);
            } else {
                BottomSheetBehavior.this.m10220e0(this.f9484c);
            }
            this.f9483b = false;
        }
    }

    public BottomSheetBehavior() {
        this.f9444a = 0;
        this.f9445b = true;
        this.f9454k = null;
        this.f9459p = 0.5f;
        this.f9461r = -1.0f;
        this.f9464u = 4;
        this.f9437D = new ArrayList();
        this.f9443J = new C2531c();
    }

    /* renamed from: J */
    private void m10195J(View view, C7458h0.a aVar, int i10) {
        AbstractC0616q0.m2628j0(view, aVar, null, new C2532d(i10));
    }

    /* renamed from: K */
    private void m10196K() {
        int i10;
        if (this.f9448e) {
            i10 = Math.max(this.f9449f, this.f9434A - ((this.f9469z * 9) / 16));
        } else {
            i10 = this.f9447d;
        }
        if (this.f9445b) {
            this.f9460q = Math.max(this.f9434A - i10, this.f9457n);
        } else {
            this.f9460q = this.f9434A - i10;
        }
    }

    /* renamed from: L */
    private void m10197L() {
        this.f9458o = (int) (this.f9434A * (1.0f - this.f9459p));
    }

    /* renamed from: M */
    private void m10198M(Context context, AttributeSet attributeSet, boolean z10) {
        m10199N(context, attributeSet, z10, null);
    }

    /* renamed from: N */
    private void m10199N(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f9450g) {
            this.f9452i = C6690m.m26127e(context, attributeSet, R$attr.bottomSheetStyle, f9433K).m26165m();
            C6686i c6686i = new C6686i(this.f9452i);
            this.f9451h = c6686i;
            c6686i.m26092J(context);
            if (z10 && colorStateList != null) {
                this.f9451h.m26096R(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f9451h.setTint(typedValue.data);
        }
    }

    /* renamed from: O */
    private void m10200O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9455l = ofFloat;
        ofFloat.setDuration(500L);
        this.f9455l.addUpdateListener(new C2530b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public int m10201R() {
        if (this.f9445b) {
            return this.f9457n;
        }
        return this.f9456m;
    }

    /* renamed from: S */
    private float m10202S() {
        VelocityTracker velocityTracker = this.f9438E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f9446c);
        return this.f9438E.getYVelocity(this.f9439F);
    }

    /* renamed from: T */
    private void m10203T() {
        this.f9439F = -1;
        VelocityTracker velocityTracker = this.f9438E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9438E = null;
        }
    }

    /* renamed from: U */
    private void m10204U(C2533e c2533e) {
        int i10 = this.f9444a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f9447d = c2533e.f9478d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f9445b = c2533e.f9479e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f9462s = c2533e.f9480f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f9463t = c2533e.f9481g;
        }
    }

    /* renamed from: g0 */
    private void m10205g0(int i10) {
        View view = (View) this.f9435B.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && AbstractC0616q0.m2599Q(view)) {
            view.post(new RunnableC2529a(view, i10));
        } else {
            m10221f0(view, i10);
        }
    }

    /* renamed from: j0 */
    private void m10206j0() {
        View view;
        WeakReference weakReference = this.f9435B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0616q0.m2624h0(view, C0905a.MAX_POOL_SIZE);
        AbstractC0616q0.m2624h0(view, 262144);
        AbstractC0616q0.m2624h0(view, LogType.ANR);
        if (this.f9462s && this.f9464u != 5) {
            m10195J(view, C7458h0.a.f27530y, 5);
        }
        int i10 = this.f9464u;
        int i11 = 6;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 == 6) {
                    m10195J(view, C7458h0.a.f27529x, 4);
                    m10195J(view, C7458h0.a.f27528w, 3);
                    return;
                }
                return;
            }
            if (this.f9445b) {
                i11 = 3;
            }
            m10195J(view, C7458h0.a.f27528w, i11);
            return;
        }
        if (this.f9445b) {
            i11 = 4;
        }
        m10195J(view, C7458h0.a.f27529x, i11);
    }

    /* renamed from: k0 */
    private void m10207k0(int i10) {
        boolean z10;
        ValueAnimator valueAnimator;
        float f10;
        if (i10 == 2) {
            return;
        }
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9453j != z10) {
            this.f9453j = z10;
            if (this.f9451h != null && (valueAnimator = this.f9455l) != null) {
                if (valueAnimator.isRunning()) {
                    this.f9455l.reverse();
                    return;
                }
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                this.f9455l.setFloatValues(1.0f - f10, f10);
                this.f9455l.start();
            }
        }
    }

    /* renamed from: l0 */
    private void m10208l0(boolean z10) {
        WeakReference weakReference = this.f9435B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f9442I == null) {
                this.f9442I = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.f9435B.get()) {
                if (!z10) {
                    Map map = this.f9442I;
                    if (map != null && map.containsKey(childAt)) {
                        AbstractC0616q0.m2654w0(childAt, ((Integer) this.f9442I.get(childAt)).intValue());
                    }
                } else {
                    this.f9442I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    AbstractC0616q0.m2654w0(childAt, 4);
                }
            }
        }
        if (!z10) {
            this.f9442I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: A */
    public boolean mo2107A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f9467x = 0;
        this.f9468y = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: C */
    public void mo2109C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        int i11;
        int i12 = 3;
        if (view.getTop() == m10201R()) {
            m10220e0(3);
            return;
        }
        WeakReference weakReference = this.f9436C;
        if (weakReference != null && view2 == weakReference.get() && this.f9468y) {
            if (this.f9467x > 0) {
                i11 = m10201R();
            } else if (this.f9462s && m10222h0(view, m10202S())) {
                i11 = this.f9434A;
                i12 = 5;
            } else if (this.f9467x == 0) {
                int top = view.getTop();
                if (this.f9445b) {
                    if (Math.abs(top - this.f9457n) < Math.abs(top - this.f9460q)) {
                        i11 = this.f9457n;
                    } else {
                        i11 = this.f9460q;
                        i12 = 4;
                    }
                } else {
                    int i13 = this.f9458o;
                    if (top < i13) {
                        if (top < Math.abs(top - this.f9460q)) {
                            i11 = this.f9456m;
                        } else {
                            i11 = this.f9458o;
                        }
                    } else if (Math.abs(top - i13) < Math.abs(top - this.f9460q)) {
                        i11 = this.f9458o;
                    } else {
                        i11 = this.f9460q;
                        i12 = 4;
                    }
                    i12 = 6;
                }
            } else {
                if (this.f9445b) {
                    i11 = this.f9460q;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f9458o) < Math.abs(top2 - this.f9460q)) {
                        i11 = this.f9458o;
                        i12 = 6;
                    } else {
                        i11 = this.f9460q;
                    }
                }
                i12 = 4;
            }
            m10223i0(view, i12, i11, false);
            this.f9468y = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: D */
    public boolean mo2110D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9464u == 1 && actionMasked == 0) {
            return true;
        }
        C1336c c1336c = this.f9465v;
        if (c1336c != null) {
            c1336c.m6082z(motionEvent);
        }
        if (actionMasked == 0) {
            m10203T();
        }
        if (this.f9438E == null) {
            this.f9438E = VelocityTracker.obtain();
        }
        this.f9438E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f9466w && Math.abs(this.f9440G - motionEvent.getY()) > this.f9465v.m6078u()) {
            this.f9465v.m6075b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f9466w;
    }

    /* renamed from: P */
    void m10209P(int i10) {
        if (((View) this.f9435B.get()) != null && !this.f9437D.isEmpty()) {
            if (i10 <= this.f9460q) {
                m10201R();
            }
            if (this.f9437D.size() > 0) {
                AbstractC0272b.m941a(this.f9437D.get(0));
                throw null;
            }
        }
    }

    /* renamed from: Q */
    View m10210Q(View view) {
        if (AbstractC0616q0.m2601S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View m10210Q = m10210Q(viewGroup.getChildAt(i10));
                if (m10210Q != null) {
                    return m10210Q;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: V */
    public void m10211V(int i10) {
        if (i10 >= 0) {
            this.f9456m = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: W */
    public void m10212W(boolean z10) {
        int i10;
        if (this.f9445b == z10) {
            return;
        }
        this.f9445b = z10;
        if (this.f9435B != null) {
            m10196K();
        }
        if (this.f9445b && this.f9464u == 6) {
            i10 = 3;
        } else {
            i10 = this.f9464u;
        }
        m10220e0(i10);
        m10206j0();
    }

    /* renamed from: X */
    public void m10213X(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f9459p = f10;
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: Y */
    public void m10214Y(boolean z10) {
        if (this.f9462s != z10) {
            this.f9462s = z10;
            if (!z10 && this.f9464u == 5) {
                m10219d0(4);
            }
            m10206j0();
        }
    }

    /* renamed from: Z */
    public void m10215Z(int i10) {
        m10216a0(i10, false);
    }

    /* renamed from: a0 */
    public final void m10216a0(int i10, boolean z10) {
        View view;
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f9448e) {
                this.f9448e = true;
            }
            z11 = false;
        } else {
            if (this.f9448e || this.f9447d != i10) {
                this.f9448e = false;
                this.f9447d = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11 && this.f9435B != null) {
            m10196K();
            if (this.f9464u == 4 && (view = (View) this.f9435B.get()) != null) {
                if (z10) {
                    m10205g0(this.f9464u);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: b0 */
    public void m10217b0(int i10) {
        this.f9444a = i10;
    }

    /* renamed from: c0 */
    public void m10218c0(boolean z10) {
        this.f9463t = z10;
    }

    /* renamed from: d0 */
    public void m10219d0(int i10) {
        if (i10 == this.f9464u) {
            return;
        }
        if (this.f9435B == null) {
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f9462s && i10 == 5)) {
                this.f9464u = i10;
                return;
            }
            return;
        }
        m10205g0(i10);
    }

    /* renamed from: e0 */
    void m10220e0(int i10) {
        if (this.f9464u == i10) {
            return;
        }
        this.f9464u = i10;
        WeakReference weakReference = this.f9435B;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 != 6 && i10 != 3) {
            if (i10 == 5 || i10 == 4) {
                m10208l0(false);
            }
        } else {
            m10208l0(true);
        }
        m10207k0(i10);
        if (this.f9437D.size() <= 0) {
            m10206j0();
        } else {
            AbstractC0272b.m941a(this.f9437D.get(0));
            throw null;
        }
    }

    /* renamed from: f0 */
    void m10221f0(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.f9460q;
        } else if (i10 == 6) {
            i11 = this.f9458o;
            if (this.f9445b && i11 <= (i12 = this.f9457n)) {
                i11 = i12;
                i10 = 3;
            }
        } else if (i10 == 3) {
            i11 = m10201R();
        } else if (this.f9462s && i10 == 5) {
            i11 = this.f9434A;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        }
        m10223i0(view, i10, i11, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: g */
    public void mo2117g(CoordinatorLayout.C0485e c0485e) {
        super.mo2117g(c0485e);
        this.f9435B = null;
        this.f9465v = null;
    }

    /* renamed from: h0 */
    boolean m10222h0(View view, float f10) {
        if (this.f9463t) {
            return true;
        }
        if (view.getTop() >= this.f9460q && Math.abs((view.getTop() + (f10 * 0.1f)) - this.f9460q) / this.f9447d > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    void m10223i0(View view, int i10, int i11, boolean z10) {
        boolean m6072H;
        if (z10) {
            m6072H = this.f9465v.m6070F(view.getLeft(), i11);
        } else {
            m6072H = this.f9465v.m6072H(view, view.getLeft(), i11);
        }
        if (m6072H) {
            m10220e0(2);
            m10207k0(i10);
            if (this.f9454k == null) {
                this.f9454k = new RunnableC2534f(view, i10);
            }
            if (!this.f9454k.f9483b) {
                RunnableC2534f runnableC2534f = this.f9454k;
                runnableC2534f.f9484c = i10;
                AbstractC0616q0.m2620f0(view, runnableC2534f);
                this.f9454k.f9483b = true;
                return;
            }
            this.f9454k.f9484c = i10;
            return;
        }
        m10220e0(i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: j */
    public void mo2120j() {
        super.mo2120j();
        this.f9435B = null;
        this.f9465v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: k */
    public boolean mo2121k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        C1336c c1336c;
        if (!view.isShown()) {
            this.f9466w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m10203T();
        }
        if (this.f9438E == null) {
            this.f9438E = VelocityTracker.obtain();
        }
        this.f9438E.addMovement(motionEvent);
        View view3 = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f9441H = false;
                this.f9439F = -1;
                if (this.f9466w) {
                    this.f9466w = false;
                    return false;
                }
            }
        } else {
            int x10 = (int) motionEvent.getX();
            this.f9440G = (int) motionEvent.getY();
            if (this.f9464u != 2) {
                WeakReference weakReference = this.f9436C;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && coordinatorLayout.m2106z(view2, x10, this.f9440G)) {
                    this.f9439F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f9441H = true;
                }
            }
            if (this.f9439F == -1 && !coordinatorLayout.m2106z(view, x10, this.f9440G)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9466w = z10;
        }
        if (!this.f9466w && (c1336c = this.f9465v) != null && c1336c.m6071G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f9436C;
        if (weakReference2 != null) {
            view3 = (View) weakReference2.get();
        }
        if (actionMasked != 2 || view3 == null || this.f9466w || this.f9464u == 1 || coordinatorLayout.m2106z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9465v == null || Math.abs(this.f9440G - motionEvent.getY()) <= this.f9465v.m6078u()) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: l */
    public boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z10;
        float f10;
        C6686i c6686i;
        if (AbstractC0616q0.m2657y(coordinatorLayout) && !AbstractC0616q0.m2657y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f9435B == null) {
            this.f9449f = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            this.f9435B = new WeakReference(view);
            if (this.f9450g && (c6686i = this.f9451h) != null) {
                AbstractC0616q0.m2642q0(view, c6686i);
            }
            C6686i c6686i2 = this.f9451h;
            if (c6686i2 != null) {
                float f11 = this.f9461r;
                if (f11 == -1.0f) {
                    f11 = AbstractC0616q0.m2651v(view);
                }
                c6686i2.m26095Q(f11);
                if (this.f9464u == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9453j = z10;
                C6686i c6686i3 = this.f9451h;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                c6686i3.m26097S(f10);
            }
            m10206j0();
            if (AbstractC0616q0.m2659z(view) == 0) {
                AbstractC0616q0.m2654w0(view, 1);
            }
        }
        if (this.f9465v == null) {
            this.f9465v = C1336c.m6061m(coordinatorLayout, this.f9443J);
        }
        int top = view.getTop();
        coordinatorLayout.m2090G(view, i10);
        this.f9469z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f9434A = height;
        this.f9457n = Math.max(0, height - view.getHeight());
        m10197L();
        m10196K();
        int i11 = this.f9464u;
        if (i11 == 3) {
            AbstractC0616q0.m2607Y(view, m10201R());
        } else if (i11 == 6) {
            AbstractC0616q0.m2607Y(view, this.f9458o);
        } else if (this.f9462s && i11 == 5) {
            AbstractC0616q0.m2607Y(view, this.f9434A);
        } else if (i11 == 4) {
            AbstractC0616q0.m2607Y(view, this.f9460q);
        } else if (i11 == 1 || i11 == 2) {
            AbstractC0616q0.m2607Y(view, top - view.getTop());
        }
        this.f9436C = new WeakReference(m10210Q(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: o */
    public boolean mo2125o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference = this.f9436C;
        if (weakReference == null || view2 != weakReference.get()) {
            return false;
        }
        if (this.f9464u == 3 && !super.mo2125o(coordinatorLayout, view, view2, f10, f11)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: q */
    public void mo2127q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        View view3;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f9436C;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < m10201R()) {
                int m10201R = top - m10201R();
                iArr[1] = m10201R;
                AbstractC0616q0.m2607Y(view, -m10201R);
                m10220e0(3);
            } else {
                iArr[1] = i11;
                AbstractC0616q0.m2607Y(view, -i11);
                m10220e0(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.f9460q;
            if (i13 > i14 && !this.f9462s) {
                int i15 = top - i14;
                iArr[1] = i15;
                AbstractC0616q0.m2607Y(view, -i15);
                m10220e0(4);
            } else {
                iArr[1] = i11;
                AbstractC0616q0.m2607Y(view, -i11);
                m10220e0(1);
            }
        }
        m10209P(view.getTop());
        this.f9467x = i11;
        this.f9468y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: t */
    public void mo2130t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: x */
    public void mo2134x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        C2533e c2533e = (C2533e) parcelable;
        super.mo2134x(coordinatorLayout, view, c2533e.m4828a());
        m10204U(c2533e);
        int i10 = c2533e.f9477c;
        if (i10 != 1 && i10 != 2) {
            this.f9464u = i10;
        } else {
            this.f9464u = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: y */
    public Parcelable mo2135y(CoordinatorLayout coordinatorLayout, View view) {
        return new C2533e(super.mo2135y(coordinatorLayout, view), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes.dex */
    public static class C2533e extends AbstractC1031a {
        public static final Parcelable.Creator<C2533e> CREATOR = new a();

        /* renamed from: c */
        final int f9477c;

        /* renamed from: d */
        int f9478d;

        /* renamed from: e */
        boolean f9479e;

        /* renamed from: f */
        boolean f9480f;

        /* renamed from: g */
        boolean f9481g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2533e createFromParcel(Parcel parcel) {
                return new C2533e(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2533e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2533e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2533e[] newArray(int i10) {
                return new C2533e[i10];
            }
        }

        public C2533e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9477c = parcel.readInt();
            this.f9478d = parcel.readInt();
            this.f9479e = parcel.readInt() == 1;
            this.f9480f = parcel.readInt() == 1;
            this.f9481g = parcel.readInt() == 1;
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9477c);
            parcel.writeInt(this.f9478d);
            parcel.writeInt(this.f9479e ? 1 : 0);
            parcel.writeInt(this.f9480f ? 1 : 0);
            parcel.writeInt(this.f9481g ? 1 : 0);
        }

        public C2533e(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f9477c = bottomSheetBehavior.f9464u;
            this.f9478d = bottomSheetBehavior.f9447d;
            this.f9479e = bottomSheetBehavior.f9445b;
            this.f9480f = bottomSheetBehavior.f9462s;
            this.f9481g = bottomSheetBehavior.f9463t;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f9444a = 0;
        this.f9445b = true;
        this.f9454k = null;
        this.f9459p = 0.5f;
        this.f9461r = -1.0f;
        this.f9464u = 4;
        this.f9437D = new ArrayList();
        this.f9443J = new C2531c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9363v);
        this.f9450g = obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i11 = R$styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            m10199N(context, attributeSet, hasValue, AbstractC6216c.m24791a(context, obtainStyledAttributes, i11));
        } else {
            m10198M(context, attributeSet, hasValue);
        }
        m10200O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9461r = obtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i12 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i12);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            m10215Z(i10);
        } else {
            m10215Z(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        m10214Y(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        m10212W(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m10218c0(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        m10217b0(obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        m10213X(obtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        m10211V(obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.f9446c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
