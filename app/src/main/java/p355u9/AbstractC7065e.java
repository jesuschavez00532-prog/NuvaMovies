package p355u9;

import anet.channel.entity.EventType;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.android.agoo.message.MessageService;

/* renamed from: u9.e */
/* loaded from: classes2.dex */
public abstract class AbstractC7065e {
    /* renamed from: a */
    public static String m27226a(byte[] bArr) {
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
    public static String m27227b(File file) throws java.io.IOException {
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
                    return m27226a(messageDigest.digest());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m27228c(String str) {
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest((str + "cloudstream").getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = MessageService.MSG_DB_READY_REPORT + hexString;
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
