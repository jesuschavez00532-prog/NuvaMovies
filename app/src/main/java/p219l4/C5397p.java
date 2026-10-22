package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.p */
/* loaded from: classes.dex */
public class C5397p extends AbstractC5593a {
    public static final Parcelable.Creator<C5397p> CREATOR = new C5405s0();

    /* renamed from: a */
    private final int f22026a;

    /* renamed from: b */
    private final boolean f22027b;

    /* renamed from: c */
    private final boolean f22028c;

    /* renamed from: d */
    private final int f22029d;

    /* renamed from: e */
    private final int f22030e;

    public C5397p(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f22026a = i10;
        this.f22027b = z10;
        this.f22028c = z11;
        this.f22029d = i11;
        this.f22030e = i12;
    }

    /* renamed from: g */
    public int m21797g() {
        return this.f22029d;
    }

    /* renamed from: i */
    public int m21798i() {
        return this.f22030e;
    }

    /* renamed from: j */
    public boolean m21799j() {
        return this.f22027b;
    }

    /* renamed from: k */
    public boolean m21800k() {
        return this.f22028c;
    }

    /* renamed from: n */
    public int m21801n() {
        return this.f22026a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, m21801n());
        AbstractC5595c.m22735c(parcel, 2, m21799j());
        AbstractC5595c.m22735c(parcel, 3, m21800k());
        AbstractC5595c.m22741i(parcel, 4, m21797g());
        AbstractC5595c.m22741i(parcel, 5, m21798i());
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
