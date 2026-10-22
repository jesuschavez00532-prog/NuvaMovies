package p422z1;

import java.util.ArrayList;
import java.util.List;
import p184j1.InterfaceC4973d;

/* renamed from: z1.a */
/* loaded from: classes.dex */
public class C7738a {

    /* renamed from: a */
    private final List f28485a = new ArrayList();

    /* renamed from: z1.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final Class f28486a;

        /* renamed from: b */
        final InterfaceC4973d f28487b;

        a(Class cls, InterfaceC4973d interfaceC4973d) {
            this.f28486a = cls;
            this.f28487b = interfaceC4973d;
        }

        /* renamed from: a */
        boolean m29921a(Class cls) {
            return this.f28486a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m29919a(Class cls, InterfaceC4973d interfaceC4973d) {
        this.f28485a.add(new a(cls, interfaceC4973d));
    }

    /* renamed from: b */
    public synchronized InterfaceC4973d m29920b(Class cls) {
        for (a aVar : this.f28485a) {
            if (aVar.m29921a(cls)) {
                return aVar.f28487b;
            }
        }
        return null;
    }
}
