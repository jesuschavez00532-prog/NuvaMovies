package p114e7;

import anet.channel.request.Request;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e7.c */
/* loaded from: classes.dex */
public enum EnumC4141c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, Request.DEFAULT_CHARSET),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: D */
    private static final Map f18183D = new HashMap();

    /* renamed from: E */
    private static final Map f18184E = new HashMap();

    /* renamed from: a */
    private final int[] f18210a;

    /* renamed from: b */
    private final String[] f18211b;

    static {
        for (EnumC4141c enumC4141c : values()) {
            for (int i10 : enumC4141c.f18210a) {
                f18183D.put(Integer.valueOf(i10), enumC4141c);
            }
            f18184E.put(enumC4141c.name(), enumC4141c);
            for (String str : enumC4141c.f18211b) {
                f18184E.put(str, enumC4141c);
            }
        }
    }

    EnumC4141c(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    /* renamed from: a */
    public static EnumC4141c m17349a(String str) {
        return (EnumC4141c) f18184E.get(str);
    }

    /* renamed from: b */
    public int m17350b() {
        return this.f18210a[0];
    }

    EnumC4141c(int i10, String... strArr) {
        this.f18210a = new int[]{i10};
        this.f18211b = strArr;
    }

    EnumC4141c(int[] iArr, String... strArr) {
        this.f18210a = iArr;
        this.f18211b = strArr;
    }
}
