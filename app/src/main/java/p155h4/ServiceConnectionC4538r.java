package p155h4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p219l4.AbstractC5391n;
import p259o4.C5915b;
import p378w4.HandlerC7366f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h4.r */
/* loaded from: classes.dex */
public final class ServiceConnectionC4538r implements ServiceConnection {

    /* renamed from: c */
    C4539s f19576c;

    /* renamed from: f */
    final /* synthetic */ C4544x f19579f;

    /* renamed from: a */
    int f19574a = 0;

    /* renamed from: b */
    final Messenger f19575b = new Messenger(new HandlerC7366f(Looper.getMainLooper(), new Handler.Callback() { // from class: h4.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC4538r serviceConnectionC4538r = ServiceConnectionC4538r.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (serviceConnectionC4538r) {
                AbstractC4541u abstractC4541u = (AbstractC4541u) serviceConnectionC4538r.f19578e.get(i10);
                if (abstractC4541u == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                serviceConnectionC4538r.f19578e.remove(i10);
                serviceConnectionC4538r.m18928f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC4541u.m18933c(new C4542v(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC4541u.mo18931a(data);
                return true;
            }
        }
    }));

    /* renamed from: d */
    final Queue f19577d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray f19578e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC4538r(C4544x c4544x, AbstractC4537q abstractC4537q) {
        this.f19579f = c4544x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m18923a(int i10, String str) {
        m18924b(i10, str, null);
    }

    /* renamed from: b */
    final synchronized void m18924b(int i10, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i11 = this.f19574a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f19574a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f19574a = 4;
            C5915b.m23917b().m23923c(C4544x.m18935a(this.f19579f), this);
            C4542v c4542v = new C4542v(i10, str, th);
            Iterator it = this.f19577d.iterator();
            while (it.hasNext()) {
                ((AbstractC4541u) it.next()).m18933c(c4542v);
            }
            this.f19577d.clear();
            for (int i12 = 0; i12 < this.f19578e.size(); i12++) {
                ((AbstractC4541u) this.f19578e.valueAt(i12)).m18933c(c4542v);
            }
            this.f19578e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m18925c() {
        C4544x.m18937e(this.f19579f).execute(new Runnable() { // from class: h4.m
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC4541u abstractC4541u;
                final ServiceConnectionC4538r serviceConnectionC4538r = ServiceConnectionC4538r.this;
                while (true) {
                    synchronized (serviceConnectionC4538r) {
                        if (serviceConnectionC4538r.f19574a != 2) {
                            return;
                        }
                        if (serviceConnectionC4538r.f19577d.isEmpty()) {
                            serviceConnectionC4538r.m18928f();
                            return;
                        } else {
                            abstractC4541u = (AbstractC4541u) serviceConnectionC4538r.f19577d.poll();
                            serviceConnectionC4538r.f19578e.put(abstractC4541u.f19582a, abstractC4541u);
                            C4544x.m18937e(serviceConnectionC4538r.f19579f).schedule(new Runnable() { // from class: h4.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC4538r.this.m18927e(abstractC4541u.f19582a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(abstractC4541u);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context m18935a = C4544x.m18935a(serviceConnectionC4538r.f19579f);
                    Messenger messenger = serviceConnectionC4538r.f19575b;
                    Message obtain = Message.obtain();
                    obtain.what = abstractC4541u.f19584c;
                    obtain.arg1 = abstractC4541u.f19582a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC4541u.mo18932b());
                    bundle.putString("pkg", m18935a.getPackageName());
                    bundle.putBundle("data", abstractC4541u.f19585d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC4538r.f19576c.m18930a(obtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC4538r.m18923a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m18926d() {
        if (this.f19574a == 1) {
            m18923a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m18927e(int i10) {
        AbstractC4541u abstractC4541u = (AbstractC4541u) this.f19578e.get(i10);
        if (abstractC4541u != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f19578e.remove(i10);
            abstractC4541u.m18933c(new C4542v(3, "Timed out waiting for response", null));
            m18928f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m18928f() {
        if (this.f19574a == 2 && this.f19577d.isEmpty() && this.f19578e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f19574a = 3;
            C5915b.m23917b().m23923c(C4544x.m18935a(this.f19579f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m18929g(AbstractC4541u abstractC4541u) {
        boolean z10;
        int i10 = this.f19574a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                this.f19577d.add(abstractC4541u);
                m18925c();
                return true;
            }
            this.f19577d.add(abstractC4541u);
            return true;
        }
        this.f19577d.add(abstractC4541u);
        if (this.f19574a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21786l(z10);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f19574a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C5915b.m23917b().m23922a(C4544x.m18935a(this.f19579f), intent, this, 1)) {
                m18923a(0, "Unable to bind to service");
            } else {
                C4544x.m18937e(this.f19579f).schedule(new Runnable() { // from class: h4.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC4538r.this.m18926d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e10) {
            m18924b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        C4544x.m18937e(this.f19579f).execute(new Runnable() { // from class: h4.o
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4538r serviceConnectionC4538r = ServiceConnectionC4538r.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC4538r) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC4538r.m18923a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC4538r.f19576c = new C4539s(iBinder2);
                            serviceConnectionC4538r.f19574a = 2;
                            serviceConnectionC4538r.m18925c();
                        } catch (RemoteException e10) {
                            serviceConnectionC4538r.m18923a(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        C4544x.m18937e(this.f19579f).execute(new Runnable() { // from class: h4.l
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4538r.this.m18923a(2, "Service disconnected");
            }
        });
    }
}
