package ac;

import com.request.result.ApkReceiveCouponResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6374c;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.y1 */
/* loaded from: classes2.dex */
public final class C0225y1 extends AbstractC0166j {

    /* renamed from: b */
    private final String f610b;

    /* renamed from: ac.y1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f612c;

        a(String str) {
            this.f612c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(ApkReceiveCouponResult apkReceiveCouponResult) {
            AbstractC5868k.m23674f(apkReceiveCouponResult, "t");
            super.onNext(apkReceiveCouponResult);
            ((InterfaceC6374c) C0225y1.this.m618a()).mo20434w3(apkReceiveCouponResult, this.f612c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6374c) C0225y1.this.m618a()).mo20431M0(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"), this.f612c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            ((InterfaceC6374c) C0225y1.this.m618a()).mo20433m4(this.f612c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225y1(InterfaceC6374c interfaceC6374c) {
        super(interfaceC6374c);
        AbstractC5868k.m23674f(interfaceC6374c, "view");
        this.f610b = C0225y1.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m788b(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        C1224f.f4816e.m5631a().m5589g(str, str2).compose(((InterfaceC6374c) m618a()).mo523N3()).subscribe(new a(str));
    }
}
