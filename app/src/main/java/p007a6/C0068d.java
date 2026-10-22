package p007a6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lzy.okgo.model.Progress;
import p395x5.C7503f;

/* renamed from: a6.d */
/* loaded from: classes.dex */
class C0068d {

    /* renamed from: a */
    private final Float f196a;

    /* renamed from: b */
    private final boolean f197b;

    private C0068d(Float f10, boolean z10) {
        this.f197b = z10;
        this.f196a = f10;
    }

    /* renamed from: a */
    public static C0068d m230a(Context context) {
        boolean z10 = false;
        Float f10 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = m232e(registerReceiver);
                f10 = m231d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            C7503f.m28716f().m28720e("An error occurred getting battery state.", e10);
        }
        return new C0068d(f10, z10);
    }

    /* renamed from: d */
    private static Float m231d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m232e(Intent intent) {
        int intExtra = intent.getIntExtra(Progress.STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Float m233b() {
        return this.f196a;
    }

    /* renamed from: c */
    public int m234c() {
        Float f10;
        if (this.f197b && (f10 = this.f196a) != null) {
            if (f10.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
