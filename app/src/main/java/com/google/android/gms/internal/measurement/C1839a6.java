package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* loaded from: classes.dex */
final class C1839a6 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C1855b6 f7651a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839a6(C1855b6 c1855b6, Handler handler) {
        super(null);
        this.f7651a = c1855b6;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f7651a.m8139f();
    }
}
