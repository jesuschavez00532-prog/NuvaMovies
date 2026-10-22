package antlr.collections.impl;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class IndexedVector {
    protected Vector elements;
    protected Hashtable index;

    public IndexedVector() {
        this.elements = new Vector(10);
        this.index = new Hashtable(10);
    }

    public synchronized void appendElement(Object obj, Object obj2) {
        this.elements.appendElement(obj2);
        this.index.put(obj, obj2);
    }

    public Object elementAt(int i10) {
        return this.elements.elementAt(i10);
    }

    public Enumeration elements() {
        return this.elements.elements();
    }

    public Object getElement(Object obj) {
        return this.index.get(obj);
    }

    public synchronized boolean removeElement(Object obj) {
        Object obj2 = this.index.get(obj);
        if (obj2 == null) {
            return false;
        }
        this.index.remove(obj);
        this.elements.removeElement(obj2);
        return false;
    }

    public int size() {
        return this.elements.size();
    }

    public IndexedVector(int i10) {
        this.elements = new Vector(i10);
        this.index = new Hashtable(i10);
    }
}
