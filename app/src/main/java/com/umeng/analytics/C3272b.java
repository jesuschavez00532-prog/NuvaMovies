package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.filter.C3274a;
import com.umeng.analytics.filter.C3275b;
import com.umeng.analytics.pro.C3279aa;
import com.umeng.analytics.pro.C3384f;
import com.umeng.analytics.pro.C3389k;
import com.umeng.analytics.pro.C3390l;
import com.umeng.analytics.pro.C3391m;
import com.umeng.analytics.pro.C3392n;
import com.umeng.analytics.pro.C3393o;
import com.umeng.analytics.pro.C3395q;
import com.umeng.analytics.pro.C3396r;
import com.umeng.analytics.pro.C3399u;
import com.umeng.analytics.pro.C3401w;
import com.umeng.analytics.pro.C3402x;
import com.umeng.analytics.pro.InterfaceC3394p;
import com.umeng.analytics.pro.InterfaceC3400v;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.b */
/* loaded from: classes3.dex */
public class C3272b implements InterfaceC3394p, InterfaceC3400v {

    /* renamed from: A */
    private static final String f13887A = "umsp_2";

    /* renamed from: B */
    private static final String f13888B = "umsp_3";

    /* renamed from: C */
    private static final String f13889C = "umsp_4";

    /* renamed from: D */
    private static final String f13890D = "umsp_5";

    /* renamed from: a */
    private static Context f13891a = null;

    /* renamed from: h */
    private static final String f13892h = "sp_uapp";

    /* renamed from: i */
    private static final String f13893i = "prepp_uapp";

    /* renamed from: o */
    private static final int f13894o = 128;

    /* renamed from: p */
    private static final int f13895p = 256;

    /* renamed from: q */
    private static String f13896q = "";

    /* renamed from: r */
    private static String f13897r = "";

    /* renamed from: t */
    private static final String f13899t = "ekv_bl_ver";

    /* renamed from: w */
    private static final String f13901w = "ekv_wl_ver";

    /* renamed from: z */
    private static final String f13902z = "umsp_1";

    /* renamed from: b */
    private ISysListener f13903b;

    /* renamed from: c */
    private C3396r f13904c;

    /* renamed from: d */
    private C3402x f13905d;

    /* renamed from: e */
    private C3391m f13906e;

    /* renamed from: f */
    private C3401w f13907f;

    /* renamed from: g */
    private C3392n f13908g;

    /* renamed from: j */
    private boolean f13909j;

    /* renamed from: k */
    private volatile JSONObject f13910k;

    /* renamed from: l */
    private volatile JSONObject f13911l;

    /* renamed from: m */
    private volatile JSONObject f13912m;

    /* renamed from: n */
    private boolean f13913n;

    /* renamed from: u */
    private C3274a f13914u;

    /* renamed from: x */
    private C3275b f13915x;

    /* renamed from: y */
    private C3393o f13916y;

    /* renamed from: s */
    private static final String f13898s = C3384f.f14598ar;

    /* renamed from: v */
    private static final String f13900v = C3384f.f14599as;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3272b f13917a = new C3272b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f13891a = appContext.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static C3272b m13626a() {
        return a.f13917a;
    }

