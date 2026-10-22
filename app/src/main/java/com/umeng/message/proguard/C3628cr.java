package com.umeng.message.proguard;

import com.umeng.message.proguard.AbstractC3627cq;

/* renamed from: com.umeng.message.proguard.cr */
/* loaded from: classes3.dex */
public class C3628cr extends AbstractC3627cq {

    /* renamed from: a */
    private static volatile C3628cr f16206a;

    private C3628cr() {
    }

    /* renamed from: a */
    public static AbstractC3627cq m15569a() {
        if (f16206a == null) {
            synchronized (C3628cr.class) {
                if (f16206a == null) {
                    f16206a = new C3628cr();
                }
            }
        }
        return f16206a;
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: b */
    public final void mo15564b(final C3621ck c3621ck, final int i10) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.4
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().m15546a(c3621ck, i10);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: c */
    public final void mo15566c(final C3621ck c3621ck, final int i10) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.6
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().m15556c(c3621ck, i10);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: b */
    public final boolean mo15565b(C3621ck c3621ck) {
        return C3629cs.m15570a().mo15554a(c3621ck);
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15560a(final C3621ck c3621ck, final AbstractC3627cq.a aVar) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.1
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().mo15550a(c3621ck, aVar);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15558a(final C3621ck c3621ck, final int i10) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.3
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().m15555b(c3621ck, i10);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15557a(final C3621ck c3621ck) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.5

            /* renamed from: b */
            final /* synthetic */ int f16220b = 3011;

            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().m15547a(c3621ck, 9, this.f16220b);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15559a(C3621ck c3621ck, int i10, int i11, String str) {
        C3629cs.m15570a().m15548a(c3621ck, i10, i11, str);
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15563a(final boolean z10, final C3621ck c3621ck, final boolean z11, final int i10, final int i11, final long j10) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.7
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().m15553a(z10, c3621ck, z11, i10, i11, j10);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15561a(final C3621ck c3621ck, final boolean z10, final AbstractC3627cq.a aVar) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.8
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().mo15551a(c3621ck, z10, aVar);
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3627cq
    /* renamed from: a */
    public final void mo15562a(final String str, final C3621ck c3621ck) {
        C3612cb.m15500b(new Runnable() { // from class: com.umeng.message.proguard.cr.2
            @Override // java.lang.Runnable
            public final void run() {
                C3629cs.m15570a().mo15552a(str, c3621ck);
            }
        });
    }
}
