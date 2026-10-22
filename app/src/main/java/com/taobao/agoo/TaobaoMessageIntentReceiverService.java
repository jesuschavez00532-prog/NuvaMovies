package com.taobao.agoo;

import android.content.Context;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.utl.ALog;
import org.android.agoo.message.MessageReceiverService;

/* loaded from: classes.dex */
public class TaobaoMessageIntentReceiverService extends MessageReceiverService {
    @Override // org.android.agoo.message.MessageReceiverService
    public String getIntentServiceClassName(Context context) {
        ALog.m12944w("Taobao", "getPackage Name=" + context.getPackageName(), new Object[0]);
        context.getPackageName();
        return C3131a.m12733b();
    }
}
