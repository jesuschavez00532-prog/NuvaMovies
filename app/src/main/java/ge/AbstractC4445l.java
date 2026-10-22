package ge;

import ee.InterfaceC4181d;
import ne.AbstractC5868k;
import ne.AbstractC5879v;
import ne.InterfaceC5865h;

/* renamed from: ge.l */
/* loaded from: classes3.dex */
public abstract class AbstractC4445l extends AbstractC4437d implements InterfaceC5865h {

    /* renamed from: d */
    private final int f19262d;

    public AbstractC4445l(int i10, InterfaceC4181d interfaceC4181d) {
        super(interfaceC4181d);
        this.f19262d = i10;
    }

    @Override // ne.InterfaceC5865h
    public int getArity() {
        return this.f19262d;
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
