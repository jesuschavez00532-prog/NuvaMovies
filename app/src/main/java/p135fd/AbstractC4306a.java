package p135fd;

import io.reactivex.Completable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fd.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4306a {

    /* renamed from: a */
    static final Function f18743a = new a();

    /* renamed from: b */
    static final Predicate f18744b = new b();

    /* renamed from: c */
    static final Function f18745c = new c();

    /* renamed from: fd.a$a */
    /* loaded from: classes3.dex */
    static class a implements Function {
        a() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Throwable th) {
            if (th instanceof C4308c) {
                return Boolean.TRUE;
            }
            Exceptions.propagate(th);
            return Boolean.FALSE;
        }
    }

    /* renamed from: fd.a$b */
    /* loaded from: classes3.dex */
    static class b implements Predicate {
        b() {
        }

        @Override // io.reactivex.functions.Predicate
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Boolean bool) {
            return bool.booleanValue();
        }
    }

    /* renamed from: fd.a$c */
    /* loaded from: classes3.dex */
    static class c implements Function {
        c() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Completable apply(Object obj) {
            return Completable.error(new CancellationException());
        }
    }
}
