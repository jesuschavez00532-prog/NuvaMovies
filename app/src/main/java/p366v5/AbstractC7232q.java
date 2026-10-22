package p366v5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: v5.q */
/* loaded from: classes.dex */
abstract class AbstractC7232q {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v5.q$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final C7216d f27031a;

        /* renamed from: b */
        private final Set f27032b = new HashSet();

        /* renamed from: c */
        private final Set f27033c = new HashSet();

        b(C7216d c7216d) {
            this.f27031a = c7216d;
        }

        /* renamed from: a */
        void m27983a(b bVar) {
            this.f27032b.add(bVar);
        }

        /* renamed from: b */
        void m27984b(b bVar) {
            this.f27033c.add(bVar);
        }

        /* renamed from: c */
        C7216d m27985c() {
            return this.f27031a;
        }

        /* renamed from: d */
        Set m27986d() {
            return this.f27032b;
        }

        /* renamed from: e */
        boolean m27987e() {
            return this.f27032b.isEmpty();
        }

        /* renamed from: f */
        boolean m27988f() {
            return this.f27033c.isEmpty();
        }

        /* renamed from: g */
        void m27989g(b bVar) {
            this.f27033c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v5.q$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final Class f27034a;

        /* renamed from: b */
        private final boolean f27035b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f27034a.equals(this.f27034a) || cVar.f27035b != this.f27035b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f27034a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f27035b).hashCode();
        }

        private c(Class cls, boolean z10) {
            this.f27034a = cls;
            this.f27035b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27980a(List list) {
        Set<b> m27982c = m27982c(list);
        Set m27981b = m27981b(m27982c);
        int i10 = 0;
        while (!m27981b.isEmpty()) {
            b bVar = (b) m27981b.iterator().next();
            m27981b.remove(bVar);
            i10++;
            for (b bVar2 : bVar.m27986d()) {
                bVar2.m27989g(bVar);
                if (bVar2.m27988f()) {
                    m27981b.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : m27982c) {
            if (!bVar3.m27988f() && !bVar3.m27987e()) {
                arrayList.add(bVar3.m27985c());
            }
        }
        throw new C7234s(arrayList);
    }

    /* renamed from: b */
    private static Set m27981b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m27988f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set m27982c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C7216d c7216d = (C7216d) it.next();
                b bVar = new b(c7216d);
                for (Class cls : c7216d.m27919h()) {
                    c cVar = new c(cls, !c7216d.m27923n());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f27035b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (C7233r c7233r : bVar2.m27985c().m27916e()) {
                            if (c7233r.m28000e() && (set = (Set) hashMap.get(new c(c7233r.m27998c(), c7233r.m28002g()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.m27983a(bVar3);
                                    bVar3.m27984b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
