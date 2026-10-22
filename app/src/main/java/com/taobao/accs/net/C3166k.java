package com.taobao.accs.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.ISessionListener;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p073ut.p074a.C3183c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3207t;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.k */
/* loaded from: classes.dex */
public class C3166k extends AbstractC3156a implements DataFrameCb {

    /* renamed from: o */
    private boolean f13016o;

    /* renamed from: p */
    private long f13017p;

    /* renamed from: q */
    private ScheduledFuture f13018q;

    /* renamed from: r */
    private Handler f13019r;

    /* renamed from: s */
    private Runnable f13020s;

    /* renamed from: t */
    private ISessionListener f13021t;

    /* renamed from: u */
    private Runnable f13022u;

    /* renamed from: v */
    private Set<String> f13023v;

    /* renamed from: com.taobao.accs.net.k$a */
    /* loaded from: classes.dex */
    public static class a implements IAuth {

        /* renamed from: a */
        private String f13024a;

        /* renamed from: b */
        private int f13025b;

        /* renamed from: c */
        private String f13026c;

        /* renamed from: d */
        private AbstractC3156a f13027d;

        public a(AbstractC3156a abstractC3156a, String str) {
            this.f13026c = abstractC3156a.mo12858d();
            this.f13024a = abstractC3156a.m12856c("https://" + str + "/accs/");
            this.f13025b = abstractC3156a.f12980c;
            this.f13027d = abstractC3156a;
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            ALog.m12940e(this.f13026c, BaseMonitor.ALARM_POINT_AUTH, "URL", this.f13024a);
            session.request(new Request.Builder().setUrl(this.f13024a).build(), new C3176u(this, authCallback));
        }
    }

