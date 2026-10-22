package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import p025b5.C1116n;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes.dex */
public final class RunnableC2428r6 implements Runnable {

    /* renamed from: a */
    private final URL f9033a;

    /* renamed from: b */
    private final String f9034b;

    /* renamed from: c */
    final /* synthetic */ C2439s6 f9035c;

    /* renamed from: d */
    private final C1116n f9036d;

    public RunnableC2428r6(C2439s6 c2439s6, String str, URL url, byte[] bArr, Map map, C1116n c1116n, byte[] bArr2) {
        this.f9035c = c2439s6;
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21783i(url);
        AbstractC5391n.m21783i(c1116n);
        this.f9033a = url;
        this.f9036d = c1116n;
        this.f9034b = str;
    }

    /* renamed from: b */
    private final void m10059b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f9035c.f8714a.mo9575a().m9897z(new Runnable() { // from class: com.google.android.gms.measurement.internal.q6
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2428r6.this.m10060a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m10060a(int i10, Exception exc, byte[] bArr, Map map) {
        C1116n c1116n = this.f9036d;
        c1116n.f4409a.m10037h(this.f9034b, i10, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.r6] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.s6 r0 = r9.f9035c
            r0.mo9668g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.s6 r2 = r9.f9035c     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.net.URL r3 = r9.f9033a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            if (r4 == 0) goto L7c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            com.google.android.gms.measurement.internal.q4 r4 = r2.f8714a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r4.m10051z()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            com.google.android.gms.measurement.internal.q4 r2 = r2.f8714a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2.m10051z()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L62
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L62
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L62
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L62
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.disconnect()
            r9.m10059b(r2, r1, r0, r4)
            return
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r6 = r1
        L66:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6c:
            r0 = move-exception
            goto L89
        L6e:
            r0 = move-exception
            goto L97
        L70:
            r0 = move-exception
            r4 = r1
            goto L89
        L73:
            r0 = move-exception
            r4 = r1
            goto L97
        L76:
            r2 = move-exception
            r4 = r1
            goto L87
        L79:
            r2 = move-exception
            r4 = r1
            goto L95
        L7c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
        L84:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L87:
            r0 = r2
            r2 = 0
        L89:
            if (r3 == 0) goto L8e
            r3.disconnect()
        L8e:
            r9.m10059b(r2, r1, r1, r4)
            throw r0
        L92:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L95:
            r0 = r2
            r2 = 0
        L97:
            if (r3 == 0) goto L9c
            r3.disconnect()
        L9c:
            r9.m10059b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC2428r6.run():void");
    }
}
