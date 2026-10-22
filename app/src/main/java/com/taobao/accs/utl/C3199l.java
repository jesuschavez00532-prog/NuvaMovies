package com.taobao.accs.utl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.agoo.TaobaoRegister;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.taobao.accs.utl.l */
/* loaded from: classes.dex */
public class C3199l implements Application.ActivityLifecycleCallbacks {
    public static final int STATE_BACK = 0;
    public static final int STATE_FORE = 1;

    /* renamed from: a */
    private static final String f13204a = "l";

    /* renamed from: b */
    private static volatile C3199l f13205b;

    /* renamed from: c */
    private static ArrayList<a> f13206c;

    /* renamed from: d */
    private static ArrayList<b> f13207d;

    /* renamed from: e */
    private static Application f13208e;

    /* renamed from: j */
    private static boolean f13209j;

    /* renamed from: g */
    private boolean f13211g;

    /* renamed from: f */
    private int f13210f = 0;

    /* renamed from: h */
    private int f13212h = 0;

    /* renamed from: i */
    private int f13213i = 1;

    /* renamed from: com.taobao.accs.utl.l$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private String f13214a;

        /* renamed from: b */
        private int f13215b;

        /* renamed from: c */
        private long f13216c = C3207t.m13033a(C3199l.f13208e);

        public a(String str, int i10) {
            this.f13214a = str;
            this.f13215b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            ALog.m12940e(C3199l.f13204a, "click report", "lastActiveTime", Long.valueOf(this.f13216c), "currentActiveTime", Long.valueOf(currentTimeMillis));
            long j10 = this.f13216c;
            if (j10 == 0 || UtilityImpl.m12962a(j10, currentTimeMillis)) {
                this.f13215b |= 8;
            }
            TaobaoRegister.clickMessage(C3199l.f13208e, this.f13214a, null, this.f13215b, this.f13216c);
        }
    }

    /* renamed from: com.taobao.accs.utl.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12832a();

        /* renamed from: b */
        void mo12833b();
    }

    private C3199l() {
        f13206c = new ArrayList<>();
        f13207d = new ArrayList<>();
    }

    /* renamed from: a */
    public static C3199l m13012a() {
        if (f13205b == null) {
            synchronized (C3199l.class) {
                if (f13205b == null) {
                    f13205b = new C3199l();
                }
            }
        }
        return f13205b;
    }

    /* renamed from: b */
    public void m13017b() {
        ArrayList<a> arrayList = f13206c;
        if (arrayList != null) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(it.next());
            }
            f13206c.clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i10 = this.f13210f;
        if ((i10 & 1) != 1) {
            this.f13210f = i10 | 1 | 2;
        } else if ((i10 & 2) == 2) {
            this.f13210f = i10 & (-3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.f13211g) {
            C3207t.m13034a(f13208e, System.currentTimeMillis());
            if (!f13209j) {
                f13209j = true;
            }
        }
        this.f13211g = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i10 = this.f13212h;
        this.f13212h = i10 + 1;
        if (i10 == 0) {
            ALog.m12941i(f13204a, "onActivityStarted back to force", new Object[0]);
            this.f13211g = true;
            this.f13213i = 1;
            ThreadPoolExecutorFactory.execute(new RunnableC3200m(this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.f13212h - 1;
        this.f13212h = i10;
        if (i10 == 0) {
            this.f13213i = 0;
            ThreadPoolExecutorFactory.execute(new RunnableC3201n(this));
        }
    }

    /* renamed from: a */
    public void m13016a(b bVar) {
        if (bVar != null) {
            f13207d.add(bVar);
        }
    }
}
