package p043ce;

import be.C1318n;
import java.util.Collections;
import java.util.Map;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC1485b0 extends AbstractC1483a0 {
    /* renamed from: a */
    public static int m6932a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final Map m6933b(C1318n c1318n) {
        AbstractC5868k.m23674f(c1318n, "pair");
        Map singletonMap = Collections.singletonMap(c1318n.m5969c(), c1318n.m5970d());
        AbstractC5868k.m23673e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final Map m6934c(Map map) {
        AbstractC5868k.m23674f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC5868k.m23673e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
