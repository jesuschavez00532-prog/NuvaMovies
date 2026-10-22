package p151h0;

import android.view.View;

/* renamed from: h0.f0 */
/* loaded from: classes.dex */
class C4470f0 extends AbstractC4488o0 {

    /* renamed from: e */
    private static boolean f19367e = true;

    @Override // p151h0.AbstractC4488o0
    /* renamed from: a */
    public void mo18712a(View view) {
    }

    @Override // p151h0.AbstractC4488o0
    /* renamed from: c */
    public float mo18713c(View view) {
        float transitionAlpha;
        if (f19367e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f19367e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p151h0.AbstractC4488o0
    /* renamed from: d */
    public void mo18714d(View view) {
    }

    @Override // p151h0.AbstractC4488o0
    /* renamed from: f */
    public void mo18715f(View view, float f10) {
        if (f19367e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f19367e = false;
            }
        }
        view.setAlpha(f10);
    }
}
