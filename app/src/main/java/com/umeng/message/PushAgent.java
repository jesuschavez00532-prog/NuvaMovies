package com.umeng.message;

import android.content.Context;
import com.taobao.accs.utl.ALog;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.api.UPushConnectStateListener;
import com.umeng.message.api.UPushInAppMessageCallback;
import com.umeng.message.api.UPushInAppMessageHandler;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3592bj;
import com.umeng.message.proguard.C3637d;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3684i;
import com.umeng.message.proguard.C3698q;
import com.umeng.message.proguard.C3703v;
import com.umeng.message.proguard.C3706y;
import com.umeng.message.tag.TagManager;
import org.android.spdy.SpdyAgent;

/* loaded from: classes.dex */
public class PushAgent {
    private static final String TAG = "PushAgent";

    /* renamed from: a */
    public static final /* synthetic */ int f15772a = 0;
    private static boolean sCommonInit;
    private static volatile boolean sPushInit;
    public boolean isZyb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.PushAgent$a */
    /* loaded from: classes3.dex */
    public static class C3531a {

        /* renamed from: a */
        private static final PushAgent f15773a = new PushAgent();
    }

    static {
        try {
            C3698q m15801a = C3698q.m15801a();
            ALog.setLog(m15801a);
            anet.channel.util.ALog.setLog(m15801a);
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
        sCommonInit = false;
        sPushInit = false;
    }

    public static PushAgent getInstance(Context context) {
        PushAgent pushAgent = C3531a.f15773a;
        if (sPushInit) {
            return pushAgent;
        }
        if (context == null) {
            try {
                context = C3706y.m15840a();
            } catch (Throwable th) {
                UPLog.m15196e(TAG, th);
            }
        }
        C3706y.m15841a(context);
        sPushInit = true;
        return pushAgent;
    }

    private static void init(Context context) {
        if (sCommonInit) {
            return;
        }
        C3678f.m15754c();
        sCommonInit = true;
    }

    @Deprecated
    public static void setup(Context context, String str, String str2) {
        UPLog.m15198i("Core", "setup appkey:", str, "appSecret:", str2);
        C3706y.m15841a(context);
    }

    public void addAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        C3703v.m15825a().addAlias(str, str2, uPushAliasCallback);
    }

    public void changeBadgeNum(int i10) {
        C3592bj.m15425b(C3706y.m15840a(), i10);
    }

