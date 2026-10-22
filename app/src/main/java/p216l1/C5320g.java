package p216l1;

import com.bumptech.glide.C1588e;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p184j1.C4977h;
import p184j1.InterfaceC4973d;
import p184j1.InterfaceC4975f;
import p184j1.InterfaceC4980k;
import p184j1.InterfaceC4981l;
import p216l1.RunnableC5321h;
import p230m1.InterfaceC5569b;
import p243n1.InterfaceC5723a;
import p278p1.InterfaceC6175o;
import p307r1.C6510p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l1.g */
/* loaded from: classes.dex */
public final class C5320g {

    /* renamed from: a */
    private final List f21666a = new ArrayList();

    /* renamed from: b */
    private final List f21667b = new ArrayList();

    /* renamed from: c */
    private C1588e f21668c;

    /* renamed from: d */
    private Object f21669d;

    /* renamed from: e */
    private int f21670e;

    /* renamed from: f */
    private int f21671f;

    /* renamed from: g */
    private Class f21672g;

    /* renamed from: h */
    private RunnableC5321h.e f21673h;

    /* renamed from: i */
    private C4977h f21674i;

    /* renamed from: j */
    private Map f21675j;

    /* renamed from: k */
    private Class f21676k;

    /* renamed from: l */
    private boolean f21677l;

    /* renamed from: m */
    private boolean f21678m;

    /* renamed from: n */
    private InterfaceC4975f f21679n;

    /* renamed from: o */
    private EnumC1591h f21680o;

    /* renamed from: p */
    private AbstractC5323j f21681p;

    /* renamed from: q */
    private boolean f21682q;

    /* renamed from: r */
    private boolean f21683r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m21461a() {
        this.f21668c = null;
        this.f21669d = null;
        this.f21679n = null;
        this.f21672g = null;
        this.f21676k = null;
        this.f21674i = null;
        this.f21680o = null;
        this.f21675j = null;
        this.f21681p = null;
        this.f21666a.clear();
        this.f21677l = false;
        this.f21667b.clear();
        this.f21678m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC5569b m21462b() {
        return this.f21668c.m7308b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List m21463c() {
        if (!this.f21678m) {
            this.f21678m = true;
            this.f21667b.clear();
            List m21467g = m21467g();
            int size = m21467g.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC6175o.a aVar = (InterfaceC6175o.a) m21467g.get(i10);
                if (!this.f21667b.contains(aVar.f24285a)) {
                    this.f21667b.add(aVar.f24285a);
                }
                for (int i11 = 0; i11 < aVar.f24286b.size(); i11++) {
                    if (!this.f21667b.contains(aVar.f24286b.get(i11))) {
                        this.f21667b.add(aVar.f24286b.get(i11));
                    }
                }
            }
        }
        return this.f21667b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC5723a m21464d() {
        return this.f21673h.mo21520a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC5323j m21465e() {
        return this.f21681p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m21466f() {
        return this.f21671f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List m21467g() {
        if (!this.f21677l) {
            this.f21677l = true;
            this.f21666a.clear();
            List m7329i = this.f21668c.m7315i().m7329i(this.f21669d);
            int size = m7329i.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC6175o.a mo7343b = ((InterfaceC6175o) m7329i.get(i10)).mo7343b(this.f21669d, this.f21670e, this.f21671f, this.f21674i);
                if (mo7343b != null) {
                    this.f21666a.add(mo7343b);
                }
            }
        }
        return this.f21666a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C5333t m21468h(Class cls) {
        return this.f21668c.m7315i().m7328h(cls, this.f21672g, this.f21676k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Class m21469i() {
        return this.f21669d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List m21470j(File file) {
        return this.f21668c.m7315i().m7329i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C4977h m21471k() {
        return this.f21674i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public EnumC1591h m21472l() {
        return this.f21680o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public List m21473m() {
        return this.f21668c.m7315i().m7330j(this.f21669d.getClass(), this.f21672g, this.f21676k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public InterfaceC4980k m21474n(InterfaceC5335v interfaceC5335v) {
        return this.f21668c.m7315i().m7331k(interfaceC5335v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public InterfaceC1605e m21475o(Object obj) {
        return this.f21668c.m7315i().m7332l(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public InterfaceC4975f m21476p() {
        return this.f21679n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public InterfaceC4973d m21477q(Object obj) {
        return this.f21668c.m7315i().m7333m(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Class m21478r() {
        return this.f21676k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public InterfaceC4981l m21479s(Class cls) {
        InterfaceC4981l interfaceC4981l = (InterfaceC4981l) this.f21675j.get(cls);
        if (interfaceC4981l == null) {
            Iterator it = this.f21675j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC4981l = (InterfaceC4981l) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC4981l == null) {
            if (this.f21675j.isEmpty() && this.f21682q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C6510p.m25468c();
        }
        return interfaceC4981l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m21480t() {
        return this.f21670e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m21481u(Class cls) {
        if (m21468h(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m21482v(C1588e c1588e, Object obj, InterfaceC4975f interfaceC4975f, int i10, int i11, AbstractC5323j abstractC5323j, Class cls, Class cls2, EnumC1591h enumC1591h, C4977h c4977h, Map map, boolean z10, boolean z11, RunnableC5321h.e eVar) {
        this.f21668c = c1588e;
        this.f21669d = obj;
        this.f21679n = interfaceC4975f;
        this.f21670e = i10;
        this.f21671f = i11;
        this.f21681p = abstractC5323j;
        this.f21672g = cls;
        this.f21673h = eVar;
        this.f21676k = cls2;
        this.f21680o = enumC1591h;
        this.f21674i = c4977h;
        this.f21675j = map;
        this.f21682q = z10;
        this.f21683r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m21483w(InterfaceC5335v interfaceC5335v) {
        return this.f21668c.m7315i().m7334n(interfaceC5335v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m21484x() {
        return this.f21683r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m21485y(InterfaceC4975f interfaceC4975f) {
        List m21467g = m21467g();
        int size = m21467g.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((InterfaceC6175o.a) m21467g.get(i10)).f24285a.equals(interfaceC4975f)) {
                return true;
            }
        }
        return false;
    }
}
