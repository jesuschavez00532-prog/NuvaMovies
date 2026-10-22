package p278p1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p184j1.C4977h;
import p184j1.InterfaceC4973d;
import p230m1.InterfaceC5569b;

/* renamed from: p1.v */
/* loaded from: classes.dex */
public class C6182v implements InterfaceC4973d {

    /* renamed from: a */
    private final InterfaceC5569b f24319a;

    public C6182v(InterfaceC5569b interfaceC5569b) {
        this.f24319a = interfaceC5569b;
    }

    @Override // p184j1.InterfaceC4973d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo20315b(InputStream inputStream, File file, C4977h c4977h) {
        byte[] bArr = (byte[]) this.f24319a.mo22611d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f24319a.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f24319a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f24319a.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
