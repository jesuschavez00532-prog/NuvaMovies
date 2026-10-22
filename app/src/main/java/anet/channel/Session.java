package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.C0934a;
import anet.channel.entity.C0935b;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.entity.EventType;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Progress;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* loaded from: classes.dex */
public abstract class Session implements Comparable<Session> {

    /* renamed from: v */
    static ExecutorService f3722v = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    protected Context f3723a;

    /* renamed from: c */
    protected String f3725c;

    /* renamed from: d */
    protected String f3726d;

    /* renamed from: e */
    protected String f3727e;

    /* renamed from: f */
    protected String f3728f;

    /* renamed from: g */
    protected int f3729g;

    /* renamed from: h */
    protected String f3730h;

    /* renamed from: i */
    protected int f3731i;

    /* renamed from: j */
    protected ConnType f3732j;

    /* renamed from: k */
    protected IConnStrategy f3733k;

    /* renamed from: m */
    protected boolean f3735m;

    /* renamed from: o */
    protected Runnable f3737o;

    /* renamed from: p */
    public final String f3738p;

    /* renamed from: q */
    public final SessionStatistic f3739q;

    /* renamed from: r */
    protected int f3740r;

    /* renamed from: s */
    protected int f3741s;

    /* renamed from: x */
    private Future<?> f3745x;

    /* renamed from: b */
    Map<EventCb, Integer> f3724b = new LinkedHashMap();

    /* renamed from: w */
    private boolean f3744w = false;

    /* renamed from: l */
    protected String f3734l = null;

    /* renamed from: n */
    protected int f3736n = 6;

    /* renamed from: t */
    protected boolean f3742t = false;

    /* renamed from: u */
    protected boolean f3743u = true;

    /* renamed from: y */
    private List<Long> f3746y = null;

    /* renamed from: z */
    private long f3747z = 0;

    /* renamed from: anet.channel.Session$a */
    /* loaded from: classes.dex */
    public static class C0890a {
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;

        /* renamed from: a */
        static final String[] f3748a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        /* renamed from: a */
        static String m4474a(int i10) {
            return f3748a[i10];
        }
    }

    public Session(Context context, C0934a c0934a) {
        boolean z10 = false;
        this.f3735m = false;
        this.f3723a = context;
        String m4572a = c0934a.m4572a();
        this.f3727e = m4572a;
        this.f3728f = m4572a;
        this.f3729g = c0934a.m4573b();
        this.f3732j = c0934a.m4574c();
        String m4577f = c0934a.m4577f();
        this.f3725c = m4577f;
        this.f3726d = m4577f.substring(m4577f.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f3741s = c0934a.m4576e();
        this.f3740r = c0934a.m4575d();
        IConnStrategy iConnStrategy = c0934a.f3875a;
        this.f3733k = iConnStrategy;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z10 = true;
        }
        this.f3735m = z10;
        this.f3738p = c0934a.m4579h();
        SessionStatistic sessionStatistic = new SessionStatistic(c0934a);
        this.f3739q = sessionStatistic;
        sessionStatistic.host = this.f3726d;
    }

    public static void configTnetALog(Context context, String str, int i10, int i11) {
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent != null && SpdyAgent.checkLoadSucc()) {
            spdyAgent.configLogFile(str, i10, i11);
        } else {
            ALog.m4787e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        }
    }

    protected void cancelTimeout() {
        Future<?> future;
        if (this.f3737o != null && (future = this.f3745x) != null) {
            future.cancel(true);
        }
    }

    public void checkAvailable() {
        ping(true);
    }

    public abstract void close();

    public void close(boolean z10) {
        this.f3742t = z10;
        close();
    }

    public void connect() {
    }

    public IConnStrategy getConnStrategy() {
        return this.f3733k;
    }

    public ConnType getConnType() {
        return this.f3732j;
    }

    public String getHost() {
        return this.f3725c;
    }

    public String getIp() {
        return this.f3727e;
    }

    public int getPort() {
        return this.f3729g;
    }

    public String getRealHost() {
        return this.f3726d;
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public String getUnit() {
        return this.f3734l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleCallbacks(int i10, C0935b c0935b) {
        f3722v.submit(new RunnableC0900b(this, i10, c0935b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleResponseCode(Request request, int i10) {
        if (request.getHeaders().containsKey(HttpConstant.X_PV) && i10 >= 500 && i10 < 600) {
            synchronized (this) {
                if (this.f3746y == null) {
                    this.f3746y = new LinkedList();
                }
                if (this.f3746y.size() < 5) {
                    this.f3746y.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long longValue = this.f3746y.remove(0).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - longValue <= OkGo.DEFAULT_MILLISECONDS) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f3746y.clear();
                    } else {
                        this.f3746y.add(Long.valueOf(currentTimeMillis));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey(HttpConstant.X_SWITCH_UNIT)) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.X_SWITCH_UNIT);
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (!StringUtils.isStringEqual(this.f3734l, singleHeaderFieldByKey)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f3747z > OkGo.DEFAULT_MILLISECONDS) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f3747z = currentTimeMillis;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public abstract boolean isAvailable();

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void notifyStatus(int i10, C0935b c0935b) {
        ALog.m4787e("awcn.Session", "notifyStatus", this.f3738p, Progress.STATUS, C0890a.m4474a(i10));
        if (i10 == this.f3736n) {
            ALog.m4788i("awcn.Session", "ignore notifyStatus", this.f3738p, new Object[0]);
            return;
        }
        this.f3736n = i10;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            onDisconnect();
                            if (!this.f3744w) {
                                handleCallbacks(2, c0935b);
                            }
                        }
                    } else {
                        handleCallbacks(EventType.AUTH_FAIL, c0935b);
                    }
                } else {
                    this.f3734l = StrategyCenter.getInstance().getUnitByHost(this.f3726d);
                    handleCallbacks(512, c0935b);
                }
            } else {
                handleCallbacks(256, c0935b);
            }
        } else {
            handleCallbacks(1, c0935b);
        }
    }

    public void onDisconnect() {
    }

    public void ping(boolean z10) {
    }

    public void registerEventcb(int i10, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f3724b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i10));
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPingTimeout(int i10) {
        if (this.f3737o == null) {
            this.f3737o = getRecvTimeOutRunnable();
        }
        cancelTimeout();
        Runnable runnable = this.f3737o;
        if (runnable != null) {
            this.f3745x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i10, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.f3738p + '|' + this.f3732j + ']';
    }

    protected void unReceiveEventCb(EventCb eventCb) {
        Map<EventCb, Integer> map = this.f3724b;
        if (map != null) {
            map.remove(eventCb);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        return ConnType.compare(this.f3732j, session.f3732j);
    }

    public void ping(boolean z10, int i10) {
    }
}
