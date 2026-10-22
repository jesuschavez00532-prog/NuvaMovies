package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C3395q;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* renamed from: a */
    private static Context f13872a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.CoreProtocol$a */
    /* loaded from: classes3.dex */
    public static class C3266a {

        /* renamed from: a */
        private static final CoreProtocol f13873a = new CoreProtocol();

        private C3266a() {
        }
    }

    public static CoreProtocol getInstance(Context context) {
        if (f13872a == null && context != null) {
            f13872a = context.getApplicationContext();
        }
        return C3266a.f13873a;
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        C3395q.m14330a(f13872a).m14363a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        C3395q.m14330a(f13872a).m14370b();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C3395q.m14330a(f13872a).m14364a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j10) {
        return C3395q.m14330a(f13872a).m14362a(j10);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i10) {
        C3395q.m14330a(f13872a).m14365a(obj, i10);
    }

    private CoreProtocol() {
    }
}
