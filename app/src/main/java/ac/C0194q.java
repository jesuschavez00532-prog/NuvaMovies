package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6407n;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.q */
/* loaded from: classes2.dex */
public final class C0194q {

    /* renamed from: a */
    private final InterfaceC6407n f543a;

    /* renamed from: ac.q$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f545c;

        a(String str) {
            this.f545c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C0194q.this.m700a().mo23572l5(this.f545c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C0194q.this.m700a().mo23569R0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0194q(InterfaceC6407n interfaceC6407n) {
        AbstractC5868k.m23674f(interfaceC6407n, "view");
        this.f543a = interfaceC6407n;
    }

    /* renamed from: a */
    public final InterfaceC6407n m700a() {
        return this.f543a;
    }

    /* renamed from: b */
    public final void m701b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5599l(str, str2, str3), this.f543a.mo523N3()).subscribe(new a(str));
    }
}
