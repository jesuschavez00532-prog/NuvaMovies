package com.umeng.powersdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public class PowerConfigManager {

    /* renamed from: b */
    private Context f16724b;

    /* renamed from: c */
    private EfsReporter f16725c;

    /* renamed from: d */
    private int f16726d;

    /* renamed from: f */
    private int f16728f;

    /* renamed from: g */
    private boolean f16729g;

    /* renamed from: a */
    private final String f16723a = "PageConfigManager";

    /* renamed from: e */
    private final int f16727e = 0;

    public PowerConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.f16726d = 100;
        this.f16729g = false;
        Context applicationContext = context.getApplicationContext();
        this.f16724b = applicationContext;
        this.f16725c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_power", 0);
        if (sharedPreferences != null) {
            this.f16728f = sharedPreferences.getInt("apm_powerperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f16724b.getSharedPreferences("efs_power", 0);
        int i10 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_powerperf_sampling_rate", -1) : -1;
        this.f16725c.getAllSdkConfig(new String[]{"apm_powerperf_sampling_rate", "apm_powerperf_collect_interval", "apm_powerperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.umeng.powersdk.PowerConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor edit6;
                try {
                    SharedPreferences sharedPreferences3 = PowerConfigManager.this.f16724b.getSharedPreferences("efs_power", 0);
                    if (sharedPreferences3 == null || (edit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_powerperf_sampling_rate");
                    if (obj != null) {
                        edit6.putInt("apm_powerperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get("apm_powerperf_collect_interval");
                    if (obj2 != null) {
                        edit6.putInt("apm_powerperf_collect_interval", Integer.parseInt(obj2.toString()));
                    }
                    Object obj3 = map.get("apm_powerperf_collect_max_period_sec");
                    if (obj3 != null) {
                        edit6.putInt("apm_powerperf_collect_max_period_sec", Integer.parseInt(obj3.toString()));
                    }
                    edit6.apply();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i10 != -1) {
            this.f16726d = i10;
        }
        boolean z10 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f16724b.getSharedPreferences("efs_power", 0);
            long j10 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z11 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i11 = this.f16726d;
            if (i11 == 0) {
                if (z11 && sharedPreferences3 != null && (edit5 = sharedPreferences3.edit()) != null) {
                    edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    edit5.commit();
                }
                if (j10 != 0 && sharedPreferences3 != null && (edit4 = sharedPreferences3.edit()) != null) {
                    edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    edit4.commit();
                }
            } else {
                boolean z12 = i11 != this.f16728f;
                Long valueOf = Long.valueOf(j10);
                int i12 = this.f16726d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z11 || valueOf3.longValue() >= 86400000 || z12) {
                    if (valueOf3.longValue() >= 86400000 || z12) {
                        if (!(i12 != 0 && (i12 == 100 || new Random().nextInt(100) <= i12))) {
                            if (PowerManager.isDebug) {
                                Log.d("PageConfigManager", "check in page rate. random not check in!");
                            }
                            z10 = false;
                        } else if (PowerManager.isDebug) {
                            Log.d("PageConfigManager", "check in page rate. random check in");
                        }
                        SharedPreferences sharedPreferences4 = this.f16724b.getSharedPreferences("efs_power", 0);
                        if (sharedPreferences4 != null && (edit3 = sharedPreferences4.edit()) != null) {
                            edit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z10);
                            edit3.apply();
                        }
                        if (sharedPreferences4 != null && (edit2 = sharedPreferences4.edit()) != null) {
                            edit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit2.apply();
                        }
                    } else if (PowerManager.isDebug) {
                        Log.d("PageConfigManager", "check in page rate. un repeat check in 24 hour!");
                    }
                } else if (PowerManager.isDebug) {
                    Log.d("PageConfigManager", "check in page rate. check in allready.");
                }
            }
            z10 = false;
        }
        this.f16729g = z10;
        SharedPreferences sharedPreferences5 = this.f16724b.getSharedPreferences("efs_power", 0);
        if (sharedPreferences5 == null || (edit = sharedPreferences5.edit()) == null) {
            return;
        }
        edit.putInt("apm_powerperf_sampling_rate_last", this.f16726d);
        edit.apply();
    }

    public boolean enableTracer() {
        return this.f16729g;
    }
}
