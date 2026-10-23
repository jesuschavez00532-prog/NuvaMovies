package p245n3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class BlockingQueueC5736a extends AbstractQueue implements BlockingQueue, Serializable {

    /* renamed from: a */
    private final int f23024a;

    /* renamed from: b */
    private final AtomicInteger f23025b = new AtomicInteger();

    /* renamed from: c */
    transient b f23026c;

    /* renamed from: d */
    private transient b f23027d;

    /* renamed from: e */
    private final ReentrantLock f23028e;

    /* renamed from: f */
    private final Condition f23029f;

    /* renamed from: g */
    private final ReentrantLock f23030g;

    /* renamed from: h */
    private final Condition f23031h;

    /* renamed from: n3.a$a */
    /* loaded from: classes.dex */
    private class a implements Iterator {

        /* renamed from: a */
        private b f23032a;

        /* renamed from: b */
        private b f23033b;

        /* renamed from: c */
        private Object f23034c;

        a() {
            BlockingQueueC5736a.this.m23153i();
            try {
                b bVar = BlockingQueueC5736a.this.f23026c.f23038c;
                this.f23032a = bVar;
                if (bVar != null) {
                    this.f23034c = bVar.m23158b();
                }
            } finally {
                BlockingQueueC5736a.this.m23154j();
            }
        }

        /* renamed from: b */
        private b m23156b(b bVar) {
            b bVar2;
            while (true) {
                bVar2 = bVar.f23038c;
                if (bVar2 == bVar) {
                    return BlockingQueueC5736a.this.f23026c.f23038c;
                }
                if (bVar2 == null || bVar2.m23158b() != null) {
                    break;
                }
                bVar = bVar2;
            }
            return bVar2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23032a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object m23158b = null;
            BlockingQueueC5736a.this.m23153i();
            try {
                b bVar = this.f23032a;
                if (bVar != null) {
                    Object obj = this.f23034c;
                    this.f23033b = bVar;
                    b m23156b = m23156b(bVar);
                    this.f23032a = m23156b;
                    if (m23156b == null) {
                        m23158b = null;
                    } else {
                        m23158b = m23156b.m23158b();
                    }
                    this.f23034c = m23158b;
                    return obj;
                }
                throw new NoSuchElementException();
            } finally {
                BlockingQueueC5736a.this.m23154j();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r4.f23035d.m23155p(r1, r2);
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void remove() {
            /*
                r4 = this;
                n3.a$b r0 = r4.f23033b
                if (r0 == 0) goto L2d
                n3.a r0 = p245n3.BlockingQueueC5736a.this
                r0.m23153i()
                n3.a$b r0 = r4.f23033b     // Catch: java.lang.Throwable -> L26
                r1 = 0
                r4.f23033b = r1     // Catch: java.lang.Throwable -> L26
                n3.a r1 = p245n3.BlockingQueueC5736a.this     // Catch: java.lang.Throwable -> L26
                n3.a$b r1 = r1.f23026c     // Catch: java.lang.Throwable -> L26
            L12:
                n3.a$b r2 = r1.f23038c     // Catch: java.lang.Throwable -> L26
                r3 = r2
                r2 = r1
                r1 = r3
                if (r1 == 0) goto L20
                if (r1 != r0) goto L12
                n3.a r0 = p245n3.BlockingQueueC5736a.this     // Catch: java.lang.Throwable -> L26
                r0.m23155p(r1, r2)     // Catch: java.lang.Throwable -> L26
            L20:
                n3.a r0 = p245n3.BlockingQueueC5736a.this
                r0.m23154j()
                return
            L26:
                r0 = move-exception
                n3.a r1 = p245n3.BlockingQueueC5736a.this
                r1.m23154j()
                throw r0
            L2d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                goto L34
            L33:
                throw r0
            L34:
                goto L33
            */
            throw new UnsupportedOperationException("Method not decompiled: p245n3.BlockingQueueC5736a.a.remove():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.a$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private boolean f23036a = false;

        /* renamed from: b */
        private C5737b f23037b;

        /* renamed from: c */
        b f23038c;

        b(Object obj) {
            m23159c(obj);
        }

        /* renamed from: a */
        public int m23157a() {
            return this.f23037b.f23040a;
        }

        /* renamed from: b */
        public Object m23158b() {
            C5737b c5737b = this.f23037b;
            if (c5737b == null) {
                return null;
            }
            if (this.f23036a) {
                return c5737b;
            }
            return c5737b.f23041b;
        }

        /* renamed from: c */
        public void m23159c(Object obj) {
            if (obj == null) {
                this.f23037b = null;
            } else if (obj instanceof C5737b) {
                this.f23037b = (C5737b) obj;
                this.f23036a = true;
            } else {
                this.f23037b = new C5737b(0, obj);
            }
        }
    }

    public BlockingQueueC5736a(int i10) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f23028e = reentrantLock;
        this.f23029f = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f23030g = reentrantLock2;
        this.f23031h = reentrantLock2.newCondition();
        if (i10 > 0) {
            this.f23024a = i10;
            b bVar = new b(null);
            this.f23026c = bVar;
            this.f23027d = bVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private Object m23148c() {
        b bVar = this.f23026c;
        b bVar2 = bVar.f23038c;
        bVar.f23038c = bVar;
        this.f23026c = bVar2;
        Object m23158b = bVar2.m23158b();
        bVar2.m23159c(null);
        return m23158b;
    }

    /* renamed from: g */
    private void m23149g(b bVar) {
        boolean z10 = false;
        b bVar2 = this.f23026c;
        while (true) {
            b bVar3 = bVar2.f23038c;
            if (bVar3 != null) {
                if (bVar3.m23157a() < bVar.m23157a()) {
                    bVar2.f23038c = bVar;
                    bVar.f23038c = bVar3;
                    z10 = true;
                    break;
                }
                bVar2 = bVar2.f23038c;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            this.f23027d.f23038c = bVar;
            this.f23027d = bVar;
        }
    }

    /* renamed from: k */
    private synchronized Object m23150k(b bVar) {
        if (bVar == null) {
            return m23148c();
        }
        m23149g(bVar);
        return null;
    }

    /* renamed from: n */
    private void m23151n() {
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lock();
        try {
            this.f23029f.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    private void m23152o() {
        ReentrantLock reentrantLock = this.f23030g;
        reentrantLock.lock();
        try {
            this.f23031h.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        m23153i();
        try {
            b bVar = this.f23026c;
            while (true) {
                b bVar2 = bVar.f23038c;
                if (bVar2 == null) {
                    break;
                }
                bVar.f23038c = bVar;
                bVar2.m23159c(null);
                bVar = bVar2;
            }
            this.f23026c = this.f23027d;
            if (this.f23025b.getAndSet(0) == this.f23024a) {
                this.f23031h.signal();
            }
        } finally {
            m23154j();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        m23153i();
        try {
            b bVar = this.f23026c;
            do {
                bVar = bVar.f23038c;
                if (bVar == null) {
                    return false;
                }
            } while (!obj.equals(bVar.m23158b()));
            m23154j();
            return true;
        } finally {
            m23154j();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    /* renamed from: i */
    void m23153i() {
        this.f23030g.lock();
        this.f23028e.lock();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: j */
    void m23154j() {
        this.f23028e.unlock();
        this.f23030g.unlock();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(Object obj, long j10, TimeUnit timeUnit) throws InterruptedException {
        obj.getClass();
        long nanos = timeUnit.toNanos(j10);
        ReentrantLock reentrantLock = this.f23030g;
        AtomicInteger atomicInteger = this.f23025b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f23024a) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f23031h.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        m23150k(new b(obj));
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f23024a) {
            this.f23031h.signal();
        }
        if (andIncrement != 0) {
            return true;
        }
        m23151n();
        return true;
    }

    /* renamed from: p */
    void m23155p(b bVar, b bVar2) {
        bVar.m23159c(null);
        bVar2.f23038c = bVar.f23038c;
        if (this.f23027d == bVar) {
            this.f23027d = bVar2;
        }
        if (this.f23025b.getAndDecrement() == this.f23024a) {
            this.f23031h.signal();
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        if (this.f23025b.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lock();
        try {
            b bVar = this.f23026c.f23038c;
            if (bVar == null) {
                return null;
            }
            return bVar.m23158b();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        AtomicInteger atomicInteger = this.f23025b;
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                if (nanos <= 0) {
                    return null;
                }
                nanos = this.f23029f.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        Object m23150k = m23150k(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f23029f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f23024a) {
            m23152o();
        }
        return m23150k;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(Object obj) throws InterruptedException {
        obj.getClass();
        b bVar = new b(obj);
        ReentrantLock reentrantLock = this.f23030g;
        AtomicInteger atomicInteger = this.f23025b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f23024a) {
            try {
                this.f23031h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        m23150k(bVar);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f23024a) {
            this.f23031h.signal();
        }
        if (andIncrement == 0) {
            m23151n();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.f23024a - this.f23025b.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        b bVar;
        if (obj == null) {
            return false;
        }
        m23153i();
        try {
            b bVar2 = this.f23026c;
            do {
                bVar = bVar2;
                bVar2 = bVar2.f23038c;
                if (bVar2 == null) {
                    return false;
                }
            } while (!obj.equals(bVar2.m23158b()));
            m23155p(bVar2, bVar);
            m23154j();
            return true;
        } finally {
            m23154j();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f23025b.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object take() throws InterruptedException {
        AtomicInteger atomicInteger = this.f23025b;
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                this.f23029f.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Object m23150k = m23150k(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f23029f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f23024a) {
            m23152o();
        }
        return m23150k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        m23153i();
        try {
            Object[] objArr = new Object[this.f23025b.get()];
            b bVar = this.f23026c.f23038c;
            int i10 = 0;
            while (bVar != null) {
                int i11 = i10 + 1;
                objArr[i10] = bVar.m23158b();
                bVar = bVar.f23038c;
                i10 = i11;
            }
            return objArr;
        } finally {
            m23154j();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection collection, int i10) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        boolean z10 = false;
        if (i10 <= 0) {
            return 0;
        }
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lock();
        try {
            int min = Math.min(i10, this.f23025b.get());
            b bVar = this.f23026c;
            int i11 = 0;
            while (i11 < min) {
                try {
                    b bVar2 = bVar.f23038c;
                    collection.add(bVar2.m23158b());
                    bVar2.m23159c(null);
                    bVar.f23038c = bVar;
                    i11++;
                    bVar = bVar2;
                } finally {
                    if (i11 > 0) {
                        this.f23026c = bVar;
                        if (this.f23025b.getAndAdd(-i11) == this.f23024a) {
                        }
                    }
                }
            }
            return min;
        } finally {
            reentrantLock.unlock();
            if (0 != 0) {
                m23152o();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        m23153i();
        try {
            int i10 = this.f23025b.get();
            if (objArr.length < i10) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            }
            b bVar = this.f23026c.f23038c;
            int i11 = 0;
            while (bVar != null) {
                objArr[i11] = bVar.m23158b();
                bVar = bVar.f23038c;
                i11++;
            }
            if (objArr.length > i11) {
                objArr[i11] = null;
            }
            return objArr;
        } finally {
            m23154j();
        }
    }

    @Override // java.util.Queue
    public Object poll() {
        int i10 = 0;
        AtomicInteger atomicInteger = this.f23025b;
        Object obj = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f23028e;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                obj = m23150k(null);
                i10 = atomicInteger.getAndDecrement();
                if (i10 > 1) {
                    this.f23029f.signal();
                }
            } else {
                i10 = -1;
            }
            reentrantLock.unlock();
            if (i10 == this.f23024a) {
                m23152o();
            }
            return obj;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        int i10 = 0;
        obj.getClass();
        AtomicInteger atomicInteger = this.f23025b;
        if (atomicInteger.get() == this.f23024a) {
            return false;
        }
        b bVar = new b(obj);
        ReentrantLock reentrantLock = this.f23030g;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.f23024a) {
                m23150k(bVar);
                i10 = atomicInteger.getAndIncrement();
                if (i10 + 1 < this.f23024a) {
                    this.f23031h.signal();
                }
            } else {
                i10 = -1;
            }
            if (i10 == 0) {
                m23151n();
            }
            return i10 >= 0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
