package com.google.android.gms.measurement.internal;

import java.util.Map;
import p025b5.AbstractC1110h;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* loaded from: classes.dex */
final class RunnableC2403p3 implements Runnable {

    /* renamed from: a */
    private final InterfaceC2392o3 f8915a;

    /* renamed from: b */
    private final int f8916b;

    /* renamed from: c */
    private final Throwable f8917c;

    /* renamed from: d */
    private final byte[] f8918d;

    /* renamed from: e */
    private final String f8919e;

    /* renamed from: f */
    private final Map f8920f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC2403p3(String str, InterfaceC2392o3 interfaceC2392o3, int i10, Throwable th, byte[] bArr, Map map, AbstractC1110h abstractC1110h) {
        AbstractC5391n.m21783i(interfaceC2392o3);
        this.f8915a = interfaceC2392o3;
        this.f8916b = i10;
        this.f8917c = th;
        this.f8918d = bArr;
        this.f8919e = str;
        this.f8920f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8915a.mo9447a(this.f8919e, this.f8916b, this.f8917c, this.f8918d, this.f8920f);
    }
}
