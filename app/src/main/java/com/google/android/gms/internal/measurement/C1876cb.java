package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.cb */
/* loaded from: classes.dex */
final class C1876cb extends AbstractC1892db {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1876cb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: a */
    public final double mo8142a(Object obj, long j10) {
        return Double.longBitsToDouble(m8255k(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: b */
    public final float mo8143b(Object obj, long j10) {
        return Float.intBitsToFloat(m8254j(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: c */
    public final void mo8144c(Object obj, long j10, boolean z10) {
        if (AbstractC1908eb.f7727h) {
            AbstractC1908eb.m8302d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1908eb.m8303e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: d */
    public final void mo8145d(Object obj, long j10, byte b10) {
        if (AbstractC1908eb.f7727h) {
            AbstractC1908eb.m8302d(obj, j10, b10);
        } else {
            AbstractC1908eb.m8303e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: e */
    public final void mo8146e(Object obj, long j10, double d10) {
        m8259o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: f */
    public final void mo8147f(Object obj, long j10, float f10) {
        m8258n(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1892db
    /* renamed from: g */
    public final boolean mo8148g(Object obj, long j10) {
        if (AbstractC1908eb.f7727h) {
            return AbstractC1908eb.m8323y(obj, j10);
        }
        return AbstractC1908eb.m8324z(obj, j10);
    }
}
