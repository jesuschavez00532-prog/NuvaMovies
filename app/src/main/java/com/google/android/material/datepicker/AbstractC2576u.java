package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
abstract class AbstractC2576u {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m10541a(long j10) {
        Calendar m10551k = m10551k();
        m10551k.setTimeInMillis(j10);
        return m10544d(m10551k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static DateFormat m10542b(Locale locale) {
        return m10543c("MMMEd", locale);
    }

    /* renamed from: c */
    private static DateFormat m10543c(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m10550j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m10544d(Calendar calendar) {
        Calendar m10552l = m10552l(calendar);
        Calendar m10551k = m10551k();
        m10551k.set(m10552l.get(1), m10552l.get(2), m10552l.get(5));
        return m10551k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m10545e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(m10548h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m10546f(Locale locale) {
        return m10545e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m10547g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m10548h());
        return simpleDateFormat;
    }

    /* renamed from: h */
    private static TimeZone m10548h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m10549i() {
        return m10544d(Calendar.getInstance());
    }

    /* renamed from: j */
    private static android.icu.util.TimeZone m10550j() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m10551k() {
        return m10552l(null);
    }

    /* renamed from: l */
    static Calendar m10552l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m10548h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static DateFormat m10553m(Locale locale) {
        return m10543c("yMMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static SimpleDateFormat m10554n() {
        return m10555o(Locale.getDefault());
    }

    /* renamed from: o */
    private static SimpleDateFormat m10555o(Locale locale) {
        return m10547g("MMMM, yyyy", locale);
    }
}
