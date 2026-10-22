package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.C3272b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3385g;
import com.umeng.analytics.pro.C3389k;
import com.umeng.analytics.vshelper.C3416b;
import com.umeng.analytics.vshelper.InterfaceC3415a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

@TargetApi(14)
/* renamed from: com.umeng.analytics.pro.n */
/* loaded from: classes3.dex */
public class C3392n {

    /* renamed from: a */
    public static String f14797a;

    /* renamed from: b */
    boolean f14806b;

    /* renamed from: c */
    boolean f14807c;

    /* renamed from: f */
    InterfaceC3415a f14808f;

    /* renamed from: g */
    Application.ActivityLifecycleCallbacks f14809g;

    /* renamed from: h */
    private final Map<String, Long> f14810h;

    /* renamed from: l */
    private boolean f14811l;

    /* renamed from: m */
    private int f14812m;

    /* renamed from: n */
    private int f14813n;

    /* renamed from: i */
    private static JSONArray f14800i = new JSONArray();

    /* renamed from: j */
    private static Object f14801j = new Object();

    /* renamed from: k */
    private static Application f14802k = null;

    /* renamed from: d */
    static String f14798d = null;

    /* renamed from: e */
    static int f14799e = -1;

    /* renamed from: o */
    private static boolean f14803o = true;

    /* renamed from: p */
    private static Object f14804p = new Object();

    /* renamed from: q */
    private static InterfaceC3336cd f14805q = new C3416b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.n$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3392n f14815a = new C3392n();

