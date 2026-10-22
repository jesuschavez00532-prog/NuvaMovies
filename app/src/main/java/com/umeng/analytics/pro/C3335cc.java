package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.umeng.analytics.pro.cc */
/* loaded from: classes3.dex */
public class C3335cc implements InterfaceC3334cb {

    /* renamed from: a */
    private static final String f14386a = "cache_domain";

    /* renamed from: b */
    private static volatile String f14387b = "";

    /* renamed from: com.umeng.analytics.pro.cc$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        public static final C3335cc f14388a = new C3335cc();

        private a() {
        }
    }

    /* renamed from: b */
    public static C3335cc m14018b() {
        return a.f14388a;
    }

    /* renamed from: d */
    private void m14019d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
        if (sharedPreferences != null) {
            f14387b = sharedPreferences.getString(f14386a, "");
        }
    }

    /* renamed from: e */
    private void m14020e() {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(f14386a, f14387b).commit();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3334cb
    /* renamed from: a */
    public void mo14015a() {
    }

    /* renamed from: c */
    public String m14021c() {
        return f14387b;
    }

    private C3335cc() {
        m14019d();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3334cb
    /* renamed from: a */
    public void mo14017a(Throwable th) {
    }

    @Override // com.umeng.analytics.pro.InterfaceC3334cb
    /* renamed from: a */
    public void mo14016a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("Status") && jSONObject.getInt("Status") == 0 && jSONObject.has("Answer")) {
                String optString = jSONObject.optString("Answer");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                String optString2 = jSONObject.has(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP) ? jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP) : "";
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> domain下发结果：" + optString);
                if (!TextUtils.isEmpty(optString2)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 对应domain下发请求ip：" + optString2);
                }
                f14387b = optString;
                m14020e();
            }
        } catch (Throwable unused) {
        }
    }
}
