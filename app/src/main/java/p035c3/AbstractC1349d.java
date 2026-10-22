package p035c3;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c3.d */
/* loaded from: classes.dex */
public abstract class AbstractC1349d {

    /* renamed from: a */
    public static String f5077a = "okwVTyAW";

    /* renamed from: a */
    public static String m6118a(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "DES"));
            try {
                return AbstractC1347b.m6116a(cipher.doFinal(str.getBytes()));
            } catch (BadPaddingException e10) {
                e10.printStackTrace();
                throw new Exception("BadPaddingException", e10);
            } catch (IllegalBlockSizeException e11) {
                e11.printStackTrace();
                throw new Exception("IllegalBlockSizeException", e11);
            }
        } catch (InvalidKeyException e12) {
            e12.printStackTrace();
            throw new Exception("InvalidKeyException", e12);
        } catch (NoSuchAlgorithmException e13) {
            e13.printStackTrace();
            throw new Exception("NoSuchAlgorithmException", e13);
        } catch (NoSuchPaddingException e14) {
            e14.printStackTrace();
            throw new Exception("NoSuchPaddingException", e14);
        }
    }
}
