package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0990a;
import anet.channel.util.ALog;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.utils.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1007b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AMDC");
        atomicInteger = C1006a.f4184a;
        sb2.append(atomicInteger.incrementAndGet());
        Thread thread = new Thread(runnable, sb2.toString());
        ALog.m4788i(C0990a.TAG, "thread created!", null, SerializableCookie.NAME, thread.getName());
        thread.setPriority(5);
        return thread;
    }
}
