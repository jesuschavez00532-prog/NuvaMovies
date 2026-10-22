package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final InterfaceC5073b[] sources;

    public ParallelFromArray(InterfaceC5073b[] interfaceC5073bArr) {
        this.sources = interfaceC5073bArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC5074c[] interfaceC5074cArr) {
        if (!validate(interfaceC5074cArr)) {
            return;
        }
        int length = interfaceC5074cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sources[i10].subscribe(interfaceC5074cArr[i10]);
        }
    }
}
