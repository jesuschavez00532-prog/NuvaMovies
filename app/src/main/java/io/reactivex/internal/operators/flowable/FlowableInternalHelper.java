package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableInternalHelper {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        BufferedReplayCallable(Flowable<T> flowable, int i10) {
            this.parent = flowable;
            this.bufferSize = i10;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        BufferedTimedReplay(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i10;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, InterfaceC5073b> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC5073b apply(Object obj) {
            return apply((FlatMapIntoIterable<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC5073b apply(T t10) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t */
        private final T f20596t;

        FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t10) {
            this.combiner = biFunction;
            this.f20596t = t10;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u10) {
            return this.combiner.apply(this.f20596t, u10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, InterfaceC5073b> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends InterfaceC5073b> mapper;

        FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends InterfaceC5073b> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC5073b apply(Object obj) {
            return apply((FlatMapWithCombinerOuter<T, R, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC5073b apply(T t10) {
            return new FlowableMapPublisher((InterfaceC5073b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ItemDelayFunction<T, U> implements Function<T, InterfaceC5073b> {
        final Function<? super T, ? extends InterfaceC5073b> itemDelay;

        ItemDelayFunction(Function<? super T, ? extends InterfaceC5073b> function) {
            this.itemDelay = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC5073b apply(Object obj) {
            return apply((ItemDelayFunction<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC5073b apply(T t10) {
            return new FlowableTakePublisher((InterfaceC5073b) ObjectHelper.requireNonNull(this.itemDelay.apply(t10), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t10)).defaultIfEmpty(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;

        ReplayCallable(Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, InterfaceC5073b> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends InterfaceC5073b> selector;

        ReplayFunction(Function<? super Flowable<T>, ? extends InterfaceC5073b> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC5073b apply(Flowable<T> flowable) {
            return Flowable.fromPublisher((InterfaceC5073b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }
    }

    /* loaded from: classes3.dex */
    public enum RequestMax implements Consumer<InterfaceC5075d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(InterfaceC5075d interfaceC5075d) {
            interfaceC5075d.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleBiGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s10, Emitter<T> emitter) {
            this.consumer.accept(s10, emitter);
            return s10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s10, Emitter<T> emitter) {
            this.consumer.accept(emitter);
            return s10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SubscriberOnComplete<T> implements Action {
        final InterfaceC5074c subscriber;

        SubscriberOnComplete(InterfaceC5074c interfaceC5074c) {
            this.subscriber = interfaceC5074c;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.subscriber.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final InterfaceC5074c subscriber;

        SubscriberOnError(InterfaceC5074c interfaceC5074c) {
            this.subscriber = interfaceC5074c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            this.subscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SubscriberOnNext<T> implements Consumer<T> {
        final InterfaceC5074c subscriber;

        SubscriberOnNext(InterfaceC5074c interfaceC5074c) {
            this.subscriber = interfaceC5074c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t10) {
            this.subscriber.onNext(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        TimedReplay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ZipIterableFunction<T, R> implements Function<List<InterfaceC5073b>, InterfaceC5073b> {
        private final Function<? super Object[], ? extends R> zipper;

        ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC5073b apply(List<InterfaceC5073b> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, InterfaceC5073b> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, InterfaceC5073b> flatMapWithCombiner(Function<? super T, ? extends InterfaceC5073b> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, InterfaceC5073b> itemDelay(Function<? super T, ? extends InterfaceC5073b> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T, R> Function<Flowable<T>, InterfaceC5073b> replayFunction(Function<? super Flowable<T>, ? extends InterfaceC5073b> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(InterfaceC5074c interfaceC5074c) {
        return new SubscriberOnComplete(interfaceC5074c);
    }

    public static <T> Consumer<Throwable> subscriberOnError(InterfaceC5074c interfaceC5074c) {
        return new SubscriberOnError(interfaceC5074c);
    }

    public static <T> Consumer<T> subscriberOnNext(InterfaceC5074c interfaceC5074c) {
        return new SubscriberOnNext(interfaceC5074c);
    }

    public static <T, R> Function<List<InterfaceC5073b>, InterfaceC5073b> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10) {
        return new BufferedReplayCallable(flowable, i10);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i10, j10, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j10, timeUnit, scheduler);
    }
}
