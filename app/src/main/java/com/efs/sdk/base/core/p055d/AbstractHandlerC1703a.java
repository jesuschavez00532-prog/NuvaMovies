package com.efs.sdk.base.core.p055d;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.lzy.okgo.OkGo;

/* renamed from: com.efs.sdk.base.core.d.a */
/* loaded from: classes.dex */
public abstract class AbstractHandlerC1703a extends Handler {

    /* renamed from: a */
    public ControllerCenter f7144a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractHandlerC1703a() {
        super(C1720a.f7206a.getLooper());
        sendEmptyMessageDelayed(0, OkGo.DEFAULT_MILLISECONDS);
    }

    /* renamed from: a */
    abstract void mo7709a();

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        mo7709a();
        sendEmptyMessageDelayed(0, OkGo.DEFAULT_MILLISECONDS);
    }
}
