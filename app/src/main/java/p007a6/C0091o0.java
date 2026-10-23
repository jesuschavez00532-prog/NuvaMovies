package p007a6;

import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p026b6.C1131c;
import p026b6.C1137i;
import p038c6.AbstractC1366a0;
import p038c6.C1368b0;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;
import p128f6.C4269e;
import p128f6.C4270f;
import p145g6.C4351b;
import p157h6.InterfaceC4557i;
import p174i6.InterfaceC4900d;
import p395x5.C7503f;

/* renamed from: a6.o0 */
/* loaded from: classes.dex */
public class C0091o0 {

    /* renamed from: a */
    private final C0090o f306a;

    /* renamed from: b */
    private final C4269e f307b;

    /* renamed from: c */
    private final C4351b f308c;

    /* renamed from: d */
    private final C1131c f309d;

    /* renamed from: e */
    private final C1137i f310e;

    C0091o0(C0090o c0090o, C4269e c4269e, C4351b c4351b, C1131c c1131c, C1137i c1137i) {
        this.f306a = c0090o;
        this.f307b = c4269e;
        this.f308c = c4351b;
        this.f309d = c1131c;
        this.f310e = c1137i;
    }

    /* renamed from: c */
    private AbstractC1366a0.e.d m413c(AbstractC1366a0.e.d dVar) {
        return m414d(dVar, this.f309d, this.f310e);
    }

    /* renamed from: d */
    private AbstractC1366a0.e.d m414d(AbstractC1366a0.e.d dVar, C1131c c1131c, C1137i c1137i) {
        AbstractC1366a0.e.d.b mo6293g = dVar.mo6293g();
        String m5123c = c1131c.m5123c();
        if (m5123c != null) {
            mo6293g.mo6374d(AbstractC1366a0.e.d.AbstractC7816d.m6391a().mo6394b(m5123c).mo6393a());
        } else {
            C7503f.m28716f().m28723i("No log data to include with this event.");
        }
        List m419k = m419k(c1137i.m5178e());
        List m419k2 = m419k(c1137i.m5179f());
        if (!m419k.isEmpty() || !m419k2.isEmpty()) {
            mo6293g.mo6372b(dVar.mo6288b().mo6300g().mo6303c(C1368b0.m6409c(m419k)).mo6305e(C1368b0.m6409c(m419k2)).mo6301a());
        }
        return mo6293g.mo6371a();
    }

