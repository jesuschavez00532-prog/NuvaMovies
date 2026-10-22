package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.u */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC5282u {

    /* renamed from: a */
    private static final int f21504a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m21253a() {
        return f21504a;
    }

    /* renamed from: b */
    public static final String m21254b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
