package p219l4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p172i4.C4854b;
import p172i4.C4858d;
import p172i4.C4870j;

/* renamed from: l4.c */
/* loaded from: classes.dex */
public abstract class AbstractC5358c {

    /* renamed from: A */
    private boolean f21893A;

    /* renamed from: B */
    private volatile C5419z0 f21894B;

    /* renamed from: C */
    protected AtomicInteger f21895C;

    /* renamed from: a */
    private int f21896a;

    /* renamed from: b */
    private long f21897b;

    /* renamed from: c */
    private long f21898c;

    /* renamed from: d */
    private int f21899d;

    /* renamed from: e */
    private long f21900e;

    /* renamed from: f */
    private volatile String f21901f;

    /* renamed from: g */
    C5387l1 f21902g;

    /* renamed from: h */
    private final Context f21903h;

    /* renamed from: i */
    private final Looper f21904i;

    /* renamed from: j */
    private final AbstractC5373h f21905j;

    /* renamed from: k */
    private final C4870j f21906k;

    /* renamed from: l */
    final Handler f21907l;

    /* renamed from: m */
    private final Object f21908m;

    /* renamed from: n */
    private final Object f21909n;

    /* renamed from: o */
    private InterfaceC5382k f21910o;

    /* renamed from: p */
    protected c f21911p;

    /* renamed from: q */
    private IInterface f21912q;

    /* renamed from: r */
    private final ArrayList f21913r;

    /* renamed from: s */
    private ServiceConnectionC5413w0 f21914s;

    /* renamed from: t */
    private int f21915t;

    /* renamed from: u */
    private final a f21916u;

    /* renamed from: v */
    private final b f21917v;

    /* renamed from: w */
    private final int f21918w;

    /* renamed from: x */
    private final String f21919x;

    /* renamed from: y */
    private volatile String f21920y;

    /* renamed from: z */
    private C4854b f21921z;

    /* renamed from: E */
    private static final C4858d[] f21892E = new C4858d[0];

    /* renamed from: D */
    public static final String[] f21891D = {"service_esmobile", "service_googleme"};

    /* renamed from: l4.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: c */
        void mo9442c(int i10);

