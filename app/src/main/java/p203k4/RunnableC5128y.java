package p203k4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: k4.y */
/* loaded from: classes.dex */
final class RunnableC5128y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f21058a;

    /* renamed from: b */
    final /* synthetic */ String f21059b;

    /* renamed from: c */
    final /* synthetic */ FragmentC5129z f21060c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5128y(FragmentC5129z fragmentC5129z, LifecycleCallback lifecycleCallback, String str) {
        this.f21060c = fragmentC5129z;
        this.f21058a = lifecycleCallback;
        this.f21059b = str;
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
        FragmentC5129z fragmentC5129z = this.f21060c;
        i10 = fragmentC5129z.f21063b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f21058a;
            bundle = fragmentC5129z.f21064c;
            if (bundle != null) {
                bundle3 = fragmentC5129z.f21064c;
                bundle2 = bundle3.getBundle(this.f21059b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7922f(bundle2);
        }
        i11 = this.f21060c.f21063b;
        if (i11 >= 2) {
            this.f21058a.mo7926j();
        }
        i12 = this.f21060c.f21063b;
        if (i12 >= 3) {
            this.f21058a.mo7924h();
        }
        i13 = this.f21060c.f21063b;
        if (i13 >= 4) {
            this.f21058a.mo7927k();
        }
        i14 = this.f21060c.f21063b;
        if (i14 >= 5) {
            this.f21058a.m7923g();
        }
    }
}
