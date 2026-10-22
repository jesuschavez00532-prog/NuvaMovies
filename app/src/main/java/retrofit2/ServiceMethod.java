package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ServiceMethod<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ServiceMethod m25782b(Retrofit retrofit, Method method) {
        RequestFactory m25747b = RequestFactory.m25747b(retrofit, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!Utils.m25794k(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return HttpServiceMethod.m25699f(retrofit, method, m25747b);
            }
            throw Utils.m25797n(method, "Service methods cannot return void.", new Object[0]);
        }
        throw Utils.m25797n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo25700a(Object[] objArr);
}
