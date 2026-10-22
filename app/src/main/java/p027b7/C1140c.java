package p027b7;

import java.util.Iterator;
import java.util.Set;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

/* renamed from: b7.c */
/* loaded from: classes.dex */
public class C1140c implements InterfaceC1146i {

    /* renamed from: a */
    private final String f4468a;

    /* renamed from: b */
    private final C1141d f4469b;

    C1140c(Set set, C1141d c1141d) {
        this.f4468a = m5195e(set);
        this.f4469b = c1141d;
    }

    /* renamed from: c */
    public static C7216d m5193c() {
        return C7216d.m27909c(InterfaceC1146i.class).m27929b(C7233r.m27997l(AbstractC1143f.class)).m27933f(new InterfaceC7223h() { // from class: b7.b
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                InterfaceC1146i m5194d;
                m5194d = C1140c.m5194d(interfaceC7218e);
                return m5194d;
            }
        }).m27931d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC1146i m5194d(InterfaceC7218e interfaceC7218e) {
        return new C1140c(interfaceC7218e.mo27906d(AbstractC1143f.class), C1141d.m5197a());
    }

    /* renamed from: e */
    private static String m5195e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC1143f abstractC1143f = (AbstractC1143f) it.next();
            sb2.append(abstractC1143f.mo5189b());
            sb2.append('/');
            sb2.append(abstractC1143f.mo5190c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p027b7.InterfaceC1146i
    /* renamed from: a */
    public String mo5196a() {
        if (this.f4469b.m5198b().isEmpty()) {
            return this.f4468a;
        }
        return this.f4468a + ' ' + m5195e(this.f4469b.m5198b());
    }
}
