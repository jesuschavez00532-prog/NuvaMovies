package retrofit2;

import anet.channel.request.Request;
import ee.InterfaceC4181d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import retrofit2.Utils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {

    /* renamed from: a */
    private final RequestFactory f25234a;

    /* renamed from: b */
    private final Call.Factory f25235b;

    /* renamed from: c */
    private final Converter f25236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {

        /* renamed from: d */
        private final CallAdapter f25237d;

        CallAdapted(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.f25237d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        protected Object mo25701c(Call call, Object[] objArr) {
            return this.f25237d.mo21164b(call);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d */
        private final CallAdapter f25238d;

        /* renamed from: e */
        private final boolean f25239e;

        SuspendForBody(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter, boolean z10) {
            super(requestFactory, factory, converter);
            this.f25238d = callAdapter;
            this.f25239e = z10;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        protected Object mo25701c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f25238d.mo21164b(call);
            InterfaceC4181d interfaceC4181d = (InterfaceC4181d) objArr[objArr.length - 1];
            try {
                if (this.f25239e) {
                    return KotlinExtensions.m25704b(call2, interfaceC4181d);
                }
                return KotlinExtensions.m25703a(call2, interfaceC4181d);
            } catch (Exception e10) {
                return KotlinExtensions.m25706d(e10, interfaceC4181d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d */
        private final CallAdapter f25240d;

        SuspendForResponse(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.f25240d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        /* renamed from: c */
        protected Object mo25701c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f25240d.mo21164b(call);
            InterfaceC4181d interfaceC4181d = (InterfaceC4181d) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m25705c(call2, interfaceC4181d);
            } catch (Exception e10) {
                return KotlinExtensions.m25706d(e10, interfaceC4181d);
            }
        }
    }

    HttpServiceMethod(RequestFactory requestFactory, Call.Factory factory, Converter converter) {
        this.f25234a = requestFactory;
        this.f25235b = factory;
        this.f25236c = converter;
    }

    /* renamed from: d */
    private static CallAdapter m25697d(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return retrofit.m25766a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw Utils.m25798o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static Converter m25698e(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.m25773i(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw Utils.m25798o(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static HttpServiceMethod m25699f(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = requestFactory.f25344k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type m25790g = Utils.m25790g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.m25792i(m25790g) == Response.class && (m25790g instanceof ParameterizedType)) {
                m25790g = Utils.m25791h(0, (ParameterizedType) m25790g);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, m25790g);
            annotations = SkipCallbackExecutorImpl.m25783a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        CallAdapter m25697d = m25697d(retrofit, method, genericReturnType, annotations);
        Type mo21163a = m25697d.mo21163a();
        if (mo21163a != okhttp3.Response.class) {
            if (mo21163a != Response.class) {
                if (requestFactory.f25336c.equals(Request.Method.HEAD) && !Void.class.equals(mo21163a)) {
                    throw Utils.m25797n(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                Converter m25698e = m25698e(retrofit, method, mo21163a);
                Call.Factory factory = retrofit.f25374b;
                if (!z11) {
                    return new CallAdapted(requestFactory, factory, m25698e, m25697d);
                }
                if (z10) {
                    return new SuspendForResponse(requestFactory, factory, m25698e, m25697d);
                }
                return new SuspendForBody(requestFactory, factory, m25698e, m25697d, false);
            }
            throw Utils.m25797n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw Utils.m25797n(method, "'" + Utils.m25792i(mo21163a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // retrofit2.ServiceMethod
    /* renamed from: a */
    public final Object mo25700a(Object[] objArr) {
        return mo25701c(new OkHttpCall(this.f25234a, objArr, this.f25235b, this.f25236c), objArr);
    }

    /* renamed from: c */
    protected abstract Object mo25701c(Call call, Object[] objArr);
}
