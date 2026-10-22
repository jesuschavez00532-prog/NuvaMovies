package ac;

import com.request.result.AssetList;
import com.request.result.FilterByContentResult;
import com.request.result.FilterByContentResultData;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6442y1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.a0 */
/* loaded from: classes2.dex */
public final class C0131a0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f393b;

    /* renamed from: ac.a0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FilterByContentResult filterByContentResult) {
            List<AssetList> list;
            AbstractC5868k.m23674f(filterByContentResult, "t");
            super.onNext(filterByContentResult);
            FilterByContentResultData data = filterByContentResult.getData();
            if (data != null) {
                list = data.getAssetList();
            } else {
                list = null;
            }
            if (AbstractC6567a.m25638h(list)) {
                ((InterfaceC6442y1) C0131a0.this.m618a()).mo24932F2(filterByContentResult.getData());
            } else {
                ((InterfaceC6442y1) C0131a0.this.m618a()).mo24933P0();
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6442y1) C0131a0.this.m618a()).mo24931B4(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131a0(InterfaceC6442y1 interfaceC6442y1) {
        super(interfaceC6442y1);
        AbstractC5868k.m23674f(interfaceC6442y1, "view");
        this.f393b = C0131a0.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m525b(String str, String str2, String str3, String str4, int i10, int i11, int i12) {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5619v(str, str2, str3, str4, i10, i11, i12), ((InterfaceC6442y1) m618a()).mo523N3()).subscribe(new a());
    }
}
