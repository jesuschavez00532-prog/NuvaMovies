package org.android.agoo.accs;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.UTMini;
import java.nio.charset.Charset;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;

/* loaded from: classes3.dex */
public class AgooService extends TaoBaseService {

    /* renamed from: a */
    public static CallBack f23677a;

    /* renamed from: b */
    public static CallBack f23678b;

    /* renamed from: c */
    private AgooFactory f23679c;

    /* renamed from: a */
    private String m24180a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m12940e("AgooService", "into--[onBind]:serviceId:" + str + ",errorCode=" + i10, new Object[0]);
        }
        if (f23677a != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i10 == 200) {
                f23677a.onSuccess();
            } else {
                f23677a.onFailure(String.valueOf(i10), "bind Agoo service fail");
            }
        }
        f23677a = null;
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ALog.m12938d("AgooService", "into--[onCreate]", new Object[0]);
        AgooFactory agooFactory = new AgooFactory();
        this.f23679c = agooFactory;
        agooFactory.init(getApplicationContext(), null, null);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("AgooService", "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("push data:");
            sb2.append(new String(bArr, Charset.forName(Request.DEFAULT_CHARSET)));
            ALog.m12938d("AgooService", sb2.toString(), new Object[0]);
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", C3197j.m13007b(getApplicationContext()), str3);
        C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_TOTAL_ARRIVE, "total_arrive", 0.0d);
        try {
            this.f23679c.saveMsg(bArr);
            this.f23679c.msgRecevie(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", "onDataError", th);
            ALog.m12940e("AgooService", "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i10, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("AgooService", "onResponse,dataId=" + str2 + ",errorCode=" + i10 + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str3 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str3 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.m12940e("AgooService", "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m12938d("AgooService", "onResponse,message=" + str3, new Object[0]);
        }
        if (i10 == 200 && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e("AgooService", "request is success", Constants.KEY_DATA_ID, str2);
            }
            this.f23679c.updateMsg(bArr, true);
        } else {
            if (i10 != 200 && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m12940e("AgooService", "request is error", Constants.KEY_DATA_ID, str2, "errorid", Integer.valueOf(i10));
                }
                Config.m24182a(getApplicationContext(), 1);
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i10), 0.0d);
                return;
            }
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e("AgooService", "business request is error,message=" + str3, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i10, TaoBaseService.ExtraInfo extraInfo) {
        try {
            ALog.Level level = ALog.Level.I;
            if (ALog.isPrintLog(level)) {
                ALog.m12941i("AgooService", "onSendData,dataId=" + str2 + ",errorCode=" + i10 + ",serviceId=" + str, new Object[0]);
            }
            if (i10 == 200) {
                if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                    C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "8/9", 0.0d);
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 300000000 && Long.parseLong(str2) < 600000000) {
                    if (ALog.isPrintLog(level)) {
                        ALog.m12941i("AgooService", "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 600000000 && ALog.isPrintLog(level)) {
                    ALog.m12941i("AgooService", "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
                    return;
                }
                return;
            }
            if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                Config.m24182a(getApplicationContext(), 1);
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i10), 0.0d);
            }
            if (ALog.isPrintLog(level)) {
                ALog.m12941i("AgooService", "onSendData error,dataId=" + str2 + ",serviceId=" + str, new Object[0]);
                ALog.m12940e("AgooService", "into--[parseError]", new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", C3197j.m13007b(getApplicationContext()), Constants.KEY_ERROR_CODE, str2 + ",serviceId=" + str + ",errorCode=" + i10);
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e("AgooService", "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + m24180a(th), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", C3197j.m13007b(getApplicationContext()), "onSendDataException", m24180a(th));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m12940e("AgooService", "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i10, new Object[0]);
        }
        if (f23678b != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i10 == 200) {
                f23678b.onSuccess();
            } else {
                f23678b.onFailure(String.valueOf(i10), "unbind Agoo service fail");
            }
        }
        f23678b = null;
    }
}
