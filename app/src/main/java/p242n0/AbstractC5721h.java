package p242n0;

import anet.channel.entity.EventType;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.android.agoo.message.MessageService;

/* renamed from: n0.h */
/* loaded from: classes.dex */
public abstract class AbstractC5721h {
    /* renamed from: a */
    public static String m23114a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder("");
        if (bArr != null && bArr.length > 0) {
            for (byte b10 : bArr) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() < 2) {
                    sb2.append(0);
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: b */
    public static String m23115b(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[EventType.AUTH_FAIL];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, EventType.AUTH_FAIL);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return m23114a(messageDigest.digest());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m23116c(String str, String str2) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest((str + str2).getBytes());
            String str3 = "";
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = MessageService.MSG_DB_READY_REPORT + hexString;
                }
                str3 = str3 + hexString;
            }
            return str3;
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return " ";
        } catch (Exception e11) {
            e11.printStackTrace();
            return " ";
        }
    }
}
