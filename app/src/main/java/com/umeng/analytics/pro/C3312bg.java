package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.InterfaceC3278a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.bg */
/* loaded from: classes3.dex */
public class C3312bg implements InterfaceC3310be {

    /* renamed from: a */
    private static final String f14124a = "Coolpad";

    /* renamed from: b */
    private static final String f14125b = "com.coolpad.deviceidsupport";

    /* renamed from: c */
    private static final String f14126c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* renamed from: d */
    private static InterfaceC3278a f14127d;

    /* renamed from: f */
    private CountDownLatch f14129f;

    /* renamed from: g */
    private Context f14130g;

    /* renamed from: e */
    private String f14128e = "";

    /* renamed from: h */
    private final ServiceConnection f14131h = new ServiceConnection() { // from class: com.umeng.analytics.pro.bg.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                InterfaceC3278a unused = C3312bg.f14127d = InterfaceC3278a.b.m13707a(iBinder);
                C3312bg.this.f14128e = C3312bg.f14127d.mo13703b(C3312bg.this.f14130g.getPackageName());
                Log.d(C3312bg.f14124a, "onServiceConnected: oaid = " + C3312bg.this.f14128e);
            } catch (RemoteException | NullPointerException e10) {
                Log.e(C3312bg.f14124a, "onServiceConnected failed e=" + e10.getMessage());
            }
            C3312bg.this.f14129f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(C3312bg.f14124a, "onServiceDisconnected");
            InterfaceC3278a unused = C3312bg.f14127d = null;
        }
    };

    /* renamed from: b */
    private void m13875b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(f14125b, f14126c));
            if (context.bindService(intent, this.f14131h, 1)) {
                return;
            }
            Log.e(f14124a, "bindService return false");
        } catch (Throwable th) {
            Log.e(f14124a, "bindService failed. e=" + th.getMessage());
            this.f14129f.countDown();
        }
    }

    /* renamed from: c */
    private void m13877c(Context context) {
        try {
            Log.d(f14124a, "call unbindService.");
            context.unbindService(this.f14131h);
        } catch (Throwable th) {
            Log.e(f14124a, "unbindService failed. e=" + th.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        this.f14130g = context.getApplicationContext();
        this.f14129f = new CountDownLatch(1);
        try {
            m13875b(context);
            if (!this.f14129f.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(f14124a, "getOAID time-out");
            }
            return this.f14128e;
        } catch (InterruptedException e10) {
            Log.e(f14124a, "getOAID interrupted. e=" + e10.getMessage());
            return null;
        } finally {
            m13877c(context);
        }
    }
}
