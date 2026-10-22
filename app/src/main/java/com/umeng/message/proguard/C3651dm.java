package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.umeng.message.proguard.InterfaceC3606bx;
import java.lang.ref.WeakReference;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.umeng.message.proguard.dm */
/* loaded from: classes3.dex */
public final class C3651dm extends AbstractC3641dc {
    public C3651dm(C3636cz c3636cz) {
        super(c3636cz);
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final C3621ck mo15636b() {
        C3621ck mo15513a = C3619ci.m15514a(this.f16290b).mo15513a(this.f16289a);
        if (mo15513a != null) {
            if (mo15513a.f16168d == 0) {
                return mo15513a;
            }
            throw new C3614cd(mo15513a.f16167c);
        }
        C3615ce.m15510b("Banner", "type:", this.f16290b, " request ad failed.");
        throw new C3614cd("request ad failed.");
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final InterfaceC3606bx.a mo15635b(final C3621ck c3621ck) {
        Bitmap bitmap;
        if (c3621ck.f16165a != this.f16290b) {
            return null;
        }
        final boolean z10 = this.f16289a.f16278c;
        final WeakReference<Activity> weakReference = this.f16292d;
        Context m15638a = C3643de.m15638a();
        int m15521a = c3621ck.m15521a();
        int m15446a = C3601bs.m15446a(m15521a);
        if (m15446a == 0) {
            C3615ce.m15510b("Banner", "type:" + InterfaceC3606bx.c.BANNER + " style:" + m15521a);
            return null;
        }
        if (m15446a != C3601bs.f16093b) {
            bitmap = (m15446a == C3601bs.f16092a || m15446a == C3601bs.f16095d) ? C3613cc.m15502a(m15638a, c3621ck.m15522b()) : null;
            if (bitmap == null) {
                C3615ce.m15510b("Banner", "material download failed. sid:" + c3621ck.m15523c());
                C3628cr.m15569a().mo15564b(c3621ck, 2001);
                throw new C3614cd("material download failed.");
            }
        } else {
            bitmap = null;
        }
        if (m15446a != C3601bs.f16092a && (TextUtils.isEmpty(c3621ck.m15524d()) || TextUtils.isEmpty(c3621ck.m15525e()))) {
            C3615ce.m15510b("Banner", "banner title or content not match.");
            return null;
        }
        final long max = Math.max(c3621ck.f16166b.optLong(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD), 3000L);
        final Bitmap bitmap2 = bitmap;
        return new AbstractC3639da() { // from class: com.umeng.message.proguard.dm.1

            /* renamed from: h */
            private boolean f16361h = false;

            @Override // com.umeng.message.proguard.AbstractC3639da
            /* renamed from: a */
            public final void mo15630a(Activity activity) {
                Activity activity2;
                if (this.f16361h) {
                    C3615ce.m15512d("Banner", "already called show.");
                    C3616cf c3616cf = this.f16287a;
                    if (c3616cf != null) {
                        c3616cf.mo15456a(2010, "already called show.");
                        return;
                    }
                    return;
                }
                try {
                    if (z10) {
                        C3646dh.m15648a(new C3649dk(c3621ck, bitmap2), max, this);
                        return;
                    }
                    if (AbstractC3641dc.this.m15634a(c3621ck)) {
                        try {
                            c3621ck.f16166b.put("exposed_timeout", true);
                        } catch (Exception unused) {
                        }
                        C3628cr.m15569a().mo15564b(c3621ck, 2009);
                        String str = "expose invalid! timeout config:" + c3621ck.m15528h();
                        C3615ce.m15512d("Banner", str);
                        C3616cf c3616cf2 = this.f16287a;
                        if (c3616cf2 != null) {
                            c3616cf2.mo15456a(2010, str);
                        }
                        return;
                    }
                    WeakReference weakReference2 = weakReference;
                    if (weakReference2 != null) {
                        activity2 = (Activity) weakReference2.get();
                    } else {
                        activity2 = null;
                    }
                    if (activity2 != null && !activity2.isFinishing()) {
                        C3646dh.m15647a(activity2, new C3649dk(c3621ck, bitmap2), max, this);
                        return;
                    }
                    C3615ce.m15510b("Banner", "activity has finished skip.");
                    C3628cr.m15569a().mo15564b(c3621ck, 2005);
                } catch (Throwable th) {
                    try {
                        C3615ce.m15509a("Banner", "ad show error:", th.getMessage());
                    } finally {
                        this.f16361h = true;
                    }
                }
            }

            @Override // com.umeng.message.proguard.AbstractC3639da
            /* renamed from: b */
            public final void mo15631b() {
                AbstractC3641dc abstractC3641dc = AbstractC3641dc.this;
                abstractC3641dc.f16291c = null;
                abstractC3641dc.f16292d = null;
                mo15452a((InterfaceC3606bx.d) null);
            }
        };
    }
}
