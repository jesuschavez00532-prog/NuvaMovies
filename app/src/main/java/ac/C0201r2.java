package ac;

import com.lzy.okgo.model.Progress;
import com.request.result.BaseResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6421r1;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.r2 */
/* loaded from: classes2.dex */
public final class C0201r2 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f559b;

    /* renamed from: ac.r2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            ((InterfaceC6421r1) C0201r2.this.m618a()).mo16991z1();
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6421r1) C0201r2.this.m618a()).mo16980H3(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable m720b;
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            Disposable m720b2 = C0201r2.this.m720b();
            boolean z10 = false;
            if (m720b2 != null && !m720b2.isDisposed()) {
                z10 = true;
            }
            if (z10 && (m720b = C0201r2.this.m720b()) != null) {
                m720b.dispose();
            }
            C0201r2.this.m722d(disposable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201r2(InterfaceC6421r1 interfaceC6421r1) {
        super(interfaceC6421r1);
        AbstractC5868k.m23674f(interfaceC6421r1, "view");
    }

    /* renamed from: b */
    public final Disposable m720b() {
        return this.f559b;
    }

    /* renamed from: c */
    public final void m721c(String str) {
        AbstractC5868k.m23674f(str, Progress.STATUS);
        C1224f.f4816e.m5631a().m5551B0(str).compose(((InterfaceC6421r1) m618a()).mo523N3()).subscribe(new a());
    }

    /* renamed from: d */
    public final void m722d(Disposable disposable) {
        this.f559b = disposable;
    }
}
