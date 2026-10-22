package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.p071a.C3114a;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3188a;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.accs.data.g */
/* loaded from: classes.dex */
public class C3142g {

    /* renamed from: a */
    private static Set<String> f12943a;

    /* renamed from: b */
    private static volatile C3142g f12944b;

    /* renamed from: a */
    public static C3142g m12797a() {
        if (f12944b == null) {
            synchronized (C3142g.class) {
                if (f12944b == null) {
                    f12944b = new C3142g();
                }
            }
        }
        return f12944b;
    }

    /* renamed from: b */
    protected String m12807b() {
        return C3197j.msgService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0209, code lost:
    
        if (com.taobao.accs.utl.C3207t.m13040e() != false) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111 A[Catch: all -> 0x02c3, TRY_LEAVE, TryCatch #2 {all -> 0x02c3, blocks: (B:20:0x0096, B:22:0x00ca, B:30:0x0104, B:33:0x0111, B:43:0x013e, B:46:0x014f, B:106:0x00f4), top: B:19:0x0096 }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.taobao.accs.IAppReceiver] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.taobao.accs.data.g] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m12808b(android.content.Context r45, android.content.Intent r46) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3142g.m12808b(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    public static void m12798a(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_DATA_ID);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            if (ALog.isPrintLog(ALog.Level.D) || "accs-impaas".equals(stringExtra2)) {
                ALog.m12940e("MsgDistribute", "distribMessage", Constants.KEY_DATA_ID, stringExtra);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3143h(context, intent));
        } catch (Throwable th) {
            ALog.m12939e("MsgDistribute", "distribMessage", th, new Object[0]);
            UTMini.getInstance().commitEvent(66001, "MsgToBuss8", "distribMessage" + th.toString(), Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    /* renamed from: a */
    protected boolean m12805a(int i10, String str) {
        if (i10 == 100 || GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            return false;
        }
        long m12976e = UtilityImpl.m12976e();
        if (m12976e == -1 || m12976e > 5242880) {
            return false;
        }
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low");
        ALog.m12940e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(m12976e), Constants.KEY_SERVICE_ID, str);
        return true;
    }

    /* renamed from: a */
    protected boolean m12806a(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
            if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                service = iAppReceiver.getService(str);
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (!TextUtils.isEmpty(service) || UtilityImpl.isMainProcess(context)) {
                return false;
            }
            if ("accs".equals(str)) {
                ALog.m12940e("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            } else {
                ALog.m12941i("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            }
            intent.setClassName(intent.getPackage(), m12807b());
            C3114a.m12664a(context, intent);
            return true;
        } catch (Throwable th) {
            ALog.m12939e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private void m12799a(Context context, Intent intent, String str, String str2, int i10, String str3, String str4, String str5, IAppReceiver iAppReceiver, int i11) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            Object[] objArr = new Object[12];
            objArr[0] = Constants.KEY_CONFIG_TAG;
            objArr[1] = str;
            objArr[2] = Constants.KEY_DATA_ID;
            objArr[3] = str5;
            objArr[4] = Constants.KEY_SERVICE_ID;
            objArr[5] = str4;
            objArr[6] = "command";
            objArr[7] = Integer.valueOf(i10);
            objArr[8] = Constants.KEY_ERROR_CODE;
            objArr[9] = Integer.valueOf(i11);
            objArr[10] = "appReceiver";
            objArr[11] = iAppReceiver == null ? null : iAppReceiver.getClass().getName();
            ALog.m12938d("MsgDistribute", "handleControlMsg", objArr);
        }
        if (iAppReceiver != null) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i11 == 200) {
                        UtilityImpl.disableService(context);
                    }
                    iAppReceiver.onUnbindApp(i11);
                } else if (i10 == 3) {
                    iAppReceiver.onBindUser(str3, i11);
                } else if (i10 == 4) {
                    iAppReceiver.onUnbindUser(i11);
                } else if (i10 != 100) {
                    if (i10 == 101 && TextUtils.isEmpty(str4)) {
                        ALog.m12938d("MsgDistribute", "handleControlMsg serviceId isEmpty", new Object[0]);
                        byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                        if (byteArrayExtra != null) {
                            iAppReceiver.onData(str3, str5, byteArrayExtra);
                        }
                    }
                } else if (TextUtils.isEmpty(str4)) {
                    iAppReceiver.onSendData(str5, i11);
                }
            } else if (iAppReceiver instanceof IAppReceiverV1) {
                ((IAppReceiverV1) iAppReceiver).onBindApp(i11, null);
            } else {
                iAppReceiver.onBindApp(i11);
            }
        }
        if (i10 == 1 && GlobalClientInfo.f12844b != null && str2 != null && str2.equals(Config.m24181a(context))) {
            ALog.m12938d("MsgDistribute", "handleControlMsg agoo receiver onBindApp", new Object[0]);
            GlobalClientInfo.f12844b.onBindApp(i11, null);
            return;
        }
        if (iAppReceiver != null || i10 == 100 || i10 == 104 || i10 == 103) {
            return;
        }
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str4, "1", "appReceiver null return");
        UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i10, "serviceId=" + str4 + " errorCode=" + i11 + " dataId=" + str5, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    /* renamed from: a */
    protected void m12803a(Context context, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i10, int i11) {
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
            ALog.m12940e("MsgDistribute", "handleBusinessMsg start", Constants.KEY_DATA_ID, str2, Constants.KEY_SERVICE_ID, str, "command", Integer.valueOf(i10));
        }
        String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
        if (TextUtils.isEmpty(service) && iAppReceiver != null) {
            service = iAppReceiver.getService(str);
        }
        if (TextUtils.isEmpty(service)) {
            service = GlobalClientInfo.getInstance(context).getService(str);
        }
        if (!TextUtils.isEmpty(service)) {
            if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
                ALog.m12940e("MsgDistribute", "handleBusinessMsg to start service", "className", service);
            }
            NetPerformanceMonitor m12996a = C3188a.m12996a(intent);
            if (m12996a != null) {
                m12996a.start_service = System.currentTimeMillis();
            }
            intent.setClassName(context, service);
            C3114a.m12664a(context, intent);
        } else {
            AccsDataListener listener = GlobalClientInfo.getInstance(context).getListener(str);
            if (listener != null) {
                if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
                    ALog.m12940e("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                C3188a.m12995a(context, intent, listener);
            } else {
                ALog.m12940e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            }
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i10, "serviceId=" + str + " errorCode=" + i11 + " dataId=" + str2, Integer.valueOf(Constants.SDK_VERSION_CODE));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2commandId=");
        sb2.append(i10);
        sb2.append("serviceId=");
        sb2.append(str);
        C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), 0.0d);
    }

    /* renamed from: a */
    protected void m12804a(Context context, Map<String, IAppReceiver> map, Intent intent, int i10, int i11) {
        TaoBaseService.ConnectInfo connectInfo;
        ALog.m12940e("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i10));
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> entry : map.entrySet()) {
                Map<String, String> allService = GlobalClientInfo.getInstance(context).getAllService(entry.getKey());
                if (allService == null) {
                    allService = entry.getValue().getAllServices();
                }
                if (allService != null) {
                    hashMap.putAll(allService);
                }
            }
        }
        if (i10 != 103) {
            if (i10 == 104) {
                for (String str : hashMap.keySet()) {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setClassName(context, str2);
                        C3114a.m12664a(context, intent);
                    }
                }
                return;
            }
            ALog.m12944w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
            return;
        }
        for (String str3 : hashMap.keySet()) {
            if ("accs".equals(str3) || "windvane".equals(str3) || "motu-remote".equals(str3)) {
                String str4 = (String) hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = GlobalClientInfo.getInstance(context).getService(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    intent.setClassName(context, str4);
                    C3114a.m12664a(context, intent);
                }
            }
        }
        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
        String stringExtra = intent.getStringExtra("host");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
        boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
        boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
        if (TextUtils.isEmpty(stringExtra)) {
            connectInfo = null;
        } else {
            if (booleanExtra) {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
            } else {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i11, stringExtra2);
            }
            connectInfo.connected = booleanExtra;
        }
        if (connectInfo != null) {
            ALog.m12938d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
            Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
            context.sendBroadcast(intent2);
            return;
        }
        ALog.m12940e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
    }

    /* renamed from: a */
    private boolean m12800a(Context context, Intent intent, String str, String str2) {
        boolean z10;
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.m12940e("MsgDistribute", "recieve routiong ack", Constants.KEY_DATA_ID, str, Constants.KEY_SERVICE_ID, str2);
            Set<String> set = f12943a;
            if (set != null) {
                set.remove(str);
            }
            C3198k.m13009a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "");
            z10 = true;
        } else {
            z10 = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
                ALog.m12940e("MsgDistribute", "send routiong ack", Constants.KEY_DATA_ID, str, "to pkg", stringExtra, Constants.KEY_SERVICE_ID, str2);
                Intent intent2 = new Intent(Constants.ACTION_COMMAND);
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, C3197j.channelService);
                intent2.putExtra("routingAck", true);
                intent2.putExtra(Constants.KEY_PACKAGE_NAME, stringExtra);
                intent2.putExtra(Constants.KEY_DATA_ID, str);
                C3114a.m12664a(context, intent2);
            } catch (Throwable th) {
                ALog.m12939e("MsgDistribute", "send routing ack", th, Constants.KEY_SERVICE_ID, str2);
            }
        }
        return z10;
    }

    /* renamed from: a */
    private boolean m12801a(Context context, Intent intent, String str, String str2, String str3) {
        AccsClientConfig configByTag = !TextUtils.isEmpty(str3) ? AccsClientConfig.getConfigByTag(str3) : null;
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        if (configByTag != null && !configByTag.isPullUpEnable()) {
            return false;
        }
        try {
            ALog.m12940e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), Constants.KEY_SERVICE_ID, str2);
            intent.setClassName(intent.getPackage(), C3197j.msgService);
            intent.putExtra("routingMsg", true);
            intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            C3114a.m12664a(context, intent);
            if (f12943a == null) {
                f12943a = new HashSet();
            }
            f12943a.add(str);
            ThreadPoolExecutorFactory.schedule(new RunnableC3144i(this, str, str2, intent), 10L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            C3198k.m13011a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "exception", th.toString());
            ALog.m12939e("MsgDistribute", "routing msg error, try election", th, Constants.KEY_SERVICE_ID, str2, Constants.KEY_DATA_ID, str);
        }
        return true;
    }
}
