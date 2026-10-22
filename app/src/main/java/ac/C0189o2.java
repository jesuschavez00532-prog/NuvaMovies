package ac;

import com.request.result.TerminalAuthResult;
import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;
import nf.C5884b;
import p030bc.C1224f;
import p301qb.InterfaceC6415p1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.o2 */
/* loaded from: classes2.dex */
public final class C0189o2 extends AbstractC0166j {

    /* renamed from: b */
    private final String f529b;

    /* renamed from: ac.o2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f531c;

        a(String str) {
            this.f531c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(TerminalAuthResult terminalAuthResult) {
            AbstractC5868k.m23674f(terminalAuthResult, "t");
            super.onNext(terminalAuthResult);
            String data = terminalAuthResult.getData();
            boolean z10 = false;
            if (data != null && !AbstractC6567a.m25634d(data)) {
                z10 = true;
            }
            if (z10) {
                String m23717b = C5884b.m23717b(terminalAuthResult.getData());
                if (AbstractC6567a.m25634d(m23717b)) {
                    m23717b = "unknown";
                }
                InterfaceC6415p1 interfaceC6415p1 = (InterfaceC6415p1) C0189o2.this.m618a();
                String str = this.f531c;
                AbstractC5868k.m23673e(m23717b, Constants.KEY_HTTP_CODE);
                interfaceC6415p1.mo524V3(str, m23717b, terminalAuthResult.getData());
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "EA9", "500");
            AbstractC5868k.m23669a(m25644a, "portal200001");
            ((InterfaceC6415p1) C0189o2.this.m618a()).mo522J4(m25644a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189o2(InterfaceC6415p1 interfaceC6415p1) {
        super(interfaceC6415p1);
        AbstractC5868k.m23674f(interfaceC6415p1, "view");
        this.f529b = C0189o2.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m685b(String str, String str2, int i10, String str3) {
        AbstractC5868k.m23674f(str, "authVersion");
        AbstractC5868k.m23674f(str2, "authCode");
        AbstractC5868k.m23674f(str3, "schedulerType");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5626y0(str, str2, i10, str3), ((InterfaceC6415p1) m618a()).mo523N3()).subscribe(new a(str));
    }
}
