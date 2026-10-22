package p183j0;

import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public abstract class AbstractC4968b {

    /* renamed from: a */
    private static List f20689a = new ArrayList();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f20690b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock.ReadLock f20691c;

    /* renamed from: d */
    private static final ReentrantReadWriteLock.WriteLock f20692d;

    /* renamed from: j0.b$a */
    /* loaded from: classes.dex */
    private static class a implements Comparable {

        /* renamed from: a */
        final InterfaceC4967a f20693a;

        /* renamed from: b */
        final InterfaceC4969c f20694b;

        /* renamed from: c */
        final int f20695c;

        a(InterfaceC4967a interfaceC4967a, InterfaceC4969c interfaceC4969c, int i10) {
            this.f20693a = interfaceC4967a;
            this.f20694b = interfaceC4969c;
            this.f20695c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f20695c - aVar.f20695c;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f20690b = reentrantReadWriteLock;
        f20691c = reentrantReadWriteLock.readLock();
        f20692d = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: a */
    public static void m20309a(InterfaceC4967a interfaceC4967a, InterfaceC4969c interfaceC4969c, int i10) {
        try {
            if (interfaceC4967a != null) {
                if (interfaceC4969c != null) {
                    ReentrantReadWriteLock.WriteLock writeLock = f20692d;
                    writeLock.lock();
                    f20689a.add(new a(interfaceC4967a, interfaceC4969c, i10));
                    Collections.sort(f20689a);
                    writeLock.unlock();
                    return;
                }
                throw new IllegalArgumentException("prediction is null");
            }
            throw new IllegalArgumentException("cache is null");
        } catch (Throwable th) {
            f20692d.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m20310b() {
        ALog.m4790w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        Iterator it = f20689a.iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).f20693a.clear();
            } catch (Exception unused) {
            }
        }
    }
}
