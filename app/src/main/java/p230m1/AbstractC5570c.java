package p230m1;

import java.util.Queue;
import p109e2.AbstractC4122l;

/* renamed from: m1.c */
/* loaded from: classes.dex */
abstract class AbstractC5570c {

    /* renamed from: a */
    private final Queue f22576a = AbstractC4122l.m17234g(20);

    /* renamed from: a */
    abstract InterfaceC5580m mo22612a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC5580m m22613b() {
        InterfaceC5580m interfaceC5580m = (InterfaceC5580m) this.f22576a.poll();
        if (interfaceC5580m == null) {
            return mo22612a();
        }
        return interfaceC5580m;
    }

    /* renamed from: c */
    public void m22614c(InterfaceC5580m interfaceC5580m) {
        if (this.f22576a.size() < 20) {
            this.f22576a.offer(interfaceC5580m);
        }
    }
}
