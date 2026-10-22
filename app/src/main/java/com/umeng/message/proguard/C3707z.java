package com.umeng.message.proguard;

import android.app.Application;
import android.app.Notification;
import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3584bb;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.z */
/* loaded from: classes3.dex */
public final class C3707z extends UTrack {

    /* renamed from: e */
    private static volatile boolean f16648e;

    /* renamed from: c */
    private final AbstractC3556ab f16649c = new C3555aa();

    /* renamed from: d */
    private long f16650d;

    /* renamed from: b */
    private static final C3707z f16647b = new C3707z();

    /* renamed from: a */
    public static boolean f16646a = false;

    private C3707z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m15849b(String str, String str2, String str3) {
        if (MessageService.MSG_ACCS_NOTIFY_CLICK.equals(str3)) {
            TaobaoRegister.clickMessage(C3706y.m15840a(), str, str2);
        } else {
            TaobaoRegister.dismissMessage(C3706y.m15840a(), str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sendMsgLogForAgoo msgId:");
        sb2.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(" taskId:");
            sb2.append(str2);
        }
        sb2.append(" status:");
        sb2.append(str3);
        UPLog.m15198i("Track", sb2);
    }

    /* renamed from: c */
    public static boolean m15850c() {
        if (C3678f.m15752b()) {
            UPLog.m15198i("Track", "track failed, silent mode!");
            return true;
        }
        Application m15840a = C3706y.m15840a();
        if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(m15840a).m15179l())) {
            return true;
        }
        return TextUtils.isEmpty(C3637d.m15623o(m15840a));
    }

    /* renamed from: d */
    static /* synthetic */ boolean m15851d() {
        f16648e = false;
        return false;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m15852e() {
        f16646a = false;
        return false;
    }

    /* renamed from: f */
    static /* synthetic */ JSONObject m15853f() {
        String m15179l = MessageSharedPrefs.getInstance(C3706y.m15840a()).m15179l();
        String m15623o = C3637d.m15623o(C3706y.m15840a());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", C3665e.m15718a());
        jSONObject.put("utdid", m15623o);
        jSONObject.put("device_token", m15179l);
        return jSONObject;
    }

    @Override // com.umeng.message.UTrack
    public final void addAlias(final String str, final String str2, final UPushAliasCallback uPushAliasCallback) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.z.4
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                try {
                } catch (Exception e10) {
                    UPLog.m15196e("Track", e10);
                }
                if (messageSharedPrefs.m15164a("alias_add_")) {
                    String m15848b = C3707z.m15848b(str, str2);
                    if (m15848b != null && m15848b.length() > 0) {
                        uPushAliasCallback.onMessage(false, m15848b);
                        return;
                    }
                    String m15623o = C3637d.m15623o(C3706y.m15840a());
                    String m15179l = messageSharedPrefs.m15179l();
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = "";
                    sb2.append("");
                    sb2.append("utdid:");
                    sb2.append(m15623o);
                    sb2.append(", deviceToken:");
                    sb2.append(m15179l);
                    sb2.append(";");
                    String sb3 = sb2.toString();
                    boolean z11 = true;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        z10 = true;
                    } else {
                        UPLog.m15197e("Track", "addAlias: type or alias empty.");
                        sb3 = sb3 + "addAlias: empty type or alias. ";
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(m15623o)) {
                        UPLog.m15197e("Track", "utdid empty. ");
                        sb3 = sb3 + "utdid empty;";
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(m15179l)) {
                        UPLog.m15197e("Track", "deviceToken empty.");
                        sb3 = sb3 + "deviceToken empty;";
                        z10 = false;
                    }
                    if (messageSharedPrefs.m15163a(0, str, str2)) {
                        String format = String.format("addAlias: <%s, %s> has been synced to the server before. Ignore this request.", str, str2);
                        UPLog.m15198i("Track", format);
                        str3 = "" + format;
                        z10 = false;
                    } else {
                        z11 = false;
                    }
                    try {
                        JSONObject m15853f = C3707z.m15853f();
                        if (z10) {
                            m15853f.put("alias", str);
                            m15853f.put("type", str2);
                            m15853f.put("last_alias", messageSharedPrefs.m15156a(0, str2));
                            m15853f.put("ts", System.currentTimeMillis());
                        } else if (z11) {
                            m15853f.put(AbstractC3215b.JSON_SUCCESS, str3);
                        } else {
                            m15853f.put(ITagManager.FAIL, sb3);
                        }
                        C3707z.this.f16649c.mo15287a(str, str2, m15853f, uPushAliasCallback);
                        return;
                    } catch (Throwable th) {
                        UPLog.m15196e("Track", th);
                        if (th.getMessage() != null) {
                            UPushAliasCallback uPushAliasCallback2 = uPushAliasCallback;
                            if (uPushAliasCallback2 != null) {
                                uPushAliasCallback2.onMessage(false, "alias:" + str + " add failed:" + th.getMessage());
                                return;
                            }
                            return;
                        }
                        UPushAliasCallback uPushAliasCallback3 = uPushAliasCallback;
                        if (uPushAliasCallback3 != null) {
                            uPushAliasCallback3.onMessage(false, "alias:" + str + " add failed");
                            return;
                        }
                        return;
                    }
                }
                uPushAliasCallback.onMessage(false, "interval limit.");
            }
        });
    }

    @Override // com.umeng.message.UTrack
    public final void deleteAlias(final String str, final String str2, final UPushAliasCallback uPushAliasCallback) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.z.6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                try {
                } catch (Throwable th) {
                    UPLog.m15196e("Track", th);
                }
                if (messageSharedPrefs.m15164a("alias_del_")) {
                    String m15848b = C3707z.m15848b(str, str2);
                    if (m15848b != null && m15848b.length() > 0) {
                        uPushAliasCallback.onMessage(false, m15848b);
                        return;
                    }
                    String str3 = "";
                    if (TextUtils.isEmpty(str2)) {
                        UPLog.m15197e("Track", "removeAlias: type empty.");
                        str3 = "removeAlias: type empty. ";
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (TextUtils.isEmpty(C3637d.m15623o(C3706y.m15840a()))) {
                        UPLog.m15197e("Track", "removeAlias: utdid empty.");
                        str3 = str3 + "utdid empty. ";
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(messageSharedPrefs.m15179l())) {
                        UPLog.m15197e("Track", "removeAlias: deviceToken empty.");
                        str3 = str3 + "deviceToken empty.";
                        z10 = false;
                    }
                    try {
                        JSONObject m15853f = C3707z.m15853f();
                        if (z10) {
                            m15853f.put("alias", str);
                            m15853f.put("type", str2);
                            m15853f.put("ts", System.currentTimeMillis());
                        } else {
                            m15853f.put(ITagManager.FAIL, str3);
                        }
                        C3707z.this.f16649c.mo15290c(str, str2, m15853f, uPushAliasCallback);
                        return;
                    } catch (Throwable th2) {
                        UPLog.m15196e("Track", th2);
                        if (th2.getMessage() != null) {
                            uPushAliasCallback.onMessage(false, "alias:" + str + "remove failed:" + th2.getMessage());
                            return;
                        }
                        uPushAliasCallback.onMessage(false, "alias:" + str + "remove failed.");
                        return;
                    }
                }
                uPushAliasCallback.onMessage(false, "interval limit.");
            }
        });
    }

    @Override // com.umeng.message.UTrack
    public final void setAlias(final String str, final String str2, final UPushAliasCallback uPushAliasCallback) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.z.5
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                boolean z10;
                boolean z11;
                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                try {
                } catch (Throwable th) {
                    UPLog.m15196e("Track", th);
                }
                if (messageSharedPrefs.m15164a("alias_set_")) {
                    String m15848b = C3707z.m15848b(str, str2);
                    if (m15848b != null && m15848b.length() > 0) {
                        uPushAliasCallback.onMessage(false, m15848b);
                        return;
                    }
                    String str4 = "";
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = "";
                        z10 = true;
                    } else {
                        UPLog.m15197e("Track", "addExclusiveAlias: type empty.");
                        str3 = "addExclusiveAlias: type empty. ";
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(C3637d.m15623o(C3706y.m15840a()))) {
                        UPLog.m15197e("Track", "addExclusiveAlias: utdid empty.");
                        str3 = str3 + "utdid empty. ";
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(messageSharedPrefs.m15179l())) {
                        UPLog.m15197e("Track", "addExclusiveAlias: deviceToken empty.");
                        str3 = str3 + "deviceToken empty.";
                        z10 = false;
                    }
                    if (messageSharedPrefs.m15163a(1, str, str2)) {
                        String format = String.format("addExclusiveAlias: <%s, %s> has been synced to the server before. Ignore this request.", str, str2);
                        UPLog.m15198i("Track", format);
                        str4 = "" + format;
                        z10 = false;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    try {
                        JSONObject m15853f = C3707z.m15853f();
                        if (z10) {
                            m15853f.put("alias", str);
                            m15853f.put("type", str2);
                            m15853f.put("last_alias", messageSharedPrefs.m15156a(1, str2));
                            m15853f.put("ts", System.currentTimeMillis());
                        } else if (z11) {
                            m15853f.put(AbstractC3215b.JSON_SUCCESS, str4);
                        } else {
                            m15853f.put(ITagManager.FAIL, str3);
                        }
                        C3707z.this.f16649c.mo15289b(str, str2, m15853f, uPushAliasCallback);
                        return;
                    } catch (Throwable th2) {
                        UPLog.m15196e("Track", th2);
                        if (th2.getMessage() != null) {
                            uPushAliasCallback.onMessage(false, "alias:" + str + "add failed:" + th2.getMessage());
                            return;
                        }
                        uPushAliasCallback.onMessage(false, "alias:" + str + "add failed.");
                        return;
                    }
                }
                uPushAliasCallback.onMessage(false, "interval limit.");
            }
        });
    }

    @Override // com.umeng.message.UTrack
    public final void trackInAppNotifyClick(UMessage uMessage) {
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            m15854a(uMessage.getMsgId(), 11);
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackInAppNotifyShow(UMessage uMessage) {
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            m15854a(uMessage.getMsgId(), 10);
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackMfrPushMsgClick(UMessage uMessage, int i10) {
        try {
            if (!m15850c() && uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
                this.f16649c.mo15288b(uMessage.getMsgId(), i10);
            }
        } catch (Throwable th) {
            UPLog.m15196e("Track", th);
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackMsgArrival(UMessage uMessage) {
        if (uMessage == null) {
            return;
        }
        m15854a(uMessage.getMsgId(), 0);
    }

    @Override // com.umeng.message.UTrack
    public final void trackMsgClick(UMessage uMessage) {
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            m15854a(uMessage.getMsgId(), 1);
        }
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getAgooMsgId())) {
            m15846a(uMessage.getAgooMsgId(), uMessage.getTaskId(), MessageService.MSG_ACCS_NOTIFY_CLICK);
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackMsgDismissed(UMessage uMessage) {
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            m15854a(uMessage.getMsgId(), 2);
        }
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getAgooMsgId())) {
            m15846a(uMessage.getAgooMsgId(), uMessage.getTaskId(), MessageService.MSG_ACCS_NOTIFY_DISMISS);
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackMsgRepost(UMessage uMessage, Notification notification) {
        String str;
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            C3558ad m15835a = C3705x.m15834a().m15835a(uMessage.getMsgId());
            if (m15835a == null) {
                UPLog.m15198i("Track", "sendMsgRepost item null, msgId:", uMessage.getMsgId());
                return;
            }
            int i10 = m15835a.f15882d;
            try {
                if (Build.VERSION.SDK_INT >= 26 && notification != null) {
                    str = notification.getChannelId();
                } else {
                    str = null;
                }
                this.f16649c.mo15286a(uMessage.getMsgId(), str, i10);
            } catch (Throwable th) {
                UPLog.m15196e("Track", th);
            }
        }
    }

    @Override // com.umeng.message.UTrack
    public final void trackMsgShow(UMessage uMessage, Notification notification) {
        int i10;
        String str;
        if (uMessage != null && !TextUtils.isEmpty(uMessage.getMsgId())) {
            if (TextUtils.equals(uMessage.getDisplayType(), UMessage.DISPLAY_TYPE_NOTIFICATION)) {
                i10 = 6;
            } else if (TextUtils.equals(uMessage.getDisplayType(), "custom")) {
                i10 = 7;
            } else {
                return;
            }
            try {
                if (Build.VERSION.SDK_INT >= 26 && notification != null) {
                    str = notification.getChannelId();
                } else {
                    str = null;
                }
                this.f16649c.mo15285a(uMessage.getMsgId(), i10, str);
            } catch (Throwable th) {
                UPLog.m15200w("Track", "trackMsgShow error:", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static C3707z m15843a() {
        return f16647b;
    }

    /* renamed from: a */
    public final void m15854a(String str, int i10) {
        if (m15850c()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            UPLog.m15197e("Track", "trackMsgLog skipped, msgId empty!");
            return;
        }
        try {
            this.f16649c.mo15284a(str, i10);
        } catch (Throwable th) {
            UPLog.m15196e("Track", th);
        }
    }

    /* renamed from: a */
    private void m15846a(final String str, final String str2, final String str3) {
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.z.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C3707z.this.m15849b(str, str2, str3);
                } catch (Throwable th) {
                    UPLog.m15196e("Track", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m15855b() {
        ArrayList arrayList;
        if (m15850c()) {
            return;
        }
        try {
            Application m15840a = C3706y.m15840a();
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f16650d) >= 30000) {
                this.f16650d = currentTimeMillis;
                if (C3678f.m15753b(m15840a)) {
                    C3584bb m15383a = C3584bb.m15383a(m15840a);
                    Cursor query = m15383a.f16050a.getContentResolver().query(C3682h.m15770d(m15383a.f16050a), null, null, null, "Time Asc ");
                    if (query == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
                            arrayList2.add(new C3584bb.a(query));
                        }
                        query.close();
                        arrayList = arrayList2;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            C3584bb.a aVar = (C3584bb.a) arrayList.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ts", aVar.f16052b);
                            jSONObject.put("pa", "");
                            jSONObject.put("device_token", MessageSharedPrefs.getInstance(m15840a).m15179l());
                            jSONObject.put("msg_id", aVar.f16051a);
                            jSONObject.put("action_type", aVar.f16053c);
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject2.put("header", jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("push", jSONArray);
                        jSONObject2.put("content", jSONObject4);
                        jSONObject3.put(C3325bt.f14200aR, MsgConstant.SDK_VERSION);
                        jSONObject3.put("din", C3637d.m15602c(m15840a));
                        jSONObject3.put("push_switch", C3637d.m15624p(m15840a));
                        UMWorkDispatch.sendEvent(C3706y.m15840a(), 16389, C3704w.m15832a(), jSONObject2.toString());
                    }
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e("Track", th);
        }
        if (f16648e) {
            return;
        }
        f16648e = true;
        C3581b.m15376b(new Runnable() { // from class: com.umeng.message.proguard.z.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                try {
                    Application m15840a2 = C3706y.m15840a();
                    MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a2);
                    boolean z11 = false;
                    if (messageSharedPrefs.f15770b.m15399b("launch_send_policy", -1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        UPLog.m15198i("Track", "launch policy 1, skipped.");
                        return;
                    }
                    String m15401b = messageSharedPrefs.f15770b.m15401b("last_app_ver", "");
                    String appVersionName = UMUtils.getAppVersionName(m15840a2);
                    if (!TextUtils.equals(m15401b, appVersionName)) {
                        z11 = true;
                    }
                    String m15401b2 = messageSharedPrefs.f15770b.m15401b("last_ntf_switch", "");
                    String m15624p = C3637d.m15624p(m15840a2);
                    boolean z12 = !TextUtils.equals(m15401b2, m15624p);
                    if (!z11 && !z12 && messageSharedPrefs.m15162a()) {
                        return;
                    }
                    C3707z.this.f16649c.mo15282a();
                    if (z11) {
                        messageSharedPrefs.f15770b.m15396a("last_app_ver", appVersionName);
                    }
                    if (z12) {
                        messageSharedPrefs.f15770b.m15396a("last_ntf_switch", m15624p);
                    }
                    if (C3678f.m15753b(C3706y.m15840a())) {
                        C3581b.m15376b(this, 1L, TimeUnit.DAYS);
                    }
                } catch (Exception e10) {
                    UPLog.m15196e("Track", e10);
                } finally {
                    C3707z.m15851d();
                }
            }
        }, 10L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15847a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Application m15840a = C3706y.m15840a();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    arrayList.add(ContentProviderOperation.newDelete(C3682h.m15770d(m15840a)).withSelection("MsgId=? And ActionType=?", new String[]{jSONObject.optString("msg_id"), String.valueOf(jSONObject.optInt("action_type"))}).build());
                }
            }
            m15840a.getContentResolver().applyBatch(C3682h.m15772f(m15840a), arrayList);
        } catch (Throwable th) {
            UPLog.m15196e("Track", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m15848b(String str, String str2) {
        if (C3678f.m15752b()) {
            UPLog.m15198i("Track", "checkAlias failed, silent mode!");
            return "checkAlias failed, silent mode!";
        }
        try {
            byte[] bytes = str.getBytes(Request.DEFAULT_CHARSET);
            byte[] bytes2 = str2.getBytes(Request.DEFAULT_CHARSET);
            boolean z10 = bytes.length <= 128;
            boolean z11 = bytes2.length <= 64;
            if (z10 && z11) {
                return null;
            }
            return "alias length must be <= 128 and aliasType length must be <= 64";
        } catch (Throwable th) {
            UPLog.m15196e("Track", th);
            return null;
        }
    }
}
