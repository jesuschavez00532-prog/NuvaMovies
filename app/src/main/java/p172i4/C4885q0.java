package p172i4;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.q0 */
/* loaded from: classes.dex */
public class C4885q0 {

    /* renamed from: e */
    private static final C4885q0 f20385e = new C4885q0(true, 3, 1, null, null);

    /* renamed from: a */
    final boolean f20386a;

    /* renamed from: b */
    final String f20387b;

    /* renamed from: c */
    final Throwable f20388c;

    /* renamed from: d */
    final int f20389d;

    private C4885q0(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f20386a = z10;
        this.f20389d = i10;
        this.f20387b = str;
        this.f20388c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4885q0 m20084b() {
        return f20385e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4885q0 m20085c(String str) {
        return new C4885q0(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4885q0 m20086d(String str, Throwable th) {
        return new C4885q0(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C4885q0 m20087f(int i10) {
        return new C4885q0(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4885q0 m20088g(int i10, int i11, String str, Throwable th) {
        return new C4885q0(false, i10, i11, str, th);
    }

    /* renamed from: a */
    String mo20072a() {
        return this.f20387b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m20089e() {
        if (!this.f20386a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f20388c != null) {
                Log.d("GoogleCertificatesRslt", mo20072a(), this.f20388c);
            } else {
                Log.d("GoogleCertificatesRslt", mo20072a());
            }
        }
    }
}
