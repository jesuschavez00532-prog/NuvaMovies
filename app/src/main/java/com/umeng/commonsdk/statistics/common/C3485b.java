package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import anet.channel.entity.EventType;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: com.umeng.commonsdk.statistics.common.b */
/* loaded from: classes3.dex */
public class C3485b {

    /* renamed from: a */
    public static int f15424a;

    /* renamed from: a */
    public static byte[] m14829a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m14830a(str.getBytes(str2));
    }

    /* renamed from: b */
    public static byte[] m14831b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            Inflater inflater = new Inflater();
            int i10 = 0;
            inflater.setInput(bArr, 0, bArr.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[EventType.AUTH_FAIL];
            while (!inflater.needsInput()) {
                int inflate = inflater.inflate(bArr2);
                byteArrayOutputStream.write(bArr2, i10, inflate);
                i10 += inflate;
            }
            inflater.end();
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m14830a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f15424a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int deflate = deflater.deflate(bArr2);
                    f15424a += deflate;
                    byteArrayOutputStream2.write(bArr2, 0, deflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static String m14828a(byte[] bArr, String str) {
        byte[] m14831b = m14831b(bArr);
        if (m14831b != null) {
            return new String(m14831b, str);
        }
        return null;
    }
}
