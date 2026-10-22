package com.taobao.accs.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.C3325bt;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.client.b */
/* loaded from: classes.dex */
public class C3132b {

    /* renamed from: a */
    private Context f12866a;

    /* renamed from: d */
    private long f12869d;

    /* renamed from: f */
    private String f12871f;

    /* renamed from: b */
    private ConcurrentMap<String, Integer> f12867b = new ConcurrentHashMap();

    /* renamed from: c */
    private ConcurrentMap<String, Set<String>> f12868c = new ConcurrentHashMap();

    /* renamed from: e */
    private String f12870e = "ClientManager_";

    public C3132b(Context context, String str) {
        this.f12871f = "ACCS_BIND";
        if (context != null) {
            this.f12870e += str;
            this.f12866a = context.getApplicationContext();
            this.f12871f = "ACCS_BIND" + str;
            m12736a();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    /* renamed from: a */
    public void m12738a(String str) {
        Integer num = this.f12867b.get(str);
        if (num == null || num.intValue() != 2) {
            this.f12867b.put(str, 2);
            m12737a(this.f12866a, this.f12871f, this.f12869d, this.f12867b);
        }
    }

    /* renamed from: b */
    public void m12740b(String str) {
        Integer num = this.f12867b.get(str);
        if (num == null || num.intValue() != 4) {
            this.f12867b.put(str, 4);
            m12737a(this.f12866a, this.f12871f, this.f12869d, this.f12867b);
        }
    }

    /* renamed from: c */
    public boolean m12742c(String str) {
        if (this.f12867b.isEmpty()) {
            m12736a();
        }
        Integer num = this.f12867b.get(str);
        ALog.m12941i(this.f12870e, "isAppBinded", "appStatus", num, "mBindStatus", this.f12867b);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m12743d(String str) {
        Integer num = this.f12867b.get(str);
        if (num != null && num.intValue() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m12744e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f12868c.remove(str);
        } catch (Exception e10) {
            ALog.m12940e(this.f12870e, this.f12870e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m12739a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Set<String> set = this.f12868c.get(str);
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(str2);
                this.f12868c.put(str, set);
            }
        } catch (Exception e10) {
            ALog.m12940e(this.f12870e, this.f12870e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean m12741b(String str, String str2) {
        Set<String> set;
        try {
            if (!TextUtils.isEmpty(str) && (set = this.f12868c.get(str)) != null) {
                if (set.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception e10) {
            ALog.m12940e(this.f12870e, this.f12870e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    private void m12736a() {
        try {
            String string = this.f12866a.getSharedPreferences(this.f12871f, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.m12944w(this.f12870e, "restoreClients break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f12869d = jSONArray.getLong(0);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f12869d;
            if (currentTimeMillis < 86400000 + j10) {
                for (int i10 = 1; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    this.f12867b.put(jSONObject.getString(C3325bt.f14186aD), Integer.valueOf(jSONObject.getInt(C3325bt.f14190aH)));
                }
                ALog.m12941i(this.f12870e, "restoreClients success", "mBindStatus", this.f12867b);
                return;
            }
            ALog.m12941i(this.f12870e, "restoreClients expired", "lastFlushTime", Long.valueOf(j10));
            this.f12869d = 0L;
        } catch (Exception e10) {
            ALog.m12943w(this.f12870e, "restoreClients", e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m12737a(Context context, String str, long j10, Map<String, Integer> map) {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j10 > 0 && j10 < System.currentTimeMillis()) {
                jSONArray.put(j10);
            } else {
                double currentTimeMillis = System.currentTimeMillis();
                double random = Math.random() * 8.64E7d;
                Double.isNaN(currentTimeMillis);
                jSONArray.put(currentTimeMillis - random);
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3325bt.f14186aD, str2);
                jSONObject.put(C3325bt.f14190aH, map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString("bind_status", jSONArray.toString());
            edit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
