package com.efs.sdk.pa.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class ConfigManager {
    private static final int A_DAY = 86400000;
    public static final String FLAG_PA_CHECK_IN_STATE = "8f2f54c08600aa25915617fa1371441b";
    public static final String FLAG_PA_FORE_CHECK_TIME = "03f870871950c148387b251894ed3e88";
    private static final int MAX_ANR_STATS_COUNT = 50;
    private static final int MAX_ANR_TRACE_RATE = 100;
    private static final String MODEL_SP = "paconfig";
    public static final String PA_LEVEL = "pa_level";
    private static final String STATS_ANR_LOG_COUNT = "apm_anr_count";
    private boolean mCheckIn;
    private int mCurrentRate;
    private IEfsReporter mEfsReporter;
    private int mLastRate;
    private PackageLevel mPackageLevel;
    private SharedPreferences mSharedPreferences;
    private final String TAG = "WpkPaConfig";
    private final String APM_PATRACE_SWITCH_RATE_LAST = "apm_patrace_switch_rate_last";
    private final String APM_PATRACE_SWITCH_RATE_CURRENT = "apm_patrace_switch_rate";
    private final int DEF_CLOSE_RATE = 0;

    public ConfigManager(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z10) {
        boolean z11 = false;
        this.mCheckIn = false;
        this.mPackageLevel = packageLevel;
        this.mEfsReporter = iEfsReporter;
        this.mSharedPreferences = SharedPreferencesUtils.getSharedPreferences(context, MODEL_SP);
        initRate();
        if (z10) {
            resetUploadSmoothLogCnt();
            z11 = enableAnrTracer();
        } else if (isCountEnable() && enableAnrTracer()) {
            z11 = true;
        }
        this.mCheckIn = z11;
        resetRate();
    }

    private boolean checkIn(boolean z10, Long l10, boolean z11, int i10) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - l10.longValue());
        boolean z12 = true;
        if (z11 && valueOf2.longValue() < 86400000 && !z10) {
            Log.d("WpkPaConfig", " check in allready");
            return true;
        }
        if (valueOf2.longValue() < 86400000 && !z10) {
            Log.d("WpkPaConfig", "un repeat check in 24 hour!");
            return false;
        }
        if (random(i10)) {
            Log.d("WpkPaConfig", "random check in");
        } else {
            Log.d("WpkPaConfig", "random not check in!");
            z12 = false;
        }
        putBooleanValue(FLAG_PA_CHECK_IN_STATE, z12);
        putLongValue(FLAG_PA_FORE_CHECK_TIME, valueOf.longValue());
        return z12;
    }

    private boolean enableAnrTracer() {
        long j10 = this.mSharedPreferences.getLong(FLAG_PA_FORE_CHECK_TIME, 0L);
        boolean z10 = false;
        boolean z11 = this.mSharedPreferences.getBoolean(FLAG_PA_CHECK_IN_STATE, false);
        if (this.mCurrentRate == 0) {
            if (z11) {
                putBooleanValue(FLAG_PA_CHECK_IN_STATE, false);
            }
            if (j10 != 0) {
                putLongValue(FLAG_PA_FORE_CHECK_TIME, 0L);
            }
            return false;
        }
        if (SamplingWhiteListUtil.isHitWL()) {
            return true;
        }
        if (this.mCurrentRate != this.mLastRate) {
            z10 = true;
        }
        return checkIn(z10, Long.valueOf(j10), z11, this.mCurrentRate);
    }

    private int getCurrentConfigRate() {
        int i10 = this.mSharedPreferences.getInt("apm_patrace_switch_rate", -1);
        this.mEfsReporter.getReporter().getAllSdkConfig(new String[]{"apm_patrace_switch_rate"}, new IConfigCallback() { // from class: com.efs.sdk.pa.config.ConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                Object obj = map.get("apm_patrace_switch_rate");
                if (obj != null) {
                    try {
                        ConfigManager.this.putIntValue("apm_patrace_switch_rate", Integer.parseInt(obj.toString()));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        return i10;
    }

    private void initRate() {
        this.mLastRate = this.mSharedPreferences.getInt("apm_patrace_switch_rate_last", 0);
        int currentConfigRate = getCurrentConfigRate();
        if (currentConfigRate == -1) {
            if (this.mPackageLevel == PackageLevel.TRIAL) {
                this.mCurrentRate = 100;
                return;
            } else {
                this.mCurrentRate = 0;
                return;
            }
        }
        this.mCurrentRate = currentConfigRate;
    }

    private boolean isCountEnable() {
        if (this.mSharedPreferences.getLong(STATS_ANR_LOG_COUNT, 0L) > 50) {
            return false;
        }
        return true;
    }

    private void putBooleanValue(String str, boolean z10) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void putIntValue(String str, int i10) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i10);
        edit.apply();
    }

    private void putLongValue(String str, long j10) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    private boolean random(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (i10 != 100 && new Random().nextInt(100) > i10) {
            return false;
        }
        return true;
    }

    private void resetRate() {
        putIntValue("apm_patrace_switch_rate_last", this.mCurrentRate);
    }

    private void resetUploadSmoothLogCnt() {
        putLongValue(STATS_ANR_LOG_COUNT, 0L);
    }

    public boolean enableTracer() {
        return this.mCheckIn;
    }

    public void increaseUploadSmoothLogCnt() {
        putLongValue(STATS_ANR_LOG_COUNT, this.mSharedPreferences.getLong(STATS_ANR_LOG_COUNT, 0L) + 1);
    }
}
