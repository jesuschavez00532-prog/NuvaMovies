package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
final class C0747a {

    /* renamed from: c */
    static C0747a f3117c = new C0747a();

    /* renamed from: a */
    private final Map f3118a = new HashMap();

    /* renamed from: b */
    private final Map f3119b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map f3120a = new HashMap();

        /* renamed from: b */
        final Map f3121b;

        a(Map map) {
            this.f3121b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0749c.b bVar = (AbstractC0749c.b) entry.getValue();
                List list = (List) this.f3120a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3120a.put(bVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m3700b(List list, InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m3702a(interfaceC0752f, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m3701a(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar, Object obj) {
            m3700b((List) this.f3120a.get(bVar), interfaceC0752f, bVar, obj);
            m3700b((List) this.f3120a.get(AbstractC0749c.b.ON_ANY), interfaceC0752f, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f3122a;

        /* renamed from: b */
        final Method f3123b;

        b(int i10, Method method) {
            this.f3122a = i10;
            this.f3123b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m3702a(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar, Object obj) {
            try {
                int i10 = this.f3122a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            this.f3123b.invoke(obj, interfaceC0752f, bVar);
                            return;
                        }
                        return;
                    }
                    this.f3123b.invoke(obj, interfaceC0752f);
                    return;
                }
                this.f3123b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3122a == bVar.f3122a && this.f3123b.getName().equals(bVar.f3123b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f3122a * 31) + this.f3123b.getName().hashCode();
        }
    }

    C0747a() {
    }

    /* renamed from: a */
    private a m3695a(Class cls, Method[] methodArr) {
        int i10;
        a m3698c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m3698c = m3698c(superclass)) != null) {
            hashMap.putAll(m3698c.f3121b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m3698c(cls2).f3121b.entrySet()) {
                m3697e(hashMap, (b) entry.getKey(), (AbstractC0749c.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3696b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0758l interfaceC0758l = (InterfaceC0758l) method.getAnnotation(InterfaceC0758l.class);
            if (interfaceC0758l != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(InterfaceC0752f.class)) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                AbstractC0749c.b value = interfaceC0758l.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(AbstractC0749c.b.class)) {
                        if (value == AbstractC0749c.b.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m3697e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3118a.put(cls, aVar);
        this.f3119b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m3696b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* renamed from: e */
    private void m3697e(Map map, b bVar, AbstractC0749c.b bVar2, Class cls) {
        AbstractC0749c.b bVar3 = (AbstractC0749c.b) map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            throw new IllegalArgumentException("Method " + bVar.f3123b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        }
        if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a m3698c(Class cls) {
        a aVar = (a) this.f3118a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m3695a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m3699d(Class cls) {
        Boolean bool = (Boolean) this.f3119b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m3696b = m3696b(cls);
        for (Method method : m3696b) {
            if (((InterfaceC0758l) method.getAnnotation(InterfaceC0758l.class)) != null) {
                m3695a(cls, m3696b);
                return true;
            }
        }
        this.f3119b.put(cls, Boolean.FALSE);
        return false;
    }
}
