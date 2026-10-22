package p202k3;

import be.C1328x;
import com.lzy.okgo.cookie.SerializableCookie;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p171i3.InterfaceC4846a;
import p171i3.InterfaceC4847b;
import p258o3.C5911g;
import p430z9.AbstractActivityC7763a;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C5097a implements InterfaceC4846a {

    /* renamed from: a */
    private AbstractActivityC7763a f20982a;

    /* renamed from: b */
    private InterfaceC4847b f20983b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5665q {
        a() {
            super(3);
        }

        /* renamed from: a */
        public final void m20698a(boolean z10, String str, String str2) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            AbstractC5868k.m23674f(str2, "path");
            if (z10) {
                C5097a.this.m20694a().mo7517w1();
            } else {
                C5097a.this.m20694a().mo7512H1();
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m20698a(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            return C1328x.f4998a;
        }
    }

    public C5097a(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4847b interfaceC4847b) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4847b, "view");
        this.f20982a = abstractActivityC7763a;
        this.f20983b = interfaceC4847b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m20697h();
        m20695b();
    }

    /* renamed from: a */
    public final InterfaceC4847b m20694a() {
        return this.f20983b;
    }

    /* renamed from: b */
    public void m20695b() {
        C5911g.f23514h.m23905a().m23904w(new a());
    }

    /* renamed from: e */
    public void m20696e() {
        C5911g.f23514h.m23905a().m23904w(null);
    }

    /* renamed from: h */
    public void m20697h() {
        if (C5911g.f23514h.m23905a().m23900q()) {
            this.f20983b.mo7517w1();
        } else {
            this.f20983b.mo7512H1();
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        m20696e();
    }
}
