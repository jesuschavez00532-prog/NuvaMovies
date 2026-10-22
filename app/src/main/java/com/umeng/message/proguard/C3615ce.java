package com.umeng.message.proguard;

import android.text.TextUtils;

/* renamed from: com.umeng.message.proguard.ce */
/* loaded from: classes3.dex */
public final class C3615ce {
    /* renamed from: a */
    public static void m15509a(String str, Object... objArr) {
        C3698q.m15801a().mo4520d(m15507a(str), m15508a(objArr));
    }

    /* renamed from: b */
    public static void m15510b(String str, Object... objArr) {
        C3698q.m15801a().mo4523i(m15507a(str), m15508a(objArr));
    }

    /* renamed from: c */
    public static void m15511c(String str, Object... objArr) {
        C3698q.m15801a().mo4524w(m15507a(str), m15508a(objArr));
    }

    /* renamed from: d */
    public static void m15512d(String str, Object... objArr) {
        C3698q.m15801a().mo4521e(m15507a(str), m15508a(objArr));
    }

    /* renamed from: a */
    private static String m15507a(String str) {
        return TextUtils.isEmpty(str) ? "UMUnion" : "UMUnion.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    private static String m15508a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(objArr[0]);
        for (int i10 = 1; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }
}
