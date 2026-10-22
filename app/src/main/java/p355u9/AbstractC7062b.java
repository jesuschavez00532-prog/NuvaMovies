package p355u9;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: u9.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7062b {
    /* renamed from: a */
    public static String m27213a(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "DES"));
            try {
                return AbstractC7061a.m27212a(cipher.doFinal(str.getBytes()));
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
