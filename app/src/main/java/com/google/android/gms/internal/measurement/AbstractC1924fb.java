package com.google.android.gms.internal.measurement;

import com.taobao.accs.data.Message;
import com.umeng.analytics.pro.C3373dn;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* loaded from: classes.dex */
abstract class AbstractC1924fb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m8392a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!m8396e(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !m8396e(b12) && !m8396e(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & Message.EXT_HEADER_VALUE_MAX_LEN) + 56320);
            return;
        }
        throw C1968i9.m8528c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m8393b(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!m8396e(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!m8396e(b12)) {
                cArr[i10] = (char) (((b10 & C3373dn.f14525m) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw C1968i9.m8528c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m8394c(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !m8396e(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw C1968i9.m8528c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m8395d(byte b10) {
        return b10 >= 0;
    }

    /* renamed from: e */
    private static boolean m8396e(byte b10) {
        return b10 > -65;
    }
}
