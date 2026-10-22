package anet.channel.heartbeat;

/* loaded from: classes.dex */
public class HeartbeatManager {
    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        return new RunnableC0942a();
    }

    public static IHeartbeat getDefaultHeartbeat() {
        return new RunnableC0943b();
    }
}
