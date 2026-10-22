package p201k2;

import anet.channel.entity.EventType;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import org.android.agoo.message.MessageService;

/* renamed from: k2.i */
/* loaded from: classes.dex */
public abstract class AbstractC5092i {
    /* renamed from: a */
    public static String m20666a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i10 = 0; i10 < charArray.length; i10++) {
                bArr[i10] = (byte) charArray[i10];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : digest) {
                int i11 = b10 & 255;
                if (i11 < 16) {
                    stringBuffer.append(MessageService.MSG_DB_READY_REPORT);
                }
                stringBuffer.append(Integer.toHexString(i11));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m20667b(byte[] bArr) {
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

    /* renamed from: c */
    public static String m20668c(File file) {
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
                    return m20667b(messageDigest.digest());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
