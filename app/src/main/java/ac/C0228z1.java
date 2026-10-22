package ac;

import com.request.result.SearchByContentResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6439x1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.z1 */
/* loaded from: classes2.dex */
public final class C0228z1 extends AbstractC0166j {

    /* renamed from: b */
    private final String f618b;

    /* renamed from: ac.z1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(SearchByContentResult searchByContentResult) {
            AbstractC5868k.m23674f(searchByContentResult, "t");
            super.onNext(searchByContentResult);
            if (!AbstractC6567a.m25635e(searchByContentResult.getData().getAssetList())) {
                ((InterfaceC6439x1) C0228z1.this.m618a()).mo25006Z1(searchByContentResult.getData());
            } else {
                ((InterfaceC6439x1) C0228z1.this.m618a()).mo25005R3("portal100022");
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6439x1) C0228z1.this.m618a()).mo25005R3(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228z1(InterfaceC6439x1 interfaceC6439x1) {
        super(interfaceC6439x1);
        AbstractC5868k.m23674f(interfaceC6439x1, "view");
        this.f618b = C0228z1.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m796b(String str, String str2) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "rows");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5606o0(str, str2), ((InterfaceC6439x1) m618a()).mo523N3()).subscribe(new a());
    }
}
