package com.taobao.agoo.p075a;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.client.C3132b;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C3325bt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.a */
/* loaded from: classes.dex */
public class C3213a {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a */
    private ConcurrentMap<String, Integer> f13228a = new ConcurrentHashMap();

    /* renamed from: b */
    private String f13229b;

    /* renamed from: c */
    private long f13230c;

    /* renamed from: d */
    private Context f13231d;

    public C3213a(Context context) {
        if (context != null) {
            this.f13231d = context.getApplicationContext();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    /* renamed from: a */
    public void m13054a(String str) {
        Integer num = this.f13228a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f13228a.put(str, 2);
            C3132b.m12737a(this.f13231d, "AGOO_BIND", this.f13230c, this.f13228a);
        }
    }

    /* renamed from: b */
    public boolean m13055b(String str) {
        if (this.f13228a.isEmpty()) {
            m13052b();
        }
        Integer num = this.f13228a.get(str);
        ALog.m12941i("AgooBindCache", "isAgooRegistered", Constants.KEY_PACKAGE_NAME, str, "appStatus", num, "agooBindStatus", this.f13228a);
        return (UtilityImpl.m12964a(Config.PREFERENCES, this.f13231d) || num == null || num.intValue() != 2) ? false : true;
    }

    /* renamed from: c */
    public void m13056c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13229b = str;
    }

    /* renamed from: d */
    public boolean m13057d(String str) {
        String str2 = this.f13229b;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m13053a() {
        this.f13229b = null;
    }

    /* renamed from: b */
    private void m13052b() {
        try {
            String string = this.f13231d.getSharedPreferences("AGOO_BIND", 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m12944w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f13230c = jSONArray.getLong(0);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f13230c;
            if (currentTimeMillis < 86400000 + j10) {
                for (int i10 = 1; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    this.f13228a.put(jSONObject.getString(C3325bt.f14186aD), Integer.valueOf(jSONObject.getInt(C3325bt.f14190aH)));
                }
                ALog.m12941i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f13228a);
                return;
            }
            ALog.m12941i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(j10));
            this.f13230c = 0L;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
