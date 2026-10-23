package p128f6;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p395x5.C7503f;

/* renamed from: f6.f */
/* loaded from: classes.dex */
public class C4270f {

    /* renamed from: a */
    private final File f18592a;

    /* renamed from: b */
    private final File f18593b;

    /* renamed from: c */
    private final File f18594c;

    /* renamed from: d */
    private final File f18595d;

    /* renamed from: e */
    private final File f18596e;

    /* renamed from: f */
    private final File f18597f;

    public C4270f(Context context) {
        String str = null;
        String processName = null;
        File filesDir = context.getFilesDir();
        this.f18592a = filesDir;
        if (m17791v()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(m17790u(processName));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m17786q = m17786q(new File(filesDir, str));
        this.f18593b = m17786q;
        this.f18594c = m17786q(new File(m17786q, "open-sessions"));
        this.f18595d = m17786q(new File(m17786q, "reports"));
        this.f18596e = m17786q(new File(m17786q, "priority-reports"));
        this.f18597f = m17786q(new File(m17786q, "native-reports"));
    }

    /* renamed from: a */
    private void m17784a(File file) {
        if (file.exists() && m17788s(file)) {
            C7503f.m28716f().m28717b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m17785n(String str) {
        return m17787r(new File(this.f18594c, str));
    }

    /* renamed from: q */
    private static synchronized File m17786q(File file) {
        synchronized (C4270f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C7503f.m28716f().m28717b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                C7503f.m28716f().m28719d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    /* renamed from: r */
    private static File m17787r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static boolean m17788s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m17788s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static List m17789t(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    /* renamed from: u */
    static String m17790u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: v */
    private static boolean m17791v() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m17792b() {
        m17784a(new File(this.f18592a, ".com.google.firebase.crashlytics"));
        m17784a(new File(this.f18592a, ".com.google.firebase.crashlytics-ndk"));
        if (m17791v()) {
            m17784a(new File(this.f18592a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m17793c(String str) {
        return m17788s(new File(this.f18594c, str));
    }

    /* renamed from: d */
    public List m17794d() {
        return m17789t(this.f18594c.list());
    }

    /* renamed from: e */
    public File m17795e(String str) {
        return new File(this.f18593b, str);
    }

    /* renamed from: f */
    public List m17796f(FilenameFilter filenameFilter) {
        return m17789t(this.f18593b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m17797g(String str) {
        return new File(this.f18597f, str);
    }

    /* renamed from: h */
    public List m17798h() {
        return m17789t(this.f18597f.listFiles());
    }

    /* renamed from: i */
    public File m17799i(String str) {
        return m17787r(new File(m17785n(str), "native"));
    }

    /* renamed from: j */
    public File m17800j(String str) {
        return new File(this.f18596e, str);
    }

    /* renamed from: k */
    public List m17801k() {
        return m17789t(this.f18596e.listFiles());
    }

    /* renamed from: l */
    public File m17802l(String str) {
        return new File(this.f18595d, str);
    }

    /* renamed from: m */
    public List m17803m() {
        return m17789t(this.f18595d.listFiles());
    }

    /* renamed from: o */
    public File m17804o(String str, String str2) {
        return new File(m17785n(str), str2);
    }

    /* renamed from: p */
    public List m17805p(String str, FilenameFilter filenameFilter) {
        return m17789t(m17785n(str).listFiles(filenameFilter));
    }
}
