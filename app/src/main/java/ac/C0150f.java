package ac;

import cc.C1464l0;
import com.request.result.FootballMatchResult;
import com.request.result.Match;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6386g;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.f */
/* loaded from: classes2.dex */
public final class C0150f extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f431b;

    /* renamed from: ac.f$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f432a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FootballMatchResult mo542f(FootballMatchResult footballMatchResult) {
            AbstractC5868k.m23674f(footballMatchResult, "it");
            for (Match match : footballMatchResult.getData().getTeamList()) {
                match.setGameTime(C1464l0.f5622a.m6826e(match.getGameTime(), "yyyy-MM-dd HH:mm"));
            }
            return footballMatchResult;
        }
    }

    /* renamed from: ac.f$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ int f434c;

        b(int i10) {
            this.f434c = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FootballMatchResult footballMatchResult) {
            AbstractC5868k.m23674f(footballMatchResult, "t");
            super.onNext(footballMatchResult);
            ((InterfaceC6386g) C0150f.this.m618a()).mo18336G5(footballMatchResult.getData().getTeamList(), this.f434c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6386g) C0150f.this.m618a()).mo18340e1(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f434c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0150f.this.f431b = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150f(InterfaceC6386g interfaceC6386g) {
        super(interfaceC6386g);
        AbstractC5868k.m23674f(interfaceC6386g, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final FootballMatchResult m570e(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (FootballMatchResult) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: d */
    public final void m571d(String str, String str2, int i10) {
        boolean z10 = false;
        Disposable disposable;
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, "gameId");
        Disposable disposable2 = this.f431b;
        if (disposable2 != null) {
            z10 = disposable2.isDisposed();
        } else {
            z10 = true;
        }
        if (!z10 && (disposable = this.f431b) != null) {
            disposable.dispose();
        }
        Observable m5623x = C1224f.f4816e.m5631a().m5623x(str, str2, i10);
        final a aVar = a.f432a;
        Observable map = m5623x.map(new Function() { // from class: ac.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                FootballMatchResult m570e;
                m570e = C0150f.m570e(InterfaceC5660l.this, obj);
                return m570e;
            }
        });
        AbstractC5868k.m23673e(map, "PortalHelper.get()\n     …@map it\n                }");
        AbstractC6567a.m25631a(map, ((InterfaceC6386g) m618a()).mo523N3()).subscribe(new b(i10));
    }
}
