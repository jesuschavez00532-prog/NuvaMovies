package p201k2;

import android.text.TextUtils;
import android.util.Base64;
import anet.channel.request.Request;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: k2.a */
/* loaded from: classes.dex */
public abstract class AbstractC5084a {
    /* renamed from: a */
    public static String m20589a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m20590b(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m20590b(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("ntFT65w6itH!lHCP".getBytes(Request.DEFAULT_CHARSET), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(Request.DEFAULT_CHARSET)), 0);
        } catch (Exception unused) {
            return "";
        }
    }
}
