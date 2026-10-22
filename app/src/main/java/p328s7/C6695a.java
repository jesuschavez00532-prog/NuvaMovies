package p328s7;

import android.content.Context;
import com.ixuea.android.downloader.p062db.DefaultDownloadDBController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p339t7.InterfaceC6925c;
import p353u7.C7051a;
import p368v7.C7247b;
import p368v7.C7248c;
import p368v7.InterfaceC7246a;
import p413y7.InterfaceC7682b;
import p428z7.C7760a;
import p428z7.C7761b;

/* renamed from: s7.a */
/* loaded from: classes2.dex */
public final class C6695a implements InterfaceC6925c, C7248c.a {

    /* renamed from: g */
    private static C6695a f25713g;

    /* renamed from: a */
    private final ExecutorService f25714a;

    /* renamed from: b */
    private final ConcurrentHashMap f25715b;

    /* renamed from: c */
    private final List f25716c;

    /* renamed from: d */
    private final InterfaceC7246a f25717d;

    /* renamed from: e */
    private final InterfaceC7682b f25718e;

    /* renamed from: f */
    private final C7051a f25719f;

    private C6695a(Context context, C7051a c7051a) {
        if (c7051a == null) {
            this.f25719f = new C7051a();
        } else {
            this.f25719f = c7051a;
        }
        if (this.f25719f.m27153d() == null) {
            this.f25718e = new DefaultDownloadDBController(context, this.f25719f);
        } else {
            this.f25718e = this.f25719f.m27153d();
        }
        if (this.f25718e.mo11415c() == null) {
            this.f25716c = new ArrayList();
        } else {
            this.f25716c = this.f25718e.mo11415c();
        }
        this.f25715b = new ConcurrentHashMap();
        this.f25718e.mo11417e();
        this.f25714a = Executors.newFixedThreadPool(this.f25719f.m27154e());
        this.f25717d = new C7247b(this.f25718e);
    }

    /* renamed from: e */
    private boolean m26238e(C7760a c7760a) {
        if (!c7760a.m30016o() && this.f25715b.containsKey(c7760a.m30009h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static InterfaceC6925c m26239f(Context context, C7051a c7051a) {
        synchronized (C6695a.class) {
            if (f25713g == null) {
                f25713g = new C6695a(context, c7051a);
            }
        }
        return f25713g;
    }

    /* renamed from: g */
    private void m26240g(C7760a c7760a) {
        if (this.f25715b.size() >= this.f25719f.m27154e()) {
            c7760a.m29998D(3);
            this.f25717d.mo28053a(c7760a);
            return;
        }
        C7248c c7248c = new C7248c(this.f25714a, this.f25717d, c7760a, this.f25719f, this);
        this.f25715b.put(c7760a.m30009h(), c7248c);
        c7760a.m30021t(c7760a.m30003b() + 1);
        c7760a.m29998D(1);
        this.f25717d.mo28053a(c7760a);
        c7248c.m28061g();
    }

    /* renamed from: h */
    private void m26241h() {
        for (C7760a c7760a : this.f25716c) {
            if (c7760a.m30013l() == 3) {
                m26240g(c7760a);
                return;
            }
        }
    }

    @Override // p368v7.C7248c.a
    /* renamed from: a */
    public void mo26242a(C7760a c7760a) {
        this.f25715b.remove(c7760a.m30009h());
        this.f25716c.remove(c7760a);
        List m30006e = c7760a.m30006e();
        if (m30006e != null && m30006e.size() > 0) {
            Iterator it = m30006e.iterator();
            while (it.hasNext()) {
                this.f25718e.mo11416d((C7761b) it.next());
            }
        }
        m26241h();
    }

    @Override // p339t7.InterfaceC6925c
    /* renamed from: b */
    public void mo26243b(C7760a c7760a) {
        if (m26238e(c7760a)) {
            if (c7760a.m30013l() == 6) {
                this.f25716c.add(c7760a);
                m26240g(c7760a);
                return;
            }
            return;
        }
        this.f25716c.add(c7760a);
        m26240g(c7760a);
    }

    @Override // p339t7.InterfaceC6925c
    /* renamed from: c */
    public void mo26244c(C7760a c7760a) {
        c7760a.m29998D(7);
        this.f25715b.remove(c7760a.m30009h());
        this.f25716c.remove(c7760a);
        this.f25718e.mo11414b(c7760a);
        this.f25717d.mo28053a(c7760a);
    }

    @Override // p339t7.InterfaceC6925c
    /* renamed from: d */
    public C7760a mo26245d(String str) {
        C7760a c7760a;
        Iterator it = this.f25716c.iterator();
        while (true) {
            if (it.hasNext()) {
                c7760a = (C7760a) it.next();
                if (c7760a.m30009h().equals(str)) {
                    break;
                }
            } else {
                c7760a = null;
                break;
            }
        }
        if (c7760a == null) {
            return this.f25718e.mo11418f(str);
        }
        return c7760a;
    }
}
