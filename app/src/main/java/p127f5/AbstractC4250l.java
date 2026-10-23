package p127f5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p219l4.AbstractC5391n;

/* renamed from: f5.l */
/* loaded from: classes.dex */
public abstract class AbstractC4250l {
    /* renamed from: a */
    public static Object m17729a(AbstractC4245i abstractC4245i) {
        AbstractC5391n.m21781g();
        AbstractC5391n.m21784j(abstractC4245i, "Task must not be null");
        if (abstractC4245i.mo17711m()) {
            return m17736h(abstractC4245i);
        }
        C4252n c4252n = new C4252n(null);
        m17737i(abstractC4245i, c4252n);
        c4252n.m17738a();
        return m17736h(abstractC4245i);
    }

    /* renamed from: b */
    public static Object m17730b(AbstractC4245i abstractC4245i, long j10, TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, InterruptedException {
        AbstractC5391n.m21781g();
        AbstractC5391n.m21784j(abstractC4245i, "Task must not be null");
        AbstractC5391n.m21784j(timeUnit, "TimeUnit must not be null");
        if (abstractC4245i.mo17711m()) {
            return m17736h(abstractC4245i);
        }
        C4252n c4252n = new C4252n(null);
        m17737i(abstractC4245i, c4252n);
        if (c4252n.m17739c(j10, timeUnit)) {
            return m17736h(abstractC4245i);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static AbstractC4245i m17731c(Executor executor, Callable callable) {
        AbstractC5391n.m21784j(executor, "Executor must not be null");
        AbstractC5391n.m21784j(callable, "Callback must not be null");
        C4246i0 c4246i0 = new C4246i0();
        executor.execute(new RunnableC4248j0(c4246i0, callable));
        return c4246i0;
    }

    /* renamed from: d */
    public static AbstractC4245i m17732d(Exception exc) {
        C4246i0 c4246i0 = new C4246i0();
        c4246i0.m17719q(exc);
        return c4246i0;
    }

    /* renamed from: e */
    public static AbstractC4245i m17733e(Object obj) {
        C4246i0 c4246i0 = new C4246i0();
        c4246i0.m17720r(obj);
        return c4246i0;
    }

    /* renamed from: f */
    public static AbstractC4245i m17734f(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AbstractC4245i) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C4246i0 c4246i0 = new C4246i0();
            C4254p c4254p = new C4254p(collection.size(), c4246i0);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                m17737i((AbstractC4245i) it2.next(), c4254p);
            }
            return c4246i0;
        }
        return m17733e(null);
    }

    /* renamed from: g */
    public static AbstractC4245i m17735g(AbstractC4245i... abstractC4245iArr) {
        if (abstractC4245iArr != null && abstractC4245iArr.length != 0) {
            return m17734f(Arrays.asList(abstractC4245iArr));
        }
        return m17733e(null);
    }

    /* renamed from: h */
    private static Object m17736h(AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            return abstractC4245i.mo17708j();
        }
        if (abstractC4245i.mo17710l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC4245i.mo17707i());
    }

    /* renamed from: i */
    private static void m17737i(AbstractC4245i abstractC4245i, InterfaceC4253o interfaceC4253o) {
        Executor executor = AbstractC4249k.f18550b;
        abstractC4245i.mo17703e(executor, interfaceC4253o);
        abstractC4245i.mo17702d(executor, interfaceC4253o);
        abstractC4245i.mo17699a(executor, interfaceC4253o);
    }
}
