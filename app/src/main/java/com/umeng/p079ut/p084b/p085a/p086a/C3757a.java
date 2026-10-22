package com.umeng.p079ut.p084b.p085a.p086a;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.ut.b.a.a.a */
/* loaded from: classes3.dex */
public class C3757a {

    /* renamed from: d */
    static final /* synthetic */ boolean f16796d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.ut.b.a.a.a$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a */
        public byte[] f16797a;

        /* renamed from: b */
        public int f16798b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.ut.b.a.a.a$b */
    /* loaded from: classes3.dex */
    public static class b extends a {

        /* renamed from: b */
        private static final byte[] f16799b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: c */
        private static final byte[] f16800c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: d */
        static final /* synthetic */ boolean f16801d = true;

        /* renamed from: c */
        int f16802c;
        private int count;

        /* renamed from: d */
        private final byte[] f16803d;

        /* renamed from: e */
        public final boolean f16804e;

        /* renamed from: e */
        private final byte[] f16805e;

        /* renamed from: f */
        public final boolean f16806f;

        /* renamed from: g */
        public final boolean f16807g;

        public b(int i10, byte[] bArr) {
            boolean z10;
            boolean z11;
            byte[] bArr2;
            int i11;
            this.f16797a = bArr;
            if ((i10 & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16804e = z10;
            if ((i10 & 2) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16806f = z11;
            this.f16807g = (i10 & 4) != 0;
            if ((i10 & 8) == 0) {
                bArr2 = f16799b;
            } else {
                bArr2 = f16800c;
            }
            this.f16805e = bArr2;
            this.f16803d = new byte[2];
            this.f16802c = 0;
            if (z11) {
                i11 = 19;
            } else {
                i11 = -1;
            }
            this.count = i11;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m15963a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.p079ut.p084b.p085a.p086a.C3757a.b.m15963a(byte[], int, int, boolean):boolean");
        }
    }

    private C3757a() {
    }

    /* renamed from: a */
    public static String m15960a(byte[] bArr, int i10) {
        try {
            return new String(m15961a(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: a */
    public static byte[] m15961a(byte[] bArr, int i10) {
        return m15962a(bArr, 0, bArr.length, i10);
    }

    @SuppressLint({"Assert"})
    /* renamed from: a */
    public static byte[] m15962a(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, null);
        int i13 = (i11 / 3) * 4;
        if (bVar.f16804e) {
            if (i11 % 3 > 0) {
                i13 += 4;
            }
        } else {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        }
        if (bVar.f16806f && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (bVar.f16807g ? 2 : 1);
        }
        bVar.f16797a = new byte[i13];
        bVar.m15963a(bArr, i10, i11, true);
        if (f16796d || bVar.f16798b == i13) {
            return bVar.f16797a;
        }
        throw new AssertionError();
    }
}
