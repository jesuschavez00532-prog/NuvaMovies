package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.a */
/* loaded from: classes.dex */
public class RunnableC0942a implements IHeartbeat, Runnable {

    /* renamed from: a */
    Session f3904a = null;

    /* renamed from: b */
    volatile boolean f3905b = false;

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3905b) {
            return;
        }
        this.f3904a.ping(true);
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f3904a = session;
            run();
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f3905b = true;
    }
}
