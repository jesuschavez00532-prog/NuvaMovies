package ac;

import cc.C1466m0;
import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6379d1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.q1 */
/* loaded from: classes2.dex */
public final class C0196q1 extends AbstractC0166j {

    /* renamed from: ac.q1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: b */
        final /* synthetic */ String f549b;

        /* renamed from: c */
        final /* synthetic */ C0196q1 f550c;

        a(String str, C0196q1 c0196q1) {
            this.f549b = str;
            this.f550c = c0196q1;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C1466m0.f5627a.m6875k0(this.f549b);
            ((InterfaceC6379d1) this.f550c.m618a()).mo19725h3(baseResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6379d1) this.f550c.m618a()).mo19724S0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196q1(InterfaceC6379d1 interfaceC6379d1) {
        super(interfaceC6379d1);
        AbstractC5868k.m23674f(interfaceC6379d1, "view");
    }

    /* renamed from: b */
    public final void m710b(String str) {
        AbstractC5868k.m23674f(str, "pwd");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5602m0(str), ((InterfaceC6379d1) m618a()).mo523N3()).subscribe(new a(str, this));
    }
}
