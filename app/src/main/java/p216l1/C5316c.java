package p216l1;

import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.util.List;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;
import p216l1.InterfaceC5319f;
import p278p1.InterfaceC6175o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l1.c */
/* loaded from: classes.dex */
public class C5316c implements InterfaceC5319f, InterfaceC1604d.a {

    /* renamed from: a */
    private final List f21652a;

    /* renamed from: b */
    private final C5320g f21653b;

    /* renamed from: c */
    private final InterfaceC5319f.a f21654c;

    /* renamed from: d */
    private int f21655d;

    /* renamed from: e */
    private InterfaceC4975f f21656e;

    /* renamed from: f */
    private List f21657f;

    /* renamed from: g */
    private int f21658g;

    /* renamed from: h */
    private volatile InterfaceC6175o.a f21659h;

    /* renamed from: i */
    private File f21660i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5316c(C5320g c5320g, InterfaceC5319f.a aVar) {
        this(c5320g.m21463c(), c5320g, aVar);
    }

    /* renamed from: b */
    private boolean m21455b() {
        if (this.f21658g < this.f21657f.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (m21455b() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f21657f;
        r3 = r7.f21658g;
        r7.f21658g = r3 + 1;
        r7.f21659h = ((p278p1.InterfaceC6175o) r0.get(r3)).mo7343b(r7.f21660i, r7.f21653b.m21480t(), r7.f21653b.m21466f(), r7.f21653b.m21471k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f21659h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f21653b.m21481u(r7.f21659h.f24287c.mo7418a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f21659h.f24287c.mo7425d(r7.f21653b.m21472l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f21659h = null;
     */
    @Override // p216l1.InterfaceC5319f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo21456a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p124f2.AbstractC4220b.m17641a(r0)
        L5:
            java.util.List r0 = r7.f21657f     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.m21455b()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f21659h = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.m21455b()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List r0 = r7.f21657f     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f21658g     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f21658g = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            p1.o r0 = (p278p1.InterfaceC6175o) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f21660i     // Catch: java.lang.Throwable -> Lae
            l1.g r4 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.m21480t()     // Catch: java.lang.Throwable -> Lae
            l1.g r5 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.m21466f()     // Catch: java.lang.Throwable -> Lae
            l1.g r6 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            j1.h r6 = r6.m21471k()     // Catch: java.lang.Throwable -> Lae
            p1.o$a r0 = r0.mo7343b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f21659h = r0     // Catch: java.lang.Throwable -> Lae
            p1.o$a r0 = r7.f21659h     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            l1.g r0 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            p1.o$a r3 = r7.f21659h     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d r3 = r3.f24287c     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.mo7418a()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.m21481u(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            p1.o$a r0 = r7.f21659h     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d r0 = r0.f24287c     // Catch: java.lang.Throwable -> Lae
            l1.g r1 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.h r1 = r1.m21472l()     // Catch: java.lang.Throwable -> Lae
            r0.mo7425d(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = 1
            goto L15
        L68:
            p124f2.AbstractC4220b.m17645e()
            return r1
        L6c:
            int r0 = r7.f21655d     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f21655d = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List r2 = r7.f21652a     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            p124f2.AbstractC4220b.m17645e()
            return r1
        L7d:
            java.util.List r0 = r7.f21652a     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f21655d     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            j1.f r0 = (p184j1.InterfaceC4975f) r0     // Catch: java.lang.Throwable -> Lae
            l1.d r2 = new l1.d     // Catch: java.lang.Throwable -> Lae
            l1.g r3 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            j1.f r3 = r3.m21476p()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            l1.g r3 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            n1.a r3 = r3.m21464d()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.mo23118b(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f21660i = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f21656e = r0     // Catch: java.lang.Throwable -> Lae
            l1.g r0 = r7.f21653b     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.m21470j(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f21657f = r0     // Catch: java.lang.Throwable -> Lae
            r7.f21658g = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            p124f2.AbstractC4220b.m17645e()
            goto Lb4
        Lb3:
            throw r0
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: p216l1.C5316c.mo21456a():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
    /* renamed from: c */
    public void mo7430c(Exception exc) {
        this.f21654c.mo21458b(this.f21656e, exc, this.f21659h.f24287c, EnumC4970a.DATA_DISK_CACHE);
    }

    @Override // p216l1.InterfaceC5319f
    public void cancel() {
        InterfaceC6175o.a aVar = this.f21659h;
        if (aVar != null) {
            aVar.f24287c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
    /* renamed from: e */
    public void mo7431e(Object obj) {
        this.f21654c.mo21460d(this.f21656e, obj, this.f21659h.f24287c, EnumC4970a.DATA_DISK_CACHE, this.f21656e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5316c(List list, C5320g c5320g, InterfaceC5319f.a aVar) {
        this.f21655d = -1;
        this.f21652a = list;
        this.f21653b = c5320g;
        this.f21654c = aVar;
    }
}
