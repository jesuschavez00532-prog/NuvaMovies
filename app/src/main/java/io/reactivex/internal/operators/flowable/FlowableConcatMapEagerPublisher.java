package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final InterfaceC5073b source;

    public FlowableConcatMapEagerPublisher(InterfaceC5073b interfaceC5073b, Function<? super T, ? extends InterfaceC5073b> function, int i10, int i11, ErrorMode errorMode) {
        this.source = interfaceC5073b;
        this.mapper = function;
        this.maxConcurrency = i10;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(interfaceC5074c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
