package ac;

import com.request.result.DelFavoriteResult;
import com.request.result.FavoriteList;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6425t;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.w */
/* loaded from: classes2.dex */
public final class C0217w extends AbstractC0166j {

    /* renamed from: ac.w$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ FavoriteList f593c;

        a(FavoriteList favoriteList) {
            this.f593c = favoriteList;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(DelFavoriteResult delFavoriteResult) {
            AbstractC5868k.m23674f(delFavoriteResult, "t");
            super.onNext(delFavoriteResult);
            ((InterfaceC6425t) C0217w.this.m618a()).mo20456p(this.f593c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            int i10 = 0;
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "500", "500");
            FavoriteList favoriteList = this.f593c;
            if (favoriteList != null) {
                i10 = favoriteList.getId();
            } else {
                i10 = -1;
            }
            ((InterfaceC6425t) C0217w.this.m618a()).mo20458x1(m25644a, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217w(InterfaceC6425t interfaceC6425t) {
        super(interfaceC6425t);
        AbstractC5868k.m23674f(interfaceC6425t, "view");
    }

    /* renamed from: b */
    public final void m768b(List list, FavoriteList favoriteList) {
        AbstractC5868k.m23674f(list, "ids");
        C1224f.f4816e.m5631a().m5607p(list).compose(((InterfaceC6425t) m618a()).mo523N3()).subscribe(new a(favoriteList));
    }
}
