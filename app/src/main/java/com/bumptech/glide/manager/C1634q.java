package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.InterfaceC1619b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p109e2.AbstractC4116f;
import p109e2.AbstractC4122l;

/* renamed from: com.bumptech.glide.manager.q */
/* loaded from: classes.dex */
final class C1634q {

    /* renamed from: d */
    private static volatile C1634q f6446d;

    /* renamed from: a */
    private final c f6447a;

    /* renamed from: b */
    final Set f6448b = new HashSet();

    /* renamed from: c */
    private boolean f6449c;

    /* renamed from: com.bumptech.glide.manager.q$a */
    /* loaded from: classes.dex */
    class a implements AbstractC4116f.b {

        /* renamed from: a */
        final /* synthetic */ Context f6450a;

        a(Context context) {
            this.f6450a = context;
        }

        @Override // p109e2.AbstractC4116f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f6450a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.q$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC1619b.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC1619b.a
        /* renamed from: a */
        public void mo7395a(boolean z10) {
            ArrayList arrayList;
            AbstractC4122l.m17229b();
            synchronized (C1634q.this) {
                arrayList = new ArrayList(C1634q.this.f6448b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1619b.a) it.next()).mo7395a(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.manager.q$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo7493a();

        boolean register();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.manager.q$d */
    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a */
        boolean f6453a;

        /* renamed from: b */
        final InterfaceC1619b.a f6454b;

        /* renamed from: c */
        private final AbstractC4116f.b f6455c;

        /* renamed from: d */
        private final ConnectivityManager.NetworkCallback f6456d = new a();

        /* renamed from: com.bumptech.glide.manager.q$d$a */
        /* loaded from: classes.dex */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.bumptech.glide.manager.q$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC7819a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ boolean f6458a;

                RunnableC7819a(boolean z10) {
                    this.f6458a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m7495a(this.f6458a);
                }
            }

            a() {
            }

            /* renamed from: b */
            private void m7494b(boolean z10) {
                AbstractC4122l.m17250w(new RunnableC7819a(z10));
            }

            /* renamed from: a */
            void m7495a(boolean z10) {
                AbstractC4122l.m17229b();
                d dVar = d.this;
                boolean z11 = dVar.f6453a;
                dVar.f6453a = z10;
                if (z11 != z10) {
                    dVar.f6454b.mo7395a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m7494b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m7494b(false);
            }
        }

        d(AbstractC4116f.b bVar, InterfaceC1619b.a aVar) {
            this.f6455c = bVar;
            this.f6454b = aVar;
        }

        @Override // com.bumptech.glide.manager.C1634q.c
        /* renamed from: a */
        public void mo7493a() {
            ((ConnectivityManager) this.f6455c.get()).unregisterNetworkCallback(this.f6456d);
        }

        @Override // com.bumptech.glide.manager.C1634q.c
        public boolean register() {
            Network activeNetwork;
            boolean z10;
            activeNetwork = ((ConnectivityManager) this.f6455c.get()).getActiveNetwork();
            if (activeNetwork != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6453a = z10;
            try {
                ((ConnectivityManager) this.f6455c.get()).registerDefaultNetworkCallback(this.f6456d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.q$e */
    /* loaded from: classes.dex */
    private static final class e implements c {

        /* renamed from: g */
        static final Executor f6460g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a */
        final Context f6461a;

        /* renamed from: b */
        final InterfaceC1619b.a f6462b;

        /* renamed from: c */
        private final AbstractC4116f.b f6463c;

        /* renamed from: d */
        volatile boolean f6464d;

        /* renamed from: e */
        volatile boolean f6465e;

        /* renamed from: f */
        final BroadcastReceiver f6466f = new a();

        /* renamed from: com.bumptech.glide.manager.q$e$a */
        /* loaded from: classes.dex */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.m7498d();
            }
        }

        /* renamed from: com.bumptech.glide.manager.q$e$b */
        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f6464d = eVar.m7496b();
                try {
                    e eVar2 = e.this;
                    eVar2.f6461a.registerReceiver(eVar2.f6466f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f6465e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    e.this.f6465e = false;
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.q$e$c */
        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!e.this.f6465e) {
                    return;
                }
                e.this.f6465e = false;
                e eVar = e.this;
                eVar.f6461a.unregisterReceiver(eVar.f6466f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bumptech.glide.manager.q$e$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = e.this.f6464d;
                e eVar = e.this;
                eVar.f6464d = eVar.m7496b();
                if (z10 != e.this.f6464d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f6464d);
                    }
                    e eVar2 = e.this;
                    eVar2.m7497c(eVar2.f6464d);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bumptech.glide.manager.q$e$e, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC7820e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f6471a;

            RunnableC7820e(boolean z10) {
                this.f6471a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f6462b.mo7395a(this.f6471a);
            }
        }

        e(Context context, AbstractC4116f.b bVar, InterfaceC1619b.a aVar) {
            this.f6461a = context.getApplicationContext();
            this.f6463c = bVar;
            this.f6462b = aVar;
        }

        @Override // com.bumptech.glide.manager.C1634q.c
        /* renamed from: a */
        public void mo7493a() {
            f6460g.execute(new c());
        }

        /* renamed from: b */
        boolean m7496b() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6463c.get()).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }

        /* renamed from: c */
        void m7497c(boolean z10) {
            AbstractC4122l.m17250w(new RunnableC7820e(z10));
        }

        /* renamed from: d */
        void m7498d() {
            f6460g.execute(new d());
        }

        @Override // com.bumptech.glide.manager.C1634q.c
        public boolean register() {
            f6460g.execute(new b());
            return true;
        }
    }

    private C1634q(Context context) {
        c eVar;
        AbstractC4116f.b m17208a = AbstractC4116f.m17208a(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new d(m17208a, bVar);
        } else {
            eVar = new e(context, m17208a, bVar);
        }
        this.f6447a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1634q m7487a(Context context) {
        if (f6446d == null) {
            synchronized (C1634q.class) {
                if (f6446d == null) {
                    f6446d = new C1634q(context.getApplicationContext());
                }
            }
        }
        return f6446d;
    }

    /* renamed from: b */
    private void m7488b() {
        if (!this.f6449c && !this.f6448b.isEmpty()) {
            this.f6449c = this.f6447a.register();
        }
    }

    /* renamed from: c */
    private void m7489c() {
        if (this.f6449c && this.f6448b.isEmpty()) {
            this.f6447a.mo7493a();
            this.f6449c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m7490d(InterfaceC1619b.a aVar) {
        this.f6448b.add(aVar);
        m7488b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void m7491e(InterfaceC1619b.a aVar) {
        this.f6448b.remove(aVar);
        m7489c();
    }
}
