package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0905a;
import anet.channel.entity.C0934a;
import anet.channel.entity.C0935b;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.RunnableC0944c;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import java.util.Map;
import org.android.spdy.SessionCb;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;

/* loaded from: classes.dex */
public class TnetSpdySession extends Session implements SessionCb {

    /* renamed from: A */
    protected long f4003A;

    /* renamed from: B */
    protected int f4004B;

    /* renamed from: C */
    protected DataFrameCb f4005C;

    /* renamed from: D */
    protected IHeartbeat f4006D;

    /* renamed from: E */
    protected IAuth f4007E;

    /* renamed from: F */
    protected String f4008F;

    /* renamed from: G */
    protected ISecurity f4009G;

    /* renamed from: H */
    private int f4010H;

    /* renamed from: I */
    private boolean f4011I;

    /* renamed from: w */
    protected SpdyAgent f4012w;

    /* renamed from: x */
    protected SpdySession f4013x;

    /* renamed from: y */
    protected volatile boolean f4014y;

    /* renamed from: z */
    protected long f4015z;

    /* renamed from: anet.channel.session.TnetSpdySession$a */
    /* loaded from: classes.dex */
    private class C0962a extends C0963a {

        /* renamed from: b */
        private Request f4017b;

        /* renamed from: c */
        private RequestCb f4018c;

        /* renamed from: d */
        private int f4019d = 0;

        /* renamed from: e */
        private long f4020e = 0;

        public C0962a(Request request, RequestCb requestCb) {
            this.f4017b = request;
            this.f4018c = requestCb;
        }

