package com.module.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.module.R$id;
import ne.AbstractC5868k;
import p102db.C4053l;

/* renamed from: com.module.view.b */
/* loaded from: classes2.dex */
public final class HandlerC3034b extends Handler {

    /* renamed from: a */
    final /* synthetic */ MFInfoBar f12351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3034b(Looper looper, MFInfoBar mFInfoBar) {
        super(looper);
        this.f12351a = mFInfoBar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10;
        AbstractC5868k.m23674f(message, "msg");
        int i11 = message.what;
        i10 = this.f12351a.f12212b;
        if (i11 == i10) {
            MFInfoBar.m12127E(this.f12351a);
            if (!C4053l.f17879P0.m17070a()) {
                ((ThumbnailSeekBar) this.f12351a.m12208z(R$id.mSeekBar)).m12290e();
                this.f12351a.m12196U();
                this.f12351a.setSettingVisibility(false);
            }
        }
    }
}
