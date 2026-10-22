package p007a6;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p127f5.InterfaceC4229a;

/* renamed from: a6.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC0101t0 {

    /* renamed from: a */
    private static final ExecutorService f333a = AbstractC0102u.m463c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.t0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callable f334a;

        /* renamed from: b */
        final /* synthetic */ C4247j f335b;

        /* renamed from: a6.t0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C7792a implements InterfaceC4229a {
            C7792a() {
            }

            @Override // p127f5.InterfaceC4229a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void mo289a(AbstractC4245i abstractC4245i) {
                if (abstractC4245i.mo17712n()) {
                    a.this.f335b.m17726c(abstractC4245i.mo17708j());
                    return null;
                }
                a.this.f335b.m17725b(abstractC4245i.mo17707i());
                return null;
            }
        }

        a(Callable callable, C4247j c4247j) {
            this.f334a = callable;
            this.f335b = c4247j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((AbstractC4245i) this.f334a.call()).mo17704f(new C7792a());
            } catch (Exception e10) {
                this.f335b.m17725b(e10);
            }
        }
    }

    /* renamed from: d */
    public static Object m453d(AbstractC4245i abstractC4245i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC4245i.mo17705g(f333a, new InterfaceC4229a() { // from class: a6.q0
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i2) {
                Object m455f;
                m455f = AbstractC0101t0.m455f(countDownLatch, abstractC4245i2);
                return m455f;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (abstractC4245i.mo17712n()) {
            return abstractC4245i.mo17708j();
        }
        if (!abstractC4245i.mo17710l()) {
            if (abstractC4245i.mo17711m()) {
                throw new IllegalStateException(abstractC4245i.mo17707i());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: e */
    public static AbstractC4245i m454e(Executor executor, Callable callable) {
        C4247j c4247j = new C4247j();
        executor.execute(new a(callable, c4247j));
        return c4247j.m17724a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Object m455f(CountDownLatch countDownLatch, AbstractC4245i abstractC4245i) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Void m456g(C4247j c4247j, AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            c4247j.m17728e(abstractC4245i.mo17708j());
            return null;
        }
        Exception mo17707i = abstractC4245i.mo17707i();
        Objects.requireNonNull(mo17707i);
        c4247j.m17727d(mo17707i);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Void m457h(C4247j c4247j, AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            c4247j.m17728e(abstractC4245i.mo17708j());
            return null;
        }
        Exception mo17707i = abstractC4245i.mo17707i();
        Objects.requireNonNull(mo17707i);
        c4247j.m17727d(mo17707i);
        return null;
    }

    /* renamed from: i */
    public static AbstractC4245i m458i(AbstractC4245i abstractC4245i, AbstractC4245i abstractC4245i2) {
        final C4247j c4247j = new C4247j();
        InterfaceC4229a interfaceC4229a = new InterfaceC4229a() { // from class: a6.s0
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i3) {
                Void m456g;
                m456g = AbstractC0101t0.m456g(C4247j.this, abstractC4245i3);
                return m456g;
            }
        };
        abstractC4245i.mo17704f(interfaceC4229a);
        abstractC4245i2.mo17704f(interfaceC4229a);
        return c4247j.m17724a();
    }

    /* renamed from: j */
    public static AbstractC4245i m459j(Executor executor, AbstractC4245i abstractC4245i, AbstractC4245i abstractC4245i2) {
        final C4247j c4247j = new C4247j();
        InterfaceC4229a interfaceC4229a = new InterfaceC4229a() { // from class: a6.r0
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i3) {
                Void m457h;
                m457h = AbstractC0101t0.m457h(C4247j.this, abstractC4245i3);
                return m457h;
            }
        };
        abstractC4245i.mo17705g(executor, interfaceC4229a);
        abstractC4245i2.mo17705g(executor, interfaceC4229a);
        return c4247j.m17724a();
    }
}
