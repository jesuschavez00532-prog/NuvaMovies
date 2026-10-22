package com.umeng.message.proguard;

import android.app.Activity;
import com.umeng.message.proguard.InterfaceC3606bx;

/* renamed from: com.umeng.message.proguard.da */
/* loaded from: classes3.dex */
public abstract class AbstractC3639da implements InterfaceC3606bx.a {

    /* renamed from: a */
    public C3616cf f16287a = new C3616cf();

    /* renamed from: a */
    public void mo15630a(Activity activity) {
    }

    /* renamed from: b */
    public void mo15631b() {
        C3616cf c3616cf = this.f16287a;
        if (c3616cf != null) {
            c3616cf.f16134a = null;
            this.f16287a = null;
        }
    }

    @Override // com.umeng.message.proguard.InterfaceC3606bx.a
    /* renamed from: a */
    public final void mo15451a() {
        mo15630a((Activity) null);
    }

    @Override // com.umeng.message.proguard.InterfaceC3606bx.a
    /* renamed from: a */
    public final void mo15452a(InterfaceC3606bx.d dVar) {
        this.f16287a.f16134a = dVar;
    }
}
