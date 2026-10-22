package org.android.agoo.common;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: org.android.agoo.common.a */
/* loaded from: classes3.dex */
public final class C6038a {

    /* renamed from: a */
    private static byte[] f23685a = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};

    /* renamed from: b */
    private static ThreadLocal<Cipher> f23686b = new ThreadLocal<>();

    /* renamed from: c */
    private static final AlgorithmParameterSpec f23687c = new IvParameterSpec(f23685a);

    /* renamed from: a */
    public static final byte[] m24199a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) {
        try {
            return m24197a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (BadPaddingException e10) {
            throw new IllegalArgumentException("AES decrypt error:" + e10.getMessage(), e10);
        } catch (IllegalBlockSizeException e11) {
            throw new IllegalArgumentException("AES decrypt error:" + e11.getMessage(), e11);
        }
    }

    /* renamed from: a */
    private static final Cipher m24197a(SecretKeySpec secretKeySpec, byte[] bArr, int i10) {
        Cipher m24196a = m24196a();
        try {
            m24196a.init(i10, secretKeySpec, new IvParameterSpec(bArr));
            return m24196a;
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("init Chipher error:" + e10.getMessage(), e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new RuntimeException("init Chipher error:" + e11.getMessage(), e11);
        } catch (InvalidKeyException e12) {
            throw new RuntimeException("init Chipher error:" + e12.getMessage(), e12);
        }
    }

    /* renamed from: a */
    private static final Cipher m24196a() {
        Cipher cipher = f23686b.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                f23686b.set(cipher);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException("get Chipher error:" + e10.getMessage(), e10);
            } catch (NoSuchPaddingException e11) {
                throw new RuntimeException("get Chipher error:" + e11.getMessage(), e11);
            }
        }
        return cipher;
    }

    /* renamed from: a */
    public static final byte[] m24198a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }

    /* renamed from: a */
    public static byte[] m24200a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (Throwable th) {
            throw new RuntimeException("HmacSHA1 Throwable", th);
        }
    }
}
