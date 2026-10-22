package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final InterfaceC5073b source;

    public FlowableMapPublisher(InterfaceC5073b interfaceC5073b, Function<? super T, ? extends U> function) {
        this.source = interfaceC5073b;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe(new FlowableMap.MapSubscriber(interfaceC5074c, this.mapper));
    }
}
