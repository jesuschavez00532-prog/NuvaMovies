package p109e2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e2.h */
/* loaded from: classes.dex */
public class C4118h {

    /* renamed from: a */
    private final Map f18079a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f18080b;

    /* renamed from: c */
    private long f18081c;

    /* renamed from: d */
    private long f18082d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final Object f18083a;

        /* renamed from: b */
        final int f18084b;

        a(Object obj, int i10) {
            this.f18083a = obj;
            this.f18084b = i10;
        }
    }

    public C4118h(long j10) {
        this.f18080b = j10;
        this.f18081c = j10;
    }

    /* renamed from: f */
    private void m17211f() {
        m17219m(this.f18081c);
    }

    /* renamed from: b */
    public void m17212b() {
        m17219m(0L);
    }

    /* renamed from: g */
    public synchronized Object m17213g(Object obj) {
        Object obj2 = null;
        a aVar = (a) this.f18079a.get(obj);
        if (aVar != null) {
            obj2 = aVar.f18083a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    /* renamed from: h */
    public synchronized long m17214h() {
        return this.f18081c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public int mo17215i(Object obj) {
        return 1;
    }

    /* renamed from: j */
    protected void mo17216j(Object obj, Object obj2) {
    }

    /* renamed from: k */
    public synchronized Object m17217k(Object obj, Object obj2) {
        a aVar;
        int mo17215i = mo17215i(obj2);
        long j10 = mo17215i;
        Object obj3 = null;
        if (j10 >= this.f18081c) {
            mo17216j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f18082d += j10;
        }
        Map map = this.f18079a;
        if (obj2 == null) {
            aVar = null;
        } else {
            aVar = new a(obj2, mo17215i);
        }
        a aVar2 = (a) map.put(obj, aVar);
        if (aVar2 != null) {
            this.f18082d -= aVar2.f18084b;
            if (!aVar2.f18083a.equals(obj2)) {
                mo17216j(obj, aVar2.f18083a);
            }
        }
        m17211f();
        if (aVar2 != null) {
            obj3 = aVar2.f18083a;
        }
        return obj3;
    }

    /* renamed from: l */
    public synchronized Object m17218l(Object obj) {
        a aVar = (a) this.f18079a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f18082d -= aVar.f18084b;
        return aVar.f18083a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void m17219m(long j10) {
        while (this.f18082d > j10) {
            Iterator it = this.f18079a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f18082d -= aVar.f18084b;
            Object key = entry.getKey();
            it.remove();
            mo17216j(key, aVar.f18083a);
        }
    }
}
