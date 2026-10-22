package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.strategy.IConnStrategy;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3139d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p073ut.monitor.SessionMonitor;
import com.taobao.accs.p073ut.monitor.TrafficsMonitor;
import com.taobao.accs.p073ut.p074a.C3183c;
import com.taobao.accs.p073ut.p074a.C3184d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.C3204q;
import com.taobao.accs.utl.C3209v;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.agoo.message.MessageService;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.taobao.accs.net.v */
/* loaded from: classes.dex */
public class C3177v extends AbstractC3156a implements SessionCb, Spdycb {

    /* renamed from: A */
    private SpdySession f13050A;

    /* renamed from: B */
    private Object f13051B;

    /* renamed from: C */
    private long f13052C;

    /* renamed from: D */
    private long f13053D;

    /* renamed from: E */
    private long f13054E;

    /* renamed from: F */
    private long f13055F;

    /* renamed from: G */
    private int f13056G;

    /* renamed from: H */
    private String f13057H;

    /* renamed from: I */
    private SessionMonitor f13058I;

    /* renamed from: J */
    private C3183c f13059J;

    /* renamed from: K */
    private boolean f13060K;

    /* renamed from: L */
    private String f13061L;

    /* renamed from: M */
    private boolean f13062M;

    /* renamed from: N */
    private C3163h f13063N;

    /* renamed from: O */
    private String f13064O;

    /* renamed from: o */
    protected ScheduledFuture<?> f13065o;

    /* renamed from: p */
    protected String f13066p;

    /* renamed from: q */
    protected int f13067q;

    /* renamed from: r */
    protected String f13068r;

    /* renamed from: s */
    protected int f13069s;

    /* renamed from: t */
    private int f13070t;

    /* renamed from: u */
    private LinkedList<Message> f13071u;

    /* renamed from: v */
    private a f13072v;

    /* renamed from: w */
    private boolean f13073w;

    /* renamed from: x */
    private String f13074x;

    /* renamed from: y */
    private String f13075y;

    /* renamed from: z */
    private SpdyAgent f13076z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.taobao.accs.net.v$a */
    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: a */
        public int f13077a;

        /* renamed from: b */
        long f13078b;

        /* renamed from: d */
        private final String f13080d;

        public a(String str) {
            super(str);
            this.f13080d = getName();
            this.f13077a = 0;
        }

