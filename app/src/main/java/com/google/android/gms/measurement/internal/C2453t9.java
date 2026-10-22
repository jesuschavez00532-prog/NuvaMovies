package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* loaded from: classes.dex */
public final class C2453t9 extends AbstractC5593a {
    public static final Parcelable.Creator<C2453t9> CREATOR = new C2464u9();

    /* renamed from: a */
    public final String f9084a;

    /* renamed from: b */
    public final String f9085b;

    /* renamed from: c */
    public final String f9086c;

    /* renamed from: d */
    public final String f9087d;

    /* renamed from: e */
    public final long f9088e;

    /* renamed from: f */
    public final long f9089f;

    /* renamed from: g */
    public final String f9090g;

    /* renamed from: h */
    public final boolean f9091h;

    /* renamed from: i */
    public final boolean f9092i;

    /* renamed from: j */
    public final long f9093j;

    /* renamed from: k */
    public final String f9094k;

    /* renamed from: l */
    public final long f9095l;

    /* renamed from: m */
    public final long f9096m;

    /* renamed from: n */
    public final int f9097n;

    /* renamed from: o */
    public final boolean f9098o;

    /* renamed from: p */
    public final boolean f9099p;

    /* renamed from: q */
    public final String f9100q;

    /* renamed from: r */
    public final Boolean f9101r;

    /* renamed from: s */
    public final long f9102s;

    /* renamed from: t */
    public final List f9103t;

    /* renamed from: u */
    public final String f9104u;

    /* renamed from: v */
    public final String f9105v;

    /* renamed from: w */
    public final String f9106w;

    /* renamed from: x */
    public final String f9107x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2453t9(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        AbstractC5391n.m21779e(str);
        this.f9084a = str;
        this.f9085b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f9086c = str3;
        this.f9093j = j10;
        this.f9087d = str4;
        this.f9088e = j11;
        this.f9089f = j12;
        this.f9090g = str5;
        this.f9091h = z10;
        this.f9092i = z11;
        this.f9094k = str6;
        this.f9095l = 0L;
        this.f9096m = j14;
        this.f9097n = i10;
        this.f9098o = z12;
        this.f9099p = z13;
        this.f9100q = str7;
        this.f9101r = bool;
        this.f9102s = j15;
        this.f9103t = list;
        this.f9104u = null;
        this.f9105v = str9;
        this.f9106w = str10;
        this.f9107x = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 2, this.f9084a, false);
        AbstractC5595c.m22746n(parcel, 3, this.f9085b, false);
        AbstractC5595c.m22746n(parcel, 4, this.f9086c, false);
        AbstractC5595c.m22746n(parcel, 5, this.f9087d, false);
        AbstractC5595c.m22743k(parcel, 6, this.f9088e);
        AbstractC5595c.m22743k(parcel, 7, this.f9089f);
        AbstractC5595c.m22746n(parcel, 8, this.f9090g, false);
        AbstractC5595c.m22735c(parcel, 9, this.f9091h);
        AbstractC5595c.m22735c(parcel, 10, this.f9092i);
        AbstractC5595c.m22743k(parcel, 11, this.f9093j);
        AbstractC5595c.m22746n(parcel, 12, this.f9094k, false);
        AbstractC5595c.m22743k(parcel, 13, this.f9095l);
        AbstractC5595c.m22743k(parcel, 14, this.f9096m);
        AbstractC5595c.m22741i(parcel, 15, this.f9097n);
        AbstractC5595c.m22735c(parcel, 16, this.f9098o);
        AbstractC5595c.m22735c(parcel, 18, this.f9099p);
        AbstractC5595c.m22746n(parcel, 19, this.f9100q, false);
        AbstractC5595c.m22736d(parcel, 21, this.f9101r, false);
        AbstractC5595c.m22743k(parcel, 22, this.f9102s);
        AbstractC5595c.m22747o(parcel, 23, this.f9103t, false);
        AbstractC5595c.m22746n(parcel, 24, this.f9104u, false);
        AbstractC5595c.m22746n(parcel, 25, this.f9105v, false);
        AbstractC5595c.m22746n(parcel, 26, this.f9106w, false);
        AbstractC5595c.m22746n(parcel, 27, this.f9107x, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2453t9(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        this.f9084a = str;
        this.f9085b = str2;
        this.f9086c = str3;
        this.f9093j = j12;
        this.f9087d = str4;
        this.f9088e = j10;
        this.f9089f = j11;
        this.f9090g = str5;
        this.f9091h = z10;
        this.f9092i = z11;
        this.f9094k = str6;
        this.f9095l = j13;
        this.f9096m = j14;
        this.f9097n = i10;
        this.f9098o = z12;
        this.f9099p = z13;
        this.f9100q = str7;
        this.f9101r = bool;
        this.f9102s = j15;
        this.f9103t = list;
        this.f9104u = str8;
        this.f9105v = str9;
        this.f9106w = str10;
        this.f9107x = str11;
    }
}
