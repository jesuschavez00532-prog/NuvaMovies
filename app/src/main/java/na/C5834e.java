package na;

import ac.C0209t2;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import la.InterfaceC5538f;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p301qb.InterfaceC6427t1;

/* renamed from: na.e */
/* loaded from: classes2.dex */
public final class C5834e implements InterfaceC1439a, InterfaceC6427t1 {

    /* renamed from: a */
    private InterfaceC5538f f23356a;

    /* renamed from: b */
    private final InterfaceC1312h f23357b;

    /* renamed from: na.e$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0209t2 invoke() {
            return new C0209t2(C5834e.this);
        }
    }

    public C5834e(InterfaceC5538f interfaceC5538f) {
        InterfaceC1312h m5965b;
        this.f23356a = interfaceC5538f;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f23357b = m5965b;
    }

    /* renamed from: Y0 */
    private final C0209t2 m23597Y0() {
        return (C0209t2) this.f23357b.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6427t1
    /* renamed from: C */
    public void mo23598C(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5538f interfaceC5538f = this.f23356a;
        if (interfaceC5538f != null) {
            interfaceC5538f.mo22454C(str);
        }
    }

    /* renamed from: E3 */
    public void m23599E3(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        m23597Y0().m736b(str, str2, str3);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        InterfaceC5538f interfaceC5538f = this.f23356a;
        if (interfaceC5538f != null) {
            return interfaceC5538f.mo523N3();
        }
        return null;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6427t1
    /* renamed from: w */
    public void mo23600w() {
        InterfaceC5538f interfaceC5538f = this.f23356a;
        if (interfaceC5538f != null) {
            interfaceC5538f.mo22455w();
        }
    }
}
