package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface Converter<F, T> {

    /* loaded from: classes3.dex */
    public static abstract class Factory {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public static Type m25691a(int i10, ParameterizedType parameterizedType) {
            return Utils.m25791h(i10, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public static Class m25692b(Type type) {
            return Utils.m25792i(type);
        }

        /* renamed from: c */
        public Converter mo22518c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        /* renamed from: d */
        public Converter mo22519d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        /* renamed from: e */
        public Converter m25693e(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    /* renamed from: a */
    Object mo22520a(Object obj);
}
