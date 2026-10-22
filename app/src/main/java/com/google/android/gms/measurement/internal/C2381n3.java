package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* loaded from: classes.dex */
public final class C2381n3 {

    /* renamed from: a */
    public final String f8853a;

    /* renamed from: b */
    public final String f8854b;

    /* renamed from: c */
    public final long f8855c;

    /* renamed from: d */
    public final Bundle f8856d;

    public C2381n3(String str, String str2, Bundle bundle, long j10) {
        this.f8853a = str;
        this.f8854b = str2;
        this.f8856d = bundle;
        this.f8855c = j10;
    }

    /* renamed from: b */
    public static C2381n3 m9870b(C2465v c2465v) {
        return new C2381n3(c2465v.f9137a, c2465v.f9139c, c2465v.f9138b.m10072j(), c2465v.f9140d);
    }

    /* renamed from: a */
    public final C2465v m9871a() {
        return new C2465v(this.f8853a, new C2443t(new Bundle(this.f8856d)), this.f8854b, this.f8855c);
    }

    public final String toString() {
        return "origin=" + this.f8854b + ",name=" + this.f8853a + ",params=" + this.f8856d.toString();
    }
}
