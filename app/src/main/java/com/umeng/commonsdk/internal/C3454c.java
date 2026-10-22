package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3311bf;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3327bv;
import com.umeng.analytics.pro.C3328bw;
import com.umeng.analytics.pro.C3329bx;
import com.umeng.analytics.pro.C3395q;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C3482b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.C3491c;
import com.umeng.commonsdk.statistics.idtracking.C3497i;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.c */
/* loaded from: classes3.dex */
public class C3454c implements UMLogDataProtocol {

    /* renamed from: b */
    public static final String f15291b = "preInitInvokedFlag";

    /* renamed from: c */
    public static final String f15292c = "policyGrantInvokedFlag";

    /* renamed from: d */
    public static final String f15293d = "policyGrantResult";

    /* renamed from: f */
    private static int f15294f = 1;

    /* renamed from: e */
    private Context f15302e;

    /* renamed from: a */
    public static final String f15290a = C3309bd.m13860b().m13863b(C3309bd.f14110q);

    /* renamed from: g */
    private static Class<?> f15295g = null;

    /* renamed from: h */
    private static Method f15296h = null;

    /* renamed from: i */
    private static Method f15297i = null;

    /* renamed from: j */
    private static Method f15298j = null;

    /* renamed from: k */
    private static volatile String f15299k = "";

    /* renamed from: l */
    private static volatile String f15300l = "";

    /* renamed from: m */
    private static boolean f15301m = false;

    static {
        m14614c();
    }

