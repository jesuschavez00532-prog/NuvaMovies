package p364v3;

import javax.inject.Provider;
import p349u3.InterfaceC7031a;

/* renamed from: v3.a */
/* loaded from: classes.dex */
public final class C7198a implements Provider, InterfaceC7031a {

    /* renamed from: c */
    private static final Object f26965c = new Object();

    /* renamed from: a */
    private volatile Provider f26966a;

    /* renamed from: b */
    private volatile Object f26967b = f26965c;

    private C7198a(Provider provider) {
        this.f26966a = provider;
    }

    /* renamed from: a */
    public static InterfaceC7031a m27889a(Provider provider) {
        if (provider instanceof InterfaceC7031a) {
            return (InterfaceC7031a) provider;
        }
        return new C7198a((Provider) AbstractC7201d.m27894b(provider));
    }

    /* renamed from: b */
    public static Provider m27890b(Provider provider) {
        AbstractC7201d.m27894b(provider);
        if (provider instanceof C7198a) {
            return provider;
        }
        return new C7198a(provider);
    }

    /* renamed from: c */
    public static Object m27891c(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj != f26965c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f26967b;
        Object obj2 = f26965c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f26967b;
                if (obj == obj2) {
                    obj = this.f26966a.get();
                    this.f26967b = m27891c(this.f26967b, obj);
                    this.f26966a = null;
                }
            }
        }
        return obj;
    }
}
