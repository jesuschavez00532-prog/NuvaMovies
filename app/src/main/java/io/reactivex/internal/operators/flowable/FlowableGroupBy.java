package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final Function<? super T, ? extends K> keySelector;
    final Function<? super Consumer<Object>, ? extends Map<K, Object>> mapFactory;
    final Function<? super T, ? extends V> valueSelector;

    /* loaded from: classes3.dex */
    static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        final Queue<GroupedUnicast<K, V>> evictedGroups;

        EvictionAction(Queue<GroupedUnicast<K, V>> queue) {
            this.evictedGroups = queue;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(GroupedUnicast<K, V> groupedUnicast) {
            this.evictedGroups.offer(groupedUnicast);
        }
    }

    /* loaded from: classes3.dex */
    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        boolean done;
        final InterfaceC5074c downstream;
        Throwable error;
        final Queue<GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        InterfaceC5075d upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger groupCount = new AtomicInteger(1);

        public GroupBySubscriber(InterfaceC5074c interfaceC5074c, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = interfaceC5074c;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i10;
            this.delayError = z10;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i10);
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i10 = 0;
                while (true) {
                    GroupedUnicast<K, V> poll = this.evictedGroups.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.onComplete();
                    i10++;
                }
                if (i10 != 0) {
                    this.groupCount.addAndGet(-i10);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (z10 && z11) {
                    Throwable th = this.error;
                    if (th != null) {
                        interfaceC5074c.onError(th);
                    } else {
                        interfaceC5074c.onComplete();
                    }
                    return true;
                }
                return false;
            }
            if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC5074c.onError(th2);
                    return true;
                }
                if (z11) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC5074c interfaceC5074c = this.downstream;
            int i10 = 1;
            while (!this.cancelled.get()) {
                boolean z10 = this.finished;
                if (z10 && !this.delayError && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC5074c.onError(th);
                    return;
                }
                interfaceC5074c.onNext(null);
                if (z10) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        interfaceC5074c.onError(th2);
                        return;
                    } else {
                        interfaceC5074c.onComplete();
                        return;
                    }
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        void drainNormal() {
            boolean z10;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC5074c interfaceC5074c = this.downstream;
            int i10 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = this.finished;
                    GroupedFlowable<K, V> poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (checkTerminated(z11, z10, interfaceC5074c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC5074c.onNext(poll);
                    j11++;
                }
                if (j11 == j10 && checkTerminated(this.finished, spscLinkedArrayQueue.isEmpty(), interfaceC5074c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
                    }
                    this.upstream.request(j11);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (!this.done) {
                Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                this.groups.clear();
                Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
                if (queue != null) {
                    queue.clear();
                }
                this.done = true;
                this.finished = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            Object obj;
            boolean z10;
            GroupedUnicast groupedUnicast;
            if (this.done) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            try {
                K apply = this.keySelector.apply(t10);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                GroupedUnicast<K, V> groupedUnicast2 = this.groups.get(obj);
                if (groupedUnicast2 == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    GroupedUnicast createWith = GroupedUnicast.createWith(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, createWith);
                    this.groupCount.getAndIncrement();
                    z10 = true;
                    groupedUnicast = createWith;
                } else {
                    z10 = false;
                    groupedUnicast = groupedUnicast2;
                }
                try {
                    groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t10), "The valueSelector returned null"));
                    completeEvictions();
                    if (z10) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        drain();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(this.bufferSize);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.queue.poll();
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) NULL_KEY;
            }
            this.groups.remove(k10);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (this.outputFused || getAndIncrement() != 0) {
                    return;
                }
                this.queue.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        final State<T, K> state;

        protected GroupedUnicast(K k10, State<T, K> state) {
            super(k10);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k10, int i10, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z10) {
            return new GroupedUnicast<>(k10, new State(i10, groupBySubscriber, k10, z10));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t10) {
            this.state.onNext(t10);
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
            this.state.subscribe(interfaceC5074c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements InterfaceC5073b {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        boolean outputFused;
        final GroupBySubscriber<?, K, T> parent;
        int produced;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<InterfaceC5074c> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();

        State(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.parent = groupBySubscriber;
            this.key = k10;
            this.delayError = z10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
                drain();
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, boolean z12, long j10) {
            if (this.cancelled.get()) {
                while (this.queue.poll() != null) {
                    j10++;
                }
                if (j10 != 0) {
                    this.parent.upstream.request(j10);
                }
                return true;
            }
            if (z10) {
                if (z12) {
                    if (z11) {
                        Throwable th = this.error;
                        if (th != null) {
                            interfaceC5074c.onError(th);
                        } else {
                            interfaceC5074c.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    interfaceC5074c.onError(th2);
                    return true;
                }
                if (z11) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            while (spscLinkedArrayQueue.poll() != null) {
                this.produced++;
            }
            tryReplenish();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            InterfaceC5074c interfaceC5074c = this.actual.get();
            int i10 = 1;
            while (true) {
                if (interfaceC5074c != null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    boolean z10 = this.done;
                    if (z10 && !this.delayError && (th = this.error) != null) {
                        spscLinkedArrayQueue.clear();
                        interfaceC5074c.onError(th);
                        return;
                    }
                    interfaceC5074c.onNext(null);
                    if (z10) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            interfaceC5074c.onError(th2);
                            return;
                        } else {
                            interfaceC5074c.onComplete();
                            return;
                        }
                    }
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
                if (interfaceC5074c == null) {
                    interfaceC5074c = this.actual.get();
                }
            }
        }

        void drainNormal() {
            boolean z10;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z11 = this.delayError;
            InterfaceC5074c interfaceC5074c = this.actual.get();
            int i10 = 1;
            while (true) {
                if (interfaceC5074c != null) {
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            break;
                        }
                        boolean z12 = this.done;
                        T poll = spscLinkedArrayQueue.poll();
                        if (poll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j12 = j11;
                        if (checkTerminated(z12, z10, interfaceC5074c, z11, j11)) {
                            return;
                        }
                        if (z10) {
                            j11 = j12;
                            break;
                        } else {
                            interfaceC5074c.onNext(poll);
                            j11 = j12 + 1;
                        }
                    }
                    if (j11 == j10) {
                        long j13 = j11;
                        if (checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC5074c, z11, j11)) {
                            return;
                        } else {
                            j11 = j13;
                        }
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j11);
                        }
                        this.parent.upstream.request(j11);
                    }
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
                if (interfaceC5074c == null) {
                    interfaceC5074c = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.queue.isEmpty()) {
                tryReplenish();
                return true;
            }
            return false;
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null) {
                this.produced++;
                return poll;
            }
            tryReplenish();
            return null;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // p197jf.InterfaceC5073b
        public void subscribe(InterfaceC5074c interfaceC5074c) {
            if (this.once.compareAndSet(false, true)) {
                interfaceC5074c.onSubscribe(this);
                this.actual.lazySet(interfaceC5074c);
                drain();
                return;
            }
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), interfaceC5074c);
        }

        void tryReplenish() {
            int i10 = this.produced;
            if (i10 != 0) {
                this.produced = 0;
                this.parent.upstream.request(i10);
            }
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i10;
        this.delayError = z10;
        this.mapFactory = function3;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> apply;
        try {
            if (this.mapFactory == null) {
                apply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                apply = this.mapFactory.apply(new EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(interfaceC5074c, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, apply, concurrentLinkedQueue));
        } catch (Exception e10) {
            Exceptions.throwIfFatal(e10);
            interfaceC5074c.onSubscribe(EmptyComponent.INSTANCE);
            interfaceC5074c.onError(e10);
        }
    }
}
