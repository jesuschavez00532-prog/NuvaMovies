package antlr.collections.impl;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class LLEnumeration implements Enumeration {
    LLCell cursor;
    LList list;

    public LLEnumeration(LList lList) {
        this.list = lList;
        this.cursor = lList.head;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        if (this.cursor != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (hasMoreElements()) {
            LLCell lLCell = this.cursor;
            this.cursor = lLCell.next;
            return lLCell.data;
        }
        throw new NoSuchElementException();
    }
}
