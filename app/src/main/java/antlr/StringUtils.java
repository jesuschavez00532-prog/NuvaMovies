package antlr;

/* loaded from: classes.dex */
public class StringUtils {
    public static String stripBack(String str, char c10) {
        while (str.length() > 0 && str.charAt(str.length() - 1) == c10) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String stripFront(String str, char c10) {
        while (str.length() > 0 && str.charAt(0) == c10) {
            str = str.substring(1);
        }
        return str;
    }

    public static String stripFrontBack(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int lastIndexOf = str.lastIndexOf(str3);
        if (indexOf != -1 && lastIndexOf != -1) {
            return str.substring(indexOf + 1, lastIndexOf);
        }
        return str;
    }

    public static String stripBack(String str, String str2) {
        boolean z10;
        do {
            z10 = false;
            for (int i10 = 0; i10 < str2.length(); i10++) {
                char charAt = str2.charAt(i10);
                while (str.length() > 0 && str.charAt(str.length() - 1) == charAt) {
                    str = str.substring(0, str.length() - 1);
                    z10 = true;
                }
            }
        } while (z10);
        return str;
    }

    public static String stripFront(String str, String str2) {
        boolean z10;
        do {
            z10 = false;
            for (int i10 = 0; i10 < str2.length(); i10++) {
                char charAt = str2.charAt(i10);
                while (str.length() > 0 && str.charAt(0) == charAt) {
                    z10 = true;
                    str = str.substring(1);
                }
            }
        } while (z10);
        return str;
    }
}
