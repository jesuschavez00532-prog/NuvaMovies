package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes.dex */
public final class C2465v extends AbstractC5593a {
    public static final Parcelable.Creator<C2465v> CREATOR = new C2476w();

    /* renamed from: a */
    public final String f9137a;

    /* renamed from: b */
    public final C2443t f9138b;

    /* renamed from: c */
    public final String f9139c;

    /* renamed from: d */
    public final long f9140d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2465v(C2465v c2465v, long j10) {
        AbstractC5391n.m21783i(c2465v);
        this.f9137a = c2465v.f9137a;
        this.f9138b = c2465v.f9138b;
        this.f9139c = c2465v.f9139c;
        this.f9140d = j10;
    }

    public final String toString() {
        return "origin=" + this.f9139c + ",name=" + this.f9137a + ",params=" + String.valueOf(this.f9138b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2476w.m10096a(this, parcel, i10);
    }

    public C2465v(String str, C2443t c2443t, String str2, long j10) {
        this.f9137a = str;
        this.f9138b = c2443t;
        this.f9139c = str2;
        this.f9140d = j10;
    }
}
