package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p168i0.InterfaceC4840a;
import p214l.C5303a;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0855a {

    /* renamed from: a */
    protected final C5303a f3637a;

    /* renamed from: b */
    protected final C5303a f3638b;

    /* renamed from: c */
    protected final C5303a f3639c;

    public AbstractC0855a(C5303a c5303a, C5303a c5303a2, C5303a c5303a3) {
        this.f3637a = c5303a;
        this.f3638b = c5303a2;
        this.f3639c = c5303a3;
    }

    /* renamed from: N */
    private void m4396N(InterfaceC4840a interfaceC4840a) {
        try {
            mo4408I(m4397c(interfaceC4840a.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC4840a.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* renamed from: c */
    private Class m4397c(Class cls) {
        Class cls2 = (Class) this.f3639c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f3639c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m4398d(String str) {
        Method method = (Method) this.f3637a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC0855a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0855a.class);
            this.f3637a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m4399e(Class cls) {
        Method method = (Method) this.f3638b.get(cls.getName());
        if (method == null) {
            Class m4397c = m4397c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m4397c.getDeclaredMethod("write", cls, AbstractC0855a.class);
            this.f3638b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo4400A(byte[] bArr);

    /* renamed from: B */
    public void m4401B(byte[] bArr, int i10) {
        mo4432w(i10);
        mo4400A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo4402C(CharSequence charSequence);

    /* renamed from: D */
    public void m4403D(CharSequence charSequence, int i10) {
        mo4432w(i10);
        mo4402C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo4404E(int i10);

    /* renamed from: F */
    public void m4405F(int i10, int i11) {
        mo4432w(i11);
        mo4404E(i10);
    }

    /* renamed from: G */
    protected abstract void mo4406G(Parcelable parcelable);

    /* renamed from: H */
    public void m4407H(Parcelable parcelable, int i10) {
        mo4432w(i10);
        mo4406G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo4408I(String str);

    /* renamed from: J */
    public void m4409J(String str, int i10) {
        mo4432w(i10);
        mo4408I(str);
    }

    /* renamed from: K */
    protected void m4410K(InterfaceC4840a interfaceC4840a, AbstractC0855a abstractC0855a) {
        try {
            m4399e(interfaceC4840a.getClass()).invoke(null, interfaceC4840a, abstractC0855a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m4411L(InterfaceC4840a interfaceC4840a) {
        if (interfaceC4840a == null) {
            mo4408I(null);
            return;
        }
        m4396N(interfaceC4840a);
        AbstractC0855a mo4414b = mo4414b();
        m4410K(interfaceC4840a, mo4414b);
        mo4414b.mo4413a();
    }

    /* renamed from: M */
    public void m4412M(InterfaceC4840a interfaceC4840a, int i10) {
        mo4432w(i10);
        m4411L(interfaceC4840a);
    }

    /* renamed from: a */
    protected abstract void mo4413a();

    /* renamed from: b */
    protected abstract AbstractC0855a mo4414b();

    /* renamed from: f */
    public boolean m4415f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo4416g();

    /* renamed from: h */
    public boolean m4417h(boolean z10, int i10) {
        if (!mo4422m(i10)) {
            return z10;
        }
        return mo4416g();
    }

    /* renamed from: i */
    protected abstract byte[] mo4418i();

    /* renamed from: j */
    public byte[] m4419j(byte[] bArr, int i10) {
        if (!mo4422m(i10)) {
            return bArr;
        }
        return mo4418i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo4420k();

    /* renamed from: l */
    public CharSequence m4421l(CharSequence charSequence, int i10) {
        if (!mo4422m(i10)) {
            return charSequence;
        }
        return mo4420k();
    }

    /* renamed from: m */
    protected abstract boolean mo4422m(int i10);

    /* renamed from: n */
    protected InterfaceC4840a m4423n(String str, AbstractC0855a abstractC0855a) {
        try {
            return (InterfaceC4840a) m4398d(str).invoke(null, abstractC0855a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* renamed from: o */
    protected abstract int mo4424o();

    /* renamed from: p */
    public int m4425p(int i10, int i11) {
        if (!mo4422m(i11)) {
            return i10;
        }
        return mo4424o();
    }

    /* renamed from: q */
    protected abstract Parcelable mo4426q();

    /* renamed from: r */
    public Parcelable m4427r(Parcelable parcelable, int i10) {
        if (!mo4422m(i10)) {
            return parcelable;
        }
        return mo4426q();
    }

    /* renamed from: s */
    protected abstract String mo4428s();

    /* renamed from: t */
    public String m4429t(String str, int i10) {
        if (!mo4422m(i10)) {
            return str;
        }
        return mo4428s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public InterfaceC4840a m4430u() {
        String mo4428s = mo4428s();
        if (mo4428s == null) {
            return null;
        }
        return m4423n(mo4428s, mo4414b());
    }

    /* renamed from: v */
    public InterfaceC4840a m4431v(InterfaceC4840a interfaceC4840a, int i10) {
        if (!mo4422m(i10)) {
            return interfaceC4840a;
        }
        return m4430u();
    }

    /* renamed from: w */
    protected abstract void mo4432w(int i10);

    /* renamed from: x */
    public void m4433x(boolean z10, boolean z11) {
    }

    /* renamed from: y */
    protected abstract void mo4434y(boolean z10);

    /* renamed from: z */
    public void m4435z(boolean z10, int i10) {
        mo4432w(i10);
        mo4434y(z10);
    }
}
