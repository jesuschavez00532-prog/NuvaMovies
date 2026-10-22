package com.module.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;
import ne.AbstractC5868k;

/* renamed from: com.module.view.i */
/* loaded from: classes2.dex */
public final class HandlerC3041i extends Handler {

    /* renamed from: a */
    final /* synthetic */ VodSelectionView f12358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3041i(VodSelectionView vodSelectionView, Looper looper) {
        super(looper);
        this.f12358a = vodSelectionView;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10;
        boolean z10;
        AbstractC5868k.m23674f(message, "msg");
        int i11 = message.what;
        i10 = this.f12358a.f12324a;
        if (i11 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object obj = message.obj;
            AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) obj).setSelected(true);
        }
    }
}
