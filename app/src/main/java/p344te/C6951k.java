package p344te;

import java.util.Iterator;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;

/* renamed from: te.k */
/* loaded from: classes3.dex */
public final class C6951k implements InterfaceC6942b {

    /* renamed from: a */
    private final InterfaceC6942b f26319a;

    /* renamed from: b */
    private final InterfaceC5660l f26320b;

    /* renamed from: te.k$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator, InterfaceC5974a {

        /* renamed from: a */
        private final Iterator f26321a;

        a() {
            this.f26321a = C6951k.this.f26319a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26321a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C6951k.this.f26320b.mo542f(this.f26321a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6951k(InterfaceC6942b interfaceC6942b, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC6942b, "sequence");
        AbstractC5868k.m23674f(interfaceC5660l, "transformer");
        this.f26319a = interfaceC6942b;
        this.f26320b = interfaceC5660l;
    }

    @Override // p344te.InterfaceC6942b
    public Iterator iterator() {
        return new a();
    }
}
