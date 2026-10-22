package com.umeng.powersdk;

import android.app.Activity;
import android.os.BatteryManager;
import android.os.Build;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.umeng.powersdk.c */
/* loaded from: classes3.dex */
public final class C3722c {

    /* renamed from: a */
    int f16743a;

    /* renamed from: b */
    int f16744b;

    /* renamed from: c */
    int f16745c;

    /* renamed from: d */
    WeakReference<Activity> f16746d;

    /* renamed from: e */
    boolean f16747e;

    /* renamed from: f */
    int f16748f;

    /* renamed from: g */
    boolean f16749g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.powersdk.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3722c f16759a = new C3722c(0);
    }

    private C3722c() {
        this.f16743a = 1;
        this.f16744b = 0;
        this.f16745c = 0;
        this.f16747e = true;
    }

    /* renamed from: a */
    final JSONObject m15884a() {
        BatteryManager batteryManager;
        long longProperty;
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 21 && (batteryManager = (BatteryManager) PowerManager.getApplicationContext().getSystemService("batterymanager")) != null) {
                longProperty = batteryManager.getLongProperty(2);
                float f10 = (float) longProperty;
                if (f10 >= 10000.0f || f10 <= -10000.0f) {
                    f10 /= 1000.0f;
                }
                jSONObject.put("ci", Math.abs(f10));
            }
        } catch (Throwable unused) {
        }
        try {
            C3720a m15882a = C3721b.m15881a(PowerManager.getApplicationContext()).m15882a();
            jSONObject.put("le", m15882a.f16735a);
            jSONObject.put("vo", m15882a.f16736b);
            jSONObject.put("te", m15882a.f16737c);
            jSONObject.put("st", m15882a.f16738d);
            jSONObject.put("ch", m15882a.f16739e);
            jSONObject.put("ts", m15882a.f16740f);
            try {
                long longValue = ((Long) GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap().get("stime")).longValue();
                if (longValue > 0) {
                    jSONObject.put("ptime", System.currentTimeMillis() - longValue);
                }
            } catch (Throwable unused2) {
            }
            WeakReference<Activity> weakReference = this.f16746d;
            if (weakReference != null) {
                jSONObject.put("c_act", weakReference.get().getClass().getName());
            }
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }

    /* synthetic */ C3722c(byte b10) {
        this();
    }
}
