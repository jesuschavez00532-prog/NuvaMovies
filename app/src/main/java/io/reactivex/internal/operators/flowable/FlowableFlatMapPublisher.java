package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final int maxConcurrency;
    final InterfaceC5073b source;

    public FlowableFlatMapPublisher(InterfaceC5073b interfaceC5073b, Function<? super T, ? extends InterfaceC5073b> function, boolean z10, int i10, int i11) {
        this.source = interfaceC5073b;
        this.mapper = function;
        this.delayErrors = z10;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC5074c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(interfaceC5074c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
