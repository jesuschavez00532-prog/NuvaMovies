package p153h2;

import java.util.Arrays;

/* renamed from: h2.a */
/* loaded from: classes.dex */
abstract class AbstractC4508a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m18866a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static String m18867b(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (!obj.getClass().isArray()) {
            return obj.toString();
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        return "Couldn't find a correct type for the object";
    }
}
