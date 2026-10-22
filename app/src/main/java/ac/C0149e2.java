package ac;

import com.request.result.GetLiveDataResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6388g1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.e2 */
/* loaded from: classes2.dex */
public final class C0149e2 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f429b;

    /* renamed from: ac.e2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetLiveDataResult getLiveDataResult) {
            AbstractC5868k.m23674f(getLiveDataResult, "t");
            super.onNext(getLiveDataResult);
            ((InterfaceC6388g1) C0149e2.this.m618a()).mo23609o2(getLiveDataResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6388g1) C0149e2.this.m618a()).mo23607a2(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0149e2.this.m565d();
            C0149e2.this.f429b = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149e2(InterfaceC6388g1 interfaceC6388g1) {
        super(interfaceC6388g1);
        AbstractC5868k.m23674f(interfaceC6388g1, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m565d() {
        Disposable disposable = this.f429b;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f429b = null;
    }

    /* renamed from: e */
    public final void m566e(String str, int i10) {
        AbstractC5868k.m23674f(str, "value");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5610q0(str, i10), ((InterfaceC6388g1) m618a()).mo523N3()).subscribe(new a());
    }
}
