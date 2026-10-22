package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.di */
/* loaded from: classes3.dex */
public final class C3647di {

    /* renamed from: a */
    WeakReference<C3650dl> f16343a;

    /* renamed from: a */
    public final boolean m15666a(final C3650dl c3650dl, Activity activity) {
        int m15728a;
        try {
            if (activity.isFinishing()) {
                C3615ce.m15512d("Banner", "Activity is finishing or does not have valid window token. Cannot show");
                return false;
            }
            Point m15729a = C3670ed.m15729a((Context) activity);
            int min = Math.min(m15729a.x, m15729a.y);
            int max = Math.max(m15729a.x, m15729a.y);
            int m15728a2 = min - C3670ed.m15728a(32.0f);
            if (c3650dl.f16349a.m15667a()) {
                Bitmap bitmap = c3650dl.f16349a.f16347b;
                m15728a = (bitmap.getHeight() * m15728a2) / bitmap.getWidth();
                int min2 = Math.min(Math.min(max / 5, C3670ed.m15728a(144.0f)), m15728a);
                if (m15728a > min2) {
                    m15728a2 = (m15728a2 * min2) / m15728a;
                    m15728a = min2;
                }
            } else {
                m15728a = C3670ed.m15728a(80.0f);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(m15728a2, m15728a, 1003, 327968, -3);
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            layoutParams.y = Math.min(rect.top, C3670ed.m15728a(56.0f)) + C3670ed.m15728a(4.0f);
            layoutParams.dimAmount = 0.3f;
            layoutParams.gravity = 49;
            layoutParams.windowAnimations = 0;
            WindowManager m15663a = m15663a((Context) activity);
            C3672ef c3672ef = c3650dl.f16351c;
            if (c3672ef.getParent() != null) {
                ((ViewGroup) c3672ef.getParent()).removeView(c3672ef);
            }
            m15663a.addView(c3672ef, layoutParams);
            if (c3650dl.f16349a.f16346a.f16166b.optInt("f_close", 0) == 1) {
                c3650dl.f16351c.setOnTouchListener(new ViewOnTouchListenerC3677ek(c3650dl.f16351c, new View.OnClickListener() { // from class: com.umeng.message.proguard.di.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        View.OnClickListener onClickListener = c3650dl.f16352d;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                }));
            }
            this.f16343a = new WeakReference<>(c3650dl);
            return true;
        } catch (Throwable th) {
            C3615ce.m15512d("Banner", "show failed:", th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m15665a() {
        C3650dl c3650dl;
        WeakReference<C3650dl> weakReference = this.f16343a;
        if (weakReference == null || (c3650dl = weakReference.get()) == null) {
            return false;
        }
        return c3650dl.f16351c.isShown();
    }

    /* renamed from: a */
    public final void m15664a(Activity activity) {
        try {
            WeakReference<C3650dl> weakReference = this.f16343a;
            if (weakReference != null) {
                C3650dl c3650dl = weakReference.get();
                if (c3650dl == null) {
                    return;
                }
                m15663a((Context) activity).removeViewImmediate(c3650dl.f16351c);
                Bitmap bitmap = c3650dl.f16349a.f16347b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Throwable unused) {
        }
        this.f16343a = null;
    }

    /* renamed from: a */
    private static WindowManager m15663a(Context context) {
        return (WindowManager) context.getSystemService("window");
    }
}
