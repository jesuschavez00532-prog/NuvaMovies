package com.alibaba.sdk.android.httpdns;

import com.taobao.accs.common.Constants;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.g */
/* loaded from: classes.dex */
class C1543g {

    /* renamed from: b */
    private int f5955b;

    /* renamed from: e */
    private String f5956e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1543g(int i10, String str) {
        this.f5955b = i10;
        this.f5956e = new JSONObject(str).getString(Constants.KEY_HTTP_CODE);
    }

    /* renamed from: b */
    public String m7162b() {
        return this.f5956e;
    }

    public int getErrorCode() {
        return this.f5955b;
    }
}
