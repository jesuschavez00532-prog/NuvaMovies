package ve;

import ee.InterfaceC4182e;
import ee.InterfaceC4184g;
import kotlinx.coroutines.scheduling.C5290c;

/* renamed from: ve.w */
/* loaded from: classes3.dex */
public abstract class AbstractC7326w {

    /* renamed from: a */
    private static final boolean f27233a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r0.equals("on") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0.equals("") != false) goto L19;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.AbstractC5281t.m21249d(r0)
            if (r0 != 0) goto L9
            goto L33
        L9:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L22
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L37
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            r0 = 0
            goto L34
        L22:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            goto L33
        L2b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
        L33:
            r0 = 1
        L34:
            ve.AbstractC7326w.f27233a = r0
            return
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.AbstractC7326w.<clinit>():void");
    }

    /* renamed from: a */
    public static final AbstractC7329x m28308a() {
        if (f27233a) {
            return C5290c.f21546i;
        }
        return C7305p.f27202e;
    }

    /* renamed from: b */
    public static final String m28309b(InterfaceC4184g interfaceC4184g) {
        return null;
    }

    /* renamed from: c */
    public static final InterfaceC4184g m28310c(InterfaceC7261a0 interfaceC7261a0, InterfaceC4184g interfaceC4184g) {
        InterfaceC4184g plus = interfaceC7261a0.mo28099i().plus(interfaceC4184g);
        if (plus != C7297m0.m28251a() && plus.get(InterfaceC4182e.f18296d0) == null) {
            return plus.plus(C7297m0.m28251a());
        }
        return plus;
    }
}