    public void deleteAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        C3703v.m15825a().deleteAlias(str, str2, uPushAliasCallback);
    }

    public void disable(UPushSettingCallback uPushSettingCallback) {
        C3703v.m15825a().disable(uPushSettingCallback);
    }

    public void enable(UPushSettingCallback uPushSettingCallback) {
        C3703v.m15825a().enable(uPushSettingCallback);
    }

    public UPushSettingCallback getCallback() {
        return C3703v.m15825a().getSettingCallback();
    }

    public String getDeviceToken() {
        return getRegistrationId();
    }

    public int getDisplayNotificationNumber() {
        return C3703v.m15825a().getDisplayNotificationNumber();
    }

    public String getMessageAppkey() {
        return C3703v.m15825a().getMessageAppkey();
    }

    public String getMessageChannel() {
        return C3703v.m15825a().getMessageChannel();
    }

    public UPushMessageHandler getMessageHandler() {
        return C3703v.m15825a().getMessageHandler();
    }

    public UPushMessageNotifyApi getMessageNotifyApi() {
        return C3703v.m15825a().getMessageNotifyApi();
    }

    public String getMessageSecret() {
        return C3703v.m15825a().getMessageSecret();
    }

    public int getMuteDurationSeconds() {
        return C3703v.m15825a().getMuteDurationSeconds();
    }

    public int getNoDisturbEndHour() {
        return C3703v.m15825a().getNoDisturbEndHour();
    }

    public int getNoDisturbEndMinute() {
        return C3703v.m15825a().getNoDisturbEndMinute();
    }

    public int getNoDisturbStartHour() {
        return C3703v.m15825a().getNoDisturbStartHour();
    }

    public int getNoDisturbStartMinute() {
        return C3703v.m15825a().getNoDisturbStartMinute();
    }

    public String getNotificationChannelName() {
        return C3703v.m15825a().getNotificationChannelName();
    }

    public UPushMessageHandler getNotificationClickHandler() {
        return C3703v.m15825a().getNotificationClickHandler();
    }

    public boolean getNotificationOnForeground() {
        return C3703v.m15825a().getNotificationOnForeground();
    }

    public int getNotificationPlayLights() {
        return C3703v.m15825a().getNotificationPlayLights();
    }

    public int getNotificationPlaySound() {
        return C3703v.m15825a().getNotificationPlaySound();
    }

    public int getNotificationPlayVibrate() {
        return C3703v.m15825a().getNotificationPlayVibrate();
    }

    public String getNotificationSilenceChannelName() {
        return C3703v.m15825a().getNotificationSilenceChannelName();
    }

    public String getPushIntentServiceClass() {
        return C3703v.m15825a().getPushIntentServiceClass();
    }

    public UPushRegisterCallback getRegisterCallback() {
        return C3703v.m15825a().getRegisterCallback();
    }

    public String getRegistrationId() {
        return C3703v.m15825a().getRegistrationId();
    }

    public String getResourcePackageName() {
        return C3703v.m15825a().getResourcePackageName();
    }

    public TagManager getTagManager() {
        return C3703v.m15825a().getTagManager();
    }

    public boolean isConnected() {
        return C3703v.m15825a().isConnected();
    }

    public boolean isNotificationEnabled() {
        if (C3637d.m15625q(C3706y.m15840a()) == 1) {
            return true;
        }
        return false;
    }

    public boolean isPushCheck() {
        return C3703v.m15825a().isPushCheck();
    }

    public void keepLowPowerMode(boolean z10) {
        C3703v.m15825a().keepLowPowerMode(z10);
    }

    public void onAppStart() {
        C3703v.m15825a().onAppStart();
    }

    public boolean openNotificationSettings() {
        return C3637d.m15626r(C3706y.m15840a());
    }

    public void register(UPushRegisterCallback uPushRegisterCallback) {
        C3703v.m15825a().register(uPushRegisterCallback);
    }

    public void setAccsHeartbeatEnable(boolean z10) {
        C3703v.m15825a().setAccsHeartbeatEnable(z10);
    }

    public void setAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        C3703v.m15825a().setAlias(str, str2, uPushAliasCallback);
    }

    public void setBadgeNum(int i10) {
        C3592bj.m15423a(C3706y.m15840a(), i10);
    }

    public void setCallback(UPushSettingCallback uPushSettingCallback) {
        C3703v.m15825a().setSettingCallback(uPushSettingCallback);
    }

    public void setConnectStateListener(UPushConnectStateListener uPushConnectStateListener) {
        C3703v.m15825a().setConnectStateListener(uPushConnectStateListener);
    }

    public void setDebugMode(boolean z10) {
        UPLog.setEnable(z10);
        try {
            SpdyAgent.enableDebug = z10;
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
    }

    public void setDisplayNotificationNumber(int i10) {
        C3703v.m15825a().setDisplayNotificationNumber(i10);
    }

    public void setEnableAlarmHeartbeat(boolean z10) {
        C3703v.m15825a().setEnableAlarmHeartbeat(z10);
    }

    public void setEnableForeground(Context context, boolean z10) {
        C3703v.m15825a().setEnableForeground(z10);
    }

    public void setEnableJobHeartbeat(boolean z10) {
        C3703v.m15825a().setEnableJobHeartbeat(z10);
    }

    public void setInAppMessageCallback(UPushInAppMessageCallback uPushInAppMessageCallback) {
        C3703v.m15825a().setInAppMessageCallback(uPushInAppMessageCallback);
    }

    public void setInAppMessageHandler(UPushInAppMessageHandler uPushInAppMessageHandler) {
        C3703v.m15825a().setInAppMessageHandler(uPushInAppMessageHandler);
    }

    public void setLogUploadEnable(boolean z10) {
        C3678f.f16510b = z10;
    }

    public void setMessageHandler(UPushMessageHandler uPushMessageHandler) {
        C3703v.m15825a().setMessageHandler(uPushMessageHandler);
    }

    public void setMuteDurationSeconds(int i10) {
        C3703v.m15825a().setMuteDurationSeconds(i10);
    }

    public void setNoDisturbMode(int i10, int i11, int i12, int i13) {
        C3703v.m15825a().setNoDisturbMode(i10, i11, i12, i13);
    }

    public void setNotificationChannelName(String str) {
        C3703v.m15825a().setNotificationChannelName(str);
    }

    public void setNotificationClickHandler(UPushMessageHandler uPushMessageHandler) {
        C3703v.m15825a().setNotificationClickHandler(uPushMessageHandler);
    }

    public void setNotificationOnForeground(boolean z10) {
        C3703v.m15825a().setNotificationOnForeground(z10);
    }

    public void setNotificationPlayLights(int i10) {
        C3703v.m15825a().setNotificationPlayLights(i10);
    }

    public void setNotificationPlaySound(int i10) {
        C3703v.m15825a().setNotificationPlaySound(i10);
    }

    public void setNotificationPlayVibrate(int i10) {
        C3703v.m15825a().setNotificationPlayVibrate(i10);
    }

    public void setNotificationSilenceChannelName(String str) {
        C3703v.m15825a().setNotificationSilenceChannelName(str);
    }

    public void setPackageListenerEnable(boolean z10) {
        C3684i.m15777a(z10);
    }

    public void setPullUpEnable(boolean z10) {
        C3703v.m15825a().setPullUpEnable(z10);
    }

    public void setPushCheck(boolean z10) {
        C3703v.m15825a().setPushCheck(z10);
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        C3703v.m15825a().setPushIntentServiceClass(cls);
    }

    public void setRegisterCallback(UPushRegisterCallback uPushRegisterCallback) {
        C3703v.m15825a().setRegisterCallback(uPushRegisterCallback);
    }

    public void setReportThirdTokenDelay(int i10) {
        C3703v.m15825a().setReportThirdTokenDelay(i10);
    }

    public void setResourcePackageName(String str) {
        C3703v.m15825a().setResourcePackageName(str);
    }

    public void setSmartEnable(boolean z10) {
        C3678f.m15749a(z10);
    }

    public void setThirdTokenCallback(UPushThirdTokenCallback uPushThirdTokenCallback) {
        C3703v.m15825a().setThirdTokenCallback(uPushThirdTokenCallback);
    }

    private PushAgent() {
        this.isZyb = true;
    }
}
