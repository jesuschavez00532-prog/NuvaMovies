package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import com.lzy.okgo.OkGo;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.InterfaceC3118b;
import com.taobao.accs.InterfaceC3130c;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3142g;
import com.taobao.accs.data.Message;
import com.taobao.accs.p071a.C3114a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.C3199l;
import com.taobao.accs.utl.C3209v;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C3384f;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;

/* loaded from: classes.dex */
public class ACCSManagerImpl implements InterfaceC3118b {

    /* renamed from: c */
    private static String f12957c = "ACCSMgrImpl_";

    /* renamed from: b */
    private String f12959b;

    /* renamed from: d */
    private InterfaceC3130c f12960d;

    /* renamed from: a */
    private int f12958a = 0;

    /* renamed from: e */
    private Random f12961e = new Random();

    /* renamed from: f */
    private C3199l.b f12962f = new C3149a(this);

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.f12843a = context.getApplicationContext();
        this.f12959b = str;
        this.f12960d = new C3151c(str);
        if (C3209v.m13049e(context)) {
            C3199l.m13012a().m13016a(this.f12962f);
        }
        f12957c += this.f12959b;
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: c */
    public void mo12701c(Context context, String str) {
        if (UtilityImpl.m12975d(context)) {
            return;
        }
        Intent m12818b = m12818b(context, 6);
        if (m12818b == null) {
            m12814a(context, 6, str, (String) null);
            return;
        }
        String mo12723c = this.f12960d.mo12723c();
        if (TextUtils.isEmpty(mo12723c)) {
            return;
        }
        m12818b.putExtra(Constants.KEY_APP_KEY, mo12723c);
        m12818b.putExtra(Constants.KEY_SERVICE_ID, str);
        if (UtilityImpl.isMainProcess(context)) {
            m12815a(context, Message.buildUnbindService(this.f12960d.mo12720b((String) null), this.f12959b, m12818b), 6, false);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: e */
    public void mo12704e(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public void mo12696b(Context context, String str) {
        if (UtilityImpl.m12975d(context) || UtilityImpl.m12975d(context)) {
            return;
        }
        Intent m12818b = m12818b(context, 5);
        if (m12818b == null) {
            m12814a(context, 5, str, (String) null);
            return;
        }
        String mo12723c = this.f12960d.mo12723c();
        if (TextUtils.isEmpty(mo12723c)) {
            return;
        }
        m12818b.putExtra(Constants.KEY_APP_KEY, mo12723c);
        m12818b.putExtra(Constants.KEY_SERVICE_ID, str);
        if (UtilityImpl.isMainProcess(context)) {
            Message buildBindService = Message.buildBindService(this.f12960d.mo12720b((String) null), this.f12959b, m12818b);
            if (buildBindService != null && buildBindService.getNetPermanceMonitor() != null) {
                buildBindService.getNetPermanceMonitor().setDataId(buildBindService.dataId);
                buildBindService.getNetPermanceMonitor().setMsgType(3);
                buildBindService.getNetPermanceMonitor().setHost(buildBindService.host.toString());
            }
            m12815a(context, buildBindService, 5, false);
        }
        this.f12960d.mo12721b();
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: d */
    public void mo12702d(Context context) {
        UtilityImpl.focusEnableService(context);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: e */
    public void mo12705e(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:19:0x005e, B:21:0x006e, B:23:0x0074, B:25:0x007a, B:30:0x0086, B:31:0x0096, B:33:0x00ab, B:34:0x00b1, B:36:0x00ba, B:38:0x00c9, B:40:0x00cf, B:41:0x00ec, B:42:0x00f9, B:45:0x00f0), top: B:18:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:19:0x005e, B:21:0x006e, B:23:0x0074, B:25:0x007a, B:30:0x0086, B:31:0x0096, B:33:0x00ab, B:34:0x00b1, B:36:0x00ba, B:38:0x00c9, B:40:0x00cf, B:41:0x00ec, B:42:0x00f9, B:45:0x00f0), top: B:18:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:19:0x005e, B:21:0x006e, B:23:0x0074, B:25:0x007a, B:30:0x0086, B:31:0x0096, B:33:0x00ab, B:34:0x00b1, B:36:0x00ba, B:38:0x00c9, B:40:0x00cf, B:41:0x00ec, B:42:0x00f9, B:45:0x00f0), top: B:18:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:19:0x005e, B:21:0x006e, B:23:0x0074, B:25:0x007a, B:30:0x0086, B:31:0x0096, B:33:0x00ab, B:34:0x00b1, B:36:0x00ba, B:38:0x00c9, B:40:0x00cf, B:41:0x00ec, B:42:0x00f9, B:45:0x00f0), top: B:18:0x005e }] */
    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo12684a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.taobao.accs.IAppReceiver r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.mo12684a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver):void");
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: d */
    public void mo12703d(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: c */
    public void mo12700c(Context context) {
        UtilityImpl.focusDisableService(context);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: c */
    public Map<String, Boolean> mo12699c() {
        SessionCenter.getInstance(this.f12960d.mo12723c()).forceRecreateAccsSession();
        return mo12695b();
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public String mo12693b(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return mo12694b(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public String mo12694b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return mo12692b(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public String mo12692b(Context context, ACCSManager.AccsRequest accsRequest) {
        return mo12672a(context, accsRequest, (String) null, true);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public boolean mo12698b(Context context) {
        return UtilityImpl.m12985i(context);
    }

    /* renamed from: b */
    private Intent m12818b(Context context, int i10) {
        if (i10 != 1 && UtilityImpl.m12975d(context)) {
            ALog.m12940e(f12957c, "getIntent null command:" + i10 + " accs enabled:" + UtilityImpl.m12975d(context), new Object[0]);
            return null;
        }
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_COMMAND);
        intent.setClassName(context.getPackageName(), C3197j.channelService);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.putExtra("command", i10);
        intent.putExtra(Constants.KEY_APP_KEY, this.f12960d.mo12723c());
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f12959b);
        return intent;
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public Map<String, Boolean> mo12695b() {
        String mo12720b = this.f12960d.mo12720b((String) null);
        HashMap hashMap = new HashMap();
        hashMap.put(mo12720b, Boolean.FALSE);
        if (SessionCenter.getInstance(this.f12960d.mo12723c()).getThrowsException(mo12720b, OkGo.DEFAULT_MILLISECONDS) != null) {
            hashMap.put(mo12720b, Boolean.TRUE);
        }
        ALog.m12938d(f12957c, "getChannelState " + hashMap.toString(), new Object[0]);
        return hashMap;
    }

    /* renamed from: a */
    private void m12815a(Context context, Message message, int i10, boolean z10) {
        boolean z11;
        this.f12960d.mo12712a();
        if (message == null) {
            ALog.m12940e(f12957c, "message is null", new Object[0]);
            this.f12960d.mo12715a(Message.buildParameterError(context.getPackageName(), i10), -2);
            return;
        }
        if (i10 == 1) {
            String packageName = message.getPackageName();
            if (this.f12960d.mo12728e(packageName) && !z10) {
                ALog.m12941i(f12957c, "isAppBinded", Constants.KEY_PACKAGE, packageName);
                this.f12960d.mo12715a(message, 200);
                z11 = false;
            }
            z11 = true;
        } else if (i10 != 2) {
            if (i10 == 3 && this.f12960d.mo12719a(message.getPackageName(), message.userinfo) && !z10) {
                ALog.m12941i(f12957c, message.getPackageName() + Operator.Operation.DIVISION + message.userinfo + " isUserBinded", "isForceBind", Boolean.valueOf(z10));
                this.f12960d.mo12715a(message, 200);
                z11 = false;
            }
            z11 = true;
        } else {
            if (this.f12960d.mo12730f(message.getPackageName())) {
                ALog.m12941i(f12957c, message.getPackageName() + " isAppUnbinded", new Object[0]);
                this.f12960d.mo12715a(message, 200);
                z11 = false;
            }
            z11 = true;
        }
        if (z11) {
            ALog.m12941i(f12957c, "sendControlMessage", "command", Integer.valueOf(i10));
            this.f12960d.mo12716a(message, true);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: b */
    public void mo12697b(AccsConnectStateListener accsConnectStateListener) {
        if (accsConnectStateListener != null) {
            this.f12960d.mo12722b(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12679a(Context context, String str) {
        mo12685a(context, str, false);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12685a(Context context, String str, boolean z10) {
        try {
            ALog.m12941i(f12957c, "bindUser", "userId", str);
            if (UtilityImpl.m12975d(context)) {
                ALog.m12940e(f12957c, "accs disabled", new Object[0]);
                return;
            }
            Intent m12818b = m12818b(context, 3);
            if (m12818b == null) {
                ALog.m12940e(f12957c, "intent null", new Object[0]);
                m12814a(context, 3, (String) null, (String) null);
                return;
            }
            String mo12723c = this.f12960d.mo12723c();
            if (TextUtils.isEmpty(mo12723c)) {
                ALog.m12940e(f12957c, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.m12971c(context) || z10) {
                ALog.m12941i(f12957c, "force bind User", new Object[0]);
                m12818b.putExtra(Constants.KEY_FOUCE_BIND, true);
                z10 = true;
            }
            m12818b.putExtra(Constants.KEY_APP_KEY, mo12723c);
            m12818b.putExtra(Constants.KEY_USER_ID, str);
            if (UtilityImpl.isMainProcess(context)) {
                Message buildBindUser = Message.buildBindUser(this.f12960d.mo12720b((String) null), this.f12959b, m12818b);
                if (buildBindUser != null && buildBindUser.getNetPermanceMonitor() != null) {
                    buildBindUser.getNetPermanceMonitor().setDataId(buildBindUser.dataId);
                    buildBindUser.getNetPermanceMonitor().setMsgType(2);
                    buildBindUser.getNetPermanceMonitor().setHost(buildBindUser.host.toString());
                }
                m12815a(context, buildBindUser, 3, z10);
            }
            this.f12960d.mo12721b();
        } catch (Throwable th) {
            ALog.m12939e(f12957c, "bindUser", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12676a(Context context) {
        if (UtilityImpl.m12975d(context) || UtilityImpl.m12975d(context)) {
            return;
        }
        Intent m12818b = m12818b(context, 4);
        if (m12818b == null) {
            m12814a(context, 4, (String) null, (String) null);
            return;
        }
        String mo12723c = this.f12960d.mo12723c();
        if (TextUtils.isEmpty(mo12723c)) {
            return;
        }
        m12818b.putExtra(Constants.KEY_APP_KEY, mo12723c);
        if (UtilityImpl.isMainProcess(context)) {
            m12815a(context, Message.buildUnbindUser(this.f12960d.mo12720b((String) null), this.f12959b, m12818b), 4, false);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public String mo12673a(Context context, String str, String str2, byte[] bArr, String str3) {
        return mo12674a(context, str, str2, bArr, str3, (String) null);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public String mo12674a(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return mo12675a(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public String mo12675a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return mo12670a(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        com.taobao.accs.utl.C3198k.m13011a("accs", com.taobao.accs.utl.BaseMonitor.ALARM_POINT_REQ_ERROR, r17.serviceId, "1", "accs disable");
     */
    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo12670a(android.content.Context r16, com.taobao.accs.ACCSManager.AccsRequest r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.mo12670a(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest):java.lang.String");
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public String mo12672a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z10) {
        try {
        } catch (Throwable th) {
            if (accsRequest != null) {
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request " + th.toString());
                ALog.m12939e(f12957c, "sendRequest", th, Constants.KEY_DATA_ID, accsRequest.dataId);
            }
        }
        if (accsRequest == null) {
            ALog.m12940e(f12957c, "sendRequest request null", new Object[0]);
            C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
            return null;
        }
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.m12940e(f12957c, "sendRequest not in mainprocess", new Object[0]);
            return null;
        }
        if (UtilityImpl.m12975d(context)) {
            ALog.m12940e(f12957c, "sendRequest disable", new Object[0]);
            C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            return null;
        }
        if (TextUtils.isEmpty(this.f12960d.mo12723c())) {
            C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
            ALog.m12940e(f12957c, "sendRequest appkey null", new Object[0]);
            return null;
        }
        this.f12960d.mo12712a();
        Message buildRequest = Message.buildRequest(context, this.f12960d.mo12720b((String) null), this.f12959b, "", str == null ? context.getPackageName() : str, Constants.TARGET_SERVICE_PRE, accsRequest, z10);
        if (buildRequest != null && buildRequest.getNetPermanceMonitor() != null) {
            buildRequest.getNetPermanceMonitor().onSend();
        }
        this.f12960d.mo12716a(buildRequest, true);
        return accsRequest.dataId;
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public String mo12671a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        try {
        } catch (Throwable th) {
            C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response " + th.toString());
            ALog.m12939e(f12957c, "sendPushResponse dataid:" + accsRequest.dataId, th, new Object[0]);
        }
        if (context != null && accsRequest != null) {
            C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "push response total");
            if (UtilityImpl.m12975d(context)) {
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse accs disable");
                return null;
            }
            String mo12723c = this.f12960d.mo12723c();
            if (TextUtils.isEmpty(mo12723c)) {
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
                ALog.m12940e(f12957c, "sendPushResponse appkey null", new Object[0]);
                return null;
            }
            if (extraInfo == null) {
                extraInfo = new TaoBaseService.ExtraInfo();
            }
            extraInfo.connType = 1;
            extraInfo.fromHost = "https://" + AccsClientConfig.getConfigByTag(Config.m24189c(context)).getInappHost();
            extraInfo.fromPackage = context.getPackageName();
            ALog.m12941i(f12957c, "sendPushResponse", "isMainProcess", Boolean.valueOf(UtilityImpl.isMainProcess(context)));
            accsRequest.host = new URL(extraInfo.fromHost);
            if (UtilityImpl.isMainProcess(context)) {
                mo12672a(context, accsRequest, context.getPackageName(), false);
            } else {
                Intent intent = new Intent(Constants.ACTION_SEND);
                intent.setClassName(extraInfo.fromPackage, C3197j.msgService);
                intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
                intent.putExtra(Constants.KEY_SEND_REQDATA, accsRequest);
                intent.putExtra(Constants.KEY_APP_KEY, mo12723c);
                intent.putExtra(Constants.KEY_CONFIG_TAG, this.f12959b);
                C3114a.m12664a(context, intent);
            }
            return null;
        }
        ALog.m12940e(f12957c, "sendPushResponse input null", C3384f.f14563X, context, "response", accsRequest, "extraInfo", extraInfo);
        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
        return null;
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public boolean mo12689a() {
        try {
            InterfaceC3130c interfaceC3130c = this.f12960d;
            if (interfaceC3130c != null) {
                return interfaceC3130c.mo12729f();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    @Deprecated
    /* renamed from: a */
    public void mo12677a(Context context, int i10) {
        ACCSClient.setEnvironment(context, i10);
    }

    /* renamed from: a */
    private void m12814a(Context context, int i10, String str, String str2) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i10);
        intent.putExtra(Constants.KEY_SERVICE_ID, str);
        intent.putExtra(Constants.KEY_DATA_ID, str2);
        intent.putExtra(Constants.KEY_APP_KEY, this.f12960d.mo12723c());
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f12959b);
        intent.putExtra(Constants.KEY_ERROR_CODE, i10 == 2 ? 200 : 300);
        C3142g.m12798a(context, intent);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12680a(Context context, String str, int i10) {
        SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            edit.putString(Constants.KEY_PROXY_HOST, str);
        }
        edit.putInt(Constants.KEY_PROXY_PORT, i10);
        edit.apply();
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12683a(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        GlobalClientInfo.getInstance(context).setAppReceiver(this.f12959b, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.m12938d(f12957c, "inapp only init in main process!", new Object[0]);
            return;
        }
        ALog.m12938d(f12957c, "startInAppConnection APPKEY:" + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.equals(this.f12960d.mo12723c(), str)) {
            this.f12960d.mo12724c(str2);
            this.f12960d.mo12726d(str);
        }
        this.f12960d.mo12712a();
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12678a(Context context, ILoginInfo iLoginInfo) {
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f12959b, iLoginInfo);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public boolean mo12691a(String str) {
        return this.f12960d.mo12718a(str);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public boolean mo12690a(int i10) {
        return ErrorCode.isChannelError(i10);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12682a(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12681a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12687a(AccsConnectStateListener accsConnectStateListener) {
        if (accsConnectStateListener != null) {
            this.f12960d.mo12714a(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12688a(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        this.f12960d.mo12716a(Message.buildPushAck(this.f12960d.mo12720b((String) null), this.f12959b, str, str2, str3, true, s10, str4, map), true);
    }

    @Override // com.taobao.accs.InterfaceC3118b
    /* renamed from: a */
    public void mo12686a(AccsClientConfig accsClientConfig) {
        this.f12960d.mo12713a(accsClientConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12816a(InterfaceC3130c interfaceC3130c) {
        ThreadPoolExecutorFactory.schedule(new RunnableC3150b(this, interfaceC3130c), this.f12961e.nextInt(6), TimeUnit.SECONDS);
    }
}
