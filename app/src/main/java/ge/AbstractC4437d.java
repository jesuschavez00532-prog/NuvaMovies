package ge;

import ee.InterfaceC4181d;
import ee.InterfaceC4182e;
import ee.InterfaceC4184g;
import ne.AbstractC5868k;

/* renamed from: ge.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4437d extends AbstractC4434a {

    /* renamed from: b */
    private final InterfaceC4184g f19253b;

    /* renamed from: c */
    private transient InterfaceC4181d f19254c;

    public AbstractC4437d(InterfaceC4181d interfaceC4181d, InterfaceC4184g interfaceC4184g) {
        super(interfaceC4181d);
        this.f19253b = interfaceC4184g;
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        InterfaceC4184g interfaceC4184g = this.f19253b;
        AbstractC5868k.m23671c(interfaceC4184g);
        return interfaceC4184g;
    }

    @Override // ge.AbstractC4434a
    /* renamed from: m */
    protected void mo18625m() {
        InterfaceC4181d interfaceC4181d = this.f19254c;
        if (interfaceC4181d != null && interfaceC4181d != this) {
            InterfaceC4184g.b bVar = mo17487e().get(InterfaceC4182e.f18296d0);
            AbstractC5868k.m23671c(bVar);
            ((InterfaceC4182e) bVar).mo17489s(interfaceC4181d);
        }
        this.f19254c = C4436c.f19252a;
    }

    /* renamed from: n */
    public final InterfaceC4181d m18627n() {
        InterfaceC4181d interfaceC4181d = this.f19254c;
        if (interfaceC4181d == null) {
            InterfaceC4182e interfaceC4182e = (InterfaceC4182e) mo17487e().get(InterfaceC4182e.f18296d0);
            if (interfaceC4182e == null || (interfaceC4181d = interfaceC4182e.mo17488n(this)) == null) {
                interfaceC4181d = this;
            }
            this.f19254c = interfaceC4181d;
        }
        return interfaceC4181d;
    }

    public AbstractC4437d(InterfaceC4181d interfaceC4181d) {
        this(interfaceC4181d, interfaceC4181d != null ? interfaceC4181d.mo17487e() : null);
    }
}
