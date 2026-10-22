package ac;

import com.request.result.AddSubscribeResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6383f;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.d */
/* loaded from: classes2.dex */
public final class C0142d extends AbstractC0166j {

    /* renamed from: ac.d$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(AddSubscribeResult addSubscribeResult) {
            AbstractC5868k.m23674f(addSubscribeResult, "t");
            super.onNext(addSubscribeResult);
            ((InterfaceC6383f) C0142d.this.m618a()).mo25008k2(addSubscribeResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6383f) C0142d.this.m618a()).mo25004D(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142d(InterfaceC6383f interfaceC6383f) {
        super(interfaceC6383f);
        AbstractC5868k.m23674f(interfaceC6383f, "view");
    }

    /* renamed from: b */
    public final void m546b(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "contentId");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5583d(str, str2), ((InterfaceC6383f) m618a()).mo523N3()).subscribe(new a());
    }
}
