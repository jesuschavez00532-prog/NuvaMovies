package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* loaded from: classes.dex */
public final class C2371m4 extends FutureTask implements Comparable {

    /* renamed from: a */
    private final long f8799a;

    /* renamed from: b */
    final boolean f8800b;

    /* renamed from: c */
    private final String f8801c;

    /* renamed from: d */
    final /* synthetic */ C2393o4 f8802d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2371m4(C2393o4 c2393o4, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f8802d = c2393o4;
        AbstractC5391n.m21783i(str);
        atomicLong = C2393o4.f8877l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8799a = andIncrement;
        this.f8801c = str;
        this.f8800b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2393o4.f8714a.mo9577b().m9800r().m9699a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2371m4 c2371m4 = (C2371m4) obj;
        boolean z10 = this.f8800b;
        if (z10 != c2371m4.f8800b) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        long j10 = this.f8799a;
        long j11 = c2371m4.f8799a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f8802d.f8714a.mo9577b().m9802t().m9700b("Two tasks share the same index. index", Long.valueOf(this.f8799a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f8802d.f8714a.mo9577b().m9800r().m9700b(this.f8801c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2371m4(C2393o4 c2393o4, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f8802d = c2393o4;
        AbstractC5391n.m21783i("Task exception on worker thread");
        atomicLong = C2393o4.f8877l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8799a = andIncrement;
        this.f8801c = "Task exception on worker thread";
        this.f8800b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2393o4.f8714a.mo9577b().m9800r().m9699a("Tasks index overflow");
        }
    }
}
