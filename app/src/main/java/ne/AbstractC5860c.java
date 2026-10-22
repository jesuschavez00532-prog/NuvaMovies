package ne;

import java.io.Serializable;
import p226le.C5554b;
import se.InterfaceC6864a;
import se.InterfaceC6866c;

/* renamed from: ne.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5860c implements InterfaceC6864a, Serializable {

    /* renamed from: g */
    public static final Object f23388g = a.f23395a;

    /* renamed from: a */
    private transient InterfaceC6864a f23389a;

    /* renamed from: b */
    protected final Object f23390b;

    /* renamed from: c */
    private final Class f23391c;

    /* renamed from: d */
    private final String f23392d;

    /* renamed from: e */
    private final String f23393e;

    /* renamed from: f */
    private final boolean f23394f;

    /* renamed from: ne.c$a */
    /* loaded from: classes3.dex */
    private static class a implements Serializable {

        /* renamed from: a */
        private static final a f23395a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5860c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f23390b = obj;
        this.f23391c = cls;
        this.f23392d = str;
        this.f23393e = str2;
        this.f23394f = z10;
    }

    /* renamed from: a */
    public InterfaceC6864a m23658a() {
        InterfaceC6864a interfaceC6864a = this.f23389a;
        if (interfaceC6864a == null) {
            InterfaceC6864a mo23659d = mo23659d();
            this.f23389a = mo23659d;
            return mo23659d;
        }
        return interfaceC6864a;
    }

    /* renamed from: d */
    protected abstract InterfaceC6864a mo23659d();

    /* renamed from: e */
    public Object m23660e() {
        return this.f23390b;
    }

    /* renamed from: g */
    public String m23661g() {
        return this.f23392d;
    }

    /* renamed from: i */
    public InterfaceC6866c m23662i() {
        Class cls = this.f23391c;
        if (cls == null) {
            return null;
        }
        if (this.f23394f) {
            return AbstractC5879v.m23691c(cls);
        }
        return AbstractC5879v.m23690b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public InterfaceC6864a m23663j() {
        InterfaceC6864a m23658a = m23658a();
        if (m23658a != this) {
            return m23658a;
        }
        throw new C5554b();
    }

    /* renamed from: k */
    public String m23664k() {
        return this.f23393e;
    }
}
