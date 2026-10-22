package p043ce;

import java.util.Iterator;
import p269oe.InterfaceC5974a;

/* renamed from: ce.y */
/* loaded from: classes3.dex */
public abstract class AbstractC1513y implements Iterator, InterfaceC5974a {
    /* renamed from: b */
    public abstract int mo7032b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo7032b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
