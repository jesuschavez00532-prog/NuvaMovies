package af;

import org.greenrobot.eventbus.ThreadMode;
import ye.C7711e;
import ye.C7721o;

/* renamed from: af.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0235a implements InterfaceC0237c {

    /* renamed from: a */
    private final Class f750a;

    /* renamed from: b */
    private final Class f751b;

    /* renamed from: c */
    private final boolean f752c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0235a(Class cls, Class cls2, boolean z10) {
        this.f750a = cls;
        this.f751b = cls2;
        this.f752c = z10;
    }

    @Override // af.InterfaceC0237c
    /* renamed from: b */
    public InterfaceC0237c mo883b() {
        Class cls = this.f751b;
        if (cls == null) {
            return null;
        }
        try {
            return (InterfaceC0237c) cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // af.InterfaceC0237c
    /* renamed from: c */
    public Class mo884c() {
        return this.f750a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public C7721o m885d(String str, Class cls, ThreadMode threadMode, int i10, boolean z10) {
        try {
            return new C7721o(this.f750a.getDeclaredMethod(str, cls), cls, threadMode, i10, z10);
        } catch (NoSuchMethodException e10) {
            throw new C7711e("Could not find subscriber method in " + this.f750a + ". Maybe a missing ProGuard rule?", e10);
        }
    }
}
