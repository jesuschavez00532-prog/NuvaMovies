package anet.channel.statist;

import anet.channel.AwcnConfig;
import anet.channel.entity.C0934a;
import anet.channel.fulltrace.C0938a;
import anet.channel.fulltrace.C0939b;
import anet.channel.p018e.C0927a;
import anet.channel.strategy.IConnStrategy;
import com.umeng.analytics.pro.C3384f;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = C3384f.f14569aC)
/* loaded from: classes.dex */
public class SessionStatistic extends StatObject {
    public static int maxRetryTime;

    @Measure
    public long ackTime;

    @Measure(max = 15000.0d)
    public long authTime;

    @Measure
    public long cfRCount;

    @Dimension
    public String closeReason;

    @Dimension
    public int congControlKind;

    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;

    @Dimension(name = "protocolType")
    public String conntype;

    @Dimension
    public String dcid;

    @Dimension
    public long errorCode;

    @Dimension
    public String host;

    @Measure
    public long inceptCount;

    /* renamed from: ip */
    @Dimension
    public String f4044ip;

    @Dimension
    public int ipRefer;

    @Dimension
    public int ipType;

    @Dimension
    public boolean isBackground;

    @Dimension
    public long isKL;

    @Dimension
    public String isTunnel;

    @Measure
    public int lastPingInterval;

    @Measure
    public double lossRate;

    @Dimension
    public String netType;

    @Measure
    public long pRate;

    @Dimension
    public int port;

    @Measure
    public long ppkgCount;

    @Measure
    public long recvSizeCount;

    @Dimension
    public int ret;

    @Measure
    public double retransmissionRate;

    @Dimension
    public long retryTimes;

    @Measure
    public int rtoCount;

    @Dimension
    public String scid;

    @Dimension
    public int sdkv;

    @Measure
    public long sendSizeCount;

    @Measure
    public long srtt;

    @Measure(max = 15000.0d)
    public long sslCalTime;

    @Measure(max = 15000.0d)
    public long sslTime;

    @Measure
    public int tlpCount;

    @Dimension
    public int xqc0RttStatus;

    @Dimension
    public String xqcConnEnv;

    @Dimension
    public int isProxy = 0;

    @Dimension
    public JSONObject extra = null;

    @Measure(max = 86400.0d)
    public long liveTime = 0;

    @Measure(constantValue = 1.0d)
    public long requestCount = 1;

    @Measure(constantValue = 0.0d)
    public long stdRCount = 1;
    public boolean isCommitted = false;

    public SessionStatistic(C0934a c0934a) {
        this.ipRefer = 0;
        this.ipType = 1;
        if (c0934a == null) {
            return;
        }
        this.f4044ip = c0934a.m4572a();
        this.port = c0934a.m4573b();
        IConnStrategy iConnStrategy = c0934a.f3875a;
        if (iConnStrategy != null) {
            this.ipRefer = iConnStrategy.getIpSource();
            this.ipType = c0934a.f3875a.getIpType();
        }
        this.pRate = c0934a.m4578g();
        this.conntype = c0934a.m4574c().toString();
        this.retryTimes = c0934a.f3876b;
        maxRetryTime = c0934a.f3877c;
        C0939b sceneInfo = C0938a.m4580a().getSceneInfo();
        String str = sceneInfo != null ? sceneInfo.f3897f : null;
        boolean m4561b = C0927a.m4561b();
        this.xqcConnEnv = AwcnConfig.isHttp3OrangeEnable() + "_" + m4561b + "_" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 != (-2601)) goto L14;
     */
    @Override // anet.channel.statist.StatObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean beforeCommit() {
        /*
            r7 = this;
            int r0 = r7.ret
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L52
            long r3 = r7.retryTimes
            int r0 = anet.channel.statist.SessionStatistic.maxRetryTime
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            long r3 = r7.errorCode
            r5 = -2613(0xfffffffffffff5cb, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L1d
            r5 = -2601(0xfffffffffffff5d7, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L52
        L1d:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r2)
            if (r0 == 0) goto L51
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r3 = r7.retryTimes
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r1] = r3
            java.lang.String r3 = "maxRetryTime"
            r0[r2] = r3
            int r2 = anet.channel.statist.SessionStatistic.maxRetryTime
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            r2 = 3
            java.lang.String r3 = "errorCode"
            r0[r2] = r3
            long r2 = r7.errorCode
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 4
            r0[r3] = r2
            java.lang.String r2 = "SessionStat no need commit"
            r3 = 0
            java.lang.String r4 = "retry:"
            anet.channel.util.ALog.m4785d(r2, r3, r4, r0)
        L51:
            return r1
        L52:
            boolean r0 = r7.isCommitted
            if (r0 == 0) goto L57
            return r1
        L57:
            r7.isCommitted = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.statist.SessionStatistic.beforeCommit():boolean");
    }

    public AlarmObject getAlarmObject() {
        boolean z10;
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        if (this.ret != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        alarmObject.isSuccess = z10;
        if (z10) {
            alarmObject.arg = this.closeReason;
        } else {
            alarmObject.errorCode = String.valueOf(this.errorCode);
        }
        return alarmObject;
    }
}
