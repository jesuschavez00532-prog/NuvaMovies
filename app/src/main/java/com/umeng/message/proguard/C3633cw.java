package com.umeng.message.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.umeng.message.proguard.cw */
/* loaded from: classes3.dex */
public final class C3633cw extends BroadcastReceiver {

    /* renamed from: a */
    private final AtomicBoolean f16274a;

    public C3633cw(AtomicBoolean atomicBoolean) {
        this.f16274a = atomicBoolean;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f16274a.set(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f16274a.set(false);
        }
    }
}
