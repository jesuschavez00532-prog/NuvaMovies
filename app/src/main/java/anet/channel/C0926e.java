package anet.channel;

import anet.channel.entity.C0936c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.e */
/* loaded from: classes.dex */
public class C0926e {

    /* renamed from: a */
    private final Map<SessionRequest, List<Session>> f3853a = new HashMap();

    /* renamed from: b */
    private final ReentrantReadWriteLock f3854b;

    /* renamed from: c */
    private final ReentrantReadWriteLock.ReadLock f3855c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.WriteLock f3856d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0926e() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3854b = reentrantReadWriteLock;
        this.f3855c = reentrantReadWriteLock.readLock();
        this.f3856d = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: a */
    public void m4551a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest == null || sessionRequest.m4493a() == null || session == null) {
            return;
        }
        this.f3856d.lock();
        try {
            List<Session> list = this.f3853a.get(sessionRequest);
            if (list == null) {
                list = new ArrayList<>();
                this.f3853a.put(sessionRequest, list);
            }
            if (list.indexOf(session) != -1) {
                return;
            }
            list.add(session);
            Collections.sort(list);
        } finally {
            this.f3856d.unlock();
        }
    }

    /* renamed from: b */
    public void m4552b(SessionRequest sessionRequest, Session session) {
        this.f3856d.lock();
        try {
            List<Session> list = this.f3853a.get(sessionRequest);
            if (list == null) {
                return;
            }
            list.remove(session);
            if (list.size() == 0) {
                this.f3853a.remove(sessionRequest);
            }
        } finally {
            this.f3856d.unlock();
        }
    }

    /* renamed from: c */
    public boolean m4553c(SessionRequest sessionRequest, Session session) {
        this.f3855c.lock();
        try {
            List<Session> list = this.f3853a.get(sessionRequest);
            boolean z10 = false;
            if (list != null) {
                if (list.indexOf(session) != -1) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            this.f3855c.unlock();
        }
    }

    /* renamed from: a */
    public List<Session> m4550a(SessionRequest sessionRequest) {
        this.f3855c.lock();
        try {
            List<Session> list = this.f3853a.get(sessionRequest);
            if (list != null) {
                return new ArrayList(list);
            }
            return Collections.EMPTY_LIST;
        } finally {
            this.f3855c.unlock();
        }
    }

    /* renamed from: a */
    public Session m4548a(SessionRequest sessionRequest, int i10) {
        this.f3855c.lock();
        try {
            List<Session> list = this.f3853a.get(sessionRequest);
            Session session = null;
            if (list != null && !list.isEmpty()) {
                for (Session session2 : list) {
                    if (session2 != null && session2.isAvailable() && (i10 == C0936c.f3885c || session2.f3732j.getType() == i10)) {
                        session = session2;
                        break;
                    }
                }
                return session;
            }
            return null;
        } finally {
            this.f3855c.unlock();
        }
    }

    /* renamed from: a */
    public List<SessionRequest> m4549a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f3855c.lock();
        try {
            return this.f3853a.isEmpty() ? list : new ArrayList(this.f3853a.keySet());
        } finally {
            this.f3855c.unlock();
        }
    }
}
