package retrofit2;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {

    /* renamed from: a */
    private static final SkipCallbackExecutor f25391a = new SkipCallbackExecutorImpl();

    SkipCallbackExecutorImpl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Annotation[] m25783a(Annotation[] annotationArr) {
        if (Utils.m25796m(annotationArr, SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f25391a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + SkipCallbackExecutor.class.getName() + "()";
    }
}
