package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C2556a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public class C2562g implements C2556a.c {
    public static final Parcelable.Creator<C2562g> CREATOR = new a();

    /* renamed from: a */
    private final long f9642a;

    /* renamed from: com.google.android.material.datepicker.g$a */
    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2562g createFromParcel(Parcel parcel) {
            return new C2562g(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2562g[] newArray(int i10) {
            return new C2562g[i10];
        }
    }

    /* synthetic */ C2562g(long j10, a aVar) {
        this(j10);
    }

    /* renamed from: a */
    public static C2562g m10472a(long j10) {
        return new C2562g(j10);
    }

    @Override // com.google.android.material.datepicker.C2556a.c
    /* renamed from: c */
    public boolean mo10464c(long j10) {
        if (j10 >= this.f9642a) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2562g) && this.f9642a == ((C2562g) obj).f9642a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9642a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9642a);
    }

    private C2562g(long j10) {
        this.f9642a = j10;
    }
}
