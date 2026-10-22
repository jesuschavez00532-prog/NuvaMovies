package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p003a2.InterfaceC0008d;
import p109e2.AbstractC4122l;

/* renamed from: com.bumptech.glide.manager.p */
/* loaded from: classes.dex */
public class C1633p {

    /* renamed from: a */
    private final Set f6443a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final Set f6444b = new HashSet();

    /* renamed from: c */
    private boolean f6445c;

    /* renamed from: a */
    public boolean m7480a(InterfaceC0008d interfaceC0008d) {
        boolean z10 = true;
        if (interfaceC0008d == null) {
            return true;
        }
        boolean remove = this.f6443a.remove(interfaceC0008d);
        if (!this.f6444b.remove(interfaceC0008d) && !remove) {
            z10 = false;
        }
        if (z10) {
            interfaceC0008d.clear();
        }
        return z10;
    }

    /* renamed from: b */
    public void m7481b() {
        Iterator it = AbstractC4122l.m17238k(this.f6443a).iterator();
        while (it.hasNext()) {
            m7480a((InterfaceC0008d) it.next());
        }
        this.f6444b.clear();
    }

    /* renamed from: c */
    public void m7482c() {
        this.f6445c = true;
        for (InterfaceC0008d interfaceC0008d : AbstractC4122l.m17238k(this.f6443a)) {
            if (interfaceC0008d.isRunning() || interfaceC0008d.mo95j()) {
                interfaceC0008d.clear();
                this.f6444b.add(interfaceC0008d);
            }
        }
    }

    /* renamed from: d */
    public void m7483d() {
        this.f6445c = true;
        for (InterfaceC0008d interfaceC0008d : AbstractC4122l.m17238k(this.f6443a)) {
            if (interfaceC0008d.isRunning()) {
                interfaceC0008d.pause();
                this.f6444b.add(interfaceC0008d);
            }
        }
    }

    /* renamed from: e */
    public void m7484e() {
        for (InterfaceC0008d interfaceC0008d : AbstractC4122l.m17238k(this.f6443a)) {
            if (!interfaceC0008d.mo95j() && !interfaceC0008d.mo92g()) {
                interfaceC0008d.clear();
                if (!this.f6445c) {
                    interfaceC0008d.mo93h();
                } else {
                    this.f6444b.add(interfaceC0008d);
                }
            }
        }
    }

    /* renamed from: f */
    public void m7485f() {
        this.f6445c = false;
        for (InterfaceC0008d interfaceC0008d : AbstractC4122l.m17238k(this.f6443a)) {
            if (!interfaceC0008d.mo95j() && !interfaceC0008d.isRunning()) {
                interfaceC0008d.mo93h();
            }
        }
        this.f6444b.clear();
    }

    /* renamed from: g */
    public void m7486g(InterfaceC0008d interfaceC0008d) {
        this.f6443a.add(interfaceC0008d);
        if (!this.f6445c) {
            interfaceC0008d.mo93h();
            return;
        }
        interfaceC0008d.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f6444b.add(interfaceC0008d);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f6443a.size() + ", isPaused=" + this.f6445c + "}";
    }
}
