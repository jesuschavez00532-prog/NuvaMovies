package ac;

import com.request.result.StartPlayBTVResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6406m1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.l2 */
/* loaded from: classes2.dex */
public final class C0177l2 extends AbstractC0166j {

    /* renamed from: ac.l2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(StartPlayBTVResult startPlayBTVResult) {
            AbstractC5868k.m23674f(startPlayBTVResult, "t");
            super.onNext(startPlayBTVResult);
            ((InterfaceC6406m1) C0177l2.this.m618a()).mo19230f5(startPlayBTVResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6406m1) C0177l2.this.m618a()).mo19226R2(AbstractC6570d.m25644a(th, "EA7", "500", "ea14"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177l2(InterfaceC6406m1 interfaceC6406m1) {
        super(interfaceC6406m1);
        AbstractC5868k.m23674f(interfaceC6406m1, "view");
    }

    /* renamed from: b */
    public final void m646b(String str, int i10, String str2, String str3) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "channelCode");
        AbstractC5868k.m23674f(str3, "contentId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5618u0(str, i10, str2, str3), ((InterfaceC6406m1) m618a()).mo523N3()).subscribe(new a());
    }
}
