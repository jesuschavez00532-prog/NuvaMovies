package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p000a.RouterMap__TheRouter__582089875;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableScalarXMap {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends InterfaceC5073b> mapper;
        final T value;

        ScalarXMapFlowable(T t10, Function<? super T, ? extends InterfaceC5073b> function) {
            this.value = t10;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC5074c interfaceC5074c) {
            try {
                InterfaceC5073b interfaceC5073b = (InterfaceC5073b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (interfaceC5073b instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC5073b).call();
                        if (call == null) {
                            EmptySubscription.complete(interfaceC5074c);
                            return;
                        } else {
                            interfaceC5074c.onSubscribe(new ScalarSubscription(interfaceC5074c, call));
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, interfaceC5074c);
                        return;
                    }
                }
                interfaceC5073b.subscribe(interfaceC5074c);
            } catch (Throwable th2) {
                EmptySubscription.error(th2, interfaceC5074c);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t10, Function<? super T, ? extends InterfaceC5073b> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t10, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(InterfaceC5073b interfaceC5073b, InterfaceC5074c interfaceC5074c, Function<? super T, ? extends InterfaceC5073b> function) {
        if (interfaceC5073b instanceof Callable) {
            try {
                RouterMap__TheRouter__582089875 routerMap__TheRouter__582089875 = (Object) ((Callable) interfaceC5073b).call();
                if (routerMap__TheRouter__582089875 == null) {
                    EmptySubscription.complete(interfaceC5074c);
                    return true;
                }
                try {
                    InterfaceC5073b interfaceC5073b2 = (InterfaceC5073b) ObjectHelper.requireNonNull(function.apply(routerMap__TheRouter__582089875), "The mapper returned a null Publisher");
                    if (interfaceC5073b2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC5073b2).call();
                            if (call == null) {
                                EmptySubscription.complete(interfaceC5074c);
                                return true;
                            }
                            interfaceC5074c.onSubscribe(new ScalarSubscription(interfaceC5074c, call));
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, interfaceC5074c);
                            return true;
                        }
                    } else {
                        interfaceC5073b2.subscribe(interfaceC5074c);
                    }
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, interfaceC5074c);
                    return true;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC5074c);
                return true;
            }
        }
        return false;
    }
}
