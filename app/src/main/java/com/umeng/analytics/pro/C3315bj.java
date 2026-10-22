package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.bj */
/* loaded from: classes3.dex */
class C3315bj implements InterfaceC3310be {

    /* renamed from: a */
    private static final String f14138a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b */
    private static final int f14139b = 1;

    /* renamed from: c */
    private static final int f14140c = 2;

    /* renamed from: com.umeng.analytics.pro.bj$a */
    /* loaded from: classes3.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f14141a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f14142b;

        /* renamed from: a */
        public IBinder m13883a() {
            if (!this.f14141a) {
                this.f14141a = true;
                return this.f14142b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f14142b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.f14141a = false;
            this.f14142b = new LinkedBlockingQueue<>();
        }
    }

    /* renamed from: com.umeng.analytics.pro.bj$b */
    /* loaded from: classes3.dex */
    private static final class b implements IInterface {

        /* renamed from: a */
        private IBinder f14143a;

        public b(IBinder iBinder) {
            this.f14143a = iBinder;
        }

        /* renamed from: a */
        public String m13884a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3315bj.f14138a);
                this.f14143a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f14143a;
        }

        /* renamed from: b */
        public boolean m13885b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3315bj.f14138a);
                boolean z10 = false;
                this.f14143a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z10 = true;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.m13883a()).m13884a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
