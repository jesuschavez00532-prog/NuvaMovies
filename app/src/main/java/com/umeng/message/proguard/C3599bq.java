package com.umeng.message.proguard;

import anet.channel.entity.EventType;
import com.umeng.message.common.UPLog;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.umeng.message.proguard.bq */
/* loaded from: classes3.dex */
public final class C3599bq {
    /* renamed from: a */
    public static void m15444a(byte[] bArr, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr);
            C3678f.m15748a(gZIPOutputStream);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                UPLog.m15197e("zip", th.getMessage());
            } finally {
                C3678f.m15748a(gZIPOutputStream2);
            }
        }
    }

    /* renamed from: b */
    public static void m15445b(byte[] bArr, OutputStream outputStream) {
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
                    C3678f.m15748a(gZIPInputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            try {
                UPLog.m15197e("unzip", th.getMessage());
            } finally {
                C3678f.m15748a(gZIPInputStream2);
            }
        }
    }
}
