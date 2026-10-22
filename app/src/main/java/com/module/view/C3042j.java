package com.module.view;

import be.C1328x;
import com.open.leanback.widget.HorizontalGridView;
import me.InterfaceC5660l;
import ne.AbstractC5869l;

/* renamed from: com.module.view.j */
/* loaded from: classes2.dex */
final class C3042j extends AbstractC5869l implements InterfaceC5660l {

    /* renamed from: a */
    final /* synthetic */ VodSelectionView f12359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3042j(VodSelectionView vodSelectionView) {
        super(1);
        this.f12359a = vodSelectionView;
    }

    /* renamed from: a */
    public final void m12340a(int i10) {
        HorizontalGridView horizontalGridView = this.f12359a.f12326c;
        if (horizontalGridView != null) {
            horizontalGridView.setSelectedPosition(i10);
        }
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        m12340a(((Number) obj).intValue());
        return C1328x.f4998a;
    }
}
