package ac;

import android.os.SystemClock;
import com.request.result.GetRecommendsResult;
import com.request.result.GetRecommendsResultData;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p123f1.C4216h;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6417q0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.y0 */
/* loaded from: classes2.dex */
public final class C0224y0 extends AbstractC0166j {

    /* renamed from: b */
    private String f607b;

    /* renamed from: c */
    private final String f608c;

    /* renamed from: ac.y0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetRecommendsResult getRecommendsResult) {
            AbstractC5868k.m23674f(getRecommendsResult, "t");
            super.onNext(getRecommendsResult);
            if (getRecommendsResult.getData() != null) {
                GetRecommendsResultData data = getRecommendsResult.getData();
                AbstractC5868k.m23671c(data);
                if (!AbstractC6567a.m25635e(data.getRecommendList())) {
                    ((InterfaceC6417q0) C0224y0.this.m618a()).mo25224E5(getRecommendsResult);
                    C4982a c4982a = C4982a.f20721a;
                    AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
                    c4982a.m20335c(aVar.m24887a(), "service_time_recommends", Long.valueOf((C4216h.f18482a.m17618a() + SystemClock.elapsedRealtime()) - ((Number) c4982a.m20333a(aVar.m24887a(), "dcs_realtime", 0L)).longValue()));
                    return;
                }
            }
            ((InterfaceC6417q0) C0224y0.this.m618a()).mo25225V4("portal100022");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6417q0) C0224y0.this.m618a()).mo25225V4(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224y0(InterfaceC6417q0 interfaceC6417q0, String str) {
        super(interfaceC6417q0);
        AbstractC5868k.m23674f(interfaceC6417q0, "view");
        AbstractC5868k.m23674f(str, "schedulerType");
        this.f607b = str;
        this.f608c = "GetRecommendsModel";
    }

    /* renamed from: b */
    public final void m786b(String[] strArr) {
        AbstractC5868k.m23674f(strArr, "recommendCodeArr");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5580b0(strArr, this.f607b), ((InterfaceC6417q0) m618a()).mo523N3()).subscribe(new a());
    }

    public /* synthetic */ C0224y0(InterfaceC6417q0 interfaceC6417q0, String str, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC6417q0, (i10 & 2) != 0 ? "ioSchedulers" : str);
    }
}
