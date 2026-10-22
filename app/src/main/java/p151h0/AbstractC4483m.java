package p151h0;

import android.support.v4.media.session.AbstractC0272b;
import android.view.ViewGroup;
import androidx.transition.R$id;

/* renamed from: h0.m */
/* loaded from: classes.dex */
public abstract class AbstractC4483m {
    /* renamed from: a */
    public static AbstractC4483m m18730a(ViewGroup viewGroup) {
        AbstractC0272b.m941a(viewGroup.getTag(R$id.transition_current_scene));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18731b(ViewGroup viewGroup, AbstractC4483m abstractC4483m) {
        viewGroup.setTag(R$id.transition_current_scene, abstractC4483m);
    }
}
