package com.alibaba.sdk.android.httpdns.p045b;

import android.content.Context;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.a */
/* loaded from: classes.dex */
class C1527a implements InterfaceC1532f {

    /* renamed from: a */
    private final C1530d f5877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1527a(Context context) {
        this.f5877a = new C1530d(context);
    }

    @Override // com.alibaba.sdk.android.httpdns.p045b.InterfaceC1532f
    /* renamed from: a */
    public List<C1531e> mo7070a() {
        return this.f5877a.m7100b();
    }

    @Override // com.alibaba.sdk.android.httpdns.p045b.InterfaceC1532f
    /* renamed from: b */
    public void mo7072b(C1531e c1531e) {
        this.f5877a.m7101b(c1531e.f5889m, c1531e.host);
    }

    @Override // com.alibaba.sdk.android.httpdns.p045b.InterfaceC1532f
    /* renamed from: a */
    public void mo7071a(C1531e c1531e) {
        this.f5877a.m7098a(c1531e);
    }
}
