package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* loaded from: classes.dex */
public final class BinderC1882d1 extends AbstractBinderC1975j1 {

    /* renamed from: a */
    private final AtomicReference f7700a = new AtomicReference();

    /* renamed from: b */
    private boolean f7701b;

    /* renamed from: M */
    public static final Object m8199M(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1990k1
    /* renamed from: b */
    public final void mo8200b(Bundle bundle) {
        synchronized (this.f7700a) {
            try {
                this.f7700a.set(bundle);
                this.f7701b = true;
            } finally {
                this.f7700a.notify();
            }
        }
    }

    /* renamed from: c */
    public final Bundle m8201c(long j10) {
        Bundle bundle;
        synchronized (this.f7700a) {
            if (!this.f7701b) {
                try {
                    this.f7700a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f7700a.get();
        }
        return bundle;
    }

    /* renamed from: d */
    public final String m8202d(long j10) {
        return (String) m8199M(m8201c(j10), String.class);
    }
}
