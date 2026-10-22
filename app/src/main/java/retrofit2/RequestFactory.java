package retrofit2;

import anet.channel.request.Request;
import com.lzy.okgo.model.HttpHeaders;
import ee.InterfaceC4181d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import p240mf.InterfaceC5672a;
import p240mf.InterfaceC5673b;
import p240mf.InterfaceC5674c;
import p240mf.InterfaceC5675d;
import p240mf.InterfaceC5676e;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5678g;
import p240mf.InterfaceC5679h;
import p240mf.InterfaceC5680i;
import p240mf.InterfaceC5681j;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5683l;
import p240mf.InterfaceC5684m;
import p240mf.InterfaceC5685n;
import p240mf.InterfaceC5686o;
import p240mf.InterfaceC5687p;
import p240mf.InterfaceC5688q;
import p240mf.InterfaceC5689r;
import p240mf.InterfaceC5690s;
import p240mf.InterfaceC5691t;
import p240mf.InterfaceC5692u;
import p240mf.InterfaceC5693v;
import p240mf.InterfaceC5695x;
import p240mf.InterfaceC5696y;
import retrofit2.ParameterHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RequestFactory {

    /* renamed from: a */
    private final Method f25334a;

    /* renamed from: b */
    private final HttpUrl f25335b;

    /* renamed from: c */
    final String f25336c;

    /* renamed from: d */
    private final String f25337d;

    /* renamed from: e */
    private final Headers f25338e;

    /* renamed from: f */
    private final MediaType f25339f;

    /* renamed from: g */
    private final boolean f25340g;

    /* renamed from: h */
    private final boolean f25341h;

    /* renamed from: i */
    private final boolean f25342i;

    /* renamed from: j */
    private final ParameterHandler[] f25343j;

    /* renamed from: k */
    final boolean f25344k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: x */
        private static final Pattern f25345x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f25346y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final Retrofit f25347a;

        /* renamed from: b */
        final Method f25348b;

        /* renamed from: c */
        final Annotation[] f25349c;

        /* renamed from: d */
        final Annotation[][] f25350d;

        /* renamed from: e */
        final Type[] f25351e;

        /* renamed from: f */
        boolean f25352f;

        /* renamed from: g */
        boolean f25353g;

        /* renamed from: h */
        boolean f25354h;

        /* renamed from: i */
        boolean f25355i;

        /* renamed from: j */
        boolean f25356j;

        /* renamed from: k */
        boolean f25357k;

        /* renamed from: l */
        boolean f25358l;

        /* renamed from: m */
        boolean f25359m;

        /* renamed from: n */
        String f25360n;

        /* renamed from: o */
        boolean f25361o;

        /* renamed from: p */
        boolean f25362p;

        /* renamed from: q */
        boolean f25363q;

        /* renamed from: r */
        String f25364r;

        /* renamed from: s */
        Headers f25365s;

        /* renamed from: t */
        MediaType f25366t;

        /* renamed from: u */
        Set f25367u;

        /* renamed from: v */
        ParameterHandler[] f25368v;

        /* renamed from: w */
        boolean f25369w;

        Builder(Retrofit retrofit, Method method) {
            this.f25347a = retrofit;
            this.f25348b = method;
            this.f25349c = method.getAnnotations();
            this.f25351e = method.getGenericParameterTypes();
            this.f25350d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class m25749a(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        /* renamed from: c */
        private Headers m25750c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf != -1 && indexOf != 0 && indexOf != str.length() - 1) {
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            this.f25366t = MediaType.get(trim);
                        } catch (IllegalArgumentException e10) {
                            throw Utils.m25798o(this.f25348b, e10, "Malformed content type: %s", trim);
                        }
                    } else {
                        builder.add(substring, trim);
                    }
                } else {
                    throw Utils.m25797n(this.f25348b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        private void m25751d(String str, String str2, boolean z10) {
            String str3 = this.f25360n;
            if (str3 == null) {
                this.f25360n = str;
                this.f25361o = z10;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (f25345x.matcher(substring).find()) {
                        throw Utils.m25797n(this.f25348b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f25364r = str2;
                this.f25367u = m25755h(str2);
                return;
            }
            throw Utils.m25797n(this.f25348b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        private void m25752e(Annotation annotation) {
            if (annotation instanceof InterfaceC5673b) {
                m25751d("DELETE", ((InterfaceC5673b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC5677f) {
                m25751d("GET", ((InterfaceC5677f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC5678g) {
                m25751d(Request.Method.HEAD, ((InterfaceC5678g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC5685n) {
                m25751d("PATCH", ((InterfaceC5685n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC5686o) {
                m25751d("POST", ((InterfaceC5686o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC5687p) {
                m25751d(Request.Method.PUT, ((InterfaceC5687p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC5684m) {
                m25751d(Request.Method.OPTION, ((InterfaceC5684m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC5679h) {
                InterfaceC5679h interfaceC5679h = (InterfaceC5679h) annotation;
                m25751d(interfaceC5679h.method(), interfaceC5679h.path(), interfaceC5679h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC5682k) {
                String[] value = ((InterfaceC5682k) annotation).value();
                if (value.length != 0) {
                    this.f25365s = m25750c(value);
                    return;
                }
                throw Utils.m25797n(this.f25348b, "@Headers annotation is empty.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5683l) {
                if (!this.f25362p) {
                    this.f25363q = true;
                    return;
                }
                throw Utils.m25797n(this.f25348b, "Only one encoding annotation is allowed.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5676e) {
                if (!this.f25363q) {
                    this.f25362p = true;
                    return;
                }
                throw Utils.m25797n(this.f25348b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        private ParameterHandler m25753f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            ParameterHandler parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation annotation : annotationArr) {
                    ParameterHandler m25754g = m25754g(i10, type, annotationArr, annotation);
                    if (m25754g != null) {
                        if (parameterHandler == null) {
                            parameterHandler = m25754g;
                        } else {
                            throw Utils.m25799p(this.f25348b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler == null) {
                if (z10) {
                    try {
                        if (Utils.m25792i(type) == InterfaceC4181d.class) {
                            this.f25369w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw Utils.m25799p(this.f25348b, i10, "No Retrofit annotation found.", new Object[0]);
            }
            return parameterHandler;
        }

        /* renamed from: g */
        private ParameterHandler m25754g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC5696y) {
                m25757j(i10, type);
                if (!this.f25359m) {
                    if (!this.f25355i) {
                        if (!this.f25356j) {
                            if (!this.f25357k) {
                                if (!this.f25358l) {
                                    if (this.f25364r != null) {
                                        throw Utils.m25799p(this.f25348b, i10, "@Url cannot be used with @%s URL", this.f25360n);
                                    }
                                    this.f25359m = true;
                                    if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                        throw Utils.m25799p(this.f25348b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                    }
                                    return new ParameterHandler.RelativeUrl(this.f25348b, i10);
                                }
                                throw Utils.m25799p(this.f25348b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw Utils.m25799p(this.f25348b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw Utils.m25799p(this.f25348b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "Multiple @Url method annotations found.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5690s) {
                m25757j(i10, type);
                if (!this.f25356j) {
                    if (!this.f25357k) {
                        if (!this.f25358l) {
                            if (!this.f25359m) {
                                if (this.f25364r == null) {
                                    throw Utils.m25799p(this.f25348b, i10, "@Path can only be used with relative url on @%s", this.f25360n);
                                }
                                this.f25355i = true;
                                InterfaceC5690s interfaceC5690s = (InterfaceC5690s) annotation;
                                String value = interfaceC5690s.value();
                                m25756i(i10, value);
                                return new ParameterHandler.Path(this.f25348b, i10, value, this.f25347a.m25774j(type, annotationArr), interfaceC5690s.encoded());
                            }
                            throw Utils.m25799p(this.f25348b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw Utils.m25799p(this.f25348b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5691t) {
                m25757j(i10, type);
                InterfaceC5691t interfaceC5691t = (InterfaceC5691t) annotation;
                String value2 = interfaceC5691t.value();
                boolean encoded = interfaceC5691t.encoded();
                Class m25792i = Utils.m25792i(type);
                this.f25356j = true;
                if (Iterable.class.isAssignableFrom(m25792i)) {
                    if (type instanceof ParameterizedType) {
                        return new ParameterHandler.Query(value2, this.f25347a.m25774j(Utils.m25791h(0, (ParameterizedType) type), annotationArr), encoded).m25718c();
                    }
                    throw Utils.m25799p(this.f25348b, i10, m25792i.getSimpleName() + " must include generic type (e.g., " + m25792i.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m25792i.isArray()) {
                    return new ParameterHandler.Query(value2, this.f25347a.m25774j(m25749a(m25792i.getComponentType()), annotationArr), encoded).m25717b();
                }
                return new ParameterHandler.Query(value2, this.f25347a.m25774j(type, annotationArr), encoded);
            }
            if (annotation instanceof InterfaceC5693v) {
                m25757j(i10, type);
                boolean encoded2 = ((InterfaceC5693v) annotation).encoded();
                Class m25792i2 = Utils.m25792i(type);
                this.f25357k = true;
                if (Iterable.class.isAssignableFrom(m25792i2)) {
                    if (type instanceof ParameterizedType) {
                        return new ParameterHandler.QueryName(this.f25347a.m25774j(Utils.m25791h(0, (ParameterizedType) type), annotationArr), encoded2).m25718c();
                    }
                    throw Utils.m25799p(this.f25348b, i10, m25792i2.getSimpleName() + " must include generic type (e.g., " + m25792i2.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m25792i2.isArray()) {
                    return new ParameterHandler.QueryName(this.f25347a.m25774j(m25749a(m25792i2.getComponentType()), annotationArr), encoded2).m25717b();
                }
                return new ParameterHandler.QueryName(this.f25347a.m25774j(type, annotationArr), encoded2);
            }
            if (annotation instanceof InterfaceC5692u) {
                m25757j(i10, type);
                Class m25792i3 = Utils.m25792i(type);
                this.f25358l = true;
                if (Map.class.isAssignableFrom(m25792i3)) {
                    Type m25793j = Utils.m25793j(type, m25792i3, Map.class);
                    if (m25793j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) m25793j;
                        Type m25791h = Utils.m25791h(0, parameterizedType);
                        if (String.class == m25791h) {
                            return new ParameterHandler.QueryMap(this.f25348b, i10, this.f25347a.m25774j(Utils.m25791h(1, parameterizedType), annotationArr), ((InterfaceC5692u) annotation).encoded());
                        }
                        throw Utils.m25799p(this.f25348b, i10, "@QueryMap keys must be of type String: " + m25791h, new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5680i) {
                m25757j(i10, type);
                String value3 = ((InterfaceC5680i) annotation).value();
                Class m25792i4 = Utils.m25792i(type);
                if (Iterable.class.isAssignableFrom(m25792i4)) {
                    if (type instanceof ParameterizedType) {
                        return new ParameterHandler.Header(value3, this.f25347a.m25774j(Utils.m25791h(0, (ParameterizedType) type), annotationArr)).m25718c();
                    }
                    throw Utils.m25799p(this.f25348b, i10, m25792i4.getSimpleName() + " must include generic type (e.g., " + m25792i4.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m25792i4.isArray()) {
                    return new ParameterHandler.Header(value3, this.f25347a.m25774j(m25749a(m25792i4.getComponentType()), annotationArr)).m25717b();
                }
                return new ParameterHandler.Header(value3, this.f25347a.m25774j(type, annotationArr));
            }
            if (annotation instanceof InterfaceC5681j) {
                if (type == Headers.class) {
                    return new ParameterHandler.Headers(this.f25348b, i10);
                }
                m25757j(i10, type);
                Class m25792i5 = Utils.m25792i(type);
                if (Map.class.isAssignableFrom(m25792i5)) {
                    Type m25793j2 = Utils.m25793j(type, m25792i5, Map.class);
                    if (m25793j2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) m25793j2;
                        Type m25791h2 = Utils.m25791h(0, parameterizedType2);
                        if (String.class == m25791h2) {
                            return new ParameterHandler.HeaderMap(this.f25348b, i10, this.f25347a.m25774j(Utils.m25791h(1, parameterizedType2), annotationArr));
                        }
                        throw Utils.m25799p(this.f25348b, i10, "@HeaderMap keys must be of type String: " + m25791h2, new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5674c) {
                m25757j(i10, type);
                if (this.f25362p) {
                    InterfaceC5674c interfaceC5674c = (InterfaceC5674c) annotation;
                    String value4 = interfaceC5674c.value();
                    boolean encoded3 = interfaceC5674c.encoded();
                    this.f25352f = true;
                    Class m25792i6 = Utils.m25792i(type);
                    if (Iterable.class.isAssignableFrom(m25792i6)) {
                        if (type instanceof ParameterizedType) {
                            return new ParameterHandler.Field(value4, this.f25347a.m25774j(Utils.m25791h(0, (ParameterizedType) type), annotationArr), encoded3).m25718c();
                        }
                        throw Utils.m25799p(this.f25348b, i10, m25792i6.getSimpleName() + " must include generic type (e.g., " + m25792i6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (m25792i6.isArray()) {
                        return new ParameterHandler.Field(value4, this.f25347a.m25774j(m25749a(m25792i6.getComponentType()), annotationArr), encoded3).m25717b();
                    }
                    return new ParameterHandler.Field(value4, this.f25347a.m25774j(type, annotationArr), encoded3);
                }
                throw Utils.m25799p(this.f25348b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5675d) {
                m25757j(i10, type);
                if (this.f25362p) {
                    Class m25792i7 = Utils.m25792i(type);
                    if (Map.class.isAssignableFrom(m25792i7)) {
                        Type m25793j3 = Utils.m25793j(type, m25792i7, Map.class);
                        if (m25793j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) m25793j3;
                            Type m25791h3 = Utils.m25791h(0, parameterizedType3);
                            if (String.class == m25791h3) {
                                Converter m25774j = this.f25347a.m25774j(Utils.m25791h(1, parameterizedType3), annotationArr);
                                this.f25352f = true;
                                return new ParameterHandler.FieldMap(this.f25348b, i10, m25774j, ((InterfaceC5675d) annotation).encoded());
                            }
                            throw Utils.m25799p(this.f25348b, i10, "@FieldMap keys must be of type String: " + m25791h3, new Object[0]);
                        }
                        throw Utils.m25799p(this.f25348b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5688q) {
                m25757j(i10, type);
                if (this.f25363q) {
                    InterfaceC5688q interfaceC5688q = (InterfaceC5688q) annotation;
                    this.f25353g = true;
                    String value5 = interfaceC5688q.value();
                    Class m25792i8 = Utils.m25792i(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(m25792i8)) {
                            if (type instanceof ParameterizedType) {
                                if (MultipartBody.Part.class.isAssignableFrom(Utils.m25792i(Utils.m25791h(0, (ParameterizedType) type)))) {
                                    return ParameterHandler.RawPart.f25313a.m25718c();
                                }
                                throw Utils.m25799p(this.f25348b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw Utils.m25799p(this.f25348b, i10, m25792i8.getSimpleName() + " must include generic type (e.g., " + m25792i8.getSimpleName() + "<String>)", new Object[0]);
                        }
                        if (m25792i8.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(m25792i8.getComponentType())) {
                                return ParameterHandler.RawPart.f25313a.m25717b();
                            }
                            throw Utils.m25799p(this.f25348b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (MultipartBody.Part.class.isAssignableFrom(m25792i8)) {
                            return ParameterHandler.RawPart.f25313a;
                        }
                        throw Utils.m25799p(this.f25348b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    Headers m24168of = Headers.m24168of(HttpHeaders.HEAD_KEY_CONTENT_DISPOSITION, "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", interfaceC5688q.encoding());
                    if (Iterable.class.isAssignableFrom(m25792i8)) {
                        if (type instanceof ParameterizedType) {
                            Type m25791h4 = Utils.m25791h(0, (ParameterizedType) type);
                            if (!MultipartBody.Part.class.isAssignableFrom(Utils.m25792i(m25791h4))) {
                                return new ParameterHandler.Part(this.f25348b, i10, m24168of, this.f25347a.m25772h(m25791h4, annotationArr, this.f25349c)).m25718c();
                            }
                            throw Utils.m25799p(this.f25348b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw Utils.m25799p(this.f25348b, i10, m25792i8.getSimpleName() + " must include generic type (e.g., " + m25792i8.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (m25792i8.isArray()) {
                        Class m25749a = m25749a(m25792i8.getComponentType());
                        if (!MultipartBody.Part.class.isAssignableFrom(m25749a)) {
                            return new ParameterHandler.Part(this.f25348b, i10, m24168of, this.f25347a.m25772h(m25749a, annotationArr, this.f25349c)).m25717b();
                        }
                        throw Utils.m25799p(this.f25348b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    if (!MultipartBody.Part.class.isAssignableFrom(m25792i8)) {
                        return new ParameterHandler.Part(this.f25348b, i10, m24168of, this.f25347a.m25772h(type, annotationArr, this.f25349c));
                    }
                    throw Utils.m25799p(this.f25348b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5689r) {
                m25757j(i10, type);
                if (this.f25363q) {
                    this.f25353g = true;
                    Class m25792i9 = Utils.m25792i(type);
                    if (Map.class.isAssignableFrom(m25792i9)) {
                        Type m25793j4 = Utils.m25793j(type, m25792i9, Map.class);
                        if (m25793j4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) m25793j4;
                            Type m25791h5 = Utils.m25791h(0, parameterizedType4);
                            if (String.class == m25791h5) {
                                Type m25791h6 = Utils.m25791h(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(Utils.m25792i(m25791h6))) {
                                    return new ParameterHandler.PartMap(this.f25348b, i10, this.f25347a.m25772h(m25791h6, annotationArr, this.f25349c), ((InterfaceC5689r) annotation).encoding());
                                }
                                throw Utils.m25799p(this.f25348b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw Utils.m25799p(this.f25348b, i10, "@PartMap keys must be of type String: " + m25791h5, new Object[0]);
                        }
                        throw Utils.m25799p(this.f25348b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw Utils.m25799p(this.f25348b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC5672a) {
                m25757j(i10, type);
                if (!this.f25362p && !this.f25363q) {
                    if (!this.f25354h) {
                        try {
                            Converter m25772h = this.f25347a.m25772h(type, annotationArr, this.f25349c);
                            this.f25354h = true;
                            return new ParameterHandler.Body(this.f25348b, i10, m25772h);
                        } catch (RuntimeException e10) {
                            throw Utils.m25800q(this.f25348b, e10, i10, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw Utils.m25799p(this.f25348b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw Utils.m25799p(this.f25348b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (!(annotation instanceof InterfaceC5695x)) {
                return null;
            }
            m25757j(i10, type);
            Class m25792i10 = Utils.m25792i(type);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                ParameterHandler parameterHandler = this.f25368v[i11];
                if ((parameterHandler instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler).f25316a.equals(m25792i10)) {
                    throw Utils.m25799p(this.f25348b, i10, "@Tag type " + m25792i10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new ParameterHandler.Tag(m25792i10);
        }

        /* renamed from: h */
        static Set m25755h(String str) {
            Matcher matcher = f25345x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m25756i(int i10, String str) {
            if (f25346y.matcher(str).matches()) {
                if (this.f25367u.contains(str)) {
                    return;
                } else {
                    throw Utils.m25799p(this.f25348b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f25364r, str);
                }
            }
            throw Utils.m25799p(this.f25348b, i10, "@Path parameter name must match %s. Found: %s", f25345x.pattern(), str);
        }

        /* renamed from: j */
        private void m25757j(int i10, Type type) {
            if (!Utils.m25794k(type)) {
            } else {
                throw Utils.m25799p(this.f25348b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: b */
        RequestFactory m25758b() {
            for (Annotation annotation : this.f25349c) {
                m25752e(annotation);
            }
            if (this.f25360n != null) {
                if (!this.f25361o) {
                    if (!this.f25363q) {
                        if (this.f25362p) {
                            throw Utils.m25797n(this.f25348b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw Utils.m25797n(this.f25348b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f25350d.length;
                this.f25368v = new ParameterHandler[length];
                int i10 = length - 1;
                int i11 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i11 >= length) {
                        break;
                    }
                    ParameterHandler[] parameterHandlerArr = this.f25368v;
                    Type type = this.f25351e[i11];
                    Annotation[] annotationArr = this.f25350d[i11];
                    if (i11 != i10) {
                        z10 = false;
                    }
                    parameterHandlerArr[i11] = m25753f(i11, type, annotationArr, z10);
                    i11++;
                }
                if (this.f25364r == null && !this.f25359m) {
                    throw Utils.m25797n(this.f25348b, "Missing either @%s URL or @Url parameter.", this.f25360n);
                }
                boolean z11 = this.f25362p;
                if (!z11 && !this.f25363q && !this.f25361o && this.f25354h) {
                    throw Utils.m25797n(this.f25348b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !this.f25352f) {
                    throw Utils.m25797n(this.f25348b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.f25363q && !this.f25353g) {
                    throw Utils.m25797n(this.f25348b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new RequestFactory(this);
            }
            throw Utils.m25797n(this.f25348b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    RequestFactory(Builder builder) {
        this.f25334a = builder.f25348b;
        this.f25335b = builder.f25347a.f25375c;
        this.f25336c = builder.f25360n;
        this.f25337d = builder.f25364r;
        this.f25338e = builder.f25365s;
        this.f25339f = builder.f25366t;
        this.f25340g = builder.f25361o;
        this.f25341h = builder.f25362p;
        this.f25342i = builder.f25363q;
        this.f25343j = builder.f25368v;
        this.f25344k = builder.f25369w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RequestFactory m25747b(Retrofit retrofit, Method method) {
        return new Builder(retrofit, method).m25758b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public okhttp3.Request m25748a(Object[] objArr) {
        ParameterHandler[] parameterHandlerArr = this.f25343j;
        int length = objArr.length;
        if (length == parameterHandlerArr.length) {
            RequestBuilder requestBuilder = new RequestBuilder(this.f25336c, this.f25335b, this.f25337d, this.f25338e, this.f25339f, this.f25340g, this.f25341h, this.f25342i);
            if (this.f25344k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                parameterHandlerArr[i10].mo25716a(requestBuilder, objArr[i10]);
            }
            return requestBuilder.m25744k().tag(Invocation.class, new Invocation(this.f25334a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + parameterHandlerArr.length + ")");
    }
}
