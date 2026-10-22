package p278p1;

import com.bumptech.glide.C1592i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p373w.InterfaceC7339d;

/* renamed from: p1.q */
/* loaded from: classes.dex */
public class C6177q {

    /* renamed from: a */
    private final C6179s f24288a;

    /* renamed from: b */
    private final a f24289b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.q$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Map f24290a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p1.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C7858a {

            /* renamed from: a */
            final List f24291a;

            public C7858a(List list) {
                this.f24291a = list;
            }
        }

        a() {
        }

        /* renamed from: a */
        public void m24673a() {
            this.f24290a.clear();
        }

        /* renamed from: b */
        public List m24674b(Class cls) {
            C7858a c7858a = (C7858a) this.f24290a.get(cls);
            if (c7858a == null) {
                return null;
            }
            return c7858a.f24291a;
        }

        /* renamed from: c */
        public void m24675c(Class cls, List list) {
            if (((C7858a) this.f24290a.put(cls, new C7858a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C6177q(InterfaceC7339d interfaceC7339d) {
        this(new C6179s(interfaceC7339d));
    }

    /* renamed from: b */
    private static Class m24666b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: e */
    private synchronized List m24667e(Class cls) {
        List m24674b;
        m24674b = this.f24289b.m24674b(cls);
        if (m24674b == null) {
            m24674b = Collections.unmodifiableList(this.f24288a.m24682c(cls));
            this.f24289b.m24675c(cls, m24674b);
        }
        return m24674b;
    }

    /* renamed from: g */
    private void m24668g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC6176p) it.next()).mo7347c();
        }
    }

    /* renamed from: a */
    public synchronized void m24669a(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        this.f24288a.m24681b(cls, cls2, interfaceC6176p);
        this.f24289b.m24673a();
    }

    /* renamed from: c */
    public synchronized List m24670c(Class cls) {
        return this.f24288a.m24684g(cls);
    }

    /* renamed from: d */
    public List m24671d(Object obj) {
        List m24667e = m24667e(m24666b(obj));
        if (!m24667e.isEmpty()) {
            int size = m24667e.size();
            List emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC6175o interfaceC6175o = (InterfaceC6175o) m24667e.get(i10);
                if (interfaceC6175o.mo7342a(obj)) {
                    if (z10) {
                        emptyList = new ArrayList(size - i10);
                        z10 = false;
                    }
                    emptyList.add(interfaceC6175o);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C1592i.c(obj, m24667e);
        }
        throw new C1592i.c(obj);
    }

    /* renamed from: f */
    public synchronized void m24672f(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        m24668g(this.f24288a.m24686j(cls, cls2, interfaceC6176p));
        this.f24289b.m24673a();
    }

    private C6177q(C6179s c6179s) {
        this.f24289b = new a();
        this.f24288a = c6179s;
    }
}
