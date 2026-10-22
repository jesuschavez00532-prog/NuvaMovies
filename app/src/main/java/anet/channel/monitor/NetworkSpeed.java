package anet.channel.monitor;

/* loaded from: classes.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);


    /* renamed from: a */
    private final String f3916a;

    /* renamed from: b */
    private final int f3917b;

    NetworkSpeed(String str, int i10) {
        this.f3916a = str;
        this.f3917b = i10;
    }

    public static NetworkSpeed valueOfCode(int i10) {
        if (i10 == 1) {
            return Slow;
        }
        return Fast;
    }

    public int getCode() {
        return this.f3917b;
    }

    public String getDesc() {
        return this.f3916a;
    }
}
