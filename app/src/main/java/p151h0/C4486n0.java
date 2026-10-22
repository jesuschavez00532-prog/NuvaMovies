package p151h0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: h0.n0 */
/* loaded from: classes.dex */
class C4486n0 extends C4484m0 {
    @Override // p151h0.C4470f0, p151h0.AbstractC4488o0
    /* renamed from: c */
    public float mo18713c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p151h0.C4480k0, p151h0.AbstractC4488o0
    /* renamed from: e */
    public void mo18727e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p151h0.C4470f0, p151h0.AbstractC4488o0
    /* renamed from: f */
    public void mo18715f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p151h0.C4484m0, p151h0.AbstractC4488o0
    /* renamed from: g */
    public void mo18732g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p151h0.C4476i0, p151h0.AbstractC4488o0
    /* renamed from: h */
    public void mo18722h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p151h0.C4476i0, p151h0.AbstractC4488o0
    /* renamed from: i */
    public void mo18723i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
