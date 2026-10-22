package com.umeng.message.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.InAppMessageManager;
import com.umeng.message.proguard.C3560af;
import com.umeng.message.proguard.C3682h;
import java.io.File;
import java.util.Iterator;
import org.android.agoo.message.MessageService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.aj */
/* loaded from: classes3.dex */
public class C3564aj {

    /* renamed from: b */
    private static boolean f15910b;

    /* renamed from: c */
    private static volatile C3564aj f15911c;

    /* renamed from: a */
    private final Context f15912a;

    private C3564aj(Context context) {
        this.f15912a = context.getApplicationContext();
    }

    /* renamed from: b */
    static /* synthetic */ boolean m15307b() {
        f15910b = false;
        return false;
    }

    /* renamed from: c */
    private void m15308c() {
        if (f15910b) {
            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "sendInAppCacheLog已经在队列里，忽略该请求");
            return;
        }
        f15910b = true;
        UMLog.mutlInfo("UmengInAppMessageTracker", 2, "sendInAppCacheLog开始");
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.aj.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Iterator<C3560af> it = InAppMessageManager.getInstance(C3564aj.this.f15912a).m15219b().iterator();
                    while (it.hasNext()) {
                        C3560af next = it.next();
                        JSONObject m15306b = C3564aj.m15306b(next.f15884b, next.f15885c, next.f15886d, next.f15887e, next.f15888f, next.f15889g, next.f15890h, next.f15891i, next.f15892j);
                        if (m15306b != null && TextUtils.equals(m15306b.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.SUCCESS)) {
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(C3564aj.this.f15912a);
                            inAppMessageManager.f15796b.getContentResolver().delete(C3682h.m15771e(inAppMessageManager.f15796b), "MsgId=?", new String[]{next.f15884b});
                        }
                    }
                } catch (Exception e10) {
                    UPLog.m15200w("UmengInAppMessageTracker", "sendInAppCacheLog error:" + e10.getMessage());
                } finally {
                    C3564aj.m15307b();
                }
            }
        });
    }

    /* renamed from: a */
    public static C3564aj m15304a(Context context) {
        if (f15911c == null) {
            synchronized (C3564aj.class) {
                if (f15911c == null) {
                    f15911c = new C3564aj(context);
                }
            }
        }
        return f15911c;
    }

    /* renamed from: b */
    static /* synthetic */ JSONObject m15306b(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", C3665e.m15718a());
        jSONObject.put("msg_id", str);
        jSONObject.put("msg_type", i10);
        jSONObject.put("num_display", i11);
        jSONObject.put("num_open_full", i12);
        jSONObject.put("num_open_top", i13);
        jSONObject.put("num_open_bottom", i14);
        jSONObject.put("num_close", i15);
        jSONObject.put("num_duration", i16);
        jSONObject.put("num_custom", i17);
        return C3680g.m15764a(jSONObject, "https://msg.umengcloud.com/admsg/v3/stats", UMUtils.getAppkey(C3706y.m15840a()), true);
    }

    /* renamed from: a */
    public final void m15309a(final InterfaceC3559ae interfaceC3559ae) {
        if (C3678f.m15752b()) {
            UPLog.m15198i("UmengInAppMessageTracker", "getSplashMsg failed, silent mode!");
        } else {
            m15308c();
            C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.aj.1
                @Override // java.lang.Runnable
                public final void run() {
                    UInAppMessage uInAppMessage;
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get splash message begin");
                    try {
                        JSONObject m15764a = C3680g.m15764a(C3564aj.m15305a(), "https://msg.umengcloud.com/admsg/v3/launch", UMUtils.getAppkey(C3706y.m15840a()), true);
                        if (TextUtils.equals(m15764a.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.SUCCESS)) {
                            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get splash message success".concat(String.valueOf(m15764a)));
                            JSONObject jSONObject = m15764a.getJSONObject("data");
                            InAppMessageManager.f15793d = jSONObject.getInt("pduration") * 1000;
                            InAppMessageManager.f15794e = jSONObject.getInt("sduration") * 1000;
                            interfaceC3559ae.mo15266a(new UInAppMessage(jSONObject.getJSONObject("launch")));
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(C3564aj.this.f15912a);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            inAppMessageManager.m15221b("KEY_SPLASH_TS", sb2.toString());
                            return;
                        }
                        if (TextUtils.equals(m15764a.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.FAIL) && TextUtils.equals(m15764a.getString("error"), "no message")) {
                            String m15212a = InAppMessageManager.getInstance(C3564aj.this.f15912a).m15212a();
                            if (!TextUtils.isEmpty(m15212a)) {
                                try {
                                    uInAppMessage = new UInAppMessage(new JSONObject(m15212a));
                                } catch (JSONException e10) {
                                    e10.printStackTrace();
                                    uInAppMessage = null;
                                }
                                if (uInAppMessage != null) {
                                    InAppMessageManager.getInstance(C3564aj.this.f15912a).m15217a(new File(C3678f.m15744a(C3564aj.this.f15912a, uInAppMessage.msg_id)));
                                    InAppMessageManager.getInstance(C3564aj.this.f15912a).m15215a((UInAppMessage) null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        interfaceC3559ae.mo15266a(null);
                    } catch (Exception e11) {
                        UPLog.m15200w("UmengInAppMessageTracker", "getSplashMsg error: ", e11.getMessage());
                        interfaceC3559ae.mo15266a(null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void m15311a(final String str, final InterfaceC3559ae interfaceC3559ae) {
        if (C3678f.m15752b()) {
            UPLog.m15198i("UmengInAppMessageTracker", "getCardMsg failed, silent mode!");
        } else {
            m15308c();
            C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.aj.2
                @Override // java.lang.Runnable
                public final void run() {
                    UInAppMessage uInAppMessage;
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get card message begin");
                    try {
                        JSONObject m15305a = C3564aj.m15305a();
                        m15305a.put("label", str);
                        JSONObject m15764a = C3680g.m15764a(m15305a, "https://msg.umengcloud.com/admsg/v3/getmsg", UMUtils.getAppkey(C3706y.m15840a()), true);
                        if (TextUtils.equals(m15764a.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.SUCCESS)) {
                            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get card message success".concat(String.valueOf(m15764a)));
                            JSONObject jSONObject = m15764a.getJSONObject("data");
                            InAppMessageManager.f15793d = jSONObject.getInt("pduration") * 1000;
                            InAppMessageManager.f15794e = jSONObject.getInt("sduration") * 1000;
                            interfaceC3559ae.mo15267b(new UInAppMessage(jSONObject.getJSONObject("card")));
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(C3564aj.this.f15912a);
                            String concat = "KEY_CARD_TS_".concat(String.valueOf(m15305a.optString("label", "")));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            inAppMessageManager.m15221b(concat, sb2.toString());
                            return;
                        }
                        if (TextUtils.equals(m15764a.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.FAIL) && TextUtils.equals(m15764a.getString("error"), "no message")) {
                            String m15213a = InAppMessageManager.getInstance(C3564aj.this.f15912a).m15213a(str);
                            if (!TextUtils.isEmpty(m15213a)) {
                                try {
                                    uInAppMessage = new UInAppMessage(new JSONObject(m15213a));
                                } catch (JSONException e10) {
                                    e10.printStackTrace();
                                    uInAppMessage = null;
                                }
                                if (uInAppMessage != null) {
                                    InAppMessageManager.getInstance(C3564aj.this.f15912a).m15217a(new File(C3678f.m15744a(C3564aj.this.f15912a, uInAppMessage.msg_id)));
                                    InAppMessageManager.getInstance(C3564aj.this.f15912a).m15216a((UInAppMessage) null, str);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        interfaceC3559ae.mo15267b(null);
                    } catch (Exception e11) {
                        UPLog.m15200w("UmengInAppMessageTracker", "getCardMsg error: ", e11.getMessage());
                        interfaceC3559ae.mo15267b(null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void m15310a(final String str, final int i10, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17) {
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.aj.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "track in app msg begin");
                    JSONObject m15306b = C3564aj.m15306b(str, i10, i11, i12, i13, i14, i15, i16, i17);
                    if (m15306b != null && TextUtils.equals(m15306b.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.SUCCESS)) {
                        UMLog.mutlInfo("UmengInAppMessageTracker", 2, "track in app msg success");
                    }
                } catch (Exception e10) {
                    UPLog.m15200w("UmengInAppMessageTracker", "trackInAppMessage error:" + e10.getMessage());
                    final InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(C3564aj.this.f15912a);
                    final String str2 = str;
                    final int i18 = i10;
                    final int i19 = i11;
                    final int i20 = i12;
                    final int i21 = i13;
                    final int i22 = i14;
                    final int i23 = i15;
                    final int i24 = i16;
                    final int i25 = i17;
                    if (!TextUtils.isEmpty(str2)) {
                        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.1

                            /* renamed from: a */
                            final /* synthetic */ String f15800a;

                            /* renamed from: b */
                            final /* synthetic */ int f15801b;

                            /* renamed from: c */
                            final /* synthetic */ int f15802c;

                            /* renamed from: d */
                            final /* synthetic */ int f15803d;

                            /* renamed from: e */
                            final /* synthetic */ int f15804e;

                            /* renamed from: f */
                            final /* synthetic */ int f15805f;

                            /* renamed from: g */
                            final /* synthetic */ int f15806g;

                            /* renamed from: h */
                            final /* synthetic */ int f15807h;

                            /* renamed from: i */
                            final /* synthetic */ int f15808i;

                            public RunnableC35411(final String str22, final int i182, final int i192, final int i202, final int i212, final int i222, final int i232, final int i242, final int i252) {
                                r2 = str22;
                                r3 = i182;
                                r4 = i192;
                                r5 = i202;
                                r6 = i212;
                                r7 = i222;
                                r8 = i232;
                                r9 = i242;
                                r10 = i252;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    C3560af m15208a = InAppMessageManager.m15208a(InAppMessageManager.this, r2);
                                    if (m15208a != null) {
                                        InAppMessageManager.this.f15796b.getContentResolver().update(C3682h.m15771e(InAppMessageManager.this.f15796b), new C3560af(r2, r3, m15208a.f15886d + r4, m15208a.f15887e + r5, m15208a.f15888f + r6, m15208a.f15889g + r7, m15208a.f15890h + r8, m15208a.f15891i + r9, m15208a.f15892j).m15291a(), "MsgId=?", new String[]{r2});
                                    } else {
                                        InAppMessageManager.this.f15796b.getContentResolver().insert(C3682h.m15771e(InAppMessageManager.this.f15796b), new C3560af(r2, r3, r4, r5, r6, r7, r8, r9, r10).m15291a());
                                    }
                                    UMLog.mutlInfo("InAppMessageManager", 2, "store in app cache log success");
                                } catch (Exception e11) {
                                    UMLog.mutlInfo("InAppMessageManager", 0, "store in app cache log fail");
                                    e11.printStackTrace();
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ JSONObject m15305a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", C3665e.m15718a());
        jSONObject.put("pmode", InAppMessageManager.f15792a ? MessageService.MSG_DB_READY_REPORT : "1");
        return jSONObject;
    }
}
