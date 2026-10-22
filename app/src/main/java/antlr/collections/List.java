package antlr.collections;

import java.util.Enumeration;

/* loaded from: classes.dex */
public interface List {
    void add(Object obj);

    void append(Object obj);

    Object elementAt(int i10);

    Enumeration elements();

    boolean includes(Object obj);

    int length();
}
