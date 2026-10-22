package anet.channel.util;

import java.io.InputStream;

/* renamed from: anet.channel.util.a */
/* loaded from: classes.dex */
public class C1016a extends InputStream {

    /* renamed from: a */
    private InputStream f4207a;

    /* renamed from: b */
    private long f4208b = 0;

    public C1016a(InputStream inputStream) {
        this.f4207a = null;
        if (inputStream != null) {
            this.f4207a = inputStream;
            return;
        }
        throw new NullPointerException("input stream cannot be null");
    }

    /* renamed from: a */
    public long m4791a() {
        return this.f4208b;
    }

    @Override // java.io.InputStream
    public int read() {
        this.f4208b++;
        return this.f4207a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f4207a.read(bArr, i10, i11);
        if (read != -1) {
            this.f4208b += read;
        }
        return read;
    }
}
