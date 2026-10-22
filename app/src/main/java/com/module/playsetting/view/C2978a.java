package com.module.playsetting.view;

import java.util.ArrayList;
import me.InterfaceC5642a;
import ne.AbstractC5869l;
import p265oa.C5946d;

/* renamed from: com.module.playsetting.view.a */
/* loaded from: classes2.dex */
final class C2978a extends AbstractC5869l implements InterfaceC5642a {

    /* renamed from: a */
    final /* synthetic */ PlaySettingView f12073a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978a(PlaySettingView playSettingView) {
        super(0);
        this.f12073a = playSettingView;
    }

    @Override // me.InterfaceC5642a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5946d invoke() {
        ArrayList arrayList;
        arrayList = this.f12073a.f12061b;
        return new C5946d(arrayList);
    }
}
