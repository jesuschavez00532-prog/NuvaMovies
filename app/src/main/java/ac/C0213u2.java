package ac;

import com.request.result.VerifyEmailCodeResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6430u1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.u2 */
/* loaded from: classes2.dex */
public final class C0213u2 {

    /* renamed from: a */
    private final InterfaceC6430u1 f578a;

    /* renamed from: ac.u2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f580c;

        /* renamed from: d */
        final /* synthetic */ String f581d;

        a(String str, String str2) {
            this.f580c = str;
            this.f581d = str2;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(VerifyEmailCodeResult verifyEmailCodeResult) {
            AbstractC5868k.m23674f(verifyEmailCodeResult, "t");
            super.onNext(verifyEmailCodeResult);
            C0213u2.this.m742a().mo23558x0(this.f580c, this.f581d);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C0213u2.this.m742a().mo23553O2(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0213u2(InterfaceC6430u1 interfaceC6430u1) {
        AbstractC5868k.m23674f(interfaceC6430u1, "view");
        this.f578a = interfaceC6430u1;
    }

    /* renamed from: a */
    public final InterfaceC6430u1 m742a() {
        return this.f578a;
    }

    /* renamed from: b */
    public final void m743b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5555D0(str, str2, str3), this.f578a.mo523N3()).subscribe(new a(str, str3));
    }
}
