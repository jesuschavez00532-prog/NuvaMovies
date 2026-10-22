package ac;

import com.request.result.GetPackageResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6405m0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.u0 */
/* loaded from: classes2.dex */
public final class C0211u0 extends AbstractC0166j {

    /* renamed from: ac.u0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetPackageResult getPackageResult) {
            AbstractC5868k.m23674f(getPackageResult, "t");
            super.onNext(getPackageResult);
            ((InterfaceC6405m0) C0211u0.this.m618a()).mo20394j4(getPackageResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6405m0) C0211u0.this.m618a()).mo20395r0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211u0(InterfaceC6405m0 interfaceC6405m0) {
        super(interfaceC6405m0);
        AbstractC5868k.m23674f(interfaceC6405m0, "view");
    }

    /* renamed from: b */
    public final void m740b(String str, String str2) {
        AbstractC5868k.m23674f(str, "packageType");
        AbstractC5868k.m23674f(str2, "appVersion");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5573V(str, str2), ((InterfaceC6405m0) m618a()).mo523N3()).subscribe(new a());
    }
}
