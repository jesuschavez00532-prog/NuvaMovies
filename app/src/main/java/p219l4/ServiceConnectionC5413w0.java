package p219l4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: l4.w0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC5413w0 implements ServiceConnection {

    /* renamed from: a */
    private final int f22048a;

    /* renamed from: b */
    final /* synthetic */ AbstractC5358c f22049b;

    public ServiceConnectionC5413w0(AbstractC5358c abstractC5358c, int i10) {
        this.f22049b = abstractC5358c;
        this.f22048a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC5382k c5389m0;
        AbstractC5358c abstractC5358c = this.f22049b;
        if (iBinder != null) {
            obj = abstractC5358c.f21909n;
            synchronized (obj) {
                AbstractC5358c abstractC5358c2 = this.f22049b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5382k)) {
                    c5389m0 = (InterfaceC5382k) queryLocalInterface;
                } else {
                    c5389m0 = new C5389m0(iBinder);
                }
                abstractC5358c2.f21910o = c5389m0;
            }
            this.f22049b.m21681d0(0, null, this.f22048a);
            return;
        }
        AbstractC5358c.m21656c0(abstractC5358c, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f22049b.f21909n;
        synchronized (obj) {
            this.f22049b.f21910o = null;
        }
        Handler handler = this.f22049b.f21907l;
        handler.sendMessage(handler.obtainMessage(6, this.f22048a, 1));
    }
}
