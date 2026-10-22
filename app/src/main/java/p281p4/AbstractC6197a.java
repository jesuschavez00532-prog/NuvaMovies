package p281p4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p310r4.C6534e;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public abstract class AbstractC6197a {
    /* renamed from: a */
    public static byte[] m24741a(Context context, String str) {
        MessageDigest m24742b;
        PackageInfo m25567e = C6534e.m25570a(context).m25567e(str, 64);
        Signature[] signatureArr = m25567e.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (m24742b = m24742b("SHA1")) != null) {
            return m24742b.digest(m25567e.signatures[0].toByteArray());
        }
        return null;
    }

    /* renamed from: b */
    public static MessageDigest m24742b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
