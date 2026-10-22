package com.umeng.analytics.pro;

import com.umeng.analytics.pro.InterfaceC3340ch;
import com.umeng.analytics.pro.InterfaceC3347co;
import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.ch */
/* loaded from: classes3.dex */
public interface InterfaceC3340ch<T extends InterfaceC3340ch<?, ?>, F extends InterfaceC3347co> extends Serializable {
    void clear();

    InterfaceC3340ch<T, F> deepCopy();

    F fieldForId(int i10);

    void read(AbstractC3366dg abstractC3366dg);

    void write(AbstractC3366dg abstractC3366dg);
}
