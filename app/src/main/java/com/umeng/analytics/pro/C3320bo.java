package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.umeng.analytics.pro.InterfaceC3359d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.bo */
/* loaded from: classes3.dex */
public class C3320bo implements InterfaceC3310be {

    /* renamed from: com.umeng.analytics.pro.bo$a */
    /* loaded from: classes3.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f14150a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f14151b;

        /* renamed from: a */
        public IBinder m13886a() {
            if (!this.f14150a) {
                this.f14150a = true;
                return this.f14151b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f14151b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.f14150a = false;
            this.f14151b = new LinkedBlockingQueue<>();
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        a aVar = new a();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return InterfaceC3359d.b.m14181a(aVar.m13886a()).mo14178a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
