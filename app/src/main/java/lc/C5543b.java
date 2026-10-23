package lc;

import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: lc.b */
/* loaded from: classes.dex */
public class C5543b {

    /* renamed from: b */
    static final String f22471b = "b";

    /* renamed from: c */
    static final Object f22472c = new Object();

    /* renamed from: a */
    d f22473a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lc.b$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        private C5546e f22474a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0729o f22475b;

        a(AbstractC0729o abstractC0729o) {
            this.f22475b = abstractC0729o;
        }

        @Override // lc.C5543b.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public synchronized C5546e get() {
            if (this.f22474a == null) {
                this.f22474a = C5543b.this.m22463g(this.f22475b);
            }
            return this.f22474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lc.b$b */
    /* loaded from: classes.dex */
    public class b implements ObservableTransformer {

        /* renamed from: a */
        final /* synthetic */ String[] f22477a;

        /* renamed from: lc.b$b$a */
        /* loaded from: classes.dex */
        class a implements Function {
            a() {
            }

            @Override // io.reactivex.functions.Function
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource apply(List list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((C5542a) it.next()).f22469b) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        b(String[] strArr) {
            this.f22477a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return C5543b.this.m22466m(observable, this.f22477a).buffer(this.f22477a.length).flatMap(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lc.b$c */
    /* loaded from: classes.dex */
    public class c implements Function {

        /* renamed from: a */
        final /* synthetic */ String[] f22480a;

        c(String[] strArr) {
            this.f22480a = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable apply(Object obj) {
            return C5543b.this.m22467o(this.f22480a);
        }
    }

    /* renamed from: lc.b$d */
    /* loaded from: classes.dex */
    public interface d {
        Object get();
    }

    public C5543b(AbstractActivityC0712e abstractActivityC0712e) {
        this.f22473a = m22462f(abstractActivityC0712e.m3294d4());
    }

    /* renamed from: e */
    private C5546e m22461e(AbstractC0729o abstractC0729o) {
        return (C5546e) abstractC0729o.m3523h0(f22471b);
    }

    /* renamed from: f */
    private d m22462f(AbstractC0729o abstractC0729o) {
        return new a(abstractC0729o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public C5546e m22463g(AbstractC0729o abstractC0729o) {
        boolean z10 = false;
        C5546e m22461e = m22461e(abstractC0729o);
        if (m22461e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C5546e c5546e = new C5546e();
            abstractC0729o.m3534m().m3640d(c5546e, f22471b).mo3230j();
            return c5546e;
        }
        return m22461e;
    }

    /* renamed from: k */
    private Observable m22464k(Observable observable, Observable observable2) {
        if (observable == null) {
            return Observable.just(f22472c);
        }
        return Observable.merge(observable, observable2);
    }

    /* renamed from: l */
    private Observable m22465l(String... strArr) {
        for (String str : strArr) {
            if (!((C5546e) this.f22473a.get()).m22479l9(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f22472c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public Observable m22466m(Observable observable, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m22464k(observable, m22465l(strArr)).flatMap(new c(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public Observable m22467o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            ((C5546e) this.f22473a.get()).m22483p9("Requesting permission " + str);
            if (m22469h(str)) {
                arrayList.add(Observable.just(new C5542a(str, true, false)));
            } else if (m22471j(str)) {
                arrayList.add(Observable.just(new C5542a(str, false, false)));
            } else {
                PublishSubject m22480m9 = ((C5546e) this.f22473a.get()).m22480m9(str);
                if (m22480m9 == null) {
                    arrayList2.add(str);
                    m22480m9 = PublishSubject.create();
                    ((C5546e) this.f22473a.get()).m22486s9(str, m22480m9);
                }
                arrayList.add(m22480m9);
            }
        }
        if (!arrayList2.isEmpty()) {
            m22473p((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    /* renamed from: d */
    public ObservableTransformer m22468d(String... strArr) {
        return new b(strArr);
    }

    /* renamed from: h */
    public boolean m22469h(String str) {
        if (m22470i() && !((C5546e) this.f22473a.get()).m22481n9(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    boolean m22470i() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m22471j(String str) {
        if (m22470i() && ((C5546e) this.f22473a.get()).m22482o9(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public Observable m22472n(String... strArr) {
        return Observable.just(f22472c).compose(m22468d(strArr));
    }

    /* renamed from: p */
    void m22473p(String[] strArr) {
        ((C5546e) this.f22473a.get()).m22483p9("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        ((C5546e) this.f22473a.get()).m22485r9(strArr);
    }
}
