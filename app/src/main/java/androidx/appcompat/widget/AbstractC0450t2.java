package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.t2 */
/* loaded from: classes.dex */
public abstract class AbstractC0450t2 {
    /* renamed from: a */
    public static void m1940a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC0454u2.m1981f(view, charSequence);
        }
    }
}
