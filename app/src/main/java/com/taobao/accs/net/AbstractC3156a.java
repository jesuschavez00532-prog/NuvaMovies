package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.C3132b;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3139d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p073ut.p074a.C3183c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p075a.p076a.C3216c;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushRegisterCallback;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.a */
/* loaded from: classes.dex */
public abstract class AbstractC3156a {
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;

    /* renamed from: n */
    protected static int f12977n;

    /* renamed from: b */
    public String f12979b;

    /* renamed from: c */
    protected int f12980c;

    /* renamed from: d */
    protected Context f12981d;

    /* renamed from: e */
    protected C3139d f12982e;

    /* renamed from: h */
    public C3132b f12985h;

    /* renamed from: i */
    public AccsClientConfig f12986i;

    /* renamed from: j */
    protected String f12987j;

    /* renamed from: m */
    public String f12990m;

    /* renamed from: r */
    private Runnable f12994r;

    /* renamed from: s */
    private ScheduledFuture<?> f12995s;

    /* renamed from: a */
    public String f12978a = "android@umeng";

    /* renamed from: f */
    protected int f12983f = 0;

    /* renamed from: o */
    private long f12991o = 0;

    /* renamed from: g */
    protected volatile boolean f12984g = false;

    /* renamed from: k */
    protected String f12988k = null;

    /* renamed from: p */
    private boolean f12992p = false;

