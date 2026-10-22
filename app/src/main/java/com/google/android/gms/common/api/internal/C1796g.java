package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1790a;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
final class C1796g implements ComponentCallbacks2C1790a.a {

    /* renamed from: a */
    final /* synthetic */ C1791b f7572a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1796g(C1791b c1791b) {
        this.f7572a = c1791b;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1790a.a
    /* renamed from: a */
    public final void mo7934a(boolean z10) {
        Handler handler;
        Handler handler2;
        C1791b c1791b = this.f7572a;
        handler = c1791b.f7557p;
        handler2 = c1791b.f7557p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
