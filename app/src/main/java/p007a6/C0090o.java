package p007a6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.p077uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.message.MessageService;
import p038c6.AbstractC1366a0;
import p038c6.C1368b0;
import p174i6.C4901e;
import p174i6.InterfaceC4900d;

/* renamed from: a6.o */
/* loaded from: classes.dex */
public class C0090o {

    /* renamed from: e */
    private static final Map f300e;

    /* renamed from: f */
    static final String f301f;

    /* renamed from: a */
    private final Context f302a;

    /* renamed from: b */
    private final C0104w f303b;

    /* renamed from: c */
    private final C0062a f304c;

    /* renamed from: d */
    private final InterfaceC4900d f305d;

    static {
        HashMap hashMap = new HashMap();
        f300e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f301f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.13");
    }

    public C0090o(Context context, C0104w c0104w, C0062a c0062a, InterfaceC4900d interfaceC4900d) {
        this.f302a = context;
        this.f303b = c0104w;
        this.f304c = c0062a;
        this.f305d = interfaceC4900d;
    }

    /* renamed from: a */
    private AbstractC1366a0.b m387a() {
        return AbstractC1366a0.m6165b().mo6203h("18.2.13").mo6199d(this.f304c.f184a).mo6200e(this.f303b.mo474a()).mo6197b(this.f304c.f188e).mo6198c(this.f304c.f189f).mo6202g(4);
    }

    /* renamed from: e */
    private static int m388e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f300e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: f */
    private AbstractC1366a0.e.d.a.b.AbstractC7806a m389f() {
        return AbstractC1366a0.e.d.a.b.AbstractC7806a.m6313a().mo6320b(0L).mo6322d(0L).mo6321c(this.f304c.f187d).mo6323e(this.f304c.f185b).mo6319a();
    }

    /* renamed from: g */
    private C1368b0 m390g() {
        return C1368b0.m6410g(m389f());
    }

