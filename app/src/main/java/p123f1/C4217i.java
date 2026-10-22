package p123f1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import ne.AbstractC5868k;

/* renamed from: f1.i */
/* loaded from: classes.dex */
public final class C4217i {

    /* renamed from: a */
    public static final C4217i f18485a = new C4217i();

    private C4217i() {
    }

    /* renamed from: b */
    private final long m17620b(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            if (parse == null) {
                return 0L;
            }
            return parse.getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: a */
    public final long m17621a() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date());
            AbstractC5868k.m23673e(format, "dateStr");
            long m17620b = m17620b(format, "yyyy-MM-dd HH-mm-ss.SSS");
            AbstractC4210b.m17596a("DateUtil", "getUTCTimeMills:" + m17620b);
            return m17620b;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }
}
