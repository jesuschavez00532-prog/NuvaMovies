package p366v5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p338t6.InterfaceC6922b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v5.y */
/* loaded from: classes.dex */
public class C7240y implements InterfaceC6922b {

    /* renamed from: b */
    private volatile Set f27048b = null;

    /* renamed from: a */
    private volatile Set f27047a = Collections.newSetFromMap(new ConcurrentHashMap());

    C7240y(Collection collection) {
        this.f27047a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C7240y m28008b(Collection collection) {
        return new C7240y((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m28009d() {
        Iterator it = this.f27047a.iterator();
        while (it.hasNext()) {
            this.f27048b.add(((InterfaceC6922b) it.next()).get());
        }
        this.f27047a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m28010a(InterfaceC6922b interfaceC6922b) {
        if (this.f27048b == null) {
            this.f27047a.add(interfaceC6922b);
        } else {
            this.f27048b.add(interfaceC6922b.get());
        }
    }

    @Override // p338t6.InterfaceC6922b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f27048b == null) {
            synchronized (this) {
                if (this.f27048b == null) {
                    this.f27048b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m28009d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f27048b);
    }
}
