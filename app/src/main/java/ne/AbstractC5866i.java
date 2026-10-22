package ne;

import se.InterfaceC6864a;
import se.InterfaceC6867d;

/* renamed from: ne.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5866i extends AbstractC5860c implements InterfaceC5865h, InterfaceC6867d {

    /* renamed from: h */
    private final int f23404h;

    /* renamed from: i */
    private final int f23405i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC5866i(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f23404h = r9
            int r9 = r14 >> 1
            r8.f23405i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.AbstractC5866i.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // ne.AbstractC5860c
    /* renamed from: d */
    protected InterfaceC6864a mo23659d() {
        return AbstractC5879v.m23689a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5866i) {
            AbstractC5866i abstractC5866i = (AbstractC5866i) obj;
            if (m23661g().equals(abstractC5866i.m23661g()) && m23664k().equals(abstractC5866i.m23664k()) && this.f23405i == abstractC5866i.f23405i && this.f23404h == abstractC5866i.f23404h && AbstractC5868k.m23669a(m23660e(), abstractC5866i.m23660e()) && AbstractC5868k.m23669a(m23662i(), abstractC5866i.m23662i())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC6867d)) {
            return false;
        }
        return obj.equals(m23658a());
    }

    @Override // ne.InterfaceC5865h
    public int getArity() {
        return this.f23404h;
    }

    public int hashCode() {
        int hashCode;
        if (m23662i() == null) {
            hashCode = 0;
        } else {
            hashCode = m23662i().hashCode() * 31;
        }
        return ((hashCode + m23661g().hashCode()) * 31) + m23664k().hashCode();
    }

    public String toString() {
        InterfaceC6864a m23658a = m23658a();
        if (m23658a != this) {
            return m23658a.toString();
        }
        if ("<init>".equals(m23661g())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m23661g() + " (Kotlin reflection is not available)";
    }
}
