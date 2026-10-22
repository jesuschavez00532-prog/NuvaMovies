package ec;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: ec.d */
/* loaded from: classes.dex */
public abstract class AbstractC4172d {

    /* renamed from: a */
    protected PrintStream f18247a;

    /* renamed from: a */
    protected abstract int mo17127a();

    /* renamed from: b */
    protected abstract int mo17128b();

    /* renamed from: c */
    public String m17438c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m17439d(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString("8859_1");
        } catch (Exception unused) {
            throw new Error("CharacterEncoder.encode internal error");
        }
    }

    /* renamed from: d */
    public void m17439d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[mo17128b()];
        m17440f(outputStream);
        while (true) {
            int m17444j = m17444j(inputStream, bArr);
            if (m17444j == 0) {
                break;
            }
            m17442h(outputStream, m17444j);
            int i10 = 0;
            while (i10 < m17444j) {
                if (mo17127a() + i10 <= m17444j) {
                    mo17129e(outputStream, bArr, i10, mo17127a());
                } else {
                    mo17129e(outputStream, bArr, i10, m17444j - i10);
                }
                i10 += mo17127a();
            }
            if (m17444j < mo17128b()) {
                break;
            } else {
                m17443i(outputStream);
            }
        }
        m17441g(outputStream);
    }

    /* renamed from: e */
    protected abstract void mo17129e(OutputStream outputStream, byte[] bArr, int i10, int i11);

    /* renamed from: f */
    protected void m17440f(OutputStream outputStream) {
        this.f18247a = new PrintStream(outputStream);
    }

    /* renamed from: g */
    protected void m17441g(OutputStream outputStream) {
    }

    /* renamed from: h */
    protected void m17442h(OutputStream outputStream, int i10) {
    }

    /* renamed from: i */
    protected void m17443i(OutputStream outputStream) {
        this.f18247a.println();
    }

    /* renamed from: j */
    protected int m17444j(InputStream inputStream, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int read = inputStream.read();
            if (read == -1) {
                return i10;
            }
            bArr[i10] = (byte) read;
        }
        return bArr.length;
    }
}
