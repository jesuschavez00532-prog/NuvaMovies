package ge;

import ee.InterfaceC4181d;
import ne.AbstractC5868k;
import ne.AbstractC5879v;
import ne.InterfaceC5865h;

/* renamed from: ge.k */
/* loaded from: classes3.dex */
public abstract class AbstractC4444k extends AbstractC4443j implements InterfaceC5865h {

    /* renamed from: b */
    private final int f19261b;

    public AbstractC4444k(int i10, InterfaceC4181d interfaceC4181d) {
        super(interfaceC4181d);
        this.f19261b = i10;
    }

    @Override // ne.InterfaceC5865h
    public int getArity() {
        return this.f19261b;
    }

    @Override // ge.AbstractC4434a
    public String toString() {
        if (m18623i() == null) {
            String m23693e = AbstractC5879v.m23693e(this);
            AbstractC5868k.m23673e(m23693e, "renderLambdaToString(this)");
            return m23693e;
        }
        return super.toString();
    }
}
