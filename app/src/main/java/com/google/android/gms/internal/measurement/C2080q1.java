package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* loaded from: classes.dex */
public final class C2080q1 extends AbstractC5593a {
    public static final Parcelable.Creator<C2080q1> CREATOR = new C2095r1();

    /* renamed from: a */
    public final long f8011a;

    /* renamed from: b */
    public final long f8012b;

    /* renamed from: c */
    public final boolean f8013c;

    /* renamed from: d */
    public final String f8014d;

    /* renamed from: e */
    public final String f8015e;

    /* renamed from: f */
    public final String f8016f;

    /* renamed from: g */
    public final Bundle f8017g;

    /* renamed from: h */
    public final String f8018h;

    public C2080q1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8011a = j10;
        this.f8012b = j11;
        this.f8013c = z10;
        this.f8014d = str;
        this.f8015e = str2;
        this.f8016f = str3;
        this.f8017g = bundle;
        this.f8018h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22743k(parcel, 1, this.f8011a);
        AbstractC5595c.m22743k(parcel, 2, this.f8012b);
        AbstractC5595c.m22735c(parcel, 3, this.f8013c);
        AbstractC5595c.m22746n(parcel, 4, this.f8014d, false);
        AbstractC5595c.m22746n(parcel, 5, this.f8015e, false);
        AbstractC5595c.m22746n(parcel, 6, this.f8016f, false);
        AbstractC5595c.m22737e(parcel, 7, this.f8017g, false);
        AbstractC5595c.m22746n(parcel, 8, this.f8018h, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
