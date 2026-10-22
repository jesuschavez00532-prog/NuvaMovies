package ne;

import se.InterfaceC6865b;
import se.InterfaceC6866c;
import se.InterfaceC6867d;
import se.InterfaceC6868e;

/* renamed from: ne.w */
/* loaded from: classes3.dex */
public class C5880w {
    /* renamed from: a */
    public InterfaceC6867d m23695a(AbstractC5866i abstractC5866i) {
        return abstractC5866i;
    }

    /* renamed from: b */
    public InterfaceC6865b m23696b(Class cls) {
        return new C5862e(cls);
    }

    /* renamed from: c */
    public InterfaceC6866c m23697c(Class cls, String str) {
        return new C5870m(cls, str);
    }

    /* renamed from: d */
    public InterfaceC6868e m23698d(AbstractC5871n abstractC5871n) {
        return abstractC5871n;
    }

    /* renamed from: e */
    public String m23699e(InterfaceC5865h interfaceC5865h) {
        String obj = interfaceC5865h.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: f */
    public String m23700f(AbstractC5869l abstractC5869l) {
        return m23699e(abstractC5869l);
    }
}
