package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.b */
/* loaded from: classes.dex */
class RunnableC0943b implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f3906a;

    /* renamed from: b */
    private volatile long f3907b = 0;

    /* renamed from: c */
    private volatile boolean f3908c = false;

    /* renamed from: d */
    private long f3909d = 0;

    /* renamed from: a */
    private void m4584a(long j10) {
        try {
            this.f3907b = System.currentTimeMillis() + j10;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j10 + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.m4786e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f3906a.f3738p, e10, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f3907b = System.currentTimeMillis() + this.f3909d;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3908c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f3907b - 1000) {
            m4584a(this.f3907b - currentTimeMillis);
            return;
        }
        if (!GlobalAppRuntimeInfo.isAppBackground()) {
            if (ALog.isPrintLog(1)) {
                Session session = this.f3906a;
                ALog.m4785d("awcn.DefaultHeartbeatImpl", "heartbeat", session.f3738p, C3384f.f14569aC, session);
            }
            this.f3906a.ping(true);
            m4584a(this.f3909d);
            return;
        }
        Session session2 = this.f3906a;
        ALog.m4787e("awcn.DefaultHeartbeatImpl", "close session in background", session2.f3738p, C3384f.f14569aC, session2);
        this.f3906a.close(false);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f3906a = session;
            long heartbeat = session.getConnStrategy().getHeartbeat();
            this.f3909d = heartbeat;
            if (heartbeat <= 0) {
                this.f3909d = 45000L;
            }
            ALog.m4788i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f3738p, C3384f.f14569aC, session, C3325bt.f14236ba, Long.valueOf(this.f3909d));
            m4584a(this.f3909d);
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f3906a;
        if (session == null) {
            return;
        }
        ALog.m4788i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f3738p, C3384f.f14569aC, session);
        this.f3908c = true;
    }
}
