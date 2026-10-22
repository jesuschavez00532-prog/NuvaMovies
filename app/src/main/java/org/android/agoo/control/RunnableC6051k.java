package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.k */
/* loaded from: classes3.dex */
class RunnableC6051k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f23715a;

    /* renamed from: b */
    final /* synthetic */ BaseIntentService f23716b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6051k(BaseIntentService baseIntentService, Intent intent) {
        this.f23716b = baseIntentService;
        this.f23715a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23716b.onHandleIntent(this.f23715a);
    }
}
