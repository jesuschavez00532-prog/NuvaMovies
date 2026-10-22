package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.UTMini;
import com.umeng.message.component.UmengMessageHandlerService;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NotifManager {
    private static final String ACK_MESSAGE = "accs.ackMessage";
    private static final int EVENT_ID = 66001;
    private static final String TAG = "NotifManager";
    private Context mContext = null;

    private byte[] convertMsgToBytes(MsgDO msgDO) {
        HashMap hashMap = new HashMap();
        hashMap.put("api", "agooReport");
        hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
        hashMap.put("ext", msgDO.extData);
        hashMap.put(Progress.STATUS, msgDO.msgStatus);
        if (!TextUtils.isEmpty(msgDO.errorCode)) {
            hashMap.put("ec", msgDO.errorCode);
        }
        if (!TextUtils.isEmpty(msgDO.type)) {
            hashMap.put("type", msgDO.type);
        }
        if (!TextUtils.isEmpty(msgDO.fromPkg)) {
            hashMap.put("fromPkg", msgDO.fromPkg);
        }
        if (!TextUtils.isEmpty(msgDO.fromAppkey)) {
            hashMap.put(AgooConstants.MESSAGE_FROM_APPKEY, msgDO.fromAppkey);
        }
        if (!TextUtils.isEmpty(msgDO.notifyEnable)) {
            hashMap.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!TextUtils.isEmpty(msgDO.extData)) {
            hashMap.put("ext", msgDO.extData);
        }
        hashMap.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        hashMap.put("appkey", Config.m24181a(this.mContext));
        hashMap.put("utdid", C3197j.m13007b(this.mContext));
        hashMap.put("evokeAppStatus", String.valueOf(msgDO.evokeAppStatus));
        hashMap.put("lastActiveTime", String.valueOf(msgDO.lastActiveTime));
        hashMap.put("isGlobalClick", String.valueOf(msgDO.isGlobalClick));
        return new JSONObject(hashMap).toString().getBytes(Request.DEFAULT_CHARSET);
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (msgDO == null) {
                ALog.m12940e(TAG, "reportMethod msg null", new Object[0]);
                return;
            }
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = this.mContext;
            String mo12671a = ACCSManager.getAccsInstance(context, Config.m24181a(context), Config.m24189c(this.mContext)).mo12671a(this.mContext, accsRequest, extraInfo);
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e(TAG, AgooConstants.MESSAGE_REPORT, Constants.KEY_DATA_ID, mo12671a, Progress.STATUS, msgDO.msgStatus, "errorcode", msgDO.errorCode);
            }
        } catch (Throwable th) {
            C3198k.m13010a("accs", "error", th.toString(), 0.0d);
        }
    }

    public void doUninstall(String str, boolean z10) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pack", str);
            hashMap.put("appkey", Config.m24181a(this.mContext));
            hashMap.put("utdid", C3197j.m13007b(this.mContext));
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooKick", new JSONObject(hashMap).toString().getBytes(Request.DEFAULT_CHARSET), null, null, null, null);
            Context context = this.mContext;
            ACCSManager.getAccsInstance(context, Config.m24181a(context), Config.m24189c(this.mContext)).mo12671a(this.mContext, accsRequest, new TaoBaseService.ExtraInfo());
        } catch (Throwable th) {
            ALog.m12939e(TAG, "[doUninstall] is error", th, new Object[0]);
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO == null) {
            return;
        }
        if (TextUtils.isEmpty(msgDO.msgIds) && TextUtils.isEmpty(msgDO.removePacks) && TextUtils.isEmpty(msgDO.errorCode)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, C3197j.m13007b(this.mContext), "handlerACKMessageRetuen", "msgids=" + msgDO.msgIds + ",removePacks=" + msgDO.removePacks + ",errorCode=" + msgDO.errorCode);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", AgooConstants.AGOO_SERVICE_AGOOACK);
            hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
            if (!TextUtils.isEmpty(msgDO.removePacks)) {
                hashMap.put("del_pack", msgDO.removePacks);
            }
            if (!TextUtils.isEmpty(msgDO.errorCode)) {
                hashMap.put("ec", msgDO.errorCode);
            }
            if (!TextUtils.isEmpty(msgDO.type)) {
                hashMap.put("type", msgDO.type);
            }
            if (!TextUtils.isEmpty(msgDO.extData)) {
                hashMap.put("ext", msgDO.extData);
            }
            hashMap.put("appkey", Config.m24181a(this.mContext));
            hashMap.put("utdid", C3197j.m13007b(this.mContext));
            byte[] bytes = new JSONObject(hashMap).toString().getBytes(Request.DEFAULT_CHARSET);
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, C3197j.m13007b(this.mContext), "handlerACKMessageSendData", msgDO.msgIds);
            C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_ACK, "handlerACKMessage", 0.0d);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, bytes, null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = this.mContext;
            ALog.m12941i(TAG, "handlerACKMessage,endRequest,dataId=" + ACCSManager.getAccsInstance(context, Config.m24181a(context), Config.m24189c(this.mContext)).mo12671a(this.mContext, accsRequest, extraInfo), new Object[0]);
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m12940e(TAG, "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th.toString(), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, C3197j.m13007b(this.mContext), "handlerACKMessageExceptionFailed", th.toString());
        }
    }

    public void init(Context context) {
        this.mContext = context;
    }

    public void pingApp(String str, String str2, String str3, int i10) {
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (!TextUtils.isEmpty(msgDO.reportStr)) {
            try {
                if (Integer.parseInt(msgDO.reportStr) >= -1) {
                    reportMethod(msgDO, extraInfo);
                    if (!msgDO.isFromCache) {
                        C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, 0.0d);
                    }
                }
            } catch (Throwable th) {
                ALog.m12939e(TAG, "[report] is error", th, new Object[0]);
            }
        }
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        if (msgDO != null) {
            try {
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_REPORT_ID, msgDO.msgIds, 0.0d);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
                Context context = this.mContext;
                ACCSManager.getAccsInstance(context, Config.m24181a(context), Config.m24189c(this.mContext)).mo12671a(this.mContext, accsRequest, (TaoBaseService.ExtraInfo) null);
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m12940e(TAG, "reportNotifyMessage", Constants.KEY_DATA_ID, accsRequest.dataId, Progress.STATUS, msgDO.msgStatus);
                }
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_CLICK, msgDO.msgStatus, 0.0d);
                C3198k.m13010a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, 0.0d);
            } catch (Throwable th) {
                ALog.m12939e(TAG, "[reportNotifyMessage] is error", th, new Object[0]);
                C3198k.m13010a("accs", "error", th.toString(), 0.0d);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z10) {
        reportThirdPushToken(str, str2, null, z10);
    }

    public void reportThirdPushToken(String str, String str2, String str3, boolean z10) {
        ThreadPoolExecutorFactory.schedule(new RunnableC6052l(this, str2, str, str3, z10), GlobalConfig.getReportThirdTokenDelay(), TimeUnit.SECONDS);
        try {
            int i10 = UmengMessageHandlerService.f15781b;
            Intent intent = new Intent("com.umeng.message.action");
            intent.setPackage(this.mContext.getPackageName());
            intent.setClass(this.mContext, UmengMessageHandlerService.class);
            intent.putExtra("um_command", "third_token");
            intent.putExtra("third_token", str);
            intent.putExtra("type", str2);
            UmengMessageHandlerService.class.getMethod("enqueueWork", Context.class, Class.class, Intent.class).invoke(null, this.mContext, UmengMessageHandlerService.class, intent);
        } catch (Throwable th) {
            ALog.m12939e(TAG, "report push token error", th, new Object[0]);
        }
    }

    public void reportThirdPushToken(String str, String str2) {
        reportThirdPushToken(str, str2, true);
    }
}
