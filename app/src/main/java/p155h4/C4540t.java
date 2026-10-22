package p155h4;

import android.os.Bundle;
import com.taobao.accs.utl.BaseMonitor;

/* renamed from: h4.t */
/* loaded from: classes.dex */
final class C4540t extends AbstractC4541u {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4540t(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p155h4.AbstractC4541u
    /* renamed from: a */
    public final void mo18931a(Bundle bundle) {
        if (bundle.getBoolean(BaseMonitor.COUNT_ACK, false)) {
            m18934d(null);
        } else {
            m18933c(new C4542v(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p155h4.AbstractC4541u
    /* renamed from: b */
    public final boolean mo18932b() {
        return true;
    }
}
