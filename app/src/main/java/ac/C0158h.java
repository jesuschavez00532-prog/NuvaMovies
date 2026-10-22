package ac;

import com.request.result.GetAreaCodeResult;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6392i;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.h */
/* loaded from: classes2.dex */
public final class C0158h extends AbstractC0166j {

    /* renamed from: ac.h$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetAreaCodeResult getAreaCodeResult) {
            AbstractC5868k.m23674f(getAreaCodeResult, "t");
            super.onNext(getAreaCodeResult);
            if (AbstractC5868k.m23669a(getAreaCodeResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6392i) C0158h.this.m618a()).mo23593U3(getAreaCodeResult);
            } else {
                ((InterfaceC6392i) C0158h.this.m618a()).mo23595v2(getAreaCodeResult.getReturnCode());
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6392i) C0158h.this.m618a()).mo23595v2(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158h(InterfaceC6392i interfaceC6392i) {
        super(interfaceC6392i);
        AbstractC5868k.m23674f(interfaceC6392i, "view");
    }

    /* renamed from: b */
    public final void m605b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5625y(), ((InterfaceC6392i) m618a()).mo523N3()).subscribe(new a());
    }
}
