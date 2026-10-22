package com.umeng.message.proguard;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoRegister;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.UTrack;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.UmengMessageService;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.api.UPushApi;
import com.umeng.message.api.UPushConnectStateListener;
import com.umeng.message.api.UPushInAppMessageCallback;
import com.umeng.message.api.UPushInAppMessageHandler;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.UPushNotificationChannel;
import com.umeng.message.component.UmengMessageHandlerService;
import com.umeng.message.tag.TagManager;

/* renamed from: com.umeng.message.proguard.v */
/* loaded from: classes3.dex */
public final class C3703v implements UPushApi {

    /* renamed from: a */
    private boolean f16612a;

    /* renamed from: b */
    private boolean f16613b;

    /* renamed from: c */
    private boolean f16614c;

    /* renamed from: d */
    private boolean f16615d;

    /* renamed from: e */
    private volatile UPushRegisterCallback f16616e;

    /* renamed from: f */
    private volatile UPushThirdTokenCallback f16617f;

    /* renamed from: g */
    private volatile UPushSettingCallback f16618g;

    /* renamed from: h */
    private volatile UPushMessageHandler f16619h;

    /* renamed from: i */
    private volatile UPushMessageHandler f16620i;

    /* renamed from: j */
    private volatile UPushInAppMessageCallback f16621j;

    /* renamed from: k */
    private volatile UPushInAppMessageHandler f16622k;

    /* renamed from: l */
    private volatile UPushConnectStateListener f16623l;

    /* renamed from: m */
    private volatile boolean f16624m;

