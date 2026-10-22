package p182j;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.b */
/* loaded from: classes.dex */
public class C4966b implements Iterable {

    /* renamed from: a */
    c f20676a;

    /* renamed from: b */
    private c f20677b;

    /* renamed from: c */
    private WeakHashMap f20678c = new WeakHashMap();

    /* renamed from: d */
    private int f20679d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j.b$a */
    /* loaded from: classes.dex */
    public static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p182j.C4966b.e
        /* renamed from: c */
        c mo20303c(c cVar) {
            return cVar.f20683d;
        }

        @Override // p182j.C4966b.e
        /* renamed from: d */
        c mo20304d(c cVar) {
            return cVar.f20682c;
        }
    }

    /* renamed from: j.b$b */
    /* loaded from: classes.dex */
    private static class b extends e {
        b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p182j.C4966b.e
        /* renamed from: c */
        c mo20303c(c cVar) {
            return cVar.f20682c;
        }

        @Override // p182j.C4966b.e
        /* renamed from: d */
        c mo20304d(c cVar) {
            return cVar.f20683d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j.b$c */
    /* loaded from: classes.dex */
    public static class c implements Map.Entry {

        /* renamed from: a */
        final Object f20680a;

        /* renamed from: b */
        final Object f20681b;

        /* renamed from: c */
        c f20682c;

        /* renamed from: d */
        c f20683d;

        c(Object obj, Object obj2) {
            this.f20680a = obj;
            this.f20681b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f20680a.equals(cVar.f20680a) && this.f20681b.equals(cVar.f20681b)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f20680a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f20681b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20680a.hashCode() ^ this.f20681b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20680a + Operator.Operation.EQUALS + this.f20681b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j.b$d */
    /* loaded from: classes.dex */
    public class d implements Iterator, f {

        /* renamed from: a */
        private c f20684a;

        /* renamed from: b */
        private boolean f20685b = true;

        d() {
        }

        @Override // p182j.C4966b.f
        /* renamed from: b */
        public void mo20305b(c cVar) {
            boolean z10;
            c cVar2 = this.f20684a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f20683d;
                this.f20684a = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f20685b = z10;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f20685b) {
                this.f20685b = false;
                this.f20684a = C4966b.this.f20676a;
            } else {
                c cVar2 = this.f20684a;
                if (cVar2 != null) {
                    cVar = cVar2.f20682c;
                } else {
                    cVar = null;
                }
                this.f20684a = cVar;
            }
            return this.f20684a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20685b) {
                if (C4966b.this.f20676a != null) {
                    return true;
                }
                return false;
            }
            c cVar = this.f20684a;
            if (cVar != null && cVar.f20682c != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j.b$e */
    /* loaded from: classes.dex */
    private static abstract class e implements Iterator, f {

        /* renamed from: a */
        c f20687a;

        /* renamed from: b */
        c f20688b;

        e(c cVar, c cVar2) {
            this.f20687a = cVar2;
            this.f20688b = cVar;
        }

        /* renamed from: f */
        private c m20307f() {
            c cVar = this.f20688b;
            c cVar2 = this.f20687a;
            if (cVar != cVar2 && cVar2 != null) {
                return mo20304d(cVar);
            }
            return null;
        }

        @Override // p182j.C4966b.f
        /* renamed from: b */
        public void mo20305b(c cVar) {
            if (this.f20687a == cVar && cVar == this.f20688b) {
                this.f20688b = null;
                this.f20687a = null;
            }
            c cVar2 = this.f20687a;
            if (cVar2 == cVar) {
                this.f20687a = mo20303c(cVar2);
            }
            if (this.f20688b == cVar) {
                this.f20688b = m20307f();
            }
        }

        /* renamed from: c */
        abstract c mo20303c(c cVar);

        /* renamed from: d */
        abstract c mo20304d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f20688b;
            this.f20688b = m20307f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20688b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j.b$f */
    /* loaded from: classes.dex */
    interface f {
        /* renamed from: b */
        void mo20305b(c cVar);
    }

    /* renamed from: c */
    public Map.Entry m20299c() {
        return this.f20676a;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f20677b, this.f20676a);
        this.f20678c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4966b)) {
            return false;
        }
        C4966b c4966b = (C4966b) obj;
        if (size() != c4966b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c4966b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    protected c mo20295g(Object obj) {
        c cVar = this.f20676a;
        while (cVar != null && !cVar.f20680a.equals(obj)) {
            cVar = cVar.f20682c;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    /* renamed from: i */
    public d m20300i() {
        d dVar = new d();
        this.f20678c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f20676a, this.f20677b);
        this.f20678c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public Map.Entry m20301j() {
        return this.f20677b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public c m20302k(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f20679d++;
        c cVar2 = this.f20677b;
        if (cVar2 == null) {
            this.f20676a = cVar;
            this.f20677b = cVar;
            return cVar;
        }
        cVar2.f20682c = cVar;
        cVar.f20683d = cVar2;
        this.f20677b = cVar;
        return cVar;
    }

    /* renamed from: n */
    public Object mo20296n(Object obj, Object obj2) {
        c mo20295g = mo20295g(obj);
        if (mo20295g != null) {
            return mo20295g.f20681b;
        }
        m20302k(obj, obj2);
        return null;
    }

    /* renamed from: o */
    public Object mo20297o(Object obj) {
        c mo20295g = mo20295g(obj);
        if (mo20295g == null) {
            return null;
        }
        this.f20679d--;
        if (!this.f20678c.isEmpty()) {
            Iterator it = this.f20678c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo20305b(mo20295g);
            }
        }
        c cVar = mo20295g.f20683d;
        if (cVar != null) {
            cVar.f20682c = mo20295g.f20682c;
        } else {
            this.f20676a = mo20295g.f20682c;
        }
        c cVar2 = mo20295g.f20682c;
        if (cVar2 != null) {
            cVar2.f20683d = cVar;
        } else {
            this.f20677b = cVar;
        }
        mo20295g.f20682c = null;
        mo20295g.f20683d = null;
        return mo20295g.f20681b;
    }

    public int size() {
        return this.f20679d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
