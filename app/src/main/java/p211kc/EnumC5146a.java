package p211kc;

/* renamed from: kc.a */
/* loaded from: classes.dex */
public enum EnumC5146a {
    SHOW_IN_BOTTOM,
    SHOW_IN_CENTER;

    /* renamed from: b */
    public static EnumC5146a m20811b(String str) {
        if ("1".equals(str)) {
            return SHOW_IN_BOTTOM;
        }
        if ("2".equals(str)) {
            return SHOW_IN_CENTER;
        }
        return SHOW_IN_CENTER;
    }
}
