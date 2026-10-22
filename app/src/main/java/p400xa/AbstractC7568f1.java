package p400xa;

import androidx.recyclerview.widget.AbstractC0828o;
import androidx.recyclerview.widget.RecyclerView;
import ne.AbstractC5868k;

/* renamed from: xa.f1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7568f1 {
    /* renamed from: a */
    public static final void m28999a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        RecyclerView.AbstractC0794m itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m3905v(0L);
        }
        RecyclerView.AbstractC0794m itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.m3906w(0L);
        }
        RecyclerView.AbstractC0794m itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.m3908y(0L);
        }
        RecyclerView.AbstractC0794m itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.m3909z(0L);
        }
        RecyclerView.AbstractC0794m itemAnimator5 = recyclerView.getItemAnimator();
        AbstractC5868k.m23672d(itemAnimator5, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC0828o) itemAnimator5).m4273U(false);
    }
}
