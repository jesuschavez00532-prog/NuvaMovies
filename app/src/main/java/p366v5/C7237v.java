package p366v5;

import android.support.v4.media.session.AbstractC0272b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p297q6.AbstractC6346a;
import p297q6.InterfaceC6347b;
import p297q6.InterfaceC6348c;
import p297q6.InterfaceC6349d;

/* renamed from: v5.v */
/* loaded from: classes.dex */
class C7237v implements InterfaceC6349d, InterfaceC6348c {

    /* renamed from: a */
    private final Map f27041a = new HashMap();

    /* renamed from: b */
    private Queue f27042b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f27043c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7237v(Executor executor) {
        this.f27043c = executor;
    }

    /* renamed from: e */
    private synchronized Set m28004e(AbstractC6346a abstractC6346a) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m28005f(Map.Entry entry, AbstractC6346a abstractC6346a) {
        ((InterfaceC6347b) entry.getKey()).mo11341a(abstractC6346a);
    }

    @Override // p297q6.InterfaceC6349d
    /* renamed from: a */
    public synchronized void mo25128a(Class cls, Executor executor, InterfaceC6347b interfaceC6347b) {
        AbstractC7219e0.m27947b(cls);
        AbstractC7219e0.m27947b(interfaceC6347b);
        AbstractC7219e0.m27947b(executor);
        if (!this.f27041a.containsKey(cls)) {
            this.f27041a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f27041a.get(cls)).put(interfaceC6347b, executor);
    }

    @Override // p297q6.InterfaceC6349d
    /* renamed from: b */
    public void mo25129b(Class cls, InterfaceC6347b interfaceC6347b) {
        mo25128a(cls, this.f27043c, interfaceC6347b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m28006d() {
        Queue queue;
        synchronized (this) {
            queue = this.f27042b;
            if (queue != null) {
                this.f27042b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
                m28007g(null);
            }
        }
    }

    /* renamed from: g */
    public void m28007g(final AbstractC6346a abstractC6346a) {
        AbstractC7219e0.m27947b(abstractC6346a);
        synchronized (this) {
            Queue queue = this.f27042b;
            if (queue != null) {
                queue.add(abstractC6346a);
                return;
            }
            for (final Map.Entry entry : m28004e(abstractC6346a)) {
                ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC6346a) { // from class: v5.u

                    /* renamed from: a */
                    public final /* synthetic */ Map.Entry f27040a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        C7237v.m28005f(this.f27040a, null);
                    }
                });
            }
        }
    }
}
