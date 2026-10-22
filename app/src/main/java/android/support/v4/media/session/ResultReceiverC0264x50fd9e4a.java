package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* loaded from: classes.dex */
class ResultReceiverC0264x50fd9e4a extends ResultReceiver {

    /* renamed from: a */
    private WeakReference f785a;

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i10, Bundle bundle) {
        AbstractC0272b.m941a(this.f785a.get());
    }
}
