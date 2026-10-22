package p231m2;

import p244n2.C5734a;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public abstract class AbstractC5584b {

    /* renamed from: a */
    private static InterfaceC5583a f22615a;

    /* renamed from: a */
    public static void m22679a(Throwable th, String str) {
        InterfaceC5583a interfaceC5583a = f22615a;
        if (interfaceC5583a == null) {
            return;
        }
        interfaceC5583a.mo22678a(new C5734a(str, th));
    }

    /* renamed from: b */
    public static void m22680b(InterfaceC5583a interfaceC5583a) {
        if (interfaceC5583a == null) {
            return;
        }
        f22615a = interfaceC5583a;
    }
}
