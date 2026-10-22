package com.umeng.message.proguard;

import java.io.Closeable;

/* renamed from: com.umeng.message.proguard.eb */
/* loaded from: classes3.dex */
public final class C3668eb {
    /* renamed from: a */
    public static void m15722a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
