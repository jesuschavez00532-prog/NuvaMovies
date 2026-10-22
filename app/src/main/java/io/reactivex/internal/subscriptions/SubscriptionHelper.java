package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public enum SubscriptionHelper implements InterfaceC5075d {
    CANCELLED;

    public static void deferredRequest(AtomicReference<InterfaceC5075d> atomicReference, AtomicLong atomicLong, long j10) {
        InterfaceC5075d interfaceC5075d = atomicReference.get();
        if (interfaceC5075d != null) {
            interfaceC5075d.request(j10);
            return;
        }
        if (validate(j10)) {
            BackpressureHelper.add(atomicLong, j10);
            InterfaceC5075d interfaceC5075d2 = atomicReference.get();
            if (interfaceC5075d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC5075d2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC5075d> atomicReference, AtomicLong atomicLong, InterfaceC5075d interfaceC5075d) {
        if (setOnce(atomicReference, interfaceC5075d)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC5075d.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<InterfaceC5075d> atomicReference, InterfaceC5075d interfaceC5075d) {
        InterfaceC5075d interfaceC5075d2;
        do {
            interfaceC5075d2 = atomicReference.get();
            if (interfaceC5075d2 == CANCELLED) {
                if (interfaceC5075d != null) {
                    interfaceC5075d.cancel();
                    return false;
                }
                return false;
            }
        } while (!AbstractC5127x.m20760a(atomicReference, interfaceC5075d2, interfaceC5075d));
        return true;
    }

    public static void reportMoreProduced(long j10) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j10));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC5075d> atomicReference, InterfaceC5075d interfaceC5075d) {
        InterfaceC5075d interfaceC5075d2;
        do {
            interfaceC5075d2 = atomicReference.get();
            if (interfaceC5075d2 == CANCELLED) {
                if (interfaceC5075d != null) {
                    interfaceC5075d.cancel();
                    return false;
                }
                return false;
            }
        } while (!AbstractC5127x.m20760a(atomicReference, interfaceC5075d2, interfaceC5075d));
        if (interfaceC5075d2 != null) {
            interfaceC5075d2.cancel();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<InterfaceC5075d> atomicReference, InterfaceC5075d interfaceC5075d) {
        ObjectHelper.requireNonNull(interfaceC5075d, "s is null");
        if (AbstractC5127x.m20760a(atomicReference, null, interfaceC5075d)) {
            return true;
        }
        interfaceC5075d.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(InterfaceC5075d interfaceC5075d, InterfaceC5075d interfaceC5075d2) {
        if (interfaceC5075d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC5075d == null) {
            return true;
        }
        interfaceC5075d2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
    }

    public static boolean cancel(AtomicReference<InterfaceC5075d> atomicReference) {
        InterfaceC5075d andSet;
        InterfaceC5075d interfaceC5075d = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC5075d == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC5075d> atomicReference, InterfaceC5075d interfaceC5075d, long j10) {
        if (!setOnce(atomicReference, interfaceC5075d)) {
            return false;
        }
        interfaceC5075d.request(j10);
        return true;
    }
}
