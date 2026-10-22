package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes.dex */
public final class C2267d extends AbstractC5593a {
    public static final Parcelable.Creator<C2267d> CREATOR = new C2278e();

    /* renamed from: a */
    public String f8521a;

    /* renamed from: b */
    public String f8522b;

    /* renamed from: c */
    public C2354k9 f8523c;

    /* renamed from: d */
    public long f8524d;

    /* renamed from: e */
    public boolean f8525e;

    /* renamed from: f */
    public String f8526f;

    /* renamed from: g */
    public final C2465v f8527g;

    /* renamed from: h */
    public long f8528h;

    /* renamed from: i */
    public C2465v f8529i;

    /* renamed from: j */
    public final long f8530j;

    /* renamed from: k */
    public final C2465v f8531k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2267d(C2267d c2267d) {
        AbstractC5391n.m21783i(c2267d);
        this.f8521a = c2267d.f8521a;
        this.f8522b = c2267d.f8522b;
        this.f8523c = c2267d.f8523c;
        this.f8524d = c2267d.f8524d;
        this.f8525e = c2267d.f8525e;
        this.f8526f = c2267d.f8526f;
        this.f8527g = c2267d.f8527g;
        this.f8528h = c2267d.f8528h;
        this.f8529i = c2267d.f8529i;
        this.f8530j = c2267d.f8530j;
        this.f8531k = c2267d.f8531k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 2, this.f8521a, false);
        AbstractC5595c.m22746n(parcel, 3, this.f8522b, false);
        AbstractC5595c.m22745m(parcel, 4, this.f8523c, i10, false);
        AbstractC5595c.m22743k(parcel, 5, this.f8524d);
        AbstractC5595c.m22735c(parcel, 6, this.f8525e);
        AbstractC5595c.m22746n(parcel, 7, this.f8526f, false);
        AbstractC5595c.m22745m(parcel, 8, this.f8527g, i10, false);
        AbstractC5595c.m22743k(parcel, 9, this.f8528h);
        AbstractC5595c.m22745m(parcel, 10, this.f8529i, i10, false);
        AbstractC5595c.m22743k(parcel, 11, this.f8530j);
        AbstractC5595c.m22745m(parcel, 12, this.f8531k, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2267d(String str, String str2, C2354k9 c2354k9, long j10, boolean z10, String str3, C2465v c2465v, long j11, C2465v c2465v2, long j12, C2465v c2465v3) {
        this.f8521a = str;
        this.f8522b = str2;
        this.f8523c = c2354k9;
        this.f8524d = j10;
        this.f8525e = z10;
        this.f8526f = str3;
        this.f8527g = c2465v;
        this.f8528h = j11;
        this.f8529i = c2465v2;
        this.f8530j = j12;
        this.f8531k = c2465v3;
    }
}
