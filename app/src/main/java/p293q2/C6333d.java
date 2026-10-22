package p293q2;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p348u2.AbstractC7025b;
import p348u2.AbstractC7030g;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public class C6333d {

    /* renamed from: a */
    private final Comparator f24677a = new Comparator() { // from class: q2.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m25112j;
            m25112j = C6333d.m25112j((File) obj, (File) obj2);
            return m25112j;
        }
    };

    /* renamed from: d */
    private void m25107d(File file) {
        File[] m27109a = AbstractC7025b.m27109a(file, new FileFilter() { // from class: q2.c
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                boolean m25110h;
                m25110h = C6333d.m25110h(file2);
                return m25110h;
            }
        }, 5000);
        if (m27109a != null && m27109a.length > 10) {
            Arrays.sort(m27109a, this.f24677a);
            for (int i10 = 10; i10 < m27109a.length; i10++) {
                try {
                    AbstractC7025b.m27110b(m27109a[i10]);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        File[] m27109a2 = AbstractC7025b.m27109a(new File(file, "log-files"), null, 5000);
        if (m27109a2 != null && m27109a2.length > 10) {
            Arrays.sort(m27109a2, this.f24677a);
            for (int i11 = 10; i11 < m27109a2.length; i11++) {
                try {
                    AbstractC7025b.m27110b(m27109a2[i11]);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    private void m25108e(File file) {
        File[] m27109a = AbstractC7025b.m27109a(file, null, 5000);
        if (m27109a != null) {
            if (m27109a.length > 10) {
                Arrays.sort(m27109a, this.f24677a);
                for (int i10 = 10; i10 < m27109a.length; i10++) {
                    try {
                        AbstractC7025b.m27110b(m27109a[i10]);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private void m25109g(final Application application) {
        AbstractC7030g.m27130d().schedule(new AbstractC7030g.f("fix_firebase_log", new Runnable() { // from class: q2.b
            @Override // java.lang.Runnable
            public final void run() {
                C6333d.this.m25111i(application);
            }
        }, false), 30L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m25110h(File file) {
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.endsWith("user.meta")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m25111i(Application application) {
        File filesDir = application.getFilesDir();
        m25108e(new File(filesDir, ".com.google.firebase.crashlytics-ndk"));
        m25107d(new File(filesDir, ".com.google.firebase.crashlytics"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ int m25112j(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* renamed from: f */
    public void m25113f(Application application) {
        m25109g(application);
    }
}
