package com.alibaba.sdk.android.utils;

import android.text.TextUtils;
import android.util.Log;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AlicloudTracker {

    /* renamed from: a */
    private C1567a f6046a;

    /* renamed from: a */
    private String f6047a;

    /* renamed from: a */
    private Map<String, String> f6048a = new HashMap();

    /* renamed from: b */
    private String f6049b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlicloudTracker(C1567a c1567a, String str, String str2) {
        this.f6046a = c1567a;
        this.f6047a = str;
        this.f6049b = str2;
    }

    public void removeGlobalProperty(String str) {
        if (!TextUtils.isEmpty(str) && this.f6048a.containsKey(str)) {
            this.f6048a.remove(str);
        } else {
            Log.e("AlicloudTracker", "key is null or key is empty,please check it!");
        }
    }

    public void sendCustomHit(String str, long j10, Map<String, String> map) {
        try {
            if (this.f6046a == null) {
                Log.e("AlicloudTracker", "dataTracker is null, can not sendCustomHit");
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(this.f6048a);
            map.put("sdkId", this.f6047a);
            map.put(Constants.KEY_SDK_VERSION, this.f6049b);
            this.f6046a.sendCustomHit(this.f6047a + "_" + str, j10, map);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setGlobalProperty(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            if (this.f6048a.containsKey(str)) {
                this.f6048a.remove(str);
            }
            this.f6048a.put(str, str2);
            return;
        }
        Log.e("AlicloudTracker", "key is null or key is empty or value is null,please check it!");
    }

    public void sendCustomHit(String str, Map<String, String> map) {
        sendCustomHit(str, 0L, map);
    }
}
