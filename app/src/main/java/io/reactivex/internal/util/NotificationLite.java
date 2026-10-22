package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public enum NotificationLite {
    COMPLETE;

    /* loaded from: classes3.dex */
    static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    /* loaded from: classes3.dex */
    static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final Throwable f20671e;

        ErrorNotification(Throwable th) {
            this.f20671e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.f20671e, ((ErrorNotification) obj).f20671e);
            }
            return false;
        }

        public int hashCode() {
            return this.f20671e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f20671e + "]";
        }
    }

    /* loaded from: classes3.dex */
    static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final InterfaceC5075d upstream;

        SubscriptionNotification(InterfaceC5075d interfaceC5075d) {
            this.upstream = interfaceC5075d;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, InterfaceC5074c interfaceC5074c) {
        if (obj == COMPLETE) {
            interfaceC5074c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC5074c.onError(((ErrorNotification) obj).f20671e);
            return true;
        }
        interfaceC5074c.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC5074c interfaceC5074c) {
        if (obj == COMPLETE) {
            interfaceC5074c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC5074c.onError(((ErrorNotification) obj).f20671e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            interfaceC5074c.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        interfaceC5074c.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f20671e;
    }

    public static InterfaceC5075d getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(InterfaceC5075d interfaceC5075d) {
        return new SubscriptionNotification(interfaceC5075d);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f20671e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f20671e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        observer.onNext(obj);
        return false;
    }
}
