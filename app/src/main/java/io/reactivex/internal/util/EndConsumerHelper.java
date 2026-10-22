package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public final class EndConsumerHelper {
    private EndConsumerHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static String composeMessage(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void reportDoubleSubscription(Class<?> cls) {
        RxJavaPlugins.onError(new ProtocolViolationException(composeMessage(cls.getName())));
    }

    public static boolean setOnce(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        ObjectHelper.requireNonNull(disposable, "next is null");
        if (AbstractC5127x.m20760a(atomicReference, null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(Disposable disposable, Disposable disposable2, Class<?> cls) {
        ObjectHelper.requireNonNull(disposable2, "next is null");
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        if (disposable == DisposableHelper.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(InterfaceC5075d interfaceC5075d, InterfaceC5075d interfaceC5075d2, Class<?> cls) {
        ObjectHelper.requireNonNull(interfaceC5075d2, "next is null");
        if (interfaceC5075d == null) {
            return true;
        }
        interfaceC5075d2.cancel();
        if (interfaceC5075d == SubscriptionHelper.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC5075d> atomicReference, InterfaceC5075d interfaceC5075d, Class<?> cls) {
        ObjectHelper.requireNonNull(interfaceC5075d, "next is null");
        if (AbstractC5127x.m20760a(atomicReference, null, interfaceC5075d)) {
            return true;
        }
        interfaceC5075d.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }
}
