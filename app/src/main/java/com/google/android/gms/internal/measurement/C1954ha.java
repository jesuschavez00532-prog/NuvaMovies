package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0272b;

/* renamed from: com.google.android.gms.internal.measurement.ha */
/* loaded from: classes.dex */
final class C1954ha implements InterfaceC2059oa {

    /* renamed from: a */
    private final InterfaceC1891da f7801a;

    /* renamed from: b */
    private final AbstractC2149ua f7802b;

    /* renamed from: c */
    private final boolean f7803c;

    /* renamed from: d */
    private final AbstractC2072p8 f7804d;

    private C1954ha(AbstractC2149ua abstractC2149ua, AbstractC2072p8 abstractC2072p8, InterfaceC1891da interfaceC1891da) {
        this.f7802b = abstractC2149ua;
        this.f7803c = abstractC2072p8.mo8768c(interfaceC1891da);
        this.f7804d = abstractC2072p8;
        this.f7801a = interfaceC1891da;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C1954ha m8517j(AbstractC2149ua abstractC2149ua, AbstractC2072p8 abstractC2072p8, InterfaceC1891da interfaceC1891da) {
        return new C1954ha(abstractC2149ua, abstractC2072p8, interfaceC1891da);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: a */
    public final void mo8460a(Object obj) {
        this.f7802b.mo9017g(obj);
        this.f7804d.mo8767b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: b */
    public final Object mo8461b() {
        return this.f7801a.mo8248b().mo8190S();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: c */
    public final boolean mo8462c(Object obj) {
        this.f7804d.mo8766a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: d */
    public final int mo8463d(Object obj) {
        int hashCode = this.f7802b.mo9013c(obj).hashCode();
        if (!this.f7803c) {
            return hashCode;
        }
        this.f7804d.mo8766a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: e */
    public final void mo8464e(Object obj, InterfaceC2015lb interfaceC2015lb) {
        this.f7804d.mo8766a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: f */
    public final int mo8465f(Object obj) {
        AbstractC2149ua abstractC2149ua = this.f7802b;
        int mo9012b = abstractC2149ua.mo9012b(abstractC2149ua.mo9013c(obj));
        if (!this.f7803c) {
            return mo9012b;
        }
        this.f7804d.mo8766a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: g */
    public final void mo8466g(Object obj, Object obj2) {
        AbstractC2089qa.m8840f(this.f7802b, obj, obj2);
        if (this.f7803c) {
            AbstractC2089qa.m8839e(this.f7804d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: h */
    public final void mo8467h(Object obj, byte[] bArr, int i10, int i11, C2071p7 c2071p7) {
        AbstractC2222z8 abstractC2222z8 = (AbstractC2222z8) obj;
        if (abstractC2222z8.zzc == C2164va.m9045c()) {
            abstractC2222z8.zzc = C2164va.m9047e();
        }
        AbstractC0272b.m941a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: i */
    public final boolean mo8468i(Object obj, Object obj2) {
        if (!this.f7802b.mo9013c(obj).equals(this.f7802b.mo9013c(obj2))) {
            return false;
        }
        if (!this.f7803c) {
            return true;
        }
        this.f7804d.mo8766a(obj);
        this.f7804d.mo8766a(obj2);
        throw null;
    }
}
