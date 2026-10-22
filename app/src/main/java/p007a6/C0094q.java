package p007a6;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p157h6.InterfaceC4557i;
import p395x5.C7503f;
import p395x5.InterfaceC7498a;

/* renamed from: a6.q */
/* loaded from: classes.dex */
class C0094q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final a f311a;

    /* renamed from: b */
    private final InterfaceC4557i f312b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f313c;

    /* renamed from: d */
    private final InterfaceC7498a f314d;

    /* renamed from: e */
    private final AtomicBoolean f315e = new AtomicBoolean(false);

    /* renamed from: a6.q$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo344a(InterfaceC4557i interfaceC4557i, Thread thread, Throwable th);
    }

    public C0094q(a aVar, InterfaceC4557i interfaceC4557i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC7498a interfaceC7498a) {
        this.f311a = aVar;
        this.f312b = interfaceC4557i;
        this.f313c = uncaughtExceptionHandler;
        this.f314d = interfaceC7498a;
    }

    /* renamed from: b */
    private boolean m436b(Thread thread, Throwable th) {
        if (thread == null) {
            C7503f.m28716f().m28719d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C7503f.m28716f().m28719d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.f314d.mo10880b()) {
            C7503f.m28716f().m28717b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m437a() {
        return this.f315e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [x5.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [x5.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f315e.set(true);
        try {
            try {
                if (m436b(thread, th)) {
                    this.f311a.mo344a(this.f312b, thread, th);
                } else {
                    C7503f.m28716f().m28717b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                C7503f.m28716f().m28720e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            C7503f.m28716f().m28717b(r02);
            this.f313c.uncaughtException(thread, th);
            this.f315e.set(false);
        }
    }
}
