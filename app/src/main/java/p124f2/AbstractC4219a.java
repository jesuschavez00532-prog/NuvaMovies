package p124f2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p373w.C7341f;
import p373w.InterfaceC7339d;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public abstract class AbstractC4219a {

    /* renamed from: a */
    private static final g f18493a = new a();

    /* renamed from: f2.a$a */
    /* loaded from: classes.dex */
    class a implements g {
        a() {
        }

        @Override // p124f2.AbstractC4219a.g
        /* renamed from: a */
        public void mo17636a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f2.a$b */
    /* loaded from: classes.dex */
    public class b implements d {
        b() {
        }

        @Override // p124f2.AbstractC4219a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List mo17637a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f2.a$c */
    /* loaded from: classes.dex */
    public class c implements g {
        c() {
        }

        @Override // p124f2.AbstractC4219a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo17636a(List list) {
            list.clear();
        }
    }

    /* renamed from: f2.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Object mo17637a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2.a$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC7339d {

        /* renamed from: a */
        private final d f18494a;

        /* renamed from: b */
        private final g f18495b;

        /* renamed from: c */
        private final InterfaceC7339d f18496c;

        e(InterfaceC7339d interfaceC7339d, d dVar, g gVar) {
            this.f18496c = interfaceC7339d;
            this.f18494a = dVar;
            this.f18495b = gVar;
        }

        @Override // p373w.InterfaceC7339d
        /* renamed from: a */
        public boolean mo16817a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo17640e().mo17648b(true);
            }
            this.f18495b.mo17636a(obj);
            return this.f18496c.mo16817a(obj);
        }

        @Override // p373w.InterfaceC7339d
        /* renamed from: b */
        public Object mo16818b() {
            Object mo16818b = this.f18496c.mo16818b();
            if (mo16818b == null) {
                mo16818b = this.f18494a.mo17637a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo16818b.getClass());
                }
            }
            if (mo16818b instanceof f) {
                ((f) mo16818b).mo17640e().mo17648b(false);
            }
            return mo16818b;
        }
    }

    /* renamed from: f2.a$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: e */
        AbstractC4221c mo17640e();
    }

    /* renamed from: f2.a$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo17636a(Object obj);
    }

    /* renamed from: a */
    private static InterfaceC7339d m17630a(InterfaceC7339d interfaceC7339d, d dVar) {
        return m17631b(interfaceC7339d, dVar, m17632c());
    }

    /* renamed from: b */
    private static InterfaceC7339d m17631b(InterfaceC7339d interfaceC7339d, d dVar, g gVar) {
        return new e(interfaceC7339d, dVar, gVar);
    }

    /* renamed from: c */
    private static g m17632c() {
        return f18493a;
    }

    /* renamed from: d */
    public static InterfaceC7339d m17633d(int i10, d dVar) {
        return m17630a(new C7341f(i10), dVar);
    }

    /* renamed from: e */
    public static InterfaceC7339d m17634e() {
        return m17635f(20);
    }

    /* renamed from: f */
    public static InterfaceC7339d m17635f(int i10) {
        return m17631b(new C7341f(i10), new b(), new c());
    }
}
