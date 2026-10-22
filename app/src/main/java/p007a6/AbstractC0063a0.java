package p007a6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: a6.a0 */
/* loaded from: classes.dex */
abstract class AbstractC0063a0 {
    /* renamed from: a */
    private static void m220a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        AbstractC0074g.m256f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC0074g.m256f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m221b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0107z interfaceC0107z = (InterfaceC0107z) it.next();
            InputStream inputStream = null;
            try {
                inputStream = interfaceC0107z.mo239b();
                if (inputStream != null) {
                    m220a(inputStream, new File(file, interfaceC0107z.mo238a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC0074g.m256f(null);
                throw th;
            }
            AbstractC0074g.m256f(inputStream);
        }
    }
}
