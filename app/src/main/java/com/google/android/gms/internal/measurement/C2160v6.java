package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* loaded from: classes.dex */
public final class C2160v6 {

    /* renamed from: a */
    final String f8210a;

    /* renamed from: b */
    final Uri f8211b;

    /* renamed from: c */
    final String f8212c;

    /* renamed from: d */
    final String f8213d;

    /* renamed from: e */
    final boolean f8214e;

    /* renamed from: f */
    final boolean f8215f;

    /* renamed from: g */
    final boolean f8216g;

    /* renamed from: h */
    final boolean f8217h;

    private C2160v6(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC1888d7 interfaceC1888d7) {
        this.f8210a = null;
        this.f8211b = uri;
        this.f8212c = "";
        this.f8213d = "";
        this.f8214e = z10;
        this.f8215f = false;
        this.f8216g = z12;
        this.f8217h = false;
    }

    /* renamed from: a */
    public final C2160v6 m9037a() {
        return new C2160v6(null, this.f8211b, this.f8212c, this.f8213d, this.f8214e, false, true, false, null);
    }

    /* renamed from: b */
    public final C2160v6 m9038b() {
        if (this.f8212c.isEmpty()) {
            return new C2160v6(null, this.f8211b, this.f8212c, this.f8213d, true, false, this.f8216g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final AbstractC2220z6 m9039c(String str, double d10) {
        return new C2130t6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final AbstractC2220z6 m9040d(String str, long j10) {
        return new C2100r6(this, str, Long.valueOf(j10), true);
    }

    /* renamed from: e */
    public final AbstractC2220z6 m9041e(String str, String str2) {
        return new C2145u6(this, str, str2, true);
    }

    /* renamed from: f */
    public final AbstractC2220z6 m9042f(String str, boolean z10) {
        return new C2115s6(this, str, Boolean.valueOf(z10), true);
    }

    public C2160v6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
