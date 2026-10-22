package p368v7;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p353u7.C7051a;
import p381w7.RunnableC7380a;
import p397x7.RunnableC7507a;
import p428z7.C7760a;
import p428z7.C7761b;

/* renamed from: v7.c */
/* loaded from: classes2.dex */
public class C7248c implements RunnableC7380a.a, RunnableC7507a.a {

    /* renamed from: a */
    private final ExecutorService f27078a;

    /* renamed from: b */
    private final InterfaceC7246a f27079b;

    /* renamed from: c */
    private final C7760a f27080c;

    /* renamed from: d */
    private final C7051a f27081d;

    /* renamed from: f */
    private final a f27083f;

    /* renamed from: h */
    private long f27085h;

    /* renamed from: g */
    private long f27084g = System.currentTimeMillis();

    /* renamed from: i */
    private volatile AtomicBoolean f27086i = new AtomicBoolean(false);

    /* renamed from: e */
    private final List f27082e = new ArrayList();

    /* renamed from: v7.c$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo26242a(C7760a c7760a);
    }

    public C7248c(ExecutorService executorService, InterfaceC7246a interfaceC7246a, C7760a c7760a, C7051a c7051a, a aVar) {
        this.f27078a = executorService;
        this.f27079b = interfaceC7246a;
        this.f27080c = c7760a;
        this.f27081d = c7051a;
        this.f27083f = aVar;
    }

    /* renamed from: d */
    private void m28055d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m28056e() {
        this.f27085h = 0L;
        Iterator it = this.f27080c.m30006e().iterator();
        while (it.hasNext()) {
            this.f27085h += ((C7761b) it.next()).m30037e();
        }
        this.f27080c.m29996B(this.f27085h);
    }

    /* renamed from: f */
    private void m28057f() {
        this.f27078a.submit(new RunnableC7380a(this.f27079b, this.f27080c, this));
    }

    @Override // p397x7.RunnableC7507a.a
    /* renamed from: a */
    public void mo28058a() {
        m28056e();
        if (this.f27080c.m30011j() == this.f27080c.m30012k()) {
            this.f27080c.m29998D(5);
            this.f27079b.mo28053a(this.f27080c);
            a aVar = this.f27083f;
            if (aVar != null) {
                aVar.mo26242a(this.f27080c);
            }
        }
    }

    @Override // p381w7.RunnableC7380a.a
    /* renamed from: b */
    public void mo28059b(long j10, boolean z10) {
        long j11;
        this.f27080c.m30000F(z10);
        this.f27080c.m29997C(j10);
        m28055d(this.f27080c.m30010i());
        ArrayList arrayList = new ArrayList();
        if (z10) {
            long m30012k = this.f27080c.m30012k();
            int m27155f = this.f27081d.m27155f();
            long j12 = m30012k / m27155f;
            int i10 = 0;
            while (i10 < m27155f) {
                long j13 = j12 * i10;
                if (i10 == m27155f - 1) {
                    j11 = m30012k - 1;
                } else {
                    j11 = (j13 + j12) - 1;
                }
                int i11 = i10;
                C7761b c7761b = new C7761b(i11, this.f27080c.m30009h(), this.f27080c.m30015n(), this.f27080c.m30002a(), j13, j11);
                arrayList.add(c7761b);
                RunnableC7507a runnableC7507a = new RunnableC7507a(c7761b, this.f27079b, this.f27081d, this.f27080c, this);
                this.f27078a.submit(runnableC7507a);
                this.f27082e.add(runnableC7507a);
                i10 = i11 + 1;
            }
        } else {
            C7761b c7761b2 = new C7761b(0, this.f27080c.m30009h(), this.f27080c.m30015n(), this.f27080c.m30002a(), 0L, this.f27080c.m30012k() - 1);
            arrayList.add(c7761b2);
            RunnableC7507a runnableC7507a2 = new RunnableC7507a(c7761b2, this.f27079b, this.f27081d, this.f27080c, this);
            this.f27078a.submit(runnableC7507a2);
            this.f27082e.add(runnableC7507a2);
        }
        this.f27080c.m30024w(arrayList);
        this.f27080c.m29998D(2);
        this.f27079b.mo28053a(this.f27080c);
    }

    @Override // p397x7.RunnableC7507a.a
    /* renamed from: c */
    public void mo28060c() {
        if (!this.f27086i.get()) {
            synchronized (this) {
                if (!this.f27086i.get()) {
                    this.f27086i.set(true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f27084g > 1000) {
                        m28056e();
                        this.f27079b.mo28053a(this.f27080c);
                        this.f27084g = currentTimeMillis;
                    }
                    this.f27086i.set(false);
                }
            }
        }
    }

    /* renamed from: g */
    public void m28061g() {
        if (this.f27080c.m30012k() <= 0) {
            m28057f();
            return;
        }
        List m30006e = this.f27080c.m30006e();
        if (m30006e.size() == 0) {
            this.f27080c.m29996B(0L);
            m28057f();
            return;
        }
        Iterator it = m30006e.iterator();
        while (it.hasNext()) {
            RunnableC7507a runnableC7507a = new RunnableC7507a((C7761b) it.next(), this.f27079b, this.f27081d, this.f27080c, this);
            this.f27078a.submit(runnableC7507a);
            this.f27082e.add(runnableC7507a);
        }
        this.f27080c.m29998D(2);
        this.f27079b.mo28053a(this.f27080c);
    }
}
