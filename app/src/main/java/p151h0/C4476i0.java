package p151h0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: h0.i0 */
/* loaded from: classes.dex */
class C4476i0 extends C4470f0 {

    /* renamed from: f */
    private static boolean f19374f = true;

    /* renamed from: g */
    private static boolean f19375g = true;

    @Override // p151h0.AbstractC4488o0
    /* renamed from: h */
    public void mo18722h(View view, Matrix matrix) {
        if (f19374f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f19374f = false;
            }
        }
    }

    @Override // p151h0.AbstractC4488o0
    /* renamed from: i */
    public void mo18723i(View view, Matrix matrix) {
        if (f19375g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f19375g = false;
            }
        }
    }
}
