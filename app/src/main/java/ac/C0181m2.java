package ac;

import com.request.result.StartPlayLiveResult;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p301qb.InterfaceC6409n1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.m2 */
/* loaded from: classes2.dex */
public final class C0181m2 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f517b;

    /* renamed from: ac.m2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(StartPlayLiveResult startPlayLiveResult) {
            AbstractC5868k.m23674f(startPlayLiveResult, "t");
            super.onNext(startPlayLiveResult);
            if (AbstractC5868k.m23669a(startPlayLiveResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                ((InterfaceC6409n1) C0181m2.this.m618a()).mo18284o4(startPlayLiveResult);
            } else {
                ((InterfaceC6409n1) C0181m2.this.m618a()).mo18283h2("ed3");
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6409n1) C0181m2.this.m618a()).mo18283h2(AbstractC6570d.m25644a(th, "EA7", "500", "ea14"));
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0181m2.this.f517b = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181m2(InterfaceC6409n1 interfaceC6409n1) {
        super(interfaceC6409n1);
        AbstractC5868k.m23674f(interfaceC6409n1, "view");
    }

    /* renamed from: c */
    public final void m671c(String str, Integer num, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "channelCode");
        Disposable disposable = this.f517b;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5620v0(str, num, str2), ((InterfaceC6409n1) m618a()).mo523N3()).subscribe(new a());
    }
}
