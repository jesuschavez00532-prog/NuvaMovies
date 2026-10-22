package anet.channel.monitor;

/* renamed from: anet.channel.monitor.f */
/* loaded from: classes.dex */
public class C0953f {

    /* renamed from: b */
    protected long f3953b;

    /* renamed from: c */
    private final double f3954c = 40.0d;

    /* renamed from: a */
    boolean f3952a = false;

    /* renamed from: d */
    private boolean f3955d = true;

    /* renamed from: a */
    public int m4602a() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean m4604b() {
        if (!this.f3955d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f3953b > m4602a() * 1000) {
            this.f3955d = false;
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4603a(double d10) {
        return d10 < 40.0d;
    }
}
