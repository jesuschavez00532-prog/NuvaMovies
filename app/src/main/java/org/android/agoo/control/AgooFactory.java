package org.android.agoo.control;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.p071a.C3114a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.C6038a;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;

/* loaded from: classes3.dex */
public class AgooFactory {
    private static final String DEAL_MESSAGE = "accs.msgRecevie";
    private static final String TAG = "AgooFactory";
    private static Context mContext;
    protected NotifManager notifyManager = null;
    private MessageService messageService = null;

    /* renamed from: org.android.agoo.control.AgooFactory$a */
    /* loaded from: classes3.dex */
    static class ServiceConnectionC6039a implements ServiceConnection {

        /* renamed from: a */
        private Intent f23688a;

        /* renamed from: b */
        private String f23689b;

        /* renamed from: c */
        private SendMessage f23690c;

        /* renamed from: d */
        private ServiceConnection f23691d = this;

        public ServiceConnectionC6039a(String str, Intent intent) {
            this.f23689b = str;
            this.f23688a = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ALog.m12938d(AgooFactory.TAG, "MessageConnection conneted:" + componentName, new Object[0]);
            this.f23690c = SendMessage.Stub.asInterface(iBinder);
            ALog.m12938d(AgooFactory.TAG, "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.m12938d(AgooFactory.TAG, "MessageConnection sent:" + this.f23688a, new Object[0]);
            if (this.f23690c != null) {
                ThreadPoolExecutorFactory.execute(new RunnableC6046f(this));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ALog.m12938d(AgooFactory.TAG, "MessageConnection disConnected", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.android.agoo.control.AgooFactory$b */
    /* loaded from: classes3.dex */
    public class RunnableC6040b implements Runnable {

        /* renamed from: b */
        private String f23693b;

        /* renamed from: c */
        private Intent f23694c;

        public RunnableC6040b(String str, Intent intent) {
            this.f23693b = str;
            this.f23694c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ALog.m12938d(AgooFactory.TAG, "running tid:" + Thread.currentThread().getId() + ",pack=" + this.f23693b, new Object[0]);
                AgooFactory.mContext.sendBroadcast(this.f23694c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SendMessageRunnable for accs,pack=");
                sb2.append(this.f23693b);
                ALog.m12938d(AgooFactory.TAG, sb2.toString(), new Object[0]);
                try {
                    this.f23694c.setPackage(this.f23693b);
                    this.f23694c.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                    C3114a.m12664a(AgooFactory.mContext, this.f23694c);
                } catch (Throwable unused) {
                }
                Intent intent = new Intent(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                intent.setPackage(this.f23693b);
                ALog.m12938d(AgooFactory.TAG, "this message pack:" + this.f23693b, new Object[0]);
                ALog.m12938d(AgooFactory.TAG, "start to service...", new Object[0]);
                boolean bindService = AgooFactory.mContext.bindService(intent, new ServiceConnectionC6039a(this.f23694c.getStringExtra("id"), this.f23694c), 17);
                ALog.m12938d(AgooFactory.TAG, "start service ret:" + bindService, new Object[0]);
                if (!bindService) {
                    ALog.m12938d(AgooFactory.TAG, "SendMessageRunnable is error", new Object[0]);
                }
            } catch (Throwable th) {
                ALog.m12940e(AgooFactory.TAG, "SendMessageRunnable is error,e=" + th.toString(), new Object[0]);
            }
        }
    }

    private static final boolean checkPackage(Context context, String str) {
        if (context.getPackageManager().getApplicationInfo(str, 0) == null) {
            return false;
        }
        return true;
    }

    private static Bundle getFlag(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
                    if (charArray[6] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_REPORT, "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public static String parseEncryptedMsg(String str) {
        byte[] bArr;
        String str2 = null;
        try {
            String m24181a = Config.m24181a(mContext);
            String m24186b = Config.m24186b(mContext);
            String m12986j = UtilityImpl.m12986j(mContext);
            if (!TextUtils.isEmpty(m24186b)) {
                bArr = C6038a.m24200a(m24186b.getBytes("utf-8"), (m24181a + m12986j).getBytes("utf-8"));
            } else {
                ALog.m12940e(TAG, "getAppsign secret null", new Object[0]);
                bArr = null;
            }
            if (bArr != null && bArr.length > 0) {
                str2 = new String(C6038a.m24199a(Base64.decode(str, 8), new SecretKeySpec(C6038a.m24198a(bArr), "AES"), C6038a.m24198a(m24181a.getBytes("utf-8"))), "utf-8");
            } else {
                ALog.m12940e(TAG, "aesDecrypt key is null!", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m12939e(TAG, "parseEncryptedMsg failure: ", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str2)) {
            return parseEncryptedMsgByOldDid(str);
        }
        return str2;
    }

    private static String parseEncryptedMsgByOldDid(String str) {
        byte[] bArr;
        try {
            String m12974d = UtilityImpl.m12974d(Constants.SP_FILE_NAME, mContext);
            if (TextUtils.isEmpty(m12974d) || TextUtils.equals(m12974d, UtilityImpl.m12986j(mContext))) {
                return null;
            }
            String m24181a = Config.m24181a(mContext);
            String m24186b = Config.m24186b(mContext);
            if (!TextUtils.isEmpty(m24186b)) {
                bArr = C6038a.m24200a(m24186b.getBytes("utf-8"), (m24181a + m12974d).getBytes("utf-8"));
            } else {
                ALog.m12940e(TAG, "oldDid getAppsign secret null", new Object[0]);
                bArr = null;
            }
            if (bArr != null && bArr.length > 0) {
                return new String(C6038a.m24199a(Base64.decode(str, 8), new SecretKeySpec(C6038a.m24198a(bArr), "AES"), C6038a.m24198a(m24181a.getBytes("utf-8"))), "utf-8");
            }
            ALog.m12940e(TAG, "oldDid aesDecrypt key is null!", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.m12939e(TAG, "oldDid parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    private void sendMsgByBindService(String str, Intent intent) {
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(TAG, "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC6040b(str, intent));
        } catch (Throwable th) {
            ALog.m12939e(TAG, "sendMsgByBindService error >>", th, new Object[0]);
        }
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        Intent intent = new Intent();
        intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
        } catch (Throwable th) {
            ALog.m12939e(TAG, "sendMsgToBussiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i(TAG, "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + C3197j.m13007b(context) + ",pack=" + str + ",agooFlag=" + z10, new Object[0]);
        }
        if (z10) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3197j.m13007b(context), "agooMsg", AgooConstants.ACK_PACK_ERROR);
            sendMsgByBindService(str, intent);
        } else {
            intent.setClassName(str, C3131a.m12733b());
            C3114a.m12664a(context, intent);
        }
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService) {
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (notifManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService;
        if (messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.m24211a(mContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:46|(2:48|(1:50)(4:64|44|31|32))(1:65)|51|52|53|(1:55)|56|(1:58)(1:59)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021c, code lost:
    
        if (com.taobao.accs.utl.ALog.isPrintLog(com.taobao.accs.utl.ALog.Level.I) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021e, code lost:
    
        com.taobao.accs.utl.ALog.m12941i(org.android.agoo.control.AgooFactory.TAG, "agoo msg has no time", new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle msgReceiverPreHandler(byte[] r36, java.lang.String r37, com.taobao.accs.base.TaoBaseService.ExtraInfo r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.msgReceiverPreHandler(byte[], java.lang.String, com.taobao.accs.base.TaoBaseService$ExtraInfo, boolean):android.os.Bundle");
    }

    public void msgRecevie(byte[] bArr, String str) {
        msgRecevie(bArr, str, null);
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new RunnableC6043c(this));
        } catch (Throwable th) {
            ALog.m12940e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, null);
    }

    public void updateMsg(byte[] bArr, boolean z10) {
        ThreadPoolExecutorFactory.execute(new RunnableC6044d(this, bArr, z10));
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m12941i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.m24193f(mContext), new Object[0]);
                }
                if (TextUtils.equals(str2, MessageService.MSG_ACCS_NOTIFY_CLICK)) {
                    this.messageService.m24212a(str, "2");
                } else if (TextUtils.equals(str2, MessageService.MSG_ACCS_NOTIFY_DISMISS)) {
                    this.messageService.m24212a(str, "3");
                }
            }
        } catch (Throwable th) {
            ALog.m12940e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC6045e(this, str, str2));
    }

    public void msgRecevie(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m12941i(TAG, "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC6042b(this, bArr, str, extraInfo));
        } catch (Throwable th) {
            ALog.m12940e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        ThreadPoolExecutorFactory.execute(new RunnableC6041a(this, bArr, str));
    }
}
