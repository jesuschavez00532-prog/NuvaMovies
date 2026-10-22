package com.google.android.gms.common.api.internal;

import java.util.Map;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p127f5.InterfaceC4235d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public final class C1793d implements InterfaceC4235d {

    /* renamed from: a */
    final /* synthetic */ C4247j f7566a;

    /* renamed from: b */
    final /* synthetic */ C1794e f7567b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1793d(C1794e c1794e, C4247j c4247j) {
        this.f7567b = c1794e;
        this.f7566a = c4247j;
    }

    @Override // p127f5.InterfaceC4235d
    /* renamed from: a */
    public final void mo488a(AbstractC4245i abstractC4245i) {
        Map map;
        map = this.f7567b.f7569b;
        map.remove(this.f7566a);
    }
}
