package com.umeng.message.proguard;

import android.content.Context;
import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.proguard.AbstractC3627cq;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.cs */
/* loaded from: classes3.dex */
final class C3629cs extends AbstractC3626cp {

    /* renamed from: a */
    private static final AbstractC3626cp f16236a = new C3629cs();

    private C3629cs() {
    }

    /* renamed from: a */
    public static AbstractC3626cp m15570a() {
        return f16236a;
    }

    @Override // com.umeng.message.proguard.AbstractC3626cp
    /* renamed from: a */
    public final synchronized void mo15551a(C3621ck c3621ck, boolean z10, AbstractC3627cq.a aVar) {
        if (!z10) {
            if (aVar != null) {
                aVar.mo15568a("click invalid. start app fail!");
                return;
            } else {
                C3615ce.m15509a("Track", "click invalid. start app fail!");
                return;
            }
        }
        if (c3621ck.f16166b.optBoolean("exposed_timeout", false)) {
            m15555b(c3621ck, 3000);
            C3615ce.m15509a("Track", "click invalid. exposed timeout!");
            return;
        }
        int optInt = c3621ck.f16166b.optInt("clk_tp", 0);
        if (optInt == 1 || optInt == 2) {
            if (c3621ck.f16166b.optBoolean("click_upload", false)) {
                C3615ce.m15509a("Track", "click has report.");
                return;
            }
            c3621ck.f16176l = System.currentTimeMillis();
            JSONArray optJSONArray = c3621ck.f16166b.optJSONArray("clk");
            long m15529i = c3621ck.m15529i();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                boolean z11 = true;
                for (int i10 = 0; i10 < length; i10++) {
                    z11 &= C3613cc.m15504a(5, c3621ck, optJSONArray.optString(i10).replaceAll("__TP__", String.valueOf(optInt)).replaceAll("__CD__", String.valueOf(m15529i)));
                }
                try {
                    c3621ck.f16166b.put("click_upload", z11);
                } catch (Exception unused) {
                }
                if (!z11) {
                    if (aVar != null) {
                        aVar.mo15568a("click invalid. report fail, please check network!");
                        return;
                    }
                    C3615ce.m15510b("Track", "click invalid. report fail, please check network!");
                } else if (aVar != null) {
                    aVar.mo15567a();
                    return;
                }
                return;
            }
            C3615ce.m15510b("Track", "click invalid. clk value empty!");
        }
    }

    @Override // com.umeng.message.proguard.AbstractC3626cp
    /* renamed from: a */
    protected final void mo15549a(final C3621ck c3621ck, final int i10, final int i11, final String str, final JSONObject jSONObject) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cs.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context m15638a = C3643de.m15638a();
                    String appkey = UMUtils.getAppkey(m15638a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sid", c3621ck.m15523c());
                    jSONObject2.put(C3325bt.f14220al, UMUtils.getZid(m15638a));
                    jSONObject2.put("app_key", appkey);
                    jSONObject2.put("slot_type", C3602bt.m15447a(c3621ck.f16165a));
                    jSONObject2.put("slot_id", c3621ck.f16166b.optString("slot_id"));
                    jSONObject2.put("ts", System.currentTimeMillis());
                    jSONObject2.put("e", i10);
                    jSONObject2.put(Constants.KEY_HTTP_CODE, i11);
                    jSONObject2.put("msg", str);
                    jSONObject2.put("imei_md5", C3611ca.m15496f(m15638a));
                    try {
                        jSONObject2.put("oaid", C3611ca.m15493c(m15638a));
                        jSONObject2.put("idfa", C3611ca.m15488a(m15638a));
                    } catch (Throwable unused) {
                    }
                    if (i10 == 2) {
                        jSONObject2.put("imp_dura", c3621ck.m15529i());
                    }
                    jSONObject2.put("android_id", C3611ca.m15491b(m15638a));
                    jSONObject2.put("v", "2.0");
                    jSONObject2.put("sdk_version", "2.0.0");
                    jSONObject2.put("os", DispatchConstants.ANDROID);
                    jSONObject2.put(C3325bt.f14283y, Build.VERSION.RELEASE);
                    jSONObject2.put(Constants.KEY_BRAND, C3611ca.m15492c());
                    jSONObject2.put(Constants.KEY_MODEL, C3611ca.m15490b());
                    jSONObject2.put("data", jSONObject);
                    C3613cc.m15503a(jSONObject2, C3603bu.f16102b, appkey);
                } catch (Throwable th) {
                    C3615ce.m15509a("Track", "report event:", Integer.valueOf(i10), " error:", th.getMessage());
                }
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3626cp
    /* renamed from: a */
    public final synchronized void mo15550a(C3621ck c3621ck, AbstractC3627cq.a aVar) {
        if (c3621ck.f16166b.optBoolean("expose_upload", false)) {
            return;
        }
        if (c3621ck.f16166b.optBoolean("exposed_timeout", false)) {
            String str = "expose invalid. load -> show timeout, interval:" + c3621ck.m15528h();
            if (aVar != null) {
                aVar.mo15568a(str);
                return;
            } else {
                C3615ce.m15509a("Track", str);
                return;
            }
        }
        c3621ck.f16175k = System.currentTimeMillis();
        JSONArray optJSONArray = c3621ck.f16166b.optJSONArray("win");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                C3613cc.m15504a(10, c3621ck, optJSONArray.optString(i10));
            }
        }
        JSONArray optJSONArray2 = c3621ck.f16166b.optJSONArray(C3309bd.f14096c);
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            int length2 = optJSONArray2.length();
            boolean z10 = true;
            for (int i11 = 0; i11 < length2; i11++) {
                z10 &= C3613cc.m15504a(4, c3621ck, optJSONArray2.optString(i11));
            }
            try {
                c3621ck.f16166b.put("expose_upload", z10);
            } catch (Exception unused) {
            }
            if (!z10) {
                if (aVar != null) {
                    aVar.mo15568a("expose invalid. report fail, please check network!");
                    return;
                }
                C3615ce.m15510b("Track", "expose invalid. report fail, please check network!");
            } else if (aVar != null) {
                aVar.mo15567a();
                return;
            }
            return;
        }
        C3615ce.m15509a("Track", "expose invalid. imp value empty.");
    }

    @Override // com.umeng.message.proguard.AbstractC3626cp
    /* renamed from: a */
    public final void mo15552a(String str, C3621ck c3621ck) {
        JSONArray optJSONArray = c3621ck.f16166b.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String optString = optJSONArray.optString(i10);
            if (optString != null && optString.length() > 0) {
                C3613cc.m15504a(8, c3621ck, optString);
            }
        }
    }

    @Override // com.umeng.message.proguard.AbstractC3626cp
    /* renamed from: a */
    public final boolean mo15554a(C3621ck c3621ck) {
        JSONArray optJSONArray = c3621ck.f16166b.optJSONArray("pck");
        boolean z10 = true;
        if (optJSONArray != null && optJSONArray.length() != 0) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String optString = optJSONArray.optString(i10);
                if (optString != null && optString.length() > 0) {
                    z10 = C3613cc.m15505a(optString);
                }
                if (!z10) {
                    break;
                }
            }
        }
        return z10;
    }
}
