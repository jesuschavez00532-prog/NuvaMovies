package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6397j1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.h2 */
/* loaded from: classes2.dex */
public final class C0161h2 extends AbstractC0166j {

    /* renamed from: ac.h2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            ((InterfaceC6397j1) C0161h2.this.m618a()).mo25212D1(baseResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6397j1) C0161h2.this.m618a()).mo25213a6(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161h2(InterfaceC6397j1 interfaceC6397j1) {
        super(interfaceC6397j1);
        AbstractC5868k.m23674f(interfaceC6397j1, "view");
    }

    /* renamed from: b */
    public final void m611b(String str) {
        AbstractC5868k.m23674f(str, "passwrod");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5616t0(str), ((InterfaceC6397j1) m618a()).mo523N3()).subscribe(new a());
    }
}
