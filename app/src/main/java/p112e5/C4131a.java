package p112e5;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6209m;
import p281p4.AbstractC6211o;
import p281p4.C6203g;
import p281p4.InterfaceC6200d;
import p410y4.AbstractC7672h;
import p410y4.C7666b;
import p410y4.C7673i;

/* renamed from: e5.a */
/* loaded from: classes.dex */
public class C4131a {

    /* renamed from: r */
    private static final long f18146r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f18147s = null;

    /* renamed from: t */
    private static final Object f18148t = new Object();

    /* renamed from: u */
    private static volatile InterfaceC4135e f18149u = new C4133c();

    /* renamed from: a */
    private final Object f18150a;

    /* renamed from: b */
    private final PowerManager.WakeLock f18151b;

    /* renamed from: c */
    private int f18152c;

    /* renamed from: d */
    private Future f18153d;

    /* renamed from: e */
    private long f18154e;

    /* renamed from: f */
    private final Set f18155f;

    /* renamed from: g */
    private boolean f18156g;

    /* renamed from: h */
    private int f18157h;

    /* renamed from: i */
    C7666b f18158i;

    /* renamed from: j */
    private InterfaceC6200d f18159j;

    /* renamed from: k */
    private WorkSource f18160k;

    /* renamed from: l */
    private final String f18161l;

    /* renamed from: m */
    private final String f18162m;

    /* renamed from: n */
    private final Context f18163n;

    /* renamed from: o */
    private final Map f18164o;

    /* renamed from: p */
    private AtomicInteger f18165p;

    /* renamed from: q */
    private final ScheduledExecutorService f18166q;

    public C4131a(Context context, int i10, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f18150a = new Object();
        this.f18152c = 0;
        this.f18155f = new HashSet();
        this.f18156g = true;
        this.f18159j = C6203g.m24754d();
        this.f18164o = new HashMap();
        this.f18165p = new AtomicInteger(0);
        AbstractC5391n.m21784j(context, "WakeLock: context must not be null");
        AbstractC5391n.m21780f(str, "WakeLock: wakeLockName must not be empty");
        this.f18163n = context.getApplicationContext();
        this.f18162m = str;
        this.f18158i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f18161l = str2;
        } else {
            this.f18161l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f18151b = newWakeLock;
            if (AbstractC6211o.m24782c(context)) {
                WorkSource m24781b = AbstractC6211o.m24781b(context, AbstractC6209m.m24777a(packageName) ? context.getPackageName() : packageName);
                this.f18160k = m24781b;
                if (m24781b != null) {
                    m17318i(newWakeLock, m24781b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f18147s;
            if (scheduledExecutorService == null) {
                synchronized (f18148t) {
                    scheduledExecutorService = f18147s;
                    if (scheduledExecutorService == null) {
                        AbstractC7672h.m29467a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f18147s = scheduledExecutorService;
                    }
                }
            }
            this.f18166q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C7673i(sb2.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m17314e(C4131a c4131a) {
        synchronized (c4131a.f18150a) {
            if (!c4131a.m17320b()) {
                return;
            }
            Log.e("WakeLock", String.valueOf(c4131a.f18161l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
            c4131a.m17316g();
            if (!c4131a.m17320b()) {
                return;
            }
            c4131a.f18152c = 1;
            c4131a.m17317h(0);
        }
    }

    /* renamed from: f */
    private final String m17315f(String str) {
        if (this.f18156g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m17316g() {
        if (this.f18155f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f18155f);
        this.f18155f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC0272b.m941a(arrayList.get(0));
        throw null;
    }

    /* renamed from: h */
    private final void m17317h(int i10) {
        synchronized (this.f18150a) {
            if (!m17320b()) {
                return;
            }
            if (this.f18156g) {
                int i11 = this.f18152c - 1;
                this.f18152c = i11;
                if (i11 > 0) {
                    return;
                }
            } else {
                this.f18152c = 0;
            }
            m17316g();
            Iterator it = this.f18164o.values().iterator();
            while (it.hasNext()) {
                ((C4134d) it.next()).f18168a = 0;
            }
            this.f18164o.clear();
            Future future = this.f18153d;
            if (future != null) {
                future.cancel(false);
                this.f18153d = null;
                this.f18154e = 0L;
            }
            this.f18157h = 0;
            try {
                if (this.f18151b.isHeld()) {
                    try {
                        this.f18151b.release();
                        if (this.f18158i != null) {
                            this.f18158i = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f18161l).concat(" failed to release!"), e10);
                            if (this.f18158i != null) {
                                this.f18158i = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f18161l).concat(" should be held!"));
                }
            } catch (Throwable th) {
                if (this.f18158i != null) {
                    this.f18158i = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: i */
    private static void m17318i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    /* renamed from: a */
    public void m17319a(long j10) {
        this.f18165p.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f18146r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f18150a) {
            if (!m17320b()) {
                this.f18158i = C7666b.m29466a(false, null);
                this.f18151b.acquire();
                this.f18159j.mo24748b();
            }
            this.f18152c++;
            this.f18157h++;
            m17315f(null);
            C4134d c4134d = (C4134d) this.f18164o.get(null);
            if (c4134d == null) {
                c4134d = new C4134d(null);
                this.f18164o.put(null, c4134d);
            }
            c4134d.f18168a++;
            long mo24748b = this.f18159j.mo24748b();
            if (Long.MAX_VALUE - mo24748b > max) {
                j11 = mo24748b + max;
            }
            if (j11 > this.f18154e) {
                this.f18154e = j11;
                Future future = this.f18153d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f18153d = this.f18166q.schedule(new Runnable() { // from class: e5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4131a.m17314e(C4131a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m17320b() {
        boolean z10;
        synchronized (this.f18150a) {
            if (this.f18152c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public void m17321c() {
        if (this.f18165p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f18161l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f18150a) {
            m17315f(null);
            if (this.f18164o.containsKey(null)) {
                C4134d c4134d = (C4134d) this.f18164o.get(null);
                if (c4134d != null) {
                    int i10 = c4134d.f18168a - 1;
                    c4134d.f18168a = i10;
                    if (i10 == 0) {
                        this.f18164o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f18161l).concat(" counter does not exist"));
            }
            m17317h(0);
        }
    }

    /* renamed from: d */
    public void m17322d(boolean z10) {
        synchronized (this.f18150a) {
            this.f18156g = z10;
        }
    }
}
