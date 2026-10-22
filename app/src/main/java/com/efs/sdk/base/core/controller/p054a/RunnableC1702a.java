package com.efs.sdk.base.core.controller.p054a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;

/* renamed from: com.efs.sdk.base.core.controller.a.a */
/* loaded from: classes.dex */
public final class RunnableC1702a extends BroadcastReceiver implements Runnable {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WorkThreadUtil.submit(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GlobalInfoManager.getInstance().refreshNetStatus();
    }
}
