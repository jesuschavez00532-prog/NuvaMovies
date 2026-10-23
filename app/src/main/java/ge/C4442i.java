package ge;

import com.lzy.okgo.cookie.SerializableCookie;
import java.lang.reflect.Method;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ge.i */
/* loaded from: classes3.dex */
public final class C4442i {

    /* renamed from: a */
    public static final C4442i f19255a = new C4442i();

    /* renamed from: b */
    private static final a f19256b = new a(null, null, null);

    /* renamed from: c */
    private static a f19257c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ge.i$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f19258a;

        /* renamed from: b */
        public final Method f19259b;

        /* renamed from: c */
        public final Method f19260c;

        public a(Method method, Method method2, Method method3) {
            this.f19258a = method;
            this.f19259b = method2;
            this.f19260c = method3;
        }
    }

    private C4442i() {
    }

    /* renamed from: a */
    private final a m18640a(AbstractC4434a abstractC4434a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC4434a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC4434a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(SerializableCookie.NAME, new Class[0]));
            f19257c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f19256b;
            f19257c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m18641b(AbstractC4434a abstractC4434a) {
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        AbstractC5868k.m23674f(abstractC4434a, "continuation");
        a aVar = f19257c;
        if (aVar == null) {
            aVar = m18640a(abstractC4434a);
        }
        if (aVar == f19256b) {
            return null;
        }
        Method method = aVar.f19258a;
        if (method != null) {
            obj = method.invoke(abstractC4434a.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f19259b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f19260c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
