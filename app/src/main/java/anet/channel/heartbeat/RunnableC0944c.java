package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.c */
/* loaded from: classes.dex */
public class RunnableC0944c implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f3910a = null;

    /* renamed from: b */
    private volatile boolean f3911b = false;

    /* renamed from: c */
    private volatile long f3912c = System.currentTimeMillis();

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f3912c = System.currentTimeMillis() + 45000;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3911b) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f3912c - 1000) {
            ThreadPoolExecutorFactory.submitScheduledTask(this, this.f3912c - currentTimeMillis, TimeUnit.MILLISECONDS);
        } else {
            this.f3910a.close(false);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f3910a = session;
            this.f3912c = System.currentTimeMillis() + 45000;
            ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f3911b = true;
    }
}
