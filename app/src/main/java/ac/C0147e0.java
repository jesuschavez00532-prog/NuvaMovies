package ac;

import com.request.result.CheckForceBindResult;
import com.request.result.ForceBindData;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6443z;
import p317rb.AbstractC6567a;
import p343tb.AbstractC6929a;

/* renamed from: ac.e0 */
/* loaded from: classes2.dex */
public final class C0147e0 extends AbstractC0166j {

    /* renamed from: ac.e0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(CheckForceBindResult checkForceBindResult) {
            AbstractC5868k.m23674f(checkForceBindResult, "t");
            super.onNext(checkForceBindResult);
            if (AbstractC5868k.m23669a(checkForceBindResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT) && checkForceBindResult.getData() != null) {
                InterfaceC6443z interfaceC6443z = (InterfaceC6443z) C0147e0.this.m618a();
                ForceBindData data = checkForceBindResult.getData();
                AbstractC5868k.m23671c(data);
                interfaceC6443z.mo25229M3(data);
                return;
            }
            ((InterfaceC6443z) C0147e0.this.m618a()).mo25228A4("");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6443z) C0147e0.this.m618a()).mo25228A4("");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147e0(InterfaceC6443z interfaceC6443z) {
        super(interfaceC6443z);
        AbstractC5868k.m23674f(interfaceC6443z, "view");
    }

    /* renamed from: b */
    public final void m561b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5603n(), ((InterfaceC6443z) m618a()).mo523N3()).subscribe(new a());
    }
}
