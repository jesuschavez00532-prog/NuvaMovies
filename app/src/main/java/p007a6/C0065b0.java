package p007a6;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a6.b0 */
/* loaded from: classes.dex */
public final class C0065b0 {

    /* renamed from: a */
    private final AtomicInteger f194a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f195b = new AtomicInteger();

    /* renamed from: a */
    public void m225a() {
        this.f195b.getAndIncrement();
    }

    /* renamed from: b */
    public void m226b() {
        this.f194a.getAndIncrement();
    }

    /* renamed from: c */
    public void m227c() {
        this.f195b.set(0);
    }
}
