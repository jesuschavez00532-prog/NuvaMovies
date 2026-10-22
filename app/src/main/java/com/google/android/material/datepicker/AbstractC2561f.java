package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
abstract class AbstractC2561f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m10468a(long j10) {
        return m10469b(j10, Locale.getDefault());
    }

    /* renamed from: b */
    static String m10469b(long j10, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC2576u.m10542b(locale).format(new Date(j10));
            return format;
        }
        return AbstractC2576u.m10546f(locale).format(new Date(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m10470c(long j10) {
        return m10471d(j10, Locale.getDefault());
    }

    /* renamed from: d */
    static String m10471d(long j10, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC2576u.m10553m(locale).format(new Date(j10));
            return format;
        }
        return AbstractC2576u.m10546f(locale).format(new Date(j10));
    }
}
