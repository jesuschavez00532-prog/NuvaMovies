package p128f6;

import anet.channel.request.Request;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import p007a6.AbstractC0092p;
import p026b6.C1137i;
import p038c6.AbstractC1366a0;
import p038c6.C1368b0;
import p097d6.C3960g;
import p157h6.InterfaceC4557i;
import p395x5.C7503f;

/* renamed from: f6.e */
/* loaded from: classes.dex */
public class C4269e {

    /* renamed from: d */
    private static final Charset f18584d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: e */
    private static final int f18585e = 15;

    /* renamed from: f */
    private static final C3960g f18586f = new C3960g();

    /* renamed from: g */
    private static final Comparator f18587g = new Comparator() { // from class: f6.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m17772u;
            m17772u = C4269e.m17772u((File) obj, (File) obj2);
            return m17772u;
        }
    };

    /* renamed from: h */
    private static final FilenameFilter f18588h = new FilenameFilter() { // from class: f6.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m17773v;
            m17773v = C4269e.m17773v(file, str);
            return m17773v;
        }
    };

    /* renamed from: a */
    private final AtomicInteger f18589a = new AtomicInteger(0);

    /* renamed from: b */
    private final C4270f f18590b;

    /* renamed from: c */
    private final InterfaceC4557i f18591c;

    public C4269e(C4270f c4270f, InterfaceC4557i interfaceC4557i) {
        this.f18590b = c4270f;
        this.f18591c = interfaceC4557i;
    }

    /* renamed from: A */
    private static String m17751A(File file) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f18584d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: B */
    private void m17752B(File file, AbstractC1366a0.d dVar, String str) {
        try {
            C3960g c3960g = f18586f;
            m17756F(this.f18590b.m17797g(str), c3960g.m16810E(c3960g.m16809D(m17751A(file)).m6176m(dVar)));
        } catch (IOException e10) {
            C7503f.m28716f().m28726l("Could not synthesize final native report file for " + file, e10);
        }
    }

    /* renamed from: C */
    private void m17753C(String str, long j10) {
        boolean z10 = false;
        List<File> m17805p = this.f18590b.m17805p(str, f18588h);
        if (m17805p.isEmpty()) {
            C7503f.m28716f().m28723i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m17805p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : m17805p) {
                try {
                    arrayList.add(f18586f.m16811g(m17751A(file)));
                } catch (IOException e10) {
                    C7503f.m28716f().m28726l("Could not add event to report for " + file, e10);
                }
                if (z10 || m17770s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            C7503f.m28716f().m28725k("Could not parse event files for session " + str);
            return;
        }
        m17754D(this.f18590b.m17804o(str, AgooConstants.MESSAGE_REPORT), arrayList, j10, z10, C1137i.m5176j(str, this.f18590b));
    }

    /* renamed from: D */
    private void m17754D(File file, List list, long j10, boolean z10, String str) {
        File m17802l;
        try {
            C3960g c3960g = f18586f;
            AbstractC1366a0 m6175l = c3960g.m16809D(m17751A(file)).m6177n(j10, z10, str).m6175l(C1368b0.m6409c(list));
            AbstractC1366a0.e mo6173j = m6175l.mo6173j();
            if (mo6173j == null) {
                return;
            }
            if (z10) {
                m17802l = this.f18590b.m17800j(mo6173j.mo6230h());
            } else {
                m17802l = this.f18590b.m17802l(mo6173j.mo6230h());
            }
            m17756F(m17802l, c3960g.m16810E(m6175l));
        } catch (IOException e10) {
            C7503f.m28716f().m28726l("Could not synthesize final report file for " + file, e10);
        }
    }

    /* renamed from: E */
    private int m17755E(String str, int i10) {
        List m17805p = this.f18590b.m17805p(str, new FilenameFilter() { // from class: f6.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m17771t;
                m17771t = C4269e.m17771t(file, str2);
                return m17771t;
            }
        });
        Collections.sort(m17805p, new Comparator() { // from class: f6.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m17774x;
                m17774x = C4269e.m17774x((File) obj, (File) obj2);
                return m17774x;
            }
        });
        return m17763f(m17805p, i10);
    }

    /* renamed from: F */
    private static void m17756F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18584d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: G */
    private static void m17757G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18584d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m17765h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: e */
    private SortedSet m17762e(String str) {
        this.f18590b.m17792b();
        SortedSet m17778p = m17778p();
        if (str != null) {
            m17778p.remove(str);
        }
        if (m17778p.size() <= 8) {
            return m17778p;
        }
        while (m17778p.size() > 8) {
            String str2 = (String) m17778p.last();
            C7503f.m28716f().m28717b("Removing session over cap: " + str2);
            this.f18590b.m17793c(str2);
            m17778p.remove(str2);
        }
        return m17778p;
    }

    /* renamed from: f */
    private static int m17763f(List list, int i10) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i10) {
                return size;
            }
            C4270f.m17788s(file);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m17764g() {
        int i10 = this.f18591c.mo18974b().f19600a.f19611b;
        List m17768n = m17768n();
        int size = m17768n.size();
        if (size <= i10) {
            return;
        }
        Iterator it = m17768n.subList(i10, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: h */
    private static long m17765h(long j10) {
        return j10 * 1000;
    }

    /* renamed from: j */
    private void m17766j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: m */
    private static String m17767m(int i10, boolean z10) {
        String str = null;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i10));
        if (z10) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    /* renamed from: n */
    private List m17768n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18590b.m17801k());
        arrayList.addAll(this.f18590b.m17798h());
        Comparator comparator = f18587g;
        Collections.sort(arrayList, comparator);
        List m17803m = this.f18590b.m17803m();
        Collections.sort(m17803m, comparator);
        arrayList.addAll(m17803m);
        return arrayList;
    }

    /* renamed from: o */
    private static String m17769o(String str) {
        return str.substring(0, f18585e);
    }

    /* renamed from: s */
    private static boolean m17770s(String str) {
        if (str.startsWith("event") && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m17771t(File file, String str) {
        if (str.startsWith("event") && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m17772u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ boolean m17773v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m17774x(File file, File file2) {
        return m17769o(file.getName()).compareTo(m17769o(file2.getName()));
    }

    /* renamed from: i */
    public void m17775i() {
        m17766j(this.f18590b.m17803m());
        m17766j(this.f18590b.m17801k());
        m17766j(this.f18590b.m17798h());
    }

    /* renamed from: k */
    public void m17776k(String str, long j10) {
        for (String str2 : m17762e(str)) {
            C7503f.m28716f().m28723i("Finalizing report for session " + str2);
            m17753C(str2, j10);
            this.f18590b.m17793c(str2);
        }
        m17764g();
    }

    /* renamed from: l */
    public void m17777l(String str, AbstractC1366a0.d dVar) {
        File m17804o = this.f18590b.m17804o(str, AgooConstants.MESSAGE_REPORT);
        C7503f.m28716f().m28717b("Writing native session report for " + str + " to file: " + m17804o);
        m17752B(m17804o, dVar, str);
    }

    /* renamed from: p */
    public SortedSet m17778p() {
        return new TreeSet(this.f18590b.m17794d()).descendingSet();
    }

    /* renamed from: q */
    public long m17779q(String str) {
        return this.f18590b.m17804o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m17780r() {
        if (this.f18590b.m17803m().isEmpty() && this.f18590b.m17801k().isEmpty() && this.f18590b.m17798h().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public List m17781w() {
        List<File> m17768n = m17768n();
        ArrayList arrayList = new ArrayList();
        for (File file : m17768n) {
            try {
                arrayList.add(AbstractC0092p.m434a(f18586f.m16809D(m17751A(file)), file.getName(), file));
            } catch (IOException e10) {
                C7503f.m28716f().m28726l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m17782y(AbstractC1366a0.e.d dVar, String str, boolean z10) {
        int i10 = this.f18591c.mo18974b().f19600a.f19610a;
        try {
            m17756F(this.f18590b.m17804o(str, m17767m(this.f18589a.getAndIncrement(), z10)), f18586f.m16812h(dVar));
        } catch (IOException e10) {
            C7503f.m28716f().m28726l("Could not persist event for session " + str, e10);
        }
        m17755E(str, i10);
    }

    /* renamed from: z */
    public void m17783z(AbstractC1366a0 abstractC1366a0) {
        AbstractC1366a0.e mo6173j = abstractC1366a0.mo6173j();
        if (mo6173j == null) {
            C7503f.m28716f().m28717b("Could not get session for report");
            return;
        }
        String mo6230h = mo6173j.mo6230h();
        try {
            m17756F(this.f18590b.m17804o(mo6230h, AgooConstants.MESSAGE_REPORT), f18586f.m16810E(abstractC1366a0));
            m17757G(this.f18590b.m17804o(mo6230h, "start-time"), "", mo6173j.mo6233k());
        } catch (IOException e10) {
            C7503f.m28716f().m28718c("Could not persist report for session " + mo6230h, e10);
        }
    }
}
