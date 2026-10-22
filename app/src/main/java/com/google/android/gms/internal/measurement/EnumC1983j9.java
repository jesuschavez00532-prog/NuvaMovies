package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.j9 */
/* loaded from: classes.dex */
public final class EnumC1983j9 {

    /* renamed from: d */
    public static final EnumC1983j9 f7830d;

    /* renamed from: e */
    public static final EnumC1983j9 f7831e;

    /* renamed from: f */
    public static final EnumC1983j9 f7832f;

    /* renamed from: g */
    public static final EnumC1983j9 f7833g;

    /* renamed from: h */
    public static final EnumC1983j9 f7834h;

    /* renamed from: i */
    public static final EnumC1983j9 f7835i;

    /* renamed from: j */
    public static final EnumC1983j9 f7836j;

    /* renamed from: k */
    public static final EnumC1983j9 f7837k;

    /* renamed from: l */
    public static final EnumC1983j9 f7838l;

    /* renamed from: m */
    public static final EnumC1983j9 f7839m;

    /* renamed from: n */
    private static final /* synthetic */ EnumC1983j9[] f7840n;

    /* renamed from: a */
    private final Class f7841a;

    /* renamed from: b */
    private final Class f7842b;

    /* renamed from: c */
    private final Object f7843c;

    static {
        EnumC1983j9 enumC1983j9 = new EnumC1983j9("VOID", 0, Void.class, Void.class, null);
        f7830d = enumC1983j9;
        Class cls = Integer.TYPE;
        EnumC1983j9 enumC1983j92 = new EnumC1983j9("INT", 1, cls, Integer.class, 0);
        f7831e = enumC1983j92;
        EnumC1983j9 enumC1983j93 = new EnumC1983j9("LONG", 2, Long.TYPE, Long.class, 0L);
        f7832f = enumC1983j93;
        EnumC1983j9 enumC1983j94 = new EnumC1983j9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7833g = enumC1983j94;
        EnumC1983j9 enumC1983j95 = new EnumC1983j9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7834h = enumC1983j95;
        EnumC1983j9 enumC1983j96 = new EnumC1983j9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7835i = enumC1983j96;
        EnumC1983j9 enumC1983j97 = new EnumC1983j9("STRING", 6, String.class, String.class, "");
        f7836j = enumC1983j97;
        EnumC1983j9 enumC1983j98 = new EnumC1983j9("BYTE_STRING", 7, AbstractC1873c8.class, AbstractC1873c8.class, AbstractC1873c8.f7691b);
        f7837k = enumC1983j98;
        EnumC1983j9 enumC1983j99 = new EnumC1983j9("ENUM", 8, cls, Integer.class, null);
        f7838l = enumC1983j99;
        EnumC1983j9 enumC1983j910 = new EnumC1983j9("MESSAGE", 9, Object.class, Object.class, null);
        f7839m = enumC1983j910;
        f7840n = new EnumC1983j9[]{enumC1983j9, enumC1983j92, enumC1983j93, enumC1983j94, enumC1983j95, enumC1983j96, enumC1983j97, enumC1983j98, enumC1983j99, enumC1983j910};
    }

    private EnumC1983j9(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f7841a = cls;
        this.f7842b = cls2;
        this.f7843c = obj;
    }

    public static EnumC1983j9[] values() {
        return (EnumC1983j9[]) f7840n.clone();
    }

    /* renamed from: a */
    public final Class m8557a() {
        return this.f7842b;
    }
}
