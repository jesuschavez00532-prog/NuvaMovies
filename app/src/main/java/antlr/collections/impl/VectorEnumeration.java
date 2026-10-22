package antlr.collections.impl;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class VectorEnumeration implements Enumeration {

    /* renamed from: i */
    int f4250i = 0;
    Vector vector;

    VectorEnumeration(Vector vector) {
        this.vector = vector;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        boolean z10;
        synchronized (this.vector) {
            if (this.f4250i <= this.vector.lastElement) {
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
            int i10 = this.f4250i;
            Vector vector = this.vector;
            if (i10 <= vector.lastElement) {
                Object[] objArr = vector.data;
                this.f4250i = i10 + 1;
                obj = objArr[i10];
            } else {
                throw new NoSuchElementException("VectorEnumerator");
            }
        }
        return obj;
    }
}
