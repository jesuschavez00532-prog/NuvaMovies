package com.efs.sdk.net.p057a.p058a;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.efs.sdk.net.a.a.i */
/* loaded from: classes.dex */
public final class C1764i {
    /* renamed from: a */
    public static void m7858a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
