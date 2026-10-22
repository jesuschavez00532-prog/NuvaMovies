package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.lzy.okgo.cookie.SerializableCookie;
import p006a5.C0061a;
import p351u5.InterfaceC7041a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes.dex */
public final class C2618e implements C0061a.a {

    /* renamed from: a */
    final /* synthetic */ C2619f f10012a;

    public C2618e(C2619f c2619f) {
        this.f10012a = c2619f;
    }

    @Override // p025b5.InterfaceC1123u
    /* renamed from: a */
    public final void mo5090a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC7041a.b bVar;
        if (str != null && !str.equals("crash") && AbstractC2615b.m10846e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(SerializableCookie.NAME, str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            bVar = this.f10012a.f10013a;
            bVar.mo27143a(3, bundle2);
        }
    }
}
