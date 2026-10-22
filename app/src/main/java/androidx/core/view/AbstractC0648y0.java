package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import androidx.core.R$id;

/* renamed from: androidx.core.view.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC0648y0 {
    /* renamed from: a */
    public static boolean m2839a(ViewGroup viewGroup) {
        boolean isTransitionGroup;
        if (Build.VERSION.SDK_INT >= 21) {
            isTransitionGroup = viewGroup.isTransitionGroup();
            return isTransitionGroup;
        }
        Boolean bool = (Boolean) viewGroup.getTag(R$id.tag_transition_group);
        if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && AbstractC0616q0.m2592J(viewGroup) == null) {
            return false;
        }
        return true;
    }
}
