package p219l4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p259o4.C5915b;
import p394x4.HandlerC7497e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l4.i1 */
/* loaded from: classes.dex */
public final class C5378i1 extends AbstractC5373h {

    /* renamed from: f */
    private final HashMap f21995f = new HashMap();

    /* renamed from: g */
    private final Context f21996g;

    /* renamed from: h */
    private volatile Handler f21997h;

    /* renamed from: i */
    private final C5375h1 f21998i;

    /* renamed from: j */
    private final C5915b f21999j;

    /* renamed from: k */
    private final long f22000k;

    /* renamed from: l */
    private final long f22001l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5378i1(Context context, Looper looper) {
        C5375h1 c5375h1 = new C5375h1(this, null);
        this.f21998i = c5375h1;
        this.f21996g = context.getApplicationContext();
        this.f21997h = new HandlerC7497e(looper, c5375h1);
        this.f21999j = C5915b.m23917b();
        this.f22000k = 5000L;
        this.f22001l = 300000L;
    }

    @Override // p219l4.AbstractC5373h
    /* renamed from: d */
    protected final void mo21743d(C5363d1 c5363d1, ServiceConnection serviceConnection, String str) {
        AbstractC5391n.m21784j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21995f) {
            ServiceConnectionC5369f1 serviceConnectionC5369f1 = (ServiceConnectionC5369f1) this.f21995f.get(c5363d1);
            if (serviceConnectionC5369f1 != null) {
                if (serviceConnectionC5369f1.m21735h(serviceConnection)) {
                    serviceConnectionC5369f1.m21733f(serviceConnection, str);
                    if (serviceConnectionC5369f1.m21736i()) {
                        this.f21997h.sendMessageDelayed(this.f21997h.obtainMessage(0, c5363d1), this.f22000k);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c5363d1.toString());
                }
            } else {
                throw new IllegalStateException("Nonexistent connection status for service config: " + c5363d1.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5373h
    /* renamed from: f */
    public final boolean mo21745f(C5363d1 c5363d1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m21737j;
        AbstractC5391n.m21784j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21995f) {
            ServiceConnectionC5369f1 serviceConnectionC5369f1 = (ServiceConnectionC5369f1) this.f21995f.get(c5363d1);
            if (serviceConnectionC5369f1 == null) {
                serviceConnectionC5369f1 = new ServiceConnectionC5369f1(this, c5363d1);
                serviceConnectionC5369f1.m21731d(serviceConnection, serviceConnection, str);
                serviceConnectionC5369f1.m21732e(str, executor);
                this.f21995f.put(c5363d1, serviceConnectionC5369f1);
            } else {
                this.f21997h.removeMessages(0, c5363d1);
                if (!serviceConnectionC5369f1.m21735h(serviceConnection)) {
                    serviceConnectionC5369f1.m21731d(serviceConnection, serviceConnection, str);
                    int m21728a = serviceConnectionC5369f1.m21728a();
                    if (m21728a != 1) {
                        if (m21728a == 2) {
                            serviceConnectionC5369f1.m21732e(str, executor);
                        }
                    } else {
                        serviceConnection.onServiceConnected(serviceConnectionC5369f1.m21729b(), serviceConnectionC5369f1.m21730c());
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c5363d1.toString());
                }
            }
            m21737j = serviceConnectionC5369f1.m21737j();
        }
        return m21737j;
    }
}
