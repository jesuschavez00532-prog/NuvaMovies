package io.reactivex;

import io.reactivex.annotations.NonNull;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public interface FlowableSubscriber<T> extends InterfaceC5074c {
    @Override // p197jf.InterfaceC5074c
    /* synthetic */ void onComplete();

    @Override // p197jf.InterfaceC5074c
    /* synthetic */ void onError(Throwable th);

    @Override // p197jf.InterfaceC5074c
    /* synthetic */ void onNext(Object obj);

    @Override // p197jf.InterfaceC5074c
    void onSubscribe(@NonNull InterfaceC5075d interfaceC5075d);
}
