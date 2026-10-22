package p216l1;

import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.util.List;
import p124f2.AbstractC4220b;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;
import p216l1.InterfaceC5319f;
import p278p1.InterfaceC6175o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l1.w */
/* loaded from: classes.dex */
public class C5336w implements InterfaceC5319f, InterfaceC1604d.a {

    /* renamed from: a */
    private final InterfaceC5319f.a f21843a;

    /* renamed from: b */
    private final C5320g f21844b;

    /* renamed from: c */
    private int f21845c;

    /* renamed from: d */
    private int f21846d = -1;

    /* renamed from: e */
    private InterfaceC4975f f21847e;

    /* renamed from: f */
    private List f21848f;

    /* renamed from: g */
    private int f21849g;

    /* renamed from: h */
    private volatile InterfaceC6175o.a f21850h;

    /* renamed from: i */
    private File f21851i;

    /* renamed from: j */
    private C5337x f21852j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5336w(C5320g c5320g, InterfaceC5319f.a aVar) {
        this.f21844b = c5320g;
        this.f21843a = aVar;
    }

    /* renamed from: b */
    private boolean m21605b() {
        if (this.f21849g < this.f21848f.size()) {
            return true;
        }
        return false;
    }

    @Override // p216l1.InterfaceC5319f
    /* renamed from: a */
    public boolean mo21456a() {
        AbstractC4220b.m17641a("ResourceCacheGenerator.startNext");
        try {
            List m21463c = this.f21844b.m21463c();
            boolean z10 = false;
            if (m21463c.isEmpty()) {
                return false;
            }
            List m21473m = this.f21844b.m21473m();
            if (m21473m.isEmpty()) {
                if (File.class.equals(this.f21844b.m21478r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f21844b.m21469i() + " to " + this.f21844b.m21478r());
            }
            while (true) {
                if (this.f21848f != null && m21605b()) {
                    this.f21850h = null;
                    while (!z10 && m21605b()) {
                        List list = this.f21848f;
                        int i10 = this.f21849g;
                        this.f21849g = i10 + 1;
                        this.f21850h = ((InterfaceC6175o) list.get(i10)).mo7343b(this.f21851i, this.f21844b.m21480t(), this.f21844b.m21466f(), this.f21844b.m21471k());
                        if (this.f21850h != null && this.f21844b.m21481u(this.f21850h.f24287c.mo7418a())) {
                            this.f21850h.f24287c.mo7425d(this.f21844b.m21472l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
                int i11 = this.f21846d + 1;
                this.f21846d = i11;
                if (i11 >= m21473m.size()) {
                    int i12 = this.f21845c + 1;
                    this.f21845c = i12;
                    if (i12 >= m21463c.size()) {
                        return false;
                    }
                    this.f21846d = 0;
                }
                InterfaceC4975f interfaceC4975f = (InterfaceC4975f) m21463c.get(this.f21845c);
                Class cls = (Class) m21473m.get(this.f21846d);
                this.f21852j = new C5337x(this.f21844b.m21462b(), interfaceC4975f, this.f21844b.m21476p(), this.f21844b.m21480t(), this.f21844b.m21466f(), this.f21844b.m21479s(cls), cls, this.f21844b.m21471k());
                File mo23118b = this.f21844b.m21464d().mo23118b(this.f21852j);
                this.f21851i = mo23118b;
                if (mo23118b != null) {
                    this.f21847e = interfaceC4975f;
                    this.f21848f = this.f21844b.m21470j(mo23118b);
                    this.f21849g = 0;
                }
            }
        } finally {
            AbstractC4220b.m17645e();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
    /* renamed from: c */
    public void mo7430c(Exception exc) {
        this.f21843a.mo21458b(this.f21852j, exc, this.f21850h.f24287c, EnumC4970a.RESOURCE_DISK_CACHE);
    }

    @Override // p216l1.InterfaceC5319f
    public void cancel() {
        InterfaceC6175o.a aVar = this.f21850h;
        if (aVar != null) {
            aVar.f24287c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
    /* renamed from: e */
    public void mo7431e(Object obj) {
        this.f21843a.mo21460d(this.f21847e, obj, this.f21850h.f24287c, EnumC4970a.RESOURCE_DISK_CACHE, this.f21852j);
    }
}
