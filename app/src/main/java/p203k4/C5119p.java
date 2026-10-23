package p203k4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: k4.p */
/* loaded from: classes.dex */
public final class C5119p extends BroadcastReceiver {

    /* renamed from: a */
    Context f21042a;

    /* renamed from: b */
    private final AbstractC5118o f21043b;

    public C5119p(AbstractC5118o abstractC5118o) {
        this.f21043b = abstractC5118o;
    }

    /* renamed from: a */
    public final void m20754a(Context context) {
        this.f21042a = context;
    }

    /* renamed from: b */
    public final synchronized void m20755b() {
        Context context = this.f21042a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f21042a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = null;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f21043b.mo8049a();
            m20755b();
        }
    }
}