        /* renamed from: d */
        void mo9443d(Bundle bundle);
    }

    /* renamed from: l4.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo9441a(C4854b c4854b);
    }

    /* renamed from: l4.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo8034a(C4854b c4854b);
    }

    /* renamed from: l4.c$d */
    /* loaded from: classes.dex */
    protected class d implements c {
        public d() {
        }

        @Override // p219l4.AbstractC5358c.c
        /* renamed from: a */
        public final void mo8034a(C4854b c4854b) {
            if (c4854b.m20021n()) {
                AbstractC5358c abstractC5358c = AbstractC5358c.this;
                abstractC5358c.m21682e(null, abstractC5358c.mo21662B());
            } else if (AbstractC5358c.this.f21917v != null) {
                AbstractC5358c.this.f21917v.mo9441a(c4854b);
            }
        }
    }

    /* renamed from: l4.c$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo7988a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC5358c(android.content.Context r10, android.os.Looper r11, int r12, p219l4.AbstractC5358c.a r13, p219l4.AbstractC5358c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            l4.h r3 = p219l4.AbstractC5373h.m21741b(r10)
            i4.j r4 = p172i4.C4870j.m20060f()
            p219l4.AbstractC5391n.m21783i(r13)
            p219l4.AbstractC5391n.m21783i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p219l4.AbstractC5358c.<init>(android.content.Context, android.os.Looper, int, l4.c$a, l4.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m21655b0(AbstractC5358c abstractC5358c, C5419z0 c5419z0) {
        C5397p m21722o;
        abstractC5358c.f21894B = c5419z0;
        if (abstractC5358c.m21676R()) {
            C5364e c5364e = c5419z0.f22061d;
            C5394o m21792b = C5394o.m21792b();
            if (c5364e == null) {
                m21722o = null;
            } else {
                m21722o = c5364e.m21722o();
            }
            m21792b.m21794c(m21722o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m21656c0(AbstractC5358c abstractC5358c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC5358c.f21908m) {
            i11 = abstractC5358c.f21915t;
        }
        if (i11 == 3) {
            abstractC5358c.f21893A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC5358c.f21907l;
        handler.sendMessage(handler.obtainMessage(i12, abstractC5358c.f21895C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static /* bridge */ /* synthetic */ boolean m21658f0(AbstractC5358c abstractC5358c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC5358c.f21908m) {
            if (abstractC5358c.f21915t != i10) {
                return false;
            }
            abstractC5358c.m21660h0(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: g0 */
    static /* bridge */ /* synthetic */ boolean m21659g0(p219l4.AbstractC5358c r2) {
        /*
            boolean r0 = r2.f21893A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo9656D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m21661A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo9656D()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p219l4.AbstractC5358c.m21659g0(l4.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m21660h0(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        C5387l1 c5387l1;
        C5387l1 c5387l12;
        boolean z12 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        AbstractC5391n.m21775a(z12);
        synchronized (this.f21908m) {
            this.f21915t = i10;
            this.f21912q = iInterface;
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        AbstractC5391n.m21783i(iInterface);
                        m21668J(iInterface);
                    }
                } else {
                    ServiceConnectionC5413w0 serviceConnectionC5413w0 = this.f21914s;
                    if (serviceConnectionC5413w0 != null && (c5387l12 = this.f21902g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c5387l12.m21769c() + " on " + c5387l12.m21768b());
                        AbstractC5373h abstractC5373h = this.f21905j;
                        String m21769c = this.f21902g.m21769c();
                        AbstractC5391n.m21783i(m21769c);
                        abstractC5373h.m21744e(m21769c, this.f21902g.m21768b(), this.f21902g.m21767a(), serviceConnectionC5413w0, m21677W(), this.f21902g.m21770d());
                        this.f21895C.incrementAndGet();
                    }
                    ServiceConnectionC5413w0 serviceConnectionC5413w02 = new ServiceConnectionC5413w0(this, this.f21895C.get());
                    this.f21914s = serviceConnectionC5413w02;
                    if (this.f21915t == 3 && m21661A() != null) {
                        c5387l1 = new C5387l1(m21696x().getPackageName(), m21661A(), true, AbstractC5373h.m21740a(), false);
                    } else {
                        c5387l1 = new C5387l1(m21664F(), mo9657E(), false, AbstractC5373h.m21740a(), mo21666H());
                    }
                    this.f21902g = c5387l1;
                    if (c5387l1.m21770d() && mo9658i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f21902g.m21769c())));
                    }
                    AbstractC5373h abstractC5373h2 = this.f21905j;
                    String m21769c2 = this.f21902g.m21769c();
                    AbstractC5391n.m21783i(m21769c2);
                    if (!abstractC5373h2.mo21745f(new C5363d1(m21769c2, this.f21902g.m21768b(), this.f21902g.m21767a(), this.f21902g.m21770d()), serviceConnectionC5413w02, m21677W(), mo21694v())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f21902g.m21769c() + " on " + this.f21902g.m21768b());
                        m21681d0(16, null, this.f21895C.get());
                    }
                }
            } else {
                ServiceConnectionC5413w0 serviceConnectionC5413w03 = this.f21914s;
                if (serviceConnectionC5413w03 != null) {
                    AbstractC5373h abstractC5373h3 = this.f21905j;
                    String m21769c3 = this.f21902g.m21769c();
                    AbstractC5391n.m21783i(m21769c3);
                    abstractC5373h3.m21744e(m21769c3, this.f21902g.m21768b(), this.f21902g.m21767a(), serviceConnectionC5413w03, m21677W(), this.f21902g.m21770d());
                    this.f21914s = null;
                }
            }
        }
    }

    /* renamed from: A */
    protected String m21661A() {
        return null;
    }

    /* renamed from: B */
    protected Set mo21662B() {
        return Collections.emptySet();
    }

    /* renamed from: C */
    public final IInterface m21663C() {
        IInterface iInterface;
        synchronized (this.f21908m) {
            if (this.f21915t != 5) {
                m21690q();
                iInterface = this.f21912q;
                AbstractC5391n.m21784j(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo9656D();

    /* renamed from: E */
    protected abstract String mo9657E();

    /* renamed from: F */
    protected String m21664F() {
        return "com.google.android.gms";
    }

    /* renamed from: G */
    public C5364e m21665G() {
        C5419z0 c5419z0 = this.f21894B;
        if (c5419z0 == null) {
            return null;
        }
        return c5419z0.f22061d;
    }

    /* renamed from: H */
    protected boolean mo21666H() {
        if (mo9658i() >= 211700000) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m21667I() {
        return this.f21894B != null;
    }

    /* renamed from: J */
    protected void m21668J(IInterface iInterface) {
        this.f21898c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void m21669K(C4854b c4854b) {
        this.f21899d = c4854b.m20017g();
        this.f21900e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m21670L(int i10) {
        this.f21896a = i10;
        this.f21897b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void m21671M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f21907l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new C5415x0(this, i10, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean m21672N() {
        return false;
    }

    /* renamed from: O */
    public void m21673O(String str) {
        this.f21920y = str;
    }

    /* renamed from: P */
    public void m21674P(int i10) {
        Handler handler = this.f21907l;
        handler.sendMessage(handler.obtainMessage(6, this.f21895C.get(), i10));
    }

    /* renamed from: Q */
    protected void m21675Q(c cVar, int i10, PendingIntent pendingIntent) {
        AbstractC5391n.m21784j(cVar, "Connection progress callbacks cannot be null.");
        this.f21911p = cVar;
        Handler handler = this.f21907l;
        handler.sendMessage(handler.obtainMessage(3, this.f21895C.get(), i10, pendingIntent));
    }

    /* renamed from: R */
    public boolean m21676R() {
        return false;
    }

    /* renamed from: W */
    protected final String m21677W() {
        String str = this.f21919x;
        if (str == null) {
            return this.f21903h.getClass().getName();
        }
        return str;
    }

    /* renamed from: b */
    public void m21678b(String str) {
        this.f21901f = str;
        m21683f();
    }

    /* renamed from: c */
    public boolean m21679c() {
        boolean z10;
        synchronized (this.f21908m) {
            int i10 = this.f21915t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: d */
    public String m21680d() {
        C5387l1 c5387l1;
        if (isConnected() && (c5387l1 = this.f21902g) != null) {
            return c5387l1.m21768b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public final void m21681d0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f21907l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new C5417y0(this, i10, null)));
    }

    /* renamed from: e */
    public void m21682e(InterfaceC5376i interfaceC5376i, Set set) {
        Bundle mo16775z = mo16775z();
        int i10 = this.f21918w;
        String str = this.f21920y;
        int i11 = C4870j.f20367a;
        Scope[] scopeArr = C5367f.f21954o;
        Bundle bundle = new Bundle();
        C4858d[] c4858dArr = C5367f.f21955p;
        C5367f c5367f = new C5367f(6, i10, i11, null, null, scopeArr, bundle, null, c4858dArr, c4858dArr, true, 0, false, str);
        c5367f.f21959d = this.f21903h.getPackageName();
        c5367f.f21962g = mo16775z;
        if (set != null) {
            c5367f.f21961f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo16774l()) {
            Account mo21692t = mo21692t();
            if (mo21692t == null) {
                mo21692t = new Account("<<default account>>", "com.google");
            }
            c5367f.f21963h = mo21692t;
            if (interfaceC5376i != null) {
                c5367f.f21960e = interfaceC5376i.asBinder();
            }
        } else if (m21672N()) {
            c5367f.f21963h = mo21692t();
        }
        c5367f.f21964i = f21892E;
        c5367f.f21965j = mo21693u();
        if (m21676R()) {
            c5367f.f21968m = true;
        }
        try {
            synchronized (this.f21909n) {
                InterfaceC5382k interfaceC5382k = this.f21910o;
                if (interfaceC5382k != null) {
                    interfaceC5382k.mo21758A(new BinderC5411v0(this, this.f21895C.get()), c5367f);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            m21674P(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m21671M(8, null, null, this.f21895C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m21671M(8, null, null, this.f21895C.get());
        }
    }

    /* renamed from: f */
    public void m21683f() {
        this.f21895C.incrementAndGet();
        synchronized (this.f21913r) {
            int size = this.f21913r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC5409u0) this.f21913r.get(i10)).m21817d();
            }
            this.f21913r.clear();
        }
        synchronized (this.f21909n) {
            this.f21910o = null;
        }
        m21660h0(1, null);
    }

    /* renamed from: g */
    public void m21684g(c cVar) {
        AbstractC5391n.m21784j(cVar, "Connection progress callbacks cannot be null.");
        this.f21911p = cVar;
        m21660h0(2, null);
    }

    /* renamed from: h */
    public boolean m21685h() {
        return true;
    }

    /* renamed from: i */
    public abstract int mo9658i();

    public boolean isConnected() {
        boolean z10;
        synchronized (this.f21908m) {
            if (this.f21915t == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final C4858d[] m21686j() {
        C5419z0 c5419z0 = this.f21894B;
        if (c5419z0 == null) {
            return null;
        }
        return c5419z0.f22059b;
    }

    /* renamed from: k */
    public String m21687k() {
        return this.f21901f;
    }

    /* renamed from: l */
    public boolean mo16774l() {
        return false;
    }

    /* renamed from: o */
    public void m21688o(e eVar) {
        eVar.mo7988a();
    }

    /* renamed from: p */
    public void m21689p() {
        int mo20046h = this.f21906k.mo20046h(this.f21903h, mo9658i());
        if (mo20046h != 0) {
            m21660h0(1, null);
            m21675Q(new d(), mo20046h, null);
        } else {
            m21684g(new d());
        }
    }

    /* renamed from: q */
    protected final void m21690q() {
        if (isConnected()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public abstract IInterface mo9659r(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public boolean m21691s() {
        return false;
    }

    /* renamed from: t */
    public Account mo21692t() {
        return null;
    }

    /* renamed from: u */
    public C4858d[] mo21693u() {
        return f21892E;
    }

    /* renamed from: v */
    protected Executor mo21694v() {
        return null;
    }

    /* renamed from: w */
    public Bundle m21695w() {
        return null;
    }

    /* renamed from: x */
    public final Context m21696x() {
        return this.f21903h;
    }

    /* renamed from: y */
    public int m21697y() {
        return this.f21918w;
    }

    /* renamed from: z */
    protected Bundle mo16775z() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5358c(Context context, Looper looper, AbstractC5373h abstractC5373h, C4870j c4870j, int i10, a aVar, b bVar, String str) {
        this.f21901f = null;
        this.f21908m = new Object();
        this.f21909n = new Object();
        this.f21913r = new ArrayList();
        this.f21915t = 1;
        this.f21921z = null;
        this.f21893A = false;
        this.f21894B = null;
        this.f21895C = new AtomicInteger(0);
        AbstractC5391n.m21784j(context, "Context must not be null");
        this.f21903h = context;
        AbstractC5391n.m21784j(looper, "Looper must not be null");
        this.f21904i = looper;
        AbstractC5391n.m21784j(abstractC5373h, "Supervisor must not be null");
        this.f21905j = abstractC5373h;
        AbstractC5391n.m21784j(c4870j, "API availability must not be null");
        this.f21906k = c4870j;
        this.f21907l = new HandlerC5407t0(this, looper);
        this.f21918w = i10;
        this.f21916u = aVar;
        this.f21917v = bVar;
        this.f21919x = str;
    }
}
