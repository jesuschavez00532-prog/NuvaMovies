package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.detect.C0925n;
import anet.channel.entity.C0936c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.p018e.C0927a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C1024i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.lzy.okgo.OkGo;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes.dex */
public class SessionCenter {
    public static final String TAG = "awcn.SessionCenter";

    /* renamed from: a */
    static Map<Config, SessionCenter> f3749a = new HashMap();

    /* renamed from: j */
    private static boolean f3750j = false;

    /* renamed from: b */
    Context f3751b;

    /* renamed from: c */
    String f3752c;

    /* renamed from: d */
    Config f3753d;

    /* renamed from: e */
    final C0926e f3754e = new C0926e();

    /* renamed from: f */
    final LruCache<String, SessionRequest> f3755f = new LruCache<>(32);

    /* renamed from: g */
    final C0906c f3756g = new C0906c();

    /* renamed from: h */
    final AccsSessionManager f3757h;

    /* renamed from: i */
    final C0891a f3758i;

    private SessionCenter(Config config) {
        C0891a c0891a = new C0891a(this, null);
        this.f3758i = c0891a;
        this.f3751b = GlobalAppRuntimeInfo.getContext();
        this.f3753d = config;
        this.f3752c = config.getAppkey();
        c0891a.m4484a();
        this.f3757h = new AccsSessionManager(this);
        if (!config.getAppkey().equals("[default]")) {
            AmdcRuntimeInfo.setSign(new C0909d(this, config.getAppkey(), config.getSecurity()));
        }
    }

