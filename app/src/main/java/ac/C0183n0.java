package ac;

import com.request.result.GetFavoritesResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6387g0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.n0 */
/* loaded from: classes2.dex */
public final class C0183n0 extends AbstractC0166j {

    /* renamed from: ac.n0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetFavoritesResult getFavoritesResult) {
            AbstractC5868k.m23674f(getFavoritesResult, "t");
            super.onNext(getFavoritesResult);
            ((InterfaceC6387g0) C0183n0.this.m618a()).mo19222I(getFavoritesResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6387g0) C0183n0.this.m618a()).mo19219A(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183n0(InterfaceC6387g0 interfaceC6387g0) {
        super(interfaceC6387g0);
        AbstractC5868k.m23674f(interfaceC6387g0, "view");
    }

    /* renamed from: c */
    public static /* synthetic */ void m673c(C0183n0 c0183n0, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c0183n0.m674b(str, z10);
    }

    /* renamed from: b */
    public final void m674b(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "queryType");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5557F(str, z10), ((InterfaceC6387g0) m618a()).mo523N3()).subscribe(new a());
    }
}
