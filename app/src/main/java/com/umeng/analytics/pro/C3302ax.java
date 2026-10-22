package com.umeng.analytics.pro;

import anet.channel.entity.EventType;
import com.umeng.commonsdk.debug.UMRTLog;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.umeng.analytics.pro.ax */
/* loaded from: classes3.dex */
public class C3302ax {
    /* renamed from: a */
    public static byte[] m13817a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public static void m13818b(byte[] bArr, OutputStream outputStream) {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr2 = new byte[EventType.AUTH_FAIL];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    outputStream.write(bArr2, 0, read);
                } else {
                    C3297as.m13798a(gZIPInputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            try {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "unGzip error: " + th.getMessage());
            } finally {
                C3297as.m13798a(gZIPInputStream2);
            }
        }
    }

    /* renamed from: a */
    public static void m13816a(byte[] bArr, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr);
            C3297as.m13798a(gZIPOutputStream);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "gzip error: " + th.getMessage());
            } finally {
                C3297as.m13798a(gZIPOutputStream2);
            }
        }
    }
}
