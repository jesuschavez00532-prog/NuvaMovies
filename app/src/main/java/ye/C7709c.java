package ye;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: ye.c */
/* loaded from: classes.dex */
public class C7709c {

    /* renamed from: s */
    static volatile C7709c f28326s;

    /* renamed from: t */
    private static final C7710d f28327t = new C7710d();

    /* renamed from: u */
    private static final Map f28328u = new HashMap();

    /* renamed from: a */
    private final Map f28329a;

    /* renamed from: b */
    private final Map f28330b;

    /* renamed from: c */
    private final Map f28331c;

    /* renamed from: d */
    private final ThreadLocal f28332d;

    /* renamed from: e */
    private final InterfaceC7714h f28333e;

    /* renamed from: f */
    private final InterfaceC7718l f28334f;

    /* renamed from: g */
    private final RunnableC7708b f28335g;

    /* renamed from: h */
    private final RunnableC7707a f28336h;

    /* renamed from: i */
    private final C7722p f28337i;

    /* renamed from: j */
    private final ExecutorService f28338j;

    /* renamed from: k */
    private final boolean f28339k;

    /* renamed from: l */
    private final boolean f28340l;

    /* renamed from: m */
    private final boolean f28341m;

    /* renamed from: n */
    private final boolean f28342n;

    /* renamed from: o */
    private final boolean f28343o;

    /* renamed from: p */
    private final boolean f28344p;

    /* renamed from: q */
    private final int f28345q;

    /* renamed from: r */
    private final InterfaceC7713g f28346r;

    /* renamed from: ye.c$a */
    /* loaded from: classes3.dex */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ye.c$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f28348a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f28348a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28348a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28348a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28348a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28348a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ye.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        final List f28349a = new ArrayList();

        /* renamed from: b */
        boolean f28350b;

        /* renamed from: c */
        boolean f28351c;

        /* renamed from: d */
        C7723q f28352d;

        /* renamed from: e */
        Object f28353e = null;

        /* renamed from: f */
        boolean f28354f;