        private a() {
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m14298a(C3392n c3392n) {
        int i10 = c3392n.f14813n;
        c3392n.f14813n = i10 - 1;
        return i10;
    }

    /* renamed from: b */
    static /* synthetic */ int m14304b(C3392n c3392n) {
        int i10 = c3392n.f14812m;
        c3392n.f14812m = i10 - 1;
        return i10;
    }

    /* renamed from: e */
    static /* synthetic */ int m14312e(C3392n c3392n) {
        int i10 = c3392n.f14813n;
        c3392n.f14813n = i10 + 1;
        return i10;
    }

    /* renamed from: f */
    static /* synthetic */ int m14314f(C3392n c3392n) {
        int i10 = c3392n.f14812m;
        c3392n.f14812m = i10 + 1;
        return i10;
    }

    /* renamed from: g */
    private void m14316g() {
        if (!this.f14811l) {
            this.f14811l = true;
            if (f14802k != null) {
                f14802k.registerActivityLifecycleCallbacks(this.f14809g);
            }
        }
    }

    private C3392n() {
        this.f14810h = new HashMap();
        this.f14811l = false;
        this.f14806b = false;
        this.f14807c = false;
        this.f14812m = 0;
        this.f14813n = 0;
        this.f14808f = PageNameMonitor.getInstance();
        this.f14809g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.n.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C3392n.f14805q.mo14024a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(C3520d.f15635F)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (C3392n.f14804p) {
                        if (C3392n.f14803o) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C3392n.this.m14308c(activity);
                    C3272b.m13626a().m13679i();
                    C3392n.this.f14806b = false;
                    C3392n.f14805q.mo14030d(activity);
                    return;
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                    C3272b.m13626a().m13679i();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(C3520d.f15635F)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (C3392n.f14804p) {
                        if (C3392n.f14803o) {
                            boolean unused = C3392n.f14803o = false;
                        }
                    }
                    C3392n.this.m14300a(activity);
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    C3392n.this.m14300a(activity);
                }
                C3392n.f14805q.mo14029c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (C3392n.this.f14812m <= 0) {
                        if (C3392n.f14798d == null) {
                            C3392n.f14798d = UUID.randomUUID().toString();
                        }
                        if (C3392n.f14799e == -1) {
                            C3392n.f14799e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (C3392n.f14799e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("activityName", activity.toString());
                            hashMap.put("pid", Integer.valueOf(Process.myPid()));
                            hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            C3272b m13626a = C3272b.m13626a();
                            if (m13626a != null) {
                                m13626a.m13643a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) hashMap);
                            }
                            C3392n.f14799e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, C3390l.f14771ar);
                            }
                        } else if (C3392n.f14799e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("pairUUID", C3392n.f14798d);
                            hashMap2.put("pid", Integer.valueOf(Process.myPid()));
                            hashMap2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            hashMap2.put("activityName", activity.toString());
                            if (C3272b.m13626a() != null) {
                                C3272b.m13626a().m13643a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) hashMap2);
                            }
                        }
                    }
                    if (C3392n.this.f14813n < 0) {
                        C3392n.m14312e(C3392n.this);
                    } else {
                        C3392n.m14314f(C3392n.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                UMLog uMLog = UMConfigure.umDebugLog;
                MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        C3392n.m14298a(C3392n.this);
                        return;
                    }
                    C3392n.m14304b(C3392n.this);
                    if (C3392n.this.f14812m <= 0) {
                        if (C3392n.f14799e != 0 || !UMUtils.isMainProgress(activity)) {
                            int i10 = C3392n.f14799e;
                            if (i10 == 1 || (i10 == 0 && !UMUtils.isMainProgress(activity))) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("pairUUID", C3392n.f14798d);
                                hashMap.put("reason", "Normal");
                                hashMap.put("pid", Integer.valueOf(Process.myPid()));
                                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                                hashMap.put("activityName", activity.toString());
                                C3272b m13626a = C3272b.m13626a();
                                if (m13626a != null) {
                                    m13626a.m13643a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
                                }
                                if (C3392n.f14798d != null) {
                                    C3392n.f14798d = null;
                                }
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f14802k != null) {
                m14316g();
            }
        }
    }

    /* renamed from: c */
    public void m14320c() {
        m14308c((Activity) null);
        m14318b();
    }

    /* renamed from: b */
    public void m14319b(Context context) {
        synchronized (f14804p) {
            if (f14803o) {
                f14803o = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                m14300a(globleActivity);
                return;
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    /* renamed from: c */
    public static void m14309c(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f14801j) {
                    jSONArray = f14800i.toString();
                    f14800i = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(C3385g.d.a.f14677c, new JSONArray(jSONArray));
                    C3389k.m14262a(context).m14281a(C3401w.m14419a().m14433c(), jSONObject, C3389k.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean m14317a() {
        return this.f14811l;
    }

    /* renamed from: a */
    public static synchronized C3392n m14299a(Context context) {
        C3392n c3392n;
        synchronized (C3392n.class) {
            if (f14802k == null && context != null) {
                if (context instanceof Activity) {
                    f14802k = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    f14802k = (Application) context;
                }
            }
            c3392n = a.f14815a;
        }
        return c3392n;
    }

    /* renamed from: a */
    public static void m14301a(Context context, String str) {
        if (f14799e == 1 && UMUtils.isMainProgress(context)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pairUUID", f14798d);
            hashMap.put("reason", str);
            if (f14798d != null) {
                f14798d = null;
            }
            if (context != null) {
                hashMap.put("pid", Integer.valueOf(Process.myPid()));
                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                hashMap.put("Context", context.toString());
                C3272b.m13626a().m13643a(context, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
            }
        }
    }

    /* renamed from: b */
    public void m14318b() {
        this.f14811l = false;
        if (f14802k != null) {
            f14802k.unregisterActivityLifecycleCallbacks(this.f14809g);
            f14802k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m14308c(Activity activity) {
        long j10;
        long j11;
        try {
            synchronized (this.f14810h) {
                if (f14797a == null && activity != null) {
                    f14797a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                if (TextUtils.isEmpty(f14797a) || !this.f14810h.containsKey(f14797a)) {
                    j10 = 0;
                    j11 = 0;
                } else {
                    j10 = this.f14810h.get(f14797a).longValue();
                    j11 = System.currentTimeMillis() - j10;
                    this.f14810h.remove(f14797a);
                }
            }
            synchronized (f14801j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3384f.f14627v, f14797a);
                    jSONObject.put("duration", j11);
                    jSONObject.put(C3384f.f14629x, j10);
                    jSONObject.put("type", 0);
                    f14800i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private void m14305b(Activity activity) {
        f14797a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f14810h) {
            this.f14810h.put(f14797a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m14300a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (f14804p) {
                    C3272b.m13626a().m13678h();
                }
                return;
            }
            return;
        }
        if (activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f14808f.activityResume(str);
            if (this.f14806b) {
                this.f14806b = false;
                if (!TextUtils.isEmpty(f14797a)) {
                    if (f14797a.equals(str)) {
                        return;
                    }
                    m14305b(activity);
                    synchronized (f14804p) {
                        C3272b.m13626a().m13678h();
                    }
                    return;
                }
                f14797a = str;
                return;
            }
            m14305b(activity);
            synchronized (f14804p) {
                C3272b.m13626a().m13678h();
            }
        }
    }
}
