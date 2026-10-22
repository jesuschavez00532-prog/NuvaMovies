package ac;

import android.os.SystemClock;
import android.text.TextUtils;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p123f1.C4216h;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6375c0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7027d;

/* renamed from: ac.h0 */
/* loaded from: classes2.dex */
public final class C0159h0 extends AbstractC0166j {

    /* renamed from: b */
    private String f457b;

    /* renamed from: c */
    private String f458c;

    /* renamed from: ac.h0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ int f460c;

        a(int i10) {
            this.f460c = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetColumnContentsResult getColumnContentsResult) {
            List<ChildColumn> list;
            AbstractC5868k.m23674f(getColumnContentsResult, "t");
            super.onNext(getColumnContentsResult);
            GetColumnContentsResultData data = getColumnContentsResult.getData();
            if (data != null) {
                list = data.getChildColumnList();
            } else {
                list = null;
            }
            if (!AbstractC6567a.m25635e(list)) {
                ((InterfaceC6375c0) C0159h0.this.m618a()).mo23209L2(getColumnContentsResult, this.f460c);
                String json = AbstractC7027d.m27114a().toJson(getColumnContentsResult);
                if (!TextUtils.isEmpty(json)) {
                    InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
                    if (m19921b != null) {
                        String str = "column_data_" + this.f460c;
                        AbstractC5868k.m23673e(json, "toJson");
                        m19921b.mo19985h(str, json);
                    }
                    C4982a c4982a = C4982a.f20721a;
                    AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
                    long m17618a = (C4216h.f18482a.m17618a() + SystemClock.elapsedRealtime()) - ((Number) c4982a.m20333a(aVar.m24887a(), "dcs_realtime", 0L)).longValue();
                    c4982a.m20335c(aVar.m24887a(), "service_time_column_" + this.f460c, Long.valueOf(m17618a));
                    return;
                }
                return;
            }
            ((InterfaceC6375c0) C0159h0.this.m618a()).mo23211S5("portal100022", this.f460c, true);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6375c0) C0159h0.this.m618a()).mo23211S5(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"), this.f460c, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159h0(InterfaceC6375c0 interfaceC6375c0, String str) {
        super(interfaceC6375c0);
        AbstractC5868k.m23674f(interfaceC6375c0, "view");
        AbstractC5868k.m23674f(str, "schedulerType");
        this.f457b = str;
        this.f458c = "GetColumnContentsModel";
    }

    /* renamed from: b */
    public final void m607b(Integer num, String str, int i10, Integer num2, Integer num3, int i11, String str2) {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5548A(num, str, i10, num2, num3, str2, this.f457b), ((InterfaceC6375c0) m618a()).mo523N3()).subscribe(new a(i11));
    }

    public /* synthetic */ C0159h0(InterfaceC6375c0 interfaceC6375c0, String str, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC6375c0, (i10 & 2) != 0 ? "io2main" : str);
    }
}
