package antlr.collections.impl;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class VectorEnumerator implements Enumeration {

    /* renamed from: i */
    int f4251i = 0;
    Vector vector;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VectorEnumerator(Vector vector) {
        this.vector = vector;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        boolean z10;
        synchronized (this.vector) {
            if (this.f4251i <= this.vector.lastElement) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj;
        synchronized (this.vector) {
            int i10 = this.f4251i;
            Vector vector = this.vector;
            if (i10 <= vector.lastElement) {
                Object[] objArr = vector.data;
                this.f4251i = i10 + 1;
                obj = objArr[i10];
            } else {
                throw new NoSuchElementException("VectorEnumerator");
            }
        }
        return obj;
    }
}
