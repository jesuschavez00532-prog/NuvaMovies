package com.efs.sdk.base.core.util.concurrent;

import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.core.util.concurrent.d */
/* loaded from: classes.dex */
public class RunnableC1723d<T> implements Runnable {

    /* renamed from: a */
    private List<InterfaceC1721b<T>> f7207a = new ArrayList(5);

    /* renamed from: b */
    private InterfaceC1722c<T> f7208b;

    public RunnableC1723d(InterfaceC1722c<T> interfaceC1722c) {
        this.f7208b = interfaceC1722c;
    }

    /* renamed from: a */
    public final void m7770a(List<InterfaceC1721b<T>> list) {
        this.f7207a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        m7769a();
    }

    /* renamed from: a */
    public final T m7769a() {
        T t10 = null;
        try {
            Iterator<InterfaceC1721b<T>> it = this.f7207a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            t10 = this.f7208b.mo7759a();
            Iterator<InterfaceC1721b<T>> it2 = this.f7207a.iterator();
            while (it2.hasNext()) {
                it2.next().mo7619a(this.f7208b, t10);
            }
            Iterator<InterfaceC1721b<T>> it3 = this.f7207a.iterator();
            while (it3.hasNext()) {
                it3.next().result(t10);
            }
        } catch (Throwable th) {
            Log.m7740w("efs.util.concurrent", th);
            Iterator<InterfaceC1721b<T>> it4 = this.f7207a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        return t10;
    }
}
