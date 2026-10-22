package p192j9;

import ac.C0162i;
import ac.C0180m1;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.module.event.LogoutEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.request.result.LoginResult;
import com.umeng.analytics.MobclickAgent;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p135fd.C4307b;
import p160h9.InterfaceC4725c;
import p160h9.InterfaceC4727d;
import p217l2.InterfaceC5342c;
import p301qb.InterfaceC6368a;
import p301qb.InterfaceC6444z0;
import p430z9.AbstractC7765c;
import ye.C7709c;

/* renamed from: j9.b */
/* loaded from: classes2.dex */
public final class C5016b implements InterfaceC4725c, InterfaceC6444z0, InterfaceC6368a {

    /* renamed from: a */
    private AbstractC7765c f20773a;

    /* renamed from: b */
    private InterfaceC4727d f20774b;

    /* renamed from: c */
    private String f20775c;

    /* renamed from: d */
    private String f20776d;

    /* renamed from: e */
    private final InterfaceC1312h f20777e;

    /* renamed from: f */
    private final InterfaceC1312h f20778f;

    /* renamed from: j9.b$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(C5016b.this, null, 2, null);
        }
    }

    /* renamed from: j9.b$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0162i invoke() {
            return new C0162i(C5016b.this);
        }
    }

    public C5016b(AbstractC7765c abstractC7765c, InterfaceC4727d interfaceC4727d) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4727d, "view");
        this.f20773a = abstractC7765c;
        this.f20774b = interfaceC4727d;
        this.f20775c = "";
        this.f20776d = "";
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20777e = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new b());
        this.f20778f = m5965b2;
    }

    /* renamed from: E3 */
    private final C0162i m20401E3() {
        return (C0162i) this.f20778f.getValue();
    }

    /* renamed from: Y0 */
    private final C0180m1 m20402Y0() {
        return (C0180m1) this.f20777e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        if (C1466m0.f5627a.m6887v() != null) {
            mo19586m2();
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "accountType");
        this.f20774b.mo19590e();
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        if (!z10) {
            this.f20774b.mo19588O3();
            MobclickAgent.onProfileSignOff();
            C7709c.m29787d().m29801m(new LogoutEvent());
            InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c != null) {
                interfaceC5342c.mo21615b();
            }
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20773a.m19902N3();
    }

    @Override // p160h9.InterfaceC4725c
    /* renamed from: T */
    public void mo19584T() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        String m6888w = c1466m0.m6888w();
        m20402Y0().m664g(c1466m0.m6860d(), m6888w, c1466m0.m6889x(), MessageService.MSG_DB_READY_REPORT, c1466m0.m6864f(), null, c1466m0.m6890y());
    }

    @Override // p160h9.InterfaceC4725c
    /* renamed from: T1 */
    public void mo19585T1() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        this.f20775c = c1466m0.m6878m();
        this.f20776d = c1466m0.m6879n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // p301qb.InterfaceC6368a
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo20403d0(com.request.result.GetAuthInfoResult r5) {
        /*
            r4 = this;
            java.lang.String r0 = "result"
            ne.AbstractC5868k.m23674f(r5, r0)
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getUserIdentity()
            goto L12
        L11:
            r0 = r1
        L12:
            boolean r0 = p317rb.AbstractC6567a.m25637g(r0)
            if (r0 == 0) goto L51
            com.request.result.GetAuthInfoResultData r0 = r5.getData()
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.getUserIdentity()
            goto L24
        L23:
            r0 = r1
        L24:
            cc.m0 r2 = cc.C1466m0.f5627a
            com.request.result.UserInfo r3 = r2.m6887v()
            if (r3 == 0) goto L31
            java.lang.String r3 = r3.getUserIdentity()
            goto L32
        L31:
            r3 = r1
        L32:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r3)
            if (r0 != 0) goto L51
            com.request.result.UserInfo r0 = r2.m6887v()
            if (r0 != 0) goto L3f
            goto L4f
        L3f:
            com.request.result.GetAuthInfoResultData r2 = r5.getData()
            if (r2 == 0) goto L49
            java.lang.String r1 = r2.getUserIdentity()
        L49:
            ne.AbstractC5868k.m23671c(r1)
            r0.setUserIdentity(r1)
        L4f:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            cc.m0 r1 = cc.C1466m0.f5627a
            com.request.result.UserInfo r1 = r1.m6887v()
            if (r1 != 0) goto L5b
            goto L6c
        L5b:
            com.request.result.GetAuthInfoResultData r5 = r5.getData()
            if (r5 == 0) goto L67
            java.lang.String r5 = r5.getPlaylistUrl()
            if (r5 != 0) goto L69
        L67:
            java.lang.String r5 = ""
        L69:
            r1.setPlaylistUrl(r5)
        L6c:
            ye.c r5 = ye.C7709c.m29787d()
            com.module.event.RefreshUerInfoDisplayEvent r1 = new com.module.event.RefreshUerInfoDisplayEvent
            r1.<init>(r0)
            r5.m29801m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p192j9.C5016b.mo20403d0(com.request.result.GetAuthInfoResult):void");
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20774b.mo19589Q4();
    }

    @Override // p301qb.InterfaceC6368a
    /* renamed from: m0 */
    public void mo20404m0(String str) {
        if (!AbstractC5868k.m23669a("aaa100028", str) && !AbstractC5868k.m23669a("aaa100027", str)) {
            C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
        } else if (!TextUtils.isEmpty(str)) {
            InterfaceC4727d interfaceC4727d = this.f20774b;
            if (str == null) {
                str = "";
            }
            interfaceC4727d.mo19591j0(str);
        }
    }

    @Override // p160h9.InterfaceC4725c
    /* renamed from: m2 */
    public void mo19586m2() {
        m20401E3().m614c("1");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p160h9.InterfaceC4725c
    /* renamed from: t0 */
    public void mo19587t0() {
        m20402Y0().m665i(this.f20775c, this.f20776d);
    }
}
