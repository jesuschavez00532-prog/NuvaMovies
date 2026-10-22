package com.module.view;

import com.module.R$string;
import java.util.ArrayList;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import pa.C6247d;

/* renamed from: com.module.view.c */
/* loaded from: classes2.dex */
final class C3035c extends AbstractC5869l implements InterfaceC5642a {

    /* renamed from: a */
    final /* synthetic */ MFInfoBar f12352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3035c(MFInfoBar mFInfoBar) {
        super(0);
        this.f12352a = mFInfoBar;
    }

    @Override // me.InterfaceC5642a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6247d invoke() {
        ArrayList m6984c;
        C6247d c6247d = new C6247d();
        MFInfoBar mFInfoBar = this.f12352a;
        String string = mFInfoBar.getContext().getResources().getString(R$string.vod_menu_player_1);
        AbstractC5868k.m23673e(string, "context.resources.getStr…string.vod_menu_player_1)");
        String string2 = mFInfoBar.getContext().getResources().getString(R$string.vod_menu_player_2);
        AbstractC5868k.m23673e(string2, "context.resources.getStr…string.vod_menu_player_2)");
        m6984c = AbstractC1500l.m6984c(string, string2);
        c6247d.m24873b(m6984c);
        return c6247d;
    }
}
