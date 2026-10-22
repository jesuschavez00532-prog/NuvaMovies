package anet.channel.monitor;

import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.d */
/* loaded from: classes.dex */
class RunnableC0951d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f3937a;

    /* renamed from: b */
    final /* synthetic */ long f3938b;

    /* renamed from: c */
    final /* synthetic */ long f3939c;

    /* renamed from: d */
    final /* synthetic */ C0949b f3940d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0951d(C0949b c0949b, long j10, long j11, long j12) {
        this.f3940d = c0949b;
        this.f3937a = j10;
        this.f3938b = j11;
        this.f3939c = j12;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0952e c0952e;
        int i10;
        C0952e c0952e2;
        C0949b.f3921a++;
        C0949b.f3925e += this.f3937a;
        if (C0949b.f3921a == 1) {
            C0949b.f3924d = this.f3938b - this.f3939c;
        }
        int i11 = C0949b.f3921a;
        if (i11 >= 2 && i11 <= 3) {
            long j10 = this.f3939c;
            long j11 = C0949b.f3923c;
            if (j10 >= j11) {
                C0949b.f3924d += this.f3938b - j10;
            } else if (j10 < j11) {
                long j12 = this.f3938b;
                if (j12 >= j11) {
                    long j13 = C0949b.f3924d + (j12 - j10);
                    C0949b.f3924d = j13;
                    C0949b.f3924d = j13 - (C0949b.f3923c - j10);
                }
            }
        }
        C0949b.f3922b = this.f3939c;
        C0949b.f3923c = this.f3938b;
        if (C0949b.f3921a == 3) {
            c0952e = this.f3940d.f3934n;
            C0949b.f3929i = (long) c0952e.m4600a(C0949b.f3925e, C0949b.f3924d);
            C0949b.f3926f++;
            C0949b.m4592b(this.f3940d);
            if (C0949b.f3926f > 30) {
                c0952e2 = this.f3940d.f3934n;
                c0952e2.m4601a();
                C0949b.f3926f = 3L;
            }
            double d10 = (C0949b.f3929i * 0.68d) + (C0949b.f3928h * 0.27d) + (C0949b.f3927g * 0.05d);
            C0949b.f3927g = C0949b.f3928h;
            C0949b.f3928h = C0949b.f3929i;
            if (C0949b.f3929i < C0949b.f3927g * 0.65d || C0949b.f3929i > C0949b.f3927g * 2.0d) {
                C0949b.f3929i = d10;
            }
            int i12 = 5;
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(C0949b.f3925e), "mKalmanTimeUsed", Long.valueOf(C0949b.f3924d), "speed", Double.valueOf(C0949b.f3929i), "mSpeedKalmanCount", Long.valueOf(C0949b.f3926f));
            }
            i10 = this.f3940d.f3933m;
            if (i10 > 5 || C0949b.f3926f == 2) {
                C0948a.m4585a().m4586a(C0949b.f3929i);
                this.f3940d.f3933m = 0;
                C0949b c0949b = this.f3940d;
                if (C0949b.f3929i < C0949b.f3930j) {
                    i12 = 1;
                }
                c0949b.f3932l = i12;
                ALog.m4788i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            C0949b.f3924d = 0L;
            C0949b.f3925e = 0L;
            C0949b.f3921a = 0;
        }
    }
}