    /* renamed from: e */
    private static AbstractC1366a0.a m415e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2 = null;
        int importance;
        String processName = null;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m416f(traceInputStream);
            }
        } catch (IOException e10) {
            C7503f m28716f = C7503f.m28716f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb2.append(applicationExitInfo2);
            sb2.append(" Error: ");
            sb2.append(e10);
            m28716f.m28725k(sb2.toString());
        }
        AbstractC1366a0.a.AbstractC7803a m6178a = AbstractC1366a0.a.m6178a();
        importance = applicationExitInfo.getImportance();
        AbstractC1366a0.a.AbstractC7803a mo6188b = m6178a.mo6188b(importance);
        processName = applicationExitInfo.getProcessName();
        AbstractC1366a0.a.AbstractC7803a mo6190d = mo6188b.mo6190d(processName);
        reason = applicationExitInfo.getReason();
        AbstractC1366a0.a.AbstractC7803a mo6192f = mo6190d.mo6192f(reason);
        timestamp = applicationExitInfo.getTimestamp();
        AbstractC1366a0.a.AbstractC7803a mo6194h = mo6192f.mo6194h(timestamp);
        pid = applicationExitInfo.getPid();
        AbstractC1366a0.a.AbstractC7803a mo6189c = mo6194h.mo6189c(pid);
        pss = applicationExitInfo.getPss();
        AbstractC1366a0.a.AbstractC7803a mo6191e = mo6189c.mo6191e(pss);
        rss = applicationExitInfo.getRss();
        return mo6191e.mo6193g(rss).mo6195i(str).mo6187a();
    }

    /* renamed from: f */
    public static String m416f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    /* renamed from: g */
    public static C0091o0 m417g(Context context, C0104w c0104w, C4270f c4270f, C0062a c0062a, C1131c c1131c, C1137i c1137i, InterfaceC4900d interfaceC4900d, InterfaceC4557i interfaceC4557i, C0065b0 c0065b0) {
        return new C0091o0(new C0090o(context, c0104w, c0062a, interfaceC4900d), new C4269e(c4270f, interfaceC4557i), C4351b.m18258b(context, interfaceC4557i, c0065b0), c1131c, c1137i);
    }

    /* renamed from: j */
    private ApplicationExitInfo m418j(String str, List list) {
        long timestamp;
        int reason;
        long m17779q = this.f307b.m17779q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m357a = AbstractC0085l0.m357a(it.next());
            timestamp = m357a.getTimestamp();
            if (timestamp >= m17779q) {
                reason = m357a.getReason();
                if (reason == 6) {
                    return m357a;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List m419k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC1366a0.c.m6205a().mo6209b((String) entry.getKey()).mo6210c((String) entry.getValue()).mo6208a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: a6.m0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m420m;
                m420m = C0091o0.m420m((AbstractC1366a0.c) obj, (AbstractC1366a0.c) obj2);
                return m420m;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ int m420m(AbstractC1366a0.c cVar, AbstractC1366a0.c cVar2) {
        return cVar.mo6206b().compareTo(cVar2.mo6206b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m421p(AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            AbstractC0092p abstractC0092p = (AbstractC0092p) abstractC4245i.mo17708j();
            C7503f.m28716f().m28717b("Crashlytics report successfully enqueued to DataTransport: " + abstractC0092p.mo224d());
            File mo223c = abstractC0092p.mo223c();
            if (mo223c.delete()) {
                C7503f.m28716f().m28717b("Deleted report file: " + mo223c.getPath());
                return true;
            }
            C7503f.m28716f().m28725k("Crashlytics could not delete report file: " + mo223c.getPath());
            return true;
        }
        C7503f.m28716f().m28726l("Crashlytics report could not be enqueued to DataTransport", abstractC4245i.mo17707i());
        return false;
    }

    /* renamed from: q */
    private void m422q(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f307b.m17782y(m413c(this.f306a.m409c(th, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    /* renamed from: h */
    public void m423h(String str, List list) {
        C7503f.m28716f().m28717b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1366a0.d.b mo240c = ((InterfaceC0107z) it.next()).mo240c();
            if (mo240c != null) {
                arrayList.add(mo240c);
            }
        }
        this.f307b.m17777l(str, AbstractC1366a0.d.m6211a().mo6215b(C1368b0.m6409c(arrayList)).mo6214a());
    }

    /* renamed from: i */
    public void m424i(long j10, String str) {
        this.f307b.m17776k(str, j10);
    }

    /* renamed from: l */
    public boolean m425l() {
        return this.f307b.m17780r();
    }

    /* renamed from: n */
    public SortedSet m426n() {
        return this.f307b.m17778p();
    }

    /* renamed from: o */
    public void m427o(String str, long j10) {
        this.f307b.m17783z(this.f306a.m410d(str, j10));
    }

    /* renamed from: r */
    public void m428r(Throwable th, Thread thread, String str, long j10) {
        C7503f.m28716f().m28723i("Persisting fatal event for session " + str);
        m422q(th, thread, str, "crash", j10, true);
    }

    /* renamed from: s */
    public void m429s(Throwable th, Thread thread, String str, long j10) {
        C7503f.m28716f().m28723i("Persisting non-fatal event for session " + str);
        m422q(th, thread, str, "error", j10, false);
    }

    /* renamed from: t */
    public void m430t(String str, List list, C1131c c1131c, C1137i c1137i) {
        ApplicationExitInfo m418j = m418j(str, list);
        if (m418j == null) {
            C7503f.m28716f().m28723i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC1366a0.e.d m408b = this.f306a.m408b(m415e(m418j));
        C7503f.m28716f().m28717b("Persisting anr for session " + str);
        this.f307b.m17782y(m414d(m408b, c1131c, c1137i), str, true);
    }

    /* renamed from: u */
    public void m431u() {
        this.f307b.m17775i();
    }

    /* renamed from: v */
    public AbstractC4245i m432v(Executor executor) {
        return m433w(executor, null);
    }

    /* renamed from: w */
    public AbstractC4245i m433w(Executor executor, String str) {
        boolean z10 = false;
        List<AbstractC0092p> m17781w = this.f307b.m17781w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC0092p abstractC0092p : m17781w) {
            if (str == null || str.equals(abstractC0092p.mo224d())) {
                C4351b c4351b = this.f308c;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(c4351b.m18261c(abstractC0092p, z10).mo17705g(executor, new InterfaceC4229a() { // from class: a6.n0
                    @Override // p127f5.InterfaceC4229a
                    /* renamed from: a */
                    public final Object mo289a(AbstractC4245i abstractC4245i) {
                        boolean m421p;
                        m421p = C0091o0.this.m421p(abstractC4245i);
                        return Boolean.valueOf(m421p);
                    }
                }));
            }
        }
        return AbstractC4250l.m17734f(arrayList);
    }
}
