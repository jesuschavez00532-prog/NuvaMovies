package com.efs.sdk.net.p059b;

import android.util.Base64;
import com.efs.sdk.base.core.util.Log;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: com.efs.sdk.net.b.a */
/* loaded from: classes.dex */
public final class C1768a {
    /* renamed from: a */
    public static long m7861a(Map<String, Long> map, String str, String str2) {
        if (!map.containsKey(str) || !map.containsKey(str2)) {
            return 0L;
        }
        return map.get(str2).longValue() - map.get(str).longValue();
    }

    /* renamed from: a */
    public static boolean m7864a(int i10) {
        if (i10 == 0) {
            return false;
        }
        return i10 == 100 || new Random().nextInt(100) <= i10;
    }

    /* renamed from: a */
    public static byte[] m7865a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
        }
        return bArr3;
    }

    /* renamed from: a */
    public static String m7863a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: a */
    public static String m7862a(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return String.format(Locale.CHINA, "%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            Log.m7727e("efs.base", "md5 error", e10);
            return "";
        }
    }
}
