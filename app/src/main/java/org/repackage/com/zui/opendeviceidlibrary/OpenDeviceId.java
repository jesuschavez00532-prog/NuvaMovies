package org.repackage.com.zui.opendeviceidlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import org.repackage.com.zui.deviceidservice.IDeviceidInterface;

/* loaded from: classes3.dex */
public class OpenDeviceId {

    /* renamed from: c */
    private static String f23983c = "OpenDeviceId library";

    /* renamed from: d */
    private static boolean f23984d;

    /* renamed from: b */
    private IDeviceidInterface f23986b;

    /* renamed from: e */
    private ServiceConnection f23987e;

    /* renamed from: a */
    private Context f23985a = null;

    /* renamed from: f */
    private CallBack f23988f = null;

    /* loaded from: classes3.dex */
    public interface CallBack<T> {
        /* renamed from: a */
        void m24365a(T t10, OpenDeviceId openDeviceId);
    }

    /* renamed from: b */
    public String m24360b() {
        if (this.f23985a != null) {
            try {
                IDeviceidInterface iDeviceidInterface = this.f23986b;
                if (iDeviceidInterface != null) {
                    return iDeviceidInterface.mo24346b();
                }
                return null;
            } catch (RemoteException e10) {
                m24356b("getUDID error, RemoteException!");
                e10.printStackTrace();
                return null;
            } catch (Exception e11) {
                m24356b("getUDID error, Exception!");
                e11.printStackTrace();
                return null;
            }
        }
        m24356b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: c */
    public boolean m24361c() {
        try {
            if (this.f23986b == null) {
                return false;
            }
            m24354a("Device support opendeviceid");
            return this.f23986b.mo24348c();
        } catch (RemoteException unused) {
            m24356b("isSupport error, RemoteException!");
            return false;
        }
    }

    /* renamed from: d */
    public String m24362d() {
        Context context = this.f23985a;
        if (context != null) {
            String packageName = context.getPackageName();
            m24354a("liufeng, getVAID package：" + packageName);
            if (packageName != null && !packageName.equals("")) {
                try {
                    IDeviceidInterface iDeviceidInterface = this.f23986b;
                    if (iDeviceidInterface != null) {
                        return iDeviceidInterface.mo24345a(packageName);
                    }
                    return null;
                } catch (RemoteException e10) {
                    m24356b("getVAID error, RemoteException!");
                    e10.printStackTrace();
                    return null;
                }
            }
            m24354a("input package is null!");
            return null;
        }
        m24354a("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: e */
    public String m24363e() {
        Context context = this.f23985a;
        if (context != null) {
            String packageName = context.getPackageName();
            m24354a("liufeng, getAAID package：" + packageName);
            String str = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    IDeviceidInterface iDeviceidInterface = this.f23986b;
                    if (iDeviceidInterface == null) {
                        return null;
                    }
                    str = iDeviceidInterface.mo24347b(packageName);
                    if ((str == null || "".equals(str)) && this.f23986b.mo24349c(packageName)) {
                        return this.f23986b.mo24347b(packageName);
                    }
                    return str;
                } catch (RemoteException unused) {
                    m24356b("getAAID error, RemoteException!");
                    return str;
                }
            }
            m24354a("input package is null!");
            return null;
        }
        m24354a("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: f */
    public void m24364f() {
        try {
            this.f23985a.unbindService(this.f23987e);
            m24354a("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            m24356b("unBind Service exception");
        }
        this.f23986b = null;
    }

    /* renamed from: a */
    public int m24357a(Context context, CallBack<String> callBack) {
        if (context != null) {
            this.f23985a = context;
            this.f23988f = callBack;
            this.f23987e = new ServiceConnection() { // from class: org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId.1
                @Override // android.content.ServiceConnection
                public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    OpenDeviceId.this.f23986b = IDeviceidInterface.Stub.m24350a(iBinder);
                    if (OpenDeviceId.this.f23988f != null) {
                        OpenDeviceId.this.f23988f.m24365a("Deviceid Service Connected", OpenDeviceId.this);
                    }
                    OpenDeviceId.this.m24354a("Service onServiceConnected");
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    OpenDeviceId.this.f23986b = null;
                    OpenDeviceId.this.m24354a("Service onServiceDisconnected");
                }
            };
            Intent intent = new Intent();
            intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
            if (this.f23985a.bindService(intent, this.f23987e, 1)) {
                m24354a("bindService Successful!");
                return 1;
            }
            m24354a("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* renamed from: b */
    private void m24356b(String str) {
        if (f23984d) {
            Log.e(f23983c, str);
        }
    }

    /* renamed from: a */
    public String m24358a() {
        if (this.f23985a != null) {
            try {
                IDeviceidInterface iDeviceidInterface = this.f23986b;
                if (iDeviceidInterface != null) {
                    return iDeviceidInterface.mo24344a();
                }
                return null;
            } catch (RemoteException e10) {
                m24356b("getOAID error, RemoteException!");
                e10.printStackTrace();
                return null;
            }
        }
        m24356b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: a */
    public void m24359a(boolean z10) {
        f23984d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m24354a(String str) {
        if (f23984d) {
            Log.i(f23983c, str);
        }
    }
}
