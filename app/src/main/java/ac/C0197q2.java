package ac;

import com.request.result.BaseResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6418q1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.q2 */
/* loaded from: classes2.dex */
public final class C0197q2 extends AbstractC0166j {

    /* renamed from: ac.q2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            super.onNext(baseResult);
            ((InterfaceC6418q1) C0197q2.this.m618a()).mo11756u3(baseResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6418q1) C0197q2.this.m618a()).mo11752A0(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0197q2(InterfaceC6418q1 interfaceC6418q1) {
        super(interfaceC6418q1);
        AbstractC5868k.m23674f(interfaceC6418q1, "view");
    }

    /* renamed from: b */
    public final void m712b(String str, String str2) {
        AbstractC5868k.m23674f(str, "password");
        AbstractC5868k.m23674f(str2, "newPwd");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5549A0(str, str2), ((InterfaceC6418q1) m618a()).mo523N3()).subscribe(new a());
    }
}
