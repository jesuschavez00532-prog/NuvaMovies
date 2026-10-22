package ac;

import com.request.result.GetSubscribeResult;
import com.request.result.SubscribeListData;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6429u0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.c1 */
/* loaded from: classes2.dex */
public final class C0140c1 extends AbstractC0166j {

    /* renamed from: ac.c1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetSubscribeResult getSubscribeResult) {
            AbstractC5868k.m23674f(getSubscribeResult, "t");
            super.onNext(getSubscribeResult);
            if (getSubscribeResult.getData() != null) {
                InterfaceC6429u0 interfaceC6429u0 = (InterfaceC6429u0) C0140c1.this.m618a();
                SubscribeListData data = getSubscribeResult.getData();
                AbstractC5868k.m23671c(data);
                interfaceC6429u0.mo20412W(data);
                return;
            }
            ((InterfaceC6429u0) C0140c1.this.m618a()).mo20414g0("");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6429u0) C0140c1.this.m618a()).mo20414g0(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140c1(InterfaceC6429u0 interfaceC6429u0) {
        super(interfaceC6429u0);
        AbstractC5868k.m23674f(interfaceC6429u0, "view");
    }

    /* renamed from: b */
    public final void m544b(String str) {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5592h0(str), ((InterfaceC6429u0) m618a()).mo523N3()).subscribe(new a());
    }
}
