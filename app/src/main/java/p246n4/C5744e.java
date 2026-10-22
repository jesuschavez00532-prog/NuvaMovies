package p246n4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p172i4.C4858d;
import p203k4.InterfaceC5106c;
import p203k4.InterfaceC5111h;
import p219l4.AbstractC5370g;
import p219l4.C5361d;
import p219l4.C5408u;
import p365v4.AbstractC7205d;

/* renamed from: n4.e */
/* loaded from: classes.dex */
public final class C5744e extends AbstractC5370g {

    /* renamed from: I */
    private final C5408u f23053I;

    public C5744e(Context context, Looper looper, C5361d c5361d, C5408u c5408u, InterfaceC5106c interfaceC5106c, InterfaceC5111h interfaceC5111h) {
        super(context, looper, 270, c5361d, interfaceC5106c, interfaceC5111h);
        this.f23053I = c5408u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5358c
    /* renamed from: D */
    public final String mo9656D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: E */
    protected final String mo9657E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: H */
    protected final boolean mo21666H() {
        return true;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: i */
    public final int mo9658i() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5358c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo9659r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C5740a) {
            return (C5740a) queryLocalInterface;
        }
        return new C5740a(iBinder);
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: u */
    public final C4858d[] mo21693u() {
        return AbstractC7205d.f26974b;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: z */
    protected final Bundle mo16775z() {
        return this.f23053I.m21814b();
    }
}
