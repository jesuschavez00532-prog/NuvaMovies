package p359ue;

/* renamed from: ue.b */
/* loaded from: classes3.dex */
abstract class AbstractC7148b extends AbstractC7147a {
    /* renamed from: d */
    public static final boolean m27659d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
