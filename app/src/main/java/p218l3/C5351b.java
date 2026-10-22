package p218l3;

import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.C5878u;
import p125f3.C4224c;
import p136fe.AbstractC4313d;
import p142g3.C4343e;
import p186j3.InterfaceC4985c;
import p186j3.InterfaceC4986d;
import p201k2.AbstractC5094k;
import p258o3.C5911g;
import p430z9.AbstractC7765c;
import ve.AbstractC7269d;
import ve.AbstractC7272e;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;
import ve.InterfaceC7271d1;

/* renamed from: l3.b */
/* loaded from: classes.dex */
public final class C5351b implements InterfaceC4985c {

    /* renamed from: a */
    private AbstractC7765c f21881a;

    /* renamed from: b */
    private InterfaceC4986d f21882b;

    /* renamed from: c */
    private InterfaceC7271d1 f21883c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.b$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        Object f21884e;

        /* renamed from: f */
        int f21885f;

        /* renamed from: h */
        final /* synthetic */ C5878u f21887h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C7854a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f21888e;

            C7854a(InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new C7854a(interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                AbstractC4313d.m18094c();
                if (this.f21888e == 0) {
                    AbstractC1320p.m5976b(obj);
                    C4343e.m18228g();
                    List m18229h = C4343e.m18229h(C4224c.m17666u().m17673s());
                    AbstractC5868k.m23672d(m18229h, "null cannot be cast to non-null type java.util.ArrayList<com.download.download.DownloadTask>{ kotlin.collections.TypeAliasesKt.ArrayList<com.download.download.DownloadTask> }");
                    return (ArrayList) m18229h;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((C7854a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5878u c5878u, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f21887h = c5878u;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new a(this.f21887h, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c;
            C5878u c5878u;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f21885f;
            if (i10 != 0) {
                if (i10 == 1) {
                    c5878u = (C5878u) this.f21884e;
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                C5351b.this.m21639a().mo18902g(true);
                C5878u c5878u2 = this.f21887h;
                AbstractC7329x m28252b = C7297m0.m28252b();
                C7854a c7854a = new C7854a(null);
                this.f21884e = c5878u2;
                this.f21885f = 1;
                Object m28113c = AbstractC7269d.m28113c(m28252b, c7854a, this);
                if (m28113c == m18094c) {
                    return m18094c;
                }
                c5878u = c5878u2;
                obj = m28113c;
            }
            c5878u.f23412a = obj;
            C5351b.this.m21639a().mo18902g(false);
            if (((ArrayList) this.f21887h.f23412a).isEmpty()) {
                C5351b.this.m21639a().mo18901X();
            } else {
                C5351b.this.m21639a().mo18900V2((ArrayList) this.f21887h.f23412a);
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    public C5351b(AbstractC7765c abstractC7765c, InterfaceC4986d interfaceC4986d) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4986d, "view");
        this.f21881a = abstractC7765c;
        this.f21882b = interfaceC4986d;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo20343h();
    }

    /* renamed from: a */
    public final InterfaceC4986d m21639a() {
        return this.f21882b;
    }

    @Override // p186j3.InterfaceC4985c
    /* renamed from: h */
    public void mo20343h() {
        if (C5911g.f23514h.m23905a().m23900q()) {
            mo20344j();
        } else {
            this.f21882b.mo18896G();
        }
    }

    @Override // p186j3.InterfaceC4985c
    /* renamed from: j */
    public void mo20344j() {
        InterfaceC7271d1 m28125b;
        if (this.f21881a.m3096J6() == null) {
            return;
        }
        if (!AbstractC5094k.m20685b(this.f21881a.m3096J6())) {
            this.f21882b.mo18895E3();
            return;
        }
        C5878u c5878u = new C5878u();
        InterfaceC7271d1 interfaceC7271d1 = this.f21883c;
        if (interfaceC7271d1 != null) {
            InterfaceC7271d1.a.m28118a(interfaceC7271d1, null, 1, null);
        }
        m28125b = AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new a(c5878u, null), 2, null);
        this.f21883c = m28125b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        InterfaceC7271d1 interfaceC7271d1 = this.f21883c;
        if (interfaceC7271d1 != null) {
            InterfaceC7271d1.a.m28118a(interfaceC7271d1, null, 1, null);
        }
    }
}
