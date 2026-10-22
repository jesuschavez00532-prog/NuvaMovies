package ac;

import com.request.result.GetDeviceResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6381e0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.l0 */
/* loaded from: classes2.dex */
public final class C0175l0 extends AbstractC0166j {

    /* renamed from: ac.l0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f500c;

        /* renamed from: d */
        final /* synthetic */ boolean f501d;

        a(String str, boolean z10) {
            this.f500c = str;
            this.f501d = z10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetDeviceResult getDeviceResult) {
            AbstractC5868k.m23674f(getDeviceResult, "t");
            if (AbstractC5868k.m23669a(getDeviceResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6381e0) C0175l0.this.m618a()).mo23556u6(getDeviceResult, this.f500c, this.f501d);
            } else {
                ((InterfaceC6381e0) C0175l0.this.m618a()).mo23554T4(getDeviceResult.getReturnCode(), this.f501d);
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6381e0) C0175l0.this.m618a()).mo23554T4(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"), this.f501d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175l0(InterfaceC6381e0 interfaceC6381e0) {
        super(interfaceC6381e0);
        AbstractC5868k.m23674f(interfaceC6381e0, "view");
    }

    /* renamed from: c */
    public static /* synthetic */ void m643c(C0175l0 c0175l0, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c0175l0.m644b(str, z10);
    }

    /* renamed from: b */
    public final void m644b(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "temToken");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5552C(str), ((InterfaceC6381e0) m618a()).mo523N3()).subscribe(new a(str, z10));
    }
}
