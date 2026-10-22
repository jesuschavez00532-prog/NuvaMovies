package ac;

import cc.C1466m0;
import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p170i2.C4842a;
import p201k2.C5090g;
import p301qb.InterfaceC6428u;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.x */
/* loaded from: classes2.dex */
public final class C0220x {

    /* renamed from: a */
    private final InterfaceC6428u f597a;

    /* renamed from: ac.x$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: b */
        final /* synthetic */ String f598b;

        /* renamed from: c */
        final /* synthetic */ C0220x f599c;

        a(String str, C0220x c0220x) {
            this.f598b = str;
            this.f599c = c0220x;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C1466m0 c1466m0 = C1466m0.f5627a;
            c1466m0.m6875k0(this.f598b);
            if (C4842a.f20329a.m19920a().m19976y()) {
                C5090g c5090g = C5090g.f20948a;
                c5090g.m20656x(c5090g.m20645j(), c1466m0.m6889x());
            }
            this.f599c.m773a().mo23586v6();
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            this.f599c.m773a().mo23585v5(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0220x(InterfaceC6428u interfaceC6428u) {
        AbstractC5868k.m23674f(interfaceC6428u, "view");
        this.f597a = interfaceC6428u;
    }

    /* renamed from: a */
    public final InterfaceC6428u m773a() {
        return this.f597a;
    }

    /* renamed from: b */
    public final void m774b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "password");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5615t(str, str2, str3), this.f597a.mo523N3()).subscribe(new a(str2, this));
    }
}
