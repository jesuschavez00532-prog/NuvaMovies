package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class LaunchConfigManager {

    /* renamed from: a */
    private final String f7238a = "LaunchConfigManager";

    /* renamed from: b */
    private final int f7239b = 0;

    /* renamed from: c */
    private EfsReporter f7240c;

    /* renamed from: d */
    private int f7241d;

    /* renamed from: e */
    private int f7242e;

    /* renamed from: f */
    private boolean f7243f;

    /* renamed from: g */
    private Context f7244g;

    public LaunchConfigManager(Context context, EfsReporter efsReporter) {
        boolean z10;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.f7241d = 100;
        this.f7243f = false;
        Context applicationContext = context.getApplicationContext();
        this.f7244g = applicationContext;
        this.f7240c = efsReporter;
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences2 != null) {
            this.f7242e = sharedPreferences2.getInt("apm_startperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences3 = this.f7244g.getSharedPreferences("efs_launch", 0);
        int i10 = sharedPreferences3 != null ? sharedPreferences3.getInt("apm_startperf_sampling_rate", -1) : -1;
        this.f7240c.getAllSdkConfig(new String[]{"apm_startperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.launch.LaunchConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences sharedPreferences4;
                SharedPreferences.Editor edit6;
                try {
                    Object obj = map.get("apm_startperf_sampling_rate");
                    if (obj == null || (sharedPreferences4 = LaunchConfigManager.this.f7244g.getSharedPreferences("efs_launch", 0)) == null || (edit6 = sharedPreferences4.edit()) == null) {
                        return;
                    }
                    edit6.putInt("apm_startperf_sampling_rate", Integer.parseInt(obj.toString()));
                    edit6.commit();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i10 != -1) {
            this.f7241d = i10;
        }
        SharedPreferences sharedPreferences4 = this.f7244g.getSharedPreferences("efs_launch", 0);
        long j10 = sharedPreferences4 != null ? sharedPreferences4.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
        boolean z11 = sharedPreferences4 != null ? sharedPreferences4.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
        if (this.f7241d != 0) {
            z10 = true;
            if (!SamplingWhiteListUtil.isHitWL()) {
                boolean z12 = this.f7241d != this.f7242e;
                Long valueOf = Long.valueOf(j10);
                int i11 = this.f7241d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z11 || valueOf3.longValue() >= 86400000 || z12) {
                    if (valueOf3.longValue() >= 86400000 || z12) {
                        if (!(i11 != 0 && (i11 == 100 || new Random().nextInt(100) <= i11))) {
                            if (LaunchManager.isDebug) {
                                Log.d("LaunchConfigManager", "random not check in!");
                            }
                            z10 = false;
                        } else if (LaunchManager.isDebug) {
                            Log.d("LaunchConfigManager", "random check in");
                        }
                        SharedPreferences sharedPreferences5 = this.f7244g.getSharedPreferences("efs_launch", 0);
                        if (sharedPreferences5 != null && (edit2 = sharedPreferences5.edit()) != null) {
                            edit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z10);
                            edit2.commit();
                        }
                        if (sharedPreferences5 != null && (edit = sharedPreferences5.edit()) != null) {
                            edit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit.commit();
                        }
                    } else if (LaunchManager.isDebug) {
                        Log.d("LaunchConfigManager", "un repeat check in 24 hour!");
                    }
                } else if (LaunchManager.isDebug) {
                    Log.d("LaunchConfigManager", " check in allready");
                }
            }
            this.f7243f = z10;
            sharedPreferences = this.f7244g.getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null || (edit3 = sharedPreferences.edit()) == null) {
            }
            edit3.putInt("apm_startperf_sampling_rate_last", this.f7241d);
            edit3.commit();
            return;
        }
        if (z11 && sharedPreferences4 != null && (edit5 = sharedPreferences4.edit()) != null) {
            edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
            edit5.commit();
        }
        if (j10 != 0 && sharedPreferences4 != null && (edit4 = sharedPreferences4.edit()) != null) {
            edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
            edit4.commit();
        }
        z10 = false;
        this.f7243f = z10;
        sharedPreferences = this.f7244g.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences != null) {
        }
    }

    public boolean enableTracer() {
        return this.f7243f;
    }
}
