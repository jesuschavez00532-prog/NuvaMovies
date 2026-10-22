package org.android.agoo.control;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.InterfaceC3118b;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.l */
/* loaded from: classes3.dex */
public class RunnableC6052l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f23717a;

    /* renamed from: b */
    final /* synthetic */ String f23718b;

    /* renamed from: c */
    final /* synthetic */ String f23719c;

    /* renamed from: d */
    final /* synthetic */ boolean f23720d;

    /* renamed from: e */
    final /* synthetic */ NotifManager f23721e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6052l(NotifManager notifManager, String str, String str2, String str3, boolean z10) {
        this.f23721e = notifManager;
        this.f23717a = str;
        this.f23718b = str2;
        this.f23719c = str3;
        this.f23720d = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        Context context7;
        Context context8;
        String mo12671a;
        Context context9;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("thirdTokenType", this.f23717a);
            hashMap.put("token", this.f23718b);
            context2 = this.f23721e.mContext;
            hashMap.put("appkey", Config.m24181a(context2));
            context3 = this.f23721e.mContext;
            hashMap.put("utdid", C3197j.m13007b(context3));
            if (!TextUtils.isEmpty(this.f23719c)) {
                hashMap.put("vendorSdkVersion", this.f23719c);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("report,utdid=");
            context4 = this.f23721e.mContext;
            sb2.append(C3197j.m13007b(context4));
            sb2.append(",regId=");
            sb2.append(this.f23718b);
            sb2.append(",type=");
            sb2.append(this.f23717a);
            ALog.m12938d("NotifManager", sb2.toString(), new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(hashMap).toString().getBytes(Request.DEFAULT_CHARSET), null, null, null, null);
            context5 = this.f23721e.mContext;
            context6 = this.f23721e.mContext;
            String m24181a = Config.m24181a(context6);
            context7 = this.f23721e.mContext;
            InterfaceC3118b accsInstance = ACCSManager.getAccsInstance(context5, m24181a, Config.m24189c(context7));
            if (this.f23720d) {
                context9 = this.f23721e.mContext;
                mo12671a = accsInstance.mo12670a(context9, accsRequest);
            } else {
                context8 = this.f23721e.mContext;
                mo12671a = accsInstance.mo12671a(context8, accsRequest, new TaoBaseService.ExtraInfo());
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12941i("NotifManager", "reportThirdPushToken,dataId=" + mo12671a + ",regId=" + this.f23718b + ",type=" + this.f23717a, new Object[0]);
            }
        } catch (Throwable th) {
            UTMini uTMini = UTMini.getInstance();
            context = this.f23721e.mContext;
            uTMini.commitEvent(AgooConstants.AGOO_EVENT_ID, "reportThirdPushToken", C3197j.m13007b(context), th.toString());
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12939e("NotifManager", "[report] is error", th, new Object[0]);
            }
        }
    }
}
