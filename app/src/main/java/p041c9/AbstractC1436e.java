package p041c9;

import anet.channel.request.Request;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: c9.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1436e {
    /* renamed from: a */
    public static byte[] m6693a(File file, int i10) {
        ByteBuffer byteBuffer;
        Map m6694b = m6694b(file);
        if (m6694b == null || (byteBuffer = (ByteBuffer) m6694b.get(Integer.valueOf(i10))) == null) {
            return null;
        }
        return m6695c(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r1 == null) goto L31;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map m6694b(java.io.File r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L3a
            java.lang.String r2 = "r"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L3a
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            c9.d r2 = p041c9.AbstractC1432a.m6679b(r3)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.lang.Object r2 = r2.m6692a()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.util.Map r0 = p041c9.AbstractC1432a.m6683f(r2)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L46
        L1f:
            r1.close()     // Catch: java.lang.Throwable -> L46
            goto L46
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r0
            goto L2d
        L28:
            r3 = r0
            goto L3c
        L2a:
            r2 = move-exception
            r3 = r0
            r1 = r3
        L2d:
            if (r3 == 0) goto L34
            r3.close()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L46
            goto L34
        L33:
        L34:
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L46
        L39:
            throw r2     // Catch: java.lang.Throwable -> L46
        L3a:
            r3 = r0
            r1 = r3
        L3c:
            if (r3 == 0) goto L43
            r3.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L46
            goto L43
        L42:
        L43:
            if (r1 == 0) goto L46
            goto L1f
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p041c9.AbstractC1436e.m6694b(java.io.File):java.util.Map");
    }

    /* renamed from: c */
    private static byte[] m6695c(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, arrayOffset + byteBuffer.limit());
    }

    /* renamed from: d */
    public static String m6696d(File file, int i10) {
        byte[] m6693a = m6693a(file, i10);
        if (m6693a == null) {
            return null;
        }
        try {
            return new String(m6693a, Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
