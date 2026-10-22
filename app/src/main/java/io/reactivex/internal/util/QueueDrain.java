package io.reactivex.internal.util;

import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public interface QueueDrain<T, U> {
    boolean accept(InterfaceC5074c interfaceC5074c, T t10);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i10);

    long produced(long j10);

    long requested();
}
