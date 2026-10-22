package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.InterfaceC1619b;

/* renamed from: com.bumptech.glide.manager.d */
/* loaded from: classes.dex */
final class C1621d implements InterfaceC1619b {

    /* renamed from: a */
    private final Context f6423a;

    /* renamed from: b */
    final InterfaceC1619b.a f6424b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1621d(Context context, InterfaceC1619b.a aVar) {
        this.f6423a = context.getApplicationContext();
        this.f6424b = aVar;
    }

    /* renamed from: a */
    private void m7461a() {
        C1634q.m7487a(this.f6423a).m7490d(this.f6424b);
    }

    /* renamed from: b */
    private void m7462b() {
        C1634q.m7487a(this.f6423a).m7491e(this.f6424b);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        m7461a();
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        m7462b();
    }
}
