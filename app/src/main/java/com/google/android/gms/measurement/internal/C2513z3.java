package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes.dex */
public final class C2513z3 {

    /* renamed from: a */
    private final String f9247a;

    /* renamed from: b */
    private boolean f9248b;

    /* renamed from: c */
    private String f9249c;

    /* renamed from: d */
    final /* synthetic */ C2238a4 f9250d;

    public C2513z3(C2238a4 c2238a4, String str, String str2) {
        this.f9250d = c2238a4;
        AbstractC5391n.m21779e(str);
        this.f9247a = str;
    }

    /* renamed from: a */
    public final String m10115a() {
        if (!this.f9248b) {
            this.f9248b = true;
            this.f9249c = this.f9250d.m9431o().getString(this.f9247a, null);
        }
        return this.f9249c;
    }

    /* renamed from: b */
    public final void m10116b(String str) {
        SharedPreferences.Editor edit = this.f9250d.m9431o().edit();
        edit.putString(this.f9247a, str);
        edit.apply();
        this.f9249c = str;
    }
}
