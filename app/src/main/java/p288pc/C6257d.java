package p288pc;

import be.C1328x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: pc.d */
/* loaded from: classes.dex */
public final class C6257d {

    /* renamed from: a */
    private final HashMap f24489a = new HashMap();

    /* renamed from: b */
    private final C6258e f24490b;

    /* renamed from: c */
    private final WeakHashMap f24491c;

    /* renamed from: pc.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5665q {
        a() {
            super(3);
        }

        /* renamed from: a */
        public final void m24893a(C6254a c6254a, Object obj, Object obj2) {
            C6257d.this.f24491c.put(c6254a, obj);
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m24893a((C6254a) obj, obj2, obj3);
            return C1328x.f4998a;
        }
    }

    public C6257d() {
        C6258e c6258e = new C6258e(10);
        c6258e.m24894a(new a());
        this.f24490b = c6258e;
        this.f24491c = new WeakHashMap();
    }

    /* renamed from: b */
    public final Object m24891b(Class cls, Object... objArr) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(objArr, "params");
        C6254a c6254a = new C6254a(cls, Arrays.copyOf(objArr, objArr.length));
        Object obj = this.f24489a.get(c6254a);
        if (obj == null && (obj = this.f24490b.get(c6254a)) == null && (obj = this.f24491c.remove(c6254a)) != null) {
            this.f24490b.put(c6254a, obj);
        }
        return obj;
    }

    /* renamed from: c */
    public final Object m24892c(Class cls, Object obj, Object... objArr) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(objArr, "params");
        C6254a c6254a = new C6254a(cls, Arrays.copyOf(objArr, objArr.length));
        if (cls.isAnnotationPresent(InterfaceC6261h.class)) {
            synchronized (this.f24489a) {
                if (this.f24489a.containsKey(c6254a)) {
                    obj = this.f24489a.get(c6254a);
                } else if (obj != null) {
                    this.f24489a.put(c6254a, obj);
                }
            }
            return obj;
        }
        if (!cls.isAnnotationPresent(InterfaceC6256c.class)) {
            this.f24490b.put(c6254a, obj);
        }
        return obj;
    }
}
