package p035c3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ne.AbstractC5868k;
import p359ue.C7149c;

/* renamed from: c3.f */
/* loaded from: classes.dex */
public final class C1351f {

    /* renamed from: a */
    public static final C1351f f5079a = new C1351f();

    private C1351f() {
    }

    /* renamed from: a */
    public final String m6121a(String str) {
        AbstractC5868k.m23674f(str, "str");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C7149c.f26829b);
            AbstractC5868k.m23673e(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            String str2 = "";
            AbstractC5868k.m23673e(digest, "bytes");
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return " ";
        } catch (Exception e11) {
            e11.printStackTrace();
            return " ";
        }
    }
}
