package com.efs.sdk.base.core.util.concurrent;

import android.os.HandlerThread;

/* renamed from: com.efs.sdk.base.core.util.concurrent.a */
/* loaded from: classes.dex */
public final class C1720a {

    /* renamed from: a */
    public static HandlerThread f7206a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f7206a = handlerThread;
        handlerThread.start();
    }
}
