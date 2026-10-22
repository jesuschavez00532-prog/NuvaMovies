package be;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: be.r */
/* loaded from: classes3.dex */
final class C1322r implements InterfaceC1312h, Serializable {

    /* renamed from: d */
    public static final a f4989d = new a(null);

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f4990e = AtomicReferenceFieldUpdater.newUpdater(C1322r.class, Object.class, "b");

    /* renamed from: a */
    private volatile InterfaceC5642a f4991a;

    /* renamed from: b */
    private volatile Object f4992b;

    /* renamed from: c */
    private final Object f4993c;

    /* renamed from: be.r$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public C1322r(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "initializer");
        this.f4991a = interfaceC5642a;
        C1326v c1326v = C1326v.f4997a;
        this.f4992b = c1326v;
        this.f4993c = c1326v;
    }

    /* renamed from: a */
    public boolean m5978a() {
        if (this.f4992b != C1326v.f4997a) {
            return true;
        }
        return false;
    }

    @Override // be.InterfaceC1312h
    public Object getValue() {
        Object obj = this.f4992b;
        C1326v c1326v = C1326v.f4997a;
        if (obj != c1326v) {
            return obj;
        }
        InterfaceC5642a interfaceC5642a = this.f4991a;
        if (interfaceC5642a != null) {
            Object invoke = interfaceC5642a.invoke();
            if (AbstractC1321q.m5977a(f4990e, this, c1326v, invoke)) {
                this.f4991a = null;
                return invoke;
            }
        }
        return this.f4992b;
    }

    public String toString() {
        if (m5978a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
