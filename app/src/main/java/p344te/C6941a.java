package p344te;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import ne.AbstractC5868k;

/* renamed from: te.a */
/* loaded from: classes3.dex */
public final class C6941a implements InterfaceC6942b {

    /* renamed from: a */
    private final AtomicReference f26311a;

    public C6941a(InterfaceC6942b interfaceC6942b) {
        AbstractC5868k.m23674f(interfaceC6942b, "sequence");
        this.f26311a = new AtomicReference(interfaceC6942b);
    }

    @Override // p344te.InterfaceC6942b
    public Iterator iterator() {
        InterfaceC6942b interfaceC6942b = (InterfaceC6942b) this.f26311a.getAndSet(null);
        if (interfaceC6942b != null) {
            return interfaceC6942b.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
