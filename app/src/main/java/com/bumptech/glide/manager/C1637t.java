package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p022b2.InterfaceC1042j;
import p109e2.AbstractC4122l;

/* renamed from: com.bumptech.glide.manager.t */
/* loaded from: classes.dex */
public final class C1637t implements InterfaceC1628k {

    /* renamed from: a */
    private final Set f6473a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m7501a() {
        this.f6473a.clear();
    }

    /* renamed from: b */
    public List m7502b() {
        return AbstractC4122l.m17238k(this.f6473a);
    }

    /* renamed from: c */
    public void m7503c(InterfaceC1042j interfaceC1042j) {
        this.f6473a.add(interfaceC1042j);
    }

    /* renamed from: d */
    public void m7504d(InterfaceC1042j interfaceC1042j) {
        this.f6473a.remove(interfaceC1042j);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onDestroy() {
        Iterator it = AbstractC4122l.m17238k(this.f6473a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1042j) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        Iterator it = AbstractC4122l.m17238k(this.f6473a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1042j) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        Iterator it = AbstractC4122l.m17238k(this.f6473a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1042j) it.next()).onStop();
        }
    }
}
