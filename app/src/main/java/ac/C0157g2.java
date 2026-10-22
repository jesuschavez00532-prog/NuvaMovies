package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6394i1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.g2 */
/* loaded from: classes2.dex */
public final class C0157g2 {

    /* renamed from: a */
    private final InterfaceC6394i1 f454a;

    /* renamed from: ac.g2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            C0157g2.this.m602a().mo23559x5();
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C0157g2.this.m602a().mo23552E0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    public C0157g2(InterfaceC6394i1 interfaceC6394i1) {
        AbstractC5868k.m23674f(interfaceC6394i1, "view");
        this.f454a = interfaceC6394i1;
    }

    /* renamed from: a */
    public final InterfaceC6394i1 m602a() {
        return this.f454a;
    }

    /* renamed from: b */
    public final void m603b(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5614s0(str, str2), this.f454a.mo523N3()).subscribe(new a());
    }
}
