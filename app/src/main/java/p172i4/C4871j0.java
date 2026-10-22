package p172i4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: i4.j0 */
/* loaded from: classes.dex */
public final class C4871j0 extends AbstractC5593a {
    public static final Parcelable.Creator<C4871j0> CREATOR = new C4873k0();

    /* renamed from: a */
    private final boolean f20369a;

    /* renamed from: b */
    private final String f20370b;

    /* renamed from: c */
    private final int f20371c;

    /* renamed from: d */
    private final int f20372d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4871j0(boolean z10, String str, int i10, int i11) {
        this.f20369a = z10;
        this.f20370b = str;
        this.f20371c = AbstractC4887r0.m20096a(i10) - 1;
        this.f20372d = AbstractC4892w.m20098a(i11) - 1;
    }

    /* renamed from: g */
    public final String m20064g() {
        return this.f20370b;
    }

    /* renamed from: i */
    public final boolean m20065i() {
        return this.f20369a;
    }

    /* renamed from: j */
    public final int m20066j() {
        return AbstractC4892w.m20098a(this.f20372d);
    }

    /* renamed from: k */
    public final int m20067k() {
        return AbstractC4887r0.m20096a(this.f20371c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22735c(parcel, 1, this.f20369a);
        AbstractC5595c.m22746n(parcel, 2, this.f20370b, false);
        AbstractC5595c.m22741i(parcel, 3, this.f20371c);
        AbstractC5595c.m22741i(parcel, 4, this.f20372d);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
