package com.efs.sdk.base.core.config.remote;

import android.text.TextUtils;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.secure.C1724a;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class RemoteConfig {
    public static final double FULL_RATE = 100.0d;

    /* renamed from: a */
    String f7109a;
    public int mConfigVersion = -1;

    /* renamed from: b */
    String f7110b = "https://";

    /* renamed from: c */
    String f7111c = "errnewlog.umeng.com";

    /* renamed from: d */
    long f7112d = 480;

    /* renamed from: e */
    private Boolean f7113e = null;
    public Map<String, Double> mUploadSampleRateMap = new HashMap();
    public Map<String, String> mSDKConfigMap = new HashMap();
    public Map<String, Object> mStrategyMap = new HashMap();

    private RemoteConfig() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7673a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f7109a = str;
            String str2 = new String(C1724a.m7774a(EncodeUtil.base64Decode(str.getBytes()), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
            String[] split = str2.split("\\|");
            if (split.length <= 1) {
                return;
            }
            String str3 = split[1];
            try {
                JSONArray jSONArray = new JSONArray(str2.substring(split[0].length() + split[1].length() + 2));
                this.mStrategyMap.put("rate", Integer.valueOf(Integer.parseInt(str3)));
                this.mStrategyMap.put("stra", jSONArray);
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RemoteConfig m7672a() {
        RemoteConfig remoteConfig = new RemoteConfig();
        if (ControllerCenter.getGlobalEnvStruct().isIntl()) {
            remoteConfig.f7111c = "errnewlogos.umeng.com";
        } else {
            remoteConfig.f7111c = "errnewlog.umeng.com";
        }
        return remoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7674a(Map<String, String> map) {
        double d10;
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f7111c = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f7110b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        try {
            if (map.containsKey("updateInteval")) {
                String str3 = map.get("updateInteval");
                if (!TextUtils.isEmpty(str3)) {
                    this.f7112d = Long.parseLong(str3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String replace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                try {
                    d10 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                    d10 = 100.0d;
                }
                hashMap.put(replace, Double.valueOf(d10));
            }
        }
        this.mUploadSampleRateMap = hashMap;
        this.mSDKConfigMap = map;
    }
}
