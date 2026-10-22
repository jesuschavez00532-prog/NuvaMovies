package ac;

import com.request.bean.SubTitleResult;
import ne.AbstractC5868k;
import p030bc.C1215c2;
import p301qb.InterfaceC6426t0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.b1 */
/* loaded from: classes2.dex */
public final class C0136b1 extends AbstractC0166j {

    /* renamed from: ac.b1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f403c;

        a(String str) {
            this.f403c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(SubTitleResult subTitleResult) {
            AbstractC5868k.m23674f(subTitleResult, "t");
            super.onNext(subTitleResult);
            ((InterfaceC6426t0) C0136b1.this.m618a()).mo20719S3(subTitleResult, this.f403c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6426t0) C0136b1.this.m618a()).mo20717C5(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136b1(InterfaceC6426t0 interfaceC6426t0) {
        super(interfaceC6426t0);
        AbstractC5868k.m23674f(interfaceC6426t0, "view");
    }

    /* renamed from: b */
    public final void m534b(String str) {
        AbstractC5868k.m23674f(str, "programId");
        AbstractC6567a.m25631a(C1215c2.f4783c.m5518a().m5515f(str), ((InterfaceC6426t0) m618a()).mo523N3()).subscribe(new a(str));
    }
}
