package p243n1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p109e2.AbstractC4121k;

/* renamed from: n1.c */
/* loaded from: classes.dex */
final class C5725c {

    /* renamed from: a */
    private final Map f22988a = new HashMap();

    /* renamed from: b */
    private final b f22989b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Lock f22990a = new ReentrantLock();

        /* renamed from: b */
        int f22991b;

        a() {
        }
    }

    /* renamed from: n1.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private final Queue f22992a = new ArrayDeque();

        b() {
        }

        /* renamed from: a */
        a m23122a() {
            a aVar;
            synchronized (this.f22992a) {
                aVar = (a) this.f22992a.poll();
            }
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        /* renamed from: b */
        void m23123b(a aVar) {
            synchronized (this.f22992a) {
                if (this.f22992a.size() < 10) {
                    this.f22992a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m23120a(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) this.f22988a.get(str);
            if (aVar == null) {
                aVar = this.f22989b.m23122a();
                this.f22988a.put(str, aVar);
            }
            aVar.f22991b++;
        }
        aVar.f22990a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m23121b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) AbstractC4121k.m17226d(this.f22988a.get(str));
            int i10 = aVar.f22991b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f22991b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f22988a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f22989b.m23123b(aVar2);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f22991b);
            }
        }
        aVar.f22990a.unlock();
    }
}
