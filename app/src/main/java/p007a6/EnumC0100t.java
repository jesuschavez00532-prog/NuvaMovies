package p007a6;

/* renamed from: a6.t */
/* loaded from: classes.dex */
public enum EnumC0100t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a */
    private final int f332a;

    EnumC0100t(int i10) {
        this.f332a = i10;
    }

    /* renamed from: a */
    public static EnumC0100t m448a(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    /* renamed from: b */
    public int m449b() {
        return this.f332a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f332a);
    }
}
