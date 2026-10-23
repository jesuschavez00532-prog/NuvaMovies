package ac;

import android.content.Context;
import android.util.Pair;
import be.AbstractC1324t;
import cc.C1446c0;
import cc.C1462k0;
import cc.C1466m0;
import cc.C1472r;
import com.request.result.ActiveResult;
import com.request.result.PortalCodeList;
import java.util.HashMap;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p043ce.AbstractC1487c0;
import p135fd.C4307b;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p185j2.C4982a;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6377d;
import p301qb.InterfaceC6415p1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p359ue.AbstractC7167u;

/* renamed from: ac.a */
/* loaded from: classes2.dex */
public final class C0130a extends AbstractC0166j {

    /* renamed from: b */
    private String f385b;

    /* renamed from: c */
    private int f386c;

    /* renamed from: d */
    private final b f387d;

    /* renamed from: ac.a$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: b */
        final /* synthetic */ String f388b;

        /* renamed from: c */
        final /* synthetic */ String f389c;

        /* renamed from: d */
        final /* synthetic */ C0130a f390d;

        a(String str, String str2, C0130a c0130a) {
            this.f388b = str;
            this.f389c = str2;
            this.f390d = c0130a;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(ActiveResult activeResult) {
            boolean z10 = false;
            String str = null;
            HashMap m6937e;
            HashMap m6937e2;
            List m27748R;
            List m27748R2;
            AbstractC5868k.m23674f(activeResult, "t");
            super.onNext(activeResult);
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (c1466m0.m6868h().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && AbstractC5868k.m23669a(c1466m0.m6868h(), this.f389c)) {
                C1472r.f5652a.m6913i(AbstractApplicationC6253c.f24484b.m24887a());
            }
            if (!AbstractC6567a.m25635e(activeResult.getData().getPortalCodeList()) && !AbstractC6567a.m25634d(activeResult.getData().getUserId()) && !AbstractC6567a.m25634d(activeResult.getData().getUserToken())) {
                List<PortalCodeList> portalCodeList = activeResult.getData().getPortalCodeList();
                AbstractC5868k.m23671c(portalCodeList);
                if (!AbstractC6567a.m25634d(portalCodeList.get(0).getPortalCode())) {
                    this.f390d.m519g(activeResult.getData());
                    if (!AbstractC6567a.m25634d(activeResult.getData().getRecommCacheTime()) && !AbstractC5868k.m23669a(activeResult.getData().getRecommCacheTime(), MessageService.MSG_DB_READY_REPORT)) {
                        String recommCacheTime = activeResult.getData().getRecommCacheTime();
                        AbstractC5868k.m23671c(recommCacheTime);
                        m27748R2 = AbstractC7167u.m27748R(recommCacheTime, new String[]{","}, false, 0, 6, null);
                        if (m27748R2.isEmpty()) {
                            C4982a c4982a = C4982a.f20721a;
                            Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
                            String recommCacheTime2 = activeResult.getData().getRecommCacheTime();
                            AbstractC5868k.m23671c(recommCacheTime2);
                            c4982a.m20335c(m24887a, "recommends_cache_time", Integer.valueOf(Integer.parseInt(recommCacheTime2)));
                        } else if (m27748R2.size() == 2) {
                            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "recommends_cache_time", Integer.valueOf(Integer.parseInt((String) m27748R2.get(0)) + Integer.parseInt((String) m27748R2.get(1))));
                        }
                    }
                    if (!AbstractC6567a.m25634d(activeResult.getData().getCacheTime()) && !AbstractC5868k.m23669a(activeResult.getData().getCacheTime(), MessageService.MSG_DB_READY_REPORT)) {
                        String cacheTime = activeResult.getData().getCacheTime();
                        AbstractC5868k.m23671c(cacheTime);
                        m27748R = AbstractC7167u.m27748R(cacheTime, new String[]{","}, false, 0, 6, null);
                        if (m27748R.isEmpty()) {
                            C4982a c4982a2 = C4982a.f20721a;
                            Context m24887a2 = AbstractApplicationC6253c.f24484b.m24887a();
                            String cacheTime2 = activeResult.getData().getCacheTime();
                            AbstractC5868k.m23671c(cacheTime2);
                            c4982a2.m20335c(m24887a2, "column_cache_time", Integer.valueOf(Integer.parseInt(cacheTime2)));
                        } else if (m27748R.size() == 2) {
                            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "column_cache_time", Integer.valueOf(Integer.parseInt((String) m27748R.get(0)) + Integer.parseInt((String) m27748R.get(1))));
                        }
                    }
                    if (!AbstractC6567a.m25634d(activeResult.getData().getHeartBeatTime()) && !AbstractC5868k.m23669a(activeResult.getData().getHeartBeatTime(), MessageService.MSG_DB_READY_REPORT)) {
                        C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "heartbeat_cache_time", Integer.valueOf(Integer.parseInt(activeResult.getData().getHeartBeatTime())));
                        if (activeResult.getData().getAvailableTime() > 0) {
                            c1466m0.m6853Z(System.currentTimeMillis() + (activeResult.getData().getAvailableTime() * 1000));
                        }
                    }
                    InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
                    if (m19921b != null) {
                        m6937e2 = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", "1"));
                        m19921b.mo19983f(m6937e2);
                    }
                    ((InterfaceC6377d) this.f390d.m618a()).mo25202M5(activeResult);
                    return;
                }
            }
            if (!AbstractC5868k.m23669a(activeResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT) && !AbstractC6567a.m25634d(activeResult.getReturnCode())) {
                str = activeResult.getReturnCode();
            } else {
                str = "ed2";
            }
            InterfaceC4844c m19921b2 = C4842a.f20329a.m19921b();
            if (m19921b2 != null) {
                m6937e = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                m19921b2.mo19983f(m6937e);
            }
            ((InterfaceC6377d) this.f390d.m618a()).mo25203W4(str);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            HashMap m6937e;
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            try {
                String m25644a = AbstractC6570d.m25644a(th, "EA7", "EA9", "500");
                if (AbstractC5868k.m23669a(m25644a, "aaa100080") && C5096m.f20979a.m20692c()) {
                    C1446c0 c1446c0 = C1446c0.f5559a;
                    c1446c0.m6740h();
                    c1446c0.m6739K(AbstractApplicationC6253c.f24484b.m24887a());
                }
                ((InterfaceC6377d) this.f390d.m618a()).mo25203W4(m25644a);
                InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
                if (m19921b != null) {
                    m6937e = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                    m19921b.mo19983f(m6937e);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: ac.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC6415p1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6377d f391a;

        /* renamed from: b */
        final /* synthetic */ C0130a f392b;

        b(InterfaceC6377d interfaceC6377d, C0130a c0130a) {
            this.f391a = interfaceC6377d;
            this.f392b = c0130a;
        }

        @Override // p301qb.InterfaceC6415p1
        /* renamed from: J4 */
        public void mo522J4(String str) {
            HashMap m6937e;
            AbstractC5868k.m23674f(str, "errCode");
            this.f391a.mo25203W4(str);
            InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
            if (m19921b != null) {
                m6937e = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                m19921b.mo19983f(m6937e);
            }
        }

        @Override // p301qb.InterfaceC6433v1
        /* renamed from: N3 */
        public C4307b mo523N3() {
            return this.f391a.mo523N3();
        }

        @Override // p301qb.InterfaceC6415p1
        /* renamed from: V3 */
        public void mo524V3(String str, String str2, String str3) {
            AbstractC5868k.m23674f(str, "authVersion");
            AbstractC5868k.m23674f(str2, "authCode");
            C0130a c0130a = this.f392b;
            c0130a.m518e(str, str2, str3, c0130a.f386c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130a(InterfaceC6377d interfaceC6377d, String str) {
        super(interfaceC6377d);
        AbstractC5868k.m23674f(interfaceC6377d, "view");
        AbstractC5868k.m23674f(str, "schedulerType");
        this.f385b = str;
        this.f387d = new b(interfaceC6377d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m518e(String str, String str2, String str3, int i10) {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5579b(str, str2, str3, i10, "ioSchedulers"), ((InterfaceC6377d) m618a()).mo523N3()).subscribe(new a(C0130a.class.getSimpleName(), str2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m519g(com.request.result.ActiveData r26) {
        /*
            r25 = this;
            cc.m0 r0 = cc.C1466m0.f5627a
            java.lang.String r1 = r26.getUserId()
            java.lang.String r2 = r26.getUserToken()
            java.util.List r3 = r26.getPortalCodeList()
            if (r3 == 0) goto L1f
            r4 = 0
            java.lang.Object r3 = p043ce.AbstractC1498j.m6978t(r3, r4)
            com.request.result.PortalCodeList r3 = (com.request.result.PortalCodeList) r3
            if (r3 == 0) goto L1f
            java.lang.String r3 = r3.getPortalCode()
            if (r3 != 0) goto L21
        L1f:
            java.lang.String r3 = ""
        L21:
            r0.m6871i0(r1, r2, r3)
            java.lang.String r1 = r26.getUserId()
            r0.m6848U(r1)
            z0.k r1 = p421z0.C7737k.f28482a
            java.lang.String r2 = r26.getUserId()
            java.lang.String r3 = r0.m6885t()
            r1.m29917d(r2, r3)
            k2.m r1 = p201k2.C5096m.f20979a
            boolean r1 = r1.m20692c()
            if (r1 == 0) goto L4b
            cc.c0 r1 = cc.C1446c0.f5559a
            pb.c$a r2 = p287pb.AbstractApplicationC6253c.f24484b
            android.content.Context r2 = r2.m24887a()
            r1.m6739K(r2)
        L4b:
            j2.a r1 = p185j2.C4982a.f20721a
            pb.c$a r2 = p287pb.AbstractApplicationC6253c.f24484b
            android.content.Context r3 = r2.m24887a()
            k2.g r4 = p201k2.C5090g.f20948a
            java.lang.String r5 = r4.m20644i()
            java.lang.String r6 = r26.getUserId()
            r1.m20335c(r3, r5, r6)
            android.content.Context r3 = r2.m24887a()
            java.lang.String r5 = r4.m20649n()
            java.lang.String r6 = r26.getUserId()
            r1.m20335c(r3, r5, r6)
            android.content.Context r3 = r2.m24887a()
            java.lang.String r5 = r4.m20650o()
            java.lang.String r6 = r26.getUserIdentity()
            r1.m20335c(r3, r5, r6)
            i2.a r3 = p170i2.C4842a.f20329a
            i2.b r5 = r3.m19920a()
            boolean r5 = r5.mo19943T()
            if (r5 == 0) goto Lbc
            i2.b r5 = r3.m19920a()
            boolean r5 = r5.mo19973v()
            if (r5 == 0) goto La8
            android.content.Context r2 = r2.m24887a()
            java.lang.String r4 = r4.m20647l()
            java.lang.String r5 = r26.getRenewFlag()
            if (r5 != 0) goto La4
            java.lang.String r5 = "2"
        La4:
            r1.m20335c(r2, r4, r5)
            goto Lcf
        La8:
            android.content.Context r2 = r2.m24887a()
            java.lang.String r4 = r4.m20647l()
            java.lang.String r5 = r26.getRenewFlag()
            if (r5 != 0) goto Lb8
            java.lang.String r5 = "1"
        Lb8:
            r1.m20335c(r2, r4, r5)
            goto Lcf
        Lbc:
            android.content.Context r2 = r2.m24887a()
            java.lang.String r4 = r4.m20647l()
            java.lang.String r5 = r26.getRenewFlag()
            if (r5 != 0) goto Lcc
            java.lang.String r5 = "0"
        Lcc:
            r1.m20335c(r2, r4, r5)
        Lcf:
            com.request.result.UserInfo r1 = new com.request.result.UserInfo
            r6 = r1
            java.lang.String r7 = r26.getUserId()
            java.lang.String r8 = r26.getUserToken()
            java.lang.String r9 = r26.getCustomer()
            java.lang.String r10 = r26.getBindMail()
            java.lang.String r11 = r26.getEmail()
            java.lang.String r12 = r26.getHasPay()
            java.lang.String r13 = r26.getRestrictedStatus()
            java.lang.String r14 = r26.getHasPwd()
            java.lang.String r15 = r26.getChildLockPwd()
            java.lang.String r16 = r26.getUserIdentity()
            java.lang.String r17 = r26.getAppModel()
            java.util.List r18 = r26.getPortalCodeList()
            java.lang.String r19 = r26.getAccountType()
            java.lang.String r20 = r26.getActiveTime()
            java.lang.String r21 = r26.getAreaCode()
            java.lang.String r22 = r26.getMobile()
            java.lang.String r23 = r26.getBindMobile()
            java.lang.String r24 = r26.getPlaylistUrl()
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.m6869h0(r1)
            cc.h0 r0 = cc.C1456h0.f5574a
            r0.m6772h()
            i2.c r0 = r3.m19921b()
            if (r0 == 0) goto L12e
            r0.mo19990m()
        L12e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0130a.m519g(com.request.result.ActiveData):void");
    }

    /* renamed from: f */
    public final void m520f(int i10) {
        String m6868h = null;
        String str = null;
        this.f386c = i10;
        C0189o2 c0189o2 = new C0189o2(this.f387d);
        if (C5096m.f20979a.m20691b()) {
            Pair m6818d = C1462k0.f5614a.m6818d();
            Object obj = m6818d.first;
            AbstractC5868k.m23673e(obj, "authInfo.first");
            str = (String) obj;
            Object obj2 = m6818d.second;
            AbstractC5868k.m23673e(obj2, "authInfo.second");
            m6868h = (String) obj2;
        } else {
            m6868h = C1466m0.f5627a.m6868h();
            str = "";
        }
        C1466m0.f5627a.m6871i0("", "", "");
        if (C1462k0.f5614a.m6819f()) {
            c0189o2.m685b(str, m6868h, this.f386c, this.f385b);
        } else {
            m518e(str, m6868h, null, this.f386c);
        }
    }

    public /* synthetic */ C0130a(InterfaceC6377d interfaceC6377d, String str, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC6377d, (i10 & 2) != 0 ? "syncIoSchedulers" : str);
    }
}