    /* renamed from: i */
    private void m13633i(Context context) {
        try {
            if (context == null) {
                MLog.m14765e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f13910k == null) {
                this.f13910k = new JSONObject();
            }
            if (this.f13911l == null) {
                this.f13911l = new JSONObject();
            }
            String string = sharedPreferences.getString(f13893i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f13912m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f13912m == null) {
                this.f13912m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public JSONObject m13656b() {
        return this.f13910k;
    }

    /* renamed from: c */
    public JSONObject m13661c() {
        return this.f13912m;
    }

    /* renamed from: d */
    public JSONObject m13665d() {
        return this.f13911l;
    }

    /* renamed from: e */
    public void m13671e() {
        this.f13911l = null;
    }

    /* renamed from: f */
    public String m13672f() {
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("getOnResumedActivityName can not be called in child process");
            return null;
        }
        return f13896q;
    }

    /* renamed from: g */
    public String m13675g() {
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("getOnPausedActivityName can not be called in child process");
            return null;
        }
        return f13897r;
    }

    /* renamed from: h */
    public void m13678h() {
        try {
            Context context = f13891a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m14765e("onStartSessionInternal can not be called in child process");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Context context2 = f13891a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(currentTimeMillis));
                Context context3 = f13891a;
                UMWorkDispatch.sendEvent(context3, C3395q.a.f14863g, CoreProtocol.getInstance(context3), Long.valueOf(currentTimeMillis));
            }
            ISysListener iSysListener = this.f13903b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m13680j() {
        try {
            Context context = f13891a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m14765e("onProfileSignOff can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14862f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f13891a;
            UMWorkDispatch.sendEvent(context3, C3395q.a.f14871o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14767e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: k */
    public synchronized void m13681k() {
        Context context;
        try {
            context = f13891a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f13910k != null) {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f13891a).edit();
            edit.putString(f13892h, this.f13910k.toString());
            edit.commit();
        } else {
            this.f13910k = new JSONObject();
        }
    }

    /* renamed from: l */
    public synchronized JSONObject m13682l() {
        Context context;
        try {
            context = f13891a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f13910k == null) {
            this.f13910k = new JSONObject();
        }
        return this.f13910k;
    }

    /* renamed from: m */
    public synchronized void m13683m() {
        try {
            Context context = f13891a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m14765e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f13891a).edit();
                    edit.remove(f13892h);
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3394p
    /* renamed from: n */
    public void mo13684n() {
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.m14543b()) {
            if (FieldManager.allow(C3520d.f15633D)) {
                if (!UMWorkDispatch.eventHasExist(C3395q.a.f14851B)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                    Context context = f13891a;
                    UMWorkDispatch.sendEvent(context, C3395q.a.f14851B, CoreProtocol.getInstance(context), null);
                    return;
                }
                return;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
        }
    }

    private C3272b() {
        this.f13904c = new C3396r();
        this.f13905d = new C3402x();
        this.f13906e = new C3391m();
        this.f13907f = C3401w.m14419a();
        this.f13908g = null;
        this.f13909j = false;
        this.f13910k = null;
        this.f13911l = null;
        this.f13912m = null;
        this.f13913n = false;
        this.f13914u = null;
        this.f13915x = null;
        this.f13916y = null;
        this.f13904c.m14391a(this);
    }

    /* renamed from: e */
    private boolean m13630e(String str) {
        if (this.f13914u.enabled() && this.f13914u.matchHit(str)) {
            return true;
        }
        if (!this.f13915x.enabled()) {
            return false;
        }
        if (!this.f13915x.matchHit(str)) {
            return true;
        }
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    /* renamed from: a */
    public void m13636a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (this.f13914u == null) {
                C3274a c3274a = new C3274a(f13898s, "ekv_bl_ver");
                this.f13914u = c3274a;
                c3274a.register(f13891a);
            }
            if (this.f13915x == null) {
                C3275b c3275b = new C3275b(f13900v, "ekv_wl_ver");
                this.f13915x = c3275b;
                c3275b.register(f13891a);
            }
            if (UMUtils.isMainProgress(f13891a)) {
                if (!this.f13909j) {
                    this.f13909j = true;
                    m13633i(f13891a);
                }
                synchronized (this) {
                    if (!this.f13913n) {
                        C3392n m14299a = C3392n.m14299a(context);
                        this.f13908g = m14299a;
                        if (m14299a.m14317a()) {
                            this.f13913n = true;
                        }
                        this.f13916y = C3393o.m14322a();
                        try {
                            C3393o.m14323a(context);
                            this.f13916y.m14328a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(C3390l.f14728B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f13891a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13660b(String str) {
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f13905d.m14440b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13662c(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14786p, 0, "\\|");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m14562aq(C3390l.f14787q, 2, "\\|");
        }
        try {
            if (!this.f13909j || !this.f13913n) {
                m13636a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f13906e.m14440b(context.getClass().getName());
            }
            m13679i();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14767e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f13897r = context.getClass().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13666d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f13891a)) {
                MLog.m14765e("onKillProcess can not be called in child process");
                return;
            }
            C3392n c3392n = this.f13908g;
            if (c3392n != null) {
                c3392n.m14320c();
            }
            C3392n.m14301a(context, "onKillProcess");
            C3391m c3391m = this.f13906e;
            if (c3391m != null) {
                c3391m.m14439b();
            }
            C3402x c3402x = this.f13905d;
            if (c3402x != null) {
                c3402x.m14439b();
            }
            Context context2 = f13891a;
            if (context2 != null) {
                C3401w c3401w = this.f13907f;
                if (c3401w != null) {
                    c3401w.m14435c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                C3395q.m14330a(f13891a).m14375d();
                C3402x.m14437a(f13891a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C3392n.m14309c(f13891a);
                }
                PreferenceWrapper.getDefault(f13891a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public synchronized void m13673f(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14761ah, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        this.f13910k = new JSONObject();
        Context context2 = f13891a;
        UMWorkDispatch.sendEvent(context2, C3395q.a.f14877u, CoreProtocol.getInstance(context2), null);
    }

    /* renamed from: g */
    public synchronized void m13676g(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14769ap, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (this.f13912m.length() > 0) {
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14881y, CoreProtocol.getInstance(context2), null);
        }
        this.f13912m = new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13657b(Context context) {
        if (context == null) {
            MLog.m14765e("unexpected null context in onResume");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m14562aq(C3390l.f14785o, 2, "\\|");
        }
        try {
            if (!this.f13909j || !this.f13913n) {
                m13636a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f13906e.m14438a(context.getClass().getName());
            }
            m13678h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f13896q = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.m14767e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    /* renamed from: e */
    public synchronized Object m13669e(Context context, String str) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14762ai, 0, "\\|");
            return null;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("getSuperProperty can not be called in child process");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m14562aq(C3390l.f14760ag, 0, "\\|");
            return null;
        }
        if (!str.equals(f13902z) && !str.equals(f13887A) && !str.equals(f13888B) && !str.equals(f13889C) && !str.equals(f13890D)) {
            MLog.m14765e("please check key or value, must be correct!");
            return null;
        }
        if (this.f13910k != null) {
            if (this.f13910k.has(str)) {
                return this.f13910k.opt(str);
            }
        } else {
            this.f13910k = new JSONObject();
        }
        return null;
    }

    /* renamed from: h */
    public synchronized JSONObject m13677h(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14770aq, 0, "\\|");
            return null;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (this.f13912m == null) {
            this.f13912m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f13912m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f13912m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: i */
    public void m13679i() {
        try {
            Context context = f13891a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m14765e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f13891a;
                UMWorkDispatch.sendEvent(context2, C3395q.a.f14864h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f13891a;
                UMWorkDispatch.sendEvent(context3, C3395q.a.f14860d, CoreProtocol.getInstance(context3), null);
                Context context4 = f13891a;
                UMWorkDispatch.sendEvent(context4, C3395q.a.f14859c, CoreProtocol.getInstance(context4), null);
                Context context5 = f13891a;
                UMWorkDispatch.sendEvent(context5, C3395q.a.f14865i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f13903b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    /* renamed from: f */
    public synchronized void m13674f(Context context, String str) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14767an, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (this.f13912m == null) {
            this.f13912m = new JSONObject();
        }
        if (str != null && str.length() > 0) {
            if (this.f13912m.has(str)) {
                this.f13912m.remove(str);
                Context context2 = f13891a;
                UMWorkDispatch.sendEvent(context2, C3395q.a.f14880x, CoreProtocol.getInstance(context2), this.f13912m.toString());
            } else if (UMConfigure.isDebugLog()) {
                UMLog.m14562aq(C3390l.f14768ao, 0, "\\|");
            }
            return;
        }
        MLog.m14765e("please check propertics, property is null!");
    }

    /* renamed from: g */
    private boolean m13632g(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length >= 0 && length < 256) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.m14765e("The length of profile value must be less than 256 bytes.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13663c(Context context, String str) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14796z, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("setSecret can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        AnalyticsConfig.m13623a(f13891a, str);
    }

    /* renamed from: d */
    public synchronized void m13667d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            UMLog.m14562aq(C3390l.f14761ah, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("unregisterSuperProperty can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m14562aq(C3390l.f14760ag, 0, "\\|");
            return;
        }
        if (!str.equals(f13902z) && !str.equals(f13887A) && !str.equals(f13888B) && !str.equals(f13889C) && !str.equals(f13890D)) {
            MLog.m14765e("please check key or value, must be correct!");
            return;
        }
        if (this.f13910k == null) {
            this.f13910k = new JSONObject();
        }
        if (this.f13910k.has(str)) {
            this.f13910k.remove(str);
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14878v, CoreProtocol.getInstance(context2), str);
        }
    }

    /* renamed from: b */
    public void m13658b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m14562aq(C3390l.f14740N, 0, "\\|");
                return;
            }
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f13891a)) {
                MLog.m14765e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f13909j || !this.f13913n) {
                m13636a(f13891a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(C3384f.f14577aK, str);
                m13627a(f13891a, C3384f.f14576aJ, (Map<String, Object>) hashMap, -1L, false);
                return;
            }
            UMLog.m14562aq(C3390l.f14741O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13650a(String str) {
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f13905d.m14438a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private boolean m13629c(String str, Object obj) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            MLog.m14765e("key is " + str + ", please check key, illegal");
            return false;
        }
        try {
            i10 = str.getBytes(Request.DEFAULT_CHARSET).length;
        } catch (UnsupportedEncodingException unused) {
            i10 = 0;
        }
        if (i10 > 128) {
            MLog.m14765e("key length is " + i10 + ", please check key, illegal");
            return false;
        }
        if (obj instanceof String) {
            if (((String) obj).getBytes(Request.DEFAULT_CHARSET).length <= 256) {
                return true;
            }
            MLog.m14765e("value length is " + ((String) obj).getBytes(Request.DEFAULT_CHARSET).length + ", please check value, illegal");
            return false;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        MLog.m14765e("value is " + obj + ", please check value, type illegal");
        return false;
    }

    /* renamed from: e */
    public synchronized String m13670e(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14762ai, 0, "\\|");
            return null;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("getSuperProperties can not be called in child process");
            return null;
        }
        if (this.f13910k != null) {
            return this.f13910k.toString();
        }
        this.f13910k = new JSONObject();
        return null;
    }

    /* renamed from: a */
    public void m13648a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("setSysListener can not be called in child process");
        } else {
            this.f13903b = iSysListener;
        }
    }

    /* renamed from: a */
    public void m13637a(Context context, int i10) {
        if (context == null) {
            MLog.m14765e("unexpected null context in setVerticalType");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        AnalyticsConfig.m13622a(f13891a, i10);
    }

    /* renamed from: b */
    private void m13628b(String str, Object obj) {
        try {
            if (this.f13910k == null) {
                this.f13910k = new JSONObject();
            }
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length > 10) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    while (i10 < strArr.length) {
                        String str2 = strArr[i10];
                        if (str2 != null && !HelperUtils.checkStrLen(str2, 256)) {
                            jSONArray.put(strArr[i10]);
                        }
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i10 < jArr.length) {
                        jSONArray2.put(jArr[i10]);
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i10 < iArr.length) {
                        jSONArray3.put(iArr[i10]);
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i10 < fArr.length) {
                        jSONArray4.put(fArr[i10]);
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i10 < dArr.length) {
                        jSONArray5.put(dArr[i10]);
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i10 < sArr.length) {
                        jSONArray6.put((int) sArr[i10]);
                        i10++;
                    }
                    this.f13910k.put(str, jSONArray6);
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i10 < list.size()) {
                    Object obj2 = list.get(i10);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i10));
                    }
                    i10++;
                }
                this.f13910k.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f13910k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private boolean m13631f(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length < 128) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.m14765e("The length of profile key must be less than 128 bytes.");
        return false;
    }

    /* renamed from: c */
    public void m13664c(String str) {
        if (m13632g(str)) {
            m13651a(C3384f.f14554O, (Object) str);
        }
    }

    /* renamed from: a */
    public void m13642a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context == null) {
            return;
        }
        try {
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f13891a)) {
                MLog.m14765e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f13909j || !this.f13913n) {
                m13636a(f13891a);
            }
            String str2 = "";
            if (this.f13910k == null) {
                this.f13910k = new JSONObject();
            } else {
                str2 = this.f13910k.toString();
            }
            C3399u.m14402a(f13891a).m14415a(str, hashMap, str2);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
    }

    /* renamed from: d */
    public void m13668d(String str) {
        if (m13632g(str)) {
            m13651a(C3384f.f14555P, (Object) str);
        }
    }

    /* renamed from: a */
    void m13639a(Context context, String str) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14793w, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.m14562aq(C3390l.f14794x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f13909j || !this.f13913n) {
                m13636a(f13891a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(C3384f.f14562W, 2);
            jSONObject.put(C3384f.f14563X, str);
            jSONObject.put("__ii", this.f13907f.m14433c());
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14866j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
    }

    /* renamed from: a */
    void m13645a(Context context, Throwable th) {
        if (context != null && th != null) {
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f13891a)) {
                MLog.m14765e("reportError can not be called in child process");
                return;
            }
            try {
                if (!this.f13909j || !this.f13913n) {
                    m13636a(f13891a);
                }
                m13639a(f13891a, DataHelper.convertExceptionToString(th));
                return;
            } catch (Exception e10) {
                if (MLog.DEBUG) {
                    MLog.m14769e(e10);
                    return;
                }
                return;
            }
        }
        UMLog.m14562aq(C3390l.f14795y, 0, "\\|");
    }

    /* renamed from: a */
    public void m13641a(Context context, String str, String str2, long j10, int i10) {
        if (context == null) {
            return;
        }
        try {
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!this.f13909j || !this.f13913n) {
                m13636a(f13891a);
            }
            if (m13630e(str)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str3 = "";
            if (this.f13910k == null) {
                this.f13910k = new JSONObject();
            } else {
                str3 = this.f13910k.toString();
            }
            C3399u.m14402a(f13891a).m14413a(str, str2, j10, i10, str3);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m13659b(Object obj) {
        Context context;
        try {
            context = f13891a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f13891a).edit();
        if (obj != null) {
            String str = (String) obj;
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f13893i, str).commit();
            }
        } else if (edit != null) {
            edit.remove(f13893i).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13644a(Context context, String str, Map<String, Object> map, long j10) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(C3384f.f14578aL).contains(str)) {
                UMLog.m14562aq(C3390l.f14772b, 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                UMLog.m14562aq(C3390l.f14774d, 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(C3384f.f14578aL).contains(it.next().getKey())) {
                    UMLog.m14562aq(C3390l.f14775e, 0, "\\|");
                    return;
                }
            }
            m13627a(context, str, map, j10, false);
            return;
        }
        UMLog.m14562aq(C3390l.f14773c, 0, "\\|");
    }

    /* renamed from: a */
    public void m13643a(Context context, String str, Map<String, Object> map) {
        m13627a(context, str, map, -1L, true);
    }

    /* renamed from: a */
    private void m13627a(Context context, String str, Map<String, Object> map, long j10, boolean z10) {
        try {
            if (context == null) {
                MLog.m14765e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f13891a == null) {
                f13891a = context.getApplicationContext();
            }
            if (!this.f13909j || !this.f13913n) {
                m13636a(f13891a);
            }
            if (m13630e(str)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str2 = "";
            if (this.f13910k == null) {
                this.f13910k = new JSONObject();
            } else {
                str2 = this.f13910k.toString();
            }
            C3399u.m14402a(f13891a).m14414a(str, map, j10, str2, z10);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14769e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3400v
    /* renamed from: a */
    public void mo13653a(Throwable th) {
        try {
            Context context = f13891a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m14765e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                C3402x c3402x = this.f13905d;
                if (c3402x != null) {
                    c3402x.m14439b();
                }
                C3392n.m14301a(f13891a, "onAppCrash");
                C3391m c3391m = this.f13906e;
                if (c3391m != null) {
                    c3391m.m14439b();
                }
                C3392n c3392n = this.f13908g;
                if (c3392n != null) {
                    c3392n.m14320c();
                }
                C3401w c3401w = this.f13907f;
                if (c3401w != null) {
                    c3401w.m14435c(f13891a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3384f.f14562W, 1);
                    jSONObject.put(C3384f.f14563X, DataHelper.convertExceptionToString(th));
                    C3389k.m14262a(f13891a).m14280a(this.f13907f.m14433c(), jSONObject.toString(), 1);
                }
                C3395q.m14330a(f13891a).m14375d();
                C3402x.m14437a(f13891a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C3392n.m14309c(f13891a);
                }
                PreferenceWrapper.getDefault(f13891a).edit().commit();
            }
        } catch (Exception e10) {
            if (MLog.DEBUG) {
                MLog.m14767e("Exception in onAppCrash", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13652a(String str, String str2) {
        try {
            Context context = f13891a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m14765e("onProfileSignIn can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3384f.f14552M, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14861e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f13891a;
            UMWorkDispatch.sendEvent(context3, C3395q.a.f14871o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14767e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13655a(boolean z10) {
        Context context = f13891a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13654a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13634a(double d10, double d11) {
        Context context = f13891a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f13864a == null) {
            AnalyticsConfig.f13864a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f13864a;
        dArr[0] = d10;
        dArr[1] = d11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13638a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m14765e("unexpected null context in setScenarioType");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            m13637a(f13891a, eScenarioType.toValue());
        }
        if (this.f13909j && this.f13913n) {
            return;
        }
        m13636a(f13891a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13635a(long j10) {
        Context context = f13891a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j10;
            C3279aa.m13712a().m13721a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    /* renamed from: a */
    public synchronized void m13640a(Context context, String str, Object obj) {
        int i10 = 0;
        if (context == null) {
            UMLog.m14562aq(C3390l.f14759af, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("registerSuperProperty can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!str.equals(f13902z) && !str.equals(f13887A) && !str.equals(f13888B) && !str.equals(f13889C) && !str.equals(f13890D)) {
                MLog.m14765e("property name is " + str + ", please check key, must be correct!");
                return;
            }
            if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                MLog.m14765e("property value is " + obj + ", please check value, lawless!");
                return;
            }
            try {
                if (this.f13910k == null) {
                    this.f13910k = new JSONObject();
                }
                if (obj.getClass().isArray()) {
                    if (obj instanceof String[]) {
                        String[] strArr = (String[]) obj;
                        if (strArr.length > 10) {
                            MLog.m14765e("please check value, size is " + strArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i10 < strArr.length) {
                            String str2 = strArr[i10];
                            if (str2 != null && HelperUtils.checkStrLen(str2, 256)) {
                                jSONArray.put(strArr[i10]);
                                i10++;
                            }
                            MLog.m14765e("please check value, length is " + strArr[i10].length() + ", overlength 256!");
                            return;
                        }
                        this.f13910k.put(str, jSONArray);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length > 10) {
                            MLog.m14765e("please check value, size is " + jArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        while (i10 < jArr.length) {
                            jSONArray2.put(jArr[i10]);
                            i10++;
                        }
                        this.f13910k.put(str, jSONArray2);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length > 10) {
                            MLog.m14765e("please check value, size is " + iArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        while (i10 < iArr.length) {
                            jSONArray3.put(iArr[i10]);
                            i10++;
                        }
                        this.f13910k.put(str, jSONArray3);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length > 10) {
                            MLog.m14765e("please check value, size is " + fArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray4 = new JSONArray();
                        while (i10 < fArr.length) {
                            jSONArray4.put(fArr[i10]);
                            i10++;
                        }
                        this.f13910k.put(str, jSONArray4);
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length > 10) {
                            MLog.m14765e("please check value, size is " + dArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        while (i10 < dArr.length) {
                            jSONArray5.put(dArr[i10]);
                            i10++;
                        }
                        this.f13910k.put(str, jSONArray5);
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        if (sArr.length > 10) {
                            MLog.m14765e("please check value, size is " + sArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray6 = new JSONArray();
                        while (i10 < sArr.length) {
                            jSONArray6.put((int) sArr[i10]);
                            i10++;
                        }
                        this.f13910k.put(str, jSONArray6);
                    } else {
                        MLog.m14765e("please check value, illegal type!");
                        return;
                    }
                } else {
                    if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                        MLog.m14765e("please check value, illegal type!");
                        return;
                    }
                    this.f13910k.put(str, obj);
                }
            } catch (Throwable unused) {
            }
            Context context2 = f13891a;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14876t, CoreProtocol.getInstance(context2), this.f13910k.toString());
            return;
        }
        UMLog.m14562aq(C3390l.f14760ag, 0, "\\|");
    }

    /* renamed from: a */
    public synchronized void m13649a(Object obj) {
        Context context;
        try {
            context = f13891a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m14765e("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f13891a).edit();
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f13892h, this.f13910k.toString()).commit();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m13646a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.m14769e(th);
        }
        if (context == null) {
            UMLog.m14562aq(C3390l.f14763aj, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("setFirstLaunchEvent can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        C3399u.m14402a(f13891a).m14416a(list);
    }

    /* renamed from: a */
    public synchronized void m13647a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String obj;
        Object obj2;
        if (context == null) {
            UMLog.m14562aq(C3390l.f14765al, 0, "\\|");
            return;
        }
        if (f13891a == null) {
            f13891a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f13891a)) {
            MLog.m14765e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f13909j || !this.f13913n) {
            m13636a(f13891a);
        }
        if (this.f13912m == null) {
            this.f13912m = new JSONObject();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                jSONObject2 = new JSONObject(this.f13912m.toString());
            } catch (Exception unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    try {
                        obj = keys.next().toString();
                        obj2 = jSONObject.get(obj);
                    } catch (Exception unused2) {
                    }
                    if (m13629c(obj, obj2)) {
                        jSONObject2.put(obj, obj2);
                        if (jSONObject2.length() > 10) {
                            MLog.m14765e("please check propertics, size overlength!");
                            return;
                        }
                        continue;
                    } else {
                        return;
                    }
                }
            }
            this.f13912m = jSONObject2;
            if (this.f13912m.length() > 0) {
                Context context2 = f13891a;
                UMWorkDispatch.sendEvent(context2, C3395q.a.f14879w, CoreProtocol.getInstance(context2), this.f13912m.toString());
            }
            return;
        }
        UMLog.m14562aq(C3390l.f14766am, 0, "\\|");
    }

    /* renamed from: a */
    public void m13651a(String str, Object obj) {
        if (m13631f(str)) {
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Float) && !(obj instanceof Double)) {
                MLog.m14765e("userProfile: Invalid value type, please check!");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3384f.f14558S, str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() > 0) {
                        str2 = str2.trim();
                    }
                    if (!m13632g(str2)) {
                        return;
                    } else {
                        jSONObject.put(C3384f.f14559T, str2);
                    }
                } else {
                    jSONObject.put(C3384f.f14559T, obj);
                }
                Context context = f13891a;
                UMWorkDispatch.sendEvent(context, C3395q.a.f14873q, CoreProtocol.getInstance(context), jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
