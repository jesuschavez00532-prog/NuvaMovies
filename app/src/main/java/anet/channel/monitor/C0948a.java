package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.monitor.a */
/* loaded from: classes.dex */
public class C0948a {

    /* renamed from: a */
    private static volatile C0948a f3918a;

    /* renamed from: b */
    private Map<INetworkQualityChangeListener, C0953f> f3919b = new ConcurrentHashMap();

    /* renamed from: c */
    private C0953f f3920c = new C0953f();

    private C0948a() {
    }

    /* renamed from: a */
    public static C0948a m4585a() {
        if (f3918a == null) {
            synchronized (C0948a.class) {
                if (f3918a == null) {
                    f3918a = new C0948a();
                }
            }
        }
        return f3918a;
    }

    /* renamed from: a */
    public void m4588a(INetworkQualityChangeListener iNetworkQualityChangeListener, C0953f c0953f) {
        if (iNetworkQualityChangeListener == null) {
            ALog.m4787e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
            return;
        }
        if (c0953f == null) {
            this.f3920c.f3953b = System.currentTimeMillis();
            this.f3919b.put(iNetworkQualityChangeListener, this.f3920c);
        } else {
            c0953f.f3953b = System.currentTimeMillis();
            this.f3919b.put(iNetworkQualityChangeListener, c0953f);
        }
    }

    /* renamed from: a */
    public void m4587a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f3919b.remove(iNetworkQualityChangeListener);
    }

    /* renamed from: a */
    public void m4586a(double d10) {
        boolean m4603a;
        for (Map.Entry<INetworkQualityChangeListener, C0953f> entry : this.f3919b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            C0953f value = entry.getValue();
            if (key != null && value != null && !value.m4604b() && value.f3952a != (m4603a = value.m4603a(d10))) {
                value.f3952a = m4603a;
                key.onNetworkQualityChanged(m4603a ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }
}
