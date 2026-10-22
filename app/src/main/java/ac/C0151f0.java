package ac;

import com.request.result.FreeResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6369a0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.f0 */
/* loaded from: classes2.dex */
public final class C0151f0 extends AbstractC0166j {

    /* renamed from: ac.f0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FreeResult freeResult) {
            AbstractC5868k.m23674f(freeResult, "t");
            super.onNext(freeResult);
            ((InterfaceC6369a0) C0151f0.this.m618a()).mo19878G4(freeResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            String m25644a = AbstractC6570d.m25644a(th, "eb2", "500", "500");
            th.printStackTrace();
            ((InterfaceC6369a0) C0151f0.this.m618a()).mo19881X1(m25644a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151f0(InterfaceC6369a0 interfaceC6369a0) {
        super(interfaceC6369a0);
        AbstractC5868k.m23674f(interfaceC6369a0, "view");
    }

    /* renamed from: b */
    public final void m574b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5559H(), ((InterfaceC6369a0) m618a()).mo523N3()).subscribe(new a());
    }
}
