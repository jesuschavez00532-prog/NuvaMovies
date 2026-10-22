package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes.dex */
public final class C2256c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2256c(Context context) {
    }

    /* renamed from: a */
    public static final boolean m9513a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
