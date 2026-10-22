package ac;

import com.request.result.LineupResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6435w0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.g1 */
/* loaded from: classes2.dex */
public final class C0156g1 extends AbstractC0166j {

    /* renamed from: ac.g1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(LineupResult lineupResult) {
            AbstractC5868k.m23674f(lineupResult, "t");
            super.onNext(lineupResult);
            ((InterfaceC6435w0) C0156g1.this.m618a()).mo19390D3(lineupResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6435w0) C0156g1.this.m618a()).mo19389C1(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156g1(InterfaceC6435w0 interfaceC6435w0) {
        super(interfaceC6435w0);
        AbstractC5868k.m23674f(interfaceC6435w0, "view");
    }

    /* renamed from: b */
    public final void m600b(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5563L(str), ((InterfaceC6435w0) m618a()).mo523N3()).subscribe(new a());
    }
}
