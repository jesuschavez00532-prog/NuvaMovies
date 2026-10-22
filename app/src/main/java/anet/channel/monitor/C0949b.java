package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.b */
/* loaded from: classes.dex */
public class C0949b {

    /* renamed from: a */
    static int f3921a = 0;

    /* renamed from: b */
    static long f3922b = 0;

    /* renamed from: c */
    static long f3923c = 0;

    /* renamed from: d */
    static long f3924d = 0;

    /* renamed from: e */
    static long f3925e = 0;

    /* renamed from: f */
    static long f3926f = 0;

    /* renamed from: g */
    static double f3927g = 0.0d;

    /* renamed from: h */
    static double f3928h = 0.0d;

    /* renamed from: i */
    static double f3929i = 0.0d;

    /* renamed from: j */
    static double f3930j = 40.0d;

    /* renamed from: k */
    private static volatile boolean f3931k;

    /* renamed from: l */
    private int f3932l;

    /* renamed from: m */
    private int f3933m;

    /* renamed from: n */
    private C0952e f3934n;

    /* renamed from: anet.channel.monitor.b$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        static C0949b f3935a = new C0949b(null);

        a() {
        }
    }

    /* synthetic */ C0949b(C0950c c0950c) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ int m4592b(C0949b c0949b) {
        int i10 = c0949b.f3933m;
        c0949b.f3933m = i10 + 1;
        return i10;
    }

    /* renamed from: d */
    public synchronized void m4598d() {
        try {
            ALog.m4788i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
        } catch (Exception e10) {
            ALog.m4789w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e10, new Object[0]);
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            f3931k = false;
        } else {
            f3931k = true;
        }
    }

    /* renamed from: e */
    public void m4599e() {
        f3931k = false;
    }

    private C0949b() {
        this.f3932l = 5;
        this.f3933m = 0;
        this.f3934n = new C0952e();
        NetworkStatusHelper.addStatusChangeListener(new C0950c(this));
    }

    /* renamed from: c */
    public double m4597c() {
        return f3929i;
    }

    /* renamed from: a */
    public static C0949b m4590a() {
        return a.f3935a;
    }

    /* renamed from: b */
    public int m4596b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f3932l;
    }

    /* renamed from: a */
    public void m4595a(long j10, long j11, long j12) {
        if (f3931k) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j10), "mRequestFinishedTime", Long.valueOf(j11), "mRequestDataSize", Long.valueOf(j12));
            }
            if (j12 <= 3000 || j10 >= j11) {
                return;
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0951d(this, j12, j11, j10));
        }
    }
}
