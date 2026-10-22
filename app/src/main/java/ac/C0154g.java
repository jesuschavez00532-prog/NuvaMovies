package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6389h;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.g */
/* loaded from: classes2.dex */
public final class C0154g extends AbstractC0166j {

    /* renamed from: b */
    private final String f446b;

    /* renamed from: ac.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            ((InterfaceC6389h) C0154g.this.m618a()).mo20198y5(baseResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6389h) C0154g.this.m618a()).mo20195p1(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154g(InterfaceC6389h interfaceC6389h) {
        super(interfaceC6389h);
        AbstractC5868k.m23674f(interfaceC6389h, "view");
        this.f446b = "AllowLoginMode";
    }

    /* renamed from: c */
    public static /* synthetic */ void m591c(C0154g c0154g, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = "1";
        }
        c0154g.m592b(str, str2, str3);
    }

    /* renamed from: b */
    public final void m592b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "isAllow");
        AbstractC5868k.m23674f(str2, "qrToken");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5585e(str3, str, str2), ((InterfaceC6389h) m618a()).mo523N3()).subscribe(new a());
    }
}
