package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final InterfaceC5073b publisher;

    public FlowableFromPublisher(InterfaceC5073b interfaceC5073b) {
        this.publisher = interfaceC5073b;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.publisher.subscribe(interfaceC5074c);
    }
}
