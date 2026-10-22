package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.p071a.C3114a;

/* loaded from: classes.dex */
public class AgooCommondReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            context.getPackageName();
            String m12733b = C3131a.m12733b();
            intent.setFlags(0);
            intent.setClassName(context, m12733b);
            C3114a.m12664a(context, intent);
        } catch (Throwable unused) {
        }
    }
}
