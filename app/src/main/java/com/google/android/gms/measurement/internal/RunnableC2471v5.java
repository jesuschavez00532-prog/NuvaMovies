package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* loaded from: classes.dex */
public final class RunnableC2471v5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f9152a;

    /* renamed from: b */
    final /* synthetic */ String f9153b;

    /* renamed from: c */
    final /* synthetic */ long f9154c;

    /* renamed from: d */
    final /* synthetic */ Bundle f9155d;

    /* renamed from: e */
    final /* synthetic */ boolean f9156e;

    /* renamed from: f */
    final /* synthetic */ boolean f9157f;

    /* renamed from: g */
    final /* synthetic */ boolean f9158g;

    /* renamed from: h */
    final /* synthetic */ String f9159h;

    /* renamed from: i */
    final /* synthetic */ C2406p6 f9160i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2471v5(C2406p6 c2406p6, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f9160i = c2406p6;
        this.f9152a = str;
        this.f9153b = str2;
        this.f9154c = j10;
        this.f9155d = bundle;
        this.f9156e = z10;
        this.f9157f = z11;
        this.f9158g = z12;
        this.f9159h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9160i.m10004w(this.f9152a, this.f9153b, this.f9154c, this.f9155d, this.f9156e, this.f9157f, this.f9158g, this.f9159h);
    }
}
