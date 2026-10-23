package p214l;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: l.g */
/* loaded from: classes.dex */
public class C5309g {

    /* renamed from: a */
    private final LinkedHashMap f21604a;

    /* renamed from: b */
    private int f21605b;

    /* renamed from: c */
    private int f21606c;

    /* renamed from: d */
    private int f21607d;

    /* renamed from: e */
    private int f21608e;

    /* renamed from: f */
    private int f21609f;

    /* renamed from: g */
    private int f21610g;

    /* renamed from: h */
    private int f21611h;

    public C5309g(int i10) {
        if (i10 > 0) {
            this.f21606c = i10;
            this.f21604a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: h */
    private int m21404h(Object obj, Object obj2) {
        int m21412j = m21412j(obj, obj2);
        if (m21412j >= 0) {
            return m21412j;
        }
        throw new IllegalStateException("Negative size: " + obj + Operator.Operation.EQUALS + obj2);
    }

    /* renamed from: a */
    protected Object mo9644a(Object obj) {
        return null;
    }

    /* renamed from: b */
    protected void m21405b(boolean z10, Object obj, Object obj2, Object obj3) {
    }

    /* renamed from: c */
    public final void m21406c() {
        m21414l(-1);
    }

    /* renamed from: d */
    public final Object m21407d(Object obj) {
        Object put = null;
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f21604a.get(obj);
                if (obj2 != null) {
                    this.f21610g++;
                    return obj2;
                }
                this.f21611h++;
                Object mo9644a = mo9644a(obj);
                if (mo9644a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f21608e++;
                    put = this.f21604a.put(obj, mo9644a);
                    if (put != null) {
                        this.f21604a.put(obj, put);
                    } else {
                        this.f21605b += m21404h(obj, mo9644a);
                    }
                }
                if (put != null) {
                    m21405b(false, obj, mo9644a, put);
                    return put;
                }
                m21414l(this.f21606c);
                return mo9644a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: e */
    public final synchronized int m21408e() {
        return this.f21606c;
    }

    /* renamed from: f */
    public final Object m21409f(Object obj, Object obj2) {
        Object put = null;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                this.f21607d++;
                this.f21605b += m21404h(obj, obj2);
                put = this.f21604a.put(obj, obj2);
                if (put != null) {
                    this.f21605b -= m21404h(obj, put);
                }
            }
            if (put != null) {
                m21405b(false, obj, put, obj2);
            }
            m21414l(this.f21606c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: g */
    public final Object m21410g(Object obj) {
        Object remove = null;
        if (obj != null) {
            synchronized (this) {
                remove = this.f21604a.remove(obj);
                if (remove != null) {
                    this.f21605b -= m21404h(obj, remove);
                }
            }
            if (remove != null) {
                m21405b(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: i */
    public final synchronized int m21411i() {
        return this.f21605b;
    }

    /* renamed from: j */
    protected int m21412j(Object obj, Object obj2) {
        return 1;
    }

    /* renamed from: k */
    public final synchronized Map m21413k() {
        return new LinkedHashMap(this.f21604a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m21414l(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f21605b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap r0 = r4.f21604a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f21605b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f21605b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap r0 = r4.f21604a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap r0 = r4.f21604a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap r2 = r4.f21604a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f21605b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m21404h(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f21605b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f21609f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f21609f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m21405b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: p214l.C5309g.m21414l(int):void");
    }

    public final synchronized String toString() {
        int i10 = 0;
        int i11 = this.f21610g;
        int i12 = this.f21611h + i11;
        if (i12 != 0) {
            i10 = (i11 * 100) / i12;
        } else {
            i10 = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f21606c), Integer.valueOf(this.f21610g), Integer.valueOf(this.f21611h), Integer.valueOf(i10));
    }
}
