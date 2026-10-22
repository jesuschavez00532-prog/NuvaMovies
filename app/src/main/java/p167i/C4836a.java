package p167i;

import java.util.concurrent.Executor;

/* renamed from: i.a */
/* loaded from: classes.dex */
public class C4836a extends AbstractC4839d {

    /* renamed from: c */
    private static volatile C4836a f20313c;

    /* renamed from: d */
    private static final Executor f20314d = new a();

    /* renamed from: e */
    private static final Executor f20315e = new b();

    /* renamed from: a */
    private AbstractC4839d f20316a;

    /* renamed from: b */
    private AbstractC4839d f20317b;

    /* renamed from: i.a$a */
    /* loaded from: classes.dex */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C4836a.m19914d().mo19917c(runnable);
        }
    }

    /* renamed from: i.a$b */
    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C4836a.m19914d().mo19915a(runnable);
        }
    }

    private C4836a() {
        C4838c c4838c = new C4838c();
        this.f20317b = c4838c;
        this.f20316a = c4838c;
    }

    /* renamed from: d */
    public static C4836a m19914d() {
        if (f20313c != null) {
            return f20313c;
        }
        synchronized (C4836a.class) {
            if (f20313c == null) {
                f20313c = new C4836a();
            }
        }
        return f20313c;
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: a */
    public void mo19915a(Runnable runnable) {
        this.f20316a.mo19915a(runnable);
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: b */
    public boolean mo19916b() {
        return this.f20316a.mo19916b();
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: c */
    public void mo19917c(Runnable runnable) {
        this.f20316a.mo19917c(runnable);
    }
}
