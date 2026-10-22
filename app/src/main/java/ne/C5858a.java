package ne;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p269oe.InterfaceC5974a;

/* renamed from: ne.a */
/* loaded from: classes3.dex */
final class C5858a implements Iterator, InterfaceC5974a {

    /* renamed from: a */
    private final Object[] f23386a;

    /* renamed from: b */
    private int f23387b;

    public C5858a(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "array");
        this.f23386a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f23387b < this.f23386a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f23386a;
            int i10 = this.f23387b;
            this.f23387b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23387b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
