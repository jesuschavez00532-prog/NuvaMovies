package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public abstract class AbstractC0828o extends RecyclerView.AbstractC0794m {

    /* renamed from: g */
    boolean f3485g = true;

    /* renamed from: A */
    public abstract boolean mo4159A(RecyclerView.AbstractC0787f0 abstractC0787f0);

    /* renamed from: B */
    public abstract boolean mo4160B(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0787f0 abstractC0787f02, int i10, int i11, int i12, int i13);

    /* renamed from: C */
    public abstract boolean mo4161C(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11, int i12, int i13);

    /* renamed from: D */
    public abstract boolean mo4162D(RecyclerView.AbstractC0787f0 abstractC0787f0);

    /* renamed from: E */
    public final void m4257E(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4265M(abstractC0787f0);
        m3891h(abstractC0787f0);
    }

    /* renamed from: F */
    public final void m4258F(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4266N(abstractC0787f0);
    }

    /* renamed from: G */
    public final void m4259G(RecyclerView.AbstractC0787f0 abstractC0787f0, boolean z10) {
        m4267O(abstractC0787f0, z10);
        m3891h(abstractC0787f0);
    }

    /* renamed from: H */
    public final void m4260H(RecyclerView.AbstractC0787f0 abstractC0787f0, boolean z10) {
        m4268P(abstractC0787f0, z10);
    }

    /* renamed from: I */
    public final void m4261I(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4269Q(abstractC0787f0);
        m3891h(abstractC0787f0);
    }

    /* renamed from: J */
    public final void m4262J(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4270R(abstractC0787f0);
    }

    /* renamed from: K */
    public final void m4263K(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4271S(abstractC0787f0);
        m3891h(abstractC0787f0);
    }

    /* renamed from: L */
    public final void m4264L(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        m4272T(abstractC0787f0);
    }

    /* renamed from: M */
    public void m4265M(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: N */
    public void m4266N(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: O */
    public void m4267O(RecyclerView.AbstractC0787f0 abstractC0787f0, boolean z10) {
    }

    /* renamed from: P */
    public void m4268P(RecyclerView.AbstractC0787f0 abstractC0787f0, boolean z10) {
    }

    /* renamed from: Q */
    public void m4269Q(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: R */
    public void m4270R(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: S */
    public void m4271S(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: T */
    public void m4272T(RecyclerView.AbstractC0787f0 abstractC0787f0) {
    }

    /* renamed from: U */
    public void m4273U(boolean z10) {
        this.f3485g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: a */
    public boolean mo3885a(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2) {
        int i10;
        int i11;
        if (bVar != null && ((i10 = bVar.f3254a) != (i11 = bVar2.f3254a) || bVar.f3255b != bVar2.f3255b)) {
            return mo4161C(abstractC0787f0, i10, bVar.f3255b, i11, bVar2.f3255b);
        }
        return mo4159A(abstractC0787f0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: b */
    public boolean mo3886b(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0787f0 abstractC0787f02, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f3254a;
        int i13 = bVar.f3255b;
        if (abstractC0787f02.shouldIgnore()) {
            int i14 = bVar.f3254a;
            i11 = bVar.f3255b;
            i10 = i14;
        } else {
            i10 = bVar2.f3254a;
            i11 = bVar2.f3255b;
        }
        return mo4160B(abstractC0787f0, abstractC0787f02, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: c */
    public boolean mo3887c(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f3254a;
        int i13 = bVar.f3255b;
        View view = abstractC0787f0.itemView;
        if (bVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = bVar2.f3254a;
        }
        int i14 = i10;
        if (bVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = bVar2.f3255b;
        }
        int i15 = i11;
        if (!abstractC0787f0.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            return mo4161C(abstractC0787f0, i12, i13, i14, i15);
        }
        return mo4162D(abstractC0787f0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: d */
    public boolean mo3888d(RecyclerView.AbstractC0787f0 abstractC0787f0, RecyclerView.AbstractC0794m.b bVar, RecyclerView.AbstractC0794m.b bVar2) {
        int i10 = bVar.f3254a;
        int i11 = bVar2.f3254a;
        if (i10 == i11 && bVar.f3255b == bVar2.f3255b) {
            m4261I(abstractC0787f0);
            return false;
        }
        return mo4161C(abstractC0787f0, i10, bVar.f3255b, i11, bVar2.f3255b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0794m
    /* renamed from: f */
    public boolean mo3889f(RecyclerView.AbstractC0787f0 abstractC0787f0) {
        if (this.f3485g && !abstractC0787f0.isInvalid()) {
            return false;
        }
        return true;
    }
}