    /* renamed from: l */
    protected LinkedHashMap<Integer, Message> f12989l = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: q */
    private final ArrayList<AccsConnectStateListener> f12993q = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3156a(Context context, int i10, String str) {
        this.f12979b = "";
        this.f12980c = i10;
        this.f12981d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        this.f12986i = configByTag;
        if (configByTag == null) {
            ALog.m12940e(mo12858d(), "BaseConnection config null!!", new Object[0]);
            try {
                int i11 = PushAgent.f15772a;
                Object invoke = PushAgent.class.getMethod("getInstance", Context.class).invoke(null, context);
                PushAgent.class.getMethod(C3216c.JSON_CMD_REGISTER, UPushRegisterCallback.class).invoke(invoke, PushAgent.class.getMethod("getRegisterCallback", new Class[0]).invoke(invoke, new Object[0]));
                this.f12986i = AccsClientConfig.getConfigByTag(str);
            } catch (Throwable th) {
                ALog.m12939e(mo12858d(), "BaseConnection build config", th, new Object[0]);
            }
        }
        AccsClientConfig accsClientConfig = this.f12986i;
        if (accsClientConfig != null) {
            this.f12990m = accsClientConfig.getTag();
            this.f12979b = this.f12986i.getAppKey();
        }
        C3139d c3139d = new C3139d(context, this);
        this.f12982e = c3139d;
        c3139d.f12925b = this.f12980c;
        ALog.m12938d(mo12858d(), "new connection", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m12839a(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 != 4) ? "DISCONNECTED" : "DISCONNECTING" : "CONNECTING" : "CONNECTED";
    }

    /* renamed from: a */
    public abstract void mo12840a();

    /* renamed from: a */
    public abstract void mo12843a(Message message, boolean z10);

    /* renamed from: a */
    public abstract void mo12845a(String str, boolean z10, String str2);

    /* renamed from: a */
    public abstract void mo12846a(boolean z10, boolean z11);

    /* renamed from: a */
    public abstract boolean mo12848a(String str);

    /* renamed from: b */
    public abstract void mo12850b();

    /* renamed from: b */
    public void m12854b(Message message, boolean z10) {
        if (!message.isAck && !UtilityImpl.m12985i(this.f12981d)) {
            ALog.m12940e(mo12858d(), "sendMessage ready no network", Constants.KEY_DATA_ID, message.dataId);
            this.f12982e.m12782a(message, -13);
            return;
        }
        long m12812a = message.getType() != 2 ? this.f12982e.f12927d.m12812a(message.serviceId, message.bizId) : 0L;
        if (m12812a == -1) {
            ALog.m12940e(mo12858d(), "sendMessage ready server limit high", Constants.KEY_DATA_ID, message.dataId);
            this.f12982e.m12782a(message, ErrorCode.SERVIER_HIGH_LIMIT);
            return;
        }
        if (m12812a == -1000) {
            ALog.m12940e(mo12858d(), "sendMessage ready server limit high for brush", Constants.KEY_DATA_ID, message.dataId);
            this.f12982e.m12782a(message, ErrorCode.SERVIER_HIGH_LIMIT_BRUSH);
            return;
        }
        if (m12812a > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f12991o;
            if (currentTimeMillis > j10) {
                message.delyTime = m12812a;
            } else {
                message.delyTime = (j10 + m12812a) - System.currentTimeMillis();
            }
            this.f12991o = System.currentTimeMillis() + message.delyTime;
            ALog.m12940e(mo12858d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        } else if ("accs".equals(message.serviceId)) {
            ALog.m12940e(mo12858d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        } else if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m12938d(mo12858d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        }
        try {
            if (TextUtils.isEmpty(this.f12987j)) {
                this.f12987j = UtilityImpl.m12986j(this.f12981d);
            }
            if (!message.isTimeOut()) {
                mo12843a(message, z10);
            } else {
                this.f12982e.m12782a(message, -9);
            }
        } catch (RejectedExecutionException unused) {
            this.f12982e.m12782a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            ALog.m12940e(mo12858d(), "sendMessage ready queue full", "size", Integer.valueOf(ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size()));
        }
    }

    /* renamed from: c */
    public abstract C3183c mo12855c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public String m12856c(String str) {
        String str2;
        String m12986j = UtilityImpl.m12986j(this.f12981d);
        try {
            str2 = URLEncoder.encode(m12986j);
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "buildAuthUrl", th, new Object[0]);
            str2 = m12986j;
        }
        String m12955a = UtilityImpl.m12955a(m12863i(), this.f12986i.getAppSecret(), m12986j);
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(str);
        sb2.append("auth?1=");
        sb2.append(str2);
        sb2.append("&2=");
        sb2.append(m12955a);
        sb2.append("&3=");
        sb2.append(m12863i());
        if (this.f12988k != null) {
            sb2.append("&4=");
            sb2.append(this.f12988k);
        }
        sb2.append("&5=");
        sb2.append(this.f12980c);
        sb2.append("&6=");
        sb2.append(UtilityImpl.m12981g(this.f12981d));
        sb2.append("&7=");
        sb2.append(UtilityImpl.m12973d());
        sb2.append("&8=");
        sb2.append(this.f12980c == 1 ? "1.1.2" : Integer.valueOf(Constants.SDK_VERSION_CODE));
        sb2.append("&9=");
        sb2.append(System.currentTimeMillis());
        sb2.append("&10=");
        sb2.append(1);
        sb2.append("&11=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("&12=");
        sb2.append(this.f12981d.getPackageName());
        sb2.append("&13=");
        sb2.append(UtilityImpl.m12990l(this.f12981d));
        sb2.append("&14=");
        sb2.append(this.f12978a);
        sb2.append("&15=");
        sb2.append(UtilityImpl.m12967b(Build.MODEL));
        sb2.append("&16=");
        sb2.append(UtilityImpl.m12967b(Build.BRAND));
        sb2.append("&17=");
        sb2.append("221");
        sb2.append("&19=");
        sb2.append(!m12866l() ? 1 : 0);
        sb2.append("&20=");
        sb2.append(this.f12986i.getStoreId());
        return sb2.toString();
    }

    /* renamed from: d */
    public abstract String mo12858d();

    /* renamed from: e */
    public void mo12859e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m12860f() {
        if (this.f12994r == null) {
            this.f12994r = new RunnableC3158c(this);
        }
        m12861g();
        this.f12995s = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f12994r, 40000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m12861g() {
        ScheduledFuture<?> scheduledFuture = this.f12995s;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo12862h() {
        return true;
    }

    /* renamed from: i */
    public String m12863i() {
        return this.f12979b;
    }

    /* renamed from: j */
    public C3132b m12864j() {
        if (this.f12985h == null) {
            ALog.m12938d(mo12858d(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.f12990m);
            this.f12985h = new C3132b(this.f12981d, this.f12990m);
        }
        return this.f12985h;
    }

    /* renamed from: k */
    public void m12865k() {
        try {
            ThreadPoolExecutorFactory.schedule(new RunnableC3159d(this), 10000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.m12943w(mo12858d(), "startChannelService", th, new Object[0]);
        }
    }

    /* renamed from: l */
    public boolean m12866l() {
        if (2 == this.f12986i.getSecurity()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo12867m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public ArrayList<AccsConnectStateListener> m12868n() {
        return this.f12993q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12844a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3157b(this, str, z10), j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m12847a(Message message, int i10) {
        boolean z10;
        int i11;
        try {
            i11 = message.retryTimes;
        } catch (Throwable th) {
            th = th;
            z10 = false;
        }
        if (i11 > 3) {
            return false;
        }
        z10 = true;
        message.retryTimes = i11 + 1;
        message.delyTime = i10;
        ALog.m12940e(mo12858d(), "reSend dataid:" + message.dataId + " retryTimes:" + message.retryTimes, new Object[0]);
        m12854b(message, true);
        try {
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().take_date = 0L;
                message.getNetPermanceMonitor().to_tnet_date = 0L;
                NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                int i12 = message.retryTimes;
                netPermanceMonitor.retry_times = i12;
                if (i12 == 1) {
                    C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, "total", 0.0d);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            this.f12982e.m12782a(message, -8);
            ALog.m12939e(mo12858d(), "reSend error", th, new Object[0]);
            return z10;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12841a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            int i10 = AccsClientConfig.mEnv;
            if (i10 == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (i10 == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f12979b).setAppSecret(this.f12986i.getAppSecret()).setAuthCode(this.f12986i.getAuthCode()).setEnv(env).setTag(this.f12986i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.f12986i.getInappPubKey() == 10 || this.f12986i.getInappPubKey() == 11) {
                str = ConnType.PK_OPEN;
            }
            ALog.m12941i(mo12858d(), "init awcn register new conn protocol host:", this.f12986i.getInappHost());
            StrategyTemplate.getInstance().registerConnProtocol(this.f12986i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "initAwcn", th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m12851b(int i10) {
        if (i10 < 0) {
            ALog.m12940e(mo12858d(), "reSendAck", Constants.KEY_DATA_ID, Integer.valueOf(i10));
            Message message = this.f12989l.get(Integer.valueOf(i10));
            if (message != null) {
                m12847a(message, 5000);
                C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, 0.0d);
            }
        }
    }

    /* renamed from: c */
    public void mo12857c(int i10) {
        f12977n = i10 != 1 ? 0 : 1;
    }

    /* renamed from: b */
    public String mo12849b(String str) {
        String inappHost = this.f12986i.getInappHost();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(TextUtils.isEmpty(str) ? "" : str);
        sb2.append(inappHost);
        String sb3 = sb2.toString();
        try {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb4.append(str);
            sb4.append(inappHost);
            return sb4.toString();
        } catch (Throwable th) {
            ALog.m12939e("InAppConnection", "getHost", th, new Object[0]);
            return sb3;
        }
    }

    /* renamed from: a */
    public void m12842a(AccsConnectStateListener accsConnectStateListener) {
        synchronized (this.f12993q) {
            this.f12993q.add(accsConnectStateListener);
        }
    }

    /* renamed from: b */
    public void m12853b(Message message, int i10) {
        this.f12982e.m12782a(message, i10);
    }

    /* renamed from: b */
    public void m12852b(AccsConnectStateListener accsConnectStateListener) {
        synchronized (this.f12993q) {
            this.f12993q.remove(accsConnectStateListener);
        }
    }
}
