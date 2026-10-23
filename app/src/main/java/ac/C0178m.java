package ac;

import cc.C1466m0;
import com.request.result.BindPhoneResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6401l;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.m */
/* loaded from: classes2.dex */
public final class C0178m extends AbstractC0166j {

    /* renamed from: ac.m$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: b */
        final /* synthetic */ String f504b;

        /* renamed from: c */
        final /* synthetic */ C0178m f505c;

        a(String str, C0178m c0178m) {
            this.f504b = str;
            this.f505c = c0178m;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BindPhoneResult bindPhoneResult) {
            boolean z10 = false;
            AbstractC5868k.m23674f(bindPhoneResult, "t");
            super.onNext(bindPhoneResult);
            if (AbstractC5868k.m23669a(bindPhoneResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                String str = this.f504b;
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    C1466m0.f5627a.m6875k0(this.f504b);
                }
                ((InterfaceC6401l) this.f505c.m618a()).mo25216n6();
                return;
            }
            InterfaceC6401l interfaceC6401l = (InterfaceC6401l) this.f505c.m618a();
            String returnCode = bindPhoneResult.getReturnCode();
            if (returnCode == null) {
                returnCode = "";
            }
            interfaceC6401l.mo25217t2(returnCode);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6401l) this.f505c.m618a()).mo25217t2(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178m(InterfaceC6401l interfaceC6401l) {
        super(interfaceC6401l);
        AbstractC5868k.m23674f(interfaceC6401l, "view");
    }

    /* renamed from: b */
    public final void m648b(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "phone");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5595j(str, str2, str3, str4), ((InterfaceC6401l) m618a()).mo523N3()).subscribe(new a(str4, this));
    }
}
