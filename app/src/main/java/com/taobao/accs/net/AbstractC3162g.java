package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3207t;

/* renamed from: com.taobao.accs.net.g */
/* loaded from: classes.dex */
public abstract class AbstractC3162g {

    /* renamed from: b */
    protected static volatile AbstractC3162g f13004b;

    /* renamed from: c */
    private static final int[] f13005c = {270, 360, 480};

    /* renamed from: a */
    protected Context f13006a;

    /* renamed from: d */
    private int f13007d;

    /* renamed from: e */
    private long f13008e;

    /* renamed from: f */
    private boolean f13009f = false;

    /* renamed from: g */
    private int[] f13010g = {0, 0, 0};

    /* renamed from: h */
    private boolean f13011h;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3162g(Context context) {
        this.f13011h = true;
        try {
            this.f13006a = context;
            this.f13007d = 0;
            this.f13008e = System.currentTimeMillis();
            this.f13011h = C3207t.m13036a();
        } catch (Throwable th) {
            ALog.m12939e("HeartbeatManager", "HeartbeatManager", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static AbstractC3162g m12870a(Context context) {
        if (f13004b == null) {
            synchronized (AbstractC3162g.class) {
                if (f13004b == null) {
                    if (GlobalConfig.isJobHeartbeatEnable() && Build.VERSION.SDK_INT >= 21 && m12871b(context)) {
                        ALog.m12941i("HeartbeatManager", "hb use job", new Object[0]);
                        f13004b = new C3161f(context);
                    } else {
                        ALog.m12941i("HeartbeatManager", "hb use alarm", new Object[0]);
                        f13004b = new C3160e(context);
                    }
                }
            }
        }
        return f13004b;
    }

    /* renamed from: b */
    private static boolean m12871b(Context context) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0);
            if (serviceInfo != null) {
                return serviceInfo.isEnabled();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    protected abstract void mo12869a(int i10);

    /* renamed from: c */
    public void m12874c() {
        int i10;
        this.f13008e = -1L;
        if (this.f13009f) {
            int[] iArr = this.f13010g;
            int i11 = this.f13007d;
            iArr[i11] = iArr[i11] + 1;
        }
        int i12 = this.f13007d;
        if (i12 > 0) {
            i10 = i12 - 1;
        } else {
            i10 = 0;
        }
        this.f13007d = i10;
        ALog.m12938d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    /* renamed from: d */
    public void m12875d() {
        this.f13008e = -1L;
        ALog.m12938d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    /* renamed from: e */
    public void m12876e() {
        ALog.m12938d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f13008e > 7199000) {
            int i10 = this.f13007d;
            if (i10 < f13005c.length - 1 && this.f13010g[i10] <= 2) {
                ALog.m12938d("HeartbeatManager", "upgrade", new Object[0]);
                this.f13007d++;
                this.f13009f = true;
                this.f13008e = System.currentTimeMillis();
                return;
            }
            return;
        }
        this.f13009f = false;
        this.f13010g[this.f13007d] = 0;
    }

    /* renamed from: f */
    public void m12877f() {
        this.f13007d = 0;
        this.f13008e = System.currentTimeMillis();
        ALog.m12938d("HeartbeatManager", "resetLevel", new Object[0]);
    }

    /* renamed from: b */
    public int m12873b() {
        int i10 = this.f13011h ? f13005c[this.f13007d] : 270;
        this.f13011h = C3207t.m13036a();
        return i10;
    }

    /* renamed from: a */
    public synchronized void m12872a() {
        try {
            if (this.f13008e < 0) {
                this.f13008e = System.currentTimeMillis();
            }
            int m12873b = m12873b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d("HeartbeatManager", "set " + m12873b, new Object[0]);
            }
            mo12869a(m12873b);
        } catch (Throwable th) {
            ALog.m12939e("HeartbeatManager", "set", th, new Object[0]);
        }
    }
}