    public C3166k(Context context, int i10, String str) {
        super(context, i10, str);
        this.f13016o = true;
        this.f13017p = 3600000L;
        this.f13019r = new Handler(Looper.getMainLooper());
        this.f13020s = new RunnableC3167l(this);
        this.f13021t = new C3168m(this);
        this.f13022u = new RunnableC3175t(this);
        this.f13023v = Collections.synchronizedSet(new HashSet());
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f13022u, 120000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m12887o() {
        if (this.f12986i.isAccsHeartbeatEnable()) {
            ALog.m12940e(mo12858d(), "startAccsHeartBeat", new Object[0]);
            ScheduledFuture scheduledFuture = this.f13018q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
            Runnable runnable = this.f13020s;
            long j10 = this.f13017p;
            this.f13018q = scheduledExecutor.scheduleAtFixedRate(runnable, j10, j10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: c */
    public C3183c mo12855c() {
        return null;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: d */
    public String mo12858d() {
        return "InAppConn_" + this.f12990m;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: e */
    public void mo12859e() {
        ALog.m12940e(mo12858d(), "shut down", new Object[0]);
        this.f13016o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:4:0x0005, B:6:0x002a, B:10:0x0034, B:12:0x003f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo12867m() {
        /*
            r7 = this;
            boolean r0 = r7.f12984g
            r1 = 0
            if (r0 == 0) goto L46
            com.taobao.accs.AccsClientConfig r0 = r7.f12986i     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r0.getAppKey()     // Catch: java.lang.Throwable -> L46
            anet.channel.SessionCenter r0 = anet.channel.SessionCenter.getInstance(r0)     // Catch: java.lang.Throwable -> L46
            r2 = 0
            java.lang.String r2 = r7.mo12849b(r2)     // Catch: java.lang.Throwable -> L46
            anet.channel.entity.ConnType$TypeLevel r3 = anet.channel.entity.ConnType.TypeLevel.SPDY     // Catch: java.lang.Throwable -> L46
            r4 = 0
            anet.channel.Session r0 = r0.get(r2, r3, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "InAppConn_"
            java.lang.String r3 = "isConnected"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "state"
            r4[r1] = r5     // Catch: java.lang.Throwable -> L46
            r5 = 1
            if (r0 == 0) goto L33
            boolean r6 = r0.isAvailable()     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L31
            goto L33
        L31:
            r6 = 0
            goto L34
        L33:
            r6 = 1
        L34:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L46
            r4[r5] = r6     // Catch: java.lang.Throwable -> L46
            com.taobao.accs.utl.ALog.m12940e(r2, r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L46
            boolean r0 = r0.isAvailable()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L46
            r1 = 1
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C3166k.mo12867m():boolean");
    }

    @Override // anet.channel.DataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i10, int i11) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m12940e(mo12858d(), "onDataReceive", "type", Integer.valueOf(i11), "dataid", Integer.valueOf(i10));
        }
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3173r(this, i11, bArr, tnetSpdySession));
    }

    @Override // anet.channel.DataFrameCb
    public void onException(int i10, int i11, boolean z10, String str) {
        ALog.m12940e(mo12858d(), "errorId:" + i11 + "detail:" + str + " dataId:" + i10 + " needRetry:" + z10, new Object[0]);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3174s(this, i10, z10, i11));
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public synchronized void mo12840a() {
        ALog.m12938d(mo12858d(), "start", new Object[0]);
        this.f13016o = true;
        mo12841a(this.f12981d);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: b */
    public void mo12850b() {
        this.f12983f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: c */
    public void mo12857c(int i10) {
        super.mo12857c(i10);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12843a(Message message, boolean z10) {
        if (this.f13016o && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() <= 1000) {
                    ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new RunnableC3170o(this, message), message.delyTime, TimeUnit.MILLISECONDS);
                    if (message.getType() == 1 && message.cunstomDataId != null) {
                        if (message.isControlFrame() && mo12848a(message.cunstomDataId)) {
                            this.f12982e.m12790b(message);
                        }
                        this.f12982e.f12924a.put(message.cunstomDataId, schedule);
                    }
                    NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                    if (netPermanceMonitor != null) {
                        netPermanceMonitor.setDeviceId(UtilityImpl.m12986j(this.f12981d));
                        netPermanceMonitor.setConnType(this.f12980c);
                        netPermanceMonitor.onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                this.f12982e.m12782a(message, ErrorCode.MESSAGE_QUEUE_FULL);
                ALog.m12940e(mo12858d(), "send queue full count:" + ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size(), new Object[0]);
                return;
            } catch (Throwable th) {
                this.f12982e.m12782a(message, -8);
                ALog.m12939e(mo12858d(), "send error", th, new Object[0]);
                return;
            }
        }
        ALog.m12940e(mo12858d(), "not running or msg null! " + this.f13016o, new Object[0]);
    }

    public C3166k(Context context, int i10, String str, int i11) {
        super(context, i10, str);
        this.f13016o = true;
        this.f13017p = 3600000L;
        this.f13019r = new Handler(Looper.getMainLooper());
        this.f13020s = new RunnableC3167l(this);
        this.f13021t = new C3168m(this);
        this.f13022u = new RunnableC3175t(this);
        this.f13023v = Collections.synchronizedSet(new HashSet());
        mo12857c(i11);
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f13022u, 120000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12844a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3171p(this, str, z10), j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12846a(boolean z10, boolean z11) {
        ThreadPoolExecutorFactory.getSendScheduledExecutor().execute(new RunnableC3172q(this));
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12845a(String str, boolean z10, String str2) {
        Session session;
        try {
            Message m12788b = this.f12982e.m12788b(str);
            if (m12788b != null && m12788b.host != null && (session = SessionCenter.getInstance(this.f12986i.getAppKey()).get(m12788b.host.toString(), 0L)) != null) {
                if (z10) {
                    ALog.m12940e(mo12858d(), "close session by time out", new Object[0]);
                    session.close(true);
                } else {
                    session.ping(true);
                }
            }
        } catch (Exception e10) {
            ALog.m12939e(mo12858d(), "onTimeOut", e10, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public boolean mo12848a(String str) {
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f12982e.f12924a.get(str);
        boolean cancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (cancel) {
            ALog.m12940e(mo12858d(), "cancel", "customDataId", str);
        }
        return cancel;
    }

    /* renamed from: a */
    public void m12890a(JSONObject jSONObject) {
        if (jSONObject == null) {
            ALog.m12940e(mo12858d(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i(mo12858d(), "onReceiveAccsHeartbeatResp", "data", jSONObject);
        }
        try {
            int i10 = jSONObject.getInt("timeInterval");
            if (i10 == -1) {
                ScheduledFuture scheduledFuture = this.f13018q;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    return;
                }
                return;
            }
            long j10 = i10 * 1000;
            if (this.f13017p != j10) {
                if (i10 == 0) {
                    j10 = 3600000;
                }
                this.f13017p = j10;
                ScheduledFuture scheduledFuture2 = this.f13018q;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
                Runnable runnable = this.f13020s;
                long j11 = this.f13017p;
                this.f13018q = scheduledExecutor.scheduleAtFixedRate(runnable, j11, j11, TimeUnit.MILLISECONDS);
            }
        } catch (JSONException e10) {
            ALog.m12940e(mo12858d(), "onReceiveAccsHeartbeatResp", "e", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12841a(Context context) {
        boolean z10;
        try {
            if (this.f12984g) {
                return;
            }
            super.mo12841a(context);
            if (C3207t.m13038c()) {
                SessionCenter.getInstance(this.f12986i.getAppKey()).registerAccsSessionListener(this.f13021t);
            }
            String inappHost = this.f12986i.getInappHost();
            if (mo12862h() && this.f12986i.isKeepalive()) {
                z10 = true;
            } else {
                ALog.m12938d(mo12858d(), "initAwcn close keepalive", new Object[0]);
                z10 = false;
            }
            m12888a(SessionCenter.getInstance(this.f12986i.getAppKey()), inappHost, z10);
            this.f12984g = true;
            ALog.m12941i(mo12858d(), "initAwcn success!", new Object[0]);
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "initAwcn", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m12888a(SessionCenter sessionCenter, String str, boolean z10) {
        if (this.f13023v.contains(str)) {
            return;
        }
        sessionCenter.registerSessionInfo(SessionInfo.create(str, z10, true, new a(this, str), null, this));
        sessionCenter.registerPublicKey(str, this.f12986i.getInappPubKey());
        this.f13023v.add(str);
        ALog.m12941i(mo12858d(), "registerSessionInfo", "host", str);
    }

    /* renamed from: a */
    public void m12889a(AccsClientConfig accsClientConfig) {
        if (accsClientConfig == null) {
            ALog.m12941i(mo12858d(), "updateConfig null", new Object[0]);
            return;
        }
        if (accsClientConfig.equals(this.f12986i)) {
            ALog.m12944w(mo12858d(), "updateConfig not any changed", new Object[0]);
            return;
        }
        if (!this.f12984g) {
            if (UtilityImpl.isMainProcess(this.f12981d)) {
                this.f12986i = accsClientConfig;
                mo12841a(this.f12981d);
                return;
            }
            return;
        }
        try {
            boolean z10 = true;
            ALog.m12944w(mo12858d(), "updateConfig", "old", this.f12986i, "new", accsClientConfig);
            String inappHost = this.f12986i.getInappHost();
            String inappHost2 = accsClientConfig.getInappHost();
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f12986i.getAppKey());
            if (sessionCenter == null) {
                ALog.m12944w(mo12858d(), "updateConfig not need update", new Object[0]);
                return;
            }
            sessionCenter.unregisterSessionInfo(inappHost);
            ALog.m12944w(mo12858d(), "updateConfig unregisterSessionInfo", "host", inappHost);
            if (this.f13023v.contains(inappHost)) {
                this.f13023v.remove(inappHost);
                ALog.m12944w(mo12858d(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
            }
            this.f12986i = accsClientConfig;
            this.f12979b = accsClientConfig.getAppKey();
            this.f12990m = this.f12986i.getTag();
            String str = ConnType.PK_ACS;
            if (this.f12986i.getInappPubKey() == 10 || this.f12986i.getInappPubKey() == 11) {
                str = ConnType.PK_OPEN;
            }
            ALog.m12941i(mo12858d(), "update config register new conn protocol host:", this.f12986i.getInappHost());
            StrategyTemplate.getInstance().registerConnProtocol(this.f12986i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
            if (!mo12862h() || !this.f12986i.isKeepalive()) {
                ALog.m12941i(mo12858d(), "updateConfig close keepalive", new Object[0]);
                z10 = false;
            }
            m12888a(sessionCenter, inappHost2, z10);
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "updateConfig", th, new Object[0]);
        }
    }
}
