package p219l4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4858d;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.z0 */
/* loaded from: classes.dex */
public final class C5419z0 extends AbstractC5593a {
    public static final Parcelable.Creator<C5419z0> CREATOR = new C5354a1();

    /* renamed from: a */
    Bundle f22058a;

    /* renamed from: b */
    C4858d[] f22059b;

    /* renamed from: c */
    int f22060c;

    /* renamed from: d */
    C5364e f22061d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5419z0(Bundle bundle, C4858d[] c4858dArr, int i10, C5364e c5364e) {
        this.f22058a = bundle;
        this.f22059b = c4858dArr;
        this.f22060c = i10;
        this.f22061d = c5364e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22737e(parcel, 1, this.f22058a, false);
        AbstractC5595c.m22748p(parcel, 2, this.f22059b, i10, false);
        AbstractC5595c.m22741i(parcel, 3, this.f22060c);
        AbstractC5595c.m22745m(parcel, 4, this.f22061d, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
