package com.umeng.message.proguard;

import android.app.Activity;
import android.view.ViewGroup;
import com.umeng.message.proguard.C3608bz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.dp */
/* loaded from: classes3.dex */
public final class C3654dp extends C3608bz.b {

    /* renamed from: a */
    final C3653do f16390a;

    public C3654dp(C3653do c3653do) {
        this.f16390a = c3653do;
    }

    @Override // com.umeng.message.proguard.C3608bz.b
    /* renamed from: a */
    public final String mo15478a() {
        return "fi";
    }

    @Override // com.umeng.message.proguard.C3608bz.b
    /* renamed from: b */
    public final void mo15480b(Activity activity) {
        C3673eg c3673eg;
        ViewGroup m15671b;
        try {
            if (this.f16390a.m15673a() && (c3673eg = this.f16390a.f16385a) != null && (m15671b = C3653do.m15671b(activity)) != null && c3673eg.getParent() == m15671b) {
                ((ViewGroup) c3673eg.getParent()).removeView(c3673eg);
                C3615ce.m15510b("FloatingIcon", "onHidden");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.message.proguard.C3608bz.b
    /* renamed from: a */
    public final void mo15479a(final Activity activity) {
        try {
            if (!this.f16390a.m15673a() || (activity instanceof InterfaceC3634cx)) {
                return;
            }
            activity.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dp.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C3654dp.this.f16390a.m15672a(activity);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
