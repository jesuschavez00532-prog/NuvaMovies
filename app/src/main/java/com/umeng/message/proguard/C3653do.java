package com.umeng.message.proguard;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.do */
/* loaded from: classes3.dex */
public final class C3653do {

    /* renamed from: a */
    C3673eg f16385a;

    /* renamed from: b */
    a f16386b;

    /* renamed from: c */
    C3654dp f16387c;

    /* renamed from: com.umeng.message.proguard.do$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo15669a();

        /* renamed from: a */
        void mo15670a(View view);
    }

    /* renamed from: a */
    public final boolean m15673a() {
        return this.f16385a != null;
    }

    /* renamed from: b */
    public final void m15674b() {
        ViewGroup viewGroup;
        C3608bz.m15464a().m15473b(this.f16387c);
        C3673eg c3673eg = this.f16385a;
        if (c3673eg != null && (viewGroup = (ViewGroup) c3673eg.getParent()) != null) {
            viewGroup.removeView(this.f16385a);
        }
        this.f16387c = null;
        this.f16385a = null;
        this.f16386b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m15672a(Activity activity) {
        ViewGroup m15671b;
        C3673eg c3673eg = this.f16385a;
        if (c3673eg == null || (m15671b = m15671b(activity)) == null || c3673eg.getParent() == m15671b) {
            return;
        }
        if (c3673eg.getParent() != null) {
            ((ViewGroup) c3673eg.getParent()).removeView(c3673eg);
        }
        if (activity.isFinishing()) {
            C3615ce.m15510b("FloatingIcon", "activity has finished skip.");
            return;
        }
        if (C3670ed.m15730a(activity)) {
            C3615ce.m15510b("FloatingIcon", "activity window not match skipped.");
        } else {
            if (C3658dt.m15682a().m15687a((Class<? extends Activity>) activity.getClass())) {
                return;
            }
            m15671b.addView(c3673eg);
            C3615ce.m15510b("FloatingIcon", "onShow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ViewGroup m15671b(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return (ViewGroup) window.getDecorView().findViewById(R.id.content);
        } catch (Throwable unused) {
            return null;
        }
    }
}
