package p142g3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p245n3.BlockingQueueC5736a;
import p245n3.C5739d;

/* renamed from: g3.d */
/* loaded from: classes.dex */
public class C4342d {

    /* renamed from: e */
    private static final TimeUnit f18910e = TimeUnit.HOURS;

    /* renamed from: a */
    private int f18911a = 5;

    /* renamed from: b */
    private int f18912b = 3;

    /* renamed from: c */
    private int f18913c = Integer.MAX_VALUE;

    /* renamed from: d */
    private C5739d f18914d;

    /* renamed from: a */
    public C5739d m18225a() {
        if (this.f18914d == null) {
            synchronized (C4342d.class) {
                if (this.f18914d == null) {
                    this.f18914d = new C5739d(this.f18912b, this.f18911a, 1L, f18910e, new BlockingQueueC5736a(this.f18913c), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
                }
            }
        }
        return this.f18914d;
    }

    /* renamed from: b */
    public void m18226b() {
        this.f18912b = 1;
        this.f18911a = 1;
    }
}
