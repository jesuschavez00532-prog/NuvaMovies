package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006a5.C0061a;
import p025b5.AbstractC1115m;
import p025b5.AbstractC1126x;
import p025b5.InterfaceC1123u;
import p219l4.AbstractC5391n;
import p281p4.C6203g;
import p281p4.InterfaceC6200d;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
/* loaded from: classes.dex */
public final class C2201y2 {

    /* renamed from: j */
    private static volatile C2201y2 f8272j;

    /* renamed from: a */
    private final String f8273a;

    /* renamed from: b */
    protected final InterfaceC6200d f8274b;

    /* renamed from: c */
    protected final ExecutorService f8275c;

    /* renamed from: d */
    private final C0061a f8276d;

    /* renamed from: e */
    private final List f8277e;

    /* renamed from: f */
    private int f8278f;

    /* renamed from: g */
    private boolean f8279g;

    /* renamed from: h */
    private final String f8280h;

    /* renamed from: i */
    private volatile InterfaceC1945h1 f8281i;

    protected C2201y2(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z10;
        if (str != null && m9204m(str2, str3)) {
            this.f8273a = str;
        } else {
            this.f8273a = "FA";
        }
        this.f8274b = C6203g.m24754d();
        AbstractC1850b1.m8115a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1961i2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8275c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8276d = new C0061a(this);
        this.f8277e = new ArrayList();
        try {
            if (AbstractC1126x.m5105b(context, "google_app_id", AbstractC1115m.m5082a(context)) != null && !m9200i()) {
                this.f8280h = null;
                this.f8279g = true;
                Log.w(this.f8273a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m9204m(str2, str3)) {
            this.f8280h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f8273a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            } else {
                if (str2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 ^ (str3 == null)) {
                    Log.w(this.f8273a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f8280h = str2;
        }
        m9203l(new C2185x1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8273a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2186x2(this));
        }
    }

    /* renamed from: i */
    protected static final boolean m9200i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m9201j(Exception exc, boolean z10, boolean z11) {
        this.f8279g |= z10;
        if (z10) {
            Log.w(this.f8273a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            m9213a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f8273a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: k */
    private final void m9202k(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m9203l(new C2006l2(this, l10, str, str2, bundle, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m9203l(AbstractRunnableC2036n2 abstractRunnableC2036n2) {
        this.f8275c.execute(abstractRunnableC2036n2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m9204m(String str, String str2) {
        if (str2 != null && str != null && !m9200i()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static C2201y2 m9206s(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC5391n.m21783i(context);
        if (f8272j == null) {
            synchronized (C2201y2.class) {
                if (f8272j == null) {
                    f8272j = new C2201y2(context, str, str2, str3, bundle);
                }
            }
        }
        return f8272j;
    }

    /* renamed from: D */
    public final void m9208D(String str) {
        m9203l(new C2200y1(this, str));
    }

    /* renamed from: E */
    public final void m9209E(String str, String str2, Bundle bundle) {
        m9203l(new C2125t1(this, str, str2, bundle));
    }

    /* renamed from: F */
    public final void m9210F(String str) {
        m9203l(new C2215z1(this, str));
    }

    /* renamed from: G */
    public final void m9211G(String str, Bundle bundle) {
        m9202k(null, str, bundle, false, true, null);
    }

    /* renamed from: H */
    public final void m9212H(String str, String str2, Bundle bundle) {
        m9202k(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m9213a(int i10, String str, Object obj, Object obj2, Object obj3) {
        m9203l(new C1946h2(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m9214b(InterfaceC1123u interfaceC1123u) {
        AbstractC5391n.m21783i(interfaceC1123u);
        synchronized (this.f8277e) {
            for (int i10 = 0; i10 < this.f8277e.size(); i10++) {
                if (interfaceC1123u.equals(((Pair) this.f8277e.get(i10)).first)) {
                    Log.w(this.f8273a, "OnEventListener already registered.");
                    return;
                }
            }
            BinderC2051o2 binderC2051o2 = new BinderC2051o2(interfaceC1123u);
            this.f8277e.add(new Pair(interfaceC1123u, binderC2051o2));
            if (this.f8281i != null) {
                try {
                    this.f8281i.registerOnMeasurementEventListener(binderC2051o2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f8273a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m9203l(new C1991k2(this, binderC2051o2));
        }
    }

    /* renamed from: c */
    public final void m9215c(Bundle bundle) {
        m9203l(new C2110s1(this, bundle));
    }

    /* renamed from: d */
    public final void m9216d(Activity activity, String str, String str2) {
        m9203l(new C2170w1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void m9217e(String str) {
        m9203l(new C2155v1(this, str));
    }

    /* renamed from: f */
    public final void m9218f(String str, String str2, Object obj, boolean z10) {
        m9203l(new C2021m2(this, str, str2, obj, z10));
    }

    /* renamed from: n */
    public final int m9219n(String str) {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1976j2(this, str, binderC1882d1));
        Integer num = (Integer) BinderC1882d1.m8199M(binderC1882d1.m8201c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public final long m9220o() {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1883d2(this, binderC1882d1));
        Long l10 = (Long) BinderC1882d1.m8199M(binderC1882d1.m8201c(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f8274b.mo24747a()).nextLong();
            int i10 = this.f8278f + 1;
            this.f8278f = i10;
            return nextLong + i10;
        }
        return l10.longValue();
    }

    /* renamed from: p */
    public final C0061a m9221p() {
        return this.f8276d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final InterfaceC1945h1 m9222r(Context context, boolean z10) {
        try {
            return AbstractBinderC1930g1.asInterface(DynamiteModule.m8058d(context, DynamiteModule.f7629e, ModuleDescriptor.MODULE_ID).m8066c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1816a e10) {
            m9201j(e10, true, false);
            return null;
        }
    }

    /* renamed from: u */
    public final String m9223u() {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1867c2(this, binderC1882d1));
        return binderC1882d1.m8202d(50L);
    }

    /* renamed from: v */
    public final String m9224v() {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1915f2(this, binderC1882d1));
        return binderC1882d1.m8202d(500L);
    }

    /* renamed from: w */
    public final String m9225w() {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1899e2(this, binderC1882d1));
        return binderC1882d1.m8202d(500L);
    }

    /* renamed from: x */
    public final String m9226x() {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1851b2(this, binderC1882d1));
        return binderC1882d1.m8202d(500L);
    }

    /* renamed from: y */
    public final List m9227y(String str, String str2) {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C2140u1(this, str, str2, binderC1882d1));
        List list = (List) BinderC1882d1.m8199M(binderC1882d1.m8201c(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: z */
    public final Map m9228z(String str, String str2, boolean z10) {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        m9203l(new C1931g2(this, str, str2, z10, binderC1882d1));
        Bundle m8201c = binderC1882d1.m8201c(5000L);
        if (m8201c != null && m8201c.size() != 0) {
            HashMap hashMap = new HashMap(m8201c.size());
            for (String str3 : m8201c.keySet()) {
                Object obj = m8201c.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
