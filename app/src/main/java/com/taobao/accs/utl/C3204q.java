package com.taobao.accs.utl;

import android.content.SharedPreferences;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.q */
/* loaded from: classes.dex */
public class C3204q {
    public static final int MAX_FAIL_TIMES = 3;

    /* renamed from: a */
    public static void m13024a() {
        try {
            int m13026c = m13026c();
            if (m13026c > 0) {
                SharedPreferences.Editor edit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
                ALog.m12941i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(m13026c));
            }
        } catch (Throwable th) {
            ALog.m12939e("LoadSoFailUtil", "loadSoSuccess", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m13025b() {
        try {
            SharedPreferences sharedPreferences = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0);
            int i10 = sharedPreferences.getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0) + 1;
            if (i10 > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(Constants.SP_KEY_LOAD_SO_TIMES, i10);
                edit.apply();
            }
            ALog.m12940e("LoadSoFailUtil", "loadSoFail", Constants.KEY_TIMES, Integer.valueOf(i10));
        } catch (Throwable th) {
            ALog.m12939e("LoadSoFailUtil", "loadSoFail", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public static int m13026c() {
        int i10;
        try {
            i10 = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0);
            try {
                ALog.m12941i("LoadSoFailUtil", "getSoFailTimes", Constants.KEY_TIMES, Integer.valueOf(i10));
            } catch (Throwable th) {
                th = th;
                ALog.m12939e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
                return i10;
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
        return i10;
    }
}
