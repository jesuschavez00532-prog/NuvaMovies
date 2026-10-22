package cc;

import android.text.TextUtils;
import com.umeng.analytics.pro.C3309bd;
import ne.AbstractC5868k;
import p201k2.AbstractC5092i;

/* renamed from: cc.k0 */
/* loaded from: classes.dex */
public final class C1462k0 {

    /* renamed from: a */
    public static final C1462k0 f5614a;

    /* renamed from: b */
    private static final String f5615b;

    /* renamed from: c */
    private static String f5616c;

    /* renamed from: d */
    private static String f5617d;

    /* renamed from: e */
    private static boolean f5618e;

    /* renamed from: f */
    private static String f5619f;

    static {
        C1462k0 c1462k0 = new C1462k0();
        f5614a = c1462k0;
        f5615b = c1462k0.getClass().getSimpleName();
        f5616c = "";
        f5617d = "";
        f5619f = "";
    }

    private C1462k0() {
    }

    /* renamed from: a */
    private final char m6814a(int i10) {
        if (i10 < 0 || i10 > 255) {
            return (char) 0;
        }
        return (char) i10;
    }

    /* renamed from: e */
    private final String m6815e(String str) {
        String str2 = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            StringBuilder sb2 = new StringBuilder();
            int i12 = i10 + 1;
            String substring = str.substring(i10, i12);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            i10 += 2;
            String substring2 = str.substring(i12, i10);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring2);
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                i11 = Integer.parseInt(sb3, 16);
            }
            str2 = str2 + m6814a(i11);
        }
        return str2;
    }

    /* renamed from: b */
    public final String m6816b(String str) {
        AbstractC5868k.m23674f(str, "str");
        char[] charArray = str.toCharArray();
        AbstractC5868k.m23673e(charArray, "this as java.lang.String).toCharArray()");
        StringBuffer stringBuffer = new StringBuffer();
        for (char c10 : charArray) {
            stringBuffer.append(Integer.toHexString(c10));
        }
        String stringBuffer2 = stringBuffer.toString();
        AbstractC5868k.m23673e(stringBuffer2, "hex.toString()");
        return stringBuffer2;
    }

    /* renamed from: c */
    public final String m6817c(String str, String str2) {
        AbstractC5868k.m23674f(str, C3309bd.f14106m);
        AbstractC5868k.m23674f(str2, "pwd");
        String m6816b = m6816b(str);
        String m20666a = AbstractC5092i.m20666a(str2);
        AbstractC5868k.m23673e(m20666a, "encryptpwd");
        String m20666a2 = AbstractC5092i.m20666a(m6815e(m20666a) + m6816b);
        AbstractC5868k.m23673e(m20666a2, "MD5(hexchar2bin_encryptpwd + userto16)");
        return m20666a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair m6818d() {
        /*
            r13 = this;
            java.lang.String r0 = "helloVersion"
            java.lang.String r1 = ""
            java.lang.String r2 = cc.C1462k0.f5617d     // Catch: java.lang.Exception -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc5
            r3 = 1
            java.lang.String r4 = "v3"
            if (r2 != 0) goto L2c
            java.lang.String r2 = cc.C1462k0.f5616c     // Catch: java.lang.Exception -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc5
            if (r2 != 0) goto L2c
            java.lang.String r0 = cc.C1462k0.f5617d     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = cc.C1462k0.f5616c     // Catch: java.lang.Exception -> L29
            boolean r2 = ne.AbstractC5868k.m23669a(r1, r4)     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto Lc7
            boolean r2 = cc.C1462k0.f5618e     // Catch: java.lang.Exception -> L29
            if (r2 != 0) goto Lc7
            cc.C1462k0.f5618e = r3     // Catch: java.lang.Exception -> L29
            goto Lc7
        L29:
            goto Lc7
        L2c:
            java.lang.String r2 = nf.AbstractC5883a.m23715a()     // Catch: java.lang.Exception -> Lc5
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc5
            if (r5 != 0) goto Lc3
            int r5 = r2.length()     // Catch: java.lang.Exception -> Lc5
            r6 = 4
            if (r5 <= r6) goto Lc3
            ne.AbstractC5868k.m23673e(r2, r0)     // Catch: java.lang.Exception -> Lc5
            int r5 = r2.length()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r7 = r2.substring(r6, r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            ne.AbstractC5868k.m23673e(r7, r2)     // Catch: java.lang.Exception -> Lc5
            ne.AbstractC5868k.m23673e(r7, r0)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "."
            java.lang.String r9 = ""
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r0 = p359ue.AbstractC7157k.m27708o(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lc5
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> Lc5
            r2 = 100
            if (r0 <= r2) goto Lc3
            nf.b r2 = new nf.b     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = nf.C5884b.m23716a()     // Catch: java.lang.Exception -> Lc5
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lc5
            if (r6 != 0) goto L8c
            java.lang.String r2 = "authenticationInfo"
            ne.AbstractC5868k.m23673e(r5, r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = "v2"
            r2 = 104(0x68, float:1.46E-43)
            if (r0 <= r2) goto L83
            cc.C1462k0.f5618e = r3     // Catch: java.lang.Exception -> L80
            goto L87
        L80:
            r1 = r4
            goto L8a
        L83:
            r0 = 0
            cc.C1462k0.f5618e = r0     // Catch: java.lang.Exception -> L89
            r4 = r1
        L87:
            r1 = r5
            goto Lc9
        L89:
        L8a:
            r0 = r5
            goto Lc7
        L8c:
            nf.b$a r0 = r2.m23719d()     // Catch: java.lang.Exception -> Lc5
            if (r0 == 0) goto Lc3
            nf.b$a r0 = r2.m23719d()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r0.f23416a     // Catch: java.lang.Exception -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc5
            if (r2 != 0) goto Lc3
            java.lang.String r2 = r0.f23417b     // Catch: java.lang.Exception -> Lc5
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lc5
            if (r2 != 0) goto Lc3
            java.lang.String r2 = r0.f23416a     // Catch: java.lang.Exception -> Lc5
            java.lang.String r0 = r0.f23417b     // Catch: java.lang.Exception -> Lc5
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lc5
            if (r3 == 0) goto Lc3
            cc.k0 r3 = cc.C1462k0.f5614a     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = "user"
            ne.AbstractC5868k.m23673e(r2, r4)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r4 = "pwd"
            ne.AbstractC5868k.m23673e(r0, r4)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r0 = r3.m6817c(r2, r0)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = "v1"
            goto Lc7
        Lc3:
            r4 = r1
            goto Lc9
        Lc5:
            r0 = r1
        Lc7:
            r4 = r1
            r1 = r0
        Lc9:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld2
            java.lang.String r0 = "unknown"
            goto Lda
        Ld2:
            java.lang.CharSequence r0 = p359ue.AbstractC7157k.m27699b0(r1)
            java.lang.String r0 = r0.toString()
        Lda:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1462k0.m6818d():android.util.Pair");
    }

    /* renamed from: f */
    public final boolean m6819f() {
        return f5618e;
    }
}
