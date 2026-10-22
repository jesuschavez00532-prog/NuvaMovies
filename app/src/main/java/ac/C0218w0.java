package ac;

import com.request.result.GetQrTokenResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6411o0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.w0 */
/* loaded from: classes2.dex */
public final class C0218w0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f594b;

    /* renamed from: ac.w0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetQrTokenResult getQrTokenResult) {
            AbstractC5868k.m23674f(getQrTokenResult, "t");
            super.onNext(getQrTokenResult);
            ((InterfaceC6411o0) C0218w0.this.m618a()).mo20190b1(getQrTokenResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6411o0) C0218w0.this.m618a()).mo20196s0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218w0(InterfaceC6411o0 interfaceC6411o0) {
        super(interfaceC6411o0);
        AbstractC5868k.m23674f(interfaceC6411o0, "view");
        this.f594b = "GetQrTokenMode";
    }

    /* renamed from: c */
    public static /* synthetic */ void m770c(C0218w0 c0218w0, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "1";
        }
        c0218w0.m771b(str);
    }

    /* renamed from: b */
    public final void m771b(String str) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5577Z(str), ((InterfaceC6411o0) m618a()).mo523N3()).subscribe(new a());
    }
}
