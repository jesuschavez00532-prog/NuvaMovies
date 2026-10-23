package ac;

import com.request.result.AddFavoriteResult;
import com.request.result.Channel;
import com.request.result.FavIdData;
import com.request.result.FavIdDataItem;
import io.reactivex.disposables.Disposable;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p043ce.AbstractC1500l;
import p301qb.InterfaceC6438x0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.c */
/* loaded from: classes2.dex */
public final class C0138c extends AbstractC0166j {

    /* renamed from: ac.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ Channel f406c;

        /* renamed from: d */
        final /* synthetic */ int f407d;

        a(Channel channel, int i10) {
            this.f406c = channel;
            this.f407d = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(AddFavoriteResult addFavoriteResult) {
            boolean z10 = false;
            List<FavIdDataItem> favoriteList;
            AbstractC5868k.m23674f(addFavoriteResult, "t");
            super.onNext(addFavoriteResult);
            FavIdData data = addFavoriteResult.getData();
            if (data != null && (favoriteList = data.getFavoriteList()) != null) {
                z10 = AbstractC6567a.m25638h(favoriteList);
            } else {
                z10 = false;
            }
            if (z10) {
                InterfaceC6438x0 interfaceC6438x0 = (InterfaceC6438x0) C0138c.this.m618a();
                FavIdData data2 = addFavoriteResult.getData();
                AbstractC5868k.m23671c(data2);
                List<FavIdDataItem> favoriteList2 = data2.getFavoriteList();
                AbstractC5868k.m23671c(favoriteList2);
                interfaceC6438x0.mo19235z3(favoriteList2, this.f406c, this.f407d);
                return;
            }
            ((InterfaceC6438x0) C0138c.this.m618a()).mo19227R4("error code", this.f406c.getChannelCode());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6438x0) C0138c.this.m618a()).mo19227R4(AbstractC6570d.m25644a(th, "EA7", "500", "500"), this.f406c.getChannelCode());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            ((InterfaceC6438x0) C0138c.this.m618a()).mo19229e2(this.f406c.getChannelCode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138c(InterfaceC6438x0 interfaceC6438x0) {
        super(interfaceC6438x0);
        AbstractC5868k.m23674f(interfaceC6438x0, "view");
    }

    /* renamed from: b */
    public final void m536b(String str, Channel channel, int i10) {
        List m6989h;
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(channel, "channel");
        m6989h = AbstractC1500l.m6989h(channel.getChannelCode());
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5581c(str, m6989h, false), ((InterfaceC6438x0) m618a()).mo523N3()).subscribe(new a(channel, i10));
    }
}
