package com.google.android.gms.internal.measurement;

import anet.channel.request.Request;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.g9 */
/* loaded from: classes.dex */
public abstract class AbstractC1938g9 {

    /* renamed from: a */
    static final Charset f7765a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7766b = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: c */
    static final Charset f7767c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f7768d;

    /* renamed from: e */
    public static final ByteBuffer f7769e;

    /* renamed from: f */
    public static final AbstractC1937g8 f7770f;

    static {
        byte[] bArr = new byte[0];
        f7768d = bArr;
        f7769e = ByteBuffer.wrap(bArr);
        int i10 = AbstractC1937g8.f7764a;
        C1905e8 c1905e8 = new C1905e8(bArr, 0, 0, false, null);
        try {
            c1905e8.m8290c(0);
            f7770f = c1905e8;
        } catch (C1968i9 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: a */
    public static int m8414a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m8415b(byte[] bArr) {
        int length = bArr.length;
        int m8417d = m8417d(length, bArr, 0, length);
        if (m8417d == 0) {
            return 1;
        }
        return m8417d;
    }

    /* renamed from: c */
    public static int m8416c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m8417d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Object m8418e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object m8419f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Object m8420g(Object obj, Object obj2) {
        return ((InterfaceC1891da) obj).mo8249d().mo8191T((InterfaceC1891da) obj2).mo8190S();
    }

    /* renamed from: h */
    public static String m8421h(byte[] bArr) {
        return new String(bArr, f7766b);
    }

    /* renamed from: i */
    public static boolean m8422i(byte[] bArr) {
        return AbstractC2000kb.m8607e(bArr);
    }
}