        /* renamed from: a */
        private void m12921a(boolean z10) {
            if (C3177v.this.f13070t != 1) {
                ALog.m12938d(C3177v.this.mo12858d(), "tryConnect", "force", Boolean.valueOf(z10));
                if (!UtilityImpl.m12985i(C3177v.this.f12981d)) {
                    ALog.m12940e(this.f13080d, "Network not available", new Object[0]);
                    return;
                }
                if (z10) {
                    this.f13077a = 0;
                }
                ALog.m12941i(this.f13080d, "tryConnect", "force", Boolean.valueOf(z10), "failTimes", Integer.valueOf(this.f13077a));
                if (C3177v.this.f13070t != 1 && this.f13077a >= 4) {
                    C3177v.this.f13060K = true;
                    ALog.m12940e(this.f13080d, "tryConnect fail", "maxTimes", 4);
                    return;
                }
                if (C3177v.this.f13070t != 1) {
                    if (C3177v.this.f12980c == 1 && this.f13077a == 0) {
                        ALog.m12941i(this.f13080d, "tryConnect in app, no sleep", new Object[0]);
                    } else {
                        ALog.m12941i(this.f13080d, "tryConnect, need sleep", new Object[0]);
                        try {
                            Thread.sleep(5000L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                    C3177v.this.f13061L = "";
                    if (this.f13077a == 3) {
                        C3177v.this.f13063N.m12882b(C3177v.this.m12919p());
                    }
                    C3177v.this.m12907d((String) null);
                    C3177v.this.f13058I.setRetryTimes(this.f13077a);
                    if (C3177v.this.f13070t != 1) {
                        this.f13077a++;
                        ALog.m12940e(this.f13080d, "try connect fail, ready for reconnect", new Object[0]);
                        m12921a(false);
                        return;
                    }
                    this.f13078b = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (C3177v.this.f13070t == 1 && System.currentTimeMillis() - this.f13078b > 5000) {
                this.f13077a = 0;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Message message;
            boolean z10;
            Integer num;
            Integer num2;
            int id2;
            Integer num3;
            ALog.m12941i(this.f13080d, "NetworkThread run", new Object[0]);
            this.f13077a = 0;
            Message message2 = null;
            while (C3177v.this.f13073w) {
                ALog.m12938d(this.f13080d, "ready to get message", new Object[0]);
                synchronized (C3177v.this.f13071u) {
                    if (C3177v.this.f13071u.size() == 0) {
                        try {
                            ALog.m12938d(this.f13080d, "no message, wait", new Object[0]);
                            C3177v.this.f13071u.wait();
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                    ALog.m12938d(this.f13080d, "try get message", new Object[0]);
                    if (C3177v.this.f13071u.size() != 0) {
                        message2 = (Message) C3177v.this.f13071u.getFirst();
                        if (message2.getNetPermanceMonitor() != null) {
                            message2.getNetPermanceMonitor().onTakeFromQueue();
                        }
                    }
                    message = message2;
                }
                if (!C3177v.this.f13073w) {
                    break;
                }
                if (message != null) {
                    ALog.m12938d(this.f13080d, "sendMessage not null", new Object[0]);
                    try {
                        int type = message.getType();
                        ALog.m12941i(this.f13080d, "sendMessage", "type", Message.MsgType.name(type), Progress.STATUS, Integer.valueOf(C3177v.this.f13070t));
                        if (type == 2) {
                            if (C3177v.this.f12980c == 1) {
                                ALog.m12938d(this.f13080d, "sendMessage INAPP ping, skip", new Object[0]);
                                try {
                                    ALog.m12938d(this.f13080d, "send succ, remove it", new Object[0]);
                                    synchronized (C3177v.this.f13071u) {
                                        C3177v.this.f13071u.remove(message);
                                    }
                                } catch (Throwable th) {
                                    ALog.m12939e(this.f13080d, " run finally error", th, new Object[0]);
                                }
                            } else {
                                if (System.currentTimeMillis() - C3177v.this.f13052C < (AbstractC3162g.m12870a(C3177v.this.f12981d).m12873b() - 1) * 1000 && !message.force) {
                                    m12921a(false);
                                    z10 = true;
                                }
                                ALog.m12938d(this.f13080d, "sendMessage", "force", Boolean.valueOf(message.force), "last ping", Long.valueOf(System.currentTimeMillis() - C3177v.this.f13052C));
                                m12921a(true);
                                if (C3177v.this.f13050A != null && C3177v.this.f13070t == 1) {
                                    if (System.currentTimeMillis() - C3177v.this.f13052C >= (AbstractC3162g.m12870a(C3177v.this.f12981d).m12873b() - 1) * 1000) {
                                        ALog.m12941i(this.f13080d, "sendMessage onSendPing", new Object[0]);
                                        C3177v.this.f12982e.m12779a();
                                        C3177v.this.f13050A.submitPing();
                                        C3177v.this.f13058I.onSendPing();
                                        C3177v.this.f13052C = System.currentTimeMillis();
                                        C3177v.this.f13053D = System.nanoTime();
                                        C3177v.this.m12860f();
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                            }
                        } else {
                            if (type == 1) {
                                m12921a(true);
                                if (C3177v.this.f13070t == 1 && C3177v.this.f13050A != null) {
                                    C3177v c3177v = C3177v.this;
                                    byte[] build = message.build(c3177v.f12981d, c3177v.f12980c);
                                    message.setSendTime(System.currentTimeMillis());
                                    if (build.length > 49152 && message.command.intValue() != 102) {
                                        C3177v.this.f12982e.m12782a(message, -4);
                                    } else {
                                        if (message.isAck) {
                                            id2 = -message.getMsgId().getId();
                                        } else {
                                            id2 = message.getMsgId().getId();
                                        }
                                        C3177v.this.f13050A.sendCustomControlFrame(id2, 200, 0, build.length, build);
                                        ALog.m12940e(this.f13080d, "send data", "length", Integer.valueOf(build.length), Constants.KEY_DATA_ID, message.getDataId(), "utdid", C3177v.this.f12987j);
                                        C3177v.this.f12982e.m12781a(message);
                                        if (message.isAck) {
                                            ALog.m12940e(this.f13080d, "sendCFrame end ack", Constants.KEY_DATA_ID, Integer.valueOf(id2));
                                            C3177v.this.f12989l.put(Integer.valueOf(id2), message);
                                        }
                                        if (message.getNetPermanceMonitor() != null) {
                                            message.getNetPermanceMonitor().onSendData();
                                        }
                                        C3177v.this.mo12844a(message.getDataId(), C3177v.this.f12986i.isQuickReconnect(), message.timeout);
                                        C3177v.this.f12982e.m12785a(new TrafficsMonitor.C3187a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), C3177v.this.m12919p(), build.length));
                                    }
                                }
                                z10 = false;
                            } else {
                                m12921a(false);
                                ALog.m12940e(this.f13080d, "skip msg", "type", Integer.valueOf(type));
                            }
                            z10 = true;
                        }
                        try {
                            C3177v.this.m12916t();
                            if (!z10) {
                                try {
                                    C3177v.this.m12918o();
                                    if (C3177v.this.f13058I != null) {
                                        C3177v.this.f13058I.setCloseReason("send fail");
                                    }
                                    synchronized (C3177v.this.f13071u) {
                                        for (int size = C3177v.this.f13071u.size() - 1; size >= 0; size--) {
                                            Message message3 = (Message) C3177v.this.f13071u.get(size);
                                            if (message3 != null && (num3 = message3.command) != null && (num3.intValue() == 100 || message3.command.intValue() == 201)) {
                                                C3177v.this.f12982e.m12782a(message3, -1);
                                                C3177v.this.f13071u.remove(size);
                                            }
                                        }
                                        ALog.m12940e(this.f13080d, "network disconnected, wait", new Object[0]);
                                        C3177v.this.f13071u.wait();
                                    }
                                } catch (Throwable th2) {
                                    ALog.m12939e(this.f13080d, " run finally error", th2, new Object[0]);
                                }
                            } else {
                                ALog.m12938d(this.f13080d, "send succ, remove it", new Object[0]);
                                synchronized (C3177v.this.f13071u) {
                                    C3177v.this.f13071u.remove(message);
                                }
                            }
                            ALog.m12939e(this.f13080d, " run finally error", th2, new Object[0]);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, message.serviceId, "1", C3177v.this.f12980c + th.toString());
                                th.printStackTrace();
                                ALog.m12939e(this.f13080d, "service connection run", th, new Object[0]);
                                if (!z10) {
                                    try {
                                        C3177v.this.m12918o();
                                        if (C3177v.this.f13058I != null) {
                                            C3177v.this.f13058I.setCloseReason("send fail");
                                        }
                                        synchronized (C3177v.this.f13071u) {
                                            for (int size2 = C3177v.this.f13071u.size() - 1; size2 >= 0; size2--) {
                                                Message message4 = (Message) C3177v.this.f13071u.get(size2);
                                                if (message4 != null && (num2 = message4.command) != null && (num2.intValue() == 100 || message4.command.intValue() == 201)) {
                                                    C3177v.this.f12982e.m12782a(message4, -1);
                                                    C3177v.this.f13071u.remove(size2);
                                                }
                                            }
                                            ALog.m12940e(this.f13080d, "network disconnected, wait", new Object[0]);
                                            C3177v.this.f13071u.wait();
                                        }
                                    } catch (Throwable th4) {
                                        ALog.m12939e(this.f13080d, " run finally error", th4, new Object[0]);
                                    }
                                    message2 = message;
                                } else {
                                    ALog.m12938d(this.f13080d, "send succ, remove it", new Object[0]);
                                    synchronized (C3177v.this.f13071u) {
                                        C3177v.this.f13071u.remove(message);
                                    }
                                    message2 = message;
                                }
                                ALog.m12939e(this.f13080d, " run finally error", th4, new Object[0]);
                                message2 = message;
                            } catch (Throwable th5) {
                                try {
                                    if (!z10) {
                                        C3177v.this.m12918o();
                                        if (C3177v.this.f13058I != null) {
                                            C3177v.this.f13058I.setCloseReason("send fail");
                                        }
                                        synchronized (C3177v.this.f13071u) {
                                            for (int size3 = C3177v.this.f13071u.size() - 1; size3 >= 0; size3--) {
                                                Message message5 = (Message) C3177v.this.f13071u.get(size3);
                                                if (message5 != null && (num = message5.command) != null && (num.intValue() == 100 || message5.command.intValue() == 201)) {
                                                    C3177v.this.f12982e.m12782a(message5, -1);
                                                    C3177v.this.f13071u.remove(size3);
                                                }
                                            }
                                            ALog.m12940e(this.f13080d, "network disconnected, wait", new Object[0]);
                                            C3177v.this.f13071u.wait();
                                            throw th5;
                                        }
                                    }
                                    ALog.m12938d(this.f13080d, "send succ, remove it", new Object[0]);
                                    synchronized (C3177v.this.f13071u) {
                                        C3177v.this.f13071u.remove(message);
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    ALog.m12939e(this.f13080d, " run finally error", th6, new Object[0]);
                                    throw th5;
                                }
                                ALog.m12939e(this.f13080d, " run finally error", th6, new Object[0]);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z10 = true;
                    }
                }
                message2 = message;
            }
            C3177v.this.m12918o();
        }
    }

    public C3177v(Context context, int i10, String str) {
        super(context, i10, str);
        this.f13070t = 3;
        this.f13071u = new LinkedList<>();
        this.f13073w = true;
        this.f13076z = null;
        this.f13050A = null;
        this.f13051B = new Object();
        this.f13056G = -1;
        this.f13057H = null;
        this.f13060K = false;
        this.f13061L = "";
        this.f13062M = false;
        this.f13063N = new C3163h(m12919p());
        m12917u();
    }

    /* renamed from: r */
    private int m12914r() {
        boolean m12866l = m12866l();
        if (AccsClientConfig.mEnv == 2) {
            return 0;
        }
        int channelPubKey = this.f12986i.getChannelPubKey();
        if (channelPubKey > 0) {
            ALog.m12941i(mo12858d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
            return channelPubKey;
        }
        if (m12866l) {
            return 4;
        }
        return 3;
    }

    /* renamed from: s */
    private void m12915s() {
        if (this.f13050A == null) {
            m12906d(3);
            return;
        }
        try {
            String encode = URLEncoder.encode(UtilityImpl.m12986j(this.f12981d));
            String m12955a = UtilityImpl.m12955a(m12863i(), this.f12986i.getAppSecret(), UtilityImpl.m12986j(this.f12981d));
            String m12856c = m12856c(this.f13074x);
            ALog.m12940e(mo12858d(), BaseMonitor.ALARM_POINT_AUTH, "url", m12856c);
            this.f13075y = m12856c;
            if (!m12899a(encode, m12863i(), m12955a)) {
                ALog.m12940e(mo12858d(), "auth param error!", new Object[0]);
                m12909e(-6);
            } else {
                SpdyRequest spdyRequest = new SpdyRequest(new URL(m12856c), "GET", RequestPriority.DEFAULT_PRIORITY, 80000, AbstractC3156a.ACCS_RECEIVE_TIMEOUT);
                spdyRequest.setDomain(m12919p());
                this.f13050A.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), m12919p(), this);
            }
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "auth exception ", th, new Object[0]);
            m12909e(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public synchronized void m12916t() {
        if (this.f12980c == 1) {
            return;
        }
        this.f13052C = System.currentTimeMillis();
        this.f13053D = System.nanoTime();
        AbstractC3162g.m12870a(this.f12981d).m12872a();
    }

    /* renamed from: u */
    private void m12917u() {
        try {
            SpdyAgent.enableDebug = ALog.isPrintLog();
            this.f13076z = SpdyAgent.getInstance(this.f12981d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (SpdyAgent.checkLoadSucc()) {
                C3204q.m13024a();
            } else {
                ALog.m12940e(mo12858d(), "initClient", new Object[0]);
                this.f13076z = null;
                C3204q.m13025b();
            }
        } catch (Throwable th) {
            ALog.m12939e(mo12858d(), "initClient", th, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
        ALog.m12944w(mo12858d(), "bioPingRecvCallback uniId:" + i10, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        spdySession.getDomain();
        return UtilityImpl.m12972c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: h */
    public boolean mo12862h() {
        return false;
    }

    /* renamed from: o */
    public void m12918o() {
        ALog.m12940e(mo12858d(), " force close!", new Object[0]);
        try {
            this.f13050A.closeSession();
            this.f13058I.setCloseType(1);
        } catch (Exception unused) {
        }
        m12906d(3);
    }

    /* renamed from: p */
    public String m12919p() {
        String channelHost = this.f12986i.getChannelHost();
        ALog.m12941i(mo12858d(), "getChannelHost", "host", channelHost);
        if (channelHost == null) {
            return "";
        }
        return channelHost;
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        spdySession.getDomain();
        return UtilityImpl.m12965b();
    }

    /* renamed from: q */
    public boolean m12920q() {
        return this.f13073w;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        m12851b(i10);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        String str;
        m12916t();
        ALog.m12940e(mo12858d(), "onFrame", "type", Integer.valueOf(i11), "len", Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long currentTimeMillis = System.currentTimeMillis();
            for (byte b10 : bArr) {
                sb2.append(Integer.toHexString(b10 & 255));
                sb2.append(" ");
            }
            ALog.m12938d(mo12858d(), ((Object) sb2) + " log time:" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        }
        if (i11 == 200) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.f12982e.m12786a(bArr);
                C3184d m12795g = this.f12982e.m12795g();
                if (m12795g != null) {
                    m12795g.f13113c = String.valueOf(currentTimeMillis2);
                    if (this.f12980c == 0) {
                        str = "service";
                    } else {
                        str = "inapp";
                    }
                    m12795g.f13117g = str;
                    m12795g.m12931a();
                }
            } catch (Throwable th) {
                ALog.m12939e(mo12858d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.m12956a(th));
            }
            ALog.m12938d(mo12858d(), "try handle msg", new Object[0]);
            m12861g();
        } else {
            ALog.m12940e(mo12858d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.m12938d(mo12858d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
        ALog.m12938d(mo12858d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.m12938d(mo12858d(), "spdyDataRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.m12938d(mo12858d(), "spdyDataSendCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
        String str;
        this.f13052C = System.currentTimeMillis();
        this.f13053D = System.nanoTime();
        try {
            Map<String, String> m12958a = UtilityImpl.m12958a(map);
            ALog.m12938d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int parseInt = Integer.parseInt(m12958a.get(":status"));
            ALog.m12940e(mo12858d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(parseInt));
            if (parseInt == 200) {
                m12906d(1);
                String str2 = m12958a.get("x-at");
                if (!TextUtils.isEmpty(str2)) {
                    this.f12988k = str2;
                }
                SessionMonitor sessionMonitor = this.f13058I;
                long j11 = 0;
                if (sessionMonitor.connection_stop_date > 0) {
                    j11 = System.currentTimeMillis() - this.f13058I.connection_stop_date;
                }
                sessionMonitor.auth_time = j11;
                if (this.f12980c == 0) {
                    str = "service";
                } else {
                    str = "inapp";
                }
                UTMini.getInstance().commitEvent(66001, "CONNECTED 200 " + str, this.f13075y, this.f13061L, Integer.valueOf(Constants.SDK_VERSION_CODE), MessageService.MSG_DB_READY_REPORT);
                C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_AUTH, "");
            } else {
                m12909e(parseInt);
            }
        } catch (Exception e10) {
            ALog.m12940e(mo12858d(), e10.toString(), new Object[0]);
            m12918o();
            this.f13058I.setCloseReason("exception");
        }
        ALog.m12938d(mo12858d(), "spdyOnStreamResponse", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.m12938d(mo12858d(), "spdyPingRecvCallback uniId:" + j10, new Object[0]);
        if (j10 < 0) {
            return;
        }
        this.f12982e.m12789b();
        AbstractC3162g.m12870a(this.f12981d).m12876e();
        AbstractC3162g.m12870a(this.f12981d).m12872a();
        this.f13058I.onPingCBReceive();
        if (this.f13058I.ping_rec_times % 2 == 0) {
            UtilityImpl.m12959a(this.f12981d, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.m12938d(mo12858d(), "spdyRequestRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        String str;
        ALog.m12940e(mo12858d(), "spdySessionCloseCallback", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m12940e(mo12858d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        m12906d(3);
        this.f13058I.onCloseConnect();
        if (this.f13058I.getConCloseDate() > 0 && this.f13058I.getConStopDate() > 0) {
            this.f13058I.getConCloseDate();
            this.f13058I.getConStopDate();
        }
        this.f13058I.setCloseReason(this.f13058I.getCloseReason() + "tnet error:" + i10);
        if (superviseConnectInfo != null) {
            this.f13058I.live_time = superviseConnectInfo.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.f13058I);
        for (Message message : this.f12982e.m12793e()) {
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().setRet(false);
                message.getNetPermanceMonitor().setFailReason("session close");
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
        }
        if (this.f12980c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        ALog.m12938d(mo12858d(), "spdySessionCloseCallback, conKeepTime:" + this.f13058I.live_time + " connectType:" + str, new Object[0]);
        UTMini uTMini = UTMini.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DISCONNECT CLOSE ");
        sb2.append(str);
        uTMini.commitEvent(66001, sb2.toString(), Integer.valueOf(i10), Long.valueOf(this.f13058I.live_time), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13075y, this.f13061L);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        String str;
        this.f13056G = superviseConnectInfo.connectTime;
        int i10 = superviseConnectInfo.handshakeTime;
        ALog.m12940e(mo12858d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.f13056G), "sslTime", Integer.valueOf(i10), "reuse", Integer.valueOf(superviseConnectInfo.sessionTicketReused));
        m12915s();
        this.f13058I.setRet(true);
        this.f13058I.onConnectStop();
        SessionMonitor sessionMonitor = this.f13058I;
        sessionMonitor.tcp_time = this.f13056G;
        sessionMonitor.ssl_time = i10;
        if (this.f12980c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        UTMini.getInstance().commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo.sessionTicketReused, String.valueOf(this.f13056G), String.valueOf(i10), Integer.valueOf(Constants.SDK_VERSION_CODE), String.valueOf(superviseConnectInfo.sessionTicketReused), this.f13075y, this.f13061L);
        C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_CONNECT, "");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        int i11;
        String str;
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m12940e(mo12858d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        a aVar = this.f13072v;
        if (aVar != null) {
            i11 = aVar.f13077a;
        } else {
            i11 = 0;
        }
        ALog.m12940e(mo12858d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i11), "errorId", Integer.valueOf(i10));
        this.f13060K = false;
        this.f13062M = true;
        m12906d(3);
        this.f13058I.setFailReason(i10);
        this.f13058I.onConnectStop();
        if (this.f12980c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13075y, this.f13061L);
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i11, i10 + "", "");
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
        ALog.m12938d(mo12858d(), "spdyStreamCloseCallback", new Object[0]);
        if (i10 != 0) {
            ALog.m12940e(mo12858d(), "spdyStreamCloseCallback", "statusCode", Integer.valueOf(i10));
            m12909e(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12907d(String str) {
        SessionInfo sessionInfo;
        int i10 = this.f13070t;
        if (i10 == 2 || i10 == 1) {
            return;
        }
        if (this.f13063N == null) {
            this.f13063N = new C3163h(m12919p());
        }
        List<IConnStrategy> m12880a = this.f13063N.m12880a(m12919p());
        int i11 = Constants.PORT;
        if (m12880a != null && m12880a.size() > 0) {
            for (IConnStrategy iConnStrategy : m12880a) {
                if (iConnStrategy != null) {
                    ALog.m12940e(mo12858d(), BaseMonitor.ALARM_POINT_CONNECT, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, iConnStrategy.getIp(), IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(iConnStrategy.getPort()));
                }
            }
            if (this.f13062M) {
                this.f13063N.m12881b();
                this.f13062M = false;
            }
            IConnStrategy m12878a = this.f13063N.m12878a();
            this.f13066p = m12878a == null ? m12919p() : m12878a.getIp();
            if (m12878a != null) {
                i11 = m12878a.getPort();
            }
            this.f13067q = i11;
            C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_DNS, "httpdns", 0.0d);
            ALog.m12940e(mo12858d(), "connect from amdc succ", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f13066p, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f13067q), "originPos", Integer.valueOf(this.f13063N.m12883c()));
        } else {
            if (str != null) {
                this.f13066p = str;
            } else {
                this.f13066p = m12919p();
            }
            if (System.currentTimeMillis() % 2 == 0) {
                i11 = 80;
            }
            this.f13067q = i11;
            C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_DNS, "localdns", 0.0d);
            ALog.m12941i(mo12858d(), "connect get ip from amdc fail!!", new Object[0]);
        }
        this.f13074x = "https://" + this.f13066p + ":" + this.f13067q + "/accs/";
        ALog.m12940e(mo12858d(), BaseMonitor.ALARM_POINT_CONNECT, "URL", this.f13074x);
        this.f13064O = String.valueOf(System.currentTimeMillis());
        if (this.f13058I != null) {
            AppMonitor.getInstance().commitStat(this.f13058I);
        }
        SessionMonitor sessionMonitor = new SessionMonitor();
        this.f13058I = sessionMonitor;
        sessionMonitor.setConnectType(this.f12980c == 0 ? "service" : "inapp");
        if (this.f13076z != null) {
            try {
                this.f13054E = System.currentTimeMillis();
                this.f13055F = System.nanoTime();
                this.f13068r = UtilityImpl.m12954a(this.f12981d);
                this.f13069s = UtilityImpl.m12966b(this.f12981d);
                this.f13052C = System.currentTimeMillis();
                this.f13058I.onStartConnect();
                m12906d(2);
                synchronized (this.f13051B) {
                    try {
                        try {
                            if (!TextUtils.isEmpty(this.f13068r) && this.f13069s >= 0 && this.f13060K) {
                                ALog.m12940e(mo12858d(), BaseMonitor.ALARM_POINT_CONNECT, "proxy", this.f13068r, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f13069s));
                                sessionInfo = new SessionInfo(this.f13066p, this.f13067q, m12919p() + "_" + this.f12979b, this.f13068r, this.f13069s, this.f13064O, this, 4226);
                                this.f13061L = this.f13068r + ":" + this.f13069s;
                            } else {
                                ALog.m12940e(mo12858d(), "connect normal", new Object[0]);
                                sessionInfo = new SessionInfo(this.f13066p, this.f13067q, m12919p() + "_" + this.f12979b, null, 0, this.f13064O, this, 4226);
                                this.f13061L = "";
                            }
                            sessionInfo.setPubKeySeqNum(m12914r());
                            sessionInfo.setConnectionTimeoutMs(AbstractC3156a.ACCS_RECEIVE_TIMEOUT);
                            this.f13050A = this.f13076z.createSession(sessionInfo);
                            this.f13058I.connection_stop_date = 0L;
                            this.f13051B.wait();
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.f13060K = false;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: c */
    public C3183c mo12855c() {
        if (this.f13059J == null) {
            this.f13059J = new C3183c();
        }
        C3183c c3183c = this.f13059J;
        c3183c.f13101b = this.f12980c;
        c3183c.f13103d = this.f13071u.size();
        this.f13059J.f13108i = UtilityImpl.m12985i(this.f12981d);
        C3183c c3183c2 = this.f13059J;
        c3183c2.f13105f = this.f13061L;
        c3183c2.f13100a = this.f13070t;
        SessionMonitor sessionMonitor = this.f13058I;
        c3183c2.f13102c = sessionMonitor != null && sessionMonitor.getRet();
        this.f13059J.f13109j = m12920q();
        C3183c c3183c3 = this.f13059J;
        C3139d c3139d = this.f12982e;
        c3183c3.f13104e = c3139d != null ? c3139d.m12792d() : 0;
        C3183c c3183c4 = this.f13059J;
        c3183c4.f13106g = this.f13075y;
        return c3183c4;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: e */
    public void mo12859e() {
        super.mo12859e();
        this.f13073w = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3179x(this));
        ALog.m12940e(mo12858d(), "shut down", new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: b */
    public void mo12850b() {
        this.f13060K = false;
        this.f12983f = 0;
    }

    /* renamed from: e */
    private void m12909e(int i10) {
        this.f12988k = null;
        m12918o();
        a aVar = this.f13072v;
        int i11 = aVar != null ? aVar.f13077a : 0;
        this.f13058I.setCloseReason("code not 200 is" + i10);
        this.f13062M = true;
        String str = this.f12980c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED NO 200 " + str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13075y, this.f13061L);
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_AUTH, "", i10 + "", "");
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12840a() {
        this.f13073w = true;
        ALog.m12938d(mo12858d(), "start", new Object[0]);
        mo12841a(this.f12981d);
        if (this.f13072v == null) {
            ALog.m12941i(mo12858d(), "start thread", new Object[0]);
            a aVar = new a("NetworkThread_" + this.f12990m);
            this.f13072v = aVar;
            aVar.setPriority(2);
            this.f13072v.start();
        }
        mo12846a(false, false);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: b */
    public String mo12849b(String str) {
        return "https://" + this.f12986i.getChannelHost();
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12843a(Message message, boolean z10) {
        if (this.f13073w && message != null) {
            try {
                if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() <= 1000) {
                    ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3178w(this, message, z10), message.delyTime, TimeUnit.MILLISECONDS);
                    if (message.getType() == 1 && message.cunstomDataId != null) {
                        if (message.isControlFrame()) {
                            mo12848a(message.cunstomDataId);
                        }
                        this.f12982e.f12924a.put(message.cunstomDataId, schedule);
                    }
                    if (message.getNetPermanceMonitor() != null) {
                        message.getNetPermanceMonitor().setDeviceId(UtilityImpl.m12986j(this.f12981d));
                        message.getNetPermanceMonitor().setConnType(this.f12980c);
                        message.getNetPermanceMonitor().onEnterQueueData();
                        return;
                    }
                    return;
                }
                throw new RejectedExecutionException("accs");
            } catch (RejectedExecutionException unused) {
                this.f12982e.m12782a(message, ErrorCode.MESSAGE_QUEUE_FULL);
                ALog.m12940e(mo12858d(), "send queue full count:" + ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size(), new Object[0]);
                return;
            } catch (Throwable th) {
                this.f12982e.m12782a(message, -8);
                ALog.m12939e(mo12858d(), "send error", th, new Object[0]);
                return;
            }
        }
        ALog.m12940e(mo12858d(), "not running or msg null! " + this.f13073w, new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12846a(boolean z10, boolean z11) {
        ALog.m12938d(mo12858d(), "try ping, force:" + z10, new Object[0]);
        if (this.f12980c == 1) {
            ALog.m12938d(mo12858d(), "INAPP, skip", new Object[0]);
            return;
        }
        Message BuildPing = Message.BuildPing(z10, (int) (z11 ? Math.random() * 10.0d * 1000.0d : 0.0d));
        int pingTimeout = this.f12986i.getPingTimeout();
        if (pingTimeout > 0) {
            BuildPing.timeout = pingTimeout;
        }
        m12854b(BuildPing, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003a. Please report as an issue. */
    /* renamed from: a */
    public void m12896a(Message message) {
        if (message.command == null || this.f13071u.size() == 0) {
            return;
        }
        for (int size = this.f13071u.size() - 1; size >= 0; size--) {
            Message message2 = this.f13071u.get(size);
            if (message2 != null && message2.command != null && message2.getPackageName().equals(message.getPackageName())) {
                switch (message.command.intValue()) {
                    case 1:
                    case 2:
                        if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                            this.f13071u.remove(size);
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                            this.f13071u.remove(size);
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                        if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                            this.f13071u.remove(size);
                            break;
                        }
                        break;
                }
                ALog.m12938d(mo12858d(), "clearRepeatControlCommand message:" + message2.command + Operator.Operation.DIVISION + message2.getPackageName(), new Object[0]);
            }
        }
        C3139d c3139d = this.f12982e;
        if (c3139d != null) {
            c3139d.m12790b(message);
        }
    }

    /* renamed from: d */
    private synchronized void m12906d(int i10) {
        ALog.m12940e(mo12858d(), "notifyStatus start", Progress.STATUS, m12839a(i10));
        if (i10 == this.f13070t) {
            ALog.m12941i(mo12858d(), "ignore notifyStatus", new Object[0]);
            return;
        }
        this.f13070t = i10;
        if (i10 == 1) {
            AbstractC3162g.m12870a(this.f12981d).m12877f();
            m12916t();
            ScheduledFuture<?> scheduledFuture = this.f13065o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            synchronized (this.f13051B) {
                try {
                    this.f13051B.notifyAll();
                } catch (Exception unused) {
                }
            }
            synchronized (this.f13071u) {
                try {
                    this.f13071u.notifyAll();
                } catch (Exception unused2) {
                }
            }
            ALog.m12941i(mo12858d(), "notifyStatus end", Progress.STATUS, m12839a(i10));
        }
        if (i10 == 2) {
            ScheduledFuture<?> scheduledFuture2 = this.f13065o;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3180y(this, this.f13064O), 120000L, TimeUnit.MILLISECONDS);
        } else if (i10 == 3) {
            m12916t();
            AbstractC3162g.m12870a(this.f12981d).m12875d();
            synchronized (this.f13051B) {
                try {
                    this.f13051B.notifyAll();
                } catch (Exception unused3) {
                }
            }
            this.f12982e.m12780a(-10);
            mo12846a(false, true);
        }
        ALog.m12941i(mo12858d(), "notifyStatus end", Progress.STATUS, m12839a(i10));
    }

    /* renamed from: a */
    private boolean m12899a(String str, String str2, String str3) {
        int i10 = 1;
        if (C3209v.m13046b(this.f12981d) == 2) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        m12906d(3);
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                i10 = 2;
            } else if (TextUtils.isEmpty(str3)) {
                i10 = 3;
            }
        }
        this.f13058I.setFailReason(i10);
        this.f13058I.onConnectStop();
        String str4 = this.f12980c == 0 ? "service" : "inapp";
        a aVar = this.f13072v;
        int i11 = aVar != null ? aVar.f13077a : 0;
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str4, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f13075y, this.f13061L);
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i11, i10 + "", "");
        return false;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12845a(String str, boolean z10, String str2) {
        try {
            m12906d(4);
            m12918o();
            this.f13058I.setCloseReason(str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public boolean mo12848a(String str) {
        boolean z10;
        String str2;
        synchronized (this.f13071u) {
            z10 = true;
            int size = this.f13071u.size() - 1;
            while (true) {
                if (size >= 0) {
                    Message message = this.f13071u.get(size);
                    if (message != null && message.getType() == 1 && (str2 = message.cunstomDataId) != null && str2.equals(str)) {
                        this.f13071u.remove(size);
                        break;
                    }
                    size--;
                } else {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }

    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: d */
    public String mo12858d() {
        return "SilenceConn_" + this.f12990m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.accs.net.AbstractC3156a
    /* renamed from: a */
    public void mo12841a(Context context) {
        if (this.f12984g) {
            return;
        }
        super.mo12841a(context);
        GlobalAppRuntimeInfo.setBackground(false);
        this.f12984g = true;
        ALog.m12941i(mo12858d(), "init awcn success!", new Object[0]);
    }
}
