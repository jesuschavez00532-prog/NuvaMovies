package com.module.view;

import be.C1328x;
import com.open.leanback.widget.HorizontalGridView;
import me.InterfaceC5660l;
import ne.AbstractC5869l;

/* renamed from: com.module.view.h */
/* loaded from: classes2.dex */
final class C3040h extends AbstractC5869l implements InterfaceC5660l {

    /* renamed from: a */
    final /* synthetic */ SelectionView f12357a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3040h(SelectionView selectionView) {
        super(1);
        this.f12357a = selectionView;
    }

    /* renamed from: a */
    public final void m12339a(int i10) {
        HorizontalGridView horizontalGridView = this.f12357a.f12298c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(i10);
        }
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        m12339a(((Number) obj).intValue());
        return C1328x.f4998a;
    }
}
