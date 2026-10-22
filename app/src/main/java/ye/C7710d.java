package ye;

import af.InterfaceC0238d;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p434ze.C7790a;
import ye.InterfaceC7713g;
import ye.InterfaceC7714h;

/* renamed from: ye.d */
/* loaded from: classes.dex */
public class C7710d {

    /* renamed from: m */
    private static final ExecutorService f28355m = Executors.newCachedThreadPool();

    /* renamed from: e */
    boolean f28360e;

    /* renamed from: g */
    boolean f28362g;

    /* renamed from: h */
    boolean f28363h;

    /* renamed from: j */
    List f28365j;

    /* renamed from: k */
    InterfaceC7713g f28366k;

    /* renamed from: l */
    InterfaceC7714h f28367l;

    /* renamed from: a */
    boolean f28356a = true;

    /* renamed from: b */
    boolean f28357b = true;

    /* renamed from: c */
    boolean f28358c = true;

    /* renamed from: d */
    boolean f28359d = true;

    /* renamed from: f */
    boolean f28361f = true;

    /* renamed from: i */
    ExecutorService f28364i = f28355m;

    /* renamed from: c */
    static Object m29808c() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C7710d m29809a(InterfaceC0238d interfaceC0238d) {
        if (this.f28365j == null) {
            this.f28365j = new ArrayList();
        }
        this.f28365j.add(interfaceC0238d);
        return this;
    }

    /* renamed from: b */
    public C7709c m29810b() {
        return new C7709c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC7713g m29811d() {
        InterfaceC7713g interfaceC7713g = this.f28366k;
        if (interfaceC7713g != null) {
            return interfaceC7713g;
        }
        return InterfaceC7713g.a.m29816a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InterfaceC7714h m29812e() {
        Object m29808c;
        InterfaceC7714h interfaceC7714h = this.f28367l;
        if (interfaceC7714h != null) {
            return interfaceC7714h;
        }
        if (!C7790a.m30173c() || (m29808c = m29808c()) == null) {
            return null;
        }
        return new InterfaceC7714h.a((Looper) m29808c);
    }

    /* renamed from: f */
    public C7709c m29813f() {
        C7709c c7709c;
        synchronized (C7709c.class) {
            if (C7709c.f28326s == null) {
                C7709c.f28326s = m29810b();
                c7709c = C7709c.f28326s;
            } else {
                throw new C7711e("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return c7709c;
    }
}
