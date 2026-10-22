package com.module.playsetting.view;

import com.open.leanback.widget.VerticalGridView;
import me.InterfaceC5642a;
import ne.AbstractC5869l;

/* renamed from: com.module.playsetting.view.b */
/* loaded from: classes2.dex */
final class C2979b extends AbstractC5869l implements InterfaceC5642a {

    /* renamed from: a */
    final /* synthetic */ PlaySettingView f12074a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979b(PlaySettingView playSettingView) {
        super(0);
        this.f12074a = playSettingView;
    }

    @Override // me.InterfaceC5642a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final VerticalGridView invoke() {
        return new VerticalGridView(this.f12074a.getContext());
    }
}
