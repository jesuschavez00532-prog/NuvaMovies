package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public final class C0735u implements Parcelable {
    public static final Parcelable.Creator<C0735u> CREATOR = new a();

    /* renamed from: a */
    final String f2976a;

    /* renamed from: b */
    final String f2977b;

    /* renamed from: c */
    final boolean f2978c;

    /* renamed from: d */
    final int f2979d;

    /* renamed from: e */
    final int f2980e;

    /* renamed from: f */
    final String f2981f;

    /* renamed from: g */
    final boolean f2982g;

    /* renamed from: h */
    final boolean f2983h;

    /* renamed from: i */
    final boolean f2984i;

    /* renamed from: j */
    final Bundle f2985j;

    /* renamed from: k */
    final boolean f2986k;

    /* renamed from: l */
    final int f2987l;

    /* renamed from: m */
    Bundle f2988m;

    /* renamed from: androidx.fragment.app.u$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0735u createFromParcel(Parcel parcel) {
            return new C0735u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0735u[] newArray(int i10) {
            return new C0735u[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0735u(Fragment fragment) {
        this.f2976a = fragment.getClass().getName();
        this.f2977b = fragment.f2643f;
        this.f2978c = fragment.f2657n;
        this.f2979d = fragment.f2666w;
        this.f2980e = fragment.f2667x;
        this.f2981f = fragment.f2668y;
        this.f2982g = fragment.f2619B;
        this.f2983h = fragment.f2656m;
        this.f2984i = fragment.f2618A;
        this.f2985j = fragment.f2644g;
        this.f2986k = fragment.f2669z;
        this.f2987l = fragment.f2635X.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2976a);
        sb2.append(" (");
        sb2.append(this.f2977b);
        sb2.append(")}:");
        if (this.f2978c) {
            sb2.append(" fromLayout");
        }
        if (this.f2980e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2980e));
        }
        String str = this.f2981f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2981f);
        }
        if (this.f2982g) {
            sb2.append(" retainInstance");
        }
        if (this.f2983h) {
            sb2.append(" removing");
        }
        if (this.f2984i) {
            sb2.append(" detached");
        }
        if (this.f2986k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2976a);
        parcel.writeString(this.f2977b);
        parcel.writeInt(this.f2978c ? 1 : 0);
        parcel.writeInt(this.f2979d);
        parcel.writeInt(this.f2980e);
        parcel.writeString(this.f2981f);
        parcel.writeInt(this.f2982g ? 1 : 0);
        parcel.writeInt(this.f2983h ? 1 : 0);
        parcel.writeInt(this.f2984i ? 1 : 0);
        parcel.writeBundle(this.f2985j);
        parcel.writeInt(this.f2986k ? 1 : 0);
        parcel.writeBundle(this.f2988m);
        parcel.writeInt(this.f2987l);
    }

    C0735u(Parcel parcel) {
        this.f2976a = parcel.readString();
        this.f2977b = parcel.readString();
        this.f2978c = parcel.readInt() != 0;
        this.f2979d = parcel.readInt();
        this.f2980e = parcel.readInt();
        this.f2981f = parcel.readString();
        this.f2982g = parcel.readInt() != 0;
        this.f2983h = parcel.readInt() != 0;
        this.f2984i = parcel.readInt() != 0;
        this.f2985j = parcel.readBundle();
        this.f2986k = parcel.readInt() != 0;
        this.f2988m = parcel.readBundle();
        this.f2987l = parcel.readInt();
    }
}
