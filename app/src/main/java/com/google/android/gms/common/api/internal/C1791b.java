package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.AbstractC0272b;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p172i4.C4854b;
import p172i4.C4868i;
import p187j4.AbstractC4990d;
import p203k4.C5104b;
import p203k4.C5121r;
import p203k4.InterfaceC5113j;
import p214l.C5304b;
import p219l4.AbstractC5373h;
import p219l4.AbstractC5404s;
import p219l4.C5365e0;
import p219l4.C5385l;
import p219l4.C5394o;
import p219l4.C5397p;
import p219l4.C5402r;
import p219l4.InterfaceC5406t;
import p281p4.AbstractC6204h;
import p365v4.HandlerC7209h;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public class C1791b implements Handler.Callback {

    /* renamed from: r */
    public static final Status f7538r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s */
    private static final Status f7539s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t */
    private static final Object f7540t = new Object();

    /* renamed from: u */
    private static C1791b f7541u;

    /* renamed from: e */
    private C5402r f7546e;

    /* renamed from: f */
    private InterfaceC5406t f7547f;

    /* renamed from: g */
    private final Context f7548g;

    /* renamed from: h */
    private final C4868i f7549h;

    /* renamed from: i */
    private final C5365e0 f7550i;

    /* renamed from: p */
    private final Handler f7557p;

    /* renamed from: q */
    private volatile boolean f7558q;

    /* renamed from: a */
    private long f7542a = 5000;

    /* renamed from: b */
    private long f7543b = 120000;

    /* renamed from: c */
    private long f7544c = 10000;

    /* renamed from: d */
    private boolean f7545d = false;

    /* renamed from: j */
    private final AtomicInteger f7551j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f7552k = new AtomicInteger(0);

    /* renamed from: l */
    private final Map f7553l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m */
    private C1795f f7554m = null;

    /* renamed from: n */
    private final Set f7555n = new C5304b();

    /* renamed from: o */
    private final Set f7556o = new C5304b();

    private C1791b(Context context, Looper looper, C4868i c4868i) {
        this.f7558q = true;
        this.f7548g = context;
        HandlerC7209h handlerC7209h = new HandlerC7209h(looper, this);
        this.f7557p = handlerC7209h;
        this.f7549h = c4868i;
        this.f7550i = new C5365e0(c4868i);
        if (AbstractC6204h.m24755a(context)) {
            this.f7558q = false;
        }
        handlerC7209h.sendMessage(handlerC7209h.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Status m7939h(C5104b c5104b, C4854b c4854b) {
        return new Status(c4854b, "API: " + c5104b.m20743b() + " is not available on this device. Connection failed with: " + String.valueOf(c4854b));
    }

    /* renamed from: i */
    private final C1801l m7940i(AbstractC4990d abstractC4990d) {
        C5104b m20365d = abstractC4990d.m20365d();
        C1801l c1801l = (C1801l) this.f7553l.get(m20365d);
        if (c1801l == null) {
            c1801l = new C1801l(this, abstractC4990d);
            this.f7553l.put(m20365d, c1801l);
        }
        if (c1801l.m8018L()) {
            this.f7556o.add(m20365d);
        }
        c1801l.m8010D();
        return c1801l;
    }

    /* renamed from: j */
    private final InterfaceC5406t m7941j() {
        if (this.f7547f == null) {
            this.f7547f = AbstractC5404s.m21808a(this.f7548g);
        }
        return this.f7547f;
    }

    /* renamed from: k */
    private final void m7942k() {
        C5402r c5402r = this.f7546e;
        if (c5402r != null) {
            if (c5402r.m21805g() > 0 || m7963f()) {
                m7941j().mo21810a(c5402r);
            }
            this.f7546e = null;
        }
    }

    /* renamed from: l */
    private final void m7943l(C4247j c4247j, int i10, AbstractC4990d abstractC4990d) {
        C1805p m8037b;
        if (i10 != 0 && (m8037b = C1805p.m8037b(this, i10, abstractC4990d.m20365d())) != null) {
            AbstractC4245i m17724a = c4247j.m17724a();
            final Handler handler = this.f7557p;
            handler.getClass();
            m17724a.mo17701c(new Executor() { // from class: k4.l
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, m8037b);
        }
    }

    /* renamed from: x */
    public static C1791b m7953x(Context context) {
        C1791b c1791b;
        synchronized (f7540t) {
            if (f7541u == null) {
                f7541u = new C1791b(context.getApplicationContext(), AbstractC5373h.m21742c().getLooper(), C4868i.m20041m());
            }
            c1791b = f7541u;
        }
        return c1791b;
    }

    /* renamed from: D */
    public final void m7956D(AbstractC4990d abstractC4990d, int i10, AbstractC1792c abstractC1792c, C4247j c4247j, InterfaceC5113j interfaceC5113j) {
        m7943l(c4247j, abstractC1792c.m7970d(), abstractC4990d);
        C1809t c1809t = new C1809t(i10, abstractC1792c, c4247j, interfaceC5113j);
        Handler handler = this.f7557p;
        handler.sendMessage(handler.obtainMessage(4, new C5121r(c1809t, this.f7552k.get(), abstractC4990d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final void m7957E(C5385l c5385l, int i10, long j10, int i11) {
        Handler handler = this.f7557p;
        handler.sendMessage(handler.obtainMessage(18, new C1806q(c5385l, i10, j10, i11)));
    }

    /* renamed from: F */
    public final void m7958F(C4854b c4854b, int i10) {
        if (!m7964g(c4854b, i10)) {
            Handler handler = this.f7557p;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, c4854b));
        }
    }

    /* renamed from: a */
    public final void m7959a() {
        Handler handler = this.f7557p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void m7960b(AbstractC4990d abstractC4990d) {
        Handler handler = this.f7557p;
        handler.sendMessage(handler.obtainMessage(7, abstractC4990d));
    }

    /* renamed from: c */
    public final void m7961c(C1795f c1795f) {
        synchronized (f7540t) {
            if (this.f7554m != c1795f) {
                this.f7554m = c1795f;
                this.f7555n.clear();
            }
            this.f7555n.addAll(c1795f.m7987t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m7962d(C1795f c1795f) {
        synchronized (f7540t) {
            if (this.f7554m == c1795f) {
                this.f7554m = null;
                this.f7555n.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m7963f() {
        if (this.f7545d) {
            return false;
        }
        C5397p m21793a = C5394o.m21792b().m21793a();
        if (m21793a != null && !m21793a.m21799j()) {
            return false;
        }
        int m21723a = this.f7550i.m21723a(this.f7548g, 203400000);
        if (m21723a != -1 && m21723a != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m7964g(C4854b c4854b, int i10) {
        return this.f7549h.m20059w(this.f7548g, c4854b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C5104b c5104b;
        C5104b c5104b2;
        C5104b c5104b3;
        C5104b c5104b4;
        int i10 = message.what;
        long j10 = 300000;
        C1801l c1801l = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f7544c = j10;
                this.f7557p.removeMessages(12);
                for (C5104b c5104b5 : this.f7553l.keySet()) {
                    Handler handler = this.f7557p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c5104b5), this.f7544c);
                }
                return true;
            case 2:
                AbstractC0272b.m941a(message.obj);
                throw null;
            case 3:
                for (C1801l c1801l2 : this.f7553l.values()) {
                    c1801l2.m8009C();
                    c1801l2.m8010D();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C5121r c5121r = (C5121r) message.obj;
                C1801l c1801l3 = (C1801l) this.f7553l.get(c5121r.f21046c.m20365d());
                if (c1801l3 == null) {
                    c1801l3 = m7940i(c5121r.f21046c);
                }
                if (c1801l3.m8018L() && this.f7552k.get() != c5121r.f21045b) {
                    c5121r.f21044a.mo8039a(f7538r);
                    c1801l3.m8016J();
                } else {
                    c1801l3.m8011E(c5121r.f21044a);
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C4854b c4854b = (C4854b) message.obj;
                Iterator it = this.f7553l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C1801l c1801l4 = (C1801l) it.next();
                        if (c1801l4.m8023r() == i11) {
                            c1801l = c1801l4;
                        }
                    }
                }
                if (c1801l != null) {
                    if (c4854b.m20017g() == 13) {
                        C1801l.m8006x(c1801l, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f7549h.mo20044e(c4854b.m20017g()) + ": " + c4854b.m20018i()));
                    } else {
                        C1801l.m8006x(c1801l, m7939h(C1801l.m8005v(c1801l), c4854b));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f7548g.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1790a.m7929c((Application) this.f7548g.getApplicationContext());
                    ComponentCallbacks2C1790a.m7928b().m7931a(new C1796g(this));
                    if (!ComponentCallbacks2C1790a.m7928b().m7933e(true)) {
                        this.f7544c = 300000L;
                    }
                }
                return true;
            case 7:
                m7940i((AbstractC4990d) message.obj);
                return true;
            case 9:
                if (this.f7553l.containsKey(message.obj)) {
                    ((C1801l) this.f7553l.get(message.obj)).m8015I();
                }
                return true;
            case 10:
                Iterator it2 = this.f7556o.iterator();
                while (it2.hasNext()) {
                    C1801l c1801l5 = (C1801l) this.f7553l.remove((C5104b) it2.next());
                    if (c1801l5 != null) {
                        c1801l5.m8016J();
                    }
                }
                this.f7556o.clear();
                return true;
            case 11:
                if (this.f7553l.containsKey(message.obj)) {
                    ((C1801l) this.f7553l.get(message.obj)).m8017K();
                }
                return true;
            case 12:
                if (this.f7553l.containsKey(message.obj)) {
                    ((C1801l) this.f7553l.get(message.obj)).m8020b();
                }
                return true;
            case 14:
                AbstractC0272b.m941a(message.obj);
                throw null;
            case 15:
                C1802m c1802m = (C1802m) message.obj;
                Map map = this.f7553l;
                c5104b = c1802m.f7591a;
                if (map.containsKey(c5104b)) {
                    Map map2 = this.f7553l;
                    c5104b2 = c1802m.f7591a;
                    C1801l.m7989A((C1801l) map2.get(c5104b2), c1802m);
                }
                return true;
            case 16:
                C1802m c1802m2 = (C1802m) message.obj;
                Map map3 = this.f7553l;
                c5104b3 = c1802m2.f7591a;
                if (map3.containsKey(c5104b3)) {
                    Map map4 = this.f7553l;
                    c5104b4 = c1802m2.f7591a;
                    C1801l.m7990B((C1801l) map4.get(c5104b4), c1802m2);
                }
                return true;
            case 17:
                m7942k();
                return true;
            case 18:
                C1806q c1806q = (C1806q) message.obj;
                if (c1806q.f7608c == 0) {
                    m7941j().mo21810a(new C5402r(c1806q.f7607b, Arrays.asList(c1806q.f7606a)));
                } else {
                    C5402r c5402r = this.f7546e;
                    if (c5402r != null) {
                        List m21806i = c5402r.m21806i();
                        if (c5402r.m21805g() == c1806q.f7607b && (m21806i == null || m21806i.size() < c1806q.f7609d)) {
                            this.f7546e.m21807j(c1806q.f7606a);
                        } else {
                            this.f7557p.removeMessages(17);
                            m7942k();
                        }
                    }
                    if (this.f7546e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c1806q.f7606a);
                        this.f7546e = new C5402r(c1806q.f7607b, arrayList);
                        Handler handler2 = this.f7557p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1806q.f7608c);
                    }
                }
                return true;
            case 19:
                this.f7545d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* renamed from: m */
    public final int m7965m() {
        return this.f7551j.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final C1801l m7966w(C5104b c5104b) {
        return (C1801l) this.f7553l.get(c5104b);
    }
}
