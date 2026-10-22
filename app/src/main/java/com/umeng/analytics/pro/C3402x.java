package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3389k;
import com.umeng.analytics.pro.C3395q;
import com.umeng.analytics.vshelper.InterfaceC3415a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.x */
/* loaded from: classes3.dex */
public class C3402x {

    /* renamed from: c */
    private static final int f14925c = 5;

    /* renamed from: d */
    private static JSONArray f14926d = new JSONArray();

    /* renamed from: e */
    private static Object f14927e = new Object();

    /* renamed from: f */
    private final Map<String, Long> f14930f = new HashMap();

    /* renamed from: a */
    Stack<String> f14928a = new Stack<>();

    /* renamed from: b */
    InterfaceC3415a f14929b = PageNameMonitor.getInstance();

    /* renamed from: a */
    protected int mo14297a() {
        return 2;
    }

    /* renamed from: b */
    public void m14440b(String str) {
        Long l10;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f14930f.containsKey(str)) {
            synchronized (this.f14930f) {
                l10 = this.f14930f.get(str);
                this.f14930f.remove(str);
            }
            if (l10 == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.f14928a.size() > 0 && str.equals(this.f14928a.peek())) {
                this.f14928a.pop();
            }
            long currentTimeMillis = System.currentTimeMillis() - l10.longValue();
            synchronized (f14927e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3384f.f14627v, str);
                    jSONObject.put("duration", currentTimeMillis);
                    jSONObject.put(C3384f.f14629x, l10);
                    jSONObject.put("type", mo14297a());
                    f14926d.put(jSONObject);
                    if (f14926d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                        UMWorkDispatch.sendEvent(appContext, C3395q.a.f14859c, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.f14928a.size() == 0) {
                return;
            }
            UMLog.m14564aq(C3390l.f14731E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
            return;
        }
        if (UMConfigure.isDebugLog() && this.f14928a.size() == 0) {
            UMLog.m14564aq(C3390l.f14733G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    /* renamed from: a */
    public static void m14437a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f14927e) {
                    jSONArray = f14926d.toString();
                    f14926d = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        C3389k.m14262a(context).m14281a(C3401w.m14419a().m14433c(), jSONObject, C3389k.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m14438a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f14928a.size() != 0) {
            String[] strArr = {this.f14928a.peek()};
            UMLog.m14564aq(C3390l.f14732F, 0, "\\|", new String[]{"@"}, strArr, null, null);
        }
        this.f14929b.customPageBegin(str);
        synchronized (this.f14930f) {
            this.f14930f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f14928a.push(str);
            }
        }
    }

    /* renamed from: b */
    public void m14439b() {
        String str;
        synchronized (this.f14930f) {
            str = null;
            long j10 = 0;
            for (Map.Entry<String, Long> entry : this.f14930f.entrySet()) {
                if (entry.getValue().longValue() > j10) {
                    long longValue = entry.getValue().longValue();
                    str = entry.getKey();
                    j10 = longValue;
                }
            }
        }
        if (str != null) {
            m14440b(str);
        }
    }
}