        /* renamed from: a */
        private void m4663a(SuperviseData superviseData, int i10, String str) {
            try {
                this.f4017b.f3956a.rspEnd = System.currentTimeMillis();
                if (this.f4017b.f3956a.isDone.get()) {
                    return;
                }
                if (i10 > 0) {
                    this.f4017b.f3956a.ret = 1;
                }
                this.f4017b.f3956a.statusCode = i10;
                this.f4017b.f3956a.msg = str;
                if (superviseData != null) {
                    this.f4017b.f3956a.rspEnd = superviseData.responseEnd;
                    this.f4017b.f3956a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                    RequestStatistic requestStatistic = this.f4017b.f3956a;
                    requestStatistic.sendDataTime = superviseData.sendEnd - requestStatistic.sendStart;
                    this.f4017b.f3956a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    this.f4017b.f3956a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                    this.f4017b.f3956a.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                    this.f4017b.f3956a.recDataSize = this.f4020e + superviseData.recvUncompressSize;
                    this.f4017b.f3956a.reqHeadInflateSize = superviseData.uncompressSize;
                    this.f4017b.f3956a.reqHeadDeflateSize = superviseData.compressSize;
                    this.f4017b.f3956a.reqBodyInflateSize = superviseData.bodySize;
                    this.f4017b.f3956a.reqBodyDeflateSize = superviseData.bodySize;
                    this.f4017b.f3956a.rspHeadDeflateSize = superviseData.recvCompressSize;
                    this.f4017b.f3956a.rspHeadInflateSize = superviseData.recvUncompressSize;
                    this.f4017b.f3956a.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.f4017b.f3956a.rspBodyInflateSize = this.f4020e;
                    if (this.f4017b.f3956a.contentLength == 0) {
                        this.f4017b.f3956a.contentLength = superviseData.originContentLength;
                    }
                    SessionStatistic sessionStatistic = TnetSpdySession.this.f3739q;
                    sessionStatistic.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                    sessionStatistic.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.C0963a, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f4017b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z10));
            }
            this.f4020e += spdyByteArray.getDataLength();
            this.f4017b.f3956a.recDataSize += spdyByteArray.getDataLength();
            IHeartbeat iHeartbeat = TnetSpdySession.this.f4006D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            if (this.f4018c != null) {
                ByteArray m4511a = C0905a.a.f3805a.m4511a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f4018c.onDataReceive(m4511a, z10);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // anet.channel.session.C0963a, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
            this.f4017b.f3956a.firstDataTime = System.currentTimeMillis() - this.f4017b.f3956a.sendStart;
            this.f4019d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.f4010H = 0;
            ALog.m4788i("awcn.TnetSpdySession", "", this.f4017b.getSeq(), "statusCode", Integer.valueOf(this.f4019d));
            ALog.m4788i("awcn.TnetSpdySession", "", this.f4017b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f4018c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f4019d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f4017b.f3956a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f4017b.f3956a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f4017b.f3956a.contentLength = HttpHelper.parseContentLength(map);
            this.f4017b.f3956a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f4017b, this.f4019d);
            TnetSpdySession.this.handleResponseHeaders(this.f4017b, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.f4006D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }

        @Override // anet.channel.session.C0963a, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
            String str;
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f4017b.getSeq(), "streamId", Long.valueOf(j10), Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            }
            if (i10 != 0) {
                this.f4019d = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                str = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i10));
                if (i10 != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_TNET_EXCEPTION, str, this.f4017b.f3956a, null));
                }
                ALog.m4787e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f4017b.getSeq(), C3384f.f14569aC, TnetSpdySession.this.f3738p, "status code", Integer.valueOf(i10), "URL", this.f4017b.getHttpUrl().simpleUrlString());
            } else {
                str = HttpConstant.SUCCESS;
            }
            this.f4017b.f3956a.tnetErrorCode = i10;
            m4663a(superviseData, this.f4019d, str);
            RequestCb requestCb = this.f4018c;
            if (requestCb != null) {
                requestCb.onFinish(this.f4019d, str, this.f4017b.f3956a);
            }
            if (i10 == -2004) {
                if (!TnetSpdySession.this.f4014y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.m4659e(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.this.f4011I;
                    StrategyCenter.getInstance().notifyConnEvent(((Session) TnetSpdySession.this).f3726d, ((Session) TnetSpdySession.this).f3733k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public TnetSpdySession(Context context, C0934a c0934a) {
        super(context, c0934a);
        this.f4014y = false;
        this.f4003A = 0L;
        this.f4010H = 0;
        this.f4004B = -1;
        this.f4005C = null;
        this.f4006D = null;
        this.f4007E = null;
        this.f4008F = null;
        this.f4009G = null;
        this.f4011I = false;
    }

    /* renamed from: e */
    static /* synthetic */ int m4659e(TnetSpdySession tnetSpdySession) {
        int i10 = tnetSpdySession.f4010H + 1;
        tnetSpdySession.f4010H = i10;
        return i10;
    }

    protected void auth() {
        IAuth iAuth = this.f4007E;
        if (iAuth != null) {
            iAuth.auth(this, new C0971i(this));
            return;
        }
        notifyStatus(4, null);
        this.f3739q.ret = 1;
        IHeartbeat iHeartbeat = this.f4006D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.m4787e("awcn.TnetSpdySession", "force close!", this.f3738p, C3384f.f14569aC, this);
        notifyStatus(7, null);
        try {
            IHeartbeat iHeartbeat = this.f4006D;
            if (iHeartbeat != null) {
                iHeartbeat.stop();
                this.f4006D = null;
            }
            SpdySession spdySession = this.f4013x;
            if (spdySession != null) {
                spdySession.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012e A[Catch: all -> 0x016b, TryCatch #1 {all -> 0x016b, blocks: (B:8:0x0013, B:10:0x0017, B:11:0x001a, B:13:0x0020, B:16:0x0028, B:19:0x0030, B:21:0x00d4, B:23:0x00dc, B:26:0x00e5, B:28:0x00e9, B:29:0x010f, B:31:0x0117, B:33:0x011d, B:34:0x0120, B:36:0x012e, B:39:0x0143, B:42:0x0158, B:45:0x00ed, B:47:0x00f3, B:48:0x00f9, B:50:0x0103, B:52:0x0107, B:53:0x010c, B:54:0x010a), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143 A[Catch: all -> 0x016b, TryCatch #1 {all -> 0x016b, blocks: (B:8:0x0013, B:10:0x0017, B:11:0x001a, B:13:0x0020, B:16:0x0028, B:19:0x0030, B:21:0x00d4, B:23:0x00dc, B:26:0x00e5, B:28:0x00e9, B:29:0x010f, B:31:0x0117, B:33:0x011d, B:34:0x0120, B:36:0x012e, B:39:0x0143, B:42:0x0158, B:45:0x00ed, B:47:0x00f3, B:48:0x00f9, B:50:0x0103, B:52:0x0107, B:53:0x010c, B:54:0x010a), top: B:7:0x0013 }] */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.connect():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new RunnableC0970h(this);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            ALog.m4788i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            ISecurity iSecurity = this.f4009G;
            if (iSecurity == null) {
                return null;
            }
            return iSecurity.getBytes(this.f3723a, "accs_ssl_key2_" + domain);
        } catch (Throwable th) {
            ALog.m4786e("awcn.TnetSpdySession", "getSSLMeta", null, th, new Object[0]);
            return null;
        }
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.f4008F = config.getAppkey();
            this.f4009G = config.getSecurity();
        }
    }

    public void initSessionInfo(SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.f4005C = sessionInfo.dataFrameCb;
            this.f4007E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f3739q.isKL = 1L;
                this.f3742t = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.f4006D = iHeartbeat;
                boolean z10 = sessionInfo.isAccs;
                this.f4011I = z10;
                if (iHeartbeat == null) {
                    if (z10 && !AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.f4006D = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    } else {
                        this.f4006D = HeartbeatManager.getDefaultHeartbeat();
                    }
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.f4006D == null) {
            this.f4006D = new RunnableC0944c();
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        if (this.f3736n == 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f4014y = false;
    }

    @Override // anet.channel.Session
    public void ping(boolean z10) {
        ping(z10, this.f3741s);
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        try {
            ISecurity iSecurity = this.f4009G;
            if (iSecurity == null) {
                return -1;
            }
            if (!iSecurity.saveBytes(this.f3723a, "accs_ssl_key2_" + domain, bArr)) {
                return -1;
            }
            return 0;
        } catch (Throwable th) {
            ALog.m4786e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0111 A[Catch: Exception -> 0x01b9, SpdyErrorException -> 0x01c3, TRY_ENTER, TryCatch #4 {SpdyErrorException -> 0x01c3, Exception -> 0x01b9, blocks: (B:12:0x0051, B:14:0x0055, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:24:0x007e, B:25:0x00b7, B:27:0x00bf, B:30:0x00c4, B:31:0x00fe, B:34:0x0111, B:36:0x0118, B:37:0x011f, B:38:0x013e, B:40:0x016b, B:41:0x0180, B:62:0x011b, B:63:0x0123, B:65:0x0136, B:66:0x0138, B:67:0x00eb, B:69:0x01af), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b A[Catch: Exception -> 0x01b9, SpdyErrorException -> 0x01c3, TryCatch #4 {SpdyErrorException -> 0x01c3, Exception -> 0x01b9, blocks: (B:12:0x0051, B:14:0x0055, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:24:0x007e, B:25:0x00b7, B:27:0x00bf, B:30:0x00c4, B:31:0x00fe, B:34:0x0111, B:36:0x0118, B:37:0x011f, B:38:0x013e, B:40:0x016b, B:41:0x0180, B:62:0x011b, B:63:0x0123, B:65:0x0136, B:66:0x0138, B:67:0x00eb, B:69:0x01af), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3 A[Catch: Exception -> 0x01a8, SpdyErrorException -> 0x01aa, TRY_LEAVE, TryCatch #3 {SpdyErrorException -> 0x01aa, Exception -> 0x01a8, blocks: (B:43:0x018b, B:45:0x01a3), top: B:42:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[Catch: Exception -> 0x01b9, SpdyErrorException -> 0x01c3, TryCatch #4 {SpdyErrorException -> 0x01c3, Exception -> 0x01b9, blocks: (B:12:0x0051, B:14:0x0055, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:24:0x007e, B:25:0x00b7, B:27:0x00bf, B:30:0x00c4, B:31:0x00fe, B:34:0x0111, B:36:0x0118, B:37:0x011f, B:38:0x013e, B:40:0x016b, B:41:0x0180, B:62:0x011b, B:63:0x0123, B:65:0x0136, B:66:0x0138, B:67:0x00eb, B:69:0x01af), top: B:11:0x0051 }] */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r25, anet.channel.RequestCb r26) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
        SpdySession spdySession;
        int length;
        try {
            if (this.f4005C == null) {
                return;
            }
            ALog.m4787e("awcn.TnetSpdySession", "sendCustomFrame", this.f3738p, Constants.KEY_DATA_ID, Integer.valueOf(i10), "type", Integer.valueOf(i11));
            if (this.f3736n == 4 && (spdySession = this.f4013x) != null) {
                if (bArr != null && bArr.length > 16384) {
                    m4648a(i10, ErrorConstant.ERROR_DATA_TOO_LARGE, false, null);
                    return;
                }
                if (bArr == null) {
                    length = 0;
                } else {
                    length = bArr.length;
                }
                spdySession.sendCustomControlFrame(i10, i11, 0, length, bArr);
                SessionStatistic sessionStatistic = this.f3739q;
                sessionStatistic.requestCount++;
                sessionStatistic.cfRCount++;
                this.f4015z = System.currentTimeMillis();
                IHeartbeat iHeartbeat = this.f4006D;
                if (iHeartbeat != null) {
                    iHeartbeat.reSchedule();
                    return;
                }
                return;
            }
            ALog.m4787e("awcn.TnetSpdySession", "sendCustomFrame", this.f3738p, "sendCustomFrame con invalid mStatus:" + this.f3736n);
            m4648a(i10, ErrorConstant.ERROR_SESSION_INVALID, true, "session invalid");
        } catch (SpdyErrorException e10) {
            ALog.m4786e("awcn.TnetSpdySession", "sendCustomFrame error", this.f3738p, e10, new Object[0]);
            m4648a(i10, ErrorConstant.ERROR_TNET_EXCEPTION, true, "SpdyErrorException: " + e10.toString());
        } catch (Exception e11) {
            ALog.m4786e("awcn.TnetSpdySession", "sendCustomFrame error", this.f3738p, e11, new Object[0]);
            m4648a(i10, ErrorConstant.ERROR_EXCEPTION, true, e11.toString());
        }
    }

    public void setTnetPublicKey(int i10) {
        this.f4004B = i10;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        ALog.m4787e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f3738p, Constants.KEY_DATA_ID, Integer.valueOf(i10));
        m4648a(i10, i11, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        ALog.m4787e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f3738p, "len", Integer.valueOf(i13), "frameCb", this.f4005C);
        if (ALog.isPrintLog(1) && i13 < 512) {
            String str = "";
            for (byte b10 : bArr) {
                str = str + Integer.toHexString(b10 & 255) + " ";
            }
            ALog.m4787e("awcn.TnetSpdySession", null, this.f3738p, "str", str);
        }
        DataFrameCb dataFrameCb = this.f4005C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i10, i11);
        } else {
            ALog.m4787e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f3738p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_ACCS_CUSTOM_FRAME_CB_NULL, null, "rt"));
        }
        this.f3739q.inceptCount++;
        IHeartbeat iHeartbeat = this.f4006D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.m4788i("awcn.TnetSpdySession", "ping receive", this.f3738p, HttpConstant.HOST, this.f3725c, "id", Long.valueOf(j10));
        }
        if (j10 < 0) {
            return;
        }
        this.f4014y = false;
        this.f4010H = 0;
        IHeartbeat iHeartbeat = this.f4006D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        ALog.m4787e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f3738p, " errorCode:", Integer.valueOf(i10));
        IHeartbeat iHeartbeat = this.f4006D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.f4006D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m4786e("awcn.TnetSpdySession", "session clean up failed!", null, e10, new Object[0]);
            }
        }
        if (i10 == -3516) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            StrategyCenter.getInstance().notifyConnEvent(this.f3726d, this.f3733k, connEvent);
        }
        notifyStatus(6, new C0935b(2));
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.f3739q;
            sessionStatistic.requestCount = superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f3732j.isHTTP3()) {
                    if (spdySession != null) {
                        ALog.m4787e("awcn.TnetSpdySession", "[HTTP3 spdySessionCloseCallback]", this.f3738p, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                    }
                    this.f3739q.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.f3739q.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.f3739q.lossRate = superviseConnectInfo.lossRate;
                    this.f3739q.tlpCount = superviseConnectInfo.tlpCount;
                    this.f3739q.rtoCount = superviseConnectInfo.rtoCount;
                    this.f3739q.srtt = superviseConnectInfo.srtt;
                }
            } catch (Exception unused) {
            }
        }
        SessionStatistic sessionStatistic2 = this.f3739q;
        if (sessionStatistic2.errorCode == 0) {
            sessionStatistic2.errorCode = i10;
        }
        sessionStatistic2.lastPingInterval = (int) (System.currentTimeMillis() - this.f4015z);
        AppMonitor.getInstance().commitStat(this.f3739q);
        if (C1009d.m4780b(this.f3739q.f4044ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f3739q));
        }
        AppMonitor.getInstance().commitAlarm(this.f3739q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        SessionStatistic sessionStatistic = this.f3739q;
        sessionStatistic.connectionTime = superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.f4003A = System.currentTimeMillis();
        notifyStatus(0, new C0935b(1));
        auth();
        ALog.m4787e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f3738p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (this.f3732j.isHTTP3()) {
            this.f3739q.scid = superviseConnectInfo.scid;
            this.f3739q.dcid = superviseConnectInfo.dcid;
            this.f3739q.congControlKind = superviseConnectInfo.congControlKind;
            ALog.m4787e("awcn.TnetSpdySession", "[HTTP3 spdySessionConnectCB]", this.f3738p, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.m4786e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e10, new Object[0]);
            }
        }
        notifyStatus(2, new C0935b(256, i10, "tnet connect fail"));
        ALog.m4787e("awcn.TnetSpdySession", null, this.f3738p, " errorId:", Integer.valueOf(i10));
        SessionStatistic sessionStatistic = this.f3739q;
        sessionStatistic.errorCode = i10;
        sessionStatistic.ret = 0;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f3739q);
        if (C1009d.m4780b(this.f3739q.f4044ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f3739q));
        }
        AppMonitor.getInstance().commitAlarm(this.f3739q.getAlarmObject());
    }

    @Override // anet.channel.Session
    public void ping(boolean z10, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.TnetSpdySession", "ping", this.f3738p, "host", this.f3725c, "thread", Thread.currentThread().getName());
        }
        if (z10) {
            try {
                if (this.f4013x != null) {
                    int i11 = this.f3736n;
                    if (i11 == 0 || i11 == 4) {
                        handleCallbacks(64, null);
                        if (this.f4014y) {
                            return;
                        }
                        this.f4014y = true;
                        this.f3739q.ppkgCount++;
                        this.f4013x.submitPing();
                        if (ALog.isPrintLog(1)) {
                            ALog.m4785d("awcn.TnetSpdySession", this.f3725c + " submit ping ms:" + (System.currentTimeMillis() - this.f4015z) + " force:" + z10, this.f3738p, new Object[0]);
                        }
                        setPingTimeout(i10);
                        this.f4015z = System.currentTimeMillis();
                        IHeartbeat iHeartbeat = this.f4006D;
                        if (iHeartbeat != null) {
                            iHeartbeat.reSchedule();
                            return;
                        }
                        return;
                    }
                    return;
                }
                SessionStatistic sessionStatistic = this.f3739q;
                if (sessionStatistic != null) {
                    sessionStatistic.closeReason = "session null";
                }
                ALog.m4787e("awcn.TnetSpdySession", this.f3725c + " session null", this.f3738p, new Object[0]);
                close();
            } catch (SpdyErrorException e10) {
                if (e10.SpdyErrorGetCode() == -1104 || e10.SpdyErrorGetCode() == -1103) {
                    ALog.m4787e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f3738p, new Object[0]);
                    notifyStatus(6, new C0935b(2));
                }
                ALog.m4786e("awcn.TnetSpdySession", "ping", this.f3738p, e10, new Object[0]);
            } catch (Exception e11) {
                ALog.m4786e("awcn.TnetSpdySession", "ping", this.f3738p, e11, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m4648a(int i10, int i11, boolean z10, String str) {
        DataFrameCb dataFrameCb = this.f4005C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i10, i11, z10, str);
        }
    }

    /* renamed from: a */
    private void m4647a() {
        SpdyAgent.enableDebug = false;
        this.f4012w = SpdyAgent.getInstance(this.f3723a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.f4009G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f4012w.setAccsSslCallback(new C0972j(this));
        }
        if (AwcnConfig.isTnetHeaderCacheEnable()) {
            return;
        }
        try {
            this.f4012w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.f4012w, new Object[0]);
            ALog.m4788i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
        } catch (Exception e10) {
            ALog.m4786e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e10, new Object[0]);
        }
    }
}
