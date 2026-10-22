package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
/* loaded from: classes.dex */
public final class C2005l1 extends AbstractC2049o0 implements InterfaceC2035n1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2005l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2035n1
    /* renamed from: g */
    public final int mo8611g() {
        Parcel m8746M = m8746M(2, m8748d());
        int readInt = m8746M.readInt();
        m8746M.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2035n1
    /* renamed from: h */
    public final void mo8612h(String str, String str2, Bundle bundle, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8778e(m8748d, bundle);
        m8748d.writeLong(j10);
        m8747N(1, m8748d);
    }
}
