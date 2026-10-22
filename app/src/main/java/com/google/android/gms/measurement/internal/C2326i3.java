package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p025b5.InterfaceC1106f;
import p172i4.AbstractC4884q;
import p219l4.AbstractC5358c;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* loaded from: classes.dex */
public final class C2326i3 extends AbstractC5358c {
    public C2326i3(Context context, Looper looper, AbstractC5358c.a aVar, AbstractC5358c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5358c
    /* renamed from: D */
    public final String mo9656D() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: E */
    protected final String mo9657E() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: i */
    public final int mo9658i() {
        return AbstractC4884q.f20380a;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo9659r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC1106f) {
            return (InterfaceC1106f) queryLocalInterface;
        }
        return new C2271d3(iBinder);
    }
}
