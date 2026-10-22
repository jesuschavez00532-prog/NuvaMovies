package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC5073b> function, int i10, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i10;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
            interfaceC5074cArr2[i10] = FlowableConcatMap.subscribe(interfaceC5074cArr[i10], this.mapper, this.prefetch, this.errorMode);
        }
        this.source.subscribe(interfaceC5074cArr2);
    }
}
