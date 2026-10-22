package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import p025b5.AbstractC1111i;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* loaded from: classes.dex */
public final class C2502y3 {

    /* renamed from: a */
    final String f9226a;

    /* renamed from: b */
    private final String f9227b;

    /* renamed from: c */
    private final String f9228c;

    /* renamed from: d */
    private final long f9229d;

    /* renamed from: e */
    final /* synthetic */ C2238a4 f9230e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2502y3(C2238a4 c2238a4, String str, long j10, AbstractC1111i abstractC1111i) {
        boolean z10;
        this.f9230e = c2238a4;
        AbstractC5391n.m21779e("health_monitor");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21775a(z10);
        this.f9226a = "health_monitor:start";
        this.f9227b = "health_monitor:count";
        this.f9228c = "health_monitor:value";
        this.f9229d = j10;
    }

    /* renamed from: c */
    private final long m10110c() {
        return this.f9230e.m9431o().getLong(this.f9226a, 0L);
    }

    /* renamed from: d */
    private final void m10111d() {
        this.f9230e.mo9428h();
        long mo24747a = this.f9230e.f8714a.mo9578c().mo24747a();
        SharedPreferences.Editor edit = this.f9230e.m9431o().edit();
        edit.remove(this.f9227b);
        edit.remove(this.f9228c);
        edit.putLong(this.f9226a, mo24747a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair m10112a() {
        long abs;
        this.f9230e.mo9428h();
        this.f9230e.mo9428h();
        long m10110c = m10110c();
        if (m10110c == 0) {
            m10111d();
            abs = 0;
        } else {
            abs = Math.abs(m10110c - this.f9230e.f8714a.mo9578c().mo24747a());
        }
        long j10 = this.f9229d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            m10111d();
            return null;
        }
        String string = this.f9230e.m9431o().getString(this.f9228c, null);
        long j11 = this.f9230e.m9431o().getLong(this.f9227b, 0L);
        m10111d();
        if (string != null && j11 > 0) {
            return new Pair(string, Long.valueOf(j11));
        }
        return C2238a4.f8335x;
    }

    /* renamed from: b */
    public final void m10113b(String str, long j10) {
        this.f9230e.mo9428h();
        if (m10110c() == 0) {
            m10111d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f9230e.m9431o().getLong(this.f9227b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f9230e.m9431o().edit();
            edit.putString(this.f9228c, str);
            edit.putLong(this.f9227b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f9230e.f8714a.m10031N().m9952u().nextLong();
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f9230e.m9431o().edit();
        if ((nextLong & Long.MAX_VALUE) < j13) {
            edit2.putString(this.f9228c, str);
        }
        edit2.putLong(this.f9227b, j12);
        edit2.apply();
    }
}
