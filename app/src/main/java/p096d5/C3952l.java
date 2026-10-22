package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4854b;
import p219l4.C5377i0;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: d5.l */
/* loaded from: classes.dex */
public final class C3952l extends AbstractC5593a {
    public static final Parcelable.Creator<C3952l> CREATOR = new C3953m();

    /* renamed from: a */
    final int f17628a;

    /* renamed from: b */
    private final C4854b f17629b;

    /* renamed from: c */
    private final C5377i0 f17630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3952l(int i10, C4854b c4854b, C5377i0 c5377i0) {
        this.f17628a = i10;
        this.f17629b = c4854b;
        this.f17630c = c5377i0;
    }

    /* renamed from: g */
    public final C4854b m16779g() {
        return this.f17629b;
    }

    /* renamed from: i */
    public final C5377i0 m16780i() {
        return this.f17630c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f17628a);
        AbstractC5595c.m22745m(parcel, 2, this.f17629b, i10, false);
        AbstractC5595c.m22745m(parcel, 3, this.f17630c, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
