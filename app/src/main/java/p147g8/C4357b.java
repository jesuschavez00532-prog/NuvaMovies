package p147g8;

import ac.C0181m2;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.event.ToStartPlayEvent;
import com.request.result.Channel;
import com.request.result.LiveAddress;
import com.request.result.StartPlayLiveResult;
import com.request.result.StartPlayLiveResultData;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p040c8.C1407f;
import p043ce.AbstractC1499k;
import p115e8.InterfaceC4143b;
import p115e8.InterfaceC4144c;
import p132fa.AbstractC4298b;
import p135fd.C4307b;
import p301qb.InterfaceC6409n1;
import p317rb.AbstractC6567a;
import p430z9.AbstractActivityC7763a;
import ye.C7709c;

/* renamed from: g8.b */
/* loaded from: classes2.dex */
public final class C4357b implements InterfaceC4143b, InterfaceC6409n1 {

    /* renamed from: a */
    private AbstractActivityC7763a f18960a;

    /* renamed from: b */
    private InterfaceC4144c f18961b;

    /* renamed from: c */
    private final String f18962c;

    /* renamed from: d */
    private final InterfaceC1312h f18963d;

    /* renamed from: g8.b$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0181m2 invoke() {
            return new C0181m2(C4357b.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ List f18965a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(0);
            this.f18965a = list;
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f18965a;
        }
    }

    public C4357b(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4144c interfaceC4144c) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "act");
        AbstractC5868k.m23674f(interfaceC4144c, "view");
        this.f18960a = abstractActivityC7763a;
        this.f18961b = interfaceC4144c;
        this.f18962c = "LiveNewVoiceSearch";
        m5965b = AbstractC1314j.m5965b(new a());
        this.f18963d = m5965b;
    }

    /* renamed from: E3 */
    private final C0181m2 m18279E3() {
        return (C0181m2) this.f18963d.getValue();
    }

    /* renamed from: F3 */
    private final void m18280F3(StartPlayLiveResult startPlayLiveResult) {
        List m6983b;
        boolean z10 = false;
        C1407f c1407f = C1407f.f5458a;
        if (!c1407f.m6486H() && c1407f.m6523o() != -1) {
            List m6515j = c1407f.m6515j(c1407f.m6523o());
            if (m6515j != null && !m6515j.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                m18281G3();
                c1407f.m6502a0(3);
                c1407f.m6501Z(c1407f.m6523o());
                C7709c.m29787d().m29802p(new ToStartPlayEvent("NewVoiceLive"));
            }
        }
        Channel m18282Y0 = m18282Y0(startPlayLiveResult);
        c1407f.m6503b0(true);
        m6983b = AbstractC1499k.m6983b(m18282Y0);
        c1407f.m6508f0(m6983b);
        c1407f.m6506e0(0);
        C7709c.m29787d().m29802p(new ToStartPlayEvent("NewVoiceLive"));
    }

    /* renamed from: G3 */
    private final void m18281G3() {
        C1407f c1407f = C1407f.f5458a;
        List m6509g = c1407f.m6509g(c1407f.m6523o());
        int i10 = 0;
        c1407f.m6514i0(AbstractC4298b.m17990b("last_sort", 0), m6509g, new b(m6509g));
        int size = m6509g.size();
        while (true) {
            if (i10 < size) {
                if (AbstractC5868k.m23669a(((Channel) m6509g.get(i10)).getChannelCode(), this.f18961b.mo11434u2())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        C1407f c1407f2 = C1407f.f5458a;
        c1407f2.m6508f0(m6509g);
        c1407f2.m6506e0(i10);
    }

    /* renamed from: Y0 */
    private final Channel m18282Y0(StartPlayLiveResult startPlayLiveResult) {
        List<LiveAddress> list;
        StartPlayLiveResultData data = startPlayLiveResult.getData();
        List<LiveAddress> list2 = null;
        if (data != null) {
            list = data.getLiveAddressList();
        } else {
            list = null;
        }
        String str = "1";
        if (AbstractC6567a.m25638h(list)) {
            StartPlayLiveResultData data2 = startPlayLiveResult.getData();
            AbstractC5868k.m23671c(data2);
            List<LiveAddress> liveAddressList = data2.getLiveAddressList();
            AbstractC5868k.m23671c(liveAddressList);
            for (LiveAddress liveAddress : liveAddressList) {
                if (liveAddress.getQuality() != null) {
                    String quality = liveAddress.getQuality();
                    AbstractC5868k.m23671c(quality);
                    if (quality.compareTo(str) > 0) {
                        str = liveAddress.getQuality();
                        AbstractC5868k.m23671c(str);
                    }
                }
            }
        }
        String str2 = str;
        String mo11434u2 = this.f18961b.mo11434u2();
        String mo11428C3 = this.f18961b.mo11428C3();
        int mo11429G0 = this.f18961b.mo11429G0();
        StartPlayLiveResultData data3 = startPlayLiveResult.getData();
        if (data3 != null) {
            list2 = data3.getLiveAddressList();
        }
        return new Channel(mo11434u2, mo11428C3, null, mo11429G0, null, null, null, null, MessageService.MSG_DB_READY_REPORT, "LIVE", str2, list2, false, false, "2", this.f18961b.mo11430K2(), "");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p115e8.InterfaceC4143b
    /* renamed from: M1 */
    public void mo17351M1() {
        m18279E3().m671c("1", null, this.f18961b.mo11434u2());
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        C4307b m19900N3 = this.f18960a.m19900N3();
        AbstractC5868k.m23673e(m19900N3, "act.bindToLifecycle()");
        return m19900N3;
    }

    @Override // p301qb.InterfaceC6409n1
    /* renamed from: h2 */
    public void mo18283h2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (AbstractC5868k.m23669a("aaa100002", str)) {
            m18280F3(new StartPlayLiveResult(str, "鉴权失败，按无授权播放收费频道处理", null));
        } else {
            this.f18961b.mo11431M2(str);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6409n1
    /* renamed from: o4 */
    public void mo18284o4(StartPlayLiveResult startPlayLiveResult) {
        AbstractC5868k.m23674f(startPlayLiveResult, "result");
        m18280F3(startPlayLiveResult);
    }
}
