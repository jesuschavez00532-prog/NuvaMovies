package ac;

import com.request.result.UserFeedBackResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6424s1;
import p343tb.AbstractC6929a;

/* renamed from: ac.s2 */
/* loaded from: classes2.dex */
public final class C0205s2 extends AbstractC0166j {

    /* renamed from: b */
    private final String f565b;

    /* renamed from: ac.s2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(UserFeedBackResult userFeedBackResult) {
            AbstractC5868k.m23674f(userFeedBackResult, "t");
            super.onNext(userFeedBackResult);
            if (AbstractC5868k.m23669a(userFeedBackResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6424s1) C0205s2.this.m618a()).mo19679U0(userFeedBackResult);
                return;
            }
            InterfaceC6424s1 interfaceC6424s1 = (InterfaceC6424s1) C0205s2.this.m618a();
            String returnCode = userFeedBackResult.getReturnCode();
            AbstractC5868k.m23671c(returnCode);
            interfaceC6424s1.mo19678N5(returnCode);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6424s1) C0205s2.this.m618a()).mo19678N5("");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205s2(InterfaceC6424s1 interfaceC6424s1) {
        super(interfaceC6424s1);
        AbstractC5868k.m23674f(interfaceC6424s1, "view");
        this.f565b = C0205s2.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m728b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "userSug");
        AbstractC5868k.m23674f(str3, "email");
        AbstractC5868k.m23674f(str4, "mobile");
        AbstractC5868k.m23674f(str5, "appVersion");
        AbstractC5868k.m23674f(str6, "pkg");
        AbstractC5868k.m23674f(str7, "userName");
        AbstractC5868k.m23674f(str8, "sysVersion");
        AbstractC5868k.m23674f(str9, "programName");
        AbstractC5868k.m23674f(str10, "customer");
        C1224f.f4816e.m5631a().m5553C0(str, str2, str3, str4, str5, str6, str7, str8, str9, str10).subscribe(new a());
    }
}
