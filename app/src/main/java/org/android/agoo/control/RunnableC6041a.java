package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.C3325bt;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.a */
/* loaded from: classes3.dex */
public class RunnableC6041a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f23695a;

    /* renamed from: b */
    final /* synthetic */ String f23696b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f23697c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6041a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f23697c = agooFactory;
        this.f23695a = bArr;
        this.f23696b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageService messageService;
        MessageService messageService2;
        try {
            String str = new String(this.f23695a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String str2 = null;
                String str3 = null;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        str2 = jSONObject.getString(C3325bt.f14191aI);
                        str3 = jSONObject.getString(C3325bt.f14186aD);
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m12941i("AgooFactory", "saveMsg msgId:" + str2 + ",message=" + str + ",currentPack=" + str3 + ",reportTimes=" + Config.m24193f(AgooFactory.mContext), new Object[0]);
                }
                if (!TextUtils.isEmpty(str3) && TextUtils.equals(str3, AgooFactory.mContext.getPackageName())) {
                    if (TextUtils.isEmpty(this.f23696b)) {
                        messageService2 = this.f23697c.messageService;
                        messageService2.m24213a(str2, str, MessageService.MSG_DB_READY_REPORT);
                    } else {
                        messageService = this.f23697c.messageService;
                        messageService.m24213a(str2, str, this.f23696b);
                    }
                }
            }
        } catch (Throwable th) {
            ALog.m12940e("AgooFactory", "saveMsg fail:" + th.toString(), new Object[0]);
        }
    }
}
