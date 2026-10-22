package ac;

import com.request.result.GetNextColumnData;
import com.request.result.GetNextColumnResult;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6399k0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.s0 */
/* loaded from: classes2.dex */
public final class C0203s0 extends AbstractC0166j {

    /* renamed from: ac.s0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f563c;

        a(String str) {
            this.f563c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetNextColumnResult getNextColumnResult) {
            String returnCode;
            boolean z10;
            AbstractC5868k.m23674f(getNextColumnResult, "t");
            super.onNext(getNextColumnResult);
            if (AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "304")) {
                ((InterfaceC6399k0) C0203s0.this.m618a()).mo25215n4(getNextColumnResult, this.f563c);
                return;
            }
            if (getNextColumnResult.getData() != null) {
                GetNextColumnData data = getNextColumnResult.getData();
                AbstractC5868k.m23671c(data);
                if (!AbstractC6567a.m25635e(data.getRecommendList())) {
                    GetNextColumnData data2 = getNextColumnResult.getData();
                    AbstractC5868k.m23671c(data2);
                    if (data2.getVersion().length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        GetNextColumnData data3 = getNextColumnResult.getData();
                        AbstractC5868k.m23671c(data3);
                        C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), this.f563c, data3.getVersion());
                    }
                    ((InterfaceC6399k0) C0203s0.this.m618a()).mo25215n4(getNextColumnResult, this.f563c);
                    return;
                }
            }
            InterfaceC6399k0 interfaceC6399k0 = (InterfaceC6399k0) C0203s0.this.m618a();
            if (!AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "aaa100027") && !AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "aaa100028") && !AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "aaa100083")) {
                returnCode = "portal100023";
            } else {
                returnCode = getNextColumnResult.getReturnCode();
                AbstractC5868k.m23671c(returnCode);
            }
            interfaceC6399k0.mo25214P2(returnCode);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6399k0) C0203s0.this.m618a()).mo25214P2(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203s0(InterfaceC6399k0 interfaceC6399k0) {
        super(interfaceC6399k0);
        AbstractC5868k.m23674f(interfaceC6399k0, "view");
    }

    /* renamed from: b */
    public final void m726b(int i10, int i11, String str) {
        AbstractC5868k.m23674f(str, "columnCode");
        String str2 = str + ';' + i10;
        Observable subscribeOn = C1224f.f4816e.m5631a().m5571T(i10, Integer.valueOf(i11), str, (String) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), str2, "")).subscribeOn(Schedulers.m20294io());
        AbstractC5868k.m23673e(subscribeOn, "PortalHelper.get().getNe…scribeOn(Schedulers.io())");
        AbstractC6567a.m25631a(subscribeOn, ((InterfaceC6399k0) m618a()).mo523N3()).subscribe(new a(str2));
    }
}
