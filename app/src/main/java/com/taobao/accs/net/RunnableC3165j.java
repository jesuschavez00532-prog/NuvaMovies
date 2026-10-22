package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

/* renamed from: com.taobao.accs.net.j */
/* loaded from: classes.dex */
class RunnableC3165j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3164i f13015a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3165j(C3164i c3164i) {
        this.f13015a = c3164i;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyCenter.getInstance().saveData();
    }
}
