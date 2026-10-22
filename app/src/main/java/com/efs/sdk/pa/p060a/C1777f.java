package com.efs.sdk.pa.p060a;

import android.util.Log;
import com.efs.sdk.pa.C1779b;
import com.efs.sdk.pa.PAMsgListener;
import java.io.BufferedOutputStream;

/* renamed from: com.efs.sdk.pa.a.f */
/* loaded from: classes.dex */
final class C1777f implements InterfaceC1775d {

    /* renamed from: a */
    PAMsgListener f7464a;

    /* renamed from: b */
    boolean f7465b;

    /* renamed from: c */
    String f7466c;

    /* renamed from: d */
    BufferedOutputStream f7467d;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:7:0x000f, B:11:0x001c, B:13:0x0022, B:14:0x002c, B:17:0x0036, B:19:0x003c, B:22:0x0048, B:25:0x0052, B:26:0x007f, B:28:0x0089, B:30:0x008f, B:32:0x0095, B:34:0x009d, B:35:0x00a5, B:40:0x0057, B:42:0x005d, B:44:0x0063, B:47:0x006f, B:50:0x0079), top: B:6:0x000f }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.efs.sdk.pa.C1779b m7869b(java.lang.String r9, long r10, long r12) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "{"
            java.lang.String r2 = "("
            r3 = 0
            if (r9 != 0) goto La
            return r3
        La:
            com.efs.sdk.pa.b r4 = new com.efs.sdk.pa.b
            r4.<init>()
            java.lang.String r5 = ":"
            int r5 = r9.indexOf(r5)     // Catch: java.lang.Exception -> Lac
            java.lang.String r6 = ""
            r7 = -1
            if (r5 == r7) goto L2b
            int r5 = r5 + 2
            int r8 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r5 >= r8) goto L2b
            int r8 = r9.length()     // Catch: java.lang.Exception -> Lac
            java.lang.String r5 = r9.substring(r5, r8)     // Catch: java.lang.Exception -> Lac
            goto L2c
        L2b:
            r5 = r6
        L2c:
            r4.f7471a = r5     // Catch: java.lang.Exception -> Lac
            boolean r5 = r9.contains(r2)     // Catch: java.lang.Exception -> Lac
            java.lang.String r8 = "}"
            if (r5 == 0) goto L57
            boolean r5 = r9.contains(r0)     // Catch: java.lang.Exception -> Lac
            if (r5 == 0) goto L57
            int r1 = r9.indexOf(r2)     // Catch: java.lang.Exception -> Lac
            int r0 = r9.indexOf(r0)     // Catch: java.lang.Exception -> Lac
            if (r1 == r7) goto L7e
            if (r0 == r7) goto L7e
            int r1 = r1 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r1 >= r2) goto L7e
            if (r0 <= r1) goto L7e
            java.lang.String r0 = r9.substring(r1, r0)     // Catch: java.lang.Exception -> Lac
            goto L7f
        L57:
            boolean r0 = r9.contains(r1)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L7e
            boolean r0 = r9.contains(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L7e
            int r0 = r9.indexOf(r1)     // Catch: java.lang.Exception -> Lac
            int r1 = r9.indexOf(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == r7) goto L7e
            if (r1 == r7) goto L7e
            int r0 = r0 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r0 >= r2) goto L7e
            if (r1 <= r0) goto L7e
            java.lang.String r0 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> Lac
            goto L7f
        L7e:
            r0 = r6
        L7f:
            r4.f7472b = r0     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "null"
            boolean r0 = r9.contains(r0)     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto La5
            boolean r0 = r9.contains(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto La5
            int r0 = r9.lastIndexOf(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == r7) goto La5
            int r0 = r0 + 1
            int r1 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r0 >= r1) goto La5
            int r1 = r9.length()     // Catch: java.lang.Exception -> Lac
            java.lang.String r6 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> Lac
        La5:
            r4.f7473c = r6     // Catch: java.lang.Exception -> Lac
            r4.f7474d = r10
            r4.f7475e = r12
            return r4
        Lac:
            r9 = move-exception
            r9.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.pa.p060a.C1777f.m7869b(java.lang.String, long, long):com.efs.sdk.pa.b");
    }

    @Override // com.efs.sdk.pa.p060a.InterfaceC1775d
    /* renamed from: a */
    public final void mo7868a(String str, long j10, long j11) {
        C1779b m7869b = m7869b(str, j10, j11);
        if (m7869b != null) {
            if (this.f7465b) {
                Log.e("PerformanceAnalyze", m7869b.toString());
            }
            if (this.f7466c != null) {
                try {
                    this.f7467d.write((m7869b.toString() + "\n").getBytes());
                } catch (Exception unused) {
                }
            }
            this.f7464a.msg(m7869b);
        }
    }
}
