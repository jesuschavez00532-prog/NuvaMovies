package com.umeng.pagesdk;

import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.pagesdk.C3714b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.pagesdk.d */
/* loaded from: classes3.dex */
public final class C3716d {

    /* renamed from: a */
    private static Map<String, Map> f16720a = new HashMap();

    /* renamed from: b */
    private static C3715c f16721b;

    /* renamed from: a */
    private static void m15875a(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = f16720a.get(str)) == null || (r0 = map.entrySet().iterator()) == null) {
            return;
        }
        JSONArray jSONArray = null;
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                String str2 = (String) entry.getKey();
                Long[] lArr = (Long[]) entry.getValue();
                if (!TextUtils.isEmpty(str2) && lArr != null && lArr.length >= 2) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("mN", str2);
                        jSONObject.put("mBT", lArr[0]);
                        jSONObject.put("mET", lArr[1]);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        if (jSONArray != null) {
            final JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pN", str);
                jSONObject2.put("pL", jSONArray);
                C3714b.m15864a(PageManger.getApplicationContext()).m15868a(new C3714b.b() { // from class: com.umeng.pagesdk.d.1
                    @Override // com.umeng.pagesdk.C3714b.b
                    /* renamed from: a */
                    public final void mo15870a(C3713a c3713a) {
                        try {
                            jSONObject2.put("te", c3713a.f16697c);
                            jSONObject2.put("le", c3713a.f16695a);
                            EfsJSONLog efsJSONLog = new EfsJSONLog("pageperf");
                            efsJSONLog.put("page", jSONObject2);
                            EfsReporter reporter = PageManger.getReporter();
                            if (reporter != null) {
                                reporter.send(efsJSONLog);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                });
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m15877b(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. parameter null!");
                return;
            }
            return;
        }
        if (!PageManger.isInit()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. not init!");
                return;
            }
            return;
        }
        PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
        if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. not rate!");
                return;
            }
            return;
        }
        if (z10) {
            str2 = "UM_".concat(String.valueOf(str2));
        }
        if (!f16720a.containsKey(str)) {
            if (str2.equals("UM_onPause")) {
                if (PageManger.isDebug) {
                    Log.i("PageManger-PageTrace", "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str)));
                }
                C3715c c3715c = f16721b;
                if (c3715c != null) {
                    c3715c.m15874b();
                    return;
                }
                return;
            }
            return;
        }
        Map map = f16720a.get(str);
        if (map == null) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. " + str + " is null in pageMap!");
                return;
            }
            return;
        }
        if (!map.containsKey(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. " + str2 + " non-exist in " + str + " map!");
                return;
            }
            return;
        }
        Long[] lArr = (Long[]) map.get(str2);
        if (lArr.length >= 2) {
            lArr[1] = Long.valueOf(System.currentTimeMillis());
        }
        if (str2.equals("UM_onResume")) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageTrace", "tracePageEnd. onResume save data. ".concat(String.valueOf(str)));
            }
            m15875a(str);
            if (TextUtils.isEmpty(str) || !f16720a.containsKey(str)) {
                return;
            }
            f16720a.remove(str);
            return;
        }
        if (str2.equals("UM_onPause")) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageTrace", "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str)));
            }
            C3715c c3715c2 = f16721b;
            if (c3715c2 != null) {
                c3715c2.m15874b();
                f16721b = null;
            }
        }
    }

    /* renamed from: a */
    public static void m15876a(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. parameter null!");
                return;
            }
            return;
        }
        if (!PageManger.isInit()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. not init!");
                return;
            }
            return;
        }
        PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
        if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. not rate!");
                return;
            }
            return;
        }
        if (z10) {
            str2 = "UM_".concat(String.valueOf(str2));
        }
        if (!f16720a.containsKey(str)) {
            if (str2.equals("UM_onCreate")) {
                if (PageManger.isDebug) {
                    Log.i("PageManger-PageTrace", "tracePageBegin. begin add onCreate. " + str2 + " - " + str);
                }
                Long[] lArr = new Long[2];
                lArr[0] = Long.valueOf(System.currentTimeMillis());
                HashMap hashMap = new HashMap();
                hashMap.put(str2, lArr);
                f16720a.put(str, hashMap);
                C3715c c3715c = f16721b;
                if (c3715c != null) {
                    c3715c.m15874b();
                    C3715c c3715c2 = f16721b;
                    c3715c2.f16716j = str;
                    c3715c2.m15873a();
                    return;
                }
                C3715c c3715c3 = new C3715c(PageManger.getApplicationContext());
                f16721b = c3715c3;
                c3715c3.f16716j = str;
                c3715c3.m15873a();
                return;
            }
            return;
        }
        Map map = f16720a.get(str);
        if (map == null) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. methodMap null!");
                return;
            }
            return;
        }
        if (map.containsKey(str2)) {
            return;
        }
        if (PageManger.isDebug) {
            Log.i("PageManger-PageTrace", "tracePageBegin. begin add method. " + str2 + " - " + str);
        }
        if (z10 || map.size() <= 6) {
            Long[] lArr2 = new Long[2];
            lArr2[0] = Long.valueOf(System.currentTimeMillis());
            map.put(str2, lArr2);
        } else if (PageManger.isDebug) {
            Log.e("PageManger-PageTrace", "tracePageBegin. user trace number of transfinite. " + str2 + Operator.Operation.MINUS + str);
        }
    }
}
