package com.umeng.message.proguard;

import android.text.TextUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.umeng.message.proguard.bk */
/* loaded from: classes3.dex */
public final class C3593bk {
    /* renamed from: a */
    public static String m15427a(String str, String str2, byte[] bArr) {
        if (!TextUtils.isEmpty(str2) && bArr != null && !TextUtils.isEmpty(str)) {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(bArr));
            return C3588bf.m15404a(cipher.doFinal(str.getBytes()));
        }
        return "";
    }

    /* renamed from: b */
    public static String m15428b(String str, String str2, byte[] bArr) {
        if (!TextUtils.isEmpty(str2) && bArr != null && !TextUtils.isEmpty(str)) {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(bArr));
            return new String(cipher.doFinal(C3588bf.m15405a(str)));
        }
        return "";
    }
}
