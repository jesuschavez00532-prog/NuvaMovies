package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import p172i4.C4854b;
import p187j4.C4987a;
import p203k4.C5104b;
import p203k4.InterfaceC5124u;
import p219l4.AbstractC5358c;
import p219l4.InterfaceC5376i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public final class C1804o implements AbstractC5358c.c, InterfaceC5124u {

    /* renamed from: a */
    private final C4987a.f f7595a;

    /* renamed from: b */
    private final C5104b f7596b;

    /* renamed from: c */
    private InterfaceC5376i f7597c = null;

    /* renamed from: d */
    private Set f7598d = null;

    /* renamed from: e */
    private boolean f7599e = false;

    /* renamed from: f */
    final /* synthetic */ C1791b f7600f;

    public C1804o(C1791b c1791b, C4987a.f fVar, C5104b c5104b) {
        this.f7600f = c1791b;
        this.f7595a = fVar;
        this.f7596b = c5104b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m8033h() {
        InterfaceC5376i interfaceC5376i;
        if (this.f7599e && (interfaceC5376i = this.f7597c) != null) {
            this.f7595a.m20352e(interfaceC5376i, this.f7598d);
        }
    }

    @Override // p219l4.AbstractC5358c.c
    /* renamed from: a */
    public final void mo8034a(C4854b c4854b) {
        Handler handler;
        handler = this.f7600f.f7557p;
        handler.post(new RunnableC1803n(this, c4854b));
    }

    @Override // p203k4.InterfaceC5124u
    /* renamed from: b */
    public final void mo8035b(C4854b c4854b) {
        Map map;
        map = this.f7600f.f7553l;
        C1801l c1801l = (C1801l) map.get(this.f7596b);
        if (c1801l != null) {
            c1801l.m8014H(c4854b);
        }
    }

    @Override // p203k4.InterfaceC5124u
    /* renamed from: c */
    public final void mo8036c(InterfaceC5376i interfaceC5376i, Set set) {
        if (interfaceC5376i != null && set != null) {
            this.f7597c = interfaceC5376i;
            this.f7598d = set;
            m8033h();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo8035b(new C4854b(4));
        }
    }
}
