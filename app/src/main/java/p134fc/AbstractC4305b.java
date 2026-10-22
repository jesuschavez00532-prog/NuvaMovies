package p134fc;

import anet.channel.request.Request;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import p103dc.C4091a;
import p103dc.C4092b;

/* renamed from: fc.b */
/* loaded from: classes.dex */
public abstract class AbstractC4305b {

    /* renamed from: a */
    public static String f18742a = "2b494e53756c664c2f44465245733572";

    /* renamed from: a */
    public static String m18076a(String str, String str2) {
        byte[] m17432e = new C4091a().m17432e(AbstractC4304a.m18074b(str));
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(new C4091a().m17432e(str2)));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(2, generateSecret);
        return new String(cipher.doFinal(m17432e), Request.DEFAULT_CHARSET);
    }

    /* renamed from: b */
    public static String m18077b(String str, String str2) {
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(new C4091a().m17432e(str2)));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(1, generateSecret);
        return AbstractC4304a.m18075c(new C4092b().m17438c(cipher.doFinal(str.getBytes(Request.DEFAULT_CHARSET))).replaceAll("\r", "").replaceAll("\n", ""));
    }

    /* renamed from: c */
    public static void m18078c(String str) {
        f18742a = str;
    }
}
