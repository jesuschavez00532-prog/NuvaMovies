package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.pro.C3304az;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.C3519c;
import com.umeng.commonsdk.utils.C3520d;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ba */
/* loaded from: classes3.dex */
public class C3306ba implements C3304az.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.ba$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3306ba f14068a = new C3306ba();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3306ba m13832a() {
        return a.f14068a;
    }

    @Override // com.umeng.analytics.pro.C3304az.a
    /* renamed from: a */
    public void mo13825a(Object obj, int i10) {
        JSONObject m13858a;
        if (i10 != 101) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "[CkHandler]: unknown event type!");
            return;
        }
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "[CkHandler]:recv CkDispatch.CHECK event!");
        Context appContext = UMGlobalContext.getAppContext();
        if (!UMConfigure.getInitStatus() || appContext == null || UMConfigure.needSendZcfgEnv(appContext) || C3519c.m15122a() || FieldManager.allow(C3520d.f15679aw) || SdkVersion.SDK_TYPE == 1 || !(obj instanceof C3307bb)) {
            return;
        }
        try {
            JSONObject m13857g = ((C3307bb) obj).m13857g();
            if (!m13857g.has("eID") || (m13858a = C3308bc.m13858a(appContext)) == null) {
                return;
            }
            C3308bc.m13859a(m13858a, m13857g);
            C3300av.m13807a(new RunnableC3295aq(RunnableC3295aq.f14009c, m13858a, "appkey"), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }
}
