package p278p1;

import com.bumptech.glide.C1592i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;
import p373w.InterfaceC7339d;

/* renamed from: p1.s */
/* loaded from: classes.dex */
public class C6179s {

    /* renamed from: e */
    private static final c f24301e = new c();

    /* renamed from: f */
    private static final InterfaceC6175o f24302f = new a();

    /* renamed from: a */
    private final List f24303a;

    /* renamed from: b */
    private final c f24304b;

    /* renamed from: c */
    private final Set f24305c;

    /* renamed from: d */
    private final InterfaceC7339d f24306d;

    /* renamed from: p1.s$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC6175o {
        a() {
        }

        @Override // p278p1.InterfaceC6175o
        /* renamed from: a */
        public boolean mo7342a(Object obj) {
            return false;
        }

        @Override // p278p1.InterfaceC6175o
        /* renamed from: b */
        public InterfaceC6175o.a mo7343b(Object obj, int i10, int i11, C4977h c4977h) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.s$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Class f24307a;

        /* renamed from: b */
        final Class f24308b;

        /* renamed from: c */
        final InterfaceC6176p f24309c;

        public b(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
            this.f24307a = cls;
            this.f24308b = cls2;
            this.f24309c = interfaceC6176p;
        }

        /* renamed from: a */
        public boolean m24687a(Class cls) {
            return this.f24307a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m24688b(Class cls, Class cls2) {
            if (m24687a(cls) && this.f24308b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: p1.s$c */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        /* renamed from: a */
        public C6178r m24689a(List list, InterfaceC7339d interfaceC7339d) {
            return new C6178r(list, interfaceC7339d);
        }
    }

    public C6179s(InterfaceC7339d interfaceC7339d) {
        this(interfaceC7339d, f24301e);
    }

    /* renamed from: a */
    private void m24677a(Class cls, Class cls2, InterfaceC6176p interfaceC6176p, boolean z10) {
        int i10;
        b bVar = new b(cls, cls2, interfaceC6176p);
        List list = this.f24303a;
        if (z10) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        list.add(i10, bVar);
    }

    /* renamed from: e */
    private InterfaceC6175o m24678e(b bVar) {
        return (InterfaceC6175o) AbstractC4121k.m17226d(bVar.f24309c.mo7348d(this));
    }

    /* renamed from: f */
    private static InterfaceC6175o m24679f() {
        return f24302f;
    }

    /* renamed from: h */
    private InterfaceC6176p m24680h(b bVar) {
        return bVar.f24309c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m24681b(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        m24677a(cls, cls2, interfaceC6176p, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List m24682c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f24303a) {
                if (!this.f24305c.contains(bVar) && bVar.m24687a(cls)) {
                    this.f24305c.add(bVar);
                    arrayList.add(m24678e(bVar));
                    this.f24305c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f24305c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized InterfaceC6175o m24683d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f24303a) {
                if (this.f24305c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.m24688b(cls, cls2)) {
                    this.f24305c.add(bVar);
                    arrayList.add(m24678e(bVar));
                    this.f24305c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f24304b.m24689a(arrayList, this.f24306d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC6175o) arrayList.get(0);
            }
            if (z10) {
                return m24679f();
            }
            throw new C1592i.c(cls, cls2);
        } catch (Throwable th) {
            this.f24305c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List m24684g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f24303a) {
            if (!arrayList.contains(bVar.f24308b) && bVar.m24687a(cls)) {
                arrayList.add(bVar.f24308b);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    synchronized List m24685i(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f24303a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m24688b(cls, cls2)) {
                it.remove();
                arrayList.add(m24680h(bVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized List m24686j(Class cls, Class cls2, InterfaceC6176p interfaceC6176p) {
        List m24685i;
        m24685i = m24685i(cls, cls2);
        m24681b(cls, cls2, interfaceC6176p);
        return m24685i;
    }

    C6179s(InterfaceC7339d interfaceC7339d, c cVar) {
        this.f24303a = new ArrayList();
        this.f24305c = new HashSet();
        this.f24306d = interfaceC7339d;
        this.f24304b = cVar;
    }
}
