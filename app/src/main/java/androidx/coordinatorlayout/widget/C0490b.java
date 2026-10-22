package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p214l.C5311i;
import p373w.C7340e;
import p373w.InterfaceC7339d;

/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes.dex */
public final class C0490b {

    /* renamed from: a */
    private final InterfaceC7339d f2169a = new C7340e(10);

    /* renamed from: b */
    private final C5311i f2170b = new C5311i();

    /* renamed from: c */
    private final ArrayList f2171c = new ArrayList();

    /* renamed from: d */
    private final HashSet f2172d = new HashSet();

    /* renamed from: e */
    private void m2161e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f2170b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m2161e(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList m2162f() {
        ArrayList arrayList = (ArrayList) this.f2169a.mo16818b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: j */
    private void m2163j(ArrayList arrayList) {
        arrayList.clear();
        this.f2169a.mo16817a(arrayList);
    }

    /* renamed from: a */
    public void m2164a(Object obj, Object obj2) {
        if (this.f2170b.containsKey(obj) && this.f2170b.containsKey(obj2)) {
            ArrayList arrayList = (ArrayList) this.f2170b.get(obj);
            if (arrayList == null) {
                arrayList = m2162f();
                this.f2170b.put(obj, arrayList);
            }
            arrayList.add(obj2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m2165b(Object obj) {
        if (!this.f2170b.containsKey(obj)) {
            this.f2170b.put(obj, null);
        }
    }

    /* renamed from: c */
    public void m2166c() {
        int size = this.f2170b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2170b.m21435m(i10);
            if (arrayList != null) {
                m2163j(arrayList);
            }
        }
        this.f2170b.clear();
    }

    /* renamed from: d */
    public boolean m2167d(Object obj) {
        return this.f2170b.containsKey(obj);
    }

    /* renamed from: g */
    public List m2168g(Object obj) {
        int size = this.f2170b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f2170b.m21435m(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2170b.m21434i(i10));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList m2169h() {
        this.f2171c.clear();
        this.f2172d.clear();
        int size = this.f2170b.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2161e(this.f2170b.m21434i(i10), this.f2171c, this.f2172d);
        }
        return this.f2171c;
    }

    /* renamed from: i */
    public boolean m2170i(Object obj) {
        int size = this.f2170b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2170b.m21435m(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
