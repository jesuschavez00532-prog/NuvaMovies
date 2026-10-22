package ac;

import com.request.result.Channel;
import com.request.result.DelFavoriteResult;
import io.reactivex.disposables.Disposable;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p043ce.AbstractC1500l;
import p301qb.InterfaceC6441y0;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.h1 */
/* loaded from: classes2.dex */
public final class C0160h1 extends AbstractC0166j {

    /* renamed from: ac.h1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ Channel f462c;

        /* renamed from: d */
        final /* synthetic */ int f463d;

        a(Channel channel, int i10) {
            this.f462c = channel;
            this.f463d = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(DelFavoriteResult delFavoriteResult) {
            AbstractC5868k.m23674f(delFavoriteResult, "t");
            super.onNext(delFavoriteResult);
            ((InterfaceC6441y0) C0160h1.this.m618a()).mo19220E2(this.f462c, this.f463d);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6441y0) C0160h1.this.m618a()).mo19223K1(AbstractC6570d.m25644a(th, "EA7", "500", "500"), this.f462c.getChannelCode());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            ((InterfaceC6441y0) C0160h1.this.m618a()).mo19232o6(this.f462c.getChannelCode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160h1(InterfaceC6441y0 interfaceC6441y0) {
        super(interfaceC6441y0);
        AbstractC5868k.m23674f(interfaceC6441y0, "view");
    }

    /* renamed from: b */
    public final void m609b(int i10, Channel channel, int i11) {
        List m6989h;
        AbstractC5868k.m23674f(channel, "channel");
        C1224f m5631a = C1224f.f4816e.m5631a();
        m6989h = AbstractC1500l.m6989h(Integer.valueOf(i10));
        m5631a.m5607p(m6989h).compose(((InterfaceC6441y0) m618a()).mo523N3()).subscribe(new a(channel, i11));
    }
}
