package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.client.c */
/* loaded from: classes.dex */
public class RunnableC3133c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GlobalClientInfo f12872a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3133c(GlobalClientInfo globalClientInfo) {
        this.f12872a = globalClientInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalClientInfo.f12845c = UtilityImpl.m12991m(GlobalClientInfo.f12843a);
    }
}
