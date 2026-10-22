package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, boolean z12, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable error = queueDrain.error();
            if (error != null) {
                interfaceC5074c.onError(error);
            } else {
                interfaceC5074c.onComplete();
            }
            return true;
        }
        Throwable error2 = queueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            interfaceC5074c.onError(error2);
            return true;
        }
        if (!z11) {
            return false;
        }
        interfaceC5074c.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i10) {
        if (i10 < 0) {
            return new SpscLinkedArrayQueue(-i10);
        }
        return new SpscArrayQueue(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r1 = r15.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r11, io.reactivex.Observer<? super U> r12, boolean r13, io.reactivex.disposables.Disposable r14, io.reactivex.internal.util.ObservableQueueDrain<T, U> r15) {
        /*
            r0 = 1
            r1 = 1
        L2:
            boolean r2 = r15.done()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.done()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = 1
            goto L24
        L22:
            r4 = 0
            r10 = 0
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = checkTerminated(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.leave(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.accept(r12, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.Observer, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.ObservableQueueDrain):void");
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, InterfaceC5074c interfaceC5074c, boolean z10, Disposable disposable, QueueDrain<T, U> queueDrain) {
        boolean z11;
        int i10 = 1;
        while (true) {
            boolean done = queueDrain.done();
            T poll = simplePlainQueue.poll();
            if (poll == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (checkTerminated(done, z11, interfaceC5074c, z10, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z11) {
                i10 = queueDrain.leave(-i10);
                if (i10 == 0) {
                    return;
                }
            } else {
                long requested = queueDrain.requested();
                if (requested != 0) {
                    if (queueDrain.accept(interfaceC5074c, poll) && requested != REQUESTED_MASK) {
                        queueDrain.produced(1L);
                    }
                } else {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    interfaceC5074c.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            }
        }
    }

    static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(InterfaceC5074c interfaceC5074c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            interfaceC5074c.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), interfaceC5074c, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & COMPLETED_MASK) != 0) {
                return;
            } else {
                j11 = j10 | COMPLETED_MASK;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            postCompleteDrain(j11, interfaceC5074c, queue, atomicLong, booleanSupplier);
        }
    }

    static <T> boolean postCompleteDrain(long j10, InterfaceC5074c interfaceC5074c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11 = j10 & COMPLETED_MASK;
        while (true) {
            if (j11 != j10) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                interfaceC5074c.onNext(poll);
                j11++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long addAndGet = atomicLong.addAndGet(-(j11 & REQUESTED_MASK));
                    if ((REQUESTED_MASK & addAndGet) == 0) {
                        return false;
                    }
                    j10 = addAndGet;
                    j11 = addAndGet & COMPLETED_MASK;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j10, InterfaceC5074c interfaceC5074c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            j12 = REQUESTED_MASK & j11;
        } while (!atomicLong.compareAndSet(j11, BackpressureHelper.addCap(j12, j10) | (j11 & COMPLETED_MASK)));
        if (j11 == COMPLETED_MASK) {
            postCompleteDrain(j10 | COMPLETED_MASK, interfaceC5074c, queue, atomicLong, booleanSupplier);
            return true;
        }
        return false;
    }

    public static void request(InterfaceC5075d interfaceC5075d, int i10) {
        long j10;
        if (i10 < 0) {
            j10 = REQUESTED_MASK;
        } else {
            j10 = i10;
        }
        interfaceC5075d.request(j10);
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, Observer<?> observer, boolean z12, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable error = observableQueueDrain.error();
            if (error != null) {
                observer.onError(error);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable error2 = observableQueueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(error2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
