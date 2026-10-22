package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Invocation {

    /* renamed from: a */
    private final Method f25241a;

    /* renamed from: b */
    private final List f25242b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Invocation(Method method, List list) {
        this.f25241a = method;
        this.f25242b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m25702a() {
        return this.f25241a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f25241a.getDeclaringClass().getName(), this.f25241a.getName(), this.f25242b);
    }
}
