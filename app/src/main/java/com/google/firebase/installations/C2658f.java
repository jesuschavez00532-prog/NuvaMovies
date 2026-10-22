package com.google.firebase.installations;

import p127f5.C4247j;
import p367v6.AbstractC7245d;

/* renamed from: com.google.firebase.installations.f */
/* loaded from: classes.dex */
class C2658f implements InterfaceC2660h {

    /* renamed from: a */
    final C4247j f10180a;

    public C2658f(C4247j c4247j) {
        this.f10180a = c4247j;
    }

    @Override // com.google.firebase.installations.InterfaceC2660h
    /* renamed from: a */
    public boolean mo11033a(AbstractC7245d abstractC7245d) {
        if (!abstractC7245d.m28045l() && !abstractC7245d.m28044k() && !abstractC7245d.m28042i()) {
            return false;
        }
        this.f10180a.m17728e(abstractC7245d.mo28014d());
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC2660h
    /* renamed from: b */
    public boolean mo11034b(Exception exc) {
        return false;
    }
}
