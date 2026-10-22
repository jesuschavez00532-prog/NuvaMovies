package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes.dex */
public final class C1898e1 {

    /* renamed from: a */
    final C2142u3 f7710a;

    /* renamed from: b */
    C2158v4 f7711b;

    /* renamed from: c */
    final C1864c f7712c;

    /* renamed from: d */
    private final C1927fe f7713d;

    public C1898e1() {
        C2142u3 c2142u3 = new C2142u3();
        this.f7710a = c2142u3;
        this.f7711b = c2142u3.f8142b.m9026a();
        this.f7712c = new C1864c();
        this.f7713d = new C1927fe();
        c2142u3.f8144d.m9360a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1898e1.this.m8278b();
            }
        });
        c2142u3.f8144d.m9360a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2177w8(C1898e1.this.f7712c);
            }
        });
    }

    /* renamed from: a */
    public final C1864c m8277a() {
        return this.f7712c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ AbstractC1973j m8278b() {
        return new C1863be(this.f7713d);
    }

    /* renamed from: c */
    public final void m8279c(C2054o5 c2054o5) {
        AbstractC1973j abstractC1973j;
        try {
            this.f7711b = this.f7710a.f8142b.m9026a();
            if (!(this.f7710a.m9007a(this.f7711b, (C2129t5[]) c2054o5.m8753z().toArray(new C2129t5[0])) instanceof C1943h)) {
                for (C2024m5 c2024m5 : c2054o5.m8752x().m8580A()) {
                    List m8699z = c2024m5.m8699z();
                    String m8698y = c2024m5.m8698y();
                    Iterator it = m8699z.iterator();
                    while (it.hasNext()) {
                        InterfaceC2078q m9007a = this.f7710a.m9007a(this.f7711b, (C2129t5) it.next());
                        if (m9007a instanceof C2033n) {
                            C2158v4 c2158v4 = this.f7711b;
                            if (!c2158v4.m9033h(m8698y)) {
                                abstractC1973j = null;
                            } else {
                                InterfaceC2078q m9029d = c2158v4.m9029d(m8698y);
                                if (m9029d instanceof AbstractC1973j) {
                                    abstractC1973j = (AbstractC1973j) m9029d;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(m8698y)));
                                }
                            }
                            if (abstractC1973j != null) {
                                abstractC1973j.mo8107a(this.f7711b, Collections.singletonList(m9007a));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(m8698y)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C1835a2(th);
        }
    }

    /* renamed from: d */
    public final void m8280d(String str, Callable callable) {
        this.f7710a.f8144d.m9360a(str, callable);
    }

    /* renamed from: e */
    public final boolean m8281e(C1848b c1848b) {
        try {
            this.f7712c.m8156d(c1848b);
            this.f7710a.f8143c.m9032g("runtime.counter", new C1958i(Double.valueOf(0.0d)));
            this.f7713d.m8403b(this.f7711b.m9026a(), this.f7712c);
            if (!m8283g()) {
                if (!m8282f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new C1835a2(th);
        }
    }

    /* renamed from: f */
    public final boolean m8282f() {
        if (!this.f7712c.m8155c().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m8283g() {
        C1864c c1864c = this.f7712c;
        if (!c1864c.m8154b().equals(c1864c.m8153a())) {
            return true;
        }
        return false;
    }
}
