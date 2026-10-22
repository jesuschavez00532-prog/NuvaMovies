package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
/* loaded from: classes.dex */
public abstract class AbstractC2192x8 extends AbstractC2011l7 {

    /* renamed from: a */
    private final AbstractC2222z8 f8254a;

    /* renamed from: b */
    protected AbstractC2222z8 f8255b;

    /* renamed from: c */
    protected boolean f8256c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2192x8(AbstractC2222z8 abstractC2222z8) {
        this.f8254a = abstractC2222z8;
        this.f8255b = (AbstractC2222z8) abstractC2222z8.mo8126w(4, null, null);
    }

    /* renamed from: j */
    private static final void m9172j(AbstractC2222z8 abstractC2222z8, AbstractC2222z8 abstractC2222z82) {
        C2014la.m8663a().m8664b(abstractC2222z8.getClass()).mo8466g(abstractC2222z8, abstractC2222z82);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1907ea
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1891da mo8293a() {
        return this.f8254a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2011l7
    /* renamed from: g */
    protected final /* synthetic */ AbstractC2011l7 mo8623g(AbstractC2026m7 abstractC2026m7) {
        m9174l((AbstractC2222z8) abstractC2026m7);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2011l7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ AbstractC2011l7 mo8624h(byte[] bArr, int i10, int i11) {
        m9175m(bArr, 0, i11, C2057o8.f7982c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2011l7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC2011l7 mo8625i(byte[] bArr, int i10, int i11, C2057o8 c2057o8) {
        m9175m(bArr, 0, i11, c2057o8);
        return this;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractC2192x8 clone() {
        AbstractC2192x8 abstractC2192x8 = (AbstractC2192x8) this.f8254a.mo8126w(5, null, null);
        abstractC2192x8.m9174l(mo8190S());
        return abstractC2192x8;
    }

    /* renamed from: l */
    public final AbstractC2192x8 m9174l(AbstractC2222z8 abstractC2222z8) {
        if (this.f8256c) {
            m9178r();
            this.f8256c = false;
        }
        m9172j(this.f8255b, abstractC2222z8);
        return this;
    }

    /* renamed from: m */
    public final AbstractC2192x8 m9175m(byte[] bArr, int i10, int i11, C2057o8 c2057o8) {
        if (this.f8256c) {
            m9178r();
            this.f8256c = false;
        }
        try {
            C2014la.m8663a().m8664b(this.f8255b.getClass()).mo8467h(this.f8255b, bArr, 0, i11, new C2071p7(c2057o8));
            return this;
        } catch (C1968i9 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw C1968i9.m8531f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.AbstractC2222z8 m9176o() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.z8 r0 = r5.mo8190S()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo8126w(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.la r3 = com.google.android.gms.internal.measurement.C2014la.m8663a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.oa r3 = r3.m8664b(r4)
            boolean r3 = r3.mo8462c(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.mo8126w(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.ta r1 = new com.google.android.gms.internal.measurement.ta
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2192x8.m9176o():com.google.android.gms.internal.measurement.z8");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1875ca
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC2222z8 mo8190S() {
        if (this.f8256c) {
            return this.f8255b;
        }
        AbstractC2222z8 abstractC2222z8 = this.f8255b;
        C2014la.m8663a().m8664b(abstractC2222z8.getClass()).mo8460a(abstractC2222z8);
        this.f8256c = true;
        return this.f8255b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m9178r() {
        AbstractC2222z8 abstractC2222z8 = (AbstractC2222z8) this.f8255b.mo8126w(4, null, null);
        m9172j(abstractC2222z8, this.f8255b);
        this.f8255b = abstractC2222z8;
    }
}
