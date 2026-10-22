package p414y8;

import ac.C0199r0;
import ac.C0227z0;
import android.os.Handler;
import android.os.Looper;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.Channel;
import com.request.result.GetLiveDataResult;
import com.request.result.GetLiveDataResultData;
import com.request.result.GetShelveResult;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1407f;
import p135fd.C4307b;
import p301qb.InterfaceC6396j0;
import p301qb.InterfaceC6420r0;
import p348u2.AbstractC7027d;
import p382w8.InterfaceC7381a;
import p382w8.InterfaceC7382b;
import p400xa.C7577i1;
import p400xa.C7581k;
import p430z9.AbstractC7765c;

/* renamed from: y8.c */
/* loaded from: classes2.dex */
public final class C7685c implements InterfaceC7381a, InterfaceC6396j0, InterfaceC6420r0 {

    /* renamed from: a */
    private AbstractC7765c f28124a;

    /* renamed from: b */
    private InterfaceC7382b f28125b;

    /* renamed from: c */
    private final String f28126c;

    /* renamed from: d */
    private final InterfaceC1312h f28127d;

    /* renamed from: e */
    private final InterfaceC1312h f28128e;

    /* renamed from: f */
    private C0227z0 f28129f;

    /* renamed from: y8.c$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0199r0 invoke() {
            return new C0199r0(C7685c.this);
        }
    }

    /* renamed from: y8.c$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f28131a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public C7685c(AbstractC7765c abstractC7765c, InterfaceC7382b interfaceC7382b) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC7382b, "view");
        this.f28124a = abstractC7765c;
        this.f28125b = interfaceC7382b;
        this.f28126c = C7685c.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new a());
        this.f28127d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(b.f28131a);
        this.f28128e = m5965b2;
    }

    /* renamed from: F3 */
    private final C0199r0 m29476F3() {
        return (C0199r0) this.f28127d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m29477G3(C7685c c7685c) {
        AbstractC5868k.m23674f(c7685c, "this$0");
        c7685c.f28125b.mo5454N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m29478J3(C7685c c7685c, GetLiveDataResult getLiveDataResult) {
        AbstractC5868k.m23674f(c7685c, "this$0");
        AbstractC5868k.m23674f(getLiveDataResult, "$getChannelDataResult");
        c7685c.f28125b.mo5452G0(getLiveDataResult);
    }

    /* renamed from: O3 */
    private final Handler m29479O3() {
        return (Handler) this.f28128e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f28125b.mo5458W0();
    }

    @Override // p301qb.InterfaceC6396j0
    /* renamed from: E4 */
    public void mo19518E4(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        m29479O3().post(new Runnable() { // from class: y8.a
            @Override // java.lang.Runnable
            public final void run() {
                C7685c.m29477G3(C7685c.this);
            }
        });
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f28124a.m19902N3();
    }

    @Override // p301qb.InterfaceC6396j0
    /* renamed from: O1 */
    public void mo19519O1(final GetLiveDataResult getLiveDataResult, int i10) {
        AbstractC5868k.m23674f(getLiveDataResult, "getChannelDataResult");
        boolean z10 = false;
        if (AbstractC5868k.m23669a(getLiveDataResult.getReturnCode(), "304")) {
            String m29097f = C7581k.f27855a.m29097f(String.valueOf(i10));
            if (m29097f == null || m29097f.length() == 0) {
                z10 = true;
            }
            if (!z10) {
                GetLiveDataResult getLiveDataResult2 = (GetLiveDataResult) AbstractC7027d.m27114a().fromJson(m29097f, GetLiveDataResult.class);
                C1407f c1407f = C1407f.f5458a;
                GetLiveDataResultData data = getLiveDataResult2.getData();
                AbstractC5868k.m23671c(data);
                List<Channel> channelList = data.getChannelList();
                AbstractC5868k.m23671c(channelList);
                c1407f.m6489N(i10, channelList);
                InterfaceC7382b interfaceC7382b = this.f28125b;
                AbstractC5868k.m23673e(getLiveDataResult2, "channelDataResult");
                interfaceC7382b.mo5452G0(getLiveDataResult2);
                return;
            }
            C7577i1.f27838b.m29083b().m29076h(String.valueOf(i10), "");
            return;
        }
        C1407f c1407f2 = C1407f.f5458a;
        GetLiveDataResultData data2 = getLiveDataResult.getData();
        AbstractC5868k.m23671c(data2);
        List<Channel> channelList2 = data2.getChannelList();
        AbstractC5868k.m23671c(channelList2);
        c1407f2.m6489N(i10, channelList2);
        String json = AbstractC7027d.m27114a().toJson(getLiveDataResult);
        if (json == null || json.length() == 0) {
            z10 = true;
        }
        if (!z10) {
            C7581k c7581k = C7581k.f27855a;
            String valueOf = String.valueOf(i10);
            AbstractC5868k.m23673e(json, "strJson");
            c7581k.m29098g(valueOf, json);
        }
        m29479O3().post(new Runnable() { // from class: y8.b
            @Override // java.lang.Runnable
            public final void run() {
                C7685c.m29478J3(C7685c.this, getLiveDataResult);
            }
        });
    }

    @Override // p382w8.InterfaceC7381a
    /* renamed from: V2 */
    public void mo28491V2(int i10, String str, int i11, int i12, Integer num, int i13) {
        AbstractC5868k.m23674f(str, "columnType");
        C0227z0 c0227z0 = new C0227z0(this);
        this.f28129f = c0227z0;
        c0227z0.m793c(i10, str, i11, i12, num, i13);
    }

    @Override // p382w8.InterfaceC7381a
    /* renamed from: f1 */
    public void mo28492f1(int i10, String str) {
        AbstractC5868k.m23674f(str, "dataVersion");
        C0199r0.m717c(m29476F3(), i10, str, false, 4, null);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: p0 */
    public void mo24951p0(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        this.f28125b.mo5461p0(getShelveResult, i10);
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: q */
    public void mo24952q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f28125b.mo5462q(str, i10);
    }
}
