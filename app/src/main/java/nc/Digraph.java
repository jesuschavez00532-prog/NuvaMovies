package nc;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import mc.AbstractC5635j;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class Digraph {

    /* renamed from: e */
    private volatile boolean f23377e;

    /* renamed from: a */
    private final HashMap f23373a = new HashMap();

    /* renamed from: b */
    private final HashMap f23374b = new HashMap();

    /* renamed from: c */
    private final CopyOnWriteArrayList f23375c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final CopyOnWriteArrayList f23376d = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final List f23378f = new ArrayList();

    /* renamed from: c */
    private final void m23610c(AbstractC5838b abstractC5838b) {
        boolean m23623d;
        String m23622c = null;
        if (!abstractC5838b.m23628e()) {
            Set m23614d = m23614d(abstractC5838b);
            m23623d = AbstractC5837a.m23623d(m23614d);
            if (m23623d) {
                if (!this.f23378f.contains(abstractC5838b)) {
                    this.f23378f.add(abstractC5838b);
                    Iterator it = m23614d.iterator();
                    while (it.hasNext()) {
                        m23610c((AbstractC5838b) it.next());
                    }
                    this.f23378f.remove(abstractC5838b);
                    if (!this.f23375c.contains(abstractC5838b)) {
                        this.f23375c.add(abstractC5838b);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TheRouter::Digraph::Cyclic dependency ");
                m23622c = AbstractC5837a.m23622c(this.f23378f, abstractC5838b);
                sb2.append(m23622c);
                throw new IllegalArgumentException(sb2.toString());
            }
            if (!this.f23375c.contains(abstractC5838b)) {
                this.f23375c.add(abstractC5838b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final C5839c m23611h(String str) {
        C5839c c5839c;
        int hashCode = str.hashCode();
        if (hashCode != -570693157) {
            if (hashCode != -136502702) {
                if (hashCode == 1312134309 && str.equals("TheRouter_Initialization")) {
                    return new C5839c("TheRouter_Initialization", "TheRouter_Before_Initialization");
                }
            } else if (str.equals("TheRouter_activity_splash")) {
                return new C5839c("TheRouter_activity_splash", "TheRouter_Initialization");
            }
        } else if (str.equals("TheRouter_Before_Initialization")) {
            c5839c = new C5839c(str, null, 2, 0 == true ? 1 : 0);
            return c5839c;
        }
        c5839c = new C5839c(str, "TheRouter_Initialization");
        return c5839c;
    }

    /* renamed from: a */
    public final boolean m23612a(Runnable runnable) {
        AbstractC5868k.m23674f(runnable, "r");
        return this.f23376d.add(runnable);
    }

    /* renamed from: b */
    public final void m23613b() {
        C5839c m23616f = m23616f("TheRouter_Before_Initialization");
        this.f23374b.put("TheRouter_Before_Initialization", m23616f);
        m23616f.mo23630g();
        Collection<AbstractC5838b> values = this.f23373a.values();
        AbstractC5868k.m23673e(values, "tasks.values");
        for (AbstractC5838b abstractC5838b : values) {
            if (!abstractC5838b.m23624a() && abstractC5838b.m23625b().size() == 1 && abstractC5838b.m23625b().contains("TheRouter_Before_Initialization")) {
                abstractC5838b.mo23630g();
            }
        }
    }

    /* renamed from: d */
    public final Set m23614d(AbstractC5838b abstractC5838b) {
        AbstractC5868k.m23674f(abstractC5838b, "root");
        HashSet hashSet = new HashSet();
        Iterator it = abstractC5838b.m23625b().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC5838b abstractC5838b2 = (AbstractC5838b) this.f23373a.get(str);
            if (abstractC5838b2 == null) {
                HashMap hashMap = this.f23374b;
                AbstractC5868k.m23673e(str, CacheEntity.KEY);
                hashMap.put(str, m23611h(str));
            } else {
                hashSet.add(abstractC5838b2);
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    public final boolean m23615e() {
        return this.f23377e;
    }

    /* renamed from: f */
    public final C5839c m23616f(String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        C5839c c5839c = (C5839c) this.f23374b.get(str);
        if (c5839c == null) {
            c5839c = m23611h(str);
            this.f23374b.put(str, c5839c);
        }
        AbstractC5868k.m23673e(c5839c, "virtualTasks[name] ?: le…vtask\n        vtask\n    }");
        return c5839c;
    }

    /* renamed from: g */
    public final void m23617g() {
        for (AbstractC5838b abstractC5838b : this.f23373a.values()) {
            AbstractC5868k.m23673e(abstractC5838b, "task");
            m23610c(abstractC5838b);
        }
        this.f23377e = true;
        Iterator it = this.f23376d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: i */
    public final void m23618i(String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        Collection<C5839c> values = this.f23374b.values();
        AbstractC5868k.m23673e(values, "virtualTasks.values");
        for (C5839c c5839c : values) {
            if (c5839c.m23625b().contains(str)) {
                c5839c.m23633j();
            }
        }
    }

    /* renamed from: j */
    public final void m23619j() {
        Iterator it = this.f23375c.iterator();
        while (it.hasNext()) {
            AbstractC5838b abstractC5838b = (AbstractC5838b) it.next();
            if (abstractC5838b.m23629f()) {
                boolean z10 = true;
                for (String str : abstractC5838b.m23625b()) {
                    AbstractC5838b abstractC5838b2 = (AbstractC5838b) this.f23373a.get(str);
                    if (abstractC5838b2 == null) {
                        abstractC5838b2 = (AbstractC5838b) this.f23374b.get(str);
                    }
                    if (abstractC5838b2 != null && !abstractC5838b2.m23628e()) {
                        z10 = false;
                    }
                }
                if (z10) {
                    AbstractC5635j.m22862d("FlowTask", "do flow task:" + abstractC5838b.m23627d(), null, 4, null);
                    abstractC5838b.mo23630g();
                }
            }
        }
    }
}
