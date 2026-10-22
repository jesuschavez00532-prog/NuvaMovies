package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.AbstractC0272b;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p127f5.C4247j;
import p172i4.C4854b;
import p172i4.C4858d;
import p172i4.C4868i;
import p187j4.AbstractC4990d;
import p187j4.AbstractC4991e;
import p187j4.C4987a;
import p187j4.C4993g;
import p203k4.AbstractC5109f;
import p203k4.AbstractC5120q;
import p203k4.BinderC5125v;
import p203k4.C5104b;
import p214l.C5303a;
import p219l4.AbstractC5388m;
import p219l4.AbstractC5391n;
import p219l4.C5365e0;
import p246n4.C5744e;
import p281p4.AbstractC6198b;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes.dex */
public final class C1801l implements AbstractC4991e.a, AbstractC4991e.b {

    /* renamed from: b */
    private final C4987a.f f7579b;

    /* renamed from: c */
    private final C5104b f7580c;

    /* renamed from: d */
    private final C1794e f7581d;

    /* renamed from: g */
    private final int f7584g;

    /* renamed from: h */
    private final BinderC5125v f7585h;

    /* renamed from: i */
    private boolean f7586i;

    /* renamed from: m */
    final /* synthetic */ C1791b f7590m;

    /* renamed from: a */
    private final Queue f7578a = new LinkedList();

    /* renamed from: e */
    private final Set f7582e = new HashSet();

    /* renamed from: f */
    private final Map f7583f = new HashMap();

    /* renamed from: j */
    private final List f7587j = new ArrayList();

    /* renamed from: k */
    private C4854b f7588k = null;

    /* renamed from: l */
    private int f7589l = 0;

