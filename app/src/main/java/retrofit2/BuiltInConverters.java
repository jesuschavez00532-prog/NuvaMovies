package retrofit2;

import be.C1328x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p240mf.InterfaceC5694w;
import retrofit2.Converter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BuiltInConverters extends Converter.Factory {

    /* renamed from: a */
    private boolean f25201a = true;

    /* loaded from: classes3.dex */
    static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final BufferingResponseBodyConverter f25202a = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody mo22520a(ResponseBody responseBody) {
            try {
                return Utils.m25784a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {

        /* renamed from: a */
        static final RequestBodyConverter f25203a = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody mo22520a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* loaded from: classes3.dex */
    static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final StreamingResponseBodyConverter f25204a = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody mo22520a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ToStringConverter implements Converter<Object, String> {

        /* renamed from: a */
        static final ToStringConverter f25205a = new ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo22520a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class UnitResponseBodyConverter implements Converter<ResponseBody, C1328x> {

        /* renamed from: a */
        static final UnitResponseBodyConverter f25206a = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1328x mo22520a(ResponseBody responseBody) {
            responseBody.close();
            return C1328x.f4998a;
        }
    }

    /* loaded from: classes3.dex */
    static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {

        /* renamed from: a */
        static final VoidResponseBodyConverter f25207a = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo22520a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: c */
    public Converter mo22518c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.m25792i(type))) {
            return RequestBodyConverter.f25203a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    /* renamed from: d */
    public Converter mo22519d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (Utils.m25796m(annotationArr, InterfaceC5694w.class)) {
                return StreamingResponseBodyConverter.f25204a;
            }
            return BufferingResponseBodyConverter.f25202a;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.f25207a;
        }
        if (this.f25201a && type == C1328x.class) {
            try {
                return UnitResponseBodyConverter.f25206a;
            } catch (NoClassDefFoundError unused) {
                this.f25201a = false;
                return null;
            }
        }
        return null;
    }
}
