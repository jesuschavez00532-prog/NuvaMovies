package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.data.h */
/* loaded from: classes.dex */
public final class RunnableC3143h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f12945a;

    /* renamed from: b */
    final /* synthetic */ Intent f12946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3143h(Context context, Intent intent) {
        this.f12945a = context;
        this.f12946b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3142g.m12797a().m12808b(this.f12945a, this.f12946b);
    }
}
