package p140g1;

import anet.channel.request.Request;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g1.d */
/* loaded from: classes.dex */
abstract class AbstractC4336d {

    /* renamed from: a */
    static final Charset f18880a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f18881b = Charset.forName(Request.DEFAULT_CHARSET);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18203a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18204b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m18204b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
