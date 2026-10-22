package com.efs.sdk.base.core.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.efs.sdk.base.core.util.b */
/* loaded from: classes.dex */
public final class C1718b {
    /* renamed from: a */
    public static byte[] m7765a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            Log.m7727e("efs.base", "gzip error", e10);
            return null;
        }
    }
}
