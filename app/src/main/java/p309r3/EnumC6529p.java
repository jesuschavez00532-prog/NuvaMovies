package p309r3;

import android.util.SparseArray;

/* renamed from: r3.p */
/* loaded from: classes.dex */
public enum EnumC6529p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: h */
    private static final SparseArray f25137h;

    /* renamed from: a */
    private final int f25139a;

    static {
        EnumC6529p enumC6529p = DEFAULT;
        EnumC6529p enumC6529p2 = UNMETERED_ONLY;
        EnumC6529p enumC6529p3 = UNMETERED_OR_DAILY;
        EnumC6529p enumC6529p4 = FAST_IF_RADIO_AWAKE;
        EnumC6529p enumC6529p5 = NEVER;
        EnumC6529p enumC6529p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f25137h = sparseArray;
        sparseArray.put(0, enumC6529p);
        sparseArray.put(1, enumC6529p2);
        sparseArray.put(2, enumC6529p3);
        sparseArray.put(3, enumC6529p4);
        sparseArray.put(4, enumC6529p5);
        sparseArray.put(-1, enumC6529p6);
    }

    EnumC6529p(int i10) {
        this.f25139a = i10;
    }
}
