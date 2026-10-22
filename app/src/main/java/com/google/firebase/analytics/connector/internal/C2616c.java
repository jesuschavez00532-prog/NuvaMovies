package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.umeng.analytics.pro.C3384f;
import p006a5.C0061a;
import p351u5.InterfaceC7041a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* loaded from: classes.dex */
public final class C2616c implements C0061a.a {

    /* renamed from: a */
    final /* synthetic */ C2617d f10007a;

    public C2616c(C2617d c2617d) {
        this.f10007a = c2617d;
    }

    @Override // p025b5.InterfaceC1123u
    /* renamed from: a */
    public final void mo5090a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC7041a.b bVar;
        if (!this.f10007a.f10008a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(C3384f.f14604ax, AbstractC2615b.m10842a(str2));
        bVar = this.f10007a.f10009b;
        bVar.mo27143a(2, bundle2);
    }
}
