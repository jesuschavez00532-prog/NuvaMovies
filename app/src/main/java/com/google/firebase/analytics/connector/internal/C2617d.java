package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import p006a5.C0061a;
import p351u5.InterfaceC7041a;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* loaded from: classes.dex */
public final class C2617d {

    /* renamed from: a */
    final Set f10008a;

    /* renamed from: b */
    private final InterfaceC7041a.b f10009b;

    /* renamed from: c */
    private final C0061a f10010c;

    /* renamed from: d */
    private final C2616c f10011d;

    public C2617d(C0061a c0061a, InterfaceC7041a.b bVar) {
        this.f10009b = bVar;
        this.f10010c = c0061a;
        C2616c c2616c = new C2616c(this);
        this.f10011d = c2616c;
        c0061a.m217b(c2616c);
        this.f10008a = new HashSet();
    }
}
