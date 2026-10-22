package p201k2;

import com.lzy.okgo.model.Progress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import ne.AbstractC5868k;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C5087d {

    /* renamed from: a */
    public static final C5087d f20945a = new C5087d();

    /* renamed from: b */
    private static SimpleDateFormat f20946b = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.ENGLISH);

    private C5087d() {
    }

    /* renamed from: a */
    private final Date m20628a(Calendar calendar, int i10) {
        Date date;
        int i11 = Calendar.getInstance().get(1);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return new Date();
                }
                Date parse = f20946b.parse(i11 + ".01.05 00:00:00");
                Date parse2 = f20946b.parse(i11 + ".12.29 00:00:00");
                Date parse3 = f20946b.parse(i11 + ".01.01 00:00:00");
                if (calendar.getTime().before(parse)) {
                    date = parse3;
                } else {
                    date = parse2;
                }
                AbstractC5868k.m23673e(date, "{\n                val da…          }\n            }");
                return date;
            }
            Date parse4 = f20946b.parse(i11 + ".12.22 00:00:00");
            AbstractC5868k.m23673e(parse4, "{\n                sdf.pa… 00:00:00\")\n            }");
            return parse4;
        }
        Date parse5 = f20946b.parse(i11 + ".10.28 00:00:00");
        AbstractC5868k.m23673e(parse5, "{\n                sdf.pa… 00:00:00\")\n            }");
        return parse5;
    }

    /* renamed from: b */
    private final Date m20629b(Calendar calendar, int i10) {
        Date date;
        int i11 = Calendar.getInstance().get(1);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return new Date();
                }
                Date parse = f20946b.parse(i11 + ".01.05 00:00:00");
                Date parse2 = f20946b.parse(i11 + ".12.31 23:59:59");
                if (calendar.getTime().before(parse)) {
                    date = parse;
                } else {
                    date = parse2;
                }
                AbstractC5868k.m23673e(date, "{\n                val da…          }\n            }");
                return date;
            }
            Date parse3 = f20946b.parse(i11 + ".12.29 00:00:00");
            AbstractC5868k.m23673e(parse3, "{\n                sdf.pa… 00:00:00\")\n            }");
            return parse3;
        }
        Date parse4 = f20946b.parse(i11 + ".11.04 00:00:00");
        AbstractC5868k.m23673e(parse4, "{\n                sdf.pa… 00:00:00\")\n            }");
        return parse4;
    }

    /* renamed from: c */
    public final boolean m20630c(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance();
        AbstractC5868k.m23673e(calendar2, "getInstance()");
        AbstractC5868k.m23673e(calendar, Progress.DATE);
        calendar2.setTime(m20628a(calendar, i10));
        Calendar calendar3 = Calendar.getInstance();
        AbstractC5868k.m23673e(calendar3, "getInstance()");
        calendar3.setTime(m20629b(calendar, i10));
        if (calendar.after(calendar2) && calendar.before(calendar3)) {
            return true;
        }
        return false;
    }
}
