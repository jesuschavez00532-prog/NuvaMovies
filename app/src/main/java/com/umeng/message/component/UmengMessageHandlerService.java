package com.umeng.message.component;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.LruCache;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.p075a.p076a.C3216c;
import com.umeng.analytics.pro.C3384f;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.AbstractServiceC3699r;
import com.umeng.message.proguard.C3581b;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3682h;
import com.umeng.message.proguard.C3686j;
import com.umeng.message.proguard.C3696o;
import com.umeng.message.proguard.C3703v;
import com.umeng.message.proguard.C3704w;
import com.umeng.message.proguard.C3706y;
import com.umeng.message.proguard.C3707z;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UmengMessageHandlerService extends AbstractServiceC3699r {

    /* renamed from: a */
    private static final LruCache<String, String> f15780a = new LruCache<>(3);

    /* renamed from: b */
    public static final /* synthetic */ int f15781b = 0;

    @Override // com.umeng.message.proguard.AbstractServiceC3699r
    public final void onHandleWork(Intent intent) {
        UPushMessageHandler messageHandler;
        final Application m15840a = C3706y.m15840a();
        if (m15840a == null) {
            UPLog.m15198i("MsgHandlerService", "context null!");
            return;
        }
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("um_command");
        UPLog.m15198i("MsgHandlerService", "action:", action, stringExtra);
        if (!TextUtils.equals("com.umeng.message.action", action)) {
            return;
        }
        if (stringExtra != null && stringExtra.length() != 0) {
            char c10 = 65535;
            switch (stringExtra.hashCode()) {
                case -1298848381:
                    if (stringExtra.equals("enable")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1224577496:
                    if (stringExtra.equals("handle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -690213213:
                    if (stringExtra.equals(C3216c.JSON_CMD_REGISTER)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3526536:
                    if (stringExtra.equals("send")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 443595041:
                    if (stringExtra.equals("third_token")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1671308008:
                    if (stringExtra.equals("disable")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    try {
                        boolean booleanExtra = intent.getBooleanExtra(Progress.STATUS, false);
                        UPushSettingCallback settingCallback = C3703v.m15825a().getSettingCallback();
                        UPLog.m15198i("MsgHandlerService", "push open status:".concat(String.valueOf(booleanExtra)));
                        if (booleanExtra) {
                            if (settingCallback != null) {
                                settingCallback.onSuccess();
                                return;
                            }
                            return;
                        } else {
                            if (settingCallback != null) {
                                settingCallback.onFailure(intent.getStringExtra(Constants.KEY_HTTP_CODE), intent.getStringExtra("desc"));
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        UPLog.m15196e("MsgHandlerService", th);
                        return;
                    }
                case 1:
                    try {
                        String stringExtra2 = intent.getStringExtra("body");
                        if (stringExtra2 == null) {
                            return;
                        }
                        UMessage uMessage = new UMessage(new JSONObject(stringExtra2));
                        if ((!UMessage.DISPLAY_TYPE_NOTIFICATION.equals(uMessage.getDisplayType()) || !uMessage.hasResourceFromInternet() || !C3686j.m15781a().m15784a(intent)) && (messageHandler = C3703v.m15825a().getMessageHandler()) != null) {
                            messageHandler.handleMessage(m15840a, uMessage);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        UPLog.m15196e("MsgHandlerService", th2);
                        return;
                    }
                case 2:
                    try {
                        final String stringExtra3 = intent.getStringExtra("registration_id");
                        boolean booleanExtra2 = intent.getBooleanExtra(Progress.STATUS, false);
                        UPLog.m15198i("MsgHandlerService", "deviceToken:", stringExtra3, "status:", Boolean.valueOf(booleanExtra2));
                        final UPushRegisterCallback registerCallback = C3703v.m15825a().getRegisterCallback();
                        try {
                            if (booleanExtra2) {
                                C3581b.m15378c(new Runnable() { // from class: com.umeng.message.component.UmengMessageHandlerService.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final String str = "";
                                        try {
                                            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
                                            str = messageSharedPrefs.m15179l();
                                            String str2 = stringExtra3;
                                            if (str2 != null && str != null && !str2.equals(str)) {
                                                String str3 = stringExtra3;
                                                if (str3 == null) {
                                                    messageSharedPrefs.f15770b.m15393a("device_token");
                                                } else {
                                                    messageSharedPrefs.f15770b.m15396a("device_token", str3);
                                                }
                                                Context context = m15840a;
                                                messageSharedPrefs.f15770b.m15393a("has_register");
                                                messageSharedPrefs.f15770b.m15393a(C3384f.f14621p);
                                                messageSharedPrefs.f15770b.m15393a("re_pop_times");
                                                messageSharedPrefs.f15770b.m15393a("re_pop_cfg");
                                                messageSharedPrefs.f15770b.m15393a("tags");
                                                messageSharedPrefs.f15770b.m15393a("tag_remain");
                                                messageSharedPrefs.m15168b("tag_add_");
                                                messageSharedPrefs.m15168b("tag_del_");
                                                messageSharedPrefs.m15168b("tag_get_");
                                                messageSharedPrefs.m15168b("alias_del_");
                                                messageSharedPrefs.m15168b("alias_set_");
                                                messageSharedPrefs.m15168b("alias_add_");
                                                try {
                                                    context.getContentResolver().delete(C3682h.m15768b(context), null, null);
                                                } catch (Throwable th3) {
                                                    UPLog.m15196e("Prefs", th3);
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            UPLog.m15196e("MsgHandlerService", th4);
                                        }
                                        try {
                                            UPushRegisterCallback uPushRegisterCallback = registerCallback;
                                            if (uPushRegisterCallback != null) {
                                                uPushRegisterCallback.onSuccess(stringExtra3);
                                            }
                                        } catch (Throwable th5) {
                                            UPLog.m15196e("MsgHandlerService", th5);
                                        }
                                        final C3707z m15843a = C3707z.m15843a();
                                        if (!C3707z.m15850c()) {
                                            final MessageSharedPrefs messageSharedPrefs2 = MessageSharedPrefs.getInstance(C3706y.m15840a());
                                            if (!messageSharedPrefs2.f15770b.m15403b("has_register", false) && !C3707z.f16646a) {
                                                C3707z.f16646a = true;
                                                C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.z.3

                                                    /* renamed from: a */
                                                    final /* synthetic */ String f16656a;

                                                    /* renamed from: b */
                                                    final /* synthetic */ MessageSharedPrefs f16657b;

                                                    public AnonymousClass3(final String str4, final MessageSharedPrefs messageSharedPrefs22) {
                                                        r2 = str4;
                                                        r3 = messageSharedPrefs22;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            C3707z.this.f16649c.mo15283a(r2);
                                                            UPLog.m15198i("Track", "trackRegister deviceToken:", r3.m15179l());
                                                        } catch (Throwable th6) {
                                                            try {
                                                                UPLog.m15196e("Track", th6);
                                                            } finally {
                                                                C3707z.m15852e();
                                                            }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        C3703v.m15825a().onAppStart();
                                        C3696o.m15793a();
                                    }
                                });
                                return;
                            } else {
                                if (registerCallback != null) {
                                    registerCallback.onFailure(intent.getStringExtra(Constants.KEY_HTTP_CODE), intent.getStringExtra("desc"));
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            UPLog.m15196e("MsgHandlerService", th);
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                case 3:
                    try {
                        String stringExtra4 = intent.getStringExtra("send_message");
                        if (stringExtra4 == null) {
                            return;
                        }
                        String stringExtra5 = intent.getStringExtra("um_px_path");
                        JSONObject jSONObject = new JSONObject(stringExtra4);
                        jSONObject.put("um_px_path", stringExtra5);
                        UMWorkDispatch.sendEvent(m15840a, 16388, C3704w.m15832a(), jSONObject.toString());
                        return;
                    } catch (Throwable th5) {
                        UPLog.m15196e("MsgHandlerService", th5);
                        return;
                    }
                case 4:
                    try {
                        String stringExtra6 = intent.getStringExtra("third_token");
                        String m15745a = C3678f.m15745a(intent.getStringExtra("type"));
                        if (!TextUtils.isEmpty(m15745a) && !TextUtils.isEmpty(stringExtra6)) {
                            LruCache<String, String> lruCache = f15780a;
                            if (TextUtils.equals(lruCache.get(m15745a), stringExtra6)) {
                                UPLog.m15198i("MsgHandlerService", "third push callback skipped! already called.");
                                return;
                            }
                            UPLog.m15198i("MsgHandlerService", "third push type:", m15745a, "token:", stringExtra6);
                            UPushThirdTokenCallback thirdTokenCallback = C3703v.m15825a().getThirdTokenCallback();
                            if (thirdTokenCallback != null) {
                                thirdTokenCallback.onToken(m15745a, stringExtra6);
                            } else {
                                String pushIntentServiceClass = C3703v.m15825a().getPushIntentServiceClass();
                                if (!TextUtils.isEmpty(pushIntentServiceClass)) {
                                    Class<?> cls = Class.forName(pushIntentServiceClass);
                                    Intent intent2 = new Intent();
                                    intent2.setPackage(m15840a.getPackageName());
                                    intent2.putExtra("um_command", "third_token");
                                    intent2.putExtra("third_token", stringExtra6);
                                    intent2.putExtra("type", m15745a);
                                    intent2.setClass(m15840a, cls);
                                    AbstractServiceC3699r.enqueueWork(m15840a, cls, intent2);
                                }
                            }
                            lruCache.put(m15745a, stringExtra6);
                            return;
                        }
                        UPLog.m15198i("MsgHandlerService", "third push skipped! type:", m15745a, "token:", stringExtra6);
                        return;
                    } catch (Throwable th6) {
                        UPLog.m15196e("MsgHandlerService", th6);
                        return;
                    }
                case 5:
                    try {
                        boolean booleanExtra3 = intent.getBooleanExtra(Progress.STATUS, false);
                        UPushSettingCallback settingCallback2 = C3703v.m15825a().getSettingCallback();
                        UPLog.m15198i("MsgHandlerService", "push close status:".concat(String.valueOf(booleanExtra3)));
                        if (booleanExtra3) {
                            if (settingCallback2 != null) {
                                settingCallback2.onSuccess();
                                return;
                            }
                            return;
                        } else {
                            if (settingCallback2 != null) {
                                settingCallback2.onFailure(intent.getStringExtra(Constants.KEY_HTTP_CODE), intent.getStringExtra("desc"));
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th7) {
                        UPLog.m15196e("MsgHandlerService", th7);
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
