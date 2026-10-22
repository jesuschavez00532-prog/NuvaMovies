package kotlinx.coroutines.internal;

import be.C1308d;
import ee.InterfaceC4184g;
import ve.AbstractC7292k1;
import ve.InterfaceC7281h;
import ve.InterfaceC7282h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes3.dex */
public final class C5276o extends AbstractC7292k1 implements InterfaceC7282h0 {

    /* renamed from: b */
    private final Throwable f21499b;

    /* renamed from: c */
    private final String f21500c;

    public C5276o(Throwable th, String str) {
        this.f21499b = th;
        this.f21500c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 != null) goto L10;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void m21235C() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f21499b
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f21500c
            if (r1 == 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L26
            goto L28
        L26:
            java.lang.String r1 = ""
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f21499b
            r1.<init>(r0, r2)
            throw r1
        L37:
            kotlinx.coroutines.internal.AbstractC5275n.m21233c()
            be.d r0 = new be.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5276o.m21235C():java.lang.Void");
    }

    @Override // ve.AbstractC7329x
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        m21235C();
        throw new C1308d();
    }

    @Override // ve.InterfaceC7282h0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void mo21238e(long j10, InterfaceC7281h interfaceC7281h) {
        m21235C();
        throw new C1308d();
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f21499b != null) {
            str = ", cause=" + this.f21499b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // ve.AbstractC7329x
    /* renamed from: y */
    public boolean mo21240y(InterfaceC4184g interfaceC4184g) {
        m21235C();
        throw new C1308d();
    }

    @Override // ve.AbstractC7292k1
    /* renamed from: z */
    public AbstractC7292k1 mo21241z() {
        return this;
    }
}
