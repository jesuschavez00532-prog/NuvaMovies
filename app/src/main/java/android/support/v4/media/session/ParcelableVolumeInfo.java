package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0268a();

    /* renamed from: a */
    public int f793a;

    /* renamed from: b */
    public int f794b;

    /* renamed from: c */
    public int f795c;

    /* renamed from: d */
    public int f796d;

    /* renamed from: e */
    public int f797e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    class C0268a implements Parcelable.Creator {
        C0268a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f793a = parcel.readInt();
        this.f795c = parcel.readInt();
        this.f796d = parcel.readInt();
        this.f797e = parcel.readInt();
        this.f794b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f793a);
        parcel.writeInt(this.f795c);
        parcel.writeInt(this.f796d);
        parcel.writeInt(this.f797e);
        parcel.writeInt(this.f794b);
    }
}
