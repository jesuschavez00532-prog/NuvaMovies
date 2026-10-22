package com.umeng.message.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3558ad;
import com.umeng.message.proguard.C3580az;
import com.umeng.message.proguard.C3581b;
import com.umeng.message.proguard.C3703v;
import com.umeng.message.proguard.C3705x;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UmengNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.component.UmengNotificationReceiver.1
            @Override // java.lang.Runnable
            public final void run() {
                String stringExtra;
                try {
                    Intent intent2 = intent;
                    if (intent2 == null || (stringExtra = intent2.getStringExtra("MSG")) == null) {
                        return;
                    }
                    int intExtra = intent.getIntExtra("ACTION", -1);
                    UPLog.m15198i("NotificationProxy", String.format(Locale.getDefault(), "onReceive[msg=%s, action=%d]", stringExtra, Integer.valueOf(intExtra)));
                    UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                    if (intExtra == 11) {
                        UPLog.m15198i("NotificationProxy", "notification ignored!");
                        if (!TextUtils.isEmpty(uMessage.getMsgId())) {
                            UTrack.getInstance().trackMsgDismissed(uMessage);
                        }
                        uMessage.dismiss = true;
                        UPushMessageHandler notificationClickHandler = C3703v.m15825a().getNotificationClickHandler();
                        if (notificationClickHandler != null) {
                            notificationClickHandler.handleMessage(context, uMessage);
                        }
                    }
                    C3705x m15834a = C3705x.m15834a();
                    C3558ad m15835a = m15834a.m15835a(uMessage.getMsgId());
                    if (m15835a != null) {
                        m15834a.m15838b(m15835a);
                        C3580az.m15370a(m15835a);
                    }
                } catch (Throwable th) {
                    UPLog.m15196e("NotificationProxy", th);
                }
            }
        });
    }
}
