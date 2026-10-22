package ac;

import com.request.result.MatchStatResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6373b1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.p1 */
/* loaded from: classes2.dex */
public final class C0192p1 extends AbstractC0166j {

    /* renamed from: ac.p1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(MatchStatResult matchStatResult) {
            AbstractC5868k.m23674f(matchStatResult, "t");
            super.onNext(matchStatResult);
            ((InterfaceC6373b1) C0192p1.this.m618a()).mo19002g2(matchStatResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6373b1) C0192p1.this.m618a()).mo19001d5(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192p1(InterfaceC6373b1 interfaceC6373b1) {
        super(interfaceC6373b1);
        AbstractC5868k.m23674f(interfaceC6373b1, "view");
    }

    /* renamed from: b */
    public final void m698b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "gameId");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5570S(str, str2, str3), ((InterfaceC6373b1) m618a()).mo523N3()).subscribe(new a());
    }
}
