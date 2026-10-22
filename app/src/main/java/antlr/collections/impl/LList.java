package antlr.collections.impl;

import antlr.collections.List;
import antlr.collections.Stack;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class LList implements List, Stack {
    protected LLCell head = null;
    protected LLCell tail = null;
    protected int length = 0;

    @Override // antlr.collections.List
    public void add(Object obj) {
        append(obj);
    }

    @Override // antlr.collections.List
    public void append(Object obj) {
        LLCell lLCell = new LLCell(obj);
        int i10 = this.length;
        if (i10 == 0) {
            this.tail = lLCell;
            this.head = lLCell;
            this.length = 1;
        } else {
            this.tail.next = lLCell;
            this.tail = lLCell;
            this.length = i10 + 1;
        }
    }

    protected Object deleteHead() {
        LLCell lLCell = this.head;
        if (lLCell != null) {
            Object obj = lLCell.data;
            this.head = lLCell.next;
            this.length--;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // antlr.collections.List
    public Object elementAt(int i10) {
        int i11 = 0;
        for (LLCell lLCell = this.head; lLCell != null; lLCell = lLCell.next) {
            if (i10 == i11) {
                return lLCell.data;
            }
            i11++;
        }
        throw new NoSuchElementException();
    }

    @Override // antlr.collections.List
    public Enumeration elements() {
        return new LLEnumeration(this);
    }

    @Override // antlr.collections.Stack
    public int height() {
        return this.length;
    }

    @Override // antlr.collections.List
    public boolean includes(Object obj) {
        for (LLCell lLCell = this.head; lLCell != null; lLCell = lLCell.next) {
            if (lLCell.data.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    protected void insertHead(Object obj) {
        LLCell lLCell = this.head;
        LLCell lLCell2 = new LLCell(obj);
        this.head = lLCell2;
        lLCell2.next = lLCell;
        this.length++;
        if (this.tail == null) {
            this.tail = lLCell2;
        }
    }

    @Override // antlr.collections.List
    public int length() {
        return this.length;
    }

    @Override // antlr.collections.Stack
    public Object pop() {
        return deleteHead();
    }

    @Override // antlr.collections.Stack
    public void push(Object obj) {
        insertHead(obj);
    }

    @Override // antlr.collections.Stack
    public Object top() {
        LLCell lLCell = this.head;
        if (lLCell != null) {
            return lLCell.data;
        }
        throw new NoSuchElementException();
    }
}
