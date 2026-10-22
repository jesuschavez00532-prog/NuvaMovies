package org.xutils.common.util;

import android.database.Cursor;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import anet.channel.request.Request;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* loaded from: classes3.dex */
public class IOUtil {
    private IOUtil() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                LogUtil.m24374d(th.getMessage(), th);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        byte[] bArr = new byte[EventType.AUTH_FAIL];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    public static boolean deleteFileOrDir(File file) {
        return FileUtil.deleteFileOrDir(file);
    }

    public static byte[] readBytes(InputStream inputStream) {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[EventType.AUTH_FAIL];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        closeQuietly(byteArrayOutputStream2);
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                closeQuietly(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String readStr(InputStream inputStream) {
        return readStr(inputStream, Request.DEFAULT_CHARSET);
    }

    public static void writeStr(OutputStream outputStream, String str) {
        writeStr(outputStream, str, Request.DEFAULT_CHARSET);
    }

    public static String readStr(InputStream inputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            str = Request.DEFAULT_CHARSET;
        }
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = new char[EventType.AUTH_FAIL];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read >= 0) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    public static void writeStr(OutputStream outputStream, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = Request.DEFAULT_CHARSET;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
    }

    public static void closeQuietly(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                LogUtil.m24374d(th.getMessage(), th);
            }
        }
    }

    public static byte[] readBytes(InputStream inputStream, long j10, int i10) {
        if (j10 > 0) {
            while (j10 > 0) {
                long skip = inputStream.skip(j10);
                if (skip <= 0) {
                    break;
                }
                j10 -= skip;
            }
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) inputStream.read();
        }
        return bArr;
    }
}