    /* renamed from: h */
    private AbstractC1366a0.e.d.a m391h(int i10, AbstractC1366a0.a aVar) {
        boolean z10 = false;
        if (aVar.mo6179b() != 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        return AbstractC1366a0.e.d.a.m6294a().mo6302b(Boolean.valueOf(z10)).mo6306f(i10).mo6304d(m396m(aVar)).mo6301a();
    }

    /* renamed from: i */
    private AbstractC1366a0.e.d.a m392i(int i10, C4901e c4901e, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        boolean z11 = false;
        ActivityManager.RunningAppProcessInfo m260j = AbstractC0074g.m260j(this.f304c.f187d, this.f302a);
        if (m260j != null) {
            if (m260j.importance != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        } else {
            bool = null;
        }
        return AbstractC1366a0.e.d.a.m6294a().mo6302b(bool).mo6306f(i10).mo6304d(m397n(c4901e, thread, i11, i12, z10)).mo6301a();
    }

    /* renamed from: j */
    private AbstractC1366a0.e.d.c m393j(int i10) {
        Double d10;
        C0068d m230a = C0068d.m230a(this.f302a);
        Float m233b = m230a.m233b();
        if (m233b != null) {
            d10 = Double.valueOf(m233b.doubleValue());
        } else {
            d10 = null;
        }
        int m234c = m230a.m234c();
        boolean m265o = AbstractC0074g.m265o(this.f302a);
        long m269s = AbstractC0074g.m269s() - AbstractC0074g.m251a(this.f302a);
        return AbstractC1366a0.e.d.c.m6377a().mo6385b(d10).mo6386c(m234c).mo6389f(m265o).mo6388e(i10).mo6390g(m269s).mo6387d(AbstractC0074g.m252b(Environment.getDataDirectory().getPath())).mo6384a();
    }

    /* renamed from: k */
    private AbstractC1366a0.e.d.a.b.c m394k(C4901e c4901e, int i10, int i11) {
        return m395l(c4901e, i10, i11, 0);
    }

    /* renamed from: l */
    private AbstractC1366a0.e.d.a.b.c m395l(C4901e c4901e, int i10, int i11, int i12) {
        String str = c4901e.f20411b;
        String str2 = c4901e.f20410a;
        StackTraceElement[] stackTraceElementArr = c4901e.f20412c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4901e c4901e2 = c4901e.f20413d;
        if (i12 >= i11) {
            C4901e c4901e3 = c4901e2;
            while (c4901e3 != null) {
                c4901e3 = c4901e3.f20413d;
                i13++;
            }
        }
        AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6340d = AbstractC1366a0.e.d.a.b.c.m6331a().mo6342f(str).mo6341e(str2).mo6339c(C1368b0.m6409c(m399p(stackTraceElementArr, i10))).mo6340d(i13);
        if (c4901e2 != null && i13 == 0) {
            mo6340d.mo6338b(m395l(c4901e2, i10, i11, i12 + 1));
        }
        return mo6340d.mo6337a();
    }

    /* renamed from: m */
    private AbstractC1366a0.e.d.a.b m396m(AbstractC1366a0.a aVar) {
        return AbstractC1366a0.e.d.a.b.m6307a().mo6326b(aVar).mo6329e(m404u()).mo6327c(m390g()).mo6325a();
    }

    /* renamed from: n */
    private AbstractC1366a0.e.d.a.b m397n(C4901e c4901e, Thread thread, int i10, int i11, boolean z10) {
        return AbstractC1366a0.e.d.a.b.m6307a().mo6330f(m407x(c4901e, thread, i10, z10)).mo6328d(m394k(c4901e, i10, i11)).mo6329e(m404u()).mo6327c(m390g()).mo6325a();
    }

    /* renamed from: o */
    private AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b m398o(StackTraceElement stackTraceElement, AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a abstractC7815a) {
        long j10;
        long j11 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j10 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j11 = stackTraceElement.getLineNumber();
        }
        return abstractC7815a.mo6369e(j10).mo6370f(str).mo6366b(fileName).mo6368d(j11).mo6365a();
    }

    /* renamed from: p */
    private C1368b0 m399p(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m398o(stackTraceElement, AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.m6359a().mo6367c(i10)));
        }
        return C1368b0.m6409c(arrayList);
    }

    /* renamed from: q */
    private AbstractC1366a0.e.a m400q() {
        return AbstractC1366a0.e.a.m6239a().mo6251e(this.f303b.m475f()).mo6253g(this.f304c.f188e).mo6250d(this.f304c.f189f).mo6252f(this.f303b.mo474a()).mo6248b(this.f304c.f190g.m28711d()).mo6249c(this.f304c.f190g.m28712e()).mo6247a();
    }

    /* renamed from: r */
    private AbstractC1366a0.e m401r(String str, long j10) {
        return AbstractC1366a0.e.m6223a().mo6265l(j10).mo6262i(str).mo6260g(f301f).mo6255b(m400q()).mo6264k(m403t()).mo6257d(m402s()).mo6261h(3).mo6254a();
    }

    /* renamed from: s */
    private AbstractC1366a0.e.c m402s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m388e = m388e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m269s = AbstractC0074g.m269s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m275y = AbstractC0074g.m275y();
        int m263m = AbstractC0074g.m263m();
        return AbstractC1366a0.e.c.m6267a().mo6278b(m388e).mo6282f(Build.MODEL).mo6279c(availableProcessors).mo6284h(m269s).mo6280d(blockCount).mo6285i(m275y).mo6286j(m263m).mo6281e(Build.MANUFACTURER).mo6283g(Build.PRODUCT).mo6277a();
    }

    /* renamed from: t */
    private AbstractC1366a0.e.AbstractC7817e m403t() {
        return AbstractC1366a0.e.AbstractC7817e.m6395a().mo6403d(3).mo6404e(Build.VERSION.RELEASE).mo6401b(Build.VERSION.CODENAME).mo6402c(AbstractC0074g.m276z()).mo6400a();
    }

    /* renamed from: u */
    private AbstractC1366a0.e.d.a.b.AbstractC7810d m404u() {
        return AbstractC1366a0.e.d.a.b.AbstractC7810d.m6343a().mo6350d(MessageService.MSG_DB_READY_REPORT).mo6349c(MessageService.MSG_DB_READY_REPORT).mo6348b(0L).mo6347a();
    }

    /* renamed from: v */
    private AbstractC1366a0.e.d.a.b.AbstractC7812e m405v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m406w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private AbstractC1366a0.e.d.a.b.AbstractC7812e m406w(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return AbstractC1366a0.e.d.a.b.AbstractC7812e.m6351a().mo6358d(thread.getName()).mo6357c(i10).mo6356b(C1368b0.m6409c(m399p(stackTraceElementArr, i10))).mo6355a();
    }

    /* renamed from: x */
    private C1368b0 m407x(C4901e c4901e, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m406w(thread, c4901e.f20412c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m405v(key, this.f305d.mo20099a(entry.getValue())));
                }
            }
        }
        return C1368b0.m6409c(arrayList);
    }

    /* renamed from: b */
    public AbstractC1366a0.e.d m408b(AbstractC1366a0.a aVar) {
        int i10 = this.f302a.getResources().getConfiguration().orientation;
        return AbstractC1366a0.e.d.m6287a().mo6376f(LogType.ANR_TYPE).mo6375e(aVar.mo6185h()).mo6372b(m391h(i10, aVar)).mo6373c(m393j(i10)).mo6371a();
    }

    /* renamed from: c */
    public AbstractC1366a0.e.d m409c(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f302a.getResources().getConfiguration().orientation;
        return AbstractC1366a0.e.d.m6287a().mo6376f(str).mo6375e(j10).mo6372b(m392i(i12, new C4901e(th, this.f305d), thread, i10, i11, z10)).mo6373c(m393j(i12)).mo6371a();
    }

    /* renamed from: d */
    public AbstractC1366a0 m410d(String str, long j10) {
        return m387a().mo6204i(m401r(str, j10)).mo6196a();
    }
}
