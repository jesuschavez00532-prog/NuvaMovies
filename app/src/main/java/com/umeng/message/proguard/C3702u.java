package com.umeng.message.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.u */
/* loaded from: classes3.dex */
public final class C3702u {

    /* renamed from: a */
    private static final C3702u f16600a = new C3702u();

    /* renamed from: b */
    private WeakReference<Activity> f16601b;

    /* renamed from: h */
    private volatile C3701t f16607h;

    /* renamed from: c */
    private volatile boolean f16602c = false;

    /* renamed from: d */
    private volatile boolean f16603d = false;

    /* renamed from: e */
    private boolean f16604e = false;

    /* renamed from: f */
    private volatile long f16605f = 0;

    /* renamed from: g */
    private volatile long f16606g = 0;

    /* renamed from: i */
    private final Application.ActivityLifecycleCallbacks f16608i = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.message.proguard.u.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C3702u.this.f16602c) {
                C3702u.m15817b(C3702u.this);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (C3702u.this.f16607h != null) {
                System.currentTimeMillis();
                try {
                    C3565ak.m15312a().mo15317a(activity);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C3702u.this.f16601b = new WeakReference(activity);
            C3702u.m15821d(C3702u.this);
            if (C3702u.this.f16607h != null) {
                System.currentTimeMillis();
                try {
                    C3565ak.m15312a().mo15322b();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (!C3702u.this.f16602c) {
                C3702u.m15817b(C3702u.this);
            }
            if (C3702u.this.f16607h != null) {
                try {
                    C3577aw m15353a = C3577aw.m15353a();
                    final String name = activity.getClass().getName();
                    if (m15353a.f16026c && m15353a.f16025b) {
                        final C3578ax c3578ax = m15353a.f16024a;
                        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.ax.2

                            /* renamed from: a */
                            final /* synthetic */ String f16031a;

                            public AnonymousClass2(final String name2) {
                                r2 = name2;
                            }

                            /* JADX WARN: Not initialized variable reg: 18, insn: 0x0349: MOVE (r1 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:842), block:B:136:0x0349 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                boolean z10;
                                JSONObject jSONObject;
                                String str2;
                                boolean z11;
                                int length;
                                String str3;
                                String str4;
                                String str5;
                                C3578ax c3578ax2;
                                String str6;
                                String str7;
                                int i10;
                                boolean z12;
                                String str8 = "trace_id";
                                String str9 = "ts";
                                String str10 = "appkey";
                                String str11 = "Notify";
                                try {
                                    if (!C3578ax.this.f16028b.m15365a()) {
                                        return;
                                    }
                                    if (!C3578ax.this.f16028b.f16039a.m15403b("e_s", true)) {
                                        if (Math.abs(System.currentTimeMillis() - C3578ax.this.f16028b.m15366b()) > 86400000) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            return;
                                        }
                                    }
                                    C3579ay c3579ay = C3578ax.this.f16028b;
                                    if (Math.abs(System.currentTimeMillis() - c3579ay.m15366b()) > Math.max(600L, Math.min(c3579ay.f16039a.m15400b("req_interval", 1800L), 86400L)) * 1000) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        return;
                                    }
                                    C3578ax.this.f16028b.f16039a.m15395a("req_ts", System.currentTimeMillis());
                                    if (C3637d.m15612h(C3706y.m15840a())) {
                                        C3578ax c3578ax3 = C3578ax.this;
                                        String str12 = r2;
                                        Application m15840a = C3706y.m15840a();
                                        String zid = UMUtils.getZid(m15840a);
                                        if (TextUtils.isEmpty(zid)) {
                                            UPLog.m15198i("Notify", "zid skip.");
                                            return;
                                        }
                                        String registrationId = PushAgent.getInstance(m15840a).getRegistrationId();
                                        if (TextUtils.isEmpty(registrationId)) {
                                            UPLog.m15198i("Notify", "deviceToken skip.");
                                            return;
                                        }
                                        String messageAppkey = PushAgent.getInstance(m15840a).getMessageAppkey();
                                        if (TextUtils.isEmpty(messageAppkey)) {
                                            UPLog.m15198i("Notify", "appkey skip.");
                                            return;
                                        }
                                        String packageName = m15840a.getPackageName();
                                        if (TextUtils.isEmpty(packageName)) {
                                            UPLog.m15198i("Notify", "pkgName skip.");
                                            return;
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C3325bt.f14220al, zid);
                                        jSONObject2.put("appkey", messageAppkey);
                                        jSONObject2.put(C3325bt.f14273o, packageName);
                                        jSONObject2.put(C3325bt.f14161F, C3637d.m15607f());
                                        jSONObject2.put("device_model", C3637d.m15603d());
                                        jSONObject2.put(C3325bt.f14182a, registrationId);
                                        jSONObject2.put(C3325bt.f14283y, Build.VERSION.RELEASE);
                                        jSONObject2.put("sdk_version", MsgConstant.SDK_VERSION);
                                        jSONObject2.put("app_version", C3637d.m15600b(m15840a));
                                        jSONObject2.put("version_code", C3637d.m15596a(m15840a));
                                        jSONObject2.put("ts", System.currentTimeMillis());
                                        if (C3637d.m15614i()) {
                                            jSONObject2.put("harmony_ver", C3637d.m15615j());
                                        }
                                        try {
                                            jSONObject = C3680g.m15764a(jSONObject2, "https://offmsg.umeng.com/v2/offmsg/req", messageAppkey, false);
                                        } catch (Exception e10) {
                                            UPLog.m15198i("Notify", "request fail:", e10.getMessage());
                                            jSONObject = null;
                                        }
                                        if (jSONObject != null && jSONObject.optInt(Constants.KEY_HTTP_CODE) != 13043) {
                                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                            if (optJSONObject == null) {
                                                c3578ax3.f16028b.m15364a(false);
                                                return;
                                            }
                                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("config");
                                            try {
                                                if (optJSONObject2 != null) {
                                                    int optInt = optJSONObject2.optInt("ipad");
                                                    if (optJSONObject2.optInt("aps") == 1) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    String str13 = packageName;
                                                    c3578ax3.f16028b.f16039a.m15395a("req_interval", optInt);
                                                    c3578ax3.f16028b.m15364a(z11);
                                                    String optString = optJSONObject.optString("trace_id");
                                                    JSONArray optJSONArray = optJSONObject.optJSONArray(C3417a.f15001w);
                                                    if (optJSONArray != null && (length = optJSONArray.length()) != 0) {
                                                        int i11 = 5;
                                                        if (length > 5) {
                                                            int i12 = 5;
                                                            while (i12 < length) {
                                                                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                                                                if (optJSONObject3 != null) {
                                                                    optJSONObject3.put(ITagManager.SUCCESS, 0);
                                                                }
                                                                i12++;
                                                                i11 = 5;
                                                            }
                                                        }
                                                        int min = Math.min(i11, length);
                                                        int i13 = 0;
                                                        boolean z13 = false;
                                                        while (i13 < min) {
                                                            String str14 = str11;
                                                            JSONObject optJSONObject4 = optJSONArray.optJSONObject(i13);
                                                            if (optJSONObject4 != null) {
                                                                c3578ax2 = c3578ax3;
                                                                String optString2 = optJSONObject4.optString("pkg");
                                                                String optString3 = optJSONObject4.optString("activity");
                                                                String optString4 = optJSONObject4.optString(str10);
                                                                if (TextUtils.isEmpty(optString2)) {
                                                                    optJSONObject4.put(ITagManager.SUCCESS, 0);
                                                                    str3 = optString;
                                                                    str4 = str8;
                                                                    str5 = str9;
                                                                } else {
                                                                    str5 = str9;
                                                                    String str15 = str13;
                                                                    str6 = str10;
                                                                    str7 = str15;
                                                                    if (TextUtils.equals(optString2, str7)) {
                                                                        optJSONObject4.put(ITagManager.SUCCESS, 0);
                                                                    } else if (TextUtils.isEmpty(optString3)) {
                                                                        optJSONObject4.put(ITagManager.SUCCESS, 0);
                                                                    } else if (TextUtils.isEmpty(optString4)) {
                                                                        optJSONObject4.put(ITagManager.SUCCESS, 0);
                                                                    } else {
                                                                        boolean m15357a = C3578ax.m15357a(m15840a, str12, optString, optString2, optString3);
                                                                        if (!m15357a) {
                                                                            str3 = optString;
                                                                            str4 = str8;
                                                                            optJSONObject4.put("msg", "cur:" + str7 + " start failed:" + optString2);
                                                                        } else {
                                                                            str3 = optString;
                                                                            str4 = str8;
                                                                        }
                                                                        boolean z14 = z13 | m15357a;
                                                                        if (m15357a) {
                                                                            i10 = 1;
                                                                        } else {
                                                                            i10 = 0;
                                                                        }
                                                                        optJSONObject4.put(ITagManager.SUCCESS, i10);
                                                                        if (i13 < min - 1) {
                                                                            try {
                                                                                Thread.sleep(500L);
                                                                            } catch (InterruptedException unused) {
                                                                            }
                                                                        }
                                                                        z13 = z14;
                                                                        i13++;
                                                                        str11 = str14;
                                                                        c3578ax3 = c3578ax2;
                                                                        optString = str3;
                                                                        str9 = str5;
                                                                        str8 = str4;
                                                                        String str16 = str6;
                                                                        str13 = str7;
                                                                        str10 = str16;
                                                                    }
                                                                    str3 = optString;
                                                                    str4 = str8;
                                                                    i13++;
                                                                    str11 = str14;
                                                                    c3578ax3 = c3578ax2;
                                                                    optString = str3;
                                                                    str9 = str5;
                                                                    str8 = str4;
                                                                    String str162 = str6;
                                                                    str13 = str7;
                                                                    str10 = str162;
                                                                }
                                                            } else {
                                                                str3 = optString;
                                                                str4 = str8;
                                                                str5 = str9;
                                                                c3578ax2 = c3578ax3;
                                                            }
                                                            String str17 = str13;
                                                            str6 = str10;
                                                            str7 = str17;
                                                            i13++;
                                                            str11 = str14;
                                                            c3578ax3 = c3578ax2;
                                                            optString = str3;
                                                            str9 = str5;
                                                            str8 = str4;
                                                            String str1622 = str6;
                                                            str13 = str7;
                                                            str10 = str1622;
                                                        }
                                                        String str18 = optString;
                                                        String str19 = str8;
                                                        String str20 = str9;
                                                        C3578ax c3578ax4 = c3578ax3;
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        JSONObject jSONObject4 = new JSONObject();
                                                        jSONObject4.put("din", C3637d.m15602c(m15840a));
                                                        jSONObject4.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
                                                        jSONObject4.put("push_switch", C3637d.m15624p(m15840a));
                                                        jSONObject3.put("header", jSONObject4);
                                                        JSONObject jSONObject5 = new JSONObject();
                                                        jSONObject5.put("pa", "");
                                                        jSONObject5.put("action_type", 70);
                                                        jSONObject5.put("device_token", PushAgent.getInstance(m15840a).getRegistrationId());
                                                        jSONObject5.put("msg_id", "");
                                                        jSONObject5.put("activity", str12);
                                                        jSONObject5.put("putar", optJSONArray);
                                                        jSONObject5.put(str19, str18);
                                                        jSONObject5.put(str20, System.currentTimeMillis());
                                                        JSONArray jSONArray = new JSONArray();
                                                        jSONArray.put(jSONObject5);
                                                        JSONObject jSONObject6 = new JSONObject();
                                                        jSONObject6.put("push", jSONArray);
                                                        jSONObject3.put("content", jSONObject6);
                                                        UMWorkDispatch.sendEvent(m15840a, 16385, C3704w.m15832a(), jSONObject3.toString());
                                                        if (z13) {
                                                            try {
                                                                UPushMessageNotifyApi.Callback callback = c3578ax4.f16027a;
                                                                if (callback != null) {
                                                                    callback.onNotifying();
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (Throwable unused2) {
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                c3578ax3.f16028b.m15364a(false);
                                            } catch (Throwable th) {
                                                th = th;
                                                str = str2;
                                                UPLog.m15196e(str, th);
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str = "Notify";
                                }
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };

    /* renamed from: j */
    private final ComponentCallbacks2 f16609j = new ComponentCallbacks2() { // from class: com.umeng.message.proguard.u.2
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i10) {
            if (i10 == 20) {
                C3702u.m15823e(C3702u.this);
            }
        }
    };

    private C3702u() {
    }

    /* renamed from: b */
    static /* synthetic */ boolean m15817b(C3702u c3702u) {
        c3702u.f16603d = true;
        return true;
    }

    /* renamed from: d */
    public static Activity m15820d() {
        WeakReference<Activity> weakReference = f16600a.f16601b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public static long m15822e() {
        C3702u c3702u = f16600a;
        if (c3702u.f16602c) {
            return SystemClock.elapsedRealtime() - c3702u.f16605f;
        }
        return 0L;
    }

    /* renamed from: b */
    public static void m15816b() {
        C3702u c3702u = f16600a;
        if (c3702u.f16607h == null) {
            c3702u.f16607h = new C3701t();
        }
    }

    /* renamed from: c */
    public static boolean m15819c() {
        return f16600a.f16602c;
    }

    /* renamed from: a */
    public static void m15814a() {
        C3702u c3702u = f16600a;
        if (c3702u.f16604e) {
            return;
        }
        try {
            Application m15840a = C3706y.m15840a();
            if (m15840a != null) {
                m15840a.registerActivityLifecycleCallbacks(c3702u.f16608i);
                m15840a.registerComponentCallbacks(c3702u.f16609j);
                c3702u.f16604e = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m15821d(C3702u c3702u) {
        if (c3702u.f16602c) {
            return;
        }
        c3702u.f16602c = true;
        c3702u.f16603d = false;
        c3702u.f16605f = SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    static /* synthetic */ void m15823e(C3702u c3702u) {
        if (c3702u.f16602c) {
            c3702u.f16602c = false;
            c3702u.f16605f = 0L;
            c3702u.f16606g = System.currentTimeMillis();
        }
    }
}
