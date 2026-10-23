package p039c7;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p366v5.C7216d;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;
import p366v5.InterfaceC7225j;

/* renamed from: c7.b */
/* loaded from: classes.dex */
public class C1395b implements InterfaceC7225j {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m6437c(String str, C7216d c7216d, InterfaceC7218e interfaceC7218e) {
        try {
            AbstractC1396c.m6440b(str);
            return c7216d.m27917f().mo5191a(interfaceC7218e);
        } finally {
            AbstractC1396c.m6439a();
        }
    }

    @Override // p366v5.InterfaceC7225j
    /* renamed from: a */
    public List mo6438a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C7216d c7216d : componentRegistrar.getComponents()) {
            final String m27918g = c7216d.m27918g();
            if (m27918g != null) {
                c7216d = c7216d.m27924r(new InterfaceC7223h() { // from class: c7.a
                    @Override // p366v5.InterfaceC7223h
                    /* renamed from: a */
                    public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                        Object m6437c = null;
                        m6437c = C1395b.m6437c(m27918g, c7216d, interfaceC7218e);
                        return m6437c;
                    }
                });
            }
            arrayList.add(c7216d);
        }
        return arrayList;
    }
}
