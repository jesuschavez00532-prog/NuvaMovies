package ac;

import com.request.result.ChildColumn;
import com.request.result.RecommendColumnContentDataBean;
import com.request.result.RecommendColumnContentResult;
import io.reactivex.Observable;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6414p0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7029f;

/* renamed from: ac.x0 */
/* loaded from: classes2.dex */
public final class C0221x0 extends AbstractC0166j {

    /* renamed from: ac.x0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(RecommendColumnContentResult recommendColumnContentResult) {
            List<ChildColumn> list;
            AbstractC5868k.m23674f(recommendColumnContentResult, "t");
            super.onNext(recommendColumnContentResult);
            RecommendColumnContentDataBean data = recommendColumnContentResult.getData();
            if (data != null) {
                list = data.getColumnList();
            } else {
                list = null;
            }
            if (AbstractC6567a.m25638h(list)) {
                InterfaceC6414p0 interfaceC6414p0 = (InterfaceC6414p0) C0221x0.this.m618a();
                RecommendColumnContentDataBean data2 = recommendColumnContentResult.getData();
                AbstractC5868k.m23671c(data2);
                interfaceC6414p0.mo24948L3(data2);
                return;
            }
            ((InterfaceC6414p0) C0221x0.this.m618a()).mo24953y3("portal100022");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6414p0) C0221x0.this.m618a()).mo24953y3(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221x0(InterfaceC6414p0 interfaceC6414p0) {
        super(interfaceC6414p0);
        AbstractC5868k.m23674f(interfaceC6414p0, "view");
    }

    /* renamed from: b */
    public final void m776b(Integer num, String str, int i10, Integer num2, Integer num3, String str2) {
        Observable compose = C1224f.f4816e.m5631a().m5578a0(num, str, i10, num2, num3, str2).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "PortalHelper.get().getRe…chedulerHelper.io2main())");
        AbstractC6567a.m25631a(compose, ((InterfaceC6414p0) m618a()).mo523N3()).subscribe(new a());
    }
}
