package p155h4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h4.g */
/* loaded from: classes.dex */
final class C4527g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C4529i(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4529i[i10];
    }
}
