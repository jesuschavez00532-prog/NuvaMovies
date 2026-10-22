package p422z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p184j1.InterfaceC4979j;

/* renamed from: z1.e */
/* loaded from: classes.dex */
public class C7742e {

    /* renamed from: a */
    private final List f28494a = new ArrayList();

    /* renamed from: b */
    private final Map f28495b = new HashMap();

    /* renamed from: z1.e$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        private final Class f28496a;

        /* renamed from: b */
        final Class f28497b;

        /* renamed from: c */
        final InterfaceC4979j f28498c;

        public a(Class cls, Class cls2, InterfaceC4979j interfaceC4979j) {
            this.f28496a = cls;
            this.f28497b = cls2;
            this.f28498c = interfaceC4979j;
        }

        /* renamed from: a */
        public boolean m29935a(Class cls, Class cls2) {
            if (this.f28496a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f28497b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    private synchronized List m29930c(String str) {
        List list;
        if (!this.f28494a.contains(str)) {
            this.f28494a.add(str);
        }
        list = (List) this.f28495b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f28495b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized void m29931a(String str, InterfaceC4979j interfaceC4979j, Class cls, Class cls2) {
        m29930c(str).add(new a(cls, cls2, interfaceC4979j));
    }

    /* renamed from: b */
    public synchronized List m29932b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f28494a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f28495b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m29935a(cls, cls2)) {
                        arrayList.add(aVar.f28498c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m29933d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f28494a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f28495b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m29935a(cls, cls2) && !arrayList.contains(aVar.f28497b)) {
                        arrayList.add(aVar.f28497b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m29934e(List list) {
        ArrayList<String> arrayList = new ArrayList(this.f28494a);
        this.f28494a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f28494a.add((String) it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f28494a.add(str);
            }
        }
    }
}
