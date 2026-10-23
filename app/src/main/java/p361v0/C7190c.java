package p361v0;

import com.lzy.okgo.model.Progress;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import ne.AbstractC5868k;
import p242n0.C5719f;

/* renamed from: v0.c */
/* loaded from: classes.dex */
public final class C7190c {

    /* renamed from: a */
    public static final C7190c f26897a = new C7190c();

    private C7190c() {
    }

    /* renamed from: a */
    public final boolean m27821a(InputStream inputStream, File file) {
        AbstractC5868k.m23674f(inputStream, "ins");
        AbstractC5868k.m23674f(file, "file");
        return m27825e(inputStream, file, 8192);
    }

    /* renamed from: b */
    public final void m27822b(File file) {
        AbstractC5868k.m23674f(file, "file");
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: c */
    public final void m27823c(String str) {
        AbstractC5868k.m23674f(str, Progress.FILE_PATH);
        m27822b(new File(str));
    }

    /* renamed from: d */
    public final void m27824d(String str) throws java.io.IOException {
        AbstractC5868k.m23674f(str, Progress.FILE_PATH);
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /* renamed from: e */
    public final boolean m27825e(InputStream inputStream, File file, int i10) {
        AbstractC5868k.m23674f(inputStream, "ins");
        AbstractC5868k.m23674f(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                byte[] bArr = new byte[i10];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        C5719f c5719f = C5719f.f22985a;
                        c5719f.m23112a(inputStream);
                        c5719f.m23112a(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                C5719f c5719f2 = C5719f.f22985a;
                c5719f2.m23112a(inputStream);
                c5719f2.m23112a(fileOutputStream);
                return false;
            }
        } catch (Throwable th) {
            C5719f c5719f3 = C5719f.f22985a;
            c5719f3.m23112a(inputStream);
            c5719f3.m23112a(fileOutputStream);
            throw th;
        }
    }
}
