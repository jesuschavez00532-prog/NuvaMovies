package p241n;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: n.o */
/* loaded from: classes.dex */
public abstract class AbstractC5711o {

    /* renamed from: a */
    HashSet f22924a = new HashSet(2);

    /* renamed from: b */
    int f22925b = 0;

    /* renamed from: a */
    public void m23076a(AbstractC5711o abstractC5711o) {
        this.f22924a.add(abstractC5711o);
    }

    /* renamed from: b */
    public void m23077b() {
        this.f22925b = 1;
        Iterator it = this.f22924a.iterator();
        while (it.hasNext()) {
            ((AbstractC5711o) it.next()).mo23062f();
        }
    }

    /* renamed from: c */
    public void m23078c() {
        this.f22925b = 0;
        Iterator it = this.f22924a.iterator();
        while (it.hasNext()) {
            ((AbstractC5711o) it.next()).m23078c();
        }
    }

    /* renamed from: d */
    public boolean m23079d() {
        if (this.f22925b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo23061e() {
        this.f22925b = 0;
        this.f22924a.clear();
    }

    /* renamed from: f */
    public void mo23062f() {
    }
}
