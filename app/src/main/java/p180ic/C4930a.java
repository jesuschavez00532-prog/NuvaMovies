package p180ic;

import ac.C0226z;
import com.request.result.ExchangeResult;
import ne.AbstractC5868k;
import p163hc.InterfaceC4815a;
import p301qb.InterfaceC6434w;

/* renamed from: ic.a */
/* loaded from: classes.dex */
public final class C4930a implements InterfaceC6434w {

    /* renamed from: a */
    private InterfaceC4815a f20509a;

    /* renamed from: b */
    private final C0226z f20510b = new C0226z(this);

    public C4930a(InterfaceC4815a interfaceC4815a) {
        this.f20509a = interfaceC4815a;
    }

    @Override // p301qb.InterfaceC6434w
    /* renamed from: O */
    public void mo20263O(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC4815a interfaceC4815a = this.f20509a;
        if (interfaceC4815a != null) {
            interfaceC4815a.mo18601O(str);
        }
    }

    /* renamed from: c */
    public final void m20264c(String str) {
        AbstractC5868k.m23674f(str, "exchangeCode");
        this.f20510b.m790b(str);
    }

    /* renamed from: d */
    public void m20265d() {
        this.f20509a = null;
    }

    @Override // p301qb.InterfaceC6434w
    /* renamed from: h0 */
    public void mo20266h0(ExchangeResult exchangeResult) {
        AbstractC5868k.m23674f(exchangeResult, "it");
        InterfaceC4815a interfaceC4815a = this.f20509a;
        if (interfaceC4815a != null) {
            interfaceC4815a.mo18603h0(exchangeResult);
        }
    }
}
