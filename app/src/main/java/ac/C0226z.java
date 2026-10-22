package ac;

import com.request.converterFactory.bean.ResultException;
import com.request.result.ExchangeResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6434w;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.z */
/* loaded from: classes2.dex */
public final class C0226z extends AbstractC0166j {

    /* renamed from: ac.z$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(ExchangeResult exchangeResult) {
            AbstractC5868k.m23674f(exchangeResult, "t");
            super.onNext(exchangeResult);
            ((InterfaceC6434w) C0226z.this.m618a()).mo20266h0(exchangeResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            if (AbstractC6570d.m25646c(th)) {
                InterfaceC6434w interfaceC6434w = (InterfaceC6434w) C0226z.this.m618a();
                String returnCode = ((ResultException) th).getReturnCode();
                AbstractC5868k.m23673e(returnCode, "e as ResultException).returnCode");
                interfaceC6434w.mo20263O(returnCode);
                return;
            }
            ((InterfaceC6434w) C0226z.this.m618a()).mo20263O("EA7");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226z(InterfaceC6434w interfaceC6434w) {
        super(interfaceC6434w);
        AbstractC5868k.m23674f(interfaceC6434w, "view");
    }

    /* renamed from: b */
    public final void m790b(String str) {
        AbstractC5868k.m23674f(str, "exchangeCode");
        C1224f.f4816e.m5631a().m5617u(str).subscribe(new a());
    }
}
