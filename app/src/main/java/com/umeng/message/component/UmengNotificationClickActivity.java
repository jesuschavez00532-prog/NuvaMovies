package com.umeng.message.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3558ad;
import com.umeng.message.proguard.C3580az;
import com.umeng.message.proguard.C3703v;
import com.umeng.message.proguard.C3705x;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UmengNotificationClickActivity extends Activity {
    /* renamed from: a */
    private void m15205a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("MSG");
            if (stringExtra != null && stringExtra.length() != 0) {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                UTrack.getInstance().trackMsgClick(uMessage);
                Context applicationContext = getApplicationContext();
                UPLog.m15198i("NotificationClick", uMessage.getRaw());
                UPushMessageHandler notificationClickHandler = C3703v.m15825a().getNotificationClickHandler();
                if (notificationClickHandler != null) {
                    notificationClickHandler.handleMessage(applicationContext, uMessage);
                } else {
                    UPLog.m15198i("NotificationClick", "handle == null skipped!");
                }
                C3705x m15834a = C3705x.m15834a();
                C3558ad m15835a = m15834a.m15835a(uMessage.getMsgId());
                if (m15835a != null) {
                    m15834a.m15838b(m15835a);
                    C3580az.m15370a(m15835a);
                }
            }
        } catch (Throwable th) {
            try {
                UPLog.m15196e("NotificationClick", th);
            } finally {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = 1;
            attributes.height = 1;
            attributes.gravity = 8388659;
            window.setAttributes(attributes);
            m15205a(getIntent());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            m15205a(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
