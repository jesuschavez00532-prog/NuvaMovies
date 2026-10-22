package p155h4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: h4.a */
/* loaded from: classes.dex */
public final class C4516a extends AbstractC5593a {
    public static final Parcelable.Creator<C4516a> CREATOR = new C4524e();

    /* renamed from: a */
    Intent f19537a;

    public C4516a(Intent intent) {
        this.f19537a = intent;
    }

    /* renamed from: g */
    public Intent m18905g() {
        return this.f19537a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22745m(parcel, 1, this.f19537a, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
