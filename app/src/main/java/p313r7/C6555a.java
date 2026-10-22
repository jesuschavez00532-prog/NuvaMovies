package p313r7;

import af.C0236b;
import af.C0239e;
import af.InterfaceC0237c;
import af.InterfaceC0238d;
import com.interactive.brasiliptv.p061ui.activity.WelcomeActivity;
import com.module.event.EnterHomeAct;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r7.a */
/* loaded from: classes.dex */
public class C6555a implements InterfaceC0238d {

    /* renamed from: a */
    private static final Map f25175a = new HashMap();

    static {
        m25613b(new C0236b(WelcomeActivity.class, true, new C0239e[]{new C0239e("enterHomeAct", EnterHomeAct.class)}));
    }

    /* renamed from: b */
    private static void m25613b(InterfaceC0237c interfaceC0237c) {
        f25175a.put(interfaceC0237c.mo884c(), interfaceC0237c);
    }

    @Override // af.InterfaceC0238d
    /* renamed from: a */
    public InterfaceC0237c mo887a(Class cls) {
        InterfaceC0237c interfaceC0237c = (InterfaceC0237c) f25175a.get(cls);
        if (interfaceC0237c != null) {
            return interfaceC0237c;
        }
        return null;
    }
}
