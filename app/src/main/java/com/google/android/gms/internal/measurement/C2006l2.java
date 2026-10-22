package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes.dex */
public final class C2006l2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Long f7861e;

    /* renamed from: f */
    final /* synthetic */ String f7862f;

    /* renamed from: g */
    final /* synthetic */ String f7863g;

    /* renamed from: h */
    final /* synthetic */ Bundle f7864h;

    /* renamed from: i */
    final /* synthetic */ boolean f7865i;

    /* renamed from: j */
    final /* synthetic */ boolean f7866j;

    /* renamed from: k */
    final /* synthetic */ C2201y2 f7867k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2006l2(C2201y2 c2201y2, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c2201y2, true);
        this.f7867k = c2201y2;
        this.f7861e = l10;
        this.f7862f = str;
        this.f7863g = str2;
        this.f7864h = bundle;
        this.f7865i = z10;
        this.f7866j = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        long longValue;
        InterfaceC1945h1 interfaceC1945h1;
        Long l10 = this.f7861e;
        if (l10 == null) {
            longValue = this.f7958a;
        } else {
            longValue = l10.longValue();
        }
        long j10 = longValue;
        interfaceC1945h1 = this.f7867k.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).logEvent(this.f7862f, this.f7863g, this.f7864h, this.f7865i, this.f7866j, j10);
    }
}
