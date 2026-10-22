package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p214l.C5308f;
import p214l.C5311i;
import p373w.C7340e;
import p373w.InterfaceC7339d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public class C0831r {

    /* renamed from: a */
    final C5311i f3496a = new C5311i();

    /* renamed from: b */
    final C5308f f3497b = new C5308f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.r$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static InterfaceC7339d f3498d = new C7340e(20);

        /* renamed from: a */
        int f3499a;

        /* renamed from: b */
        RecyclerView.AbstractC0794m.b f3500b;

        /* renamed from: c */
        RecyclerView.AbstractC0794m.b f3501c;

        private a() {
        }

        /* renamed from: a */
        static void m4301a() {
            do {
            } while (f3498d.mo16818b() != null);
        }

        /* renamed from: b */
        static a m4302b() {
            a aVar = (a) f3498d.mo16818b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        /* renamed from: c */
        static void m4303c(a aVar) {
            aVar.f3499a = 0;
            aVar.f3500b = null;
            aVar.f3501c = null;
            f3498d.mo16817a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.r$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo3845a(RecyclerView.AbstractC0787f0 abstractC0787f0);

        /* renamed from: b */
        void mo3846b(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2);

        /* renamed from: c */
        void mo3847c(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2);

        /* renamed from: d */
        void mo3848d(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0794m.b m4284l(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10) {
        a aVar;
        RecyclerView.AbstractC0794m.b bVar;
        int m21431f = this.f3496a.m21431f(abstractC0787f0);
        if (m21431f >= 0 && (aVar = (a) this.f3496a.m21435m(m21431f)) != null) {
            int i11 = aVar.f3499a;
            if ((i11 & i10) != 0) {
                int i12 = (i10 ^ (-1)) & i11;
                aVar.f3499a = i12;
                if (i10 == 4) {
                    bVar = aVar.f3500b;
                } else if (i10 == 8) {
                    bVar = aVar.f3501c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3496a.mo17198k(m21431f);
                    a.m4303c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4285a(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar == null) {
            aVar = a.m4302b();
            this.f3496a.put(abstractC0787f0, aVar);
        }
        aVar.f3499a |= 2;
        aVar.f3500b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4286b(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar == null) {
            aVar = a.m4302b();
            this.f3496a.put(abstractC0787f0, aVar);
        }
        aVar.f3499a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4287c(long j10, RecyclerView.AbstractC0787f0 abstractC0787f0) {
        this.f3497b.m21399l(j10, abstractC0787f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4288d(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar == null) {
            aVar = a.m4302b();
            this.f3496a.put(abstractC0787f0, aVar);
        }
        aVar.f3501c = bVar;
        aVar.f3499a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4289e(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar == null) {
            aVar = a.m4302b();
            this.f3496a.put(abstractC0787f0, aVar);
        }
        aVar.f3500b = bVar;
        aVar.f3499a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4290f() {
        this.f3496a.clear();
        this.f3497b.m21391b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC0787f0 m4291g(long j10) {
        return (RecyclerView.AbstractC0787f0) this.f3497b.m21394g(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m4292h(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar != null && (aVar.f3499a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m4293i(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar != null && (aVar.f3499a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4294j() {
        a.m4301a();
    }

    /* renamed from: k */
    public void m4295k(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4299p(abstractC0787f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC0794m.b m4296m(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        return m4284l(abstractC0787f0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC0794m.b m4297n(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        return m4284l(abstractC0787f0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m4298o(b bVar) {
        for (int size = this.f3496a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0787f0 abstractC0787f0 = (RecyclerView.AbstractC0787f0) this.f3496a.m21434i(size);
            a aVar = (a) this.f3496a.mo17198k(size);
            int i10 = aVar.f3499a;
            if ((i10 & 3) == 3) {
                bVar.mo3845a(abstractC0787f0);
            } else if ((i10 & 1) != 0) {
                RecyclerView.AbstractC0794m.b bVar2 = aVar.f3500b;
                if (bVar2 == null) {
                    bVar.mo3845a(abstractC0787f0);
                } else {
                    bVar.mo3847c(abstractC0787f0, bVar2, aVar.f3501c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.mo3846b(abstractC0787f0, aVar.f3500b, aVar.f3501c);
            } else if ((i10 & 12) == 12) {
                bVar.mo3848d(abstractC0787f0, aVar.f3500b, aVar.f3501c);
            } else if ((i10 & 4) != 0) {
                bVar.mo3847c(abstractC0787f0, aVar.f3500b, null);
            } else if ((i10 & 8) != 0) {
                bVar.mo3846b(abstractC0787f0, aVar.f3500b, aVar.f3501c);
            }
            a.m4303c(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m4299p(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        a aVar = (a) this.f3496a.get(abstractC0787f0);
        if (aVar == null) {
            return;
        }
        aVar.f3499a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m4300q(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        int m21402p = this.f3497b.m21402p() - 1;
        while (true) {
            if (m21402p < 0) {
                break;
            }
            if (abstractC0787f0 == this.f3497b.m21403r(m21402p)) {
                this.f3497b.m21401o(m21402p);
                break;
            }
            m21402p--;
        }
        a aVar = (a) this.f3496a.remove(abstractC0787f0);
        if (aVar != null) {
            a.m4303c(aVar);
        }
    }
}
