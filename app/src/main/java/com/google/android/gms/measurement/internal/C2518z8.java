package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes.dex */
public final class C2518z8 implements InterfaceC2392o3 {

    /* renamed from: a */
    final /* synthetic */ String f9259a;

    /* renamed from: b */
    final /* synthetic */ C2310g9 f9260b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2518z8(C2310g9 c2310g9, String str) {
        this.f9260b = c2310g9;
        this.f9259a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2392o3
    /* renamed from: a */
    public final void mo9447a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f9260b.m9599p(i10, th, bArr, this.f9259a);
    }
}
