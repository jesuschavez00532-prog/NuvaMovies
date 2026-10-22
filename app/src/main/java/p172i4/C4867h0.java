package p172i4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;
import p325s4.BinderC6676b;
import p325s4.InterfaceC6675a;

/* renamed from: i4.h0 */
/* loaded from: classes.dex */
public final class C4867h0 extends AbstractC5593a {
    public static final Parcelable.Creator<C4867h0> CREATOR = new C4869i0();

    /* renamed from: a */
    private final String f20358a;

    /* renamed from: b */
    private final boolean f20359b;

    /* renamed from: c */
    private final boolean f20360c;

    /* renamed from: d */
    private final Context f20361d;

    /* renamed from: e */
    private final boolean f20362e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4867h0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f20358a = str;
        this.f20359b = z10;
        this.f20360c = z11;
        this.f20361d = (Context) BinderC6676b.m26054d(InterfaceC6675a.a.m26052c(iBinder));
        this.f20362e = z12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [s4.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 1, this.f20358a, false);
        AbstractC5595c.m22735c(parcel, 2, this.f20359b);
        AbstractC5595c.m22735c(parcel, 3, this.f20360c);
        AbstractC5595c.m22740h(parcel, 4, BinderC6676b.m26053M(this.f20361d), false);
        AbstractC5595c.m22735c(parcel, 5, this.f20362e);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
