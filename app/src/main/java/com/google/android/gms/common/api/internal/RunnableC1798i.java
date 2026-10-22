package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes.dex */
public final class RunnableC1798i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7574a;

    /* renamed from: b */
    final /* synthetic */ C1801l f7575b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1798i(C1801l c1801l, int i10) {
        this.f7575b = c1801l;
        this.f7574a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7575b.m7997k(this.f7574a);
    }
}
