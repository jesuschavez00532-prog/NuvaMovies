package p409y3;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public abstract class AbstractC7663b {
    /* renamed from: a */
    public static Object m29465a(int i10, Object obj, InterfaceC7662a interfaceC7662a, InterfaceC7664c interfaceC7664c) {
        Object apply;
        if (i10 < 1) {
            return interfaceC7662a.apply(obj);
        }
        do {
            apply = interfaceC7662a.apply(obj);
            obj = interfaceC7664c.mo7877a(obj, apply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return apply;
    }
}
