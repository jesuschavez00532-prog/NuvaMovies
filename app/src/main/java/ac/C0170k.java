package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6398k;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.k */
/* loaded from: classes2.dex */
public final class C0170k {

    /* renamed from: a */
    private final InterfaceC6398k f474a;

    /* renamed from: ac.k$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f476c;

        /* renamed from: d */
        final /* synthetic */ String f477d;

        a(String str, String str2) {
            this.f476c = str;
            this.f477d = str2;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C0170k.this.m619a().mo23557v1(this.f476c, this.f477d);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C0170k.this.m619a().mo23555X0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0170k(InterfaceC6398k interfaceC6398k) {
        AbstractC5868k.m23674f(interfaceC6398k, "view");
        this.f474a = interfaceC6398k;
    }

    /* renamed from: a */
    public final InterfaceC6398k m619a() {
        return this.f474a;
    }

    /* renamed from: b */
    public final void m620b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "pwd");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5591h(str, str2, str3), this.f474a.mo523N3()).subscribe(new a(str3, str));
    }
}
