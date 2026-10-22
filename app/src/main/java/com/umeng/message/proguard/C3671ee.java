package com.umeng.message.proguard;

import anet.channel.entity.EventType;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.umeng.message.proguard.ee */
/* loaded from: classes3.dex */
public final class C3671ee {
    /* renamed from: a */
    public static void m15731a(byte[] bArr, OutputStream outputStream) {
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
                    C3668eb.m15722a(gZIPInputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            try {
                C3615ce.m15512d("unzip", th.getMessage());
            } finally {
                C3668eb.m15722a(gZIPInputStream2);
            }
        }
    }
}
