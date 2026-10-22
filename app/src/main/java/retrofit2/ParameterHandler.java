package retrofit2;

import com.lzy.okgo.model.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ParameterHandler<T> {

    /* loaded from: classes3.dex */
    static final class Body<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final Method f25274a;

        /* renamed from: b */
        private final int f25275b;

        /* renamed from: c */
        private final Converter f25276c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Body(Method method, int i10, Converter converter) {
            this.f25274a = method;
            this.f25275b = i10;
            this.f25276c = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                try {
                    requestBuilder.m25745l((RequestBody) this.f25276c.mo22520a(obj));
                    return;
                } catch (IOException e10) {
                    throw Utils.m25800q(this.f25274a, e10, this.f25275b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                }
            }
            throw Utils.m25799p(this.f25274a, this.f25275b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Field<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final String f25277a;

        /* renamed from: b */
        private final Converter f25278b;

        /* renamed from: c */
        private final boolean f25279c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Field(String str, Converter converter, boolean z10) {
            this.f25277a = (String) Utils.m25785b(str, "name == null");
            this.f25278b = converter;
            this.f25279c = z10;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f25278b.mo22520a(obj)) == null) {
                return;
            }
            requestBuilder.m25736a(this.f25277a, str, this.f25279c);
        }
    }

    /* loaded from: classes3.dex */
    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        private final Method f25280a;

        /* renamed from: b */
        private final int f25281b;

        /* renamed from: c */
        private final Converter f25282c;

        /* renamed from: d */
        private final boolean f25283d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FieldMap(Method method, int i10, Converter converter, boolean z10) {
            this.f25280a = method;
            this.f25281b = i10;
            this.f25282c = converter;
            this.f25283d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f25282c.mo22520a(value);
                            if (str2 != null) {
                                requestBuilder.m25736a(str, str2, this.f25283d);
                            } else {
                                throw Utils.m25799p(this.f25280a, this.f25281b, "Field map value '" + value + "' converted to null by " + this.f25282c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw Utils.m25799p(this.f25280a, this.f25281b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.m25799p(this.f25280a, this.f25281b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.m25799p(this.f25280a, this.f25281b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Header<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final String f25284a;

        /* renamed from: b */
        private final Converter f25285b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Header(String str, Converter converter) {
            this.f25284a = (String) Utils.m25785b(str, "name == null");
            this.f25285b = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f25285b.mo22520a(obj)) == null) {
                return;
            }
            requestBuilder.m25737b(this.f25284a, str);
        }
    }

    /* loaded from: classes3.dex */
    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        private final Method f25286a;

        /* renamed from: b */
        private final int f25287b;

        /* renamed from: c */
        private final Converter f25288c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public HeaderMap(Method method, int i10, Converter converter) {
            this.f25286a = method;
            this.f25287b = i10;
            this.f25288c = converter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.m25737b(str, (String) this.f25288c.mo22520a(value));
                        } else {
                            throw Utils.m25799p(this.f25286a, this.f25287b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.m25799p(this.f25286a, this.f25287b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.m25799p(this.f25286a, this.f25287b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Headers extends ParameterHandler<okhttp3.Headers> {

        /* renamed from: a */
        private final Method f25289a;

        /* renamed from: b */
        private final int f25290b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Headers(Method method, int i10) {
            this.f25289a = method;
            this.f25290b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.m25738c(headers);
                return;
            }
            throw Utils.m25799p(this.f25289a, this.f25290b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Part<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final Method f25291a;

        /* renamed from: b */
        private final int f25292b;

        /* renamed from: c */
        private final okhttp3.Headers f25293c;

        /* renamed from: d */
        private final Converter f25294d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Part(Method method, int i10, okhttp3.Headers headers, Converter converter) {
            this.f25291a = method;
            this.f25292b = i10;
            this.f25293c = headers;
            this.f25294d = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                requestBuilder.m25739d(this.f25293c, (RequestBody) this.f25294d.mo22520a(obj));
            } catch (IOException e10) {
                throw Utils.m25799p(this.f25291a, this.f25292b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        private final Method f25295a;

        /* renamed from: b */
        private final int f25296b;

        /* renamed from: c */
        private final Converter f25297c;

        /* renamed from: d */
        private final String f25298d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PartMap(Method method, int i10, Converter converter, String str) {
            this.f25295a = method;
            this.f25296b = i10;
            this.f25297c = converter;
            this.f25298d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.m25739d(okhttp3.Headers.m24168of(HttpHeaders.HEAD_KEY_CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f25298d), (RequestBody) this.f25297c.mo22520a(value));
                        } else {
                            throw Utils.m25799p(this.f25295a, this.f25296b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.m25799p(this.f25295a, this.f25296b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.m25799p(this.f25295a, this.f25296b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Path<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final Method f25299a;

        /* renamed from: b */
        private final int f25300b;

        /* renamed from: c */
        private final String f25301c;

        /* renamed from: d */
        private final Converter f25302d;

        /* renamed from: e */
        private final boolean f25303e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Path(Method method, int i10, String str, Converter converter, boolean z10) {
            this.f25299a = method;
            this.f25300b = i10;
            this.f25301c = (String) Utils.m25785b(str, "name == null");
            this.f25302d = converter;
            this.f25303e = z10;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.m25741f(this.f25301c, (String) this.f25302d.mo22520a(obj), this.f25303e);
                return;
            }
            throw Utils.m25799p(this.f25299a, this.f25300b, "Path parameter \"" + this.f25301c + "\" value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Query<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final String f25304a;

        /* renamed from: b */
        private final Converter f25305b;

        /* renamed from: c */
        private final boolean f25306c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Query(String str, Converter converter, boolean z10) {
            this.f25304a = (String) Utils.m25785b(str, "name == null");
            this.f25305b = converter;
            this.f25306c = z10;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f25305b.mo22520a(obj)) == null) {
                return;
            }
            requestBuilder.m25742g(this.f25304a, str, this.f25306c);
        }
    }

    /* loaded from: classes3.dex */
    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a */
        private final Method f25307a;

        /* renamed from: b */
        private final int f25308b;

        /* renamed from: c */
        private final Converter f25309c;

        /* renamed from: d */
        private final boolean f25310d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public QueryMap(Method method, int i10, Converter converter, boolean z10) {
            this.f25307a = method;
            this.f25308b = i10;
            this.f25309c = converter;
            this.f25310d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f25309c.mo22520a(value);
                            if (str2 != null) {
                                requestBuilder.m25742g(str, str2, this.f25310d);
                            } else {
                                throw Utils.m25799p(this.f25307a, this.f25308b, "Query map value '" + value + "' converted to null by " + this.f25309c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw Utils.m25799p(this.f25307a, this.f25308b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.m25799p(this.f25307a, this.f25308b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.m25799p(this.f25307a, this.f25308b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class QueryName<T> extends ParameterHandler<T> {

        /* renamed from: a */
        private final Converter f25311a;

        /* renamed from: b */
        private final boolean f25312b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public QueryName(Converter converter, boolean z10) {
            this.f25311a = converter;
            this.f25312b = z10;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            requestBuilder.m25742g((String) this.f25311a.mo22520a(obj), null, this.f25312b);
        }
    }

    /* loaded from: classes3.dex */
    static final class RawPart extends ParameterHandler<MultipartBody.Part> {

        /* renamed from: a */
        static final RawPart f25313a = new RawPart();

        private RawPart() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo25716a(RequestBuilder requestBuilder, MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.m25740e(part);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class RelativeUrl extends ParameterHandler<Object> {

        /* renamed from: a */
        private final Method f25314a;

        /* renamed from: b */
        private final int f25315b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RelativeUrl(Method method, int i10) {
            this.f25314a = method;
            this.f25315b = i10;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.m25746m(obj);
                return;
            }
            throw Utils.m25799p(this.f25314a, this.f25315b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Tag<T> extends ParameterHandler<T> {

        /* renamed from: a */
        final Class f25316a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Tag(Class cls) {
            this.f25316a = cls;
        }

        @Override // retrofit2.ParameterHandler
        /* renamed from: a */
        void mo25716a(RequestBuilder requestBuilder, Object obj) {
            requestBuilder.m25743h(this.f25316a, obj);
        }
    }

    ParameterHandler() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25716a(RequestBuilder requestBuilder, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final ParameterHandler m25717b() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            @Override // retrofit2.ParameterHandler
            /* renamed from: a */
            void mo25716a(RequestBuilder requestBuilder, Object obj) {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ParameterHandler.this.mo25716a(requestBuilder, Array.get(obj, i10));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final ParameterHandler m25718c() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo25716a(RequestBuilder requestBuilder, Iterable iterable) {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.mo25716a(requestBuilder, it.next());
                }
            }
        };
    }
}