    public static void checkAndStartAccsSession() {
        Iterator<SessionCenter> it = f3749a.values().iterator();
        while (it.hasNext()) {
            it.next().f3757h.checkAndStartSession();
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        SessionCenter sessionCenter;
        synchronized (SessionCenter.class) {
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag != null) {
                sessionCenter = getInstance(configByTag);
            } else {
                throw new RuntimeException("tag not exist!");
            }
        }
        return sessionCenter;
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!f3750j) {
                    Map<Config, SessionCenter> map = f3749a;
                    Config config = Config.DEFAULT_CONFIG;
                    map.put(config, new SessionCenter(config));
                    AppLifecycle.initialize();
                    NetworkStatusHelper.startListener(context);
                    if (!AwcnConfig.isTbNextLaunch()) {
                        StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    }
                    if (GlobalAppRuntimeInfo.isTargetProcess()) {
                        C0925n.m4546a();
                        C0927a.m4556a();
                    }
                    f3750j = true;
                }
            } else {
                ALog.m4787e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        int i10;
        synchronized (SessionCenter.class) {
            try {
                if (GlobalAppRuntimeInfo.getEnv() != env) {
                    ALog.m4788i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                    GlobalAppRuntimeInfo.setEnv(env);
                    StrategyCenter.getInstance().switchEnv();
                    SpdyAgent spdyAgent = SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    if (env == ENV.TEST) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    spdyAgent.switchAccsServer(i10);
                }
                Iterator<Map.Entry<Config, SessionCenter>> it = f3749a.entrySet().iterator();
                while (it.hasNext()) {
                    SessionCenter value = it.next().getValue();
                    if (value.f3753d.getEnv() != env) {
                        ALog.m4788i(TAG, "remove instance", value.f3752c, "ENVIRONMENT", value.f3753d.getEnv());
                        value.f3757h.forceCloseSession(false);
                        value.f3758i.m4485b();
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                ALog.m4786e(TAG, "switch env error.", null, th, new Object[0]);
            }
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback != null) {
            if (j10 > 0) {
                try {
                    m4483b(httpUrl, i10, j10, sessionGetCallback);
                    return;
                } catch (Exception unused) {
                    sessionGetCallback.onSessionGetFail();
                    return;
                }
            }
            throw new InvalidParameterException("timeout must > 0");
        }
        throw new NullPointerException("cb is null");
    }

    /* renamed from: b */
    protected void m4483b(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) {
        SessionInfo m4517b;
        if (!f3750j) {
            ALog.m4787e(TAG, "getInternal not inited!", this.f3752c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        }
        if (sessionGetCallback != null) {
            String str = this.f3752c;
            Object[] objArr = new Object[6];
            objArr[0] = C3325bt.f14196aN;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i10 == C0936c.f3883a ? "LongLink" : "ShortLink";
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j10);
            ALog.m4785d(TAG, "getInternal", str, objArr);
            SessionRequest m4475a = m4475a(httpUrl);
            Session m4548a = this.f3754e.m4548a(m4475a, i10);
            if (m4548a != null) {
                ALog.m4785d(TAG, "get internal hit cache session", this.f3752c, C3384f.f14569aC, m4548a);
                sessionGetCallback.onSessionGetSuccess(m4548a);
                return;
            }
            if (this.f3753d == Config.DEFAULT_CONFIG && i10 != C0936c.f3884b) {
                sessionGetCallback.onSessionGetFail();
                return;
            }
            if (GlobalAppRuntimeInfo.isAppBackground() && i10 == C0936c.f3883a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (m4517b = this.f3756g.m4517b(httpUrl.host())) != null && m4517b.isAccs) {
                ALog.m4790w(TAG, "app background, forbid to create accs session", this.f3752c, new Object[0]);
                throw new ConnectException("accs session connecting forbidden in background");
            }
            m4475a.m4502b(this.f3751b, i10, C1024i.m4812a(this.f3752c), sessionGetCallback, j10);
            return;
        }
        throw new InvalidParameterException("sessionGetCallback is null");
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f3757h.forceCloseSession(true);
    }

    public Session get(String str, long j10) {
        return get(HttpUrl.parse(str), C0936c.f3885c, j10);
    }

    public Session getThrowsException(String str, long j10) {
        return m4481a(HttpUrl.parse(str), C0936c.f3885c, j10, null);
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        this.f3757h.registerListener(iSessionListener);
    }

    public void registerPublicKey(String str, int i10) {
        this.f3756g.m4516a(str, i10);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f3756g.m4515a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f3757h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        this.f3757h.unregisterListener(iSessionListener);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo m4513a = this.f3756g.m4513a(str);
        if (m4513a != null && m4513a.isKeepAlive) {
            this.f3757h.checkAndStartSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.SessionCenter$a */
    /* loaded from: classes.dex */
    public class C0891a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a */
        boolean f3759a;

        private C0891a() {
            this.f3759a = false;
        }

        /* renamed from: a */
        void m4484a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* renamed from: b */
        void m4485b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.m4788i(SessionCenter.TAG, "[background]", SessionCenter.this.f3752c, new Object[0]);
            if (!SessionCenter.f3750j) {
                ALog.m4787e(SessionCenter.TAG, "background not inited!", SessionCenter.this.f3752c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg() && "OPPO".equalsIgnoreCase(Build.BRAND)) {
                    ALog.m4788i(SessionCenter.TAG, "close session for OPPO", SessionCenter.this.f3752c, new Object[0]);
                    SessionCenter.this.f3757h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            ALog.m4788i(SessionCenter.TAG, "[forground]", SessionCenter.this.f3752c, new Object[0]);
            if (SessionCenter.this.f3751b == null || this.f3759a) {
                return;
            }
            this.f3759a = true;
            try {
                if (!SessionCenter.f3750j) {
                    ALog.m4787e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.f3752c, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime != 0 && System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime > OkGo.DEFAULT_MILLISECONDS) {
                        SessionCenter.this.f3757h.forceCloseSession(true);
                    } else {
                        SessionCenter.this.f3757h.checkAndStartSession();
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f3759a = false;
                    throw th;
                }
                this.f3759a = false;
            } catch (Exception unused2) {
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.m4787e(SessionCenter.TAG, "onNetworkStatusChanged.", SessionCenter.this.f3752c, "networkStatus", networkStatus);
            List<SessionRequest> m4549a = SessionCenter.this.f3754e.m4549a();
            if (!m4549a.isEmpty()) {
                for (SessionRequest sessionRequest : m4549a) {
                    ALog.m4785d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.f3752c, new Object[0]);
                    sessionRequest.m4499a((String) null);
                }
            }
            SessionCenter.this.f3757h.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(C1002l.d dVar) {
            SessionCenter.this.m4478a(dVar);
            SessionCenter.this.f3757h.checkAndStartSession();
        }

        /* synthetic */ C0891a(SessionCenter sessionCenter, C0909d c0909d) {
            this();
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j10) {
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0936c.f3883a : C0936c.f3884b, j10);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j10) {
        return m4481a(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0936c.f3883a : C0936c.f3884b, j10, null);
    }

    /* renamed from: a */
    private SessionRequest m4475a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return m4482a(StringUtils.concatString(scheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) {
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0936c.f3883a : C0936c.f3884b, j10);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i10, long j10) {
        return m4481a(httpUrl, i10, j10, null);
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        synchronized (SessionCenter.class) {
            if (config != null) {
                if (!f3750j && (appContext = Utils.getAppContext()) != null) {
                    init(appContext);
                }
                sessionCenter = f3749a.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    f3749a.put(config, sessionCenter);
                }
            } else {
                throw new NullPointerException("config is null!");
            }
        }
        return sessionCenter;
    }

    public Session get(HttpUrl httpUrl, int i10, long j10) {
        try {
            return m4481a(httpUrl, i10, j10, null);
        } catch (NoAvailStrategyException e10) {
            ALog.m4788i(TAG, "[Get]" + e10.getMessage(), this.f3752c, null, "url", httpUrl.urlString());
            return null;
        } catch (ConnectException e11) {
            ALog.m4787e(TAG, "[Get]connect exception", this.f3752c, "errMsg", e11.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e12) {
            ALog.m4786e(TAG, "[Get]param url is invalid", this.f3752c, e12, "url", httpUrl);
            return null;
        } catch (TimeoutException e13) {
            ALog.m4786e(TAG, "[Get]timeout exception", this.f3752c, e13, "url", httpUrl.urlString());
            return null;
        } catch (Exception e14) {
            ALog.m4786e(TAG, "[Get]" + e14.getMessage(), this.f3752c, null, "url", httpUrl.urlString());
            return null;
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) {
        return m4481a(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0936c.f3883a : C0936c.f3884b, j10, null);
    }

    /* renamed from: a */
    protected Session m4481a(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) {
        SessionInfo m4517b;
        if (!f3750j) {
            ALog.m4787e(TAG, "getInternal not inited!", this.f3752c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl != null) {
            String str = this.f3752c;
            Object[] objArr = new Object[6];
            objArr[0] = C3325bt.f14196aN;
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i10 == C0936c.f3883a ? "LongLink" : "ShortLink";
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j10);
            ALog.m4785d(TAG, "getInternal", str, objArr);
            SessionRequest m4475a = m4475a(httpUrl);
            Session m4548a = this.f3754e.m4548a(m4475a, i10);
            if (m4548a != null) {
                ALog.m4785d(TAG, "get internal hit cache session", this.f3752c, C3384f.f14569aC, m4548a);
            } else {
                if (this.f3753d == Config.DEFAULT_CONFIG && i10 != C0936c.f3884b) {
                    if (sessionGetCallback == null) {
                        return null;
                    }
                    sessionGetCallback.onSessionGetFail();
                    return null;
                }
                if (GlobalAppRuntimeInfo.isAppBackground() && i10 == C0936c.f3883a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (m4517b = this.f3756g.m4517b(httpUrl.host())) != null && m4517b.isAccs) {
                    ALog.m4790w(TAG, "app background, forbid to create accs session", this.f3752c, new Object[0]);
                    throw new ConnectException("accs session connecting forbidden in background");
                }
                m4475a.m4495a(this.f3751b, i10, C1024i.m4812a(this.f3752c), sessionGetCallback, j10);
                if (sessionGetCallback == null && j10 > 0 && (i10 == C0936c.f3885c || m4475a.m4501b() == i10)) {
                    m4475a.m4494a(j10);
                    m4548a = this.f3754e.m4548a(m4475a, i10);
                    if (m4548a == null) {
                        throw new ConnectException("session connecting failed or timeout");
                    }
                }
            }
            return m4548a;
        }
        throw new InvalidParameterException("httpUrl is null");
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        synchronized (SessionCenter.class) {
            if (!f3750j && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : f3749a.entrySet()) {
                SessionCenter value = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    return value;
                }
                sessionCenter = value;
            }
            return sessionCenter;
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            init(context, str, GlobalAppRuntimeInfo.getEnv());
        }
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            } else {
                ALog.m4787e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    /* renamed from: b */
    private void m4480b(C1002l.b bVar) {
        boolean z10;
        boolean z11;
        ALog.m4788i(TAG, "find effectNow", this.f3752c, "host", bVar.f4155a);
        C1002l.a[] aVarArr = bVar.f4162h;
        String[] strArr = bVar.f4160f;
        for (Session session : this.f3754e.m4550a(m4482a(StringUtils.buildKey(bVar.f4157c, bVar.f4155a)))) {
            if (!session.getConnType().isHttpType()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= strArr.length) {
                        z10 = false;
                        break;
                    } else {
                        if (session.getIp().equals(strArr[i10])) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= aVarArr.length) {
                            z11 = false;
                            break;
                        } else {
                            if (session.getPort() == aVarArr[i11].f4147a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i11])))) {
                                z11 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (!z11) {
                        if (ALog.isPrintLog(2)) {
                            ALog.m4788i(TAG, "aisle not match", session.f3738p, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                        }
                        session.close(true);
                    }
                } else {
                    if (ALog.isPrintLog(2)) {
                        ALog.m4788i(TAG, "ip not match", session.f3738p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                }
            }
        }
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            if (context == null) {
                ALog.m4787e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
            if (config != null) {
                init(context);
                if (!f3749a.containsKey(config)) {
                    f3749a.put(config, new SessionCenter(config));
                }
            } else {
                ALog.m4787e(TAG, "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4478a(C1002l.d dVar) {
        try {
            for (C1002l.b bVar : dVar.f4170b) {
                if (bVar.f4165k) {
                    m4480b(bVar);
                }
                if (bVar.f4159e != null) {
                    m4477a(bVar);
                }
            }
        } catch (Exception e10) {
            ALog.m4786e(TAG, "checkStrategy failed", this.f3752c, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    private void m4477a(C1002l.b bVar) {
        for (Session session : this.f3754e.m4550a(m4482a(StringUtils.buildKey(bVar.f4157c, bVar.f4155a)))) {
            if (!StringUtils.isStringEqual(session.f3734l, bVar.f4159e)) {
                ALog.m4788i(TAG, "unit change", session.f3738p, "session unit", session.f3734l, "unit", bVar.f4159e);
                session.close(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public SessionRequest m4482a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f3755f) {
            sessionRequest = this.f3755f.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.f3755f.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }
}
