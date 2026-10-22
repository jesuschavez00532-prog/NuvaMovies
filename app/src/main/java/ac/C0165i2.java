package ac;

import com.request.result.ShelveMatchResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6400k1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.i2 */
/* loaded from: classes2.dex */
public final class C0165i2 extends AbstractC0166j {

    /* renamed from: ac.i2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(ShelveMatchResult shelveMatchResult) {
            AbstractC5868k.m23674f(shelveMatchResult, "t");
            super.onNext(shelveMatchResult);
            ((InterfaceC6400k1) C0165i2.this.m618a()).mo18314q2(shelveMatchResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6400k1) C0165i2.this.m618a()).mo18310V5(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165i2(InterfaceC6400k1 interfaceC6400k1) {
        super(interfaceC6400k1);
        AbstractC5868k.m23674f(interfaceC6400k1, "view");
    }

    /* renamed from: b */
    public final void m616b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5584d0(), ((InterfaceC6400k1) m618a()).mo523N3()).subscribe(new a());
    }
}
