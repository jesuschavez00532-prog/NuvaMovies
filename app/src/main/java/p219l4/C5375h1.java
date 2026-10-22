package p219l4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l4.h1 */
/* loaded from: classes.dex */
public final class C5375h1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C5378i1 f21989a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5375h1(C5378i1 c5378i1, AbstractC5372g1 abstractC5372g1) {
        this.f21989a = c5378i1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f21989a.f21995f;
            synchronized (hashMap) {
                C5363d1 c5363d1 = (C5363d1) message.obj;
                hashMap2 = this.f21989a.f21995f;
                ServiceConnectionC5369f1 serviceConnectionC5369f1 = (ServiceConnectionC5369f1) hashMap2.get(c5363d1);
                if (serviceConnectionC5369f1 != null && serviceConnectionC5369f1.m21736i()) {
                    if (serviceConnectionC5369f1.m21737j()) {
                        serviceConnectionC5369f1.m21734g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f21989a.f21995f;
                    hashMap3.remove(c5363d1);
                }
            }
            return true;
        }
        if (i10 == 1) {
            hashMap4 = this.f21989a.f21995f;
            synchronized (hashMap4) {
                C5363d1 c5363d12 = (C5363d1) message.obj;
                hashMap5 = this.f21989a.f21995f;
                ServiceConnectionC5369f1 serviceConnectionC5369f12 = (ServiceConnectionC5369f1) hashMap5.get(c5363d12);
                if (serviceConnectionC5369f12 != null && serviceConnectionC5369f12.m21728a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c5363d12), new Exception());
                    ComponentName m21729b = serviceConnectionC5369f12.m21729b();
                    if (m21729b == null) {
                        m21729b = c5363d12.m21714b();
                    }
                    if (m21729b == null) {
                        String m21716d = c5363d12.m21716d();
                        AbstractC5391n.m21783i(m21716d);
                        m21729b = new ComponentName(m21716d, "unknown");
                    }
                    serviceConnectionC5369f12.onServiceDisconnected(m21729b);
                }
            }
            return true;
        }
        return false;
    }
}