        c() {
        }
    }

    public C7709c() {
        this(f28327t);
    }

    /* renamed from: a */
    static void m29784a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m29784a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    public static C7710d m29785b() {
        return new C7710d();
    }

    /* renamed from: c */
    private void m29786c(C7723q c7723q, Object obj) {
        if (obj != null) {
            m29793q(c7723q, obj, m29789j());
        }
    }

    /* renamed from: d */
    public static C7709c m29787d() {
        C7709c c7709c = f28326s;
        if (c7709c == null) {
            synchronized (C7709c.class) {
                c7709c = f28326s;
                if (c7709c == null) {
                    c7709c = new C7709c();
                    f28326s = c7709c;
                }
            }
        }
        return c7709c;
    }

    /* renamed from: g */
    private void m29788g(C7723q c7723q, Object obj, Throwable th) {
        if (obj instanceof C7720n) {
            if (this.f28340l) {
                InterfaceC7713g interfaceC7713g = this.f28346r;
                Level level = Level.SEVERE;
                interfaceC7713g.mo29815b(level, "SubscriberExceptionEvent subscriber " + c7723q.f28404a.getClass() + " threw an exception", th);
                C7720n c7720n = (C7720n) obj;
                this.f28346r.mo29815b(level, "Initial event " + c7720n.f28383c + " caused exception in " + c7720n.f28384d, c7720n.f28382b);
                return;
            }
            return;
        }
        if (!this.f28339k) {
            if (this.f28340l) {
                this.f28346r.mo29815b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + c7723q.f28404a.getClass(), th);
            }
            if (this.f28342n) {
                m29801m(new C7720n(this, th, obj, c7723q.f28404a));
                return;
            }
            return;
        }
        throw new C7711e("Invoking subscriber failed", th);
    }

    /* renamed from: j */
    private boolean m29789j() {
        InterfaceC7714h interfaceC7714h = this.f28333e;
        if (interfaceC7714h != null && !interfaceC7714h.mo29819b()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static List m29790l(Class cls) {
        List list;
        Map map = f28328u;
        synchronized (map) {
            list = (List) map.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m29784a(list, cls2.getInterfaces());
                }
                f28328u.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: n */
    private void m29791n(Object obj, c cVar) {
        boolean m29792o;
        Class<?> cls = obj.getClass();
        if (this.f28344p) {
            List m29790l = m29790l(cls);
            int size = m29790l.size();
            m29792o = false;
            for (int i10 = 0; i10 < size; i10++) {
                m29792o |= m29792o(obj, cVar, (Class) m29790l.get(i10));
            }
        } else {
            m29792o = m29792o(obj, cVar, cls);
        }
        if (!m29792o) {
            if (this.f28341m) {
                this.f28346r.mo29814a(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f28343o && cls != C7715i.class && cls != C7720n.class) {
                m29801m(new C7715i(this, obj));
            }
        }
    }

    /* renamed from: o */
    private boolean m29792o(Object obj, c cVar, Class cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f28329a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C7723q c7723q = (C7723q) it.next();
            cVar.f28353e = obj;
            cVar.f28352d = c7723q;
            try {
                m29793q(c7723q, obj, cVar.f28351c);
                if (cVar.f28354f) {
                    return true;
                }
            } finally {
                cVar.f28353e = null;
                cVar.f28352d = null;
                cVar.f28354f = false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private void m29793q(C7723q c7723q, Object obj, boolean z10) {
        int i10 = b.f28348a[c7723q.f28405b.f28386b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            this.f28336h.mo29783a(c7723q, obj);
                            return;
                        }
                        throw new IllegalStateException("Unknown thread mode: " + c7723q.f28405b.f28386b);
                    }
                    if (z10) {
                        this.f28335g.mo29783a(c7723q, obj);
                        return;
                    } else {
                        m29799i(c7723q, obj);
                        return;
                    }
                }
                InterfaceC7718l interfaceC7718l = this.f28334f;
                if (interfaceC7718l != null) {
                    interfaceC7718l.mo29783a(c7723q, obj);
                    return;
                } else {
                    m29799i(c7723q, obj);
                    return;
                }
            }
            if (z10) {
                m29799i(c7723q, obj);
                return;
            } else {
                this.f28334f.mo29783a(c7723q, obj);
                return;
            }
        }
        m29799i(c7723q, obj);
    }

    /* renamed from: u */
    private void m29794u(Object obj, C7721o c7721o) {
        Class cls = c7721o.f28387c;
        C7723q c7723q = new C7723q(obj, c7721o);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f28329a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f28329a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c7723q)) {
            throw new C7711e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || c7721o.f28388d > ((C7723q) copyOnWriteArrayList.get(i10)).f28405b.f28388d) {
                copyOnWriteArrayList.add(i10, c7723q);
                break;
            }
        }
        List list = (List) this.f28330b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f28330b.put(obj, list);
        }
        list.add(cls);
        if (c7721o.f28389e) {
            if (this.f28344p) {
                for (Map.Entry entry : this.f28331c.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey())) {
                        m29786c(c7723q, entry.getValue());
                    }
                }
                return;
            }
            m29786c(c7723q, this.f28331c.get(cls));
        }
    }

    /* renamed from: w */
    private void m29795w(Object obj, Class cls) {
        List list = (List) this.f28329a.get(cls);
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                C7723q c7723q = (C7723q) list.get(i10);
                if (c7723q.f28404a == obj) {
                    c7723q.f28406c = false;
                    list.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ExecutorService m29796e() {
        return this.f28338j;
    }

    /* renamed from: f */
    public InterfaceC7713g m29797f() {
        return this.f28346r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m29798h(C7716j c7716j) {
        Object obj = c7716j.f28376a;
        C7723q c7723q = c7716j.f28377b;
        C7716j.m29821b(c7716j);
        if (c7723q.f28406c) {
            m29799i(c7723q, obj);
        }
    }

    /* renamed from: i */
    void m29799i(C7723q c7723q, Object obj) {
        try {
            c7723q.f28405b.f28385a.invoke(c7723q.f28404a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            m29788g(c7723q, obj, e11.getCause());
        }
    }

    /* renamed from: k */
    public synchronized boolean m29800k(Object obj) {
        return this.f28330b.containsKey(obj);
    }

    /* renamed from: m */
    public void m29801m(Object obj) {
        c cVar = (c) this.f28332d.get();
        List list = cVar.f28349a;
        list.add(obj);
        if (!cVar.f28350b) {
            cVar.f28351c = m29789j();
            cVar.f28350b = true;
            if (cVar.f28354f) {
                throw new C7711e("Internal error. Abort state was not reset");
            }
            while (true) {
                try {
                    if (!list.isEmpty()) {
                        m29791n(list.remove(0), cVar);
                    } else {
                        return;
                    }
                } finally {
                    cVar.f28350b = false;
                    cVar.f28351c = false;
                }
            }
        }
    }

    /* renamed from: p */
    public void m29802p(Object obj) {
        synchronized (this.f28331c) {
            this.f28331c.put(obj.getClass(), obj);
        }
        m29801m(obj);
    }

    /* renamed from: r */
    public void m29803r(Object obj) {
        List m29832a = this.f28337i.m29832a(obj.getClass());
        synchronized (this) {
            Iterator it = m29832a.iterator();
            while (it.hasNext()) {
                m29794u(obj, (C7721o) it.next());
            }
        }
    }

    /* renamed from: s */
    public Object m29804s(Class cls) {
        Object cast = null;
        synchronized (this.f28331c) {
            cast = cls.cast(this.f28331c.remove(cls));
        }
        return cast;
    }

    /* renamed from: t */
    public boolean m29805t(Object obj) {
        synchronized (this.f28331c) {
            Class<?> cls = obj.getClass();
            if (obj.equals(this.f28331c.get(cls))) {
                this.f28331c.remove(cls);
                return true;
            }
            return false;
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f28345q + ", eventInheritance=" + this.f28344p + "]";
    }

    /* renamed from: v */
    public synchronized void m29806v(Object obj) {
        List list = (List) this.f28330b.get(obj);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m29795w(obj, (Class) it.next());
            }
            this.f28330b.remove(obj);
        } else {
            this.f28346r.mo29814a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7709c(C7710d c7710d) {
        this.f28332d = new a();
        this.f28346r = c7710d.m29811d();
        this.f28329a = new HashMap();
        this.f28330b = new HashMap();
        this.f28331c = new ConcurrentHashMap();
        InterfaceC7714h m29812e = c7710d.m29812e();
        this.f28333e = m29812e;
        this.f28334f = m29812e != null ? m29812e.mo29818a(this) : null;
        this.f28335g = new RunnableC7708b(this);
        this.f28336h = new RunnableC7707a(this);
        List list = c7710d.f28365j;
        this.f28345q = list != null ? list.size() : 0;
        this.f28337i = new C7722p(c7710d.f28365j, c7710d.f28363h, c7710d.f28362g);
        this.f28340l = c7710d.f28356a;
        this.f28341m = c7710d.f28357b;
        this.f28342n = c7710d.f28358c;
        this.f28343o = c7710d.f28359d;
        this.f28339k = c7710d.f28360e;
        this.f28344p = c7710d.f28361f;
        this.f28338j = c7710d.f28364i;
    }
}
