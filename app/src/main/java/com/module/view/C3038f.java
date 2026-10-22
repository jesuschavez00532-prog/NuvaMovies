package com.module.view;

import android.widget.TextView;
import me.InterfaceC5642a;
import ne.AbstractC5869l;

/* renamed from: com.module.view.f */
/* loaded from: classes2.dex */
final class C3038f extends AbstractC5869l implements InterfaceC5642a {

    /* renamed from: a */
    final /* synthetic */ NetConnectStatusView f12355a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3038f(NetConnectStatusView netConnectStatusView) {
        super(0);
        this.f12355a = netConnectStatusView;
    }

    @Override // me.InterfaceC5642a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TextView invoke() {
        return new TextView(this.f12355a.getContext());
    }
}
