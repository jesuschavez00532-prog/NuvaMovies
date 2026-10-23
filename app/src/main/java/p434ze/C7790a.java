package p434ze;

import android.util.Log;
import java.util.logging.Level;
import ye.InterfaceC7713g;

/* renamed from: ze.a */
/* loaded from: classes3.dex */
public class C7790a implements InterfaceC7713g {

    /* renamed from: b */
    private static final boolean f28718b;

    /* renamed from: a */
    private final String f28719a;

    static {
        boolean z10 = false;
        try {
            Class.forName("android.util.Log");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f28718b = z10;
    }

    public C7790a(String str) {
        this.f28719a = str;
    }

    /* renamed from: c */
    public static boolean m30173c() {
        return f28718b;
    }

    /* renamed from: d */
    private int m30174d(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            if (intValue < 500) {
                return 2;
            }
            return 3;
        }
        if (intValue < 900) {
            return 4;
        }
        if (intValue < 1000) {
            return 5;
        }
        return 6;
    }

    @Override // ye.InterfaceC7713g
    /* renamed from: a */
    public void mo29814a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m30174d(level), this.f28719a, str);
        }
    }

    @Override // ye.InterfaceC7713g
    /* renamed from: b */
    public void mo29815b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            Log.println(m30174d(level), this.f28719a, str + "\n" + Log.getStackTraceString(th));
        }
    }
}
