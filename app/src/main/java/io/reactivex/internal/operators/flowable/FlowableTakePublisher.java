package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final InterfaceC5073b source;

    public FlowableTakePublisher(InterfaceC5073b interfaceC5073b, long j10) {
        this.source = interfaceC5073b;
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(interfaceC5074c, this.limit));
    }
}
