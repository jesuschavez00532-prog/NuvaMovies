package anet.channel.strategy;

/* renamed from: anet.channel.strategy.e */
/* loaded from: classes.dex */
class RunnableC0995e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4131a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f4132b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0995e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f4132b = strategyInfoHolder;
        this.f4131a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4132b.m4715a(this.f4131a, true);
    }
}
