package p109e2;

import java.util.concurrent.Executor;

/* renamed from: e2.e */
/* loaded from: classes.dex */
public abstract class AbstractC4115e {

    /* renamed from: a */
    private static final Executor f18074a = new a();

    /* renamed from: b */
    private static final Executor f18075b = new b();

    /* renamed from: e2.e$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC4122l.m17250w(runnable);
        }
    }

    /* renamed from: e2.e$b */
    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m17206a() {
        return f18075b;
    }

    /* renamed from: b */
    public static Executor m17207b() {
        return f18074a;
    }
}
