package ac;

import com.request.result.GetShelveResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6420r0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.z0 */
/* loaded from: classes2.dex */
public final class C0227z0 extends AbstractC0166j {

    /* renamed from: b */
    private String f614b;

    /* renamed from: c */
    private Disposable f615c;

    /* renamed from: ac.z0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ int f617c;

        a(int i10) {
            this.f617c = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetShelveResult getShelveResult) {
            AbstractC5868k.m23674f(getShelveResult, "t");
            super.onNext(getShelveResult);
            ((InterfaceC6420r0) C0227z0.this.m618a()).mo24951p0(getShelveResult, this.f617c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6420r0) C0227z0.this.m618a()).mo24952q(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f617c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable m792b;
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            Disposable m792b2 = C0227z0.this.m792b();
            boolean z10 = false;
            if (m792b2 != null && !m792b2.isDisposed()) {
                z10 = true;
            }
            if (z10 && (m792b = C0227z0.this.m792b()) != null) {
                m792b.dispose();
            }
            C0227z0.this.m794d(disposable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227z0(InterfaceC6420r0 interfaceC6420r0) {
        super(interfaceC6420r0);
        AbstractC5868k.m23674f(interfaceC6420r0, "view");
        this.f614b = C0227z0.class.getSimpleName();
    }

    /* renamed from: b */
    public final Disposable m792b() {
        return this.f615c;
    }

    /* renamed from: c */
    public final void m793c(int i10, String str, int i11, int i12, Integer num, int i13) {
        AbstractC5868k.m23674f(str, "columnType");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5582c0(i10, str, i11, i12, num, i13), ((InterfaceC6420r0) m618a()).mo523N3()).subscribe(new a(i10));
    }

    /* renamed from: d */
    public final void m794d(Disposable disposable) {
        this.f615c = disposable;
    }
}
