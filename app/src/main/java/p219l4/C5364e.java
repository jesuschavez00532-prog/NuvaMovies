package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.e */
/* loaded from: classes.dex */
public class C5364e extends AbstractC5593a {
    public static final Parcelable.Creator<C5364e> CREATOR = new C5357b1();

    /* renamed from: a */
    private final C5397p f21946a;

    /* renamed from: b */
    private final boolean f21947b;

    /* renamed from: c */
    private final boolean f21948c;

    /* renamed from: d */
    private final int[] f21949d;

    /* renamed from: e */
    private final int f21950e;

    /* renamed from: f */
    private final int[] f21951f;

    public C5364e(C5397p c5397p, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f21946a = c5397p;
        this.f21947b = z10;
        this.f21948c = z11;
        this.f21949d = iArr;
        this.f21950e = i10;
        this.f21951f = iArr2;
    }

    /* renamed from: g */
    public int m21717g() {
        return this.f21950e;
    }

    /* renamed from: i */
    public int[] m21718i() {
        return this.f21949d;
    }

    /* renamed from: j */
    public int[] m21719j() {
        return this.f21951f;
    }

    /* renamed from: k */
    public boolean m21720k() {
        return this.f21947b;
    }

    /* renamed from: n */
    public boolean m21721n() {
        return this.f21948c;
    }

    /* renamed from: o */
    public final C5397p m21722o() {
        return this.f21946a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22745m(parcel, 1, this.f21946a, i10, false);
        AbstractC5595c.m22735c(parcel, 2, m21720k());
        AbstractC5595c.m22735c(parcel, 3, m21721n());
        AbstractC5595c.m22742j(parcel, 4, m21718i(), false);
        AbstractC5595c.m22741i(parcel, 5, m21717g());
        AbstractC5595c.m22742j(parcel, 6, m21719j(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