    /* renamed from: n */
    private volatile ACCSClient f16625n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.v$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3703v f16640a = new C3703v(0);
    }

    /* synthetic */ C3703v(byte b10) {
        this();
    }

    /* renamed from: c */
    static /* synthetic */ boolean m15828c(C3703v c3703v) {
        c3703v.f16624m = true;
        return true;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void addAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        UTrack.getInstance().addAlias(str, str2, uPushAliasCallback);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void deleteAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        UTrack.getInstance().deleteAlias(str, str2, uPushAliasCallback);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void disable(UPushSettingCallback uPushSettingCallback) {
        setSettingCallback(uPushSettingCallback);
        try {
            final Application m15840a = C3706y.m15840a();
            TaobaoRegister.unbindAgoo(m15840a, new ICallback() { // from class: com.umeng.message.proguard.v.6
                @Override // com.taobao.agoo.ICallback
                public final void onFailure(String str, String str2) {
                    UPLog.m15197e("Mgr", "push disable failed. code:", str, "desc:", str2);
                    Intent intent = new Intent("com.umeng.message.action");
                    intent.setPackage(m15840a.getPackageName());
                    intent.setClass(m15840a, UmengMessageHandlerService.class);
                    intent.putExtra("um_command", "disable");
                    intent.putExtra(Progress.STATUS, false);
                    intent.putExtra(Constants.KEY_HTTP_CODE, str);
                    intent.putExtra("desc", str2);
                    AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
                }

                @Override // com.taobao.agoo.ICallback
                public final void onSuccess() {
                    UPLog.m15198i("Mgr", "push disable success.");
                    Intent intent = new Intent("com.umeng.message.action");
                    intent.setPackage(m15840a.getPackageName());
                    intent.setClass(m15840a, UmengMessageHandlerService.class);
                    intent.putExtra("um_command", "disable");
                    intent.putExtra(Progress.STATUS, true);
                    AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
                }
            });
        } catch (Exception e10) {
            UPLog.m15196e("Mgr", e10);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void enable(UPushSettingCallback uPushSettingCallback) {
        setSettingCallback(uPushSettingCallback);
        try {
            final Application m15840a = C3706y.m15840a();
            TaobaoRegister.bindAgoo(m15840a, new ICallback() { // from class: com.umeng.message.proguard.v.5
                @Override // com.taobao.agoo.ICallback
                public final void onFailure(String str, String str2) {
                    UPLog.m15198i("Mgr", "push enable failed. code:", str, "desc:", str2);
                    Intent intent = new Intent("com.umeng.message.action");
                    intent.setPackage(m15840a.getPackageName());
                    intent.setClass(m15840a, UmengMessageHandlerService.class);
                    intent.putExtra("um_command", "enable");
                    intent.putExtra(Progress.STATUS, false);
                    intent.putExtra(Constants.KEY_HTTP_CODE, str);
                    intent.putExtra("desc", str2);
                    AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
                }

                @Override // com.taobao.agoo.ICallback
                public final void onSuccess() {
                    UPLog.m15198i("Mgr", "push enable success.");
                    Intent intent = new Intent("com.umeng.message.action");
                    intent.setPackage(m15840a.getPackageName());
                    intent.setClass(m15840a, UmengMessageHandlerService.class);
                    intent.putExtra("um_command", "enable");
                    intent.putExtra(Progress.STATUS, true);
                    AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
                }
            });
        } catch (Exception e10) {
            UPLog.m15196e("Mgr", e10);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushConnectStateListener getConnectStateListener() {
        return this.f16623l;
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getDisplayNotificationNumber() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15165b();
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushInAppMessageCallback getInAppMessageCallback() {
        return this.f16621j;
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushInAppMessageHandler getInAppMessageHandler() {
        return this.f16622k;
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getMessageAppkey() {
        Application m15840a = C3706y.m15840a();
        String appkey = UMUtils.getAppkey(m15840a);
        if (!TextUtils.isEmpty(appkey)) {
            return appkey;
        }
        String m15169c = MessageSharedPrefs.getInstance(m15840a).m15169c();
        if (!TextUtils.isEmpty(m15169c)) {
            return m15169c;
        }
        return C3637d.m15597a((Context) m15840a, "UMENG_APPKEY");
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getMessageChannel() {
        Application m15840a = C3706y.m15840a();
        String channel = UMUtils.getChannel(m15840a);
        if (!TextUtils.isEmpty(channel)) {
            return channel;
        }
        String m15401b = MessageSharedPrefs.getInstance(m15840a).f15770b.m15401b("channel", "");
        if (!TextUtils.isEmpty(m15401b)) {
            return m15401b;
        }
        return C3637d.m15622n(m15840a);
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushMessageHandler getMessageHandler() {
        if (this.f16619h == null) {
            this.f16619h = new UmengMessageHandler();
        }
        return this.f16619h;
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushMessageNotifyApi getMessageNotifyApi() {
        return C3577aw.m15353a();
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getMessageSecret() {
        Application m15840a = C3706y.m15840a();
        String m15401b = MessageSharedPrefs.getInstance(m15840a).f15770b.m15401b("message_secret", "");
        if (!TextUtils.isEmpty(m15401b)) {
            return m15401b;
        }
        return C3637d.m15597a((Context) m15840a, "UMENG_MESSAGE_SECRET");
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getMuteDurationSeconds() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15174g();
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNoDisturbEndHour() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15399b("end_hour", 7);
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNoDisturbEndMinute() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15399b("end_minute", 0);
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNoDisturbStartHour() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15399b("start_hour", 23);
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNoDisturbStartMinute() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15399b("start_minute", 0);
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getNotificationChannelName() {
        String m15401b = MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15401b("notification_channel_default", "");
        if (TextUtils.isEmpty(m15401b)) {
            return UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME;
        }
        return m15401b;
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushMessageHandler getNotificationClickHandler() {
        if (this.f16620i == null) {
            this.f16620i = new UmengNotificationClickHandler();
        }
        return this.f16620i;
    }

    @Override // com.umeng.message.api.UPushApi
    public final boolean getNotificationOnForeground() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15403b("notification_foreground_show", true);
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNotificationPlayLights() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15177j();
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNotificationPlaySound() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15178k();
    }

    @Override // com.umeng.message.api.UPushApi
    public final int getNotificationPlayVibrate() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15176i();
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getNotificationSilenceChannelName() {
        String m15401b = MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15401b("notification_channel_silence", "");
        if (TextUtils.isEmpty(m15401b)) {
            return UPushNotificationChannel.DEFAULT_NOTIFICATION_SILENCE_CHANNEL_NAME;
        }
        return m15401b;
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getPushIntentServiceClass() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15172e();
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushRegisterCallback getRegisterCallback() {
        return this.f16616e;
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getRegistrationId() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15179l();
    }

    @Override // com.umeng.message.api.UPushApi
    public final String getResourcePackageName() {
        return MessageSharedPrefs.getInstance(C3706y.m15840a()).m15175h();
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushSettingCallback getSettingCallback() {
        return this.f16618g;
    }

    @Override // com.umeng.message.api.UPushApi
    public final TagManager getTagManager() {
        return TagManager.getInstance();
    }

    @Override // com.umeng.message.api.UPushApi
    public final UPushThirdTokenCallback getThirdTokenCallback() {
        return this.f16617f;
    }

    @Override // com.umeng.message.api.UPushApi
    public final boolean isConnected() {
        try {
            ACCSClient aCCSClient = this.f16625n;
            if (aCCSClient == null) {
                return false;
            }
            return aCCSClient.isAccsConnected();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final boolean isPushCheck() {
        return this.f16615d;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void keepLowPowerMode(boolean z10) {
        this.f16612a = z10;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void onAppStart() {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.v.2
            @Override // java.lang.Runnable
            public final void run() {
                C3707z.m15843a().m15855b();
            }
        });
    }

    @Override // com.umeng.message.api.UPushApi
    public final void register(UPushRegisterCallback uPushRegisterCallback) {
        if (uPushRegisterCallback != null && uPushRegisterCallback != this.f16616e) {
            this.f16616e = uPushRegisterCallback;
        }
        Runnable runnable = new Runnable() { // from class: com.umeng.message.proguard.v.1
            @Override // java.lang.Runnable
            public final void run() {
                C3703v.m15826a(C3703v.this);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C3581b.m15378c(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setAccsHeartbeatEnable(boolean z10) {
        this.f16614c = z10;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        UTrack.getInstance().setAlias(str, str2, uPushAliasCallback);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setConnectStateListener(UPushConnectStateListener uPushConnectStateListener) {
        this.f16623l = uPushConnectStateListener;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setDisplayNotificationNumber(int i10) {
        if (i10 >= 0 && i10 <= 10) {
            MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15394a("notification_number", i10);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setEnableAlarmHeartbeat(boolean z10) {
        try {
            GlobalConfig.setAlarmHeartbeatEnable(z10);
        } catch (Throwable th) {
            UPLog.m15196e("Mgr", th);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setEnableForeground(boolean z10) {
        try {
            GlobalConfig.setEnableForeground(C3706y.m15840a(), z10);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setEnableJobHeartbeat(boolean z10) {
        try {
            GlobalConfig.setJobHeartbeatEnable(z10);
        } catch (Throwable th) {
            UPLog.m15196e("Mgr", th);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setInAppMessageCallback(UPushInAppMessageCallback uPushInAppMessageCallback) {
        this.f16621j = uPushInAppMessageCallback;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setInAppMessageHandler(UPushInAppMessageHandler uPushInAppMessageHandler) {
        this.f16622k = uPushInAppMessageHandler;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setMessageHandler(UPushMessageHandler uPushMessageHandler) {
        this.f16619h = uPushMessageHandler;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setMuteDurationSeconds(int i10) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15394a("mute_duration", i10);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNoDisturbMode(int i10, int i11, int i12, int i13) {
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
        messageSharedPrefs.f15770b.m15394a("start_hour", i10);
        messageSharedPrefs.f15770b.m15394a("start_minute", i11);
        messageSharedPrefs.f15770b.m15394a("end_hour", i12);
        messageSharedPrefs.f15770b.m15394a("end_minute", i13);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationChannelName(String str) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15396a("notification_channel_default", str);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationClickHandler(UPushMessageHandler uPushMessageHandler) {
        this.f16620i = uPushMessageHandler;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationOnForeground(boolean z10) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15398a("notification_foreground_show", z10);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationPlayLights(int i10) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15394a("notification_light", i10);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationPlaySound(int i10) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15394a("notification_sound", i10);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationPlayVibrate(int i10) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15394a("notification_vibrate", i10);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setNotificationSilenceChannelName(String str) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15396a("notification_channel_silence", str);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setPullUpEnable(boolean z10) {
        this.f16613b = z10;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setPushCheck(boolean z10) {
        this.f16615d = z10;
    }

    @Override // com.umeng.message.api.UPushApi
    public final <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
        if (cls == null) {
            messageSharedPrefs.f15770b.m15393a("service_class");
        } else {
            messageSharedPrefs.f15770b.m15396a("service_class", cls.getName());
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setRegisterCallback(UPushRegisterCallback uPushRegisterCallback) {
        this.f16616e = uPushRegisterCallback;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setReportThirdTokenDelay(int i10) {
        try {
            GlobalConfig.setReportThirdTokenDelay(i10);
        } catch (Throwable th) {
            UPLog.m15196e("Mgr", th);
        }
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setResourcePackageName(String str) {
        MessageSharedPrefs.getInstance(C3706y.m15840a()).f15770b.m15396a("res_pkg", str);
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setSettingCallback(UPushSettingCallback uPushSettingCallback) {
        this.f16618g = uPushSettingCallback;
    }

    @Override // com.umeng.message.api.UPushApi
    public final void setThirdTokenCallback(UPushThirdTokenCallback uPushThirdTokenCallback) {
        this.f16617f = uPushThirdTokenCallback;
    }

    private C3703v() {
        this.f16613b = true;
    }

    /* renamed from: a */
    public static UPushApi m15825a() {
        return a.f16640a;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0231 A[Catch: all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:71:0x01d3, B:74:0x01ea, B:76:0x01f0, B:78:0x01fa, B:79:0x0211, B:81:0x0221, B:83:0x0227, B:85:0x0231, B:86:0x0246, B:88:0x0256, B:90:0x025c, B:92:0x0266), top: B:70:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0266 A[Catch: all -> 0x0280, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:71:0x01d3, B:74:0x01ea, B:76:0x01f0, B:78:0x01fa, B:79:0x0211, B:81:0x0221, B:83:0x0227, B:85:0x0231, B:86:0x0246, B:88:0x0256, B:90:0x025c, B:92:0x0266), top: B:70:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027d A[Catch: all -> 0x02a7, TRY_ENTER, TryCatch #6 {all -> 0x02a7, blocks: (B:3:0x0010, B:5:0x0016, B:18:0x0035, B:20:0x003f, B:22:0x0045, B:34:0x0064, B:36:0x0072, B:39:0x007a, B:51:0x008b, B:54:0x0093, B:56:0x015a, B:63:0x0191, B:65:0x0197, B:66:0x019c, B:68:0x01b9, B:69:0x01ca, B:96:0x027d, B:100:0x0186, B:101:0x0280, B:112:0x0288, B:58:0x0167, B:60:0x017a), top: B:2:0x0010, inners: #4 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m15826a(com.umeng.message.proguard.C3703v r17) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3703v.m15826a(com.umeng.message.proguard.v):void");
    }
}
