package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.util.d */
/* loaded from: classes.dex */
public final class RunnableC1019d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4216a;

    /* renamed from: b */
    final /* synthetic */ NetTypeStat f4217b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1019d(String str, NetTypeStat netTypeStat) {
        this.f4216a = str;
        this.f4217b = netTypeStat;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC1020e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }
}
