package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class Retrofit {

    /* renamed from: a */
    private final Map f25373a = new ConcurrentHashMap();

    /* renamed from: b */
    final Call.Factory f25374b;

    /* renamed from: c */
    final HttpUrl f25375c;

    /* renamed from: d */
    final List f25376d;

    /* renamed from: e */
    final List f25377e;

    /* renamed from: f */
    final Executor f25378f;

    /* renamed from: g */
    final boolean f25379g;

    Retrofit(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor, boolean z10) {
        this.f25374b = factory;
        this.f25375c = httpUrl;
        this.f25376d = list;
        this.f25377e = list2;
        this.f25378f = executor;
        this.f25379g = z10;
    }

    /* renamed from: c */
    private void m25765c(Class cls) {
        Platform m25727f = Platform.m25727f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!m25727f.mo25733h(method) && !Modifier.isStatic(method.getModifiers())) {
                m25768d(method);
            }
        }
    }

    /* renamed from: a */
    public CallAdapter m25766a(Type type, Annotation[] annotationArr) {
        return m25769e(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m25767b(final Class cls) {
        Utils.m25805v(cls);
        if (this.f25379g) {
            m25765c(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1

            /* renamed from: a */
            private final Platform f25380a = Platform.m25727f();

            /* renamed from: b */
            private final Object[] f25381b = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f25380a.mo25733h(method)) {
                    return this.f25380a.mo25732g(method, cls, obj, objArr);
                }
                ServiceMethod m25768d = Retrofit.this.m25768d(method);
                if (objArr == null) {
                    objArr = this.f25381b;
                }
                return m25768d.mo25700a(objArr);
            }
        });
    }

    /* renamed from: d */
    ServiceMethod m25768d(Method method) {
        ServiceMethod serviceMethod;
        ServiceMethod serviceMethod2 = (ServiceMethod) this.f25373a.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.f25373a) {
            serviceMethod = (ServiceMethod) this.f25373a.get(method);
            if (serviceMethod == null) {
                serviceMethod = ServiceMethod.m25782b(this, method);
                this.f25373a.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }

    /* renamed from: e */
    public CallAdapter m25769e(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Utils.m25785b(type, "returnType == null");
        Utils.m25785b(annotationArr, "annotations == null");
        int indexOf = this.f25377e.indexOf(factory) + 1;
        int size = this.f25377e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            CallAdapter mo21167a = ((CallAdapter.Factory) this.f25377e.get(i10)).mo21167a(type, annotationArr, this);
            if (mo21167a != null) {
                return mo21167a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((CallAdapter.Factory) this.f25377e.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f25377e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((CallAdapter.Factory) this.f25377e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: f */
    public Converter m25770f(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Utils.m25785b(type, "type == null");
        Utils.m25785b(annotationArr, "parameterAnnotations == null");
        Utils.m25785b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f25376d.indexOf(factory) + 1;
        int size = this.f25376d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            Converter mo22518c = ((Converter.Factory) this.f25376d.get(i10)).mo22518c(type, annotationArr, annotationArr2, this);
            if (mo22518c != null) {
                return mo22518c;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((Converter.Factory) this.f25376d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f25376d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((Converter.Factory) this.f25376d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public Converter m25771g(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Utils.m25785b(type, "type == null");
        Utils.m25785b(annotationArr, "annotations == null");
        int indexOf = this.f25376d.indexOf(factory) + 1;
        int size = this.f25376d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            Converter mo22519d = ((Converter.Factory) this.f25376d.get(i10)).mo22519d(type, annotationArr, this);
            if (mo22519d != null) {
                return mo22519d;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((Converter.Factory) this.f25376d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f25376d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((Converter.Factory) this.f25376d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: h */
    public Converter m25772h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m25770f(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public Converter m25773i(Type type, Annotation[] annotationArr) {
        return m25771g(null, type, annotationArr);
    }

    /* renamed from: j */
    public Converter m25774j(Type type, Annotation[] annotationArr) {
        Utils.m25785b(type, "type == null");
        Utils.m25785b(annotationArr, "annotations == null");
        int size = this.f25376d.size();
        for (int i10 = 0; i10 < size; i10++) {
            Converter m25693e = ((Converter.Factory) this.f25376d.get(i10)).m25693e(type, annotationArr, this);
            if (m25693e != null) {
                return m25693e;
            }
        }
        return BuiltInConverters.ToStringConverter.f25205a;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        private final Platform f25384a;

        /* renamed from: b */
        private Call.Factory f25385b;

        /* renamed from: c */
        private HttpUrl f25386c;

        /* renamed from: d */
        private final List f25387d;

        /* renamed from: e */
        private final List f25388e;

        /* renamed from: f */
        private Executor f25389f;

        /* renamed from: g */
        private boolean f25390g;

        Builder(Platform platform) {
            this.f25387d = new ArrayList();
            this.f25388e = new ArrayList();
            this.f25384a = platform;
        }

        /* renamed from: a */
        public Builder m25775a(CallAdapter.Factory factory) {
            this.f25388e.add(Utils.m25785b(factory, "factory == null"));
            return this;
        }

        /* renamed from: b */
        public Builder m25776b(Converter.Factory factory) {
            this.f25387d.add(Utils.m25785b(factory, "factory == null"));
            return this;
        }

        /* renamed from: c */
        public Builder m25777c(String str) {
            Utils.m25785b(str, "baseUrl == null");
            return m25778d(HttpUrl.get(str));
        }

        /* renamed from: d */
        public Builder m25778d(HttpUrl httpUrl) {
            Utils.m25785b(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                this.f25386c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: e */
        public Retrofit m25779e() {
            if (this.f25386c != null) {
                Call.Factory factory = this.f25385b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f25389f;
                if (executor == null) {
                    executor = this.f25384a.mo25729b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f25388e);
                arrayList.addAll(this.f25384a.mo25728a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f25387d.size() + 1 + this.f25384a.mo25731d());
                arrayList2.add(new BuiltInConverters());
                arrayList2.addAll(this.f25387d);
                arrayList2.addAll(this.f25384a.mo25730c());
                return new Retrofit(factory2, this.f25386c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f25390g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public Builder m25780f(Call.Factory factory) {
            this.f25385b = (Call.Factory) Utils.m25785b(factory, "factory == null");
            return this;
        }

        /* renamed from: g */
        public Builder m25781g(OkHttpClient okHttpClient) {
            return m25780f((Call.Factory) Utils.m25785b(okHttpClient, "client == null"));
        }

        public Builder() {
            this(Platform.m25727f());
        }
    }
}
