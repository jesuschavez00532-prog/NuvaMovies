package p172i4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p219l4.AbstractBinderC5396o1;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;
import p325s4.BinderC6676b;
import p325s4.InterfaceC6675a;

/* renamed from: i4.l0 */
/* loaded from: classes.dex */
public final class C4875l0 extends AbstractC5593a {
    public static final Parcelable.Creator<C4875l0> CREATOR = new C4877m0();

    /* renamed from: a */
    private final String f20375a;

    /* renamed from: b */
    private final AbstractBinderC4857c0 f20376b;

    /* renamed from: c */
    private final boolean f20377c;

    /* renamed from: d */
    private final boolean f20378d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4875l0(String str, AbstractBinderC4857c0 abstractBinderC4857c0, boolean z10, boolean z11) {
        this.f20375a = str;
        this.f20376b = abstractBinderC4857c0;
        this.f20377c = z10;
        this.f20378d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 1, this.f20375a, false);
        AbstractBinderC4857c0 abstractBinderC4857c0 = this.f20376b;
        if (abstractBinderC4857c0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC4857c0 = null;
        }
        AbstractC5595c.m22740h(parcel, 2, abstractBinderC4857c0, false);
        AbstractC5595c.m22735c(parcel, 3, this.f20377c);
        AbstractC5595c.m22735c(parcel, 4, this.f20378d);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4875l0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f20375a = str;
        BinderC4859d0 binderC4859d0 = null;
        if (iBinder != null) {
            try {
                InterfaceC6675a mo20026g = AbstractBinderC5396o1.m21796c(iBinder).mo20026g();
                byte[] bArr = mo20026g == null ? null : (byte[]) BinderC6676b.m26054d(mo20026g);
                if (bArr != null) {
                    binderC4859d0 = new BinderC4859d0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f20376b = binderC4859d0;
        this.f20377c = z10;
        this.f20378d = z11;
    }
}
