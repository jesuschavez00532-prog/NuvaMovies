package p151h0;

import android.view.View;
import android.view.WindowId;

/* renamed from: h0.q0 */
/* loaded from: classes.dex */
class C4492q0 implements InterfaceC4494r0 {

    /* renamed from: a */
    private final WindowId f19451a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4492q0(View view) {
        this.f19451a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4492q0) && ((C4492q0) obj).f19451a.equals(this.f19451a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f19451a.hashCode();
    }
}
