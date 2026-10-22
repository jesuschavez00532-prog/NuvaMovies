package p213kf;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;

/* renamed from: kf.g */
/* loaded from: classes3.dex */
final class C5259g implements CallAdapter {

    /* renamed from: a */
    private final Type f21449a;

    /* renamed from: b */
    private final Scheduler f21450b;

    /* renamed from: c */
    private final boolean f21451c;

    /* renamed from: d */
    private final boolean f21452d;

    /* renamed from: e */
    private final boolean f21453e;

    /* renamed from: f */
    private final boolean f21454f;

    /* renamed from: g */
    private final boolean f21455g;

    /* renamed from: h */
    private final boolean f21456h;

    /* renamed from: i */
    private final boolean f21457i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5259g(Type type, Scheduler scheduler, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f21449a = type;
        this.f21450b = scheduler;
        this.f21451c = z10;
        this.f21452d = z11;
        this.f21453e = z12;
        this.f21454f = z13;
        this.f21455g = z14;
        this.f21456h = z15;
        this.f21457i = z16;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: a */
    public Type mo21163a() {
        return this.f21449a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // retrofit2.CallAdapter
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo21164b(retrofit2.Call r2) {
        /*
            r1 = this;
            boolean r0 = r1.f21451c
            if (r0 == 0) goto La
            kf.b r0 = new kf.b
            r0.<init>(r2)
            goto Lf
        La:
            kf.c r0 = new kf.c
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.f21452d
            if (r2 == 0) goto L1a
            kf.f r2 = new kf.f
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.f21453e
            if (r2 == 0) goto L24
            kf.a r2 = new kf.a
            r2.<init>(r0)
            goto L18
        L24:
            io.reactivex.Scheduler r2 = r1.f21450b
            if (r2 == 0) goto L2c
            io.reactivex.Observable r0 = r0.subscribeOn(r2)
        L2c:
            boolean r2 = r1.f21454f
            if (r2 == 0) goto L37
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r2 = r0.toFlowable(r2)
            return r2
        L37:
            boolean r2 = r1.f21455g
            if (r2 == 0) goto L40
            io.reactivex.Single r2 = r0.singleOrError()
            return r2
        L40:
            boolean r2 = r1.f21456h
            if (r2 == 0) goto L49
            io.reactivex.Maybe r2 = r0.singleElement()
            return r2
        L49:
            boolean r2 = r1.f21457i
            if (r2 == 0) goto L52
            io.reactivex.Completable r2 = r0.ignoreElements()
            return r2
        L52:
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213kf.C5259g.mo21164b(retrofit2.Call):java.lang.Object");
    }
}
