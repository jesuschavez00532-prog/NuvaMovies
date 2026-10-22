package p007a6;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p038c6.AbstractC1366a0;

/* renamed from: a6.v */
/* loaded from: classes.dex */
class C0103v implements InterfaceC0107z {

    /* renamed from: a */
    private final File f345a;

    /* renamed from: b */
    private final String f346b;

    /* renamed from: c */
    private final String f347c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0103v(String str, String str2, File file) {
        this.f346b = str;
        this.f347c = str2;
        this.f345a = file;
    }

    /* renamed from: d */
    private byte[] m466d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo239b = mo239b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (mo239b == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (mo239b != null) {
                            mo239b.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = mo239b.read(bArr);
                            if (read > 0) {
                                gZIPOutputStream.write(bArr, 0, read);
                            } else {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                mo239b.close();
                                return byteArray;
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: a */
    public String mo238a() {
        return this.f347c;
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: b */
    public InputStream mo239b() {
        if (this.f345a.exists() && this.f345a.isFile()) {
            try {
                return new FileInputStream(this.f345a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p007a6.InterfaceC0107z
    /* renamed from: c */
    public AbstractC1366a0.d.b mo240c() {
        byte[] m466d = m466d();
        if (m466d != null) {
            return AbstractC1366a0.d.b.m6217a().mo6221b(m466d).mo6222c(this.f346b).mo6220a();
        }
        return null;
    }
}
