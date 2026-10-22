package com.module.view;

import android.widget.ImageView;
import me.InterfaceC5642a;
import ne.AbstractC5869l;

/* renamed from: com.module.view.e */
/* loaded from: classes2.dex */
final class C3037e extends AbstractC5869l implements InterfaceC5642a {

    /* renamed from: a */
    final /* synthetic */ NetConnectStatusView f12354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3037e(NetConnectStatusView netConnectStatusView) {
        super(0);
        this.f12354a = netConnectStatusView;
    }

    @Override // me.InterfaceC5642a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ImageView invoke() {
        return new ImageView(this.f12354a.getContext());
    }
}
