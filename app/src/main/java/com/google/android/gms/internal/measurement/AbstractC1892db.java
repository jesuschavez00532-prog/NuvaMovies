package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.db */
/* loaded from: classes.dex */
public abstract class AbstractC1892db {

    /* renamed from: a */
    final Unsafe f7704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1892db(Unsafe unsafe) {
        this.f7704a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo8142a(Object obj, long j10);

    /* renamed from: b */
    public abstract float mo8143b(Object obj, long j10);

    /* renamed from: c */
    public abstract void mo8144c(Object obj, long j10, boolean z10);

    /* renamed from: d */
    public abstract void mo8145d(Object obj, long j10, byte b10);

    /* renamed from: e */
    public abstract void mo8146e(Object obj, long j10, double d10);

    /* renamed from: f */
    public abstract void mo8147f(Object obj, long j10, float f10);

    /* renamed from: g */
    public abstract boolean mo8148g(Object obj, long j10);

    /* renamed from: h */
    public final int m8252h(Class cls) {
        return this.f7704a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m8253i(Class cls) {
        return this.f7704a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m8254j(Object obj, long j10) {
        return this.f7704a.getInt(obj, j10);
    }

    /* renamed from: k */
    public final long m8255k(Object obj, long j10) {
        return this.f7704a.getLong(obj, j10);
    }

    /* renamed from: l */
    public final long m8256l(Field field) {
        return this.f7704a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m8257m(Object obj, long j10) {
        return this.f7704a.getObject(obj, j10);
    }

    /* renamed from: n */
    public final void m8258n(Object obj, long j10, int i10) {
        this.f7704a.putInt(obj, j10, i10);
    }

    /* renamed from: o */
    public final void m8259o(Object obj, long j10, long j11) {
        this.f7704a.putLong(obj, j10, j11);
    }

    /* renamed from: p */
    public final void m8260p(Object obj, long j10, Object obj2) {
        this.f7704a.putObject(obj, j10, obj2);
    }
}
