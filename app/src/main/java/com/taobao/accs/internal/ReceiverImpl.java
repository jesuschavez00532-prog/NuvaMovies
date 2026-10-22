package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.base.IBaseReceiver;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.p071a.C3114a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.UtilityImpl;

/* loaded from: classes.dex */
public class ReceiverImpl implements IBaseReceiver {
    @Override // com.taobao.accs.base.IBaseReceiver
    public void onReceive(Context context, Intent intent) {
        ALog.m12938d("ReceiverImpl", "ReceiverImpl onReceive begin......", new Object[0]);
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            intent = new Intent();
        }
        try {
            if (UtilityImpl.m12977e(context)) {
                intent.setClassName(context.getPackageName(), C3197j.channelService);
                C3114a.m12664a(context.getApplicationContext(), intent);
            }
            if (UtilityImpl.m12979f(context)) {
                context.getPackageName();
                intent.setClassName(context, C3131a.m12733b());
                C3114a.m12664a(context.getApplicationContext(), intent);
            }
        } catch (Throwable th) {
            ALog.m12940e("ReceiverImpl", "ReceiverImpl onReceive,exception,e=" + th.getMessage(), new Object[0]);
        }
    }
}
