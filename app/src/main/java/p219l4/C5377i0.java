package p219l4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4854b;
import p219l4.InterfaceC5376i;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.i0 */
/* loaded from: classes.dex */
public final class C5377i0 extends AbstractC5593a {
    public static final Parcelable.Creator<C5377i0> CREATOR = new C5380j0();

    /* renamed from: a */
    final int f21990a;

    /* renamed from: b */
    final IBinder f21991b;

    /* renamed from: c */
    private final C4854b f21992c;

    /* renamed from: d */
    private final boolean f21993d;

    /* renamed from: e */
    private final boolean f21994e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5377i0(int i10, IBinder iBinder, C4854b c4854b, boolean z10, boolean z11) {
        this.f21990a = i10;
        this.f21991b = iBinder;
        this.f21992c = c4854b;
        this.f21993d = z10;
        this.f21994e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5377i0)) {
            return false;
        }
        C5377i0 c5377i0 = (C5377i0) obj;
        if (!this.f21992c.equals(c5377i0.f21992c) || !AbstractC5388m.m21771a(m21749i(), c5377i0.m21749i())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C4854b m21748g() {
        return this.f21992c;
    }

    /* renamed from: i */
    public final InterfaceC5376i m21749i() {
        IBinder iBinder = this.f21991b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC5376i.a.m21747c(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f21990a);
        AbstractC5595c.m22740h(parcel, 2, this.f21991b, false);
        AbstractC5595c.m22745m(parcel, 3, this.f21992c, i10, false);
        AbstractC5595c.m22735c(parcel, 4, this.f21993d);
        AbstractC5595c.m22735c(parcel, 5, this.f21994e);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
