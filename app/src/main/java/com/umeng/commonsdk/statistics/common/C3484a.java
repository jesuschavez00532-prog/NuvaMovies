package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.umeng.commonsdk.utils.C3518b;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.statistics.common.a */
/* loaded from: classes3.dex */
public class C3484a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f15419a;

        /* renamed from: b */
        private final boolean f15420b;

        a(String str, boolean z10) {
            this.f15419a = str;
            this.f15420b = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public String m14823b() {
            return this.f15419a;
        }

        /* renamed from: a */
        public boolean m14824a() {
            return this.f15420b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a */
        boolean f15421a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f15422b;

        private b() {
            this.f15421a = false;
            this.f15422b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder m14825a() {
            if (!this.f15421a) {
                this.f15421a = true;
                return this.f15422b.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f15422b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m14819a(Context context) {
        try {
            a m14821c = m14821c(context);
            if (m14821c != null && !m14821c.m14824a()) {
                return m14821c.m14823b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m14820b(Context context) {
        try {
            a m14821c = m14821c(context);
            if (m14821c == null) {
                return null;
            }
            return m14821c.m14823b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static a m14821c(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() || C3518b.m15116a().m15117a(context, "com.android.vending", 0) == null) {
            return null;
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.m14825a());
                    boolean m14827a = cVar.m14827a(true);
                    String str = "";
                    if (!m14827a) {
                        str = cVar.m14826a();
                    }
                    return new a(str, m14827a);
                } catch (Exception e10) {
                    throw e10;
                }
            }
            throw new IOException("Google Play connection failed");
        } finally {
            context.unbindService(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$c */
    /* loaded from: classes3.dex */
    public static final class c implements IInterface {

        /* renamed from: a */
        private IBinder f15423a;

        public c(IBinder iBinder) {
            this.f15423a = iBinder;
        }

        /* renamed from: a */
        public String m14826a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f15423a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f15423a;
        }

        /* renamed from: a */
        public boolean m14827a(boolean z10) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z10 ? 1 : 0);
                this.f15423a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
