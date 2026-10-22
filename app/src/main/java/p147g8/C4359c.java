package p147g8;

import com.module.event.SelectAllChannelTabEvent;
import com.module.event.SetVoiceSearchLiveDataEvent;
import com.module.event.StopLiveStreamEvent;
import com.module.event.ToStartPlayVoiceSearchEvent;
import com.request.result.Channel;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1407f;
import p115e8.InterfaceC4145d;
import p115e8.InterfaceC4146e;
import p132fa.AbstractC4298b;
import p153h2.AbstractC4509b;
import p317rb.AbstractC6567a;
import p430z9.AbstractActivityC7763a;
import ye.C7709c;

/* renamed from: g8.c */
/* loaded from: classes2.dex */
public final class C4359c implements InterfaceC4145d {

    /* renamed from: a */
    private AbstractActivityC7763a f18967a;

    /* renamed from: b */
    private InterfaceC4146e f18968b;

    /* renamed from: c */
    private final String f18969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ List f18970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(0);
            this.f18970a = list;
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f18970a;
        }
    }

    public C4359c(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4146e interfaceC4146e) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "act");
        AbstractC5868k.m23674f(interfaceC4146e, "view");
        this.f18967a = abstractActivityC7763a;
        this.f18968b = interfaceC4146e;
        this.f18969c = C4359c.class.getSimpleName();
    }

    /* renamed from: a */
    private final void m18287a(String str) {
        C1407f c1407f = C1407f.f5458a;
        List m6509g = c1407f.m6509g(c1407f.m6523o());
        if (AbstractC6567a.m25635e(m6509g)) {
            return;
        }
        c1407f.m6514i0(AbstractC4298b.m17990b("last_sort", 0), m6509g, new a(m6509g));
        int size = m6509g.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (AbstractC5868k.m23669a(((Channel) m6509g.get(i10)).getChannelCode(), str)) {
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
        AbstractC4509b.m18869b(this.f18969c, "current set play channel index: " + i10, new Object[0]);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p115e8.InterfaceC4145d
    /* renamed from: c0 */
    public void mo17352c0(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        m18287a(str);
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6502a0(3);
        c1407f.m6501Z(c1407f.m6523o());
        C7709c.m29787d().m29802p(new ToStartPlayVoiceSearchEvent());
        C7709c.m29787d().m29802p(new SetVoiceSearchLiveDataEvent());
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p115e8.InterfaceC4145d
    /* renamed from: o1 */
    public void mo17353o1() {
        C7709c.m29787d().m29801m(new SelectAllChannelTabEvent());
    }

    @Override // p115e8.InterfaceC4145d
    /* renamed from: w1 */
    public void mo17354w1() {
        C7709c.m29787d().m29801m(new StopLiveStreamEvent());
    }
}
