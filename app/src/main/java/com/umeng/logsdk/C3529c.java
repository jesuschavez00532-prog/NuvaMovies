package com.umeng.logsdk;

import android.util.Base64;
import com.efs.sdk.base.core.util.Log;

/* renamed from: com.umeng.logsdk.c */
/* loaded from: classes3.dex */
public final class C3529c {
    /* renamed from: a */
    public static String m15154a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: b */
    public static String m15155b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            Log.m7727e("efs.base", "decode error", th);
            return "";
        }
    }
}
