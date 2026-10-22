package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface CallAdapter<R, T> {

    /* loaded from: classes3.dex */
    public static abstract class Factory {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public static Type m25687b(int i10, ParameterizedType parameterizedType) {
            return Utils.m25791h(i10, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: c */
        public static Class m25688c(Type type) {
            return Utils.m25792i(type);
        }

        /* renamed from: a */
        public abstract CallAdapter mo21167a(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    /* renamed from: a */
    Type mo21163a();

    /* renamed from: b */
    Object mo21164b(Call call);
}
