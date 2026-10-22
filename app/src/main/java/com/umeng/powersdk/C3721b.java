package com.umeng.powersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lzy.okgo.model.Progress;

/* renamed from: com.umeng.powersdk.b */
/* loaded from: classes3.dex */
public final class C3721b {

    /* renamed from: a */
    private static Context f16741a;

    /* renamed from: com.umeng.powersdk.b$a */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a */
        private static final C3721b f16742a = new C3721b(0);
    }

    private C3721b() {
    }

    /* synthetic */ C3721b(byte b10) {
        this();
    }

    /* renamed from: a */
    public final synchronized C3720a m15882a() {
        C3720a c3720a;
        C3720a c3720a2 = null;
        try {
            Intent registerReceiver = f16741a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i10 = 0;
            int intExtra = registerReceiver.getIntExtra("level", 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra(Progress.STATUS, 0);
            int i11 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i11 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i11 = 0;
                } else if (intExtra4 == 5) {
                    i11 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i10 = 1;
            } else if (intExtra5 == 2) {
                i10 = 2;
            }
            c3720a = new C3720a();
            try {
                c3720a.f16735a = intExtra;
                c3720a.f16736b = intExtra2;
                c3720a.f16738d = i11;
                c3720a.f16737c = intExtra3;
                c3720a.f16739e = i10;
                c3720a.f16740f = System.currentTimeMillis();
            } catch (Throwable unused) {
                c3720a2 = c3720a;
                c3720a = c3720a2;
                return c3720a;
            }
        } catch (Throwable unused2) {
        }
        return c3720a;
    }

    /* renamed from: a */
    public static C3721b m15881a(Context context) {
        if (f16741a == null && context != null) {
            f16741a = context.getApplicationContext();
        }
        return a.f16742a;
    }
}
