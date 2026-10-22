package cc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;

/* renamed from: cc.l0 */
/* loaded from: classes.dex */
public final class C1464l0 {

    /* renamed from: a */
    public static final C1464l0 f5622a;

    /* renamed from: b */
    private static final String f5623b;

    /* renamed from: c */
    private static final int f5624c;

    /* renamed from: d */
    private static boolean f5625d;

    /* renamed from: e */
    private static String f5626e;

    static {
        C1464l0 c1464l0 = new C1464l0();
        f5622a = c1464l0;
        f5623b = c1464l0.getClass().getSimpleName();
        f5624c = 3600000;
        f5626e = "";
    }

    private C1464l0() {
    }

    /* renamed from: a */
    private final void m6822a() {
        f5626e = String.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / f5624c);
        f5625d = true;
    }

    /* renamed from: b */
    public final String m6823b() {
        if (AbstractC6567a.m25634d(f5626e)) {
            m6822a();
        }
        return f5626e;
    }

    /* renamed from: c */
    public final String m6824c(String str, String str2) {
        AbstractC5868k.m23674f(str, "localTime");
        AbstractC5868k.m23674f(str2, "timePattern");
        if (!AbstractC6567a.m25634d(str) && !AbstractC6567a.m25634d(str2)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                Date parse = simpleDateFormat.parse(str);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2, Locale.getDefault());
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                String format = simpleDateFormat2.format(Long.valueOf(parse.getTime()));
                AbstractC5868k.m23673e(format, "utcFormat.format(localDate.time)");
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: d */
    public final String m6825d(String str, int i10, String str2) {
        AbstractC5868k.m23674f(str, "localTime");
        AbstractC5868k.m23674f(str2, "localPattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(str));
        calendar.add(5, i10);
        String format = simpleDateFormat.format(calendar.getTime());
        AbstractC5868k.m23673e(format, "localFormat.format(calender.time)");
        return format;
    }

    /* renamed from: e */
    public final String m6826e(String str, String str2) {
        AbstractC5868k.m23674f(str, "utcTime");
        AbstractC5868k.m23674f(str2, "localPattern");
        if (!AbstractC6567a.m25634d(str) && !AbstractC6567a.m25634d(str2)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date parse = simpleDateFormat.parse(str);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2, Locale.getDefault());
                simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                String format = simpleDateFormat2.format(Long.valueOf(parse.getTime()));
                AbstractC5868k.m23673e(format, "localFormat.format(utcDate.time)");
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }
}
