package je;

import ie.C4932a;
import p304qe.C6489b;
import pe.AbstractC6291c;

/* renamed from: je.a */
/* loaded from: classes3.dex */
public class C5071a extends C4932a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: je.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f20891a = new a();

        /* renamed from: b */
        public static final Integer f20892b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        static {
            /*
                je.a$a r0 = new je.a$a
                r0.<init>()
                je.C5071a.a.f20891a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L20
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
            L20:
                r1 = r0
            L21:
                if (r1 == 0) goto L2f
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2b
                r2 = 1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                if (r2 == 0) goto L2f
                r0 = r1
            L2f:
                je.C5071a.a.f20892b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.C5071a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m20544c(int i10) {
        Integer num = a.f20892b;
        if (num != null && num.intValue() < i10) {
            return false;
        }
        return true;
    }

    @Override // p165he.C4818a
    /* renamed from: b */
    public AbstractC6291c mo19905b() {
        if (m20544c(34)) {
            return new C6489b();
        }
        return super.mo19905b();
    }
}
