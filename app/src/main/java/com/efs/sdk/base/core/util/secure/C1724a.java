package com.efs.sdk.base.core.util.secure;

import anet.channel.request.Request;
import com.efs.sdk.base.core.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.efs.sdk.base.core.util.secure.a */
/* loaded from: classes.dex */
public final class C1724a {

    /* renamed from: a */
    private static final IvParameterSpec f7209a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static byte[] m7773a(byte[] bArr, String str) {
        try {
            SecretKeySpec m7771a = m7771a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, m7771a, f7209a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            Log.m7727e("efs.base", "aes decrypt error", e10);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m7775b(byte[] bArr, String str) {
        try {
            SecretKeySpec m7771a = m7771a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, m7771a, f7209a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            Log.m7727e("efs.base", "aes encrypt error", e10);
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKeySpec m7771a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    /* renamed from: a */
    public static byte[] m7772a(String str, String str2) {
        try {
            return m7775b(str.getBytes(Request.DEFAULT_CHARSET), str2);
        } catch (UnsupportedEncodingException e10) {
            Log.m7727e("efs.base", "getBytes error", e10);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m7774a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
        }
        return bArr3;
    }
}
