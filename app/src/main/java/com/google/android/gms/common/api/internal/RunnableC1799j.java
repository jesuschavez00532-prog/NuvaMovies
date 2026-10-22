package com.google.android.gms.common.api.internal;

import p187j4.C4987a;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes.dex */
final class RunnableC1799j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1800k f7576a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1799j(C1800k c1800k) {
        this.f7576a = c1800k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4987a.f fVar;
        C4987a.f fVar2;
        C1801l c1801l = this.f7576a.f7577a;
        fVar = c1801l.f7579b;
        fVar2 = c1801l.f7579b;
        fVar.m20349b(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
