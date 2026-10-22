package io.reactivex;

import io.reactivex.annotations.NonNull;
import p197jf.InterfaceC5073b;

/* loaded from: classes3.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    InterfaceC5073b apply(@NonNull Flowable<Upstream> flowable);
}
