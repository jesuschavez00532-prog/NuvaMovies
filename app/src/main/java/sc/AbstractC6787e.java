package sc;

import ne.AbstractC5868k;
import p359ue.AbstractC7167u;

/* renamed from: sc.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6787e {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Class m26771d(String str) {
        boolean m27762u;
        int m27739I;
        m27762u = AbstractC7167u.m27762u(str, '.', false, 2, null);
        if (!m27762u) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            m27739I = AbstractC7167u.m27739I(str, '.', 0, false, 6, null);
            String sb2 = new StringBuilder(str).replace(m27739I, m27739I + 1, "$").toString();
            AbstractC5868k.m23673e(sb2, "StringBuilder(type).repl…ndex + 1, \"$\").toString()");
            return m26771d(sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m26772e(String str, String str2) {
        return AbstractC5868k.m23669a(m26773f(str), m26773f(str2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /* renamed from: f */
    private static final String m26773f(String str) {
        switch (str.hashCode()) {
            case -2056817302:
                if (!str.equals("java.lang.Integer")) {
                    return str;
                }
                return "kotlin.Int";
            case -1325958191:
                if (!str.equals("double")) {
                    return str;
                }
                return "kotlin.Double";
            case -527879800:
                if (!str.equals("java.lang.Float")) {
                    return str;
                }
                return "kotlin.Float";
            case -515992664:
                if (!str.equals("java.lang.Short")) {
                    return str;
                }
                return "kotlin.Short";
            case 104431:
                if (!str.equals("int")) {
                    return str;
                }
                return "kotlin.Int";
            case 3039496:
                if (!str.equals("byte")) {
                    return str;
                }
                return "kotlin.Byte";
            case 3052374:
                if (!str.equals("char")) {
                    return str;
                }
                return "kotlin.Char";
            case 3327612:
                if (!str.equals("long")) {
                    return str;
                }
                return "kotlin.Long";
            case 64711720:
                if (!str.equals("boolean")) {
                    return str;
                }
                return "kotlin.Boolean";
            case 97526364:
                if (!str.equals("float")) {
                    return str;
                }
                return "kotlin.Float";
            case 109413500:
                if (!str.equals("short")) {
                    return str;
                }
                return "kotlin.Short";
            case 155276373:
                if (!str.equals("java.lang.Character")) {
                    return str;
                }
                return "kotlin.Char";
            case 344809556:
                if (!str.equals("java.lang.Boolean")) {
                    return str;
                }
                return "kotlin.Boolean";
            case 398507100:
                if (!str.equals("java.lang.Byte")) {
                    return str;
                }
                return "kotlin.Byte";
            case 398795216:
                if (!str.equals("java.lang.Long")) {
                    return str;
                }
                return "kotlin.Long";
            case 761287205:
                if (!str.equals("java.lang.Double")) {
                    return str;
                }
                return "kotlin.Double";
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return str;
            default:
                return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Object m26774g(String str, String str2) {
        boolean z10 = true;
        switch (str.hashCode()) {
            case -2133280414:
                if (!str.equals("kotlin.Int")) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(str2));
            case -2056817302:
                if (!str.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(str2));
            case -1707381259:
                if (!str.equals("kotlin.Byte")) {
                    return null;
                }
                return Byte.valueOf(Byte.parseByte(str2));
            case -1707368381:
                if (!str.equals("kotlin.Char")) {
                    return null;
                }
                if (str2.length() <= 0) {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                return Character.valueOf(str2.charAt(0));
            case -1707093143:
                if (!str.equals("kotlin.Long")) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(str2));
            case -1385909489:
                if (!str.equals("kotlin.Float")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str2));
            case -1374022353:
                if (!str.equals("kotlin.Short")) {
                    return null;
                }
                return Short.valueOf(Short.parseShort(str2));
            case -1325958191:
                if (!str.equals("double")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str2));
            case -527879800:
                if (!str.equals("java.lang.Float")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str2));
            case -515992664:
                if (!str.equals("java.lang.Short")) {
                    return null;
                }
                return Short.valueOf(Short.parseShort(str2));
            case -67829378:
                if (!str.equals("kotlin.Double")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str2));
            case 104431:
                if (!str.equals("int")) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(str2));
            case 3039496:
                if (!str.equals("byte")) {
                    return null;
                }
                return Byte.valueOf(Byte.parseByte(str2));
            case 3052374:
                if (!str.equals("char")) {
                    return null;
                }
                if (str2.length() <= 0) {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                return Character.valueOf(str2.charAt(0));
            case 3327612:
                if (!str.equals("long")) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(str2));
            case 64711720:
                if (!str.equals("boolean")) {
                    return null;
                }
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 97526364:
                if (!str.equals("float")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str2));
            case 109413500:
                if (!str.equals("short")) {
                    return null;
                }
                return Short.valueOf(Short.parseShort(str2));
            case 155276373:
                if (!str.equals("java.lang.Character")) {
                    return null;
                }
                if (str2.length() <= 0) {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                return Character.valueOf(str2.charAt(0));
            case 344809556:
                if (!str.equals("java.lang.Boolean")) {
                    return null;
                }
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 398507100:
                if (!str.equals("java.lang.Byte")) {
                    return null;
                }
                return Byte.valueOf(Byte.parseByte(str2));
            case 398795216:
                if (!str.equals("java.lang.Long")) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(str2));
            case 411999259:
                if (!str.equals("kotlin.Boolean")) {
                    return null;
                }
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 761287205:
                if (!str.equals("java.lang.Double")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str2));
            default:
                return null;
        }
    }
}
