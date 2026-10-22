package p295q4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p219l4.AbstractC5391n;

/* renamed from: q4.a */
/* loaded from: classes.dex */
public class ThreadFactoryC6342a implements ThreadFactory {

    /* renamed from: a */
    private final String f24686a;

    /* renamed from: b */
    private final ThreadFactory f24687b = Executors.defaultThreadFactory();

    public ThreadFactoryC6342a(String str) {
        AbstractC5391n.m21784j(str, "Name must not be null");
        this.f24686a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f24687b.newThread(new RunnableC6343b(runnable, 0));
        newThread.setName(this.f24686a);
        return newThread;
    }
}
