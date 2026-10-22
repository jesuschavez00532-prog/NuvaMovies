package p331t;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: t.c */
/* loaded from: classes.dex */
public abstract class AbstractC6872c {
    /* renamed from: a */
    public static C6873d m26782a(Configuration configuration) {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            return C6873d.m26785d(locales);
        }
        return C6873d.m26783a(configuration.locale);
    }
}
