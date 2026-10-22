package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.g */
/* loaded from: classes.dex */
public final class RunnableC3194g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccsDataListener f13188a;

    /* renamed from: b */
    final /* synthetic */ boolean f13189b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3194g(AccsDataListener accsDataListener, boolean z10) {
        this.f13188a = accsDataListener;
        this.f13189b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13188a.onAntiBrush(this.f13189b, null);
    }
}
