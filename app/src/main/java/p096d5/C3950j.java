package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import p219l4.C5371g0;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: d5.j */
/* loaded from: classes.dex */
public final class C3950j extends AbstractC5593a {
    public static final Parcelable.Creator<C3950j> CREATOR = new C3951k();

    /* renamed from: a */
    final int f17626a;

    /* renamed from: b */
    final C5371g0 f17627b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3950j(int i10, C5371g0 c5371g0) {
        this.f17626a = i10;
        this.f17627b = c5371g0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f17626a);
        AbstractC5595c.m22745m(parcel, 2, this.f17627b, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
