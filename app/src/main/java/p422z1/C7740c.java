package p422z1;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p109e2.C4120j;
import p214l.C5303a;
import p216l1.C5322i;
import p216l1.C5333t;
import p391x1.C7490g;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public class C7740c {

    /* renamed from: c */
    private static final C5333t f28489c = new C5333t(Object.class, Object.class, Object.class, Collections.singletonList(new C5322i(Object.class, Object.class, Object.class, Collections.emptyList(), new C7490g(), null)), null);

    /* renamed from: a */
    private final C5303a f28490a = new C5303a();

    /* renamed from: b */
    private final AtomicReference f28491b = new AtomicReference();

    /* renamed from: b */
    private C4120j m29924b(Class cls, Class cls2, Class cls3) {
        C4120j c4120j = (C4120j) this.f28491b.getAndSet(null);
        if (c4120j == null) {
            c4120j = new C4120j();
        }
        c4120j.m17222a(cls, cls2, cls3);
        return c4120j;
    }

    /* renamed from: a */
    public C5333t m29925a(Class cls, Class cls2, Class cls3) {
        C5333t c5333t;
        C4120j m29924b = m29924b(cls, cls2, cls3);
        synchronized (this.f28490a) {
            c5333t = (C5333t) this.f28490a.get(m29924b);
        }
        this.f28491b.set(m29924b);
        return c5333t;
    }

    /* renamed from: c */
    public boolean m29926c(C5333t c5333t) {
        return f28489c.equals(c5333t);
    }

    /* renamed from: d */
    public void m29927d(Class cls, Class cls2, Class cls3, C5333t c5333t) {
        synchronized (this.f28490a) {
            C5303a c5303a = this.f28490a;
            C4120j c4120j = new C4120j(cls, cls2, cls3);
            if (c5333t == null) {
                c5333t = f28489c;
            }
            c5303a.put(c4120j, c5333t);
        }
    }
}
