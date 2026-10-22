package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import anet.channel.entity.ConnType;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes.dex */
public final class C2274d6 implements InterfaceC2387n9 {

    /* renamed from: a */
    final /* synthetic */ C2406p6 f8539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2274d6(C2406p6 c2406p6) {
        this.f8539a = c2406p6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2387n9
    /* renamed from: a */
    public final void mo9519a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f8539a.m10001t(ConnType.PK_AUTO, "_err", bundle, str);
        } else {
            this.f8539a.m9999r(ConnType.PK_AUTO, "_err", bundle);
        }
    }
}
