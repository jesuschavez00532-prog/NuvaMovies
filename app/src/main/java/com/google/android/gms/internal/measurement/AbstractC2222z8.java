package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.z8 */
/* loaded from: classes.dex */
public abstract class AbstractC2222z8 extends AbstractC2026m7 {
    private static final Map zza = new ConcurrentHashMap();
    protected C2164va zzc = C2164va.m9045c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public static InterfaceC1890d9 m9398k() {
        return C1842a9.m8090i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static InterfaceC1906e9 m9399l() {
        return C2133t9.m8964g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static InterfaceC1906e9 m9400m(InterfaceC1906e9 interfaceC1906e9) {
        int i10;
        int size = interfaceC1906e9.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return interfaceC1906e9.mo8095l(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static InterfaceC1922f9 m9401n() {
        return C2029ma.m8705g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static InterfaceC1922f9 m9402o(InterfaceC1922f9 interfaceC1922f9) {
        int i10;
        int size = interfaceC1922f9.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return interfaceC1922f9.mo8095l(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static Object m9403p(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static Object m9404r(InterfaceC1891da interfaceC1891da, String str, Object[] objArr) {
        return new C2044na(interfaceC1891da, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public static void m9405s(Class cls, AbstractC2222z8 abstractC2222z8) {
        zza.put(cls, abstractC2222z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC2222z8 m9406v(Class cls) {
        Map map = zza;
        AbstractC2222z8 abstractC2222z8 = (AbstractC2222z8) map.get(cls);
        if (abstractC2222z8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2222z8 = (AbstractC2222z8) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2222z8 == null) {
            abstractC2222z8 = (AbstractC2222z8) ((AbstractC2222z8) AbstractC1908eb.m8308j(cls)).mo8126w(6, null, null);
            if (abstractC2222z8 != null) {
                map.put(cls, abstractC2222z8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2222z8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1907ea
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1891da mo8293a() {
        return (AbstractC2222z8) mo8126w(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1891da
    /* renamed from: b */
    public final /* synthetic */ InterfaceC1875ca mo8248b() {
        return (AbstractC2192x8) mo8126w(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1891da
    /* renamed from: d */
    public final /* synthetic */ InterfaceC1875ca mo8249d() {
        AbstractC2192x8 abstractC2192x8 = (AbstractC2192x8) mo8126w(5, null, null);
        abstractC2192x8.m9174l(this);
        return abstractC2192x8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1891da
    /* renamed from: e */
    public final int mo8250e() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int mo8465f = C2014la.m8663a().m8664b(getClass()).mo8465f(this);
            this.zzd = mo8465f;
            return mo8465f;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2014la.m8663a().m8664b(getClass()).mo8468i(this, (AbstractC2222z8) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1891da
    /* renamed from: f */
    public final void mo8251f(AbstractC1997k8 abstractC1997k8) {
        C2014la.m8663a().m8664b(getClass()).mo8464e(this, C2012l8.m8626K(abstractC1997k8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2026m7
    /* renamed from: g */
    public final int mo8702g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int mo8463d = C2014la.m8663a().m8664b(getClass()).mo8463d(this);
        this.zzb = mo8463d;
        return mo8463d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2026m7
    /* renamed from: i */
    public final void mo8703i(int i10) {
        this.zzd = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final AbstractC2192x8 m9407t() {
        return (AbstractC2192x8) mo8126w(5, null, null);
    }

    public final String toString() {
        return AbstractC1923fa.m8388a(this, super.toString());
    }

    /* renamed from: u */
    public final AbstractC2192x8 m9408u() {
        AbstractC2192x8 abstractC2192x8 = (AbstractC2192x8) mo8126w(5, null, null);
        abstractC2192x8.m9174l(this);
        return abstractC2192x8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo8126w(int i10, Object obj, Object obj2);
}
