package ac;

import com.request.result.SearchByContentResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6445z1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.a2 */
/* loaded from: classes2.dex */
public final class C0133a2 extends AbstractC0166j {

    /* renamed from: b */
    private final String f398b;

    /* renamed from: ac.a2$a */
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
                ((InterfaceC6445z1) C0133a2.this.m618a()).mo25009q5(searchByContentResult.getData());
            } else {
                ((InterfaceC6445z1) C0133a2.this.m618a()).mo25007c6("portal100022");
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6445z1) C0133a2.this.m618a()).mo25007c6(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133a2(InterfaceC6445z1 interfaceC6445z1) {
        super(interfaceC6445z1);
        AbstractC5868k.m23674f(interfaceC6445z1, "view");
        this.f398b = C0133a2.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m529b(String str, String str2, int i10, int i11, int i12) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "contentId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5604n0(str, str2, i10, i11, i12), ((InterfaceC6445z1) m618a()).mo523N3()).subscribe(new a());
    }
}
