package ne;

import se.InterfaceC6864a;
import se.InterfaceC6869f;

/* renamed from: ne.p */
/* loaded from: classes3.dex */
public abstract class AbstractC5873p extends AbstractC5860c implements InterfaceC6869f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC5873p(java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r7 = this;
            r0 = 1
            r12 = r12 & r0
            if (r12 != r0) goto L6
            r6 = 1
            goto L8
        L6:
            r0 = 0
            r6 = 0
        L8:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.AbstractC5873p.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5873p) {
            AbstractC5873p abstractC5873p = (AbstractC5873p) obj;
            if (m23662i().equals(abstractC5873p.m23662i()) && m23661g().equals(abstractC5873p.m23661g()) && m23664k().equals(abstractC5873p.m23664k()) && AbstractC5868k.m23669a(m23660e(), abstractC5873p.m23660e())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC6869f)) {
            return false;
        }
        return obj.equals(m23658a());
    }

    public int hashCode() {
        return (((m23662i().hashCode() * 31) + m23661g().hashCode()) * 31) + m23664k().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public InterfaceC6869f m23688l() {
        return (InterfaceC6869f) super.m23663j();
    }

    public String toString() {
        InterfaceC6864a m23658a = m23658a();
        if (m23658a != this) {
            return m23658a.toString();
        }
        return "property " + m23661g() + " (Kotlin reflection is not available)";
    }
}
