package p140g1;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C4334b implements Closeable {

    /* renamed from: a */
    private final File f18842a;

    /* renamed from: b */
    private final File f18843b;

    /* renamed from: c */
    private final File f18844c;

    /* renamed from: d */
    private final File f18845d;

    /* renamed from: e */
    private final int f18846e;

    /* renamed from: f */
    private long f18847f;

    /* renamed from: g */
    private final int f18848g;

    /* renamed from: i */
    private Writer f18850i;

    /* renamed from: k */
    private int f18852k;

    /* renamed from: h */
    private long f18849h = 0;

    /* renamed from: j */
    private final LinkedHashMap f18851j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    private long f18853l = 0;

    /* renamed from: m */
    final ThreadPoolExecutor f18854m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n */
    private final Callable f18855n = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1.b$a */
    /* loaded from: classes.dex */
    public class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C4334b.this) {
                if (C4334b.this.f18850i != null) {
                    C4334b.this.m18158I();
                    if (C4334b.this.m18151A()) {
                        C4334b.this.m18156F();
                        C4334b.this.f18852k = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: g1.b$b */
    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread = null;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: g1.b$c */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        private final d f18857a;

        /* renamed from: b */
        private final boolean[] f18858b;

        /* renamed from: c */
        private boolean f18859c;

        /* synthetic */ c(C4334b c4334b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m18180a() {
            C4334b.this.m18169q(this, false);
        }

        /* renamed from: b */
        public void m18181b() {
            if (!this.f18859c) {
                try {
                    m18180a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void m18182e() {
            C4334b.this.m18169q(this, true);
            this.f18859c = true;
        }

        /* renamed from: f */
        public File m18183f(int i10) {
            File m18196k;
            synchronized (C4334b.this) {
                if (this.f18857a.f18866f == this) {
                    if (!this.f18857a.f18865e) {
                        this.f18858b[i10] = true;
                    }
                    m18196k = this.f18857a.m18196k(i10);
                    C4334b.this.f18842a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return m18196k;
        }

        private c(d dVar) {
            this.f18857a = dVar;
            this.f18858b = dVar.f18865e ? null : new boolean[C4334b.this.f18848g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.b$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private final String f18861a;

        /* renamed from: b */
        private final long[] f18862b;

        /* renamed from: c */
        File[] f18863c;

        /* renamed from: d */
        File[] f18864d;

        /* renamed from: e */
        private boolean f18865e;

        /* renamed from: f */
        private c f18866f;

        /* renamed from: g */
        private long f18867g;

        /* synthetic */ d(C4334b c4334b, String str, a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m18193m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m18194n(String[] strArr) {
            if (strArr.length == C4334b.this.f18848g) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f18862b[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw m18193m(strArr);
                    }
                }
                return;
            }
            throw m18193m(strArr);
        }

        /* renamed from: j */
        public File m18195j(int i10) {
            return this.f18863c[i10];
        }

        /* renamed from: k */
        public File m18196k(int i10) {
            return this.f18864d[i10];
        }

        /* renamed from: l */
        public String m18197l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f18862b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f18861a = str;
            this.f18862b = new long[C4334b.this.f18848g];
            this.f18863c = new File[C4334b.this.f18848g];
            this.f18864d = new File[C4334b.this.f18848g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C4334b.this.f18848g; i10++) {
                sb2.append(i10);
                this.f18863c[i10] = new File(C4334b.this.f18842a, sb2.toString());
                sb2.append(".tmp");
                this.f18864d[i10] = new File(C4334b.this.f18842a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* renamed from: g1.b$e */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a */
        private final String f18869a;

        /* renamed from: b */
        private final long f18870b;

        /* renamed from: c */
        private final long[] f18871c;

        /* renamed from: d */
        private final File[] f18872d;

        /* synthetic */ e(C4334b c4334b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m18198a(int i10) {
            return this.f18872d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f18869a = str;
            this.f18870b = j10;
            this.f18872d = fileArr;
            this.f18871c = jArr;
        }
    }

    private C4334b(File file, int i10, int i11, long j10) {
        this.f18842a = file;
        this.f18846e = i10;
        this.f18843b = new File(file, "journal");
        this.f18844c = new File(file, "journal.tmp");
        this.f18845d = new File(file, "journal.bkp");
        this.f18848g = i11;
        this.f18847f = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public boolean m18151A() {
        int i10 = this.f18852k;
        if (i10 >= 2000 && i10 >= this.f18851j.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static C4334b m18152B(File file, int i10, int i11, long j10) {
        if (j10 > 0) {
            if (i11 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m18157H(file2, file3, false);
                    }
                }
                C4334b c4334b = new C4334b(file, i10, i11, j10);
                if (c4334b.f18843b.exists()) {
                    try {
                        c4334b.m18154D();
                        c4334b.m18153C();
                        return c4334b;
                    } catch (IOException e10) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                        c4334b.m18174r();
                    }
                }
                file.mkdirs();
                C4334b c4334b2 = new C4334b(file, i10, i11, j10);
                c4334b2.m18156F();
                return c4334b2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: C */
    private void m18153C() {
        m18170s(this.f18844c);
        Iterator it = this.f18851j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f18866f != null) {
                dVar.f18866f = null;
                while (i10 < this.f18848g) {
                    m18170s(dVar.m18195j(i10));
                    m18170s(dVar.m18196k(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f18848g) {
                    this.f18849h += dVar.f18862b[i10];
                    i10++;
                }
            }
        }
    }

    /* renamed from: D */
    private void m18154D() {
        C4335c c4335c = new C4335c(new FileInputStream(this.f18843b), AbstractC4336d.f18880a);
        try {
            String m18202d = c4335c.m18202d();
            String m18202d2 = c4335c.m18202d();
            String m18202d3 = c4335c.m18202d();
            String m18202d4 = c4335c.m18202d();
            String m18202d5 = c4335c.m18202d();
            if ("libcore.io.DiskLruCache".equals(m18202d) && "1".equals(m18202d2) && Integer.toString(this.f18846e).equals(m18202d3) && Integer.toString(this.f18848g).equals(m18202d4) && "".equals(m18202d5)) {
                int i10 = 0;
                while (true) {
                    try {
                        m18155E(c4335c.m18202d());
                        i10++;
                    } catch (EOFException unused) {
                        this.f18852k = i10 - this.f18851j.size();
                        if (c4335c.m18201c()) {
                            m18156F();
                        } else {
                            this.f18850i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18843b, true), AbstractC4336d.f18880a));
                        }
                        AbstractC4336d.m18203a(c4335c);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m18202d + ", " + m18202d2 + ", " + m18202d4 + ", " + m18202d5 + "]");
            }
        } catch (Throwable th) {
            AbstractC4336d.m18203a(c4335c);
            throw th;
        }
    }

    /* renamed from: E */
    private void m18155E(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f18851j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = (d) this.f18851j.get(substring);
            a aVar = null;
            if (dVar == null) {
                dVar = new d(this, substring, aVar);
                this.f18851j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f18865e = true;
                dVar.f18866f = null;
                dVar.m18194n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f18866f = new c(this, dVar, aVar);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public synchronized void m18156F() {
        Writer writer = this.f18850i;
        if (writer != null) {
            m18168n(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18844c), AbstractC4336d.f18880a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f18846e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f18848g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f18851j.values()) {
                if (dVar.f18866f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f18861a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f18861a + dVar.m18197l() + '\n');
                }
            }
            m18168n(bufferedWriter);
            if (this.f18843b.exists()) {
                m18157H(this.f18843b, this.f18845d, true);
            }
            m18157H(this.f18844c, this.f18843b, false);
            this.f18845d.delete();
            this.f18850i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18843b, true), AbstractC4336d.f18880a));
        } catch (Throwable th) {
            m18168n(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: H */
    private static void m18157H(File file, File file2, boolean z10) {
        if (z10) {
            m18170s(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m18158I() {
        while (this.f18849h > this.f18847f) {
            m18173G((String) ((Map.Entry) this.f18851j.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: m */
    private void m18167m() {
        if (this.f18850i != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: n */
    private static void m18168n(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public synchronized void m18169q(c cVar, boolean z10) {
        d dVar = cVar.f18857a;
        if (dVar.f18866f == cVar) {
            if (z10 && !dVar.f18865e) {
                for (int i10 = 0; i10 < this.f18848g; i10++) {
                    if (cVar.f18858b[i10]) {
                        if (!dVar.m18196k(i10).exists()) {
                            cVar.m18180a();
                            return;
                        }
                    } else {
                        cVar.m18180a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f18848g; i11++) {
                File m18196k = dVar.m18196k(i11);
                if (z10) {
                    if (m18196k.exists()) {
                        File m18195j = dVar.m18195j(i11);
                        m18196k.renameTo(m18195j);
                        long j10 = dVar.f18862b[i11];
                        long length = m18195j.length();
                        dVar.f18862b[i11] = length;
                        this.f18849h = (this.f18849h - j10) + length;
                    }
                } else {
                    m18170s(m18196k);
                }
            }
            this.f18852k++;
            dVar.f18866f = null;
            if (dVar.f18865e | z10) {
                dVar.f18865e = true;
                this.f18850i.append((CharSequence) "CLEAN");
                this.f18850i.append(' ');
                this.f18850i.append((CharSequence) dVar.f18861a);
                this.f18850i.append((CharSequence) dVar.m18197l());
                this.f18850i.append('\n');
                if (z10) {
                    long j11 = this.f18853l;
                    this.f18853l = 1 + j11;
                    dVar.f18867g = j11;
                }
            } else {
                this.f18851j.remove(dVar.f18861a);
                this.f18850i.append((CharSequence) "REMOVE");
                this.f18850i.append(' ');
                this.f18850i.append((CharSequence) dVar.f18861a);
                this.f18850i.append('\n');
            }
            m18172y(this.f18850i);
            if (this.f18849h > this.f18847f || m18151A()) {
                this.f18854m.submit(this.f18855n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: s */
    private static void m18170s(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: x */
    private synchronized c m18171x(String str, long j10) {
        m18167m();
        d dVar = (d) this.f18851j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f18867g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f18851j.put(str, dVar);
        } else if (dVar.f18866f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f18866f = cVar;
        this.f18850i.append((CharSequence) "DIRTY");
        this.f18850i.append(' ');
        this.f18850i.append((CharSequence) str);
        this.f18850i.append('\n');
        m18172y(this.f18850i);
        return cVar;
    }

    /* renamed from: y */
    private static void m18172y(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: G */
    public synchronized boolean m18173G(String str) {
        m18167m();
        d dVar = (d) this.f18851j.get(str);
        if (dVar != null && dVar.f18866f == null) {
            for (int i10 = 0; i10 < this.f18848g; i10++) {
                File m18195j = dVar.m18195j(i10);
                if (m18195j.exists() && !m18195j.delete()) {
                    throw new IOException("failed to delete " + m18195j);
                }
                this.f18849h -= dVar.f18862b[i10];
                dVar.f18862b[i10] = 0;
            }
            this.f18852k++;
            this.f18850i.append((CharSequence) "REMOVE");
            this.f18850i.append(' ');
            this.f18850i.append((CharSequence) str);
            this.f18850i.append('\n');
            this.f18851j.remove(str);
            if (m18151A()) {
                this.f18854m.submit(this.f18855n);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f18850i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f18851j.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f18866f != null) {
                dVar.f18866f.m18180a();
            }
        }
        m18158I();
        m18168n(this.f18850i);
        this.f18850i = null;
    }

    /* renamed from: r */
    public void m18174r() {
        close();
        AbstractC4336d.m18204b(this.f18842a);
    }

    /* renamed from: t */
    public c m18175t(String str) {
        return m18171x(str, -1L);
    }

    /* renamed from: z */
    public synchronized e m18176z(String str) {
        m18167m();
        d dVar = (d) this.f18851j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f18865e) {
            return null;
        }
        for (File file : dVar.f18863c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f18852k++;
        this.f18850i.append((CharSequence) "READ");
        this.f18850i.append(' ');
        this.f18850i.append((CharSequence) str);
        this.f18850i.append('\n');
        if (m18151A()) {
            this.f18854m.submit(this.f18855n);
        }
        return new e(this, str, dVar.f18867g, dVar.f18863c, dVar.f18862b, null);
    }
}
