package p422z1;

import java.util.ArrayList;
import java.util.List;
import p184j1.InterfaceC4980k;

/* renamed from: z1.f */
/* loaded from: classes.dex */
public class C7743f {

    /* renamed from: a */
    private final List f28499a = new ArrayList();

    /* renamed from: z1.f$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final Class f28500a;

        /* renamed from: b */
        final InterfaceC4980k f28501b;

        a(Class cls, InterfaceC4980k interfaceC4980k) {
            this.f28500a = cls;
            this.f28501b = interfaceC4980k;
        }

        /* renamed from: a */
        boolean m29938a(Class cls) {
            return this.f28500a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m29936a(Class cls, InterfaceC4980k interfaceC4980k) {
        this.f28499a.add(new a(cls, interfaceC4980k));
    }

    /* renamed from: b */
    public synchronized InterfaceC4980k m29937b(Class cls) {
        int size = this.f28499a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f28499a.get(i10);
            if (aVar.m29938a(cls)) {
                return aVar.f28501b;
            }
        }
        return null;
    }
}
