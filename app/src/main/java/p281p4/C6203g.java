package p281p4;

import android.os.SystemClock;

/* renamed from: p4.g */
/* loaded from: classes.dex */
public class C6203g implements InterfaceC6200d {

    /* renamed from: a */
    private static final C6203g f24370a = new C6203g();

    private C6203g() {
    }

    /* renamed from: d */
    public static InterfaceC6200d m24754d() {
        return f24370a;
    }

    @Override // p281p4.InterfaceC6200d
    /* renamed from: a */
    public final long mo24747a() {
        return System.currentTimeMillis();
    }

    @Override // p281p4.InterfaceC6200d
    /* renamed from: b */
    public final long mo24748b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p281p4.InterfaceC6200d
    /* renamed from: c */
    public final long mo24749c() {
        return System.nanoTime();
    }
}