    public C3454c(Context context) {
        if (context != null) {
            this.f15302e = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static String m14612b() {
        Method method;
        if (!TextUtils.isEmpty(f15300l)) {
            return f15300l;
        }
        Class<?> cls = f15295g;
        if (cls == null || (method = f15296h) == null || f15298j == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) f15298j.invoke(invoke, new Object[0]);
            try {
                f15300l = str;
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: c */
    private static void m14614c() {
        try {
            f15295g = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f15296h = declaredMethod;
            }
            Method declaredMethod2 = f15295g.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f15297i = declaredMethod2;
            }
            Method declaredMethod3 = f15295g.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f15298j = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m14616d() {
        C3327bv m13985a = C3327bv.m13985a(this.f15302e);
        C3328bw m13990a = m13985a.m13990a(C3329bx.f14343c);
        if (m13990a != null) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = m13990a.f14335a;
                String str2 = m13990a.f14336b;
                JSONObject m14753a = new C3482b().m14753a(this.f15302e.getApplicationContext(), new JSONObject(m13990a.f14337c), new JSONObject(m13990a.f14338d), m13990a.f14339e, str2, m13990a.f14340f);
                if (m14753a != null && m14753a.has("exception")) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                } else {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                }
                m13985a.m13992a(C3329bx.f14343c, str);
                m13985a.m13994b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private void m14618e() {
        if (!f15301m) {
            if (FieldManager.allow(C3520d.f15636G)) {
                f15301m = true;
                m14610a(this.f15302e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (TextUtils.isEmpty(str)) {
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                            return;
                        }
                        try {
                            SharedPreferences sharedPreferences = C3454c.this.f15302e.getSharedPreferences(C3497i.f15477a, 0);
                            if (sharedPreferences != null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putString(C3497i.f15478b, str);
                                edit.commit();
                            }
                        } catch (Throwable unused) {
                        }
                        UMWorkDispatch.sendEvent(C3454c.this.f15302e, C3452a.f15283w, C3453b.m14605a(C3454c.this.f15302e).m14606a(), null);
                    }
                });
                return;
            }
            return;
        }
        if (FieldManager.allow(C3520d.f15636G)) {
            return;
        }
        f15301m = false;
    }

    /* renamed from: f */
    private void m14620f() {
        if (FieldManager.allow(C3520d.f15636G)) {
            f15301m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.f15302e);
            f15294f++;
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (C3454c.this.f15302e != null) {
                        UMWorkDispatch.sendEvent(C3454c.this.f15302e, C3452a.f15284x, C3453b.m14605a(C3454c.this.f15302e).m14606a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            m14611a(this.f15302e, true);
        }
    }

    /* renamed from: g */
    private void m14622g() {
        if (f15294f <= 0) {
            m14623h();
            m14619e(this.f15302e);
        }
    }

    /* renamed from: h */
    private void m14623h() {
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f15302e)) {
            m14621f(this.f15302e);
            UMInnerManager.sendInnerPackage(this.f15302e);
            if (!FieldManager.allow(C3520d.f15676at) && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.f15302e)) {
                Context context = this.f15302e;
                UMWorkDispatch.sendEvent(context, C3452a.f15255G, C3453b.m14605a(context).m14606a(), null, 5000L);
            }
            Context context2 = this.f15302e;
            UMWorkDispatch.sendEvent(context2, C3395q.a.f14882z, CoreProtocol.getInstance(context2), null);
            Context context3 = this.f15302e;
            UMWorkDispatch.sendEvent(context3, C3452a.f15280t, C3453b.m14605a(context3).m14606a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j10) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02be A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:22:0x008d, B:24:0x0095, B:26:0x00a4, B:27:0x00a7, B:28:0x00b2, B:49:0x0114, B:53:0x0146, B:60:0x015e, B:62:0x017a, B:64:0x0180, B:65:0x0190, B:67:0x01bb, B:73:0x01c5, B:75:0x01c9, B:77:0x01dd, B:102:0x027a, B:104:0x0291, B:106:0x029c, B:109:0x02a3, B:111:0x02a9, B:113:0x02b4, B:117:0x02be, B:119:0x02c4, B:121:0x02d0, B:123:0x02d7), top: B:19:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7 A[Catch: all -> 0x0432, TRY_LEAVE, TryCatch #0 {all -> 0x0432, blocks: (B:22:0x008d, B:24:0x0095, B:26:0x00a4, B:27:0x00a7, B:28:0x00b2, B:49:0x0114, B:53:0x0146, B:60:0x015e, B:62:0x017a, B:64:0x0180, B:65:0x0190, B:67:0x01bb, B:73:0x01c5, B:75:0x01c9, B:77:0x01dd, B:102:0x027a, B:104:0x0291, B:106:0x029c, B:109:0x02a3, B:111:0x02a9, B:113:0x02b4, B:117:0x02be, B:119:0x02c4, B:121:0x02d0, B:123:0x02d7), top: B:19:0x007b }] */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.C3454c.workEvent(java.lang.Object, int):void");
    }

    /* renamed from: a */
    public String m14624a() {
        Method method;
        if (!TextUtils.isEmpty(f15299k)) {
            return f15299k;
        }
        Class<?> cls = f15295g;
        if (cls == null || (method = f15296h) == null || f15297i == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) f15297i.invoke(invoke, this.f15302e);
            try {
                f15299k = str;
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: b */
    private void m14613b(Context context) {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, C3325bt.f14265g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3482b.m14744a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(C3482b.m14744a(C3325bt.f14265g), imprintProperty);
            JSONObject buildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (buildSilentEnvelopeWithExtHeader != null && buildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            } else {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m14609a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3482b.m14744a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(C3482b.m14744a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(C3482b.m14744a("os"), "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (buildZeroEnvelopeWithExtHeader != null && buildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m14619e(Context context) {
        Object invoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> m14608a = m14608a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = m14608a.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (invoke = declaredMethod2.invoke(m14608a, new Object[0])) == null || (declaredMethod = m14608a.getDeclaredMethod("init", Context.class, String.class, m14608a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(invoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m14615c(final Context context) {
        if (FieldManager.allow(C3520d.f15636G)) {
            m14610a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(C3497i.f15477a, 0);
                        if (sharedPreferences != null && !sharedPreferences.getString(C3497i.f15478b, "").equalsIgnoreCase(str)) {
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(C3497i.f15478b, str);
                            edit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private static void m14621f(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + C3329bx.f14352l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m14611a(final Context context, final boolean z10) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C3497i.f15477a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String m13866a = C3311bf.m13866a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(m13866a) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(C3497i.f15479c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(C3497i.f15478b, m13866a);
                        edit2.commit();
                    }
                    if (DeviceConfig.isHonorDevice() && sharedPreferences != null) {
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        edit3.putString(C3491c.f15454b, m13866a);
                        edit3.commit();
                    }
                    if (z10) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14617d(android.content.Context r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = com.umeng.common.C3422b.m14517a(r11, r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L92
            java.lang.String r3 = "startTime"
            java.lang.String r3 = com.umeng.common.C3422b.m14517a(r11, r0, r3)
            java.lang.String r4 = "period"
            java.lang.String r0 = com.umeng.common.C3422b.m14517a(r11, r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L2f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
        L2f:
            r3 = r5
        L30:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L40
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
        L40:
            r7 = r5
        L41:
            java.lang.String r0 = "MobclickRT"
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L88
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L4c
            goto L88
        L4c:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r3 = 60
            long r7 = r7 * r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L71
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.m14569i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.C3422b.m14518a(r11, r0)
            boolean r11 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r11 == 0) goto L92
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L92
        L71:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r1, r2)
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r1 != 0) goto L92
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.m14569i(r0, r1)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r11)
            goto L92
        L88:
            java.lang.String r1 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.m14569i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.C3422b.m14518a(r11, r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.C3454c.m14617d(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m14610a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String m13866a = C3311bf.m13866a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(m13866a);
                }
            }
        }).start();
    }

    /* renamed from: a */
    private static Class<?> m14608a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
