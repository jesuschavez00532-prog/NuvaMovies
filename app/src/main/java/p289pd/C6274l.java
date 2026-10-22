package p289pd;

import ac.C0221x0;
import ac.C0227z0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import com.request.result.GetShelveResult;
import com.request.result.RecommendColumnContentDataBean;
import com.vod.R$string;
import gd.EnumC4431a;
import io.reactivex.disposables.Disposable;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p135fd.C4307b;
import p170i2.C4842a;
import p211kc.AbstractC5147b;
import p253nd.InterfaceC5846f;
import p301qb.InterfaceC6414p0;
import p301qb.InterfaceC6420r0;
import p400xa.AbstractC7598p1;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.l */
/* loaded from: classes3.dex */
public final class C6274l implements InterfaceC1439a, InterfaceC6420r0, InterfaceC6414p0 {

    /* renamed from: a */
    private AbstractActivityC7763a f24541a;

    /* renamed from: b */
    private InterfaceC5846f f24542b;

    /* renamed from: c */
    private final String f24543c;

    /* renamed from: d */
    private final InterfaceC1312h f24544d;

    /* renamed from: e */
    private final InterfaceC1312h f24545e;

    /* renamed from: f */
    private final InterfaceC1312h f24546f;

    /* renamed from: pd.l$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0221x0 invoke() {
            return new C0221x0(C6274l.this);
        }
    }

    /* renamed from: pd.l$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0227z0 invoke() {
            return new C0227z0(C6274l.this);
        }
    }

    /* renamed from: pd.l$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f24549a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (C4842a.f20329a.m19920a().m19932I()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
    }

    public C6274l(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5846f interfaceC5846f) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5846f, "view");
        this.f24541a = abstractActivityC7763a;
        this.f24542b = interfaceC5846f;
        this.f24543c = C6274l.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new b());
        this.f24544d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f24545e = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(c.f24549a);
        this.f24546f = m5965b3;
    }

    /* renamed from: F3 */
    private final C0221x0 m24944F3() {
        return (C0221x0) this.f24545e.getValue();
    }

    /* renamed from: G3 */
    private final C0227z0 m24945G3() {
        return (C0227z0) this.f24544d.getValue();
    }

    /* renamed from: J3 */
    private final String m24946J3() {
        return (String) this.f24546f.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f24542b.mo16266h();
    }

    /* renamed from: E3 */
    public void m24947E3(Integer num, String str, int i10) {
        if (AbstractC5147b.m20813b(this.f24541a)) {
            this.f24542b.mo16267x();
            m24944F3().m776b(num, str, 1, 100, null, m24946J3());
        } else {
            AbstractActivityC7763a abstractActivityC7763a = this.f24541a;
            AbstractC7598p1.m29244h(abstractActivityC7763a, abstractActivityC7763a.getString(R$string.net_state_tip_new), 0);
        }
    }

    @Override // p301qb.InterfaceC6414p0
    /* renamed from: L3 */
    public void mo24948L3(RecommendColumnContentDataBean recommendColumnContentDataBean) {
        AbstractC5868k.m23674f(recommendColumnContentDataBean, "data");
        this.f24542b.mo16262Q(recommendColumnContentDataBean);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24541a.m19901Q4(EnumC4431a.DESTROY);
    }

    /* renamed from: O3 */
    public void m24949O3(int i10, int i11, int i12, Integer num) {
        if (AbstractC5147b.m20813b(this.f24541a)) {
            this.f24542b.mo16267x();
            m24945G3().m793c(i10, "2", i11, i12, num, 0);
        } else {
            AbstractActivityC7763a abstractActivityC7763a = this.f24541a;
            AbstractC7598p1.m29244h(abstractActivityC7763a, abstractActivityC7763a.getString(R$string.net_state_tip_new), 0);
        }
    }

    /* renamed from: Y0 */
    public void m24950Y0() {
        Disposable m792b = m24945G3().m792b();
        boolean z10 = false;
        if (m792b != null && !m792b.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            Disposable m792b2 = m24945G3().m792b();
            if (m792b2 != null) {
                m792b2.dispose();
            }
            m24945G3().m794d(null);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: p0 */
    public void mo24951p0(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        this.f24542b.mo16265X(getShelveResult, i10);
        this.f24542b.mo16260F();
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: q */
    public void mo24952q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24542b.mo16261P(str, i10);
        this.f24542b.mo16260F();
    }

    @Override // p301qb.InterfaceC6414p0
    /* renamed from: y3 */
    public void mo24953y3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24542b.mo16264T(str, false);
        this.f24542b.mo16260F();
    }
}
