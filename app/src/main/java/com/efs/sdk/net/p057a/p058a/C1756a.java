package com.efs.sdk.net.p057a.p058a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.efs.sdk.net.a.a.a */
/* loaded from: classes.dex */
public final class C1756a extends FilterOutputStream {

    /* renamed from: a */
    private long f7349a;

    public C1756a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        this.f7349a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f7349a += i11;
    }
}
