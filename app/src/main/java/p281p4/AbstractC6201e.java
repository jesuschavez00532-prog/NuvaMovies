package p281p4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: p4.e */
/* loaded from: classes.dex */
public abstract class AbstractC6201e {
    /* renamed from: a */
    public static List m24750a() {
        return Collections.emptyList();
    }

    /* renamed from: b */
    public static List m24751b(Object obj) {
        return Collections.singletonList(obj);
    }

    /* renamed from: c */
    public static List m24752c(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(objArr));
            }
            return m24751b(objArr[0]);
        }
        return m24750a();
    }
}
