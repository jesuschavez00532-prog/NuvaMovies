package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC5073b> function, boolean z10, int i10, int i11) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z10;
        this.maxConcurrency = i10;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC5074c[] interfaceC5074cArr) {
        if (!validate(interfaceC5074cArr)) {
            return;
        }
        int length = interfaceC5074cArr.length;
        InterfaceC5074c[] interfaceC5074cArr2 = new InterfaceC5074c[length];
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC5074cArr2[i10] = FlowableFlatMap.subscribe(interfaceC5074cArr[i10], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
        }
        this.source.subscribe(interfaceC5074cArr2);
    }
}
