package org.android.agoo.control;

import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.d */
/* loaded from: classes3.dex */
public class RunnableC6044d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f23703a;

    /* renamed from: b */
    final /* synthetic */ boolean f23704b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f23705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6044d(AgooFactory agooFactory, byte[] bArr, boolean z10) {
        this.f23705c = agooFactory;
        this.f23703a = bArr;
        this.f23704b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        MessageService messageService;
        MessageService messageService2;
        try {
            String str2 = new String(this.f23703a, "utf-8");
            if (TextUtils.isEmpty(str2)) {
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", 0.0d);
                return;
            }
            ALog.m12941i("AgooFactory", "message = " + str2, new Object[0]);
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("id");
            if (TextUtils.equals(string, "agooReport")) {
                str = jSONObject.getString(Progress.STATUS);
            } else {
                str = null;
            }
            if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", 0.0d);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(str)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m12941i("AgooFactory", "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str + ",reportTimes=" + Config.m24193f(AgooFactory.mContext), new Object[0]);
                }
                if (TextUtils.equals(string, "agooReport")) {
                    if (TextUtils.equals(str, "4") && this.f23704b) {
                        messageService2 = this.f23705c.messageService;
                        messageService2.m24212a(string2, "1");
                    } else if ((TextUtils.equals(str, MessageService.MSG_ACCS_NOTIFY_CLICK) || TextUtils.equals(str, MessageService.MSG_ACCS_NOTIFY_DISMISS)) && this.f23704b) {
                        messageService = this.f23705c.messageService;
                        messageService.m24212a(string2, MessageService.MSG_DB_COMPLETE);
                    }
                    C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str, 0.0d);
                    return;
                }
                return;
            }
            C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", 0.0d);
        } catch (Throwable th) {
            ALog.m12940e("AgooFactory", "updateMsg get data error,e=" + th, new Object[0]);
            C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", 0.0d);
        }
    }
}
