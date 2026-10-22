package ac;

import com.request.result.GetVerifiCodeResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6427t1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.t2 */
/* loaded from: classes2.dex */
public final class C0209t2 extends AbstractC0166j {

    /* renamed from: ac.t2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetVerifiCodeResult getVerifiCodeResult) {
            AbstractC5868k.m23674f(getVerifiCodeResult, "t");
            super.onNext(getVerifiCodeResult);
            if (AbstractC5868k.m23669a(getVerifiCodeResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6427t1) C0209t2.this.m618a()).mo23600w();
            } else {
                ((InterfaceC6427t1) C0209t2.this.m618a()).mo23598C(getVerifiCodeResult.getReturnCode());
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6427t1) C0209t2.this.m618a()).mo23598C(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209t2(InterfaceC6427t1 interfaceC6427t1) {
        super(interfaceC6427t1);
        AbstractC5868k.m23674f(interfaceC6427t1, "view");
    }

    /* renamed from: b */
    public final void m736b(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5594i0(str, str2, str3), ((InterfaceC6427t1) m618a()).mo523N3()).subscribe(new a());
    }
}
