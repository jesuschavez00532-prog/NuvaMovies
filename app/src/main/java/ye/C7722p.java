package ye;

import af.InterfaceC0237c;
import af.InterfaceC0238d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ye.p */
/* loaded from: classes3.dex */
public class C7722p {

    /* renamed from: d */
    private static final Map f28391d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final a[] f28392e = new a[4];

    /* renamed from: a */
    private List f28393a;

    /* renamed from: b */
    private final boolean f28394b;

    /* renamed from: c */
    private final boolean f28395c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ye.p$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        final List f28396a = new ArrayList();

        /* renamed from: b */
        final Map f28397b = new HashMap();

        /* renamed from: c */
        final Map f28398c = new HashMap();

        /* renamed from: d */
        final StringBuilder f28399d = new StringBuilder(128);

        /* renamed from: e */
        Class f28400e;

        /* renamed from: f */
        Class f28401f;

        /* renamed from: g */
        boolean f28402g;

        /* renamed from: h */
        InterfaceC0237c f28403h;

        a() {
        }

        /* renamed from: b */
        private boolean m29833b(Method method, Class cls) {
            this.f28399d.setLength(0);
            this.f28399d.append(method.getName());
            StringBuilder sb2 = this.f28399d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f28399d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f28398c.put(sb3, declaringClass);
            if (cls2 != null && !cls2.isAssignableFrom(declaringClass)) {
                this.f28398c.put(sb3, cls2);
                return false;
            }
            return true;
        }

        /* renamed from: a */
        boolean m29834a(Method method, Class cls) {
            Object put = this.f28397b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m29833b((Method) put, cls)) {
                    this.f28397b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m29833b(method, cls);
        }

        /* renamed from: c */
        void m29835c(Class cls) {
            this.f28401f = cls;
            this.f28400e = cls;
            this.f28402g = false;
            this.f28403h = null;
        }

        /* renamed from: d */
        void m29836d() {
            if (this.f28402g) {
                this.f28401f = null;
                return;
            }
            Class superclass = this.f28401f.getSuperclass();
            this.f28401f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f28401f = null;
            }
        }

        /* renamed from: e */
        void m29837e() {
            this.f28396a.clear();
            this.f28397b.clear();
            this.f28398c.clear();
            this.f28399d.setLength(0);
            this.f28400e = null;
            this.f28401f = null;
            this.f28402g = false;
            this.f28403h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7722p(List list, boolean z10, boolean z11) {
        this.f28393a = list;
        this.f28394b = z10;
        this.f28395c = z11;
    }

    /* renamed from: b */
    private List m29826b(Class cls) {
        a m29831g = m29831g();
        m29831g.m29835c(cls);
        while (m29831g.f28401f != null) {
            InterfaceC0237c m29830f = m29830f(m29831g);
            m29831g.f28403h = m29830f;
            if (m29830f != null) {
                for (C7721o c7721o : m29830f.mo886a()) {
                    if (m29831g.m29834a(c7721o.f28385a, c7721o.f28387c)) {
                        m29831g.f28396a.add(c7721o);
                    }
                }
            } else {
                m29828d(m29831g);
            }
            m29831g.m29836d();
        }
        return m29829e(m29831g);
    }

    /* renamed from: c */
    private List m29827c(Class cls) {
        a m29831g = m29831g();
        m29831g.m29835c(cls);
        while (m29831g.f28401f != null) {
            m29828d(m29831g);
            m29831g.m29836d();
        }
        return m29829e(m29831g);
    }

    /* renamed from: d */
    private void m29828d(a aVar) {
        String str = null;
        Method[] methods;
        try {
            try {
                methods = aVar.f28401f.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f28401f.getMethods();
                aVar.f28402g = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        InterfaceC7719m interfaceC7719m = (InterfaceC7719m) method.getAnnotation(InterfaceC7719m.class);
                        if (interfaceC7719m != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.m29834a(method, cls)) {
                                aVar.f28396a.add(new C7721o(method, cls, interfaceC7719m.threadMode(), interfaceC7719m.priority(), interfaceC7719m.sticky()));
                            }
                        }
                    } else if (this.f28394b && method.isAnnotationPresent(InterfaceC7719m.class)) {
                        throw new C7711e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.f28394b && method.isAnnotationPresent(InterfaceC7719m.class)) {
                    throw new C7711e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e10) {
            String str2 = "Could not inspect methods of " + aVar.f28401f.getName();
            if (this.f28395c) {
                str = str2 + ". Please consider using EventBus annotation processor to avoid reflection.";
            } else {
                str = str2 + ". Please make this class visible to EventBus annotation processor to avoid reflection.";
            }
            throw new C7711e(str, e10);
        }
    }

    /* renamed from: e */
    private List m29829e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f28396a);
        aVar.m29837e();
        synchronized (f28392e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                a[] aVarArr = f28392e;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = aVar;
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private InterfaceC0237c m29830f(a aVar) {
        InterfaceC0237c interfaceC0237c = aVar.f28403h;
        if (interfaceC0237c != null && interfaceC0237c.mo883b() != null) {
            InterfaceC0237c mo883b = aVar.f28403h.mo883b();
            if (aVar.f28401f == mo883b.mo884c()) {
                return mo883b;
            }
        }
        List list = this.f28393a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC0237c mo887a = ((InterfaceC0238d) it.next()).mo887a(aVar.f28401f);
                if (mo887a != null) {
                    return mo887a;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    private a m29831g() {
        synchronized (f28392e) {
            for (int i10 = 0; i10 < 4; i10++) {
                a[] aVarArr = f28392e;
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    aVarArr[i10] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List m29832a(Class cls) {
        List m29826b;
        Map map = f28391d;
        List list = (List) map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f28395c) {
            m29826b = m29827c(cls);
        } else {
            m29826b = m29826b(cls);
        }
        if (!m29826b.isEmpty()) {
            map.put(cls, m29826b);
            return m29826b;
        }
        throw new C7711e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
