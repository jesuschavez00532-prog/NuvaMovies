package ac;

import com.request.result.CheckVerifiCodeResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6413p;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.s */
/* loaded from: classes2.dex */
public final class C0202s extends AbstractC0166j {

    /* renamed from: ac.s$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(CheckVerifiCodeResult checkVerifiCodeResult) {
            AbstractC5868k.m23674f(checkVerifiCodeResult, "t");
            super.onNext(checkVerifiCodeResult);
            if (AbstractC5868k.m23669a(checkVerifiCodeResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6413p) C0202s.this.m618a()).mo25222F1();
            } else {
                ((InterfaceC6413p) C0202s.this.m618a()).mo25223U4(checkVerifiCodeResult.getReturnCode());
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6413p) C0202s.this.m618a()).mo25223U4(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202s(InterfaceC6413p interfaceC6413p) {
        super(interfaceC6413p);
        AbstractC5868k.m23674f(interfaceC6413p, "view");
    }

    /* renamed from: b */
    public final void m724b(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5605o(str, str2, str3, str4, str5), ((InterfaceC6413p) m618a()).mo523N3()).subscribe(new a());
    }
}
