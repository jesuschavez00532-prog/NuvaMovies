package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.C3520d;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.i */
/* loaded from: classes3.dex */
public class C3497i extends AbstractC3489a {

    /* renamed from: a */
    public static final String f15477a = C3309bd.m13860b().m13863b(C3309bd.f14105l);

    /* renamed from: b */
    public static final String f15478b = "key_umeng_sp_oaid";

    /* renamed from: c */
    public static final String f15479c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d */
    private static final String f15480d = "oaid";

    /* renamed from: e */
    private Context f15481e;

    public C3497i(Context context) {
        super(f15480d);
        this.f15481e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** OaidTracking.getId(): oaid开关已关闭。");
            return null;
        }
        if (!FieldManager.allow(C3520d.f15636G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f15481e.getSharedPreferences(f15477a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(f15478b, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
