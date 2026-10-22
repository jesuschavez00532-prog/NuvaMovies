package p201k2;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public abstract class AbstractC5086c {

    /* renamed from: a */
    private static SimpleDateFormat f20943a;

    /* renamed from: b */
    private static SimpleDateFormat f20944b;

    static {
        Locale locale = Locale.US;
        f20943a = new SimpleDateFormat("yyyy-MM-dd", locale);
        f20944b = new SimpleDateFormat("yyyyMMdd", locale);
    }

    /* renamed from: a */
    private static void m20608a(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i11);
        for (int i12 = 0; i12 < i10 - num.length(); i12++) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* renamed from: b */
    public static String m20609b(String str, String str2, String str3) {
        try {
            Locale locale = Locale.US;
            return new SimpleDateFormat(str2, locale).format(new SimpleDateFormat(str, locale).parse(str3));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return str3;
        }
    }

    /* renamed from: c */
    public static String m20610c(boolean z10, boolean z11, int i10) {
        char c10;
        int i11 = i10 / 60000;
        if (i11 < 0) {
            i11 = -i11;
            c10 = '-';
        } else {
            c10 = '+';
        }
        StringBuilder sb2 = new StringBuilder(9);
        if (z10) {
            sb2.append("GMT");
        }
        sb2.append(c10);
        m20608a(sb2, 2, i11 / 60);
        if (z11) {
            sb2.append(':');
        }
        m20608a(sb2, 2, i11 % 60);
        return sb2.toString();
    }

    /* renamed from: d */
    private static String m20611d(boolean z10, int i10) {
        char c10;
        int i11 = i10 / 60000;
        if (i11 < 0) {
            i11 = -i11;
            c10 = '-';
        } else {
            c10 = '+';
        }
        StringBuilder sb2 = new StringBuilder(9);
        if (z10) {
            sb2.append("GMT");
        }
        sb2.append(c10);
        m20608a(sb2, 2, i11 / 60);
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m20612e(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] strArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(simpleDateFormat.parse(str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int i10 = calendar.get(7) - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        return strArr[i10];
    }

    /* renamed from: f */
    public static String m20613f(String str, String[] strArr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(simpleDateFormat.parse(str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int i10 = calendar.get(7) - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        return strArr[i10];
    }

    /* renamed from: g */
    public static String m20614g(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: h */
    public static int m20615h() {
        try {
            return Integer.parseInt(new SimpleDateFormat("HHmm", Locale.getDefault()).format(new Date()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    /* renamed from: i */
    public static String m20616i(String str) {
        return new SimpleDateFormat(str).format(new Date());
    }

    /* renamed from: j */
    public static String m20617j() {
        return m20610c(true, true, TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: k */
    public static String m20618k() {
        return m20611d(true, TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: l */
    public static long m20619l(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new SimpleDateFormat(str2, Locale.getDefault()).parse(str).getTime();
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    /* renamed from: m */
    public static String m20620m(String str, Long l10) {
        return new SimpleDateFormat(str).format(new Date(System.currentTimeMillis() + l10.longValue()));
    }

    /* renamed from: n */
    public static boolean m20621n(String str) {
        if (str.length() >= 5 && str.length() <= 5 && !TextUtils.isEmpty(str)) {
            return Pattern.compile("^(([1-9]{1})|([0-1][0-9])|([1-2][0-3])):([0-5][0-9])$").matcher(str).find();
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m20622o(String str, String str2) {
        return m20616i(str2).equals(str);
    }

    /* renamed from: p */
    public static String m20623p(long j10) {
        int i10 = (int) j10;
        int i11 = i10 / 60;
        return String.format("%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60), Integer.valueOf(i10 % 60));
    }

    /* renamed from: q */
    public static Date m20624q(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.US);
        try {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str2));
            return simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static Long m20625r(String str, String str2) {
        try {
            return Long.valueOf(new SimpleDateFormat(str2, Locale.getDefault()).parse(str).getTime());
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: s */
    public static Long m20626s(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
        try {
            return Long.valueOf(simpleDateFormat.parse(str2).getTime());
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: t */
    public static String m20627t(String str, String str2, String str3) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, locale);
        try {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            return new SimpleDateFormat("HH:mm", locale).format(simpleDateFormat.parse(str2));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