    public C1801l(C1791b c1791b, AbstractC4990d abstractC4990d) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f7590m = c1791b;
        handler = c1791b.f7557p;
        C4987a.f m20368g = abstractC4990d.m20368g(handler.getLooper(), this);
        this.f7579b = m20368g;
        this.f7580c = abstractC4990d.m20365d();
        this.f7581d = new C1794e();
        this.f7584g = abstractC4990d.m20367f();
        if (m20368g.mo16774l()) {
            context = c1791b.f7548g;
            handler2 = c1791b.f7557p;
            this.f7585h = abstractC4990d.m20369h(context, handler2);
            return;
        }
        this.f7585h = null;
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m7989A(C1801l c1801l, C1802m c1802m) {
        if (c1801l.f7587j.contains(c1802m) && !c1801l.f7586i) {
            if (!c1801l.f7579b.isConnected()) {
                c1801l.m8010D();
            } else {
                c1801l.m7995i();
            }
        }
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m7990B(C1801l c1801l, C1802m c1802m) {
        Handler handler;
        Handler handler2;
        C4858d c4858d;
        C4858d[] mo8045g;
        if (c1801l.f7587j.remove(c1802m)) {
            handler = c1801l.f7590m.f7557p;
            handler.removeMessages(15, c1802m);
            handler2 = c1801l.f7590m.f7557p;
            handler2.removeMessages(16, c1802m);
            c4858d = c1802m.f7592b;
            ArrayList arrayList = new ArrayList(c1801l.f7578a.size());
            for (AbstractC1811v abstractC1811v : c1801l.f7578a) {
                if ((abstractC1811v instanceof AbstractC5120q) && (mo8045g = ((AbstractC5120q) abstractC1811v).mo8045g(c1801l)) != null && AbstractC6198b.m24745c(mo8045g, c4858d)) {
                    arrayList.add(abstractC1811v);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1811v abstractC1811v2 = (AbstractC1811v) arrayList.get(i10);
                c1801l.f7578a.remove(abstractC1811v2);
                abstractC1811v2.mo8040b(new C4993g(c4858d));
            }
        }
    }

    /* renamed from: e */
    private final C4858d m7991e(C4858d[] c4858dArr) {
        if (c4858dArr != null && c4858dArr.length != 0) {
            C4858d[] m20357j = this.f7579b.m20357j();
            if (m20357j == null) {
                m20357j = new C4858d[0];
            }
            C5303a c5303a = new C5303a(m20357j.length);
            for (C4858d c4858d : m20357j) {
                c5303a.put(c4858d.m20027g(), Long.valueOf(c4858d.m20028i()));
            }
            for (C4858d c4858d2 : c4858dArr) {
                Long l10 = (Long) c5303a.get(c4858d2.m20027g());
                if (l10 == null || l10.longValue() < c4858d2.m20028i()) {
                    return c4858d2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m7992f(C4854b c4854b) {
        Iterator it = this.f7582e.iterator();
        if (it.hasNext()) {
            AbstractC0272b.m941a(it.next());
            if (AbstractC5388m.m21771a(c4854b, C4854b.f20335e)) {
                this.f7579b.m20351d();
            }
            throw null;
        }
        this.f7582e.clear();
    }

    /* renamed from: g */
    public final void m7993g(Status status) {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        m7994h(status, null, false);
    }

    /* renamed from: h */
    private final void m7994h(Status status, Exception exc, boolean z10) {
        Handler handler;
        boolean z11;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        boolean z12 = false;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (exc == null) {
            z12 = true;
        }
        if (z11 != z12) {
            Iterator it = this.f7578a.iterator();
            while (it.hasNext()) {
                AbstractC1811v abstractC1811v = (AbstractC1811v) it.next();
                if (!z10 || abstractC1811v.f7615a == 2) {
                    if (status != null) {
                        abstractC1811v.mo8039a(status);
                    } else {
                        abstractC1811v.mo8040b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: i */
    private final void m7995i() {
        ArrayList arrayList = new ArrayList(this.f7578a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1811v abstractC1811v = (AbstractC1811v) arrayList.get(i10);
            if (this.f7579b.isConnected()) {
                if (m8001o(abstractC1811v)) {
                    this.f7578a.remove(abstractC1811v);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m7996j() {
        m8009C();
        m7992f(C4854b.f20335e);
        m8000n();
        Iterator it = this.f7583f.values().iterator();
        if (!it.hasNext()) {
            m7995i();
            m7998l();
        } else {
            AbstractC0272b.m941a(it.next());
            throw null;
        }
    }

    /* renamed from: k */
    public final void m7997k(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        C5365e0 c5365e0;
        m8009C();
        this.f7586i = true;
        this.f7581d.m7980c(i10, this.f7579b.m20358k());
        C1791b c1791b = this.f7590m;
        handler = c1791b.f7557p;
        handler2 = c1791b.f7557p;
        Message obtain = Message.obtain(handler2, 9, this.f7580c);
        j10 = this.f7590m.f7542a;
        handler.sendMessageDelayed(obtain, j10);
        C1791b c1791b2 = this.f7590m;
        handler3 = c1791b2.f7557p;
        handler4 = c1791b2.f7557p;
        Message obtain2 = Message.obtain(handler4, 11, this.f7580c);
        j11 = this.f7590m.f7543b;
        handler3.sendMessageDelayed(obtain2, j11);
        c5365e0 = this.f7590m.f7550i;
        c5365e0.m21725c();
        Iterator it = this.f7583f.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC0272b.m941a(it.next());
        throw null;
    }

    /* renamed from: l */
    private final void m7998l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f7590m.f7557p;
        handler.removeMessages(12, this.f7580c);
        C1791b c1791b = this.f7590m;
        handler2 = c1791b.f7557p;
        handler3 = c1791b.f7557p;
        Message obtainMessage = handler3.obtainMessage(12, this.f7580c);
        j10 = this.f7590m.f7544c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    /* renamed from: m */
    private final void m7999m(AbstractC1811v abstractC1811v) {
        abstractC1811v.mo8043d(this.f7581d, m8018L());
        try {
            abstractC1811v.mo8041c(this);
        } catch (DeadObjectException unused) {
            mo8021c(1);
            this.f7579b.m20349b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: n */
    private final void m8000n() {
        Handler handler;
        Handler handler2;
        if (this.f7586i) {
            handler = this.f7590m.f7557p;
            handler.removeMessages(11, this.f7580c);
            handler2 = this.f7590m.f7557p;
            handler2.removeMessages(9, this.f7580c);
            this.f7586i = false;
        }
    }

    /* renamed from: o */
    private final boolean m8001o(AbstractC1811v abstractC1811v) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(abstractC1811v instanceof AbstractC5120q)) {
            m7999m(abstractC1811v);
            return true;
        }
        AbstractC5120q abstractC5120q = (AbstractC5120q) abstractC1811v;
        C4858d m7991e = m7991e(abstractC5120q.mo8045g(this));
        if (m7991e == null) {
            m7999m(abstractC1811v);
            return true;
        }
        Log.w("GoogleApiManager", this.f7579b.getClass().getName() + " could not execute call because it requires feature (" + m7991e.m20027g() + ", " + m7991e.m20028i() + ").");
        z10 = this.f7590m.f7558q;
        if (z10 && abstractC5120q.mo8044f(this)) {
            C1802m c1802m = new C1802m(this.f7580c, m7991e, null);
            int indexOf = this.f7587j.indexOf(c1802m);
            if (indexOf >= 0) {
                C1802m c1802m2 = (C1802m) this.f7587j.get(indexOf);
                handler5 = this.f7590m.f7557p;
                handler5.removeMessages(15, c1802m2);
                C1791b c1791b = this.f7590m;
                handler6 = c1791b.f7557p;
                handler7 = c1791b.f7557p;
                Message obtain = Message.obtain(handler7, 15, c1802m2);
                j12 = this.f7590m.f7542a;
                handler6.sendMessageDelayed(obtain, j12);
                return false;
            }
            this.f7587j.add(c1802m);
            C1791b c1791b2 = this.f7590m;
            handler = c1791b2.f7557p;
            handler2 = c1791b2.f7557p;
            Message obtain2 = Message.obtain(handler2, 15, c1802m);
            j10 = this.f7590m.f7542a;
            handler.sendMessageDelayed(obtain2, j10);
            C1791b c1791b3 = this.f7590m;
            handler3 = c1791b3.f7557p;
            handler4 = c1791b3.f7557p;
            Message obtain3 = Message.obtain(handler4, 16, c1802m);
            j11 = this.f7590m.f7543b;
            handler3.sendMessageDelayed(obtain3, j11);
            C4854b c4854b = new C4854b(2, null);
            if (!m8002p(c4854b)) {
                this.f7590m.m7964g(c4854b, this.f7584g);
                return false;
            }
            return false;
        }
        abstractC5120q.mo8040b(new C4993g(m7991e));
        return true;
    }

    /* renamed from: p */
    private final boolean m8002p(C4854b c4854b) {
        Object obj;
        C1795f c1795f;
        Set set;
        C1795f c1795f2;
        obj = C1791b.f7540t;
        synchronized (obj) {
            C1791b c1791b = this.f7590m;
            c1795f = c1791b.f7554m;
            if (c1795f != null) {
                set = c1791b.f7555n;
                if (set.contains(this.f7580c)) {
                    c1795f2 = this.f7590m.f7554m;
                    c1795f2.m8055s(c4854b, this.f7584g);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    private final boolean m8003q(boolean z10) {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        if (!this.f7579b.isConnected() || this.f7583f.size() != 0) {
            return false;
        }
        if (this.f7581d.m7982e()) {
            if (z10) {
                m7998l();
            }
            return false;
        }
        this.f7579b.m20349b("Timing out service connection.");
        return true;
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ C5104b m8005v(C1801l c1801l) {
        return c1801l.f7580c;
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m8006x(C1801l c1801l, Status status) {
        c1801l.m7993g(status);
    }

    /* renamed from: C */
    public final void m8009C() {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        this.f7588k = null;
    }

    /* renamed from: D */
    public final void m8010D() {
        Handler handler;
        C5365e0 c5365e0;
        Context context;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        if (!this.f7579b.isConnected() && !this.f7579b.m20350c()) {
            try {
                C1791b c1791b = this.f7590m;
                c5365e0 = c1791b.f7550i;
                context = c1791b.f7548g;
                int m21724b = c5365e0.m21724b(context, this.f7579b);
                if (m21724b != 0) {
                    C4854b c4854b = new C4854b(m21724b, null);
                    Log.w("GoogleApiManager", "The service for " + this.f7579b.getClass().getName() + " is not available: " + c4854b.toString());
                    m8013G(c4854b, null);
                    return;
                }
                C1791b c1791b2 = this.f7590m;
                C4987a.f fVar = this.f7579b;
                C1804o c1804o = new C1804o(c1791b2, fVar, this.f7580c);
                if (fVar.mo16774l()) {
                    ((BinderC5125v) AbstractC5391n.m21783i(this.f7585h)).m20758P(c1804o);
                }
                try {
                    this.f7579b.m20354g(c1804o);
                } catch (SecurityException e10) {
                    m8013G(new C4854b(10), e10);
                }
            } catch (IllegalStateException e11) {
                m8013G(new C4854b(10), e11);
            }
        }
    }

    /* renamed from: E */
    public final void m8011E(AbstractC1811v abstractC1811v) {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        if (this.f7579b.isConnected()) {
            if (m8001o(abstractC1811v)) {
                m7998l();
                return;
            } else {
                this.f7578a.add(abstractC1811v);
                return;
            }
        }
        this.f7578a.add(abstractC1811v);
        C4854b c4854b = this.f7588k;
        if (c4854b != null && c4854b.m20020k()) {
            m8013G(this.f7588k, null);
        } else {
            m8010D();
        }
    }

    /* renamed from: F */
    public final void m8012F() {
        this.f7589l++;
    }

    /* renamed from: G */
    public final void m8013G(C4854b c4854b, Exception exc) {
        Handler handler;
        C5365e0 c5365e0;
        boolean z10;
        Status m7939h;
        Status m7939h2;
        Status m7939h3;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        BinderC5125v binderC5125v = this.f7585h;
        if (binderC5125v != null) {
            binderC5125v.m20759Q();
        }
        m8009C();
        c5365e0 = this.f7590m.f7550i;
        c5365e0.m21725c();
        m7992f(c4854b);
        if ((this.f7579b instanceof C5744e) && c4854b.m20017g() != 24) {
            this.f7590m.f7545d = true;
            C1791b c1791b = this.f7590m;
            handler5 = c1791b.f7557p;
            handler6 = c1791b.f7557p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c4854b.m20017g() == 4) {
            status = C1791b.f7539s;
            m7993g(status);
            return;
        }
        if (this.f7578a.isEmpty()) {
            this.f7588k = c4854b;
            return;
        }
        if (exc != null) {
            handler4 = this.f7590m.f7557p;
            AbstractC5391n.m21777c(handler4);
            m7994h(null, exc, false);
            return;
        }
        z10 = this.f7590m.f7558q;
        if (z10) {
            m7939h2 = C1791b.m7939h(this.f7580c, c4854b);
            m7994h(m7939h2, null, true);
            if (!this.f7578a.isEmpty() && !m8002p(c4854b) && !this.f7590m.m7964g(c4854b, this.f7584g)) {
                if (c4854b.m20017g() == 18) {
                    this.f7586i = true;
                }
                if (!this.f7586i) {
                    m7939h3 = C1791b.m7939h(this.f7580c, c4854b);
                    m7993g(m7939h3);
                    return;
                }
                C1791b c1791b2 = this.f7590m;
                handler2 = c1791b2.f7557p;
                handler3 = c1791b2.f7557p;
                Message obtain = Message.obtain(handler3, 9, this.f7580c);
                j10 = this.f7590m.f7542a;
                handler2.sendMessageDelayed(obtain, j10);
                return;
            }
            return;
        }
        m7939h = C1791b.m7939h(this.f7580c, c4854b);
        m7993g(m7939h);
    }

    /* renamed from: H */
    public final void m8014H(C4854b c4854b) {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        C4987a.f fVar = this.f7579b;
        fVar.m20349b("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c4854b));
        m8013G(c4854b, null);
    }

    /* renamed from: I */
    public final void m8015I() {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        if (this.f7586i) {
            m8010D();
        }
    }

    /* renamed from: J */
    public final void m8016J() {
        Handler handler;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        m7993g(C1791b.f7538r);
        this.f7581d.m7981d();
        for (AbstractC5109f abstractC5109f : (AbstractC5109f[]) this.f7583f.keySet().toArray(new AbstractC5109f[0])) {
            m8011E(new C1810u(null, new C4247j()));
        }
        m7992f(new C4854b(4));
        if (this.f7579b.isConnected()) {
            this.f7579b.m20359o(new C1800k(this));
        }
    }

    /* renamed from: K */
    public final void m8017K() {
        Handler handler;
        C4868i c4868i;
        Context context;
        Status status;
        handler = this.f7590m.f7557p;
        AbstractC5391n.m21777c(handler);
        if (this.f7586i) {
            m8000n();
            C1791b c1791b = this.f7590m;
            c4868i = c1791b.f7549h;
            context = c1791b.f7548g;
            if (c4868i.mo20045g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m7993g(status);
            this.f7579b.m20349b("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean m8018L() {
        return this.f7579b.mo16774l();
    }

    @Override // p203k4.InterfaceC5111h
    /* renamed from: a */
    public final void mo8019a(C4854b c4854b) {
        m8013G(c4854b, null);
    }

    /* renamed from: b */
    public final boolean m8020b() {
        return m8003q(true);
    }

    @Override // p203k4.InterfaceC5106c
    /* renamed from: c */
    public final void mo8021c(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f7590m.f7557p;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f7590m.f7557p;
            handler2.post(new RunnableC1798i(this, i10));
        } else {
            m7997k(i10);
        }
    }

    @Override // p203k4.InterfaceC5106c
    /* renamed from: d */
    public final void mo8022d(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f7590m.f7557p;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f7590m.f7557p;
            handler2.post(new RunnableC1797h(this));
        } else {
            m7996j();
        }
    }

    /* renamed from: r */
    public final int m8023r() {
        return this.f7584g;
    }

    /* renamed from: s */
    public final int m8024s() {
        return this.f7589l;
    }

    /* renamed from: u */
    public final C4987a.f m8025u() {
        return this.f7579b;
    }

    /* renamed from: w */
    public final Map m8026w() {
        return this.f7583f;
    }
}
