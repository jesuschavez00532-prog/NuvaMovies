package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1887d6 {
    /* renamed from: a */
    public static Object m8247a(InterfaceC1903e6 interfaceC1903e6) {
        try {
            return interfaceC1903e6.mo8287a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1903e6.mo8287a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
