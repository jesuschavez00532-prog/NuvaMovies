package com.google.firebase.installations;

import p127f5.C4247j;
import p367v6.AbstractC7245d;

/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes.dex */
class C2657e implements InterfaceC2660h {

    /* renamed from: a */
    private final C2661i f10178a;

    /* renamed from: b */
    private final C4247j f10179b;

    public C2657e(C2661i c2661i, C4247j c4247j) {
        this.f10178a = c2661i;
        this.f10179b = c4247j;
    }

    @Override // com.google.firebase.installations.InterfaceC2660h
    /* renamed from: a */
    public boolean mo11033a(AbstractC7245d abstractC7245d) {
        if (abstractC7245d.m28044k() && !this.f10178a.m11043f(abstractC7245d)) {
            this.f10179b.m17726c(AbstractC2659g.m11035a().mo10998b(abstractC7245d.mo28012b()).mo11000d(abstractC7245d.mo28013c()).mo10999c(abstractC7245d.mo28018h()).mo10997a());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC2660h
    /* renamed from: b */
    public boolean mo11034b(Exception exc) {
        this.f10179b.m17727d(exc);
        return true;
    }
}
