package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes.dex */
public final class C2480w3 {

    /* renamed from: a */
    private final String f9173a;

    /* renamed from: b */
    private final long f9174b;

    /* renamed from: c */
    private boolean f9175c;

    /* renamed from: d */
    private long f9176d;

    /* renamed from: e */
    final /* synthetic */ C2238a4 f9177e;

    public C2480w3(C2238a4 c2238a4, String str, long j10) {
        this.f9177e = c2238a4;
        AbstractC5391n.m21779e(str);
        this.f9173a = str;
        this.f9174b = j10;
    }

    /* renamed from: a */
    public final long m10097a() {
        if (!this.f9175c) {
            this.f9175c = true;
            this.f9176d = this.f9177e.m9431o().getLong(this.f9173a, this.f9174b);
        }
        return this.f9176d;
    }

    /* renamed from: b */
    public final void m10098b(long j10) {
        SharedPreferences.Editor edit = this.f9177e.m9431o().edit();
        edit.putLong(this.f9173a, j10);
        edit.apply();
        this.f9176d = j10;
    }
}
