package com.bumptech.glide.load.data;

import java.io.OutputStream;
import p230m1.InterfaceC5569b;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes.dex */
public final class C1603c extends OutputStream {

    /* renamed from: a */
    private final OutputStream f6395a;

    /* renamed from: b */
    private byte[] f6396b;

    /* renamed from: c */
    private InterfaceC5569b f6397c;

    /* renamed from: d */
    private int f6398d;

    public C1603c(OutputStream outputStream, InterfaceC5569b interfaceC5569b) {
        this(outputStream, interfaceC5569b, 65536);
    }

    /* renamed from: a */
    private void m7427a() {
        int i10 = this.f6398d;
        if (i10 > 0) {
            this.f6395a.write(this.f6396b, 0, i10);
            this.f6398d = 0;
        }
    }

    /* renamed from: b */
    private void m7428b() {
        if (this.f6398d == this.f6396b.length) {
            m7427a();
        }
    }

    /* renamed from: c */
    private void m7429c() {
        byte[] bArr = this.f6396b;
        if (bArr != null) {
            this.f6397c.put(bArr);
            this.f6396b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f6395a.close();
            m7429c();
        } catch (Throwable th) {
            this.f6395a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m7427a();
        this.f6395a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f6396b;
        int i11 = this.f6398d;
        this.f6398d = i11 + 1;
        bArr[i11] = (byte) i10;
        m7428b();
    }

    C1603c(OutputStream outputStream, InterfaceC5569b interfaceC5569b, int i10) {
        this.f6395a = outputStream;
        this.f6397c = interfaceC5569b;
        this.f6396b = (byte[]) interfaceC5569b.mo22611d(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f6398d;
            if (i15 == 0 && i13 >= this.f6396b.length) {
                this.f6395a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f6396b.length - i15);
            System.arraycopy(bArr, i14, this.f6396b, this.f6398d, min);
            this.f6398d += min;
            i12 += min;
            m7428b();
        } while (i12 < i11);
    }
}
