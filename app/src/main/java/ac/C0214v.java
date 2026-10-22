package ac;

import com.request.result.BaseResult;
import java.util.List;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6422s;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.v */
/* loaded from: classes2.dex */
public final class C0214v extends AbstractC0166j {

    /* renamed from: ac.v$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
            if (AbstractC5868k.m23669a(baseResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6422s) C0214v.this.m618a()).mo19850a0();
            } else {
                ((InterfaceC6422s) C0214v.this.m618a()).mo19844K3(baseResult.getReturnCode());
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6422s) C0214v.this.m618a()).mo19844K3(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214v(InterfaceC6422s interfaceC6422s) {
        super(interfaceC6422s);
        AbstractC5868k.m23674f(interfaceC6422s, "view");
    }

    /* renamed from: b */
    public final void m745b(String str, List list) {
        AbstractC5868k.m23674f(str, "temToken");
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5611r(list, str), ((InterfaceC6422s) m618a()).mo523N3()).subscribe(new a());
    }
}
