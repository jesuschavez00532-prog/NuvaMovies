package p158h7;

/* renamed from: h7.b */
/* loaded from: classes.dex */
public enum EnumC4562b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: a */
    private final int[] f19654a;

    /* renamed from: b */
    private final int f19655b;

    EnumC4562b(int[] iArr, int i10) {
        this.f19654a = iArr;
        this.f19655b = i10;
    }

    /* renamed from: a */
    public int m18985a() {
        return this.f19655b;
    }

    /* renamed from: b */
    public int m18986b(C4563c c4563c) {
        char c10;
        int m18992f = c4563c.m18992f();
        if (m18992f <= 9) {
            c10 = 0;
        } else if (m18992f <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f19654a[c10];
    }
}
