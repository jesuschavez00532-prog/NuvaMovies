package org.android.agoo.control;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3207t;
import com.taobao.accs.utl.C3209v;
import com.taobao.accs.utl.UtilityImpl;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.intent.IntentUtil;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public abstract class BaseIntentService extends Service {
    private static final String TAG = "BaseIntentService";
    private static boolean isBinded = false;
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new HandlerC6047g(this));

    private final String getTrace(Context context, long j10) {
        String str;
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str = "unknow";
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(null)) {
            str2 = "unknow";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appkey");
        stringBuffer.append("|");
        stringBuffer.append(j10);
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(str);
        stringBuffer.append("|");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: all -> 0x0370, TryCatch #6 {all -> 0x0370, blocks: (B:26:0x00c1, B:28:0x00cf, B:29:0x010e, B:31:0x0137, B:33:0x0141, B:35:0x0153, B:38:0x015d, B:45:0x016f, B:47:0x0187, B:130:0x017e, B:137:0x00a2), top: B:136:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137 A[Catch: all -> 0x0370, TryCatch #6 {all -> 0x0370, blocks: (B:26:0x00c1, B:28:0x00cf, B:29:0x010e, B:31:0x0137, B:33:0x0141, B:35:0x0153, B:38:0x015d, B:45:0x016f, B:47:0x0187, B:130:0x017e, B:137:0x00a2), top: B:136:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187 A[Catch: all -> 0x0370, TRY_LEAVE, TryCatch #6 {all -> 0x0370, blocks: (B:26:0x00c1, B:28:0x00cf, B:29:0x010e, B:31:0x0137, B:33:0x0141, B:35:0x0153, B:38:0x015d, B:45:0x016f, B:47:0x0187, B:130:0x017e, B:137:0x00a2), top: B:136:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0206 A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:56:0x01fe, B:58:0x0206, B:60:0x020e, B:61:0x0231, B:63:0x0239, B:65:0x0241, B:93:0x02f4, B:95:0x033b, B:97:0x0356, B:99:0x036a, B:102:0x0362, B:111:0x0295, B:113:0x029d, B:121:0x01e3), top: B:120:0x01e3, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239 A[Catch: all -> 0x036e, TryCatch #3 {all -> 0x036e, blocks: (B:56:0x01fe, B:58:0x0206, B:60:0x020e, B:61:0x0231, B:63:0x0239, B:65:0x0241, B:93:0x02f4, B:95:0x033b, B:97:0x0356, B:99:0x036a, B:102:0x0362, B:111:0x0295, B:113:0x029d, B:121:0x01e3), top: B:120:0x01e3, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0356 A[Catch: Exception -> 0x0361, all -> 0x036e, TRY_LEAVE, TryCatch #18 {Exception -> 0x0361, blocks: (B:95:0x033b, B:97:0x0356), top: B:94:0x033b, outer: #3 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleRemoteMessage(android.content.Context r35, android.content.Intent r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.BaseIntentService.handleRemoteMessage(android.content.Context, android.content.Intent):void");
    }

    private final void handleRemovePackage(Context context, Intent intent) {
        String str;
        if (intent != null && context != null) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(TAG, "handleRemovePackage---->[replacing:" + booleanExtra + "],uninstallPack=" + str, new Object[0]);
            }
            if (!booleanExtra) {
                this.notifyManager.doUninstall(str, booleanExtra);
            }
        }
    }

    public static void runIntentInService(Context context, Intent intent, String str) {
        try {
            intent.setClassName(context, str);
            context.startService(intent);
        } catch (Throwable th) {
            ALog.m12943w(TAG, "runIntentInService", th, new Object[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        getApplication();
        if (C3207t.m13037b() && C3209v.m13044a(this) && !isBinded) {
            isBinded = true;
            getApplicationContext().bindService(new Intent(getApplication(), getClass()), new ServiceConnectionC6049i(this), 1);
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new RunnableC6050j(this));
    }

    protected abstract void onError(Context context, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.mContext = getApplicationContext();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        String agooCommand = IntentUtil.getAgooCommand(this.mContext);
        String thirdPushCommand = IntentUtil.getThirdPushCommand(this.mContext);
        ALog.m12941i(TAG, "onHandleIntent,action=" + action + ",agooCommand=" + agooCommand + ",mipushCommand=" + thirdPushCommand, new Object[0]);
        try {
            if (TextUtils.equals(action, agooCommand)) {
                String stringExtra = intent.getStringExtra("command");
                ALog.m12938d(TAG, "actionCommand --->[" + stringExtra + "]", new Object[0]);
                if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                    onUserCommand(this.mContext, intent);
                }
            } else if (TextUtils.equals(action, thirdPushCommand)) {
                String stringExtra2 = intent.getStringExtra("command");
                String stringExtra3 = intent.getStringExtra(AgooConstants.THIRD_PUSH_ID);
                if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_MIPUSHID_REPORT)) {
                    this.notifyManager.reportThirdPushToken(stringExtra3, "MI_TOKEN", false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HUAWEIPUSHID_REPORT)) {
                    ALog.m12938d(TAG, "HW_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, "HW_TOKEN", false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_GCMIPUSHID_REPORT)) {
                    ALog.m12941i(TAG, "GCM_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM, false);
                }
            } else if (action.equals(AgooConstants.INTENT_FROM_AGOO_MESSAGE)) {
                handleRemoteMessage(this.mContext, intent);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                handleRemovePackage(this.mContext, intent);
            } else if (TextUtils.equals(action, AgooConstants.INTENT_FROM_AGOO_REPORT) || TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE") || TextUtils.equals(action, "android.intent.action.BOOT_COMPLETED") || TextUtils.equals(action, "android.intent.action.PACKAGE_ADDED") || TextUtils.equals(action, "android.intent.action.PACKAGE_REPLACED") || TextUtils.equals(action, "android.intent.action.USER_PRESENT") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_CONNECTED") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                try {
                    ALog.m12941i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.m24191d(this.mContext), new Object[0]);
                    if (Config.m24191d(this.mContext) && UtilityImpl.m12985i(this.mContext)) {
                        Config.m24192e(this.mContext);
                        this.agooFactory.reportCacheMsg();
                        this.messageService.m24210a();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m12941i(TAG, "is clear all msg=" + Config.m24188b(this.mContext, currentTimeMillis), new Object[0]);
                    }
                    if (Config.m24188b(this.mContext, currentTimeMillis)) {
                        Config.m24183a(this.mContext, currentTimeMillis);
                        this.messageService.m24210a();
                    }
                } catch (Throwable th) {
                    ALog.m12939e(TAG, "reportCacheMsg", th, new Object[0]);
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    protected abstract void onMessage(Context context, Intent intent);

    protected abstract void onRegistered(Context context, String str);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        ThreadPoolExecutorFactory.execute(new RunnableC6051k(this, intent));
        return 2;
    }

    protected void onUserCommand(Context context, Intent intent) {
    }
}
