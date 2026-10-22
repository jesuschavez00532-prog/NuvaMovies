package ne;

import java.io.Serializable;

/* renamed from: ne.l */
/* loaded from: classes.dex */
public abstract class AbstractC5869l implements InterfaceC5865h, Serializable {
    private final int arity;

    public AbstractC5869l(int i10) {
        this.arity = i10;
    }

    @Override // ne.InterfaceC5865h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m23694f = AbstractC5879v.m23694f(this);
        AbstractC5868k.m23673e(m23694f, "renderLambdaToString(this)");
        return m23694f;
    }
}
