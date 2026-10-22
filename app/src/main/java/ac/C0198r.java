package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6410o;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.r */
/* loaded from: classes2.dex */
public final class C0198r {

    /* renamed from: a */
    private final InterfaceC6410o f552a;

    /* renamed from: ac.r$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f554c;

        a(String str) {
            this.f554c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C0198r.this.m714a().mo25220S2(this.f554c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C0198r.this.m714a().mo25221l2(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0198r(InterfaceC6410o interfaceC6410o) {
        AbstractC5868k.m23674f(interfaceC6410o, "view");
        this.f552a = interfaceC6410o;
    }

    /* renamed from: a */
    public final InterfaceC6410o m714a() {
        return this.f552a;
    }

    /* renamed from: b */
    public final void m715b(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verifyCode");
        AbstractC5868k.m23674f(str4, "loginType");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5601m(str, str2, str3, str4), this.f552a.mo523N3()).subscribe(new a(str));
    }
}
