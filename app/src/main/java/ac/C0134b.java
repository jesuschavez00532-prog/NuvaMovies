package ac;

import com.request.result.AddFavoriteResult;
import com.request.result.FavIdData;
import com.request.result.FavIdDataItem;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6380e;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.b */
/* loaded from: classes2.dex */
public final class C0134b extends AbstractC0166j {

    /* renamed from: ac.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
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
                InterfaceC6380e interfaceC6380e = (InterfaceC6380e) C0134b.this.m618a();
                FavIdData data2 = addFavoriteResult.getData();
                AbstractC5868k.m23671c(data2);
                List<FavIdDataItem> favoriteList2 = data2.getFavoriteList();
                AbstractC5868k.m23671c(favoriteList2);
                interfaceC6380e.mo20455n(favoriteList2);
                return;
            }
            ((InterfaceC6380e) C0134b.this.m618a()).mo20457s("error code");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6380e) C0134b.this.m618a()).mo20457s(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134b(InterfaceC6380e interfaceC6380e) {
        super(interfaceC6380e);
        AbstractC5868k.m23674f(interfaceC6380e, "view");
    }

    /* renamed from: c */
    public static /* synthetic */ void m531c(C0134b c0134b, String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c0134b.m532b(str, list, z10);
    }

    /* renamed from: b */
    public final void m532b(String str, List list, boolean z10) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(list, "contentId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5581c(str, list, z10), ((InterfaceC6380e) m618a()).mo523N3()).subscribe(new a());
    }
}
