package p165he;

import java.lang.reflect.Method;
import ne.AbstractC5868k;
import pe.AbstractC6291c;
import pe.C6290b;

/* renamed from: he.a */
/* loaded from: classes3.dex */
public class C4818a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: he.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f20289a = new a();

        /* renamed from: b */
        public static final Method f20290b;

        /* renamed from: c */
        public static final Method f20291c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            /*
                he.a$a r0 = new he.a$a
                r0.<init>()
                p165he.C4818a.a.f20289a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                ne.AbstractC5868k.m23673e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = ne.AbstractC5868k.m23669a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                ne.AbstractC5868k.m23673e(r7, r8)
                java.lang.Object r7 = p043ce.AbstractC1488d.m6946h(r7)
                boolean r7 = ne.AbstractC5868k.m23669a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                p165he.C4818a.a.f20290b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = ne.AbstractC5868k.m23669a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                p165he.C4818a.a.f20291c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p165he.C4818a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: a */
    public void mo19904a(Throwable th, Throwable th2) {
        AbstractC5868k.m23674f(th, "cause");
        AbstractC5868k.m23674f(th2, "exception");
        Method method = a.f20290b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public AbstractC6291c mo19905b() {
        return new C6290b();
    }
}
