package com.alibaba.sdk.android.httpdns.p044a;

import android.content.Context;
import android.util.Log;
import com.alibaba.sdk.android.beacon.Beacon;
import com.alibaba.sdk.android.httpdns.C1526b;
import com.alibaba.sdk.android.httpdns.C1545i;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import com.lzy.okgo.model.Progress;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.a.a */
/* loaded from: classes.dex */
public class C1525a {

    /* renamed from: a */
    private static volatile C1525a f5866a;
    private Context mContext = null;

    /* renamed from: a */
    private C1538b f5870a = null;

    /* renamed from: a */
    private Beacon f5869a = null;

    /* renamed from: m */
    private boolean f5871m = true;

    /* renamed from: a */
    private final Beacon.OnUpdateListener f5868a = new Beacon.OnUpdateListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.1
        @Override // com.alibaba.sdk.android.beacon.Beacon.OnUpdateListener
        public void onUpdate(List<Beacon.Config> list) {
            try {
                C1525a.this.m7059b(list);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    private final Beacon.OnServiceErrListener f5867a = new Beacon.OnServiceErrListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.2
        @Override // com.alibaba.sdk.android.beacon.Beacon.OnServiceErrListener
        public void onErr(Beacon.Error error) {
            Log.e("HTTPDNS:BeaconManager", "beacon error. errorCode:" + error.errCode + ", errorMsg:" + error.errMsg);
        }
    };

    private C1525a() {
    }

    /* renamed from: a */
    public static C1525a m7056a() {
        if (f5866a == null) {
            synchronized (C1525a.class) {
                if (f5866a == null) {
                    f5866a = new C1525a();
                }
            }
        }
        return f5866a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7059b(List<Beacon.Config> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Beacon.Config config : list) {
            if (config.key.equalsIgnoreCase("___httpdns_service___")) {
                m7058a(config);
            }
        }
    }

    /* renamed from: i */
    private void m7061i(String str) {
        if (str != null) {
            Log.d("HTTPDNS:BeaconManager", "is IP probe enabled:" + str);
            this.f5871m = !str.equalsIgnoreCase("disabled");
        }
    }

    /* renamed from: j */
    private void m7062j(String str) {
        if (str != null) {
            C1526b.m7067a(!"disabled".equals(str));
            C1545i.m7166e("[beacon] httpdns enable: " + C1526b.m7068a());
        }
    }

    /* renamed from: c */
    public void m7064c(Context context, String str) {
        this.mContext = context;
        if (context != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sdkId", "httpdns");
            hashMap.put("accountId", str);
            Beacon build = new Beacon.Builder().appKey("24657847").appSecret("f30fc0937f2b1e9e50a1b7134f1ddb10").loopInterval(7200000L).extras(hashMap).build();
            this.f5869a = build;
            build.addUpdateListener(this.f5868a);
            this.f5869a.addServiceErrListener(this.f5867a);
            this.f5869a.start(this.mContext.getApplicationContext());
        }
    }

    /* renamed from: f */
    public boolean m7065f() {
        return this.f5871m;
    }

    /* renamed from: f */
    private boolean m7060f(String str) {
        if (str == null || this.f5870a == null) {
            return false;
        }
        Log.d("HTTPDNS:BeaconManager", "is report enabled:" + str);
        if (str.equalsIgnoreCase("disabled")) {
            this.f5870a.m7142e(false);
        } else {
            this.f5870a.m7142e(true);
        }
        return true;
    }

    /* renamed from: a */
    public void m7063a(C1538b c1538b) {
        this.f5870a = c1538b;
    }

    /* renamed from: a */
    private boolean m7058a(Beacon.Config config) {
        if (config == null || !config.key.equalsIgnoreCase("___httpdns_service___")) {
            return false;
        }
        String str = config.value;
        if (str != null) {
            Log.d("HTTPDNS:BeaconManager", "httpdns configs:" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ut")) {
                    m7060f(jSONObject.getString("ut"));
                }
                if (jSONObject.has("ip-ranking")) {
                    m7061i(jSONObject.getString("ip-ranking"));
                }
                if (jSONObject.has(Progress.STATUS)) {
                    m7062j(jSONObject.getString(Progress.STATUS));
                }
            } catch (Exception e10) {
                Log.e("HTTPDNS:BeaconManager", "parse push configs failed.", e10);
                return false;
            }
        }
        return true;
    }
}
