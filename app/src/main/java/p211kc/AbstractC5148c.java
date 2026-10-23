package p211kc;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: kc.c */
/* loaded from: classes.dex */
public abstract class AbstractC5148c {
    /* renamed from: a */
    private static void m20814a(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i11);
        for (int i12 = 0; i12 < i10 - num.length(); i12++) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* renamed from: b */
    public static Date m20815b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return m20820g(str, "UTC+0", str2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m20816c(boolean z10, boolean z11, int i10) {
        char c10 = '\0';
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
        m20814a(sb2, 2, i11 / 60);
        if (z11) {
            sb2.append(':');
        }
        m20814a(sb2, 2, i11 % 60);
        return sb2.toString();
    }

    /* renamed from: d */
    public static String m20817d(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.connect();
            long date = httpURLConnection.getDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
            return simpleDateFormat.format(new Date(date));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static String m20818e() {
        return m20816c(true, true, TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: f */
    public static boolean m20819f(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
                double time = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
                Double.isNaN(time);
                if ((time * 1.0d) / 3600000.0d > 2.0d) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    /* renamed from: g */
    public static Date m20820g(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.US);
        try {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str2));
            return simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
