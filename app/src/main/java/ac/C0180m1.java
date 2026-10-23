package ac;

import android.content.Context;
import be.AbstractC1324t;
import be.C1318n;
import be.C1328x;
import cc.C1461k;
import cc.C1466m0;
import com.request.result.LoginResult;
import com.request.result.PortalCodeList;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p030bc.C1224f;
import p043ce.AbstractC1487c0;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6444z0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p359ue.AbstractC7167u;
import p371vb.C7252a;

/* renamed from: ac.m1 */
/* loaded from: classes2.dex */
public final class C0180m1 extends AbstractC0166j {

    /* renamed from: b */
    private String f507b;

    /* renamed from: ac.m1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ boolean f509c;

        /* renamed from: d */
        final /* synthetic */ String f510d;

        /* renamed from: e */
        final /* synthetic */ String f511e;

        /* renamed from: f */
        final /* synthetic */ String f512f;

        /* renamed from: g */
        final /* synthetic */ String f513g;

        a(boolean z10, String str, String str2, String str3, String str4) {
            this.f509c = z10;
            this.f510d = str;
            this.f511e = str2;
            this.f512f = str3;
            this.f513g = str4;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(LoginResult loginResult) {
            HashMap m6937e;
            String str = null;
            HashMap m6937e2;
            HashMap m6937e3;
            HashMap m6937e4;
            List m27748R;
            List m27748R2;
            AbstractC5868k.m23674f(loginResult, "t");
            super.onNext(loginResult);
            if (AbstractC5868k.m23669a(loginResult.getReturnCode(), "aaa100094")) {
                C1461k c1461k = C1461k.f5605a;
                c1461k.m6811k(loginResult.getData().getToken());
                c1461k.m6812l(loginResult.getData().getUserId());
                ((InterfaceC6444z0) C0180m1.this.m618a()).mo18506f0(true, "aaa100094");
                return;
            }
            if (AbstractC5868k.m23669a(loginResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT)) {
                if (this.f509c && !AbstractC6567a.m25635e(loginResult.getData().getPortalCodeList()) && !AbstractC6567a.m25634d(loginResult.getData().getUserId()) && !AbstractC6567a.m25634d(loginResult.getData().getUserToken())) {
                    List<PortalCodeList> portalCodeList = loginResult.getData().getPortalCodeList();
                    AbstractC5868k.m23671c(portalCodeList);
                    if (!AbstractC6567a.m25634d(portalCodeList.get(0).getPortalCode())) {
                        C0180m1.this.m663o(this.f509c, loginResult.getData(), new C1318n(this.f511e, this.f512f), this.f513g);
                        if (!AbstractC6567a.m25634d(loginResult.getData().getRecommCacheTime()) && !AbstractC5868k.m23669a(loginResult.getData().getRecommCacheTime(), MessageService.MSG_DB_READY_REPORT)) {
                            String recommCacheTime = loginResult.getData().getRecommCacheTime();
                            AbstractC5868k.m23671c(recommCacheTime);
                            m27748R2 = AbstractC7167u.m27748R(recommCacheTime, new String[]{","}, false, 0, 6, null);
                            if (m27748R2.isEmpty()) {
                                C4982a c4982a = C4982a.f20721a;
                                Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
                                String recommCacheTime2 = loginResult.getData().getRecommCacheTime();
                                AbstractC5868k.m23671c(recommCacheTime2);
                                c4982a.m20335c(m24887a, "recommends_cache_time", Integer.valueOf(Integer.parseInt(recommCacheTime2)));
                            } else if (m27748R2.size() == 2) {
                                C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "recommends_cache_time", Integer.valueOf(Integer.parseInt((String) m27748R2.get(0)) + Integer.parseInt((String) m27748R2.get(1))));
                            }
                        }
                        if (!AbstractC6567a.m25634d(loginResult.getData().getCacheTime()) && !AbstractC5868k.m23669a(loginResult.getData().getCacheTime(), MessageService.MSG_DB_READY_REPORT)) {
                            String cacheTime = loginResult.getData().getCacheTime();
                            AbstractC5868k.m23671c(cacheTime);
                            m27748R = AbstractC7167u.m27748R(cacheTime, new String[]{","}, false, 0, 6, null);
                            if (m27748R.isEmpty()) {
                                C4982a c4982a2 = C4982a.f20721a;
                                Context m24887a2 = AbstractApplicationC6253c.f24484b.m24887a();
                                String cacheTime2 = loginResult.getData().getCacheTime();
                                AbstractC5868k.m23671c(cacheTime2);
                                c4982a2.m20335c(m24887a2, "column_cache_time", Integer.valueOf(Integer.parseInt(cacheTime2)));
                            } else if (m27748R.size() == 2) {
                                C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "column_cache_time", Integer.valueOf(Integer.parseInt((String) m27748R.get(0)) + Integer.parseInt((String) m27748R.get(1))));
                            }
                        }
                        if (!AbstractC6567a.m25634d(loginResult.getData().getHeartBeatTime()) && !AbstractC5868k.m23669a(loginResult.getData().getHeartBeatTime(), MessageService.MSG_DB_READY_REPORT)) {
                            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "heartbeat_cache_time", Integer.valueOf(Integer.parseInt(loginResult.getData().getHeartBeatTime())));
                            if (loginResult.getData().getAvailableTime() > 0) {
                                C1466m0.f5627a.m6853Z(System.currentTimeMillis() + (loginResult.getData().getAvailableTime() * 1000));
                            }
                        }
                        C4842a c4842a = C4842a.f20329a;
                        InterfaceC4844c m19921b = c4842a.m19921b();
                        if (m19921b != null) {
                            m6937e4 = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", "1"));
                            m19921b.mo19983f(m6937e4);
                        }
                        if (AbstractC6567a.m25637g(this.f513g) && AbstractC5868k.m23669a(loginResult.getData().getPwdTip(), "yes") && AbstractC5868k.m23669a(loginResult.getData().getHasPwd(), "1") && c4842a.m19920a().mo19937N()) {
                            ((InterfaceC6444z0) C0180m1.this.m618a()).mo18504H4(this.f513g, this.f509c, loginResult);
                            return;
                        } else {
                            C1461k.f5605a.m6801a();
                            ((InterfaceC6444z0) C0180m1.this.m618a()).mo18505N(this.f509c, loginResult);
                            return;
                        }
                    }
                }
                boolean z10 = this.f509c;
                if (!z10) {
                    C0180m1.this.m663o(z10, loginResult.getData(), null, this.f513g);
                    InterfaceC6444z0.a.m25230a((InterfaceC6444z0) C0180m1.this.m618a(), this.f509c, null, 2, null);
                    InterfaceC4844c m19921b2 = C4842a.f20329a.m19921b();
                    if (m19921b2 != null) {
                        m6937e3 = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", "1"));
                        m19921b2.mo19983f(m6937e3);
                        return;
                    }
                    return;
                }
                if (!AbstractC5868k.m23669a(loginResult.getReturnCode(), MessageService.MSG_DB_READY_REPORT) && !AbstractC6567a.m25634d(loginResult.getReturnCode())) {
                    str = loginResult.getReturnCode();
                } else {
                    str = "ed2";
                }
                InterfaceC4844c m19921b3 = C4842a.f20329a.m19921b();
                if (m19921b3 != null) {
                    m6937e2 = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                    m19921b3.mo19983f(m6937e2);
                }
                ((InterfaceC6444z0) C0180m1.this.m618a()).mo18506f0(this.f509c, str);
                return;
            }
            C7252a.f27087a.m28084s(true);
            InterfaceC4844c m19921b4 = C4842a.f20329a.m19921b();
            if (m19921b4 != null) {
                m6937e = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                m19921b4.mo19983f(m6937e);
            }
            ((InterfaceC6444z0) C0180m1.this.m618a()).mo18506f0(this.f509c, loginResult.getReturnCode());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            HashMap m6937e;
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C7252a.f27087a.m28084s(true);
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "EA9", "500");
            InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
            if (m19921b != null) {
                m6937e = AbstractC1487c0.m6937e(AbstractC1324t.m5980a("state", MessageService.MSG_DB_READY_REPORT));
                m19921b.mo19983f(m6937e);
            }
            ((InterfaceC6444z0) C0180m1.this.m618a()).mo18506f0(this.f509c, m25644a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.m1$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f514a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m667a(LoginResult loginResult) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m667a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.m1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f515a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m668a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m668a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.m1$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f516a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m669a(Disposable disposable) {
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (c1466m0.m6880o() != 0 && c1466m0.m6880o() <= System.currentTimeMillis()) {
                disposable.dispose();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m669a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180m1(InterfaceC6444z0 interfaceC6444z0, String str) {
        super(interfaceC6444z0);
        AbstractC5868k.m23674f(interfaceC6444z0, "view");
        AbstractC5868k.m23674f(str, "schedulerType");
        this.f507b = str;
    }

    /* renamed from: h */
    public static /* synthetic */ void m657h(C0180m1 c0180m1, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        String str8 = null;
        String str9 = null;
        String str10 = null;
        if ((i10 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str5;
        }
        if ((i10 & 32) != 0) {
            str9 = null;
        } else {
            str9 = str6;
        }
        if ((i10 & 64) != 0) {
            str10 = null;
        } else {
            str10 = str7;
        }
        c0180m1.m664g(str, str2, str3, str4, str8, str9, str10);
    }

    /* renamed from: j */
    public static /* synthetic */ void m658j(C0180m1 c0180m1, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        c0180m1.m665i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m659k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m660l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m661m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m662n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r4 != null) goto L11;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m663o(boolean r23, com.request.result.LoginResultData r24, be.C1318n r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0180m1.m663o(boolean, com.request.result.LoginResultData, be.n, java.lang.String):void");
    }

    /* renamed from: g */
    public final void m664g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = null;
        String str9 = null;
        String str10 = null;
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "userName");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "type");
        String simpleName = C0180m1.class.getSimpleName();
        boolean z10 = !AbstractC5868k.m23669a(str4, MessageService.MSG_DB_READY_REPORT);
        if (z10) {
            C1461k c1461k = C1461k.f5605a;
            if (str5 == null) {
                str8 = "";
            } else {
                str8 = str5;
            }
            if (str7 == null) {
                str9 = "";
            } else {
                str9 = str7;
            }
            if (str6 == null) {
                str10 = "";
            } else {
                str10 = str6;
            }
            c1461k.m6813m(str, str2, str3, str8, str9, str10);
        }
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5598k0(str, str2, str3, str4, str5, str6, str7, this.f507b), ((InterfaceC6444z0) m618a()).mo523N3()).subscribe(new a(z10, simpleName, str2, str3, str));
    }

    /* renamed from: i */
    public final void m665i(String str, String str2) {
        AbstractC5868k.m23674f(str, "oldUserId");
        AbstractC5868k.m23674f(str2, "oldUserToken");
        if (AbstractC6567a.m25634d(str)) {
            str = C1466m0.f5627a.m6878m();
        }
        if (AbstractC6567a.m25634d(str2)) {
            str2 = C1466m0.f5627a.m6879n();
        }
        if (!AbstractC6567a.m25634d(str) && !AbstractC6567a.m25634d(str2)) {
            Observable subscribeOn = C1224f.f4816e.m5631a().m5600l0(str, str2).subscribeOn(Schedulers.m20294io());
            final b bVar = b.f514a;
            Consumer consumer = new Consumer() { // from class: ac.i1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C0180m1.m659k(InterfaceC5660l.this, obj);
                }
            };
            final c cVar = c.f515a;
            Consumer<? super Throwable> consumer2 = new Consumer() { // from class: ac.j1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C0180m1.m660l(InterfaceC5660l.this, obj);
                }
            };
            Action action = new Action() { // from class: ac.k1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C0180m1.m661m();
                }
            };
            final d dVar = d.f516a;
            subscribeOn.subscribe(consumer, consumer2, action, new Consumer() { // from class: ac.l1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C0180m1.m662n(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    public /* synthetic */ C0180m1(InterfaceC6444z0 interfaceC6444z0, String str, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC6444z0, (i10 & 2) != 0 ? "io2main" : str);
    }
}
