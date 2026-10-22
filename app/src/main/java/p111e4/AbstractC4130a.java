package p111e4;

import android.util.SparseArray;
import java.util.HashMap;
import p294q3.EnumC6337d;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public abstract class AbstractC4130a {

    /* renamed from: a */
    private static SparseArray f18144a = new SparseArray();

    /* renamed from: b */
    private static HashMap f18145b;

    static {
        HashMap hashMap = new HashMap();
        f18145b = hashMap;
        hashMap.put(EnumC6337d.DEFAULT, 0);
        f18145b.put(EnumC6337d.VERY_LOW, 1);
        f18145b.put(EnumC6337d.HIGHEST, 2);
        for (EnumC6337d enumC6337d : f18145b.keySet()) {
            f18144a.append(((Integer) f18145b.get(enumC6337d)).intValue(), enumC6337d);
        }
    }

    /* renamed from: a */
    public static int m17312a(EnumC6337d enumC6337d) {
        Integer num = (Integer) f18145b.get(enumC6337d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC6337d);
    }

    /* renamed from: b */
    public static EnumC6337d m17313b(int i10) {
        EnumC6337d enumC6337d = (EnumC6337d) f18144a.get(i10);
        if (enumC6337d != null) {
            return enumC6337d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
