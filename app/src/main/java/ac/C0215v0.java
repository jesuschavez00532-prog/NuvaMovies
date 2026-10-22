package ac;

import com.request.result.GetQrResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6408n0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.v0 */
/* loaded from: classes2.dex */
public final class C0215v0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f583b;

    /* renamed from: ac.v0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetQrResult getQrResult) {
            AbstractC5868k.m23674f(getQrResult, "t");
            super.onNext(getQrResult);
            if (AbstractC5868k.m23669a(getQrResult.getReturnCode(), "aaa100094")) {
                ((InterfaceC6408n0) C0215v0.this.m618a()).mo20197t1(getQrResult.getReturnCode());
            } else {
                ((InterfaceC6408n0) C0215v0.this.m618a()).mo20194j5(getQrResult);
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6408n0) C0215v0.this.m618a()).mo20197t1(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215v0(InterfaceC6408n0 interfaceC6408n0) {
        super(interfaceC6408n0);
        AbstractC5868k.m23674f(interfaceC6408n0, "view");
        this.f583b = "GetQrResultMode";
    }

    /* renamed from: c */
    public static /* synthetic */ void m747c(C0215v0 c0215v0, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "1";
        }
        c0215v0.m748b(str, str2);
    }

    /* renamed from: b */
    public final void m748b(String str, String str2) {
        AbstractC5868k.m23674f(str, "qrToken");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5576Y(str2, str), ((InterfaceC6408n0) m618a()).mo523N3()).subscribe(new a());
    }
}
