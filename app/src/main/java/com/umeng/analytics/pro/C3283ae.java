package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ae */
/* loaded from: classes3.dex */
public class C3283ae extends C3280ab {

    /* renamed from: a */
    private int f13960a;

    /* renamed from: b */
    private int f13961b;

    /* renamed from: c */
    private int f13962c;

    /* renamed from: d */
    private ArrayList<Pair<String, Integer>> f13963d;

    public C3283ae(String str, ArrayList<InterfaceC3281ac> arrayList) {
        super(str, arrayList);
    }

    /* renamed from: a */
    public void m13747a(int i10) {
        this.f13960a = i10;
    }

    /* renamed from: b */
    public void m13748b(int i10) {
        this.f13961b = i10;
    }

    /* renamed from: c */
    public void m13749c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(new String(C3302ax.m13817a(Base64.decode(str, 0), UMUtils.genSin())));
            int length = jSONArray.length();
            if (length > 0) {
                this.f13963d = new ArrayList<>();
            }
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String optString = jSONObject.has("type") ? jSONObject.optString("type") : "";
                if (jSONObject.has(C3417a.f14978B)) {
                    i11 = Integer.valueOf(jSONObject.optInt(C3417a.f14978B));
                }
                if (!TextUtils.isEmpty(optString)) {
                    this.f13963d.add(new Pair<>(optString, i11));
                }
            }
            this.f13962c = this.f13963d.size();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public int m13750d() {
        return this.f13962c;
    }

    /* renamed from: e */
    public int m13751e() {
        return this.f13960a;
    }

    /* renamed from: f */
    public int m13752f() {
        return this.f13961b;
    }

    /* renamed from: g */
    public ArrayList<Pair<String, Integer>> m13753g() {
        return this.f13963d;
    }

    @Override // com.umeng.analytics.pro.C3280ab
    /* renamed from: a */
    public String mo13732a() {
        return super.mo13732a();
    }

    @Override // com.umeng.analytics.pro.C3280ab
    /* renamed from: b */
    public String mo13735b() {
        return super.mo13735b();
    }

    @Override // com.umeng.analytics.pro.C3280ab
    /* renamed from: a */
    public void mo13734a(String str) {
        super.mo13734a(str);
    }

    @Override // com.umeng.analytics.pro.C3280ab
    /* renamed from: b */
    public void mo13736b(String str) {
        super.mo13736b(str);
    }

    /* renamed from: a */
    private void m13746a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int i10 = this.f13960a;
                int i11 = 0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        int randNumber = DeviceConfig.getRandNumber(0, this.f13962c - 1);
                        String str = (String) this.f13963d.get(randNumber).first;
                        int intValue = ((Integer) this.f13963d.get(randNumber).second).intValue();
                        jSONObject.put("target", str);
                        jSONObject.put(C3417a.f14978B, intValue);
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "selPoclicy: 1, currIndex: " + randNumber);
                        return;
                    }
                    return;
                }
                SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
                if (m13805a != null) {
                    int i12 = m13805a.getInt(C3299au.f14035h, 0);
                    if (i12 < this.f13962c) {
                        String str2 = (String) this.f13963d.get(i12).first;
                        int intValue2 = ((Integer) this.f13963d.get(i12).second).intValue();
                        jSONObject.put("target", str2);
                        jSONObject.put(C3417a.f14978B, intValue2);
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "selPoclicy: 0, currIndex: " + i12);
                        if (i12 < this.f13962c - 1) {
                            i11 = i12 + 1;
                        }
                    } else {
                        String str3 = (String) this.f13963d.get(0).first;
                        int intValue3 = ((Integer) this.f13963d.get(0).second).intValue();
                        jSONObject.put("target", str3);
                        jSONObject.put(C3417a.f14978B, intValue3);
                    }
                    m13805a.edit().putInt(C3299au.f14035h, i11).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.umeng.analytics.pro.C3280ab, com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: b */
    public void mo13737b(String str, JSONObject jSONObject) {
        super.mo13737b(str, jSONObject);
        if (jSONObject.has(C3417a.f15003y)) {
            m13747a(jSONObject.optInt(C3417a.f15003y));
        }
        if (jSONObject.has(C3417a.f15004z)) {
            m13748b(jSONObject.optInt(C3417a.f15004z));
        }
        if (jSONObject.has(C3417a.f15002x)) {
            m13749c(jSONObject.optString(C3417a.f15002x));
        }
    }

    @Override // com.umeng.analytics.pro.C3280ab
    /* renamed from: c */
    public String mo13738c() {
        return super.mo13738c();
    }

    @Override // com.umeng.analytics.pro.C3280ab, com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: a */
    public JSONObject mo13733a(String str, JSONObject jSONObject) {
        JSONObject mo13733a = super.mo13733a(str, jSONObject);
        if (this.f13962c == 0) {
            return null;
        }
        if (jSONObject != null) {
            try {
                mo13733a.put(C3417a.f15004z, this.f13961b);
                mo13733a.put(C3417a.f15003y, this.f13960a);
                int optInt = jSONObject.optInt(C3417a.f14988j);
                if (this.f13961b == 0 && optInt == 202) {
                    m13746a(mo13733a);
                }
                if (this.f13961b == 1 && optInt == 304) {
                    m13746a(mo13733a);
                }
            } catch (Throwable unused) {
            }
        }
        return mo13733a;
    }
}
