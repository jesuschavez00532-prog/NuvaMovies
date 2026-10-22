package ac;

import com.request.result.GetOrderInfoResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6402l0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.t0 */
/* loaded from: classes2.dex */
public final class C0207t0 extends AbstractC0166j {

    /* renamed from: ac.t0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetOrderInfoResult getOrderInfoResult) {
            AbstractC5868k.m23674f(getOrderInfoResult, "t");
            super.onNext(getOrderInfoResult);
            ((InterfaceC6402l0) C0207t0.this.m618a()).mo20480i0(getOrderInfoResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6402l0) C0207t0.this.m618a()).mo20479L(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207t0(InterfaceC6402l0 interfaceC6402l0) {
        super(interfaceC6402l0);
        AbstractC5868k.m23674f(interfaceC6402l0, "view");
    }

    /* renamed from: b */
    public final void m734b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5572U(), ((InterfaceC6402l0) m618a()).mo523N3()).subscribe(new a());
    }
}
