package p151h0;

import android.view.View;

/* renamed from: h0.k0 */
/* loaded from: classes.dex */
class C4480k0 extends C4476i0 {

    /* renamed from: h */
    private static boolean f19376h = true;

    @Override // p151h0.AbstractC4488o0
    /* renamed from: e */
    public void mo18727e(View view, int i10, int i11, int i12, int i13) {
        if (f19376h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f19376h = false;
            }
        }
    }
}
