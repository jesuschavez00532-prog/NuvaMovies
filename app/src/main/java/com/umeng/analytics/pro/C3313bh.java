package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.umeng.analytics.pro.bh */
/* loaded from: classes3.dex */
public class C3313bh {
    @SuppressLint({"SuspiciousIndentation"})
    /* renamed from: a */
    public static InterfaceC3310be m13878a() {
        String str = Build.BRAND;
        C3324bs.m13896a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (C3323br.m13891d()) {
            return new C3314bi();
        }
        if (C3323br.m13892e()) {
            return new C3315bj();
        }
        if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
            if (str.equalsIgnoreCase("vivo")) {
                return new C3321bp();
            }
            if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                    if (str.equalsIgnoreCase("nubia")) {
                        return new C3318bm();
                    }
                    if (str.equalsIgnoreCase("samsung")) {
                        return new C3320bo();
                    }
                    if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu") && !C3323br.m13888a()) {
                        if (!C3323br.m13893f()) {
                            return null;
                        }
                        return new C3312bg();
                    }
                    return new C3317bl();
                }
                return new C3316bk();
            }
            return new C3319bn();
        }
        return new C3322bq();
    }
}
