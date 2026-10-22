package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0827n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m4254a(RecyclerView.C0779b0 c0779b0, AbstractC0824k abstractC0824k, View view, View view2, RecyclerView.AbstractC0797p abstractC0797p, boolean z10) {
        if (abstractC0797p.getChildCount() != 0 && c0779b0.m3836c() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(abstractC0797p.getPosition(view) - abstractC0797p.getPosition(view2)) + 1;
            }
            return Math.min(abstractC0824k.mo4237n(), abstractC0824k.mo4227d(view2) - abstractC0824k.mo4230g(view));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m4255b(RecyclerView.C0779b0 c0779b0, AbstractC0824k abstractC0824k, View view, View view2, RecyclerView.AbstractC0797p abstractC0797p, boolean z10, boolean z11) {
        int max;
        if (abstractC0797p.getChildCount() == 0 || c0779b0.m3836c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC0797p.getPosition(view), abstractC0797p.getPosition(view2));
        int max2 = Math.max(abstractC0797p.getPosition(view), abstractC0797p.getPosition(view2));
        if (z11) {
            max = Math.max(0, (c0779b0.m3836c() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0824k.mo4227d(view2) - abstractC0824k.mo4230g(view)) / (Math.abs(abstractC0797p.getPosition(view) - abstractC0797p.getPosition(view2)) + 1))) + (abstractC0824k.mo4236m() - abstractC0824k.mo4230g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m4256c(RecyclerView.C0779b0 c0779b0, AbstractC0824k abstractC0824k, View view, View view2, RecyclerView.AbstractC0797p abstractC0797p, boolean z10) {
        if (abstractC0797p.getChildCount() != 0 && c0779b0.m3836c() != 0 && view != null && view2 != null) {
            if (!z10) {
                return c0779b0.m3836c();
            }
            return (int) (((abstractC0824k.mo4227d(view2) - abstractC0824k.mo4230g(view)) / (Math.abs(abstractC0797p.getPosition(view) - abstractC0797p.getPosition(view2)) + 1)) * c0779b0.m3836c());
        }
        return 0;
    }
}
