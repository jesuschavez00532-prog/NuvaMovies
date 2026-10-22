package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0751e;
import androidx.lifecycle.InterfaceC0752f;
import androidx.lifecycle.InterfaceC0758l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p109e2.AbstractC4122l;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC1627j, InterfaceC0751e {

    /* renamed from: a */
    private final Set f6421a = new HashSet();

    /* renamed from: b */
    private final AbstractC0749c f6422b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleLifecycle(AbstractC0749c abstractC0749c) {
        this.f6422b = abstractC0749c;
        abstractC0749c.mo3703a(this);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1627j
    /* renamed from: a */
    public void mo7458a(InterfaceC1628k interfaceC1628k) {
        this.f6421a.add(interfaceC1628k);
        if (this.f6422b.mo3704b() == AbstractC0749c.c.DESTROYED) {
            interfaceC1628k.onDestroy();
        } else if (this.f6422b.mo3704b().m3709a(AbstractC0749c.c.STARTED)) {
            interfaceC1628k.onStart();
        } else {
            interfaceC1628k.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC1627j
    /* renamed from: b */
    public void mo7459b(InterfaceC1628k interfaceC1628k) {
        this.f6421a.remove(interfaceC1628k);
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_DESTROY)
    public void onDestroy(InterfaceC0752f interfaceC0752f) {
        Iterator it = AbstractC4122l.m17238k(this.f6421a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1628k) it.next()).onDestroy();
        }
        interfaceC0752f.mo953f6().mo3705c(this);
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_START)
    public void onStart(InterfaceC0752f interfaceC0752f) {
        Iterator it = AbstractC4122l.m17238k(this.f6421a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1628k) it.next()).onStart();
        }
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_STOP)
    public void onStop(InterfaceC0752f interfaceC0752f) {
        Iterator it = AbstractC4122l.m17238k(this.f6421a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1628k) it.next()).onStop();
        }
    }
}
