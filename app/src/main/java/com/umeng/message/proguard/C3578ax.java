package com.umeng.message.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.ax */
/* loaded from: classes3.dex */
final class C3578ax {

    /* renamed from: a */
    UPushMessageNotifyApi.Callback f16027a;

    /* renamed from: b */
    final C3579ay f16028b = new C3579ay();

    /* renamed from: c */
    boolean f16029c;

    /* renamed from: a */
    public final void m15359a() {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.ax.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = false;
                if (!C3578ax.this.f16028b.f16039a.m15403b("sync", false)) {
                    return;
                }
                boolean m15365a = C3578ax.this.f16028b.m15365a();
                try {
                    if (C3637d.m15612h(C3706y.m15840a())) {
                        z10 = C3578ax.m15358a(m15365a);
                    }
                } catch (Throwable th) {
                    UPLog.m15196e("Notify", th);
                }
                C3578ax.this.f16028b.m15367b(!z10);
            }
        });
    }

    /* renamed from: a */
    public final void m15360a(Activity activity, final Intent intent) {
        this.f16029c = true;
        if (activity == null || intent == null) {
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        final String name = activity.getClass().getName();
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.ax.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C3578ax c3578ax = C3578ax.this;
                    Context context = applicationContext;
                    Intent intent2 = intent;
                    String str = name;
                    c3578ax.f16028b.m15363a(System.currentTimeMillis());
                    String stringExtra = intent2.getStringExtra("data");
                    String stringExtra2 = intent2.getStringExtra("pkg");
                    intent2.removeExtra("data");
                    intent2.removeExtra("pkg");
                    if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                        String str2 = new String(C3588bf.m15405a("dUxpNC9mNCtQYjM5LlQxOQ=="));
                        byte[] m15405a = C3588bf.m15405a("bm1ldWcuZjkvT20rTDgyMw==");
                        String m15428b = C3593bk.m15428b(stringExtra2, str2, m15405a);
                        String m15428b2 = C3593bk.m15428b(stringExtra, str2, m15405a);
                        if (!TextUtils.isEmpty(m15428b2) && !TextUtils.isEmpty(m15428b)) {
                            JSONObject jSONObject = new JSONObject(m15428b2);
                            jSONObject.put("activity", str);
                            C3579ay c3579ay = c3578ax.f16028b;
                            String jSONObject2 = jSONObject.toString();
                            String str3 = null;
                            if (jSONObject2 != null) {
                                try {
                                    str3 = C3588bf.m15404a(jSONObject2.getBytes());
                                } catch (Exception unused) {
                                }
                            }
                            c3579ay.f16039a.m15396a("info", str3);
                            jSONObject.put("action_type", 71);
                            jSONObject.put("device_token", PushAgent.getInstance(context).getRegistrationId());
                            jSONObject.put("msg_id", "");
                            jSONObject.put("pa", "");
                            jSONObject.put("ts", System.currentTimeMillis());
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("din", C3637d.m15602c(context));
                            jSONObject4.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
                            jSONObject4.put("push_switch", C3637d.m15624p(context));
                            jSONObject3.put("header", jSONObject4);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("push", jSONArray);
                            jSONObject3.put("content", jSONObject5);
                            UMWorkDispatch.sendEvent(context, 16385, C3704w.m15832a(), jSONObject3.toString());
                            try {
                                UPushMessageNotifyApi.Callback callback = c3578ax.f16027a;
                                if (callback != null) {
                                    callback.onNotified();
                                    c3578ax.f16029c = false;
                                    return;
                                }
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                        c3578ax.f16028b.m15363a(0L);
                        return;
                    }
                    c3578ax.f16028b.m15363a(0L);
                } catch (Throwable th) {
                    UPLog.m15196e("Notify", th);
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m15358a(boolean z10) {
        JSONObject jSONObject;
        Application m15840a = C3706y.m15840a();
        String zid = UMUtils.getZid(m15840a);
        if (TextUtils.isEmpty(zid)) {
            UPLog.m15198i("Notify", "zid skip.");
            return false;
        }
        String messageAppkey = PushAgent.getInstance(m15840a).getMessageAppkey();
        if (TextUtils.isEmpty(messageAppkey)) {
            UPLog.m15198i("Notify", "appkey skip.");
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C3325bt.f14220al, zid);
        jSONObject2.put("ts", System.currentTimeMillis());
        jSONObject2.put("appkey", messageAppkey);
        jSONObject2.put("dps", z10 ? 1 : 0);
        try {
            jSONObject = C3680g.m15764a(jSONObject2, "https://offmsg.umeng.com/v2/offmsg/switch", messageAppkey, false);
        } catch (Exception e10) {
            UPLog.m15198i("Notify", "uploadEnableState error:", e10.getMessage());
            jSONObject = null;
        }
        return jSONObject != null;
    }

    /* renamed from: a */
    static boolean m15357a(Context context, String str, String str2, String str3, String str4) {
        try {
            String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
            ComponentName componentName = new ComponentName(str3, str4);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trace_id", str2);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appkey", messageAppkey);
            jSONObject2.put("pkg", context.getPackageName());
            jSONObject2.put("activity", str);
            jSONObject2.put(ITagManager.SUCCESS, 1);
            jSONArray.put(jSONObject2);
            jSONObject.put("pusor", jSONArray);
            String jSONObject3 = jSONObject.toString();
            String str5 = new String(C3588bf.m15405a("dUxpNC9mNCtQYjM5LlQxOQ=="));
            byte[] m15405a = C3588bf.m15405a("bm1ldWcuZjkvT20rTDgyMw==");
            String m15427a = C3593bk.m15427a(context.getPackageName(), str5, m15405a);
            String m15427a2 = C3593bk.m15427a(jSONObject3, str5, m15405a);
            Intent intent = new Intent();
            intent.putExtra("data", m15427a2);
            intent.putExtra("pkg", m15427a);
            intent.setPackage(str3);
            intent.setComponent(componentName);
            intent.setFlags(268468224);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void m15361a(JSONObject jSONObject) {
        try {
            if (this.f16028b.m15368c()) {
                String m15369d = this.f16028b.m15369d();
                if (TextUtils.isEmpty(m15369d)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(m15369d);
                jSONObject.put("activity", jSONObject2.optString("activity"));
                jSONObject.put("pusor", jSONObject2.optJSONArray("pusor"));
                jSONObject.put("trace_id", jSONObject2.optString("trace_id"));
            }
        } catch (Throwable th) {
            UPLog.m15197e("Notify", "handle msg arrived error:", th);
        }
    }
}
