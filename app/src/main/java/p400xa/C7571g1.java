package p400xa;

import java.lang.reflect.Field;
import ne.AbstractC5868k;

/* renamed from: xa.g1 */
/* loaded from: classes2.dex */
public final class C7571g1 {

    /* renamed from: a */
    public static final C7571g1 f27808a = new C7571g1();

    private C7571g1() {
    }

    /* renamed from: a */
    public final void m29031a(Class cls, Object obj, String str, Object obj2) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(obj, "obj");
        AbstractC5868k.m23674f(str, "fieldName");
        AbstractC5868k.m23674f(obj2, "fieldValue");
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
