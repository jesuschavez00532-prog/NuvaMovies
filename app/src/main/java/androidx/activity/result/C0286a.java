package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0286a implements Parcelable {
    public static final Parcelable.Creator<C0286a> CREATOR = new a();

    /* renamed from: a */
    private final int f860a;

    /* renamed from: b */
    private final Intent f861b;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0286a createFromParcel(Parcel parcel) {
            return new C0286a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0286a[] newArray(int i10) {
            return new C0286a[i10];
        }
    }

    public C0286a(int i10, Intent intent) {
        this.f860a = i10;
        this.f861b = intent;
    }

    /* renamed from: d */
    public static String m966d(int i10) {
        if (i10 != -1) {
            if (i10 != 0) {
                return String.valueOf(i10);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m967a() {
        return this.f861b;
    }

    /* renamed from: b */
    public int m968b() {
        return this.f860a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m966d(this.f860a) + ", data=" + this.f861b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f860a);
        if (this.f861b == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        Intent intent = this.f861b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    C0286a(Parcel parcel) {
        this.f860a = parcel.readInt();
        this.f861b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
