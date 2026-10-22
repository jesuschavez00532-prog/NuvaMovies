package p151h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;

/* renamed from: h0.d */
/* loaded from: classes.dex */
public class C4465d extends AbstractC4490p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.d$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4487o {

        /* renamed from: a */
        final /* synthetic */ View f19349a;

        a(View view) {
            this.f19349a = view;
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            AbstractC4464c0.m18695g(this.f19349a, 1.0f);
            AbstractC4464c0.m18689a(this.f19349a);
            abstractC4485n.mo18754R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.d$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f19351a;

        /* renamed from: b */
        private boolean f19352b = false;

        b(View view) {
            this.f19351a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC4464c0.m18695g(this.f19351a, 1.0f);
            if (this.f19352b) {
                this.f19351a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC0616q0.m2596N(this.f19351a) && this.f19351a.getLayerType() == 0) {
                this.f19352b = true;
                this.f19351a.setLayerType(2, null);
            }
        }
    }

    public C4465d(int i10) {
        m18792m0(i10);
    }

    /* renamed from: n0 */
    private Animator m18703n0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        AbstractC4464c0.m18695g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC4464c0.f19347b, f11);
        ofFloat.addListener(new b(view));
        mo18760a(new a(view));
        return ofFloat;
    }

    /* renamed from: o0 */
    private static float m18704o0(C4497u c4497u, float f10) {
        Float f11;
        if (c4497u != null && (f11 = (Float) c4497u.f19463a.get("android:fade:transitionAlpha")) != null) {
            return f11.floatValue();
        }
        return f10;
    }

    @Override // p151h0.AbstractC4490p0
    /* renamed from: i0 */
    public Animator mo18705i0(ViewGroup viewGroup, View view, C4497u c4497u, C4497u c4497u2) {
        float f10 = 0.0f;
        float m18704o0 = m18704o0(c4497u, 0.0f);
        if (m18704o0 != 1.0f) {
            f10 = m18704o0;
        }
        return m18703n0(view, f10, 1.0f);
    }

    @Override // p151h0.AbstractC4490p0, p151h0.AbstractC4485n
    /* renamed from: j */
    public void mo18668j(C4497u c4497u) {
        super.mo18668j(c4497u);
        c4497u.f19463a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC4464c0.m18691c(c4497u.f19464b)));
    }

    @Override // p151h0.AbstractC4490p0
    /* renamed from: k0 */
    public Animator mo18706k0(ViewGroup viewGroup, View view, C4497u c4497u, C4497u c4497u2) {
        AbstractC4464c0.m18693e(view);
        return m18703n0(view, m18704o0(c4497u, 1.0f), 0.0f);
    }
}
