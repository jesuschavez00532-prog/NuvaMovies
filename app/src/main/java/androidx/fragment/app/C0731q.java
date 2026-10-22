package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC0729o;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0731q implements Parcelable {
    public static final Parcelable.Creator<C0731q> CREATOR = new a();

    /* renamed from: a */
    ArrayList f2955a;

    /* renamed from: b */
    ArrayList f2956b;

    /* renamed from: c */
    C0706b[] f2957c;

    /* renamed from: d */
    int f2958d;

    /* renamed from: e */
    String f2959e;

    /* renamed from: f */
    ArrayList f2960f;

    /* renamed from: g */
    ArrayList f2961g;

    /* renamed from: h */
    ArrayList f2962h;

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0731q createFromParcel(Parcel parcel) {
            return new C0731q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0731q[] newArray(int i10) {
            return new C0731q[i10];
        }
    }

    public C0731q() {
        this.f2959e = null;
        this.f2960f = new ArrayList();
        this.f2961g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2955a);
        parcel.writeStringList(this.f2956b);
        parcel.writeTypedArray(this.f2957c, i10);
        parcel.writeInt(this.f2958d);
        parcel.writeString(this.f2959e);
        parcel.writeStringList(this.f2960f);
        parcel.writeTypedList(this.f2961g);
        parcel.writeTypedList(this.f2962h);
    }

    public C0731q(Parcel parcel) {
        this.f2959e = null;
        this.f2960f = new ArrayList();
        this.f2961g = new ArrayList();
        this.f2955a = parcel.createTypedArrayList(C0735u.CREATOR);
        this.f2956b = parcel.createStringArrayList();
        this.f2957c = (C0706b[]) parcel.createTypedArray(C0706b.CREATOR);
        this.f2958d = parcel.readInt();
        this.f2959e = parcel.readString();
        this.f2960f = parcel.createStringArrayList();
        this.f2961g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2962h = parcel.createTypedArrayList(AbstractC0729o.m.CREATOR);
    }
}
