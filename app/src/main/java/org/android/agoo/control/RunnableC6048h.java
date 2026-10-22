package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.h */
/* loaded from: classes3.dex */
class RunnableC6048h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f23711a;

    /* renamed from: b */
    final /* synthetic */ HandlerC6047g f23712b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6048h(HandlerC6047g handlerC6047g, Intent intent) {
        this.f23712b = handlerC6047g;
        this.f23711a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23712b.f23710a.onHandleIntent(this.f23711a);
    }
}
