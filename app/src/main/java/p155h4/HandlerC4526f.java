package p155h4;

import android.os.Looper;
import android.os.Message;
import p378w4.HandlerC7366f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h4.f */
/* loaded from: classes.dex */
public final class HandlerC4526f extends HandlerC7366f {

    /* renamed from: a */
    final /* synthetic */ C4522d f19558a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4526f(C4522d c4522d, Looper looper) {
        super(looper);
        this.f19558a = c4522d;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C4522d.m18912d(this.f19558a, message);
    }
}
