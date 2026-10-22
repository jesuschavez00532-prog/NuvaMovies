package com.umeng.message.proguard;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.component.UmengMessageHandlerService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.aa */
/* loaded from: classes3.dex */
final class C3555aa extends AbstractC3556ab {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r8 = r8.getNotificationChannels();
     */
    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo15285a(java.lang.String r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3555aa.mo15285a(java.lang.String, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: b */
    public final void mo15288b(String str, int i10) {
        Application m15840a = C3706y.m15840a();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("ts", System.currentTimeMillis());
        jSONObject3.put("pa", "");
        jSONObject3.put("msg_id", str);
        jSONObject3.put("action_type", 21);
        if (i10 >= 0) {
            jSONObject3.put("chan_name", i10);
        }
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONArray);
        jSONObject.put("content", jSONObject4);
        if (C3678f.m15753b(m15840a)) {
            jSONObject2.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
            jSONObject2.put("din", C3637d.m15602c(m15840a));
            jSONObject2.put("push_switch", C3637d.m15624p(m15840a));
            UMWorkDispatch.sendEvent(m15840a, 16385, C3704w.m15832a(), jSONObject.toString());
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("jsonHeader", jSONObject2);
            jSONObject5.put("jsonBody", jSONObject4);
            jSONObject5.put("msgId", str);
            jSONObject5.put("actionType", 21);
            Intent intent = new Intent("com.umeng.message.action");
            intent.setPackage(m15840a.getPackageName());
            intent.setClass(m15840a, UmengMessageHandlerService.class);
            intent.putExtra("um_command", "send");
            intent.putExtra("um_px_path", "umpx_push_logs");
            intent.putExtra("send_message", jSONObject5.toString());
            AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
        }
        UPLog.m15198i("Track", "sendMfrMsgClick:", jSONObject);
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: c */
    public final void mo15290c(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) {
        Application m15840a = C3706y.m15840a();
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
        JSONObject m15762a = C3680g.m15762a(jSONObject, "https://msg.umengcloud.com/v3/alias/delete", UMUtils.getAppkey(m15840a));
        if (m15762a != null && TextUtils.equals(m15762a.getString(AbstractC3215b.JSON_SUCCESS), ITagManager.SUCCESS)) {
            try {
                messageSharedPrefs.f15769a.getContentResolver().delete(C3682h.m15767a(messageSharedPrefs.f15769a), "type=? and alias=?", new String[]{str2, str});
            } catch (Exception e10) {
                UPLog.m15196e("Prefs", e10);
            }
            messageSharedPrefs.m15159a("alias_del_", m15762a.optLong(C3325bt.f14236ba));
            uPushAliasCallback.onMessage(true, "alias:" + str + ", type:" + str2 + " delete success.");
            return;
        }
        uPushAliasCallback.onMessage(true, "alias:" + str + ", type:" + str2 + " delete failed.");
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: b */
    public final void mo15289b(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) {
        Application m15840a = C3706y.m15840a();
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
        String optString = jSONObject.optString(ITagManager.FAIL, "");
        String optString2 = jSONObject.optString(AbstractC3215b.JSON_SUCCESS, "");
        if (!TextUtils.isEmpty(optString)) {
            uPushAliasCallback.onMessage(false, "alias:" + str + " add failed.");
            return;
        }
        if (!TextUtils.isEmpty(optString2)) {
            uPushAliasCallback.onMessage(true, "alias:" + str + " already exist.");
            return;
        }
        JSONObject m15762a = C3680g.m15762a(jSONObject, "https://msg.umengcloud.com/v3/alias/set", UMUtils.getAppkey(m15840a));
        if (m15762a != null && TextUtils.equals(m15762a.optString(AbstractC3215b.JSON_SUCCESS, ""), ITagManager.SUCCESS)) {
            messageSharedPrefs.m15160a(str, str2, 1, m15762a.optLong("ttl", 3600L));
            messageSharedPrefs.m15159a("alias_set_", m15762a.optLong(C3325bt.f14236ba));
            uPushAliasCallback.onMessage(true, "alias:" + str + " add success.");
            return;
        }
        uPushAliasCallback.onMessage(false, "alias:" + str + " add failed.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        r8 = r8.getNotificationChannels();
     */
    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo15286a(java.lang.String r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3555aa.mo15286a(java.lang.String, java.lang.String, int):void");
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    public final void mo15284a(String str, int i10) {
        Application m15840a = C3706y.m15840a();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("ts", System.currentTimeMillis());
        jSONObject3.put("pa", "");
        jSONObject3.put("msg_id", str);
        jSONObject3.put("action_type", i10);
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONArray);
        jSONObject.put("content", jSONObject4);
        if (C3678f.m15753b(m15840a)) {
            jSONObject2.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
            jSONObject2.put("din", C3637d.m15602c(m15840a));
            jSONObject2.put("push_switch", C3637d.m15624p(m15840a));
            UMWorkDispatch.sendEvent(m15840a, 16385, C3704w.m15832a(), jSONObject.toString());
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("jsonHeader", jSONObject2);
            jSONObject5.put("jsonBody", jSONObject4);
            jSONObject5.put("msgId", str);
            jSONObject5.put("actionType", i10);
            Intent intent = new Intent("com.umeng.message.action");
            intent.setPackage(m15840a.getPackageName());
            intent.setClass(m15840a, UmengMessageHandlerService.class);
            intent.putExtra("um_command", "send");
            intent.putExtra("um_px_path", "umpx_push_logs");
            intent.putExtra("send_message", jSONObject5.toString());
            AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
        }
        UPLog.m15198i("Track", "sendMsgLog:", jSONObject);
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    public final void mo15282a() {
        Application m15840a = C3706y.m15840a();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONArray);
        jSONObject.put("content", jSONObject4);
        if (C3678f.m15753b(m15840a)) {
            jSONObject2.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
            jSONObject2.put("din", C3637d.m15602c(m15840a));
            jSONObject2.put("push_switch", C3637d.m15624p(m15840a));
            UMWorkDispatch.sendEvent(m15840a, 16386, C3704w.m15832a(), jSONObject.toString());
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("jsonHeader", jSONObject2);
            jSONObject5.put("jsonBody", jSONObject4);
            Intent intent = new Intent("com.umeng.message.action");
            intent.setPackage(m15840a.getPackageName());
            intent.setClass(m15840a, UmengMessageHandlerService.class);
            intent.putExtra("um_command", "send");
            intent.putExtra("um_px_path", "umpx_push_launch");
            intent.putExtra("send_message", jSONObject5.toString());
            AbstractServiceC3699r.enqueueWork(m15840a, UmengMessageHandlerService.class, intent);
        }
        UPLog.m15198i("Track", "sendLaunch:", jSONObject);
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    public final void mo15283a(String str) {
        Application m15840a = C3706y.m15840a();
        if (C3678f.m15753b(m15840a)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("din", C3637d.m15602c(m15840a));
            jSONObject2.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
            jSONObject2.put("push_switch", C3637d.m15624p(m15840a));
            jSONObject.put("header", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
            jSONObject3.put("old_device_token", str);
            try {
                if (C3678f.m15755c(m15840a)) {
                    jSONObject3.put("utdid_gen", 1);
                    String m15756d = C3678f.m15756d(m15840a);
                    if (!TextUtils.isEmpty(m15756d)) {
                        jSONObject3.put("utdid_rst_id", m15756d);
                    }
                    C3678f.m15757e(m15840a);
                }
            } catch (Throwable unused) {
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("push", jSONArray);
            jSONObject.put("content", jSONObject4);
            UMWorkDispatch.sendEvent(m15840a, 16387, C3704w.m15832a(), jSONObject.toString());
            UPLog.m15198i("Track", "sendRegister:", jSONObject);
        }
    }

    @Override // com.umeng.message.proguard.AbstractC3556ab
    /* renamed from: a */
    public final void mo15287a(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) {
        Application m15840a = C3706y.m15840a();
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
        String optString = jSONObject.optString(ITagManager.FAIL, "");
        String optString2 = jSONObject.optString(AbstractC3215b.JSON_SUCCESS, "");
        if (!TextUtils.isEmpty(optString)) {
            uPushAliasCallback.onMessage(false, "alias:" + str + " add failed.");
            return;
        }
        if (!TextUtils.isEmpty(optString2)) {
            uPushAliasCallback.onMessage(true, "alias:" + str + " already exist.");
            return;
        }
        JSONObject m15762a = C3680g.m15762a(jSONObject, "https://msg.umengcloud.com/v3/alias", UMUtils.getAppkey(m15840a));
        if (m15762a != null && TextUtils.equals(m15762a.optString(AbstractC3215b.JSON_SUCCESS, ""), ITagManager.SUCCESS)) {
            messageSharedPrefs.m15160a(str, str2, 0, m15762a.optLong("ttl", 3600L));
            messageSharedPrefs.m15159a("alias_add_", m15762a.optLong(C3325bt.f14236ba));
            uPushAliasCallback.onMessage(true, "alias:" + str + " add success.");
            return;
        }
        uPushAliasCallback.onMessage(false, "alias:" + str + " add failed.");
    }
}
