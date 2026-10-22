package cc;

import com.umeng.analytics.pro.C3373dn;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* renamed from: cc.i */
/* loaded from: classes.dex */
public abstract class AbstractC1457i {

    /* renamed from: a */
    private static final char[] f5599a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    public static String f5600b = "==RiXVKU";

    /* renamed from: c */
    public static String f5601c = "dCsPLwiy";

    /* renamed from: d */
    private static byte[] f5602d = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public static String m6793a(byte[] bArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            char[] cArr = f5599a;
            sb2.append(cArr[(bArr[i11] & 255) >> 4]);
            sb2.append(cArr[bArr[i11] & C3373dn.f14525m]);
        }
        return sb2.toString().trim().toUpperCase(Locale.US);
    }

    /* renamed from: b */
    public static byte[] m6794b(byte[] bArr, String str) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(1, generateSecret, secureRandom);
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m6795c(String str, String str2) {
        try {
            byte[] m6794b = m6794b(str.getBytes("utf-8"), str2);
            return m6793a(m6794b, m6794b.length);
        } catch (Exception unused) {
            return "";
        }
    }
}
