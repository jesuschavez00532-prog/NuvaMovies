package com.alibaba.sdk.android.httpdns;

import java.security.MessageDigest;
import java.util.regex.Pattern;
import org.android.agoo.message.MessageService;

/* renamed from: com.alibaba.sdk.android.httpdns.l */
/* loaded from: classes.dex */
class C1548l {

    /* renamed from: a */
    private static Pattern f5963a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m7170a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : digest) {
            String hexString = Integer.toHexString(b10 & 255);
            while (hexString.length() < 2) {
                hexString = MessageService.MSG_DB_READY_REPORT + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m7171b(String str) {
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                if (charArray.length > 0 && charArray.length <= 255) {
                    for (char c10 : charArray) {
                        if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-'))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m7172c(String str) {
        return str != null && str.length() >= 7 && str.length() <= 15 && !str.equals("") && f5963a.matcher(str).matches();
    }
}
