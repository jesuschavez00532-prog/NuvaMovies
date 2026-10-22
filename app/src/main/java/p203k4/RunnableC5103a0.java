package p203k4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: k4.a0 */
/* loaded from: classes.dex */
final class RunnableC5103a0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f21027a;

    /* renamed from: b */
    final /* synthetic */ String f21028b;

    /* renamed from: c */
    final /* synthetic */ C5105b0 f21029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5103a0(C5105b0 c5105b0, LifecycleCallback lifecycleCallback, String str) {
        this.f21029c = c5105b0;
        this.f21027a = lifecycleCallback;
        this.f21028b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C5105b0 c5105b0 = this.f21029c;
        i10 = c5105b0.f21036p0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f21027a;
            bundle = c5105b0.f21037q0;
            if (bundle != null) {
                bundle3 = c5105b0.f21037q0;
                bundle2 = bundle3.getBundle(this.f21028b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7922f(bundle2);
        }
        i11 = this.f21029c.f21036p0;
        if (i11 >= 2) {
            this.f21027a.mo7926j();
        }
        i12 = this.f21029c.f21036p0;
        if (i12 >= 3) {
            this.f21027a.mo7924h();
        }
        i13 = this.f21029c.f21036p0;
        if (i13 >= 4) {
            this.f21027a.mo7927k();
        }
        i14 = this.f21029c.f21036p0;
        if (i14 >= 5) {
            this.f21027a.m7923g();
        }
    }
}
