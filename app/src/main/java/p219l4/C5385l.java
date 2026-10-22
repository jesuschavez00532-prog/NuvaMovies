package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.l */
/* loaded from: classes.dex */
public class C5385l extends AbstractC5593a {
    public static final Parcelable.Creator<C5385l> CREATOR = new C5368f0();

    /* renamed from: a */
    private final int f22007a;

    /* renamed from: b */
    private final int f22008b;

    /* renamed from: c */
    private final int f22009c;

    /* renamed from: d */
    private final long f22010d;

    /* renamed from: e */
    private final long f22011e;

    /* renamed from: f */
    private final String f22012f;

    /* renamed from: g */
    private final String f22013g;

    /* renamed from: h */
    private final int f22014h;

    /* renamed from: i */
    private final int f22015i;

    public C5385l(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f22007a = i10;
        this.f22008b = i11;
        this.f22009c = i12;
        this.f22010d = j10;
        this.f22011e = j11;
        this.f22012f = str;
        this.f22013g = str2;
        this.f22014h = i13;
        this.f22015i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f22007a);
        AbstractC5595c.m22741i(parcel, 2, this.f22008b);
        AbstractC5595c.m22741i(parcel, 3, this.f22009c);
        AbstractC5595c.m22743k(parcel, 4, this.f22010d);
        AbstractC5595c.m22743k(parcel, 5, this.f22011e);
        AbstractC5595c.m22746n(parcel, 6, this.f22012f, false);
        AbstractC5595c.m22746n(parcel, 7, this.f22013g, false);
        AbstractC5595c.m22741i(parcel, 8, this.f22014h);
        AbstractC5595c.m22741i(parcel, 9, this.f22015i);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
