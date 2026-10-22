package com.umeng.message.proguard;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import anet.channel.util.HttpConstant;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.proguard.AbstractC3627cq;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.dy */
/* loaded from: classes3.dex */
public final class C3663dy {

    /* renamed from: a */
    private static Boolean f16450a;

    /* renamed from: b */
    private static String f16451b;

    /* renamed from: c */
    private static String f16452c;

    /* renamed from: d */
    private static Boolean f16453d;

    /* renamed from: e */
    private static Boolean f16454e;

    /* renamed from: a */
    public static void m15708a(Context context, C3621ck c3621ck, AbstractC3627cq.a aVar) {
        boolean z10;
        if (context == null || c3621ck == null) {
            return;
        }
        try {
            int m15531k = c3621ck.m15531k();
            if (m15531k > 0 && m15531k <= 6 && m15531k != 5) {
                try {
                    z10 = m15712a(context, c3621ck);
                    try {
                        try {
                            c3621ck.f16166b.put("clk_tp", 1);
                        } catch (ActivityNotFoundException e10) {
                            e = e10;
                            C3615ce.m15509a("Utils", "start fail:", e.getMessage());
                            String optString = c3621ck.f16166b.optString("lp");
                            c3621ck.m15527g();
                            z10 = m15714a(c3621ck, context, optString);
                            if (z10) {
                                c3621ck.f16166b.put("clk_tp", 2);
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C3615ce.m15509a("Utils", "error:", th.getMessage());
                            return;
                        } finally {
                            C3628cr.m15569a().mo15561a(c3621ck, z10, aVar);
                        }
                    }
                } catch (ActivityNotFoundException e11) {
                    e = e11;
                }
                return;
            }
            C3628cr.m15569a().mo15561a(c3621ck, false, aVar);
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
    }

    /* renamed from: b */
    private static String m15715b(Context context) {
        if (!TextUtils.isEmpty(f16452c)) {
            return f16452c;
        }
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = UMFrUtils.getCurrentProcessName(context);
        }
        f16452c = str;
        return str;
    }

    /* renamed from: b */
    public static boolean m15716b() {
        Boolean bool = f16454e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = null;
        try {
            bool2 = (Boolean) C3669ec.m15724a(UMConfigure.class.getName(), "isSilentMode", null, null);
        } catch (Throwable unused) {
        }
        Boolean valueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        f16454e = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    private static void m15709a(Intent intent, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (intent == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("sdk_extra")) == null || optJSONObject.length() == 0) {
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (next != null) {
                intent.putExtra(next, optString);
            }
        }
    }

    /* renamed from: a */
    private static boolean m15712a(Context context, C3621ck c3621ck) {
        Intent intent;
        boolean booleanValue;
        int m15531k = c3621ck.m15531k();
        String optString = c3621ck.f16166b.optString("dl");
        if (m15531k == 3) {
            String m15530j = c3621ck.m15530j();
            String optString2 = c3621ck.f16166b.optString("param_k");
            String optString3 = c3621ck.f16166b.optString("param_v");
            intent = context.getPackageManager().getLaunchIntentForPackage(m15530j);
            if (intent != null) {
                if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                    intent.putExtra(optString2, optString3);
                }
                m15709a(intent, c3621ck.f16166b);
            } else {
                throw new ActivityNotFoundException("app not found:".concat(String.valueOf(m15530j)));
            }
        } else if (m15531k == 4) {
            String m15530j2 = c3621ck.m15530j();
            String optString4 = c3621ck.f16166b.optString("param_k");
            String optString5 = c3621ck.f16166b.optString("param_v");
            Intent intent2 = new Intent();
            intent2.setPackage(m15530j2);
            intent2.setClassName(m15530j2, optString);
            if (!TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                intent2.putExtra(optString4, optString5);
            }
            m15709a(intent2, c3621ck.f16166b);
            intent = intent2;
        } else {
            if (m15531k == 2) {
                c3621ck.m15527g();
                return m15714a(c3621ck, context, optString);
            }
            if (m15531k == 6) {
                C3615ce.m15511c("Utils", "not support download apk");
                return false;
            }
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri parse = Uri.parse(optString);
            intent.setData(parse);
            Boolean bool = f16450a;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (Build.VERSION.SDK_INT < 30) {
                    f16450a = Boolean.TRUE;
                } else if (context.getApplicationInfo().targetSdkVersion < 30) {
                    f16450a = Boolean.TRUE;
                } else {
                    Boolean valueOf = Boolean.valueOf(UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES"));
                    f16450a = valueOf;
                    booleanValue = valueOf.booleanValue();
                }
                booleanValue = true;
            }
            if (booleanValue && intent.resolveActivity(context.getPackageManager()) == null) {
                C3615ce.m15509a("Utils", "cant find dl:", parse.getScheme(), HttpConstant.SCHEME_SPLIT, parse.getHost());
                C3628cr.m15569a().mo15562a("deeplink_fail", c3621ck);
                throw new ActivityNotFoundException("cant find dl!");
            }
        }
        intent.addFlags(805339136);
        try {
            context.startActivity(intent);
            C3628cr.m15569a().mo15562a("deeplink_suc", c3621ck);
            return true;
        } catch (Throwable th) {
            C3628cr.m15569a().mo15562a("deeplink_fail", c3621ck);
            throw new ActivityNotFoundException(th.getMessage());
        }
    }

