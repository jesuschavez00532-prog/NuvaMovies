package p230m1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p109e2.AbstractC4121k;

/* renamed from: m1.i */
/* loaded from: classes.dex */
public final class C5576i implements InterfaceC5569b {

    /* renamed from: a */
    private final C5574g f22583a = new C5574g();

    /* renamed from: b */
    private final b f22584b = new b();

    /* renamed from: c */
    private final Map f22585c = new HashMap();

    /* renamed from: d */
    private final Map f22586d = new HashMap();

    /* renamed from: e */
    private final int f22587e;

    /* renamed from: f */
    private int f22588f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1.i$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5580m {

        /* renamed from: a */
        private final b f22589a;

        /* renamed from: b */
        int f22590b;

        /* renamed from: c */
        private Class f22591c;

        a(b bVar) {
            this.f22589a = bVar;
        }

        @Override // p230m1.InterfaceC5580m
        /* renamed from: a */
        public void mo22645a() {
            this.f22589a.m22614c(this);
        }

        /* renamed from: b */
        void m22646b(int i10, Class cls) {
            this.f22590b = i10;
            this.f22591c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22590b != aVar.f22590b || this.f22591c != aVar.f22591c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11 = this.f22590b * 31;
            Class cls = this.f22591c;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public String toString() {
            return "Key{size=" + this.f22590b + "array=" + this.f22591c + '}';
        }
    }

    /* renamed from: m1.i$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC5570c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p230m1.AbstractC5570c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo22612a() {
            return new a(this);
        }

        /* renamed from: e */
        a m22648e(int i10, Class cls) {
            a aVar = (a) m22613b();
            aVar.m22646b(i10, cls);
            return aVar;
        }
    }

    public C5576i(int i10) {
        this.f22587e = i10;
    }

    /* renamed from: e */
    private void m22634e(int i10, Class cls) {
        NavigableMap m22641l = m22641l(cls);
        Integer num = (Integer) m22641l.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                m22641l.remove(Integer.valueOf(i10));
                return;
            } else {
                m22641l.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    /* renamed from: f */
    private void m22635f() {
        m22636g(this.f22587e);
    }

    /* renamed from: g */
    private void m22636g(int i10) {
        while (this.f22588f > i10) {
            Object m22628f = this.f22583a.m22628f();
            AbstractC4121k.m17226d(m22628f);
            InterfaceC5568a m22637h = m22637h(m22628f);
            this.f22588f -= m22637h.mo22607c(m22628f) * m22637h.mo22605a();
            m22634e(m22637h.mo22607c(m22628f), m22628f.getClass());
            if (Log.isLoggable(m22637h.mo22606b(), 2)) {
                Log.v(m22637h.mo22606b(), "evicted: " + m22637h.mo22607c(m22628f));
            }
        }
    }

    /* renamed from: h */
    private InterfaceC5568a m22637h(Object obj) {
        return m22638i(obj.getClass());
    }

    /* renamed from: i */
    private InterfaceC5568a m22638i(Class cls) {
        InterfaceC5568a interfaceC5568a = (InterfaceC5568a) this.f22586d.get(cls);
        if (interfaceC5568a == null) {
            if (cls.equals(int[].class)) {
                interfaceC5568a = new C5575h();
            } else if (cls.equals(byte[].class)) {
                interfaceC5568a = new C5573f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f22586d.put(cls, interfaceC5568a);
        }
        return interfaceC5568a;
    }

    /* renamed from: j */
    private Object m22639j(a aVar) {
        return this.f22583a.m22626a(aVar);
    }

    /* renamed from: k */
    private Object m22640k(a aVar, Class cls) {
        InterfaceC5568a m22638i = m22638i(cls);
        Object m22639j = m22639j(aVar);
        if (m22639j != null) {
            this.f22588f -= m22638i.mo22607c(m22639j) * m22638i.mo22605a();
            m22634e(m22638i.mo22607c(m22639j), cls);
        }
        if (m22639j == null) {
            if (Log.isLoggable(m22638i.mo22606b(), 2)) {
                Log.v(m22638i.mo22606b(), "Allocated " + aVar.f22590b + " bytes");
            }
            return m22638i.newArray(aVar.f22590b);
        }
        return m22639j;
    }

    /* renamed from: l */
    private NavigableMap m22641l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f22585c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f22585c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: m */
    private boolean m22642m() {
        int i10 = this.f22588f;
        if (i10 != 0 && this.f22587e / i10 < 2) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m22643n(int i10) {
        if (i10 <= this.f22587e / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m22644o(int i10, Integer num) {
        if (num != null && (m22642m() || num.intValue() <= i10 * 8)) {
            return true;
        }
        return false;
    }

    @Override // p230m1.InterfaceC5569b
    /* renamed from: a */
    public synchronized void mo22608a(int i10) {
        try {
            if (i10 >= 40) {
                mo22609b();
            } else if (i10 >= 20 || i10 == 15) {
                m22636g(this.f22587e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p230m1.InterfaceC5569b
    /* renamed from: b */
    public synchronized void mo22609b() {
        m22636g(0);
    }

    @Override // p230m1.InterfaceC5569b
    /* renamed from: c */
    public synchronized Object mo22610c(int i10, Class cls) {
        return m22640k(this.f22584b.m22648e(i10, cls), cls);
    }

    @Override // p230m1.InterfaceC5569b
    /* renamed from: d */
    public synchronized Object mo22611d(int i10, Class cls) {
        a m22648e;
        Integer num = (Integer) m22641l(cls).ceilingKey(Integer.valueOf(i10));
        if (m22644o(i10, num)) {
            m22648e = this.f22584b.m22648e(num.intValue(), cls);
        } else {
            m22648e = this.f22584b.m22648e(i10, cls);
        }
        return m22640k(m22648e, cls);
    }

    @Override // p230m1.InterfaceC5569b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC5568a m22638i = m22638i(cls);
        int mo22607c = m22638i.mo22607c(obj);
        int mo22605a = m22638i.mo22605a() * mo22607c;
        if (!m22643n(mo22605a)) {
            return;
        }
        a m22648e = this.f22584b.m22648e(mo22607c, cls);
        this.f22583a.m22627d(m22648e, obj);
        NavigableMap m22641l = m22641l(cls);
        Integer num = (Integer) m22641l.get(Integer.valueOf(m22648e.f22590b));
        Integer valueOf = Integer.valueOf(m22648e.f22590b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        m22641l.put(valueOf, Integer.valueOf(i10));
        this.f22588f += mo22605a;
        m22635f();
    }
}
