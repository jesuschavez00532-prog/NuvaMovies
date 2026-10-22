package antlr.collections.impl;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class Vector implements Cloneable {
    protected Object[] data;
    protected int lastElement;

    public Vector() {
        this(10);
    }

    public synchronized void appendElement(Object obj) {
        ensureCapacity(this.lastElement + 2);
        Object[] objArr = this.data;
        int i10 = this.lastElement + 1;
        this.lastElement = i10;
        objArr[i10] = obj;
    }

    public int capacity() {
        return this.data.length;
    }

    public Object clone() {
        try {
            Vector vector = (Vector) super.clone();
            Object[] objArr = new Object[size()];
            vector.data = objArr;
            System.arraycopy(this.data, 0, objArr, 0, size());
            return vector;
        } catch (CloneNotSupportedException unused) {
            System.err.println("cannot clone Vector.super");
            return null;
        }
    }

    public synchronized Object elementAt(int i10) {
        Object[] objArr;
        objArr = this.data;
        if (i10 < objArr.length) {
            if (i10 >= 0) {
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(i10);
                stringBuffer.append(" < 0 ");
                throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
            }
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(i10);
            stringBuffer2.append(" >= ");
            stringBuffer2.append(this.data.length);
            throw new ArrayIndexOutOfBoundsException(stringBuffer2.toString());
        }
        return objArr[i10];
    }

    public synchronized Enumeration elements() {
        return new VectorEnumerator(this);
    }

    public synchronized void ensureCapacity(int i10) {
        int i11 = i10 + 1;
        Object[] objArr = this.data;
        if (i11 > objArr.length) {
            int length = objArr.length * 2;
            if (i11 <= length) {
                i11 = length;
            }
            Object[] objArr2 = new Object[i11];
            this.data = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    public synchronized boolean removeElement(Object obj) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = this.lastElement;
            if (i11 > i10 || this.data[i11] == obj) {
                break;
            }
            i11++;
        }
        if (i11 > i10) {
            return false;
        }
        Object[] objArr = this.data;
        objArr[i11] = null;
        int i12 = i10 - i11;
        if (i12 > 0) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, i12);
        }
        this.lastElement--;
        return true;
    }

    public synchronized void setElementAt(Object obj, int i10) {
        Object[] objArr = this.data;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            if (i10 > this.lastElement) {
                this.lastElement = i10;
            }
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i10);
            stringBuffer.append(" >= ");
            stringBuffer.append(this.data.length);
            throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public int size() {
        return this.lastElement + 1;
    }

    public Vector(int i10) {
        this.lastElement = -1;
        this.data = new Object[i10];
    }
}
