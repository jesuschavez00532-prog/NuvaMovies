package ac;

import com.request.result.EpgResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6431v;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.y */
/* loaded from: classes2.dex */
public final class C0223y extends AbstractC0166j {

    /* renamed from: ac.y$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f606c;

        a(String str) {
            this.f606c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(EpgResult epgResult) {
            AbstractC5868k.m23674f(epgResult, "t");
            super.onNext(epgResult);
            ((InterfaceC6431v) C0223y.this.m618a()).mo18475N1(epgResult.getData(), this.f606c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6431v) C0223y.this.m618a()).mo18478w2(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f606c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223y(InterfaceC6431v interfaceC6431v) {
        super(interfaceC6431v);
        AbstractC5868k.m23674f(interfaceC6431v, "view");
    }

    /* renamed from: c */
    public static /* synthetic */ void m783c(C0223y c0223y, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c0223y.m784b(str, i10, str2);
    }

    /* renamed from: b */
    public final void m784b(String str, int i10, String str2) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5575X(str, i10), ((InterfaceC6431v) m618a()).mo523N3()).subscribe(new a(str2));
    }
}
