package org.xutils.common.util;

import anet.channel.request.Request;
import com.umeng.analytics.pro.C3373dn;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class MD5 {
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private MD5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String md5(File file) {
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileChannel2 = fileInputStream.getChannel();
                messageDigest.update(fileChannel2.map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                byte[] digest = messageDigest.digest();
                IOUtil.closeQuietly(fileInputStream);
                IOUtil.closeQuietly(fileChannel2);
                return toHexString(digest);
            } catch (NoSuchAlgorithmException e10) {
                e = e10;
                fileChannel = fileChannel2;
                fileChannel2 = fileInputStream;
                try {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    IOUtil.closeQuietly(fileChannel2);
                    IOUtil.closeQuietly(fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = fileChannel2;
                fileChannel2 = fileInputStream;
                IOUtil.closeQuietly(fileChannel2);
                IOUtil.closeQuietly(fileChannel);
                throw th;
            }
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            fileChannel = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = hexDigits;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & C3373dn.f14525m]);
        }
        return sb2.toString();
    }

    public static String md5(String str) {
        try {
            return toHexString(MessageDigest.getInstance("MD5").digest(str.getBytes(Request.DEFAULT_CHARSET)));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        }
    }
}
