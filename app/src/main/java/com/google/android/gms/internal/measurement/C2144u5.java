package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u5 */
/* loaded from: classes.dex */
public final class C2144u5 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2144u5(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = AbstractC2159v5.f8201e;
        atomicBoolean.set(true);
    }
}
