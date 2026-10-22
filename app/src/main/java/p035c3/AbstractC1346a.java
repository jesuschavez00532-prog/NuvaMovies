package p035c3;

import android.text.TextUtils;
import android.util.Base64;
import anet.channel.request.Request;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1346a {
    /* renamed from: a */
    public static String m6112a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m6113b(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m6113b(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[16];
            System.arraycopy(decode, 0, bArr, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            byte[] bArr2 = new byte[decode.length - 16];
            System.arraycopy(decode, 16, bArr2, 0, decode.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec("b972E8a5A4e0e8Ff".getBytes(Request.DEFAULT_CHARSET), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArr2), Request.DEFAULT_CHARSET);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m6114c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m6115d(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    private static String m6115d(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("b972E8a5A4e0e8Ff".getBytes(Request.DEFAULT_CHARSET), "AES");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(str.getBytes(Request.DEFAULT_CHARSET));
            byte[] bArr2 = new byte[doFinal.length + 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(doFinal, 0, bArr2, 16, doFinal.length);
            return Base64.encodeToString(bArr2, 0);
        } catch (Exception unused) {
            return "";
        }
    }
}
