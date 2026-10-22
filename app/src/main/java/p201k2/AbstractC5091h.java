package p201k2;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: k2.h */
/* loaded from: classes.dex */
public abstract class AbstractC5091h {

    /* renamed from: k2.h$a */
    /* loaded from: classes.dex */
    public enum a {
        ZH("zh"),
        EN("en"),
        PT("pt");


        /* renamed from: a */
        public String f20976a;

        a(String str) {
            this.f20976a = str;
        }
    }

    /* renamed from: a */
    public static a m20658a() {
        if (Locale.getDefault().getLanguage().equalsIgnoreCase("zh")) {
            return a.ZH;
        }
        return a.EN;
    }

    /* renamed from: b */
    public static String m20659b() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: c */
    public static String m20660c(String str, String str2) {
        if (m20663f() && !TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "";
    }

    /* renamed from: d */
    public static boolean m20661d() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("es");
    }

    /* renamed from: e */
    public static boolean m20662e() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("pt");
    }

    /* renamed from: f */
    public static boolean m20663f() {
        String language = Locale.getDefault().getLanguage();
        if (!language.equalsIgnoreCase("pt") && !language.equalsIgnoreCase("es")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m20664g() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("zh");
    }
}
