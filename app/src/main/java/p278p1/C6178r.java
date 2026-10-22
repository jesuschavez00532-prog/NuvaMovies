package p278p1;

import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;
import p216l1.C5330q;
import p278p1.InterfaceC6175o;
import p373w.InterfaceC7339d;

/* renamed from: p1.r */
/* loaded from: classes.dex */
class C6178r implements InterfaceC6175o {

    /* renamed from: a */
    private final List f24292a;

    /* renamed from: b */
    private final InterfaceC7339d f24293b;

    /* renamed from: p1.r$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC1604d, InterfaceC1604d.a {

        /* renamed from: a */
        private final List f24294a;

        /* renamed from: b */
        private final InterfaceC7339d f24295b;

        /* renamed from: c */
        private int f24296c;

        /* renamed from: d */
        private EnumC1591h f24297d;

        /* renamed from: e */
        private InterfaceC1604d.a f24298e;

        /* renamed from: f */
        private List f24299f;

        /* renamed from: g */
        private boolean f24300g;

        a(List list, InterfaceC7339d interfaceC7339d) {
            this.f24295b = interfaceC7339d;
            AbstractC4121k.m17225c(list);
            this.f24294a = list;
            this.f24296c = 0;
        }

        /* renamed from: f */
        private void m24676f() {
            if (this.f24300g) {
                return;
            }
            if (this.f24296c < this.f24294a.size() - 1) {
                this.f24296c++;
                mo7425d(this.f24297d, this.f24298e);
            } else {
                AbstractC4121k.m17226d(this.f24299f);
                this.f24298e.mo7430c(new C5330q("Fetch failed", new ArrayList(this.f24299f)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return ((InterfaceC1604d) this.f24294a.get(0)).mo7418a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
            List list = this.f24299f;
            if (list != null) {
                this.f24295b.mo16817a(list);
            }
            this.f24299f = null;
            Iterator it = this.f24294a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1604d) it.next()).mo7423b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
        /* renamed from: c */
        public void mo7430c(Exception exc) {
            ((List) AbstractC4121k.m17226d(this.f24299f)).add(exc);
            m24676f();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
            this.f24300g = true;
            Iterator it = this.f24294a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1604d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            this.f24297d = enumC1591h;
            this.f24298e = aVar;
            this.f24299f = (List) this.f24295b.mo16818b();
            ((InterfaceC1604d) this.f24294a.get(this.f24296c)).mo7425d(enumC1591h, this);
            if (this.f24300g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
        /* renamed from: e */
        public void mo7431e(Object obj) {
            if (obj != null) {
                this.f24298e.mo7431e(obj);
            } else {
                m24676f();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return ((InterfaceC1604d) this.f24294a.get(0)).getDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6178r(List list, InterfaceC7339d interfaceC7339d) {
        this.f24292a = list;
        this.f24293b = interfaceC7339d;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: a */
    public boolean mo7342a(Object obj) {
        Iterator it = this.f24292a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6175o) it.next()).mo7342a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: b */
    public InterfaceC6175o.a mo7343b(Object obj, int i10, int i11, C4977h c4977h) {
        InterfaceC6175o.a mo7343b;
        int size = this.f24292a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC4975f interfaceC4975f = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC6175o interfaceC6175o = (InterfaceC6175o) this.f24292a.get(i12);
            if (interfaceC6175o.mo7342a(obj) && (mo7343b = interfaceC6175o.mo7343b(obj, i10, i11, c4977h)) != null) {
                interfaceC4975f = mo7343b.f24285a;
                arrayList.add(mo7343b.f24287c);
            }
        }
        if (arrayList.isEmpty() || interfaceC4975f == null) {
            return null;
        }
        return new InterfaceC6175o.a(interfaceC4975f, new a(arrayList, this.f24293b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f24292a.toArray()) + '}';
    }
}
