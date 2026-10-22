package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.C3417a;
import com.umeng.ccg.CcgAgent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ab */
/* loaded from: classes3.dex */
public class C3280ab implements InterfaceC3288aj {

    /* renamed from: a */
    private String f13952a;

    /* renamed from: b */
    private ArrayList<InterfaceC3281ac> f13953b;

    /* renamed from: c */
    private String f13954c;

    /* renamed from: d */
    private String f13955d;

    /* renamed from: e */
    private String f13956e;

    /* renamed from: f */
    private String f13957f;

    public C3280ab(String str, ArrayList<InterfaceC3281ac> arrayList) {
        this.f13952a = null;
        new ArrayList();
        this.f13954c = "";
        this.f13955d = "";
        this.f13956e = "";
        this.f13957f = "";
        this.f13952a = str;
        this.f13953b = arrayList;
    }

    /* renamed from: a */
    public String mo13732a() {
        return this.f13952a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: b */
    public void mo13737b(String str, JSONObject jSONObject) {
    }

    /* renamed from: c */
    public String mo13738c() {
        return this.f13955d;
    }

    /* renamed from: c */
    private String m13731c(String str) {
        String[] split = str.split(",");
        String str2 = "";
        if (split.length <= 0) {
            return "";
        }
        ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(this.f13952a);
        if (forbidSdkArray != null && forbidSdkArray.size() > 0) {
            this.f13957f = forbidSdkArray.toString();
            for (String str3 : split) {
                if (CcgAgent.getActionInfo(str3) != null && !forbidSdkArray.contains(str3)) {
                    return str3;
                }
            }
            return "";
        }
        for (String str4 : split) {
            ActionInfo actionInfo = CcgAgent.getActionInfo(str4);
            if (actionInfo != null) {
                String[] supportAction = actionInfo.getSupportAction(UMGlobalContext.getAppContext());
                if (supportAction.length > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportAction.length) {
                            break;
                        }
                        if (this.f13952a.equals(supportAction[i10])) {
                            str2 = str4;
                            break;
                        }
                        i10++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                } else {
                    continue;
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public void mo13734a(String str) {
        this.f13954c = str;
    }

    /* renamed from: b */
    public String mo13735b() {
        return this.f13954c;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: a */
    public JSONObject mo13733a(String str, JSONObject jSONObject) {
        try {
            int size = this.f13953b.size();
            if (size == 0) {
                return null;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f13953b.get(i10).mo13740b()) {
                    return null;
                }
            }
            if (CcgAgent.hasRegistedActionInfo() && !TextUtils.isEmpty(this.f13955d)) {
                String m13731c = m13731c(this.f13955d);
                this.f13956e = m13731c;
                if (TextUtils.isEmpty(m13731c)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "采集项：" + this.f13952a + "; 未选中可用Module ; sdk: " + this.f13955d);
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "采集项：" + this.f13952a + "; 选中Module: " + this.f13956e + "; sdk: " + this.f13955d);
                }
            }
            InterfaceC3281ac interfaceC3281ac = this.f13953b.get(size - 1);
            if (interfaceC3281ac == null || !(interfaceC3281ac instanceof C3284af)) {
                return null;
            }
            long mo13741c = interfaceC3281ac.mo13741c();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("actionName", this.f13952a);
                jSONObject2.put(C3417a.f14999u, this.f13955d);
                jSONObject2.put(C3417a.f14996r, this.f13954c);
                jSONObject2.put("delay", mo13741c);
                jSONObject2.put(C3417a.f14997s, this.f13956e);
                jSONObject2.put(C3417a.f14998t, this.f13957f);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo13736b(String str) {
        this.f13955d = str;
    }
}
