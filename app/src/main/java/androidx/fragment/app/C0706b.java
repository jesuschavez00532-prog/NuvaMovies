package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0738x;
import androidx.lifecycle.AbstractC0749c;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0706b implements Parcelable {
    public static final Parcelable.Creator<C0706b> CREATOR = new a();

    /* renamed from: a */
    final int[] f2706a;

    /* renamed from: b */
    final ArrayList f2707b;

    /* renamed from: c */
    final int[] f2708c;

    /* renamed from: d */
    final int[] f2709d;

    /* renamed from: e */
    final int f2710e;

    /* renamed from: f */
    final String f2711f;

    /* renamed from: g */
    final int f2712g;

    /* renamed from: h */
    final int f2713h;

    /* renamed from: i */
    final CharSequence f2714i;

    /* renamed from: j */
    final int f2715j;

    /* renamed from: k */
    final CharSequence f2716k;

    /* renamed from: l */
    final ArrayList f2717l;

    /* renamed from: m */
    final ArrayList f2718m;

    /* renamed from: n */
    final boolean f2719n;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0706b createFromParcel(Parcel parcel) {
            return new C0706b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0706b[] newArray(int i10) {
            return new C0706b[i10];
        }
    }

    public C0706b(C0704a c0704a) {
        int size = c0704a.f3002c.size();
        this.f2706a = new int[size * 5];
        if (c0704a.f3008i) {
            this.f2707b = new ArrayList(size);
            this.f2708c = new int[size];
            this.f2709d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                AbstractC0738x.a aVar = (AbstractC0738x.a) c0704a.f3002c.get(i10);
                int i12 = i11 + 1;
                this.f2706a[i11] = aVar.f3019a;
                ArrayList arrayList = this.f2707b;
                Fragment fragment = aVar.f3020b;
                arrayList.add(fragment != null ? fragment.f2643f : null);
                int[] iArr = this.f2706a;
                int i13 = i12 + 1;
                iArr[i12] = aVar.f3021c;
                int i14 = i13 + 1;
                iArr[i13] = aVar.f3022d;
                int i15 = i14 + 1;
                iArr[i14] = aVar.f3023e;
                iArr[i15] = aVar.f3024f;
                this.f2708c[i10] = aVar.f3025g.ordinal();
                this.f2709d[i10] = aVar.f3026h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f2710e = c0704a.f3007h;
            this.f2711f = c0704a.f3010k;
            this.f2712g = c0704a.f2705v;
            this.f2713h = c0704a.f3011l;
            this.f2714i = c0704a.f3012m;
            this.f2715j = c0704a.f3013n;
            this.f2716k = c0704a.f3014o;
            this.f2717l = c0704a.f3015p;
            this.f2718m = c0704a.f3016q;
            this.f2719n = c0704a.f3017r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0704a m3244a(AbstractC0729o abstractC0729o) {
        C0704a c0704a = new C0704a(abstractC0729o);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2706a.length) {
            AbstractC0738x.a aVar = new AbstractC0738x.a();
            int i12 = i10 + 1;
            aVar.f3019a = this.f2706a[i10];
            if (AbstractC0729o.m3432F0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0704a + " op #" + i11 + " base fragment #" + this.f2706a[i12]);
            }
            String str = (String) this.f2707b.get(i11);
            if (str != null) {
                aVar.f3020b = abstractC0729o.m3518f0(str);
            } else {
                aVar.f3020b = null;
            }
            aVar.f3025g = AbstractC0749c.c.values()[this.f2708c[i11]];
            aVar.f3026h = AbstractC0749c.c.values()[this.f2709d[i11]];
            int[] iArr = this.f2706a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar.f3021c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar.f3022d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar.f3023e = i18;
            int i19 = iArr[i17];
            aVar.f3024f = i19;
            c0704a.f3003d = i14;
            c0704a.f3004e = i16;
            c0704a.f3005f = i18;
            c0704a.f3006g = i19;
            c0704a.m3641e(aVar);
            i11++;
            i10 = i17 + 1;
        }
        c0704a.f3007h = this.f2710e;
        c0704a.f3010k = this.f2711f;
        c0704a.f2705v = this.f2712g;
        c0704a.f3008i = true;
        c0704a.f3011l = this.f2713h;
        c0704a.f3012m = this.f2714i;
        c0704a.f3013n = this.f2715j;
        c0704a.f3014o = this.f2716k;
        c0704a.f3015p = this.f2717l;
        c0704a.f3016q = this.f2718m;
        c0704a.f3017r = this.f2719n;
        c0704a.m3238v(1);
        return c0704a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2706a);
        parcel.writeStringList(this.f2707b);
        parcel.writeIntArray(this.f2708c);
        parcel.writeIntArray(this.f2709d);
        parcel.writeInt(this.f2710e);
        parcel.writeString(this.f2711f);
        parcel.writeInt(this.f2712g);
        parcel.writeInt(this.f2713h);
        TextUtils.writeToParcel(this.f2714i, parcel, 0);
        parcel.writeInt(this.f2715j);
        TextUtils.writeToParcel(this.f2716k, parcel, 0);
        parcel.writeStringList(this.f2717l);
        parcel.writeStringList(this.f2718m);
        parcel.writeInt(this.f2719n ? 1 : 0);
    }

    public C0706b(Parcel parcel) {
        this.f2706a = parcel.createIntArray();
        this.f2707b = parcel.createStringArrayList();
        this.f2708c = parcel.createIntArray();
        this.f2709d = parcel.createIntArray();
        this.f2710e = parcel.readInt();
        this.f2711f = parcel.readString();
        this.f2712g = parcel.readInt();
        this.f2713h = parcel.readInt();
        this.f2714i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2715j = parcel.readInt();
        this.f2716k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2717l = parcel.createStringArrayList();
        this.f2718m = parcel.createStringArrayList();
        this.f2719n = parcel.readInt() != 0;
    }
}
