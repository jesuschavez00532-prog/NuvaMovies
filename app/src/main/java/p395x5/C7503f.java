package p395x5;

import android.util.Log;

/* renamed from: x5.f */
/* loaded from: classes.dex */
public class C7503f {

    /* renamed from: c */
    static final C7503f f27581c = new C7503f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f27582a;

    /* renamed from: b */
    private int f27583b = 4;

    public C7503f(String str) {
        this.f27582a = str;
    }

    /* renamed from: a */
    private boolean m28715a(int i10) {
        if (this.f27583b > i10 && !Log.isLoggable(this.f27582a, i10)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static C7503f m28716f() {
        return f27581c;
    }

    /* renamed from: b */
    public void m28717b(String str) {
        m28718c(str, null);
    }

    /* renamed from: c */
    public void m28718c(String str, Throwable th) {
        if (m28715a(3)) {
            Log.d(this.f27582a, str, th);
        }
    }

    /* renamed from: d */
    public void m28719d(String str) {
        m28720e(str, null);
    }

    /* renamed from: e */
    public void m28720e(String str, Throwable th) {
        if (m28715a(6)) {
            Log.e(this.f27582a, str, th);
        }
    }

    /* renamed from: g */
    public void m28721g(String str) {
        m28722h(str, null);
    }

    /* renamed from: h */
    public void m28722h(String str, Throwable th) {
        if (m28715a(4)) {
            Log.i(this.f27582a, str, th);
        }
    }

    /* renamed from: i */
    public void m28723i(String str) {
        m28724j(str, null);
    }

    /* renamed from: j */
    public void m28724j(String str, Throwable th) {
        if (m28715a(2)) {
            Log.v(this.f27582a, str, th);
        }
    }

    /* renamed from: k */
    public void m28725k(String str) {
        m28726l(str, null);
    }

    /* renamed from: l */
    public void m28726l(String str, Throwable th) {
        if (m28715a(5)) {
            Log.w(this.f27582a, str, th);
        }
    }
}
