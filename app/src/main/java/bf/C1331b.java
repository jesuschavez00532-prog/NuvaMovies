package bf;

import android.os.Handler;
import android.os.Looper;
import ne.AbstractC5868k;

/* renamed from: bf.b */
/* loaded from: classes3.dex */
final class C1331b {

    /* renamed from: a */
    private static final Handler f5005a = null;

    /* renamed from: b */
    private static final Thread f5006b = null;

    /* renamed from: c */
    public static final C1331b f5007c = null;

    static {
        new C1331b();
    }

    private C1331b() {
        f5007c = this;
        f5005a = new Handler(Looper.getMainLooper());
        Thread thread = Looper.getMainLooper().getThread();
        AbstractC5868k.m23670b(thread, "Looper.getMainLooper().thread");
        f5006b = thread;
    }

    /* renamed from: a */
    public final Handler m5984a() {
        return f5005a;
    }

    /* renamed from: b */
    public final Thread m5985b() {
        return f5006b;
    }
}
