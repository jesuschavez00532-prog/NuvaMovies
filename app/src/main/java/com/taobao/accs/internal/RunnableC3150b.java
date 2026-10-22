package com.taobao.accs.internal;

import com.taobao.accs.InterfaceC3130c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.internal.b */
/* loaded from: classes.dex */
public class RunnableC3150b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3130c f12969a;

    /* renamed from: b */
    final /* synthetic */ ACCSManagerImpl f12970b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3150b(ACCSManagerImpl aCCSManagerImpl, InterfaceC3130c interfaceC3130c) {
        this.f12970b = aCCSManagerImpl;
        this.f12969a = interfaceC3130c;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC3130c interfaceC3130c = this.f12969a;
        if (interfaceC3130c != null) {
            interfaceC3130c.mo12717a(true, false);
        }
    }
}
