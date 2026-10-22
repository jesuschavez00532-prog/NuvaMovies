package p007a6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p038c6.AbstractC1366a0;

/* renamed from: a6.e */
/* loaded from: classes.dex */
class C0070e implements InterfaceC0107z {

    /* renamed from: a */
    private final byte[] f198a;

    /* renamed from: b */
    private final String f199b;

    /* renamed from: c */
    private final String f200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0070e(String str, String str2, byte[] bArr) {
        this.f199b = str;
        this.f200c = str2;
        this.f198a = bArr;
    }

    /* renamed from: d */
    private byte[] m236d() {
        if (m237e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f198a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m237e() {
        byte[] bArr = this.f198a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: a */
    public String mo238a() {
        return this.f200c;
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: b */
    public InputStream mo239b() {
        if (m237e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f198a);
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: c */
    public AbstractC1366a0.d.b mo240c() {
        byte[] m236d = m236d();
        if (m236d == null) {
            return null;
        }
        return AbstractC1366a0.d.b.m6217a().mo6221b(m236d).mo6222c(this.f199b).mo6220a();
    }
}
