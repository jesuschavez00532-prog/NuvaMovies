package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import com.umeng.analytics.pro.InterfaceC3305b;
import com.umeng.analytics.pro.InterfaceC3332c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.bi */
/* loaded from: classes3.dex */
class C3314bi implements InterfaceC3310be {

    /* renamed from: a */
    private static String f14133a = "";

    /* renamed from: com.umeng.analytics.pro.bi$a */
    /* loaded from: classes3.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f14134a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f14135b;

        /* renamed from: a */
        public IBinder m13882a() {
            if (!this.f14134a) {
                this.f14134a = true;
                return this.f14135b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f14135b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.f14134a = false;
            this.f14135b = new LinkedBlockingQueue<>();
        }
    }

    /* renamed from: com.umeng.analytics.pro.bi$b */
    /* loaded from: classes3.dex */
    private static final class b extends InterfaceC3305b.b {
        @Override // com.umeng.analytics.pro.InterfaceC3305b
        /* renamed from: a */
        public void mo13826a(int i10, long j10, boolean z10, float f10, double d10, String str) {
        }

        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3305b
        /* renamed from: a */
        public void mo13827a(int i10, Bundle bundle) {
            if (i10 != 0 || bundle == null) {
                return;
            }
            String string = bundle.getString(c.f14137b);
            if (C3314bi.m13881c(string)) {
                String unused = C3314bi.f14133a = string;
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.bi$c */
    /* loaded from: classes3.dex */
    interface c {

        /* renamed from: a */
        public static final int f14136a = 0;

        /* renamed from: b */
        public static final String f14137b = "oa_id_flag";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m13881c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("00000000-0000-0000-0000-000000000000")) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!Boolean.parseBoolean(Settings.Secure.getString(context.getContentResolver(), "oaid_limit_state"))) {
                String string = Settings.Global.getString(context.getContentResolver(), "oaid");
                if (m13881c(string)) {
                    f14133a = string;
                    return string;
                }
            }
        } catch (Throwable unused) {
        }
        a aVar = new a();
        Intent intent = new Intent();
        intent.setAction("com.hihonor.id.HnOaIdService");
        intent.setPackage("com.hihonor.id");
        if (context.bindService(intent, aVar, 1)) {
            try {
                InterfaceC3332c.b.m14010a(aVar.m13882a()).mo14007a(new b());
                return f14133a;
            } catch (Exception unused2) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
