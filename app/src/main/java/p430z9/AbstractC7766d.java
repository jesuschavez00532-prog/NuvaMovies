package p430z9;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import be.C1328x;
import ca.InterfaceC1439a;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p011aa.InterfaceC0124b;
import p400xa.C7554b;
import ye.C7709c;

/* renamed from: z9.d */
/* loaded from: classes2.dex */
public abstract class AbstractC7766d<P extends InterfaceC1439a> extends AbstractC7770h implements InterfaceC0124b {

    /* renamed from: u0 */
    private InterfaceC5642a f28625u0;

    /* renamed from: v0 */
    private InterfaceC5642a f28626v0;

    /* renamed from: w0 */
    private InterfaceC1439a f28627w0;

    /* renamed from: x0 */
    public Map f28628x0 = new LinkedHashMap();

    /* renamed from: t0 */
    private final C7554b f28624t0 = new C7554b();

    /* renamed from: B9 */
    private final void m30056B9() {
        if (this.f28627w0 == null) {
            InterfaceC1439a mo22228A9 = mo22228A9();
            this.f28627w0 = mo22228A9;
            AbstractC5868k.m23671c(mo22228A9);
            mo22228A9.mo6701B0();
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: C9 */
    private final void m30057C9() {
        if (mo22281z9() && !C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29803r(this);
        }
    }

    /* renamed from: A9 */
    public abstract InterfaceC1439a mo22228A9();

    /* renamed from: D9 */
    public void m30058D9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f28626v0 = interfaceC5642a;
    }

    /* renamed from: E9 */
    public void m30059E9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f28625u0 = interfaceC5642a;
    }

    /* renamed from: Q2 */
    public boolean mo493Q2() {
        return false;
    }

    @Override // p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        if (mo22281z9() && C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        InterfaceC1439a interfaceC1439a = this.f28627w0;
        if (interfaceC1439a != null) {
            interfaceC1439a.mo6702n2();
        }
        this.f28627w0 = null;
        mo22268m9();
    }

    /* renamed from: b5 */
    public boolean mo494b5() {
        return false;
    }

    /* renamed from: g5 */
    public boolean mo495g5() {
        return InterfaceC0124b.a.m496a(this);
    }

    @Override // p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m30057C9();
        m30056B9();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: m9 */
    public void mo22268m9() {
        this.f28628x0.clear();
    }

    /* renamed from: v9 */
    public Fragment m30060v9() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w9 */
    public final InterfaceC5642a m30061w9() {
        return this.f28625u0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x9 */
    public final InterfaceC5642a m30062x9() {
        return this.f28626v0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y9 */
    public final InterfaceC1439a m30063y9() {
        return this.f28627w0;
    }

    /* renamed from: z9 */
    public abstract boolean mo22281z9();
}
