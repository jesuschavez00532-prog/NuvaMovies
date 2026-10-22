package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.C3520d;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.c */
/* loaded from: classes3.dex */
public class C3491c extends AbstractC3489a {

    /* renamed from: a */
    public static final String f15453a = C3309bd.m13860b().m13863b(C3309bd.f14105l);

    /* renamed from: b */
    public static final String f15454b = "key_umeng_sp_honor_oaid";

    /* renamed from: c */
    private static final String f15455c = "honor_oaid";

    /* renamed from: d */
    private Context f15456d;

    public C3491c(Context context) {
        super(f15455c);
        this.f15456d = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** HonorOaidTracker.getId(): oaid开关已关闭。");
            return null;
        }
        if (!FieldManager.allow(C3520d.f15636G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f15456d.getSharedPreferences(f15453a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(f15454b, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
