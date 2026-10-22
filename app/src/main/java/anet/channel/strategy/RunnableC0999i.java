package anet.channel.strategy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.i */
/* loaded from: classes.dex */
public class RunnableC0999i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0997g f4141a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0999i(C0997g c0997g) {
        this.f4141a = c0997g;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m4757a;
        m4757a = this.f4141a.m4757a();
        if (!m4757a) {
            this.f4141a.f4136b.m4717c();
        }
    }
}
