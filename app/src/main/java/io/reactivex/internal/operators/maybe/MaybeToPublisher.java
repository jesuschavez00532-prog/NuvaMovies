package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p197jf.InterfaceC5073b;

/* loaded from: classes3.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, InterfaceC5073b> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, InterfaceC5073b> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public InterfaceC5073b apply(MaybeSource<Object> maybeSource) {
        return new MaybeToFlowable(maybeSource);
    }
}
