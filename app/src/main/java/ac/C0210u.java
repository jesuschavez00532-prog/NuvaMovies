package ac;

import com.request.result.BaseResult;
import com.request.result.SubscribeData;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6419r;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.u */
/* loaded from: classes2.dex */
public final class C0210u extends AbstractC0166j {

    /* renamed from: ac.u$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ SubscribeData f575c;

        a(SubscribeData subscribeData) {
            this.f575c = subscribeData;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            ((InterfaceC6419r) C0210u.this.m618a()).mo20411E(this.f575c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            int i10 = 0;
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "500", "500");
            SubscribeData subscribeData = this.f575c;
            if (subscribeData != null) {
                i10 = subscribeData.getSubscribeId();
            } else {
                i10 = -1;
            }
            ((InterfaceC6419r) C0210u.this.m618a()).mo20413X5(m25644a, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210u(InterfaceC6419r interfaceC6419r) {
        super(interfaceC6419r);
        AbstractC5868k.m23674f(interfaceC6419r, "view");
    }

    /* renamed from: b */
    public final void m738b(List list, SubscribeData subscribeData) {
        AbstractC5868k.m23674f(list, "ids");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5609q(list), ((InterfaceC6419r) m618a()).mo523N3()).subscribe(new a(subscribeData));
    }
}
