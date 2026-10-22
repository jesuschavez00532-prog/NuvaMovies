package com.raizlabs.android.dbflow;

/* loaded from: classes2.dex */
public class StringUtils {
    public static boolean isNotNullOrEmpty(String str) {
        if (str != null && !str.equals("") && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.equals("") && str.length() > 0) {
            return false;
        }
        return true;
    }
}
