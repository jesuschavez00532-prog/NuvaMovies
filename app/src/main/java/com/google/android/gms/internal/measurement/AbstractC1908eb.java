package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.eb */
/* loaded from: classes.dex */
abstract class AbstractC1908eb {

    /* renamed from: a */
    private static final Unsafe f7720a;

    /* renamed from: b */
    private static final Class f7721b;

    /* renamed from: c */
    private static final boolean f7722c;

    /* renamed from: d */
    private static final AbstractC1892db f7723d;

    /* renamed from: e */
    private static final boolean f7724e;

    /* renamed from: f */
    private static final boolean f7725f;

    /* renamed from: g */
    static final long f7726g;

    /* renamed from: h */
    static final boolean f7727h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1908eb.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    static boolean m8294A(Class cls) {
        int i10 = AbstractC2056o7.f7980a;
        try {
            Class cls2 = f7721b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m8295B(Object obj, long j10) {
        return f7723d.mo8148g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m8296C() {
        return f7725f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m8297D() {
        return f7724e;
    }

    /* renamed from: E */
    private static int m8298E(Class cls) {
        if (f7725f) {
            return f7723d.m8252h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m8299a(Class cls) {
        if (f7725f) {
            return f7723d.m8253i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m8300b() {
        int i10 = AbstractC2056o7.f7980a;
        Field m8301c = m8301c(Buffer.class, "effectiveDirectAddress");
        if (m8301c == null) {
            Field m8301c2 = m8301c(Buffer.class, "address");
            if (m8301c2 != null && m8301c2.getType() == Long.TYPE) {
                return m8301c2;
            }
            return null;
        }
        return m8301c;
    }

    /* renamed from: c */
    private static Field m8301c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m8302d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC1892db abstractC1892db = f7723d;
        int i10 = ((((int) j10) ^ (-1)) & 3) << 3;
        abstractC1892db.m8258n(obj, j11, ((255 & b10) << i10) | (abstractC1892db.m8254j(obj, j11) & ((255 << i10) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m8303e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC1892db abstractC1892db = f7723d;
        int i10 = (((int) j10) & 3) << 3;
        abstractC1892db.m8258n(obj, j11, ((255 & b10) << i10) | (abstractC1892db.m8254j(obj, j11) & ((255 << i10) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m8304f(Object obj, long j10) {
        return f7723d.mo8142a(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m8305g(Object obj, long j10) {
        return f7723d.mo8143b(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8306h(Object obj, long j10) {
        return f7723d.m8254j(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m8307i(Object obj, long j10) {
        return f7723d.m8255k(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object m8308j(Class cls) {
        try {
            return f7720a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m8309k(Object obj, long j10) {
        return f7723d.m8257m(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Unsafe m8310l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1844ab());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m8311m(Throwable th) {
        Logger.getLogger(AbstractC1908eb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m8316r(Object obj, long j10, boolean z10) {
        f7723d.mo8144c(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m8317s(byte[] bArr, long j10, byte b10) {
        f7723d.mo8145d(bArr, f7726g + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m8318t(Object obj, long j10, double d10) {
        f7723d.mo8146e(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m8319u(Object obj, long j10, float f10) {
        f7723d.mo8147f(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m8320v(Object obj, long j10, int i10) {
        f7723d.m8258n(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m8321w(Object obj, long j10, long j11) {
        f7723d.m8259o(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m8322x(Object obj, long j10, Object obj2) {
        f7723d.m8260p(obj, j10, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m8323y(Object obj, long j10) {
        if (((byte) ((f7723d.m8254j(obj, (-4) & j10) >>> ((int) (((j10 ^ (-1)) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m8324z(Object obj, long j10) {
        if (((byte) ((f7723d.m8254j(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
