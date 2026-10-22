package p126f4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.lzy.okgo.model.Progress;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.message.MessageService;
import p172i4.AbstractC4884q;
import p172i4.C4870j;
import p172i4.C4872k;
import p172i4.ServiceConnectionC4852a;
import p219l4.AbstractC5391n;
import p259o4.C5915b;
import p350u4.AbstractBinderC7036e;
import p350u4.InterfaceC7037f;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public class C4225a {

    /* renamed from: a */
    ServiceConnectionC4852a f18512a;

    /* renamed from: b */
    InterfaceC7037f f18513b;

    /* renamed from: c */
    boolean f18514c;

    /* renamed from: d */
    final Object f18515d = new Object();

    /* renamed from: e */
    C4227c f18516e;

    /* renamed from: f */
    private final Context f18517f;

    /* renamed from: g */
    final long f18518g;

    /* renamed from: f4.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f18519a;

        /* renamed from: b */
        private final boolean f18520b;

        public a(String str, boolean z10) {
            this.f18519a = str;
            this.f18520b = z10;
        }

        /* renamed from: a */
        public String m17686a() {
            return this.f18519a;
        }

        /* renamed from: b */
        public boolean m17687b() {
            return this.f18520b;
        }

        public String toString() {
            String str = this.f18519a;
            boolean z10 = this.f18520b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public C4225a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        AbstractC5391n.m21783i(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f18517f = context;
        this.f18514c = false;
        this.f18518g = j10;
    }

    /* renamed from: a */
    public static a m17679a(Context context) {
        C4225a c4225a = new C4225a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4225a.m17684d(false);
            a m17681f = c4225a.m17681f(-1);
            c4225a.m17685e(m17681f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m17681f;
        } finally {
        }
    }

    /* renamed from: b */
    public static void m17680b(boolean z10) {
    }

    /* renamed from: f */
    private final a m17681f(int i10) {
        a aVar;
        AbstractC5391n.m21782h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f18514c) {
                synchronized (this.f18515d) {
                    C4227c c4227c = this.f18516e;
                    if (c4227c == null || !c4227c.f18525d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m17684d(false);
                    if (!this.f18514c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            AbstractC5391n.m21783i(this.f18512a);
            AbstractC5391n.m21783i(this.f18513b);
            try {
                aVar = new a(this.f18513b.mo27135f(), this.f18513b.mo27136q(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        m17682g();
        return aVar;
    }

    /* renamed from: g */
    private final void m17682g() {
        synchronized (this.f18515d) {
            C4227c c4227c = this.f18516e;
            if (c4227c != null) {
                c4227c.f18524c.countDown();
                try {
                    this.f18516e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f18518g;
            if (j10 > 0) {
                this.f18516e = new C4227c(this, j10);
            }
        }
    }

    /* renamed from: c */
    public final void m17683c() {
        AbstractC5391n.m21782h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f18517f != null && this.f18512a != null) {
                try {
                    if (this.f18514c) {
                        C5915b.m23917b().m23923c(this.f18517f, this.f18512a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f18514c = false;
                this.f18513b = null;
                this.f18512a = null;
            }
        }
    }

    /* renamed from: d */
    protected final void m17684d(boolean z10) {
        AbstractC5391n.m21782h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f18514c) {
                m17683c();
            }
            Context context = this.f18517f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo20046h = C4870j.m20060f().mo20046h(context, AbstractC4884q.f20380a);
                if (mo20046h != 0 && mo20046h != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC4852a serviceConnectionC4852a = new ServiceConnectionC4852a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (C5915b.m23917b().m23922a(context, intent, serviceConnectionC4852a, 1)) {
                        this.f18512a = serviceConnectionC4852a;
                        try {
                            this.f18513b = AbstractBinderC7036e.m27137a(serviceConnectionC4852a.m20014a(10000L, TimeUnit.MILLISECONDS));
                            this.f18514c = true;
                            if (z10) {
                                m17682g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new C4872k(9);
            }
        }
    }

    /* renamed from: e */
    final boolean m17685e(a aVar, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (aVar != null) {
                if (true != aVar.m17687b()) {
                    str2 = MessageService.MSG_DB_READY_REPORT;
                }
                hashMap.put("limit_ad_tracking", str2);
                String m17686a = aVar.m17686a();
                if (m17686a != null) {
                    hashMap.put("ad_id_size", Integer.toString(m17686a.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put(Progress.TAG, "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new C4226b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() {
        m17683c();
        super.finalize();
    }
}
