package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<InterfaceC5075d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i10) {
        super(i10);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        InterfaceC5075d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                InterfaceC5075d interfaceC5075d = get(i10);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC5075d != subscriptionHelper && (andSet = getAndSet(i10, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get(0) != SubscriptionHelper.CANCELLED) {
            return false;
        }
        return true;
    }

    public InterfaceC5075d replaceResource(int i10, InterfaceC5075d interfaceC5075d) {
        InterfaceC5075d interfaceC5075d2;
        do {
            interfaceC5075d2 = get(i10);
            if (interfaceC5075d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC5075d != null) {
                    interfaceC5075d.cancel();
                    return null;
                }
                return null;
            }
        } while (!compareAndSet(i10, interfaceC5075d2, interfaceC5075d));
        return interfaceC5075d2;
    }

    public boolean setResource(int i10, InterfaceC5075d interfaceC5075d) {
        InterfaceC5075d interfaceC5075d2;
        do {
            interfaceC5075d2 = get(i10);
            if (interfaceC5075d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC5075d != null) {
                    interfaceC5075d.cancel();
                    return false;
                }
                return false;
            }
        } while (!compareAndSet(i10, interfaceC5075d2, interfaceC5075d));
        if (interfaceC5075d2 != null) {
            interfaceC5075d2.cancel();
            return true;
        }
        return true;
    }
}
