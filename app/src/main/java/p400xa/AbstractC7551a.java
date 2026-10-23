package p400xa;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p355u9.AbstractC7061a;

/* renamed from: xa.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7551a {
    /* renamed from: a */
    public static String m28931a(String str, String str2, IvParameterSpec ivParameterSpec) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), ivParameterSpec);
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

    /* renamed from: b */
    public static IvParameterSpec m28932b() {
        return new IvParameterSpec("2c6b361ee550e80c".getBytes());
    }
}
