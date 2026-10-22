package ac;

import com.request.result.MatchScoreBoardResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6370a1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.o1 */
/* loaded from: classes2.dex */
public final class C0188o1 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f527b;

    /* renamed from: ac.o1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(MatchScoreBoardResult matchScoreBoardResult) {
            AbstractC5868k.m23674f(matchScoreBoardResult, "t");
            super.onNext(matchScoreBoardResult);
            ((InterfaceC6370a1) C0188o1.this.m618a()).mo18312c5(matchScoreBoardResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6370a1) C0188o1.this.m618a()).mo18309I5(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0188o1.this.f527b = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188o1(InterfaceC6370a1 interfaceC6370a1) {
        super(interfaceC6370a1);
        AbstractC5868k.m23674f(interfaceC6370a1, "view");
    }

    /* renamed from: c */
    public final void m683c(String str, String str2, String str3) {
        Disposable disposable;
        AbstractC5868k.m23674f(str, "matchName");
        AbstractC5868k.m23674f(str2, "visitTeamName");
        AbstractC5868k.m23674f(str3, "homeTeamName");
        Disposable disposable2 = this.f527b;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f527b) != null) {
            disposable.dispose();
        }
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5569R(str, str2, str3), ((InterfaceC6370a1) m618a()).mo523N3()).subscribe(new a());
    }
}