    /* renamed from: a */
    private static boolean m15714a(C3621ck c3621ck, Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C3615ce.m15509a("Utils", "start landingPage url:", str);
        C3628cr.m15569a().mo15557a(c3621ck);
        return m15713a(context, str);
    }

    /* renamed from: a */
    private static boolean m15713a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            C3615ce.m15512d("Utils", "start url:", str, " error:", th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static void m15710a(String str, String str2) {
        try {
            Method declaredMethod = UMConfigure.class.getDeclaredMethod("setModuleTag", UMConfigure.BS_TYPE.class, String.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, UMConfigure.BS_TYPE.PUSH, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized String m15705a() {
        String str;
        synchronized (C3663dy.class) {
            String str2 = f16451b;
            if (str2 != null) {
                return str2;
            }
            Context m15638a = C3643de.m15638a();
            if (!m15711a(m15638a)) {
                return "";
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                str = WebSettings.getDefaultUserAgent(m15638a);
            } catch (Throwable unused) {
                str = null;
            }
            C3615ce.m15509a("Load", "get ua consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            if (str == null) {
                str = "";
            }
            f16451b = str;
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m15711a(Context context) {
        Boolean bool = f16453d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        Boolean valueOf = Boolean.valueOf(!TextUtils.isEmpty(packageName) && TextUtils.equals(m15715b(context), packageName));
        f16453d = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public static String m15706a(String str, C3621ck c3621ck) {
        if (c3621ck == null || TextUtils.isEmpty(str)) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String m15707a = m15707a(m15707a(str, "__TS_MS__", Long.valueOf(currentTimeMillis)), "__TS__", Long.valueOf(currentTimeMillis / 1000));
        int i10 = c3621ck.f16170f;
        if (i10 != -1) {
            m15707a = m15707a(m15707a(m15707a, "__VIDEO_MS__", Integer.valueOf(i10)), "__VIDEO_S__", Integer.valueOf(c3621ck.f16170f / 1000));
        }
        int i11 = c3621ck.f16171g;
        if (i11 != -1) {
            m15707a = m15707a(m15707a, "__SLOT_W__", Integer.valueOf(i11));
        }
        int i12 = c3621ck.f16172h;
        if (i12 != -1) {
            m15707a = m15707a(m15707a, "__SLOT_H__", Integer.valueOf(i12));
        }
        long j10 = c3621ck.f16173i;
        if (j10 != -1) {
            m15707a = m15707a(m15707a, "__RESPONSE_TIME__", Long.valueOf(j10));
        }
        if (c3621ck.f16173i != -1) {
            m15707a = m15707a(m15707a, "__READY_TIME__", Long.valueOf(c3621ck.f16174j));
        }
        long j11 = c3621ck.f16175k;
        if (j11 != -1) {
            m15707a = m15707a(m15707a, "__SHOW_TIME__", Long.valueOf(j11));
        }
        long j12 = c3621ck.f16176l;
        if (j12 != -1) {
            m15707a = m15707a(m15707a, "__CLICK_TIME__", Long.valueOf(j12));
        }
        float f10 = c3621ck.f16177m;
        if (f10 != -1.0f && c3621ck.f16178n != -1.0f) {
            m15707a = m15707a(m15707a(m15707a, "__DOWN_X__", Float.valueOf(f10)), "__DOWN_Y__", Float.valueOf(c3621ck.f16178n));
        }
        float f11 = c3621ck.f16179o;
        if (f11 != -1.0f && c3621ck.f16180p != -1.0f) {
            m15707a = m15707a(m15707a(m15707a, "__UP_X__", Float.valueOf(f11)), "__UP_Y__", Float.valueOf(c3621ck.f16180p));
        }
        float f12 = c3621ck.f16181q;
        if (f12 != -1.0f && c3621ck.f16182r != -1.0f) {
            m15707a = m15707a(m15707a(m15707a, "__PNT_DOWN_X__", Float.valueOf(f12)), "__PNT_DOWN_Y__", Float.valueOf(c3621ck.f16182r));
        }
        float f13 = c3621ck.f16183s;
        return (f13 == -1.0f || c3621ck.f16184t == -1.0f) ? m15707a : m15707a(m15707a(m15707a, "__PNT_UP_X__", Float.valueOf(f13)), "__PNT_UP_Y__", Float.valueOf(c3621ck.f16184t));
    }

    /* renamed from: a */
    private static String m15707a(String str, String str2, Object obj) {
        return str == null ? "" : (obj != null && str.contains(str2)) ? str.replaceAll(str2, String.valueOf(obj)) : str;
    }
}
