package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
/* loaded from: classes.dex */
public final class C2370m3 extends AbstractC2350k5 {

    /* renamed from: c */
    private char f8787c;

    /* renamed from: d */
    private long f8788d;

    /* renamed from: e */
    private String f8789e;

    /* renamed from: f */
    private final C2348k3 f8790f;

    /* renamed from: g */
    private final C2348k3 f8791g;

    /* renamed from: h */
    private final C2348k3 f8792h;

    /* renamed from: i */
    private final C2348k3 f8793i;

    /* renamed from: j */
    private final C2348k3 f8794j;

    /* renamed from: k */
    private final C2348k3 f8795k;

    /* renamed from: l */
    private final C2348k3 f8796l;

    /* renamed from: m */
    private final C2348k3 f8797m;

    /* renamed from: n */
    private final C2348k3 f8798n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2370m3(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8787c = (char) 0;
        this.f8788d = -1L;
        this.f8790f = new C2348k3(this, 6, false, false);
        this.f8791g = new C2348k3(this, 6, true, false);
        this.f8792h = new C2348k3(this, 6, false, true);
        this.f8793i = new C2348k3(this, 5, false, false);
        this.f8794j = new C2348k3(this, 5, true, false);
        this.f8795k = new C2348k3(this, 5, false, true);
        this.f8796l = new C2348k3(this, 4, false, false);
        this.f8797m = new C2348k3(this, 3, false, false);
        this.f8798n = new C2348k3(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static String m9789A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m9790B = m9790B(z10, obj);
        String m9790B2 = m9790B(z10, obj2);
        String m9790B3 = m9790B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m9790B)) {
            sb2.append(str2);
            sb2.append(m9790B);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m9790B2)) {
            sb2.append(str2);
            sb2.append(m9790B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(m9790B3)) {
            sb2.append(str3);
            sb2.append(m9790B3);
        }
        return sb2.toString();
    }

    /* renamed from: B */
    static String m9790B(boolean z10, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = Operator.Operation.MINUS;
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z10) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String m9793G = m9793G(C2415q4.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m9793G(className).equals(m9793G)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb2.toString();
        }
        if (obj instanceof C2359l3) {
            str = ((C2359l3) obj).f8777a;
            return str;
        }
        if (z10) {
            return Operator.Operation.MINUS;
        }
        return obj.toString();
    }

    /* renamed from: G */
    private static String m9793G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public static Object m9796z(String str) {
        if (str == null) {
            return null;
        }
        return new C2359l3(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final String m9797C() {
        String str;
        synchronized (this) {
            if (this.f8789e == null) {
                if (this.f8714a.m10034Q() != null) {
                    this.f8789e = this.f8714a.m10034Q();
                } else {
                    this.f8789e = this.f8714a.m10051z().m9633w();
                }
            }
            AbstractC5391n.m21783i(this.f8789e);
            str = this.f8789e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final void m9798F(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        int i11;
        if (!z10 && Log.isLoggable(m9797C(), i10)) {
            Log.println(i10, m9797C(), m9789A(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            AbstractC5391n.m21783i(str);
            C2393o4 m10025G = this.f8714a.m10025G();
            if (m10025G == null) {
                Log.println(6, m9797C(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!m10025G.m9734n()) {
                Log.println(6, m9797C(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            m10025G.m9897z(new RunnableC2337j3(this, i11, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: j */
    protected final boolean mo9430j() {
        return false;
    }

    /* renamed from: q */
    public final C2348k3 m9799q() {
        return this.f8797m;
    }

    /* renamed from: r */
    public final C2348k3 m9800r() {
        return this.f8790f;
    }

    /* renamed from: s */
    public final C2348k3 m9801s() {
        return this.f8792h;
    }

    /* renamed from: t */
    public final C2348k3 m9802t() {
        return this.f8791g;
    }

    /* renamed from: u */
    public final C2348k3 m9803u() {
        return this.f8796l;
    }

    /* renamed from: v */
    public final C2348k3 m9804v() {
        return this.f8798n;
    }

    /* renamed from: w */
    public final C2348k3 m9805w() {
        return this.f8793i;
    }

    /* renamed from: x */
    public final C2348k3 m9806x() {
        return this.f8795k;
    }

    /* renamed from: y */
    public final C2348k3 m9807y() {
        return this.f8794j;
    }
}
