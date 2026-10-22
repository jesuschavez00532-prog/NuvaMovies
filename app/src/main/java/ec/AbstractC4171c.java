package ec;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* renamed from: ec.c */
/* loaded from: classes.dex */
public abstract class AbstractC4171c {
    /* renamed from: a */
    protected abstract int mo17124a();

    /* renamed from: b */
    protected abstract int mo17125b();

    /* renamed from: c */
    protected abstract void mo17126c(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i10);

    /* renamed from: d */
    public void m17431d(InputStream inputStream, OutputStream outputStream) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        m17433f(pushbackInputStream, outputStream);
        while (true) {
            try {
                int m17435h = m17435h(pushbackInputStream, outputStream);
                int i10 = 0;
                while (mo17124a() + i10 < m17435h) {
                    mo17126c(pushbackInputStream, outputStream, mo17124a());
                    i10 += mo17124a();
                }
                if (mo17124a() + i10 == m17435h) {
                    mo17126c(pushbackInputStream, outputStream, mo17124a());
                } else {
                    mo17126c(pushbackInputStream, outputStream, m17435h - i10);
                }
                m17436i(pushbackInputStream, outputStream);
            } catch (C4170b unused) {
                m17434g(pushbackInputStream, outputStream);
                return;
            }
        }
    }

    /* renamed from: e */
    public byte[] m17432e(String str) {
        byte[] bArr = new byte[str.length()];
        str.getBytes(0, str.length(), bArr, 0);
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m17431d(byteArrayInputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: f */
    protected void m17433f(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    /* renamed from: g */
    protected void m17434g(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    /* renamed from: h */
    protected int m17435h(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
        return mo17125b();
    }

    /* renamed from: i */
    protected void m17436i(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public int m17437j(InputStream inputStream, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int read = inputStream.read();
            if (read == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            bArr[i12 + i10] = (byte) read;
        }
        return i11;
    }
}
