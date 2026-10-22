package ve;

import java.util.concurrent.locks.LockSupport;
import ve.AbstractC7312r0;

/* renamed from: ve.s0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7315s0 extends AbstractC7309q0 {
    /* renamed from: I */
    protected abstract Thread mo28108I();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final void m28296J(long j10, AbstractC7312r0.b bVar) {
        RunnableC7276f0.f27165h.m28289V(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final void m28297K() {
        Thread mo28108I = mo28108I();
        if (Thread.currentThread() != mo28108I) {
            AbstractC7319t1.m28299a();
            LockSupport.unpark(mo28108I);
        }
    }
}
