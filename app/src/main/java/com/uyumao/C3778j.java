package com.uyumao;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lzy.okgo.model.Progress;

/* renamed from: com.uyumao.j */
/* loaded from: classes3.dex */
public class C3778j {

    /* renamed from: a */
    public static Context f16966a;

    /* renamed from: com.uyumao.j$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public static final C3778j f16967a = new C3778j();
    }

    /* renamed from: a */
    public synchronized C3777i m16026a() {
        C3777i c3777i;
        c3777i = null;
        try {
            Intent registerReceiver = f16966a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i10 = 0;
            int intExtra = registerReceiver.getIntExtra("level", 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra(Progress.STATUS, 0);
            int i11 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 != 2) {
                    if (intExtra4 != 3 && intExtra4 != 4) {
                        if (intExtra4 == 5) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 0;
                    }
                } else {
                    i11 = 1;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 != 1) {
                if (intExtra5 == 2) {
                    i10 = 2;
                }
            } else {
                i10 = 1;
            }
            C3777i c3777i2 = new C3777i();
            try {
                c3777i2.f16960a = intExtra;
                c3777i2.f16961b = intExtra2;
                c3777i2.f16963d = i11;
                c3777i2.f16962c = intExtra3;
                c3777i2.f16964e = i10;
                c3777i2.f16965f = System.currentTimeMillis();
            } catch (Throwable unused) {
            }
            c3777i = c3777i2;
        } catch (Throwable unused2) {
        }
        return c3777i;
    }
}
