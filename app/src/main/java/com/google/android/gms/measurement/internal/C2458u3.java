package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes.dex */
public final class C2458u3 {

    /* renamed from: a */
    private final String f9111a;

    /* renamed from: b */
    private final boolean f9112b;

    /* renamed from: c */
    private boolean f9113c;

    /* renamed from: d */
    private boolean f9114d;

    /* renamed from: e */
    final /* synthetic */ C2238a4 f9115e;

    public C2458u3(C2238a4 c2238a4, String str, boolean z10) {
        this.f9115e = c2238a4;
        AbstractC5391n.m21779e(str);
        this.f9111a = str;
        this.f9112b = z10;
    }

    /* renamed from: a */
    public final void m10081a(boolean z10) {
        SharedPreferences.Editor edit = this.f9115e.m9431o().edit();
        edit.putBoolean(this.f9111a, z10);
        edit.apply();
        this.f9114d = z10;
    }

    /* renamed from: b */
    public final boolean m10082b() {
        if (!this.f9113c) {
            this.f9113c = true;
            this.f9114d = this.f9115e.m9431o().getBoolean(this.f9111a, this.f9112b);
        }
        return this.f9114d;
    }
}
