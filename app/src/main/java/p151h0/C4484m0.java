package p151h0;

import android.os.Build;
import android.view.View;

/* renamed from: h0.m0 */
/* loaded from: classes.dex */
class C4484m0 extends C4480k0 {

    /* renamed from: i */
    private static boolean f19378i = true;

    @Override // p151h0.AbstractC4488o0
    /* renamed from: g */
    public void mo18732g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo18732g(view, i10);
        } else if (f19378i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f19378i = false;
            }
        }
    }
}
