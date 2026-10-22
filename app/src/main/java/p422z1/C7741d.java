package p422z1;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p109e2.C4120j;
import p214l.C5303a;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public class C7741d {

    /* renamed from: a */
    private final AtomicReference f28492a = new AtomicReference();

    /* renamed from: b */
    private final C5303a f28493b = new C5303a();

    /* renamed from: a */
    public List m29928a(Class cls, Class cls2, Class cls3) {
        List list;
        C4120j c4120j = (C4120j) this.f28492a.getAndSet(null);
        if (c4120j == null) {
            c4120j = new C4120j(cls, cls2, cls3);
        } else {
            c4120j.m17222a(cls, cls2, cls3);
        }
        synchronized (this.f28493b) {
            list = (List) this.f28493b.get(c4120j);
        }
        this.f28492a.set(c4120j);
        return list;
    }

    /* renamed from: b */
    public void m29929b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f28493b) {
            this.f28493b.put(new C4120j(cls, cls2, cls3), list);
        }
    }
}
