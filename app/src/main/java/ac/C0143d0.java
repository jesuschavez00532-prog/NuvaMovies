package ac;

import com.lzy.okgo.model.Progress;
import com.request.result.FootballMatchResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6440y;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.d0 */
/* loaded from: classes2.dex */
public final class C0143d0 extends AbstractC0166j {

    /* renamed from: ac.d0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f415c;

        /* renamed from: d */
        final /* synthetic */ String f416d;

        a(String str, String str2) {
            this.f415c = str;
            this.f416d = str2;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FootballMatchResult footballMatchResult) {
            AbstractC5868k.m23674f(footballMatchResult, "t");
            super.onNext(footballMatchResult);
            ((InterfaceC6440y) C0143d0.this.m618a()).mo18415G1(footballMatchResult.getData().getTeamList(), this.f415c, this.f416d);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6440y) C0143d0.this.m618a()).mo18416a5(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f415c, this.f416d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143d0(InterfaceC6440y interfaceC6440y) {
        super(interfaceC6440y);
        AbstractC5868k.m23674f(interfaceC6440y, "view");
    }

    /* renamed from: b */
    public final void m548b(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, Progress.DATE);
        AbstractC5868k.m23674f(str3, "matchId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5558G(str, str2, str4), ((InterfaceC6440y) m618a()).mo523N3()).subscribe(new a(str2, str3));
    }
}
