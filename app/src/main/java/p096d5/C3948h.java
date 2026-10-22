package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: d5.h */
/* loaded from: classes.dex */
public final class C3948h extends AbstractC5593a {
    public static final Parcelable.Creator<C3948h> CREATOR = new C3949i();

    /* renamed from: a */
    private final List f17624a;

    /* renamed from: b */
    private final String f17625b;

    public C3948h(List list, String str) {
        this.f17624a = list;
        this.f17625b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22747o(parcel, 1, this.f17624a, false);
        AbstractC5595c.m22746n(parcel, 2, this.f17625b, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
