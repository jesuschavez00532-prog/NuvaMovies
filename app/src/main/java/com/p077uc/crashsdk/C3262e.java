package com.p077uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import anet.channel.entity.EventType;
import anet.channel.request.Request;
import anet.channel.util.HttpConstant;
import com.lzy.okgo.model.Progress;
import com.p077uc.crashsdk.export.LogType;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3252b;
import com.p077uc.crashsdk.p078a.C3253c;
import com.p077uc.crashsdk.p078a.C3254d;
import com.p077uc.crashsdk.p078a.C3256f;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.C3258h;
import com.p077uc.crashsdk.p078a.RunnableC3255e;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3384f;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.uc.crashsdk.e */
/* loaded from: classes3.dex */
public class C3262e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    static final /* synthetic */ boolean f13799a = true;

    /* renamed from: b */
    private static long f13807b;

    /* renamed from: i */
    private static String f13813i;

    /* renamed from: e */
    private final List<FileInputStream> f13831e = new ArrayList();

    /* renamed from: c */
    private static final AtomicBoolean f13808c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f13809d = false;

    /* renamed from: f */
    private static long f13810f = 0;

    /* renamed from: g */
    private static long f13811g = -1;

    /* renamed from: h */
    private static boolean f13812h = true;

    /* renamed from: j */
    private static String f13814j = "";

    /* renamed from: k */
    private static String f13815k = null;

    /* renamed from: l */
    private static String f13816l = null;

    /* renamed from: m */
    private static String f13817m = null;

    /* renamed from: n */
    private static final Object f13818n = new Object();

    /* renamed from: o */
    private static final ConditionVariable f13819o = new ConditionVariable();

    /* renamed from: p */
    private static final Object f13820p = new Object();

    /* renamed from: q */
    private static final Object f13821q = new Object();

    /* renamed from: r */
    private static final Object f13822r = new Object();

    /* renamed from: s */
    private static final ArrayList<String> f13823s = new ArrayList<>();

    /* renamed from: t */
    private static int f13824t = 0;

    /* renamed from: u */
    private static String f13825u = null;

    /* renamed from: v */
    private static boolean f13826v = false;

    /* renamed from: w */
    private static String f13827w = null;

    /* renamed from: x */
    private static String f13828x = null;

    /* renamed from: y */
    private static final Object f13829y = new Object();

    /* renamed from: z */
    private static final Object f13830z = new Object();

    /* renamed from: A */
    private static Map<String, Integer> f13773A = null;

    /* renamed from: B */
    private static String f13774B = null;

    /* renamed from: C */
    private static int f13775C = -1;

    /* renamed from: D */
    private static int f13776D = -1;

    /* renamed from: E */
    private static int f13777E = -1;

    /* renamed from: F */
    private static int f13778F = -1;

    /* renamed from: G */
    private static int f13779G = -1;

    /* renamed from: H */
    private static int f13780H = -1;

    /* renamed from: I */
    private static int f13781I = -1;

    /* renamed from: J */
    private static String f13782J = Operator.Operation.EMPTY_PARAM;

    /* renamed from: K */
    private static boolean f13783K = false;

    /* renamed from: L */
    private static boolean f13784L = false;

    /* renamed from: M */
    private static int f13785M = 0;

    /* renamed from: N */
    private static int f13786N = 0;

    /* renamed from: O */
    private static boolean f13787O = false;

    /* renamed from: P */
    private static RunnableC3255e f13788P = new RunnableC3255e(405);

    /* renamed from: Q */
    private static c f13789Q = new c(0);

    /* renamed from: R */
    private static boolean f13790R = false;

    /* renamed from: S */
    private static final RunnableC3255e f13791S = new RunnableC3255e(412);

    /* renamed from: T */
    private static Thread.UncaughtExceptionHandler f13792T = null;

    /* renamed from: U */
    private static Throwable f13793U = null;

    /* renamed from: V */
    private static boolean f13794V = false;

    /* renamed from: W */
    private static boolean f13795W = false;

    /* renamed from: X */
    private static Runnable f13796X = null;

    /* renamed from: Y */
    private static final Object f13797Y = new Object();

    /* renamed from: Z */
    private static int f13798Z = 101;

    /* renamed from: aa */
    private static Runnable f13800aa = new RunnableC3255e(407);

    /* renamed from: ab */
    private static final Object f13801ab = new Object();

    /* renamed from: ac */
    private static volatile boolean f13802ac = false;

    /* renamed from: ad */
    private static Object f13803ad = new Object();

    /* renamed from: ae */
    private static ParcelFileDescriptor f13804ae = null;

    /* renamed from: af */
    private static boolean f13805af = false;

    /* renamed from: ag */
    private static boolean f13806ag = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uc.crashsdk.e$b */
    /* loaded from: classes3.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        /* synthetic */ b(byte b10) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            if (file3.lastModified() < file4.lastModified()) {
                return -1;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uc.crashsdk.e$c */
    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                int unused = C3262e.f13775C = intent.getIntExtra("level", -1);
                int unused2 = C3262e.f13776D = intent.getIntExtra("scale", -1);
                int unused3 = C3262e.f13777E = intent.getIntExtra("voltage", -1);
                int unused4 = C3262e.f13778F = intent.getIntExtra("health", -1);
                int unused5 = C3262e.f13779G = intent.getIntExtra("plugged", -1);
                int unused6 = C3262e.f13780H = intent.getIntExtra(Progress.STATUS, -1);
                int unused7 = C3262e.f13781I = intent.getIntExtra("temperature", -1);
                String unused8 = C3262e.f13782J = intent.getStringExtra("technology");
                if (C3262e.m13390J() >= 2) {
                    C3262e.m13391K();
                    C3262e.m13392L();
                    return;
                }
                return;
            }
            if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                boolean unused9 = C3262e.f13783K = "android.intent.action.BATTERY_LOW".equals(action);
                C3262e.m13391K();
            } else if ("android.intent.action.ANR".equals(action)) {
                try {
                    C3262e.m13463d(context);
                } catch (Throwable th) {
                    C3257g.m13220a(th);
                }
            }
        }

        /* synthetic */ c(byte b10) {
            this();
        }
    }

    public C3262e() {
        try {
            m13393M();
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* renamed from: A */
    public static void m13381A() {
        if (!C3264g.m13613r()) {
            return;
        }
        C3256f.m13207a(0, new RunnableC3255e(403), 10000L);
    }

    /* renamed from: B */
    public static void m13382B() {
        if (f13802ac || C3259b.m13307L()) {
            return;
        }
        C3256f.m13207a(1, new RunnableC3255e(408), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m13383C() {
        C3256f.m13207a(1, new RunnableC3255e(409), 7000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
    
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r0 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        r4 = false;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13384D() {
        /*
            int r0 = com.p077uc.crashsdk.C3264g.m13569O()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r4) goto L43
        L11:
            r4 = 0
            goto L43
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 < r6) goto L43
            r6 = 25
            if (r5 > r6) goto L43
            if (r0 != 0) goto L21
            r5 = 0
            goto L22
        L21:
            r5 = 1
        L22:
            r6 = 0
            if (r0 != r2) goto L34
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r0 != r1) goto L42
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L11
            goto L43
        L42:
            r4 = r5
        L43:
            if (r4 != 0) goto L4c
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.p077uc.crashsdk.p078a.C3251a.m13168a(r0, r1)
        L4c:
            boolean r0 = com.p077uc.crashsdk.C3259b.m13307L()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L68
            if (r4 == 0) goto L68
            com.uc.crashsdk.a.e r1 = new com.uc.crashsdk.a.e
            r2 = 413(0x19d, float:5.79E-43)
            r1.<init>(r2)
            r2 = 2
            com.p077uc.crashsdk.p078a.C3256f.m13206a(r2, r1)
            goto L69
        L68:
            r3 = r4
        L69:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.p077uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L76
            r0 = 8
            com.p077uc.crashsdk.JNIBridge.cmd(r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13384D():void");
    }

    /* renamed from: E */
    public static ParcelFileDescriptor m13385E() {
        if (!C3259b.f13741d) {
            C3251a.m13173d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        synchronized (f13803ad) {
            ParcelFileDescriptor parcelFileDescriptor = f13804ae;
            if (parcelFileDescriptor != null) {
                return parcelFileDescriptor;
            }
            int cmd = (int) JNIBridge.cmd(14);
            if (cmd == -1) {
                return null;
            }
            ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(cmd);
            f13804ae = adoptFd;
            f13805af = true;
            return adoptFd;
        }
    }

    /* renamed from: F */
    public static boolean m13386F() {
        return f13806ag;
    }

    /* renamed from: G */
    public static void m13387G() {
        String m13579Y = C3264g.m13579Y();
        File file = new File(m13579Y);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                C3251a.m13170b("Ucebu can not list folder: " + m13579Y);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    m13436a(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    static /* synthetic */ boolean m13389I() {
        return m13395O();
    }

    /* renamed from: J */
    static /* synthetic */ int m13390J() {
        int i10 = f13785M + 1;
        f13785M = i10;
        return i10;
    }

    /* renamed from: K */
    static /* synthetic */ void m13391K() {
        StringBuilder m13405Y;
        if (C3259b.f13741d && (m13405Y = m13405Y()) != null) {
            JNIBridge.set(125, m13405Y.toString());
        }
        f13784L = true;
        m13406Z();
    }

    /* renamed from: L */
    static /* synthetic */ int m13392L() {
        f13785M = 0;
        return 0;
    }

    /* renamed from: M */
    private void m13393M() {
        int m13564J = C3264g.m13564J();
        for (int i10 = 0; i10 < m13564J; i10++) {
            try {
                this.f13831e.add(new FileInputStream("/dev/null"));
            } catch (Exception e10) {
                C3257g.m13220a(e10);
                return;
            }
        }
    }

    /* renamed from: N */
    private void m13394N() {
        Iterator<FileInputStream> it = this.f13831e.iterator();
        while (it.hasNext()) {
            C3257g.m13218a(it.next());
        }
        this.f13831e.clear();
    }

    /* renamed from: O */
    private static boolean m13395O() {
        if (C3264g.m13571Q()) {
            return true;
        }
        return m13429a();
    }

    /* renamed from: P */
    private static String m13396P() {
        return C3264g.m13600e() + "_";
    }

    /* renamed from: Q */
    private static String m13397Q() {
        if (C3259b.m13297B()) {
            return "fg";
        }
        return "bg";
    }

    /* renamed from: R */
    private static byte[] m13398R() {
        byte[] bArr = null;
        int i10 = EventType.AUTH_FAIL;
        while (bArr == null && i10 > 0) {
            try {
                bArr = new byte[i10];
            } catch (Throwable unused) {
                i10 /= 2;
                if (i10 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    /* renamed from: S */
    private static String m13399S() {
        if (C3259b.m13301F() && !f13809d) {
            return "ucebujava";
        }
        return LogType.JAVA_TYPE;
    }

    /* renamed from: T */
    private static void m13400T() {
        String str;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String str2 = Operator.Operation.MINUS;
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
            str = Operator.Operation.MINUS;
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i10 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(":") + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(":") + 1).trim();
                        }
                        i10++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            C3257g.m13220a(th);
                            C3257g.m13218a(fileReader);
                            C3257g.m13218a(bufferedReader);
                            f13815k = str;
                            f13816l = str2;
                        } catch (Throwable th4) {
                            C3257g.m13218a(fileReader);
                            C3257g.m13218a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i10 < 2);
                C3257g.m13218a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        C3257g.m13218a(bufferedReader);
        f13815k = str;
        f13816l = str2;
    }

    /* renamed from: U */
    private static String m13401U() {
        return C3264g.m13578X() + "bytes";
    }

    /* renamed from: V */
    private static boolean m13402V() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private static void m13403W() {
        if (!f13787O && !C3259b.m13301F() && !C3259b.m13307L()) {
            JNIBridge.cmd(18);
        }
    }

    /* renamed from: X */
    private static void m13404X() {
        C3256f.m13207a(3, new RunnableC3255e(414), 1000L);
    }

    /* renamed from: Y */
    private static StringBuilder m13405Y() {
        String str;
        String str2;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("level: ");
            sb2.append(f13775C);
            sb2.append("\n");
            sb2.append("scale: ");
            sb2.append(f13776D);
            sb2.append("\n");
            String str3 = " (Unknown)";
            switch (f13778F) {
                case 1:
                    str = " (Unknown)";
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb2.append("health: ");
            sb2.append(f13778F);
            sb2.append(str);
            sb2.append("\n");
            int i10 = f13779G;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            str2 = " (?)";
                        } else {
                            str2 = " (Wireless)";
                        }
                    } else {
                        str2 = " (USB port)";
                    }
                } else {
                    str2 = " (AC charger)";
                }
            } else {
                str2 = " (None)";
            }
            sb2.append("pluged: ");
            sb2.append(f13779G);
            sb2.append(str2);
            sb2.append("\n");
            int i11 = f13780H;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                str3 = " (?)";
                            } else {
                                str3 = " (Full)";
                            }
                        } else {
                            str3 = " (Not charging)";
                        }
                    } else {
                        str3 = " (Discharging)";
                    }
                } else {
                    str3 = " (Charging)";
                }
            }
            sb2.append("status: ");
            sb2.append(f13780H);
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("voltage: ");
            sb2.append(f13777E);
            sb2.append("\n");
            sb2.append("temperature: ");
            sb2.append(f13781I);
            sb2.append("\n");
            sb2.append("technology: ");
            sb2.append(f13782J);
            sb2.append("\n");
            sb2.append("battery low: ");
            sb2.append(f13783K);
            sb2.append("\n");
            return sb2;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return null;
        }
    }

    /* renamed from: Z */
    private static void m13406Z() {
        if (C3259b.f13740c && f13784L && C3250a.f13623c) {
            f13784L = false;
            if (!C3256f.m13209b(f13788P)) {
                C3256f.m13207a(0, f13788P, 2000L);
            }
        }
    }

    /* renamed from: a */
    public static boolean m13429a() {
        if (f13810f == 0) {
            f13810f = 2L;
            if (m13480h(C3259b.m13336b("logs")) == 1) {
                f13810f = 1L;
            }
        }
        return f13810f == 1;
    }

    /* renamed from: aa */
    private static boolean m13437aa() {
        if (C3259b.f13741d && JNIBridge.nativeIsCrashing()) {
            return true;
        }
        return false;
    }

    /* renamed from: ab */
    private static void m13438ab() {
        int i10;
        boolean z10;
        String m13580Z = C3264g.m13580Z();
        File file = new File(m13580Z);
        if (!file.isDirectory()) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 150) {
                return;
            }
            Arrays.sort(listFiles, new b((byte) 0));
            int length = listFiles.length - 150;
            if (length < 0) {
                i10 = 0;
            } else {
                i10 = length;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < listFiles.length; i13++) {
                File file2 = listFiles[i13];
                if (i13 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && currentTimeMillis - file2.lastModified() >= 432000000) {
                    z10 = true;
                }
                if (!z10) {
                    break;
                }
                try {
                    file2.delete();
                    i11++;
                    i12 = 0;
                } catch (Throwable th) {
                    i12++;
                    C3257g.m13220a(th);
                }
                if (i12 >= 3) {
                    break;
                }
            }
            C3251a.m13167a("Removed " + i11 + " logs in " + m13580Z);
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m13440b() {
        if (f13811g == -1) {
            f13811g = m13480h(C3259b.m13336b(AgooConstants.MESSAGE_LOCAL));
        }
        return f13811g;
    }

    /* renamed from: j */
    private static String m13485j(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", m13396P(), C3264g.m13575U(), C3264g.m13577W(), m13483i(Build.MODEL), m13483i(Build.VERSION.RELEASE), str);
    }

    /* renamed from: k */
    private static String m13488k(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", m13460d(), m13493n(), m13397Q(), str);
    }

    /* renamed from: l */
    private static String m13489l(String str) {
        if (!C3257g.m13230b(str)) {
            return "";
        }
        int indexOf = str.indexOf(0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* renamed from: m */
    private static String m13491m(String str) {
        String m13175a = C3252b.m13175a(str, C3264g.m13619x(), C3264g.m13618w());
        if (!str.equals(m13175a)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return m13175a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r7.endsWith(r3) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r7.indexOf(".log", r7.lastIndexOf(95)) != r7.lastIndexOf(".log")) goto L30;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] m13494n(java.lang.String r7) {
        /*
            boolean r0 = com.p077uc.crashsdk.C3264g.m13618w()
            boolean r1 = com.p077uc.crashsdk.C3264g.m13620y()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6d
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6b
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L27
            r3 = 0
        L27:
            r4 = 0
        L28:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L34
            int r4 = r4 + 1
            int r3 = r3 + 1
        L34:
            if (r3 >= 0) goto L28
            r3 = 8
            if (r4 == r3) goto L3b
            goto L6b
        L3b:
            java.lang.String r3 = com.p077uc.crashsdk.C3264g.m13619x()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L54
            boolean r0 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r3)
            if (r0 != 0) goto L6b
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5a
            goto L6b
        L54:
            boolean r3 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r3)
            if (r3 == 0) goto L5c
        L5a:
            r0 = 0
            goto L6d
        L5c:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6d
            goto L5a
        L6b:
            r0 = 0
            r1 = 0
        L6d:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13494n(java.lang.String):boolean[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|54|(0)|25|26|27|29|30|31|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|26|27|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13218a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13218a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0005, B:6:0x0033, B:7:0x0041, B:9:0x0047, B:11:0x0051, B:13:0x0056, B:49:0x0068, B:18:0x0078, B:22:0x0083, B:24:0x00ae, B:31:0x00d5, B:32:0x00e8, B:43:0x00ea, B:44:0x00ed, B:39:0x00e5, B:52:0x0072), top: B:3:0x0005, inners: #5 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13496o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13496o(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae A[Catch: all -> 0x0108, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:12:0x00ae, B:17:0x00d4, B:23:0x00ef, B:24:0x00df, B:38:0x00fc, B:41:0x0106, B:45:0x0033, B:47:0x003b, B:48:0x0044, B:50:0x004c, B:52:0x0054, B:54:0x005c, B:59:0x006a, B:61:0x0074, B:63:0x0081, B:65:0x008b, B:66:0x0096, B:68:0x00a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[Catch: all -> 0x0108, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:12:0x00ae, B:17:0x00d4, B:23:0x00ef, B:24:0x00df, B:38:0x00fc, B:41:0x0106, B:45:0x0033, B:47:0x003b, B:48:0x0044, B:50:0x004c, B:52:0x0054, B:54:0x005c, B:59:0x006a, B:61:0x0074, B:63:0x0081, B:65:0x008b, B:66:0x0096, B:68:0x00a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ab  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13498p(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13498p(java.lang.String):boolean");
    }

    /* renamed from: q */
    private static Map<String, Integer> m13500q(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] split = str2.split(":", 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!C3257g.m13225a(trim)) {
                    int i10 = 1;
                    try {
                        i10 = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        C3257g.m13220a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i10));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: r */
    private static void m13502r(String str) {
        if (C3264g.m13613r()) {
            try {
                m13438ab();
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(C3264g.m13580Z());
                if (!file.exists()) {
                    file.mkdirs();
                }
                C3251a.m13168a("crashsdk", "copy log to: " + file);
                C3257g.m13219a(new File(str), file);
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
        }
    }

    /* renamed from: s */
    private static String m13503s(String str) {
        return String.format("$^%s^$", str);
    }

    /* renamed from: t */
    public static void m13505t() {
        Thread.setDefaultUncaughtExceptionHandler(f13792T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static boolean m13506u() {
        if (!f13808c.get() && !m13437aa()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static Throwable m13507v() {
        return f13793U;
    }

    /* renamed from: w */
    public static int m13508w() {
        if (C3259b.m13304I() == 5) {
            return f13798Z;
        }
        return 100;
    }

    /* renamed from: x */
    public static void m13509x() {
        boolean z10;
        long m13611p = C3264g.m13611p();
        if (m13611p < 0) {
            return;
        }
        if (C3259b.m13304I() == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3256f.m13206a(0, new RunnableC3255e(401));
        if (!z10) {
            return;
        }
        RunnableC3255e runnableC3255e = new RunnableC3255e(402);
        f13796X = runnableC3255e;
        C3256f.m13207a(0, runnableC3255e, m13611p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m13510y() {
        if (C3259b.f13740c && C3250a.f13623c && !C3256f.m13209b(f13800aa)) {
            C3256f.m13207a(0, f13800aa, 1000L);
        }
    }

    /* renamed from: z */
    public static boolean m13511z() {
        synchronized (f13797Y) {
            Runnable runnable = f13796X;
            if (runnable != null && !f13795W) {
                C3256f.m13205a(runnable);
                f13796X = null;
                return true;
            }
            return false;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m13512a(thread, th, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m13460d() {
        String str = f13813i;
        if (str != null) {
            return str;
        }
        String m13485j = m13485j(null);
        f13813i = m13485j;
        return m13485j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:30|(2:32|33)|34|35|36|(1:40)|41|(1:45)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:28:0x0098, B:30:0x00ad), top: B:27:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:36:0x00d8, B:38:0x00de, B:40:0x00e6, B:41:0x010c, B:43:0x0112, B:45:0x011a), top: B:35:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:36:0x00d8, B:38:0x00de, B:40:0x00e6, B:41:0x010c, B:43:0x0112, B:45:0x011a), top: B:35:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m13467e() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13467e():java.lang.String");
    }

    /* renamed from: f */
    public static String m13472f() {
        if (C3257g.m13225a(f13815k)) {
            m13400T();
        }
        return f13815k;
    }

    /* renamed from: h */
    private static long m13480h(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        return 0L;
    }

    /* renamed from: i */
    private static String m13483i(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", Operator.Operation.MINUS);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: s */
    public static void m13504s() {
        f13792T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C3262e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m13454c() {
        f13813i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m13484i() {
        return f13809d;
    }

    /* renamed from: b */
    public static boolean m13451b(int i10, Object[] objArr) {
        if (i10 == 451) {
            if (f13799a || objArr != null) {
                return m13433a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        }
        if (i10 != 452) {
            if (f13799a) {
                return false;
            }
            throw new AssertionError();
        }
        if (!f13799a && objArr == null) {
            throw new AssertionError();
        }
        String str = (String) objArr[0];
        d dVar = (d) objArr[1];
        return C3257g.m13224a(new File(str), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f13837a), Long.valueOf(dVar.f13838b), Integer.valueOf(dVar.f13839c), Integer.valueOf(dVar.f13840d)).getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13455c(java.io.OutputStream r9) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.p077uc.crashsdk.C3259b.f13741d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            java.lang.String r0 = com.p077uc.crashsdk.C3259b.m13357o()
            com.p077uc.crashsdk.C3262e.f13812h = r2
            r1 = 17
            long r1 = com.p077uc.crashsdk.JNIBridge.cmd(r1, r0)
            r4 = 1
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L3a
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            byte[] r0 = com.p077uc.crashsdk.p078a.C3257g.m13238e(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2d
            r9.write(r0)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            m13426a(r0, r9)
        L2d:
            r1.delete()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            m13426a(r0, r9)
        L35:
            com.p077uc.crashsdk.C3262e.f13812h = r3
            m13421a(r9)
        L3a:
            com.p077uc.crashsdk.C3262e.f13812h = r3
            return
        L3d:
            r1 = 0
            int r4 = com.p077uc.crashsdk.C3264g.m13565K()     // Catch: java.lang.Throwable -> L7b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "/proc/self/fd"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L79
            java.io.File[] r1 = r5.listFiles()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L6f
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "opened file count: %d, write limit: %d.\n"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L79
            int r8 = r1.length     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
            r7[r2] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r7[r3] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L6f:
            java.lang.String r3 = "[DEBUG] listFiles failed!\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L79:
            r3 = move-exception
            goto L7e
        L7b:
            r3 = move-exception
            r4 = 900(0x384, float:1.261E-42)
        L7e:
            m13426a(r3, r9)
        L81:
            if (r1 == 0) goto Lc8
            int r3 = r1.length     // Catch: java.lang.Throwable -> Lc4
            if (r3 < r4) goto Lc8
            java.lang.String r3 = "opened files:\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb4
        L95:
            if (r2 >= r4) goto Lb8
            r5 = r1[r2]     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = " -> "
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            int r2 = r2 + 1
            goto L95
        Lb4:
            r1 = move-exception
            m13426a(r1, r9)     // Catch: java.lang.Throwable -> Lc4
        Lb8:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc4
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r0 = move-exception
            m13426a(r0, r9)
        Lc8:
            m13421a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13455c(java.io.OutputStream):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m13476g() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JavaMax:    ");
            sb2.append(Runtime.getRuntime().maxMemory() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            sb2.append("JavaTotal:  ");
            sb2.append(Runtime.getRuntime().totalMemory() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            sb2.append("JavaFree:   ");
            sb2.append(Runtime.getRuntime().freeMemory() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            sb2.append("NativeHeap: ");
            sb2.append(Debug.getNativeHeapSize() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            sb2.append("NativeAllocated: ");
            sb2.append(Debug.getNativeHeapAllocatedSize() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            sb2.append("NativeFree: ");
            sb2.append(Debug.getNativeHeapFreeSize() / IjkMediaMeta.AV_CH_SIDE_RIGHT);
            sb2.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) C3257g.m13211a().getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb2.append("availMem:   ");
                    sb2.append(memoryInfo.availMem / IjkMediaMeta.AV_CH_SIDE_RIGHT);
                    sb2.append(" kB\n");
                    sb2.append("threshold:  ");
                    sb2.append(memoryInfo.threshold / IjkMediaMeta.AV_CH_SIDE_RIGHT);
                    sb2.append(" kB\n");
                    sb2.append("lowMemory:  ");
                    sb2.append(memoryInfo.lowMemory);
                    sb2.append("\n");
                }
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13461d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.p077uc.crashsdk.C3264g.m13566L()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r1 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            return
        L16:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r4)
            r4 = 0
        L23:
            if (r1 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r5)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8e
            r8[r2] = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L8e
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L8e
            r5 = 0
        L59:
            if (r5 >= r3) goto L92
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L8e
            r9 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = com.p077uc.crashsdk.p078a.C3257g.m13212a(r8, r9, r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = m13489l(r8)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            r11[r2] = r6     // Catch: java.lang.Throwable -> L8e
            r11[r4] = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L8e
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L59
        L8e:
            r0 = move-exception
            m13426a(r0, r12)
        L92:
            m13421a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13461d(java.io.OutputStream):void");
    }

    /* renamed from: f */
    private static void m13474f(OutputStream outputStream) {
        String m13163m;
        try {
            outputStream.write("recent status:\n".getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            m13426a(th, outputStream);
        }
        try {
            if (f13806ag) {
                m13163m = m13503s("LASTVER");
            } else {
                m13163m = C3250a.m13163m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", m13163m).getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th2) {
            m13426a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f13823s;
            synchronized (arrayList) {
                if (f13825u != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f13825u).getBytes(Request.DEFAULT_CHARSET));
                }
                if (f13824t > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f13824t)).getBytes(Request.DEFAULT_CHARSET));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes(Request.DEFAULT_CHARSET));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f13826v)).getBytes(Request.DEFAULT_CHARSET));
            String str = f13827w;
            if (str != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str).getBytes(Request.DEFAULT_CHARSET));
            }
        } catch (Throwable th3) {
            m13426a(th3, outputStream);
        }
        m13421a(outputStream);
    }

    /* renamed from: k */
    public static String m13487k() {
        String str = f13828x;
        if (C3257g.m13225a(str)) {
            synchronized (f13829y) {
                str = C3257g.m13213a(C3259b.m13351i(), C3264g.m13621z(), true);
                f13828x = str;
            }
        }
        return str;
    }

    /* renamed from: l */
    public static void m13490l() {
        synchronized (f13829y) {
            f13828x = null;
        }
    }

    /* renamed from: a */
    public static void m13417a(int i10, Object[] objArr) {
        int i11;
        switch (i10) {
            case 401:
                JNIBridge.nativeCmd(10, C3259b.m13304I() == 5 ? 1L : 0L, null, null);
                C3250a.f13623c = true;
                C3250a.m13146a(false);
                f13784L = true;
                m13406Z();
                m13510y();
                return;
            case 402:
                Object obj = f13797Y;
                synchronized (obj) {
                    if (f13796X == null) {
                        return;
                    }
                    f13795W = true;
                    if (C3259b.m13359q()) {
                        return;
                    }
                    if (!C3254d.m13198e()) {
                        C3251a.m13172c("DEBUG", C3254d.m13195b());
                        return;
                    }
                    if (!m13464d(LogType.UNEXP_TYPE)) {
                        C3251a.m13173d("DEBUG", "unexp sample miss");
                        return;
                    }
                    int nativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(C3264g.m13611p(), C3264g.m13612q());
                    if (nativeGenerateUnexpLog != 0) {
                        C3263f.m13530a(11);
                        if ((nativeGenerateUnexpLog & 4352) != 0) {
                            f13798Z = 105;
                            i11 = 30;
                        } else if ((nativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                            f13798Z = 104;
                            i11 = 31;
                        } else if ((nativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                            f13798Z = 106;
                            i11 = 32;
                        } else {
                            if ((nativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                f13798Z = 103;
                                C3263f.m13530a(10);
                            } else if ((nativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                f13798Z = 107;
                                C3263f.m13530a(29);
                            } else {
                                f13798Z = 102;
                            }
                            m13428a(true);
                        }
                        C3263f.m13530a(i11);
                        m13428a(true);
                    }
                    synchronized (obj) {
                        f13796X = null;
                    }
                    return;
                }
            case 403:
                m13438ab();
                return;
            case 404:
            default:
                if (!f13799a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                f13784L = false;
                StringBuilder m13405Y = m13405Y();
                String m13349g = C3259b.m13349g();
                if (m13405Y != null) {
                    C3257g.m13223a(new File(m13349g), m13405Y.toString());
                    return;
                }
                return;
            case 406:
                if (!f13799a && objArr == null) {
                    throw new AssertionError();
                }
                m13424a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    C3250a.m13154d();
                    return;
                } catch (Throwable th) {
                    C3257g.m13220a(th);
                    return;
                }
            case 408:
                synchronized (f13801ab) {
                    if (!f13802ac && C3264g.m13572R() && C3259b.m13368z()) {
                        C3259b.m13361s();
                        C3258h.m13278f();
                        C3263f.m13546c();
                        if (C3259b.m13301F()) {
                            m13383C();
                        }
                        if (C3264g.m13572R()) {
                            m13427a(Calendar.getInstance());
                        }
                        f13802ac = true;
                        return;
                    }
                    return;
                }
            case 409:
                m13462d(false);
                return;
            case 410:
                m13436a(false, true);
                return;
            case 411:
                if (C3259b.f13741d) {
                    JNIBridge.set(28, m13464d(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, m13464d(LogType.ANR_TYPE));
                    return;
                }
                return;
            case 412:
                if (!f13790R && C3259b.m13297B() && C3264g.m13568N()) {
                    m13443b(C3257g.m13211a());
                    return;
                }
                if (f13790R) {
                    if (C3259b.m13297B() && C3264g.m13568N()) {
                        return;
                    }
                    try {
                        C3257g.m13211a().unregisterReceiver(f13789Q);
                        f13790R = false;
                        return;
                    } catch (Throwable th2) {
                        C3257g.m13220a(th2);
                        return;
                    }
                }
                return;
            case 413:
                JNIBridge.cmd(8);
                return;
            case 414:
                try {
                    if (m13463d(C3257g.m13211a())) {
                        return;
                    }
                    int i12 = f13786N + 1;
                    f13786N = i12;
                    if (i12 < 10) {
                        m13404X();
                        return;
                    } else {
                        if (C3259b.f13741d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    C3257g.m13220a(th3);
                    return;
                }
            case 415:
                if (!f13799a && objArr == null) {
                    throw new AssertionError();
                }
                long longValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= longValue) {
                    C3258h.m13279g();
                    C3263f.m13530a(100);
                    m13462d(true);
                    C3263f.m13527a(true);
                    C3258h.m13264b();
                } else {
                    C3258h.m13280h();
                    C3258h.m13281i();
                    C3258h.m13273c();
                }
                m13427a(calendar);
                break;
            case HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                break;
        }
        m13403W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uc.crashsdk.e$a */
    /* loaded from: classes3.dex */
    public static class a extends OutputStream {

        /* renamed from: a */
        private final long f13832a;

        /* renamed from: b */
        private final OutputStream f13833b;

        /* renamed from: c */
        private int f13834c = 0;

        /* renamed from: d */
        private int f13835d = 0;

        /* renamed from: e */
        private boolean f13836e = false;

        a(long j10, OutputStream outputStream) {
            this.f13832a = j10;
            this.f13833b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int m13513a(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.f13835d
                int r0 = r0 + r9
                r6.f13835d = r0
                boolean r0 = r6.f13836e
                if (r0 == 0) goto Lb
                r7 = 0
                return r7
            Lb:
                int r0 = com.p077uc.crashsdk.C3264g.m13556B()
                if (r0 <= 0) goto L19
                int r1 = r6.f13834c
                int r2 = r1 + r9
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r9
            L1a:
                int r1 = r6.f13834c
                int r1 = r1 + r0
                r6.f13834c = r1
                long r1 = r6.f13832a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.m13514b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r6.f13833b
                r1.write(r7, r8, r0)
            L35:
                if (r0 >= r9) goto L3a
                r7 = 1
                r6.f13836e = r7
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.a.m13513a(byte[], int, int):int");
        }

        /* renamed from: b */
        private void m13514b(String str) {
            if (C3259b.f13741d) {
                JNIBridge.nativeClientWriteData(this.f13832a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            if (C3262e.f13812h && C3262e.m13389I()) {
                C3251a.m13173d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i10)));
            }
            if (this.f13832a != 0) {
                m13514b(String.format(Locale.US, "%c", Integer.valueOf(i10)));
            } else {
                this.f13833b.write(i10);
            }
            this.f13834c++;
            this.f13835d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            if (C3262e.f13812h && C3262e.m13389I()) {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                if (i11 != 1 || bArr2[0] != 10) {
                    try {
                        C3251a.m13173d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            m13513a(bArr, i10, i11);
        }

        /* renamed from: a */
        final void m13515a() {
            try {
                if (this.f13835d - this.f13834c > 0) {
                    m13516a("\n");
                    m13516a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                m13516a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f13835d), Integer.valueOf(this.f13834c), Integer.valueOf(C3264g.m13556B()), Integer.valueOf(this.f13835d - this.f13834c)));
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (C3262e.f13812h && C3262e.m13389I() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    C3251a.m13173d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            m13513a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        final void m13516a(String str) {
            if (C3262e.f13812h && C3262e.m13389I()) {
                C3251a.m13173d("DEBUG", str);
            }
            if (this.f13832a != 0) {
                m13514b(str);
            } else {
                this.f13833b.write(str.getBytes(Request.DEFAULT_CHARSET));
            }
        }
    }

    /* renamed from: h */
    public static String m13481h() {
        String str = f13817m;
        if (str != null) {
            return str;
        }
        String m13410a = m13410a(Process.myPid());
        f13817m = m13410a;
        return m13410a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uc.crashsdk.e$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        long f13837a;

        /* renamed from: b */
        long f13838b;

        /* renamed from: c */
        int f13839c;

        /* renamed from: d */
        int f13840d;

        /* renamed from: e */
        boolean f13841e;

        /* renamed from: f */
        boolean f13842f;

        /* renamed from: g */
        boolean f13843g;

        private d() {
            this.f13837a = 0L;
            this.f13838b = 0L;
            this.f13839c = 0;
            this.f13840d = 0;
            this.f13841e = false;
            this.f13842f = false;
            this.f13843g = false;
        }

        /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* renamed from: j */
    public static void m13486j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* renamed from: m */
    public static void m13492m() {
        if (f13806ag) {
            return;
        }
        C3256f.m13207a(1, new RunnableC3255e(411), 1000L);
    }

    /* renamed from: p */
    public static void m13497p() {
        String str;
        Throwable th;
        if (C3257g.m13225a(f13774B)) {
            String str2 = null;
            try {
                File file = new File(C3264g.m13578X() + "unique");
                if (file.exists()) {
                    str = C3257g.m13212a(file, 48, false);
                    try {
                        if (str != null) {
                            try {
                                if (str.length() == 36) {
                                    str2 = str.replaceAll("[^0-9a-zA-Z-]", Operator.Operation.MINUS);
                                }
                            } catch (Exception e10) {
                                C3257g.m13220a(e10);
                            }
                        }
                        str2 = str;
                    } catch (Throwable th2) {
                        th = th2;
                        C3257g.m13220a(th);
                        str2 = str;
                        f13774B = str2;
                    }
                }
                if (C3257g.m13225a(str2)) {
                    C3259b.m13302G();
                    str2 = UUID.randomUUID().toString();
                    if (!C3257g.m13225a(str2)) {
                        C3257g.m13224a(file, str2.getBytes());
                    }
                }
            } catch (Throwable th3) {
                str = str2;
                th = th3;
            }
            f13774B = str2;
        }
    }

    /* renamed from: q */
    public static String m13499q() {
        return f13774B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m13501r() {
        f13787O = false;
        if (!C3259b.m13297B()) {
            C3256f.m13207a(3, new RunnableC3255e(HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE), 11000L);
        }
        if (m13402V()) {
            return;
        }
        f13786N = 0;
        m13404X();
    }

    /* renamed from: b */
    private static void m13446b(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            m13426a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), m13493n()).getBytes(Request.DEFAULT_CHARSET));
            Object[] objArr = new Object[3];
            objArr[0] = m13467e();
            if (C3257g.m13225a(f13816l)) {
                m13400T();
            }
            objArr[1] = f13816l;
            objArr[2] = m13472f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th2) {
            m13426a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes(Request.DEFAULT_CHARSET));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes(Request.DEFAULT_CHARSET));
            Object[] objArr2 = new Object[4];
            objArr2[0] = m13415a(new Date(f13807b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = C3257g.m13234d();
            objArr2[3] = C3259b.m13297B() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th3) {
            m13426a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", C3264g.m13575U(), C3264g.m13576V(), C3264g.m13577W(), Integer.valueOf(C3250a.m13152c())).getBytes(Request.DEFAULT_CHARSET));
            String str5 = MessageService.MSG_DB_READY_REPORT;
            String str6 = "";
            if (C3259b.f13741d) {
                String nativeGet = JNIBridge.nativeGet(1, 0L, null);
                str4 = JNIBridge.nativeGet(2, 0L, null);
                str5 = nativeGet;
            } else {
                str4 = "";
            }
            outputStream.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.3.2.2", str5, "240515102041", str4, "umeng").getBytes(Request.DEFAULT_CHARSET));
            if (str != null) {
                str6 = str;
            }
            outputStream.write(("Report Name: " + str6.substring(str6.lastIndexOf(47) + 1) + "\n").getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th4) {
            m13426a(th4, outputStream);
        }
        try {
            if (f13806ag) {
                str3 = m13503s("UUID");
            } else {
                str3 = f13774B;
            }
            outputStream.write(String.format("UUID: %s\n", str3).getBytes(Request.DEFAULT_CHARSET));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th5) {
            m13426a(th5, outputStream);
        }
        try {
            String m13300E = C3259b.m13300E();
            if (C3257g.m13225a(m13300E)) {
                m13300E = "(none)";
            }
            outputStream.write(("Activity: " + m13300E + "\n").getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th6) {
            m13426a(th6, outputStream);
        }
        m13421a(outputStream);
        try {
            C3250a.m13139a(outputStream, Request.DEFAULT_CHARSET);
            if (f13806ag) {
                f13812h = false;
                outputStream.write(m13503s("HEADER").getBytes(Request.DEFAULT_CHARSET));
                f13812h = true;
            }
        } catch (Throwable th7) {
            m13426a(th7, outputStream);
        }
        m13421a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static String m13493n() {
        return m13415a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m13464d(String str) {
        if (f13806ag) {
            return true;
        }
        try {
            return m13498p(str);
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m13428a(boolean z10) {
        File[] listFiles;
        try {
            if (C3259b.m13367y() && (listFiles = new File(C3264g.m13579Y()).listFiles()) != null) {
                int m13608m = C3264g.m13608m();
                int m13609n = C3264g.m13609n();
                if (listFiles.length < Math.min(m13608m, m13609n)) {
                    return;
                }
                Object[] objArr = 0;
                int i10 = 0;
                int i11 = 0;
                for (File file : listFiles) {
                    if (m13452b(file)) {
                        i10++;
                    } else {
                        i11++;
                    }
                }
                int i12 = (!z10 || i10 < m13608m) ? 0 : (i10 - m13608m) + 1;
                int i13 = (z10 || i11 < m13609n) ? 0 : (i11 - m13609n) + 1;
                if (i12 == 0 && i13 == 0) {
                    return;
                }
                Arrays.sort(listFiles, new b(objArr == true ? 1 : 0));
                int i14 = i12;
                int i15 = i13;
                for (File file2 : listFiles) {
                    boolean m13452b = m13452b(file2);
                    if (m13452b && i14 > 0) {
                        C3251a.m13168a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i14 += -1;
                    } else if (!m13452b && i15 > 0) {
                        C3251a.m13168a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i15 += -1;
                    }
                    if (i14 == 0 && i15 == 0) {
                        break;
                    }
                }
                C3263f.m13531a(16, i12 + i13);
                if (i12 > 0) {
                    C3263f.m13531a(22, i12);
                }
                if (i13 > 0) {
                    C3263f.m13531a(23, i13);
                }
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m13463d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z10 = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next.pid == myPid) {
                f13787O = true;
                if (m13395O()) {
                    C3251a.m13173d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (C3259b.f13741d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z10 = true;
            }
        }
        if (!z10 && C3259b.f13741d) {
            m13403W();
        }
        return true;
    }

    /* renamed from: o */
    public static void m13495o() {
        f13807b = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13468e(java.io.OutputStream r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13468e(java.io.OutputStream):void");
    }

    /* renamed from: c */
    public static void m13456c(String str) {
        synchronized (f13830z) {
            C3252b.m13176a(C3259b.m13354l(), str + "\n");
        }
    }

    /* renamed from: d */
    public static void m13462d(boolean z10) {
        C3263f.m13549d(false);
        if (z10) {
            C3263f.m13538a(C3259b.m13340c(), false);
            C3258h.m13281i();
        } else {
            C3263f.m13525a();
            C3258h.m13281i();
        }
    }

    /* renamed from: f */
    public static int m13471f(boolean z10) {
        int m13539b;
        if (z10) {
            m13539b = C3263f.m13536a(C3259b.m13340c()) ? 1 : 0;
        } else {
            m13539b = C3263f.m13539b();
        }
        int m13540b = C3263f.m13540b(z10);
        return m13540b > m13539b ? m13540b : m13539b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m13457c(boolean z10) {
        boolean z11 = true;
        if (!f13790R ? !z10 || !C3264g.m13568N() : z10 && C3264g.m13568N()) {
            z11 = false;
        }
        if (z11) {
            RunnableC3255e runnableC3255e = f13791S;
            if (C3256f.m13209b(runnableC3255e)) {
                C3256f.m13205a(runnableC3255e);
            }
            C3256f.m13207a(0, runnableC3255e, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static StringBuilder m13473f(String str) {
        return m13416a(Thread.currentThread().getStackTrace(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13413a(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(Build.VERSION.SDK_INT >= 26 ? new String[]{"ps", "-ef"} : new String[]{"ps"}).getInputStream()));
            boolean m13230b = C3257g.m13230b(str);
            boolean m13230b2 = C3257g.m13230b(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if ((m13230b && readLine.contains(str)) || (m13230b2 && readLine.contains(str2)) || (readLine.indexOf(47) < 0 && readLine.indexOf(46) > 0)) {
                        byteArrayOutputStream.write(readLine.getBytes(Request.DEFAULT_CHARSET));
                        byteArrayOutputStream.write("\n".getBytes(Request.DEFAULT_CHARSET));
                    }
                } else {
                    return byteArrayOutputStream.toString(Request.DEFAULT_CHARSET);
                }
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return "exception exists.";
        }
    }

    /* renamed from: a */
    private static BufferedReader m13409a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i10 = 8192;
        while (bufferedReader == null && i10 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i10);
            } catch (Throwable unused) {
                i10 /= 2;
                if (i10 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    /* renamed from: a */
    private static void m13421a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            m13426a(th, outputStream);
        }
    }

    /* renamed from: e */
    public static boolean m13469e(String str) {
        try {
            if (!C3257g.m13230b(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return false;
        }
    }

    /* renamed from: a */
    private static String m13411a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return C3257g.m13225a(str) ? file.getPath() : str;
    }

    /* renamed from: a */
    private static long m13408a(StatFs statFs, String str, String str2) {
        try {
            Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(statFs, new Object[0]);
            if (invoke != null && (invoke instanceof Long)) {
                return ((Long) invoke).longValue();
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) invoke2).intValue();
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return 0L;
        }
    }

    /* renamed from: e */
    public static int m13466e(boolean z10) {
        return C3263f.m13527a(z10);
    }

    /* renamed from: b */
    private static void m13445b(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes(Request.DEFAULT_CHARSET));
        } finally {
        }
        try {
            if (C3264g.m13610o() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes(Request.DEFAULT_CHARSET));
                } catch (Throwable th) {
                    m13426a(th, outputStream);
                }
                m13421a(outputStream);
                return;
            }
            int m13610o = C3264g.m13610o();
            bufferedReader = m13409a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", C3384f.f14604ax, "-b", "main", "-v", "threadtime", "-t", String.valueOf(m13610o)}).getInputStream()));
            if (bufferedReader == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes(Request.DEFAULT_CHARSET));
                } catch (Throwable th2) {
                    m13426a(th2, outputStream);
                }
                m13421a(outputStream);
                return;
            }
            f13812h = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    i10++;
                    if (i11 < m13610o && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                        outputStream.write(readLine.getBytes(Request.DEFAULT_CHARSET));
                        outputStream.write("\n".getBytes(Request.DEFAULT_CHARSET));
                        i11++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        m13426a(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i10), Integer.valueOf(i11)).getBytes(Request.DEFAULT_CHARSET));
            f13812h = true;
            C3257g.m13218a(bufferedReader);
            m13421a(outputStream);
            return;
            C3257g.m13218a(bufferedReader);
            m13421a(outputStream);
            return;
        } finally {
        }
    }

    /* renamed from: a */
    private static void m13419a(a aVar) {
        try {
            aVar.m13516a(String.format(Locale.US, "log end: %s\n", m13493n()));
        } catch (Throwable th) {
            m13426a(th, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13407a(OutputStream outputStream, String str, int i10) {
        int i11 = 0;
        if (str == null) {
            m13421a(outputStream);
            return 0;
        }
        try {
            String m13174a = C3252b.m13174a(str);
            if (m13174a == null) {
                m13174a = "file: '" + str + "' not found or decode failed!";
            }
            int length = m13174a.length();
            if (length <= i10 + 32) {
                i10 = length;
            }
            if (i10 > 0) {
                try {
                    outputStream.write(m13174a.getBytes(Request.DEFAULT_CHARSET), 0, i10);
                    outputStream.write("\n".getBytes(Request.DEFAULT_CHARSET));
                } catch (Throwable th) {
                    th = th;
                    i11 = i10;
                    m13426a(th, outputStream);
                    i10 = i11;
                    m13421a(outputStream);
                    return i10;
                }
            }
            if (i10 < m13174a.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(m13174a.length() - i10)).getBytes(Request.DEFAULT_CHARSET));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m13421a(outputStream);
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13410a(int i10) {
        try {
            String m13212a = C3257g.m13212a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i10))), 128, false);
            return C3257g.m13230b(m13212a) ? m13489l(m13212a) : "unknown";
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return "unknown";
        }
    }

    /* renamed from: b */
    private static void m13444b(a aVar) {
        f13812h = false;
        try {
            aVar.write((m13503s("LOG_END") + "\n").getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        f13812h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:1|(38:2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|(3:12|13|(1:15))|17|(2:19|20)|(2:25|26)|(5:27|28|(3:29|30|(1:32))|34|(1:38))|(2:40|41)|(2:43|44)|45|(2:46|47)|49|50|(2:295|296)|52|(2:53|54)|55|56|57|(2:58|59)|60|(2:61|62)|63|(4:65|66|67|68)|(2:72|73)|74|(2:75|76)|(2:78|79)|(3:80|81|(1:83)(2:267|(1:269)))|84|(2:85|86)|87)|(4:89|90|91|92)(3:211|212|(8:219|220|221|222|223|224|225|(45:227|228|229|230|231|232|233|234|235|236|237|238|239|95|96|97|98|(3:100|101|102)(7:172|173|(1:175)|176|(1:178)|179|(4:181|(1:183)(1:187)|184|185))|103|104|105|106|107|(4:109|110|111|112)|116|117|118|119|120|121|(4:123|124|125|126)|130|131|132|133|134|(1:136)|137|138|(1:140)|141|142|(1:144)(1:149)|145|146)(34:254|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146)))|93|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146|(2:(0)|(1:156))) */
    /* JADX WARN: Can't wrap try/catch for region: R(75:1|2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|(3:12|13|(1:15))|17|(2:19|20)|(2:25|26)|(5:27|28|(3:29|30|(1:32))|34|(1:38))|(2:40|41)|(2:43|44)|45|(2:46|47)|49|50|(2:295|296)|52|(2:53|54)|55|56|57|(2:58|59)|60|(2:61|62)|63|(4:65|66|67|68)|(2:72|73)|74|(2:75|76)|(2:78|79)|(3:80|81|(1:83)(2:267|(1:269)))|84|(2:85|86)|87|(4:89|90|91|92)(3:211|212|(8:219|220|221|222|223|224|225|(45:227|228|229|230|231|232|233|234|235|236|237|238|239|95|96|97|98|(3:100|101|102)(7:172|173|(1:175)|176|(1:178)|179|(4:181|(1:183)(1:187)|184|185))|103|104|105|106|107|(4:109|110|111|112)|116|117|118|119|120|121|(4:123|124|125|126)|130|131|132|133|134|(1:136)|137|138|(1:140)|141|142|(1:144)(1:149)|145|146)(34:254|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146)))|93|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146|(2:(0)|(1:156))) */
    /* JADX WARN: Can't wrap try/catch for region: R(90:1|2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|12|13|(1:15)|17|(2:19|20)|(2:25|26)|27|28|29|30|(1:32)|34|(1:38)|40|41|(2:43|44)|45|(2:46|47)|49|50|(2:295|296)|52|53|54|55|56|57|58|59|60|(2:61|62)|63|(4:65|66|67|68)|72|73|74|75|76|(2:78|79)|80|81|(1:83)(2:267|(1:269))|84|(2:85|86)|87|(4:89|90|91|92)(3:211|212|(8:219|220|221|222|223|224|225|(45:227|228|229|230|231|232|233|234|235|236|237|238|239|95|96|97|98|(3:100|101|102)(7:172|173|(1:175)|176|(1:178)|179|(4:181|(1:183)(1:187)|184|185))|103|104|105|106|107|(4:109|110|111|112)|116|117|118|119|120|121|(4:123|124|125|126)|130|131|132|133|134|(1:136)|137|138|(1:140)|141|142|(1:144)(1:149)|145|146)(34:254|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146)))|93|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146|(2:(0)|(1:156))) */
    /* JADX WARN: Can't wrap try/catch for region: R(92:1|2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|12|13|(1:15)|17|(2:19|20)|(2:25|26)|27|28|29|30|(1:32)|34|(1:38)|40|41|43|44|45|(2:46|47)|49|50|(2:295|296)|52|53|54|55|56|57|58|59|60|(2:61|62)|63|(4:65|66|67|68)|72|73|74|75|76|(2:78|79)|80|81|(1:83)(2:267|(1:269))|84|85|86|87|(4:89|90|91|92)(3:211|212|(8:219|220|221|222|223|224|225|(45:227|228|229|230|231|232|233|234|235|236|237|238|239|95|96|97|98|(3:100|101|102)(7:172|173|(1:175)|176|(1:178)|179|(4:181|(1:183)(1:187)|184|185))|103|104|105|106|107|(4:109|110|111|112)|116|117|118|119|120|121|(4:123|124|125|126)|130|131|132|133|134|(1:136)|137|138|(1:140)|141|142|(1:144)(1:149)|145|146)(34:254|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146)))|93|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146|(2:(0)|(1:156))) */
    /* JADX WARN: Can't wrap try/catch for region: R(96:1|2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|12|13|(1:15)|17|(2:19|20)|25|26|27|28|29|30|(1:32)|34|(1:38)|40|41|43|44|45|46|47|49|50|(2:295|296)|52|53|54|55|56|57|58|59|60|61|62|63|(4:65|66|67|68)|72|73|74|75|76|78|79|80|81|(1:83)(2:267|(1:269))|84|85|86|87|(4:89|90|91|92)(3:211|212|(8:219|220|221|222|223|224|225|(45:227|228|229|230|231|232|233|234|235|236|237|238|239|95|96|97|98|(3:100|101|102)(7:172|173|(1:175)|176|(1:178)|179|(4:181|(1:183)(1:187)|184|185))|103|104|105|106|107|(4:109|110|111|112)|116|117|118|119|120|121|(4:123|124|125|126)|130|131|132|133|134|(1:136)|137|138|(1:140)|141|142|(1:144)(1:149)|145|146)(34:254|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146)))|93|94|95|96|97|98|(0)(0)|103|104|105|106|107|(0)|116|117|118|119|120|121|(0)|130|131|132|133|134|(0)|137|138|(0)|141|142|(0)(0)|145|146|(2:(0)|(1:156))) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d3, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0483, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0485, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0456, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0458, code lost:
    
        m13426a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x044c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044e, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0427, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0429, code lost:
    
        m13426a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0358, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0359, code lost:
    
        m13426a(r0, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0430 A[Catch: all -> 0x0494, TRY_LEAVE, TryCatch #35 {all -> 0x0494, blocks: (B:95:0x034b, B:98:0x035c, B:103:0x0417, B:107:0x042c, B:109:0x0430, B:112:0x0445, B:115:0x0442, B:164:0x044e, B:121:0x045b, B:123:0x045f, B:126:0x0474, B:129:0x0471, B:130:0x0477, B:155:0x0485, B:160:0x0458, B:168:0x0429, B:171:0x0376, B:191:0x0359, B:247:0x0348, B:106:0x0423, B:125:0x0462, B:111:0x0433, B:132:0x047d, B:117:0x0448, B:120:0x0452, B:97:0x034e), top: B:246:0x0348, inners: #4, #8, #22, #24, #27, #36, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x045f A[Catch: all -> 0x0494, TRY_LEAVE, TryCatch #35 {all -> 0x0494, blocks: (B:95:0x034b, B:98:0x035c, B:103:0x0417, B:107:0x042c, B:109:0x0430, B:112:0x0445, B:115:0x0442, B:164:0x044e, B:121:0x045b, B:123:0x045f, B:126:0x0474, B:129:0x0471, B:130:0x0477, B:155:0x0485, B:160:0x0458, B:168:0x0429, B:171:0x0376, B:191:0x0359, B:247:0x0348, B:106:0x0423, B:125:0x0462, B:111:0x0433, B:132:0x047d, B:117:0x0448, B:120:0x0452, B:97:0x034e), top: B:246:0x0348, inners: #4, #8, #22, #24, #27, #36, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c1 A[Catch: all -> 0x04d2, TryCatch #33 {all -> 0x04d2, blocks: (B:142:0x04bd, B:144:0x04c1, B:145:0x04cc), top: B:141:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ad  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m13414a(java.lang.Throwable r23, java.lang.String r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13414a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m13439b(OutputStream outputStream, String str, int i10) {
        int i11;
        DataInputStream dataInputStream;
        int i12;
        DataInputStream dataInputStream2 = null;
        int i13 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] m13398R = m13398R();
                if (m13398R == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes(Request.DEFAULT_CHARSET));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i12 = 0;
                i11 = 0;
                loop0: while (true) {
                    boolean z10 = false;
                    while (true) {
                        try {
                            int read = dataInputStream.read(m13398R);
                            if (read == -1) {
                                break loop0;
                            }
                            i12 += read;
                            int i14 = i10 - i11;
                            if (read <= i14 + 32) {
                                i14 = read;
                            }
                            if (i14 > 0 && !z10) {
                                outputStream.write(m13398R, 0, i14);
                                i11 += i14;
                            }
                            if (!z10) {
                                if (i14 < read || i11 >= i10) {
                                    z10 = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i13 = i11;
                            dataInputStream2 = dataInputStream;
                            try {
                                m13426a(th, outputStream);
                                C3257g.m13218a(dataInputStream2);
                                i11 = i13;
                                m13421a(outputStream);
                                return i11;
                            } finally {
                                C3257g.m13218a(dataInputStream2);
                            }
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes(Request.DEFAULT_CHARSET));
                dataInputStream = null;
                i12 = 0;
                i11 = 0;
            }
            if (i11 > 0) {
                outputStream.write("\n".getBytes(Request.DEFAULT_CHARSET));
            }
            if (i11 < i12) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i12 - i11)).getBytes(Request.DEFAULT_CHARSET));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m13421a(outputStream);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13450b(boolean z10) {
        try {
            boolean z11 = C3264g.m13614s() && C3259b.m13301F() && !f13809d;
            if (!z11) {
                z11 = C3264g.m13615t();
            }
            if (z11) {
                if (z10) {
                    String m13487k = m13487k();
                    if (C3257g.m13225a(m13487k)) {
                        return;
                    }
                    m13486j();
                    m13424a(m13487k, false, false);
                    return;
                }
                m13436a(true, false);
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* renamed from: b */
    private static boolean m13452b(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf <= 0 || (indexOf = name.indexOf(46, lastIndexOf)) <= 0) {
            return false;
        }
        String substring = name.substring(lastIndexOf + 1, indexOf);
        return LogType.JAVA_TYPE.equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || LogType.ANR_TYPE.equals(substring);
    }

    /* renamed from: b */
    private static String m13441b(String str, boolean z10, boolean z11) {
        if (z10) {
            try {
                str = m13491m(str);
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }
        if (!z11) {
            return str;
        }
        try {
            return m13412a(str);
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13449b(String str, String str2, boolean z10) {
        C3258h.m13262a(str, str2, false, z10);
    }

    /* renamed from: b */
    public static void m13447b(String str) {
        synchronized (f13829y) {
            f13828x = str;
            C3252b.m13176a(C3259b.m13351i(), str + "\n");
        }
    }

    /* renamed from: b */
    private static void m13448b(String str, String str2) {
        try {
            C3261d.m13375a(str, m13481h(), str2);
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* renamed from: b */
    public static void m13443b(Context context) {
        if (C3264g.m13568N()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f13789Q, intentFilter, null, C3256f.m13202a(1));
                f13790R = true;
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m13442b(int i10) {
        C3256f.m13207a(0, new RunnableC3255e(410), i10 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13412a(String str) {
        int lastIndexOf;
        int indexOf;
        int i10;
        int indexOf2;
        File file;
        byte[] m13238e;
        byte[] bArr;
        if (!C3264g.m13620y() || (lastIndexOf = str.lastIndexOf(47)) <= 0 || (indexOf = str.indexOf(95, lastIndexOf)) <= lastIndexOf || (indexOf2 = str.indexOf(95, (i10 = indexOf + 1))) <= indexOf) {
            return str;
        }
        String m13236d = C3257g.m13236d("CrashSDK" + str.substring(lastIndexOf + 1, indexOf) + str.substring(i10, indexOf2));
        if (m13236d == null || (m13238e = C3257g.m13238e((file = new File(str)))) == null || m13238e.length <= 0) {
            return str;
        }
        try {
            bArr = C3253c.m13190b(m13238e, m13236d.substring(0, 16).getBytes());
        } catch (Throwable th) {
            C3257g.m13220a(th);
            bArr = null;
        }
        if (bArr == null) {
            return str;
        }
        String str2 = str + ".ec";
        File file2 = new File(str2 + ".tmp");
        if (!C3257g.m13224a(file2, bArr)) {
            return str;
        }
        if (!file2.renameTo(new File(str2))) {
            file2.delete();
            return str;
        }
        file.delete();
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13426a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes(Request.DEFAULT_CHARSET));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes(Request.DEFAULT_CHARSET));
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
        }
        C3257g.m13220a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0356 A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ad A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210 A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226 A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fc A[Catch: all -> 0x0441, TryCatch #1 {all -> 0x0441, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cc, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:129:0x03ba, B:131:0x03e0, B:133:0x03e7, B:135:0x03ee, B:137:0x03f5, B:139:0x03fc, B:141:0x0403, B:146:0x0415, B:148:0x041c, B:150:0x0423, B:152:0x042a, B:153:0x040e, B:154:0x038a, B:155:0x03ad, B:157:0x03b2, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0432), top: B:4:0x000a, outer: #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13424a(java.lang.String r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13424a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static boolean m13436a(boolean z10, boolean z11) {
        if (!f13809d) {
            if (C3259b.f13741d) {
                JNIBridge.set(1, true);
            }
            f13809d = true;
        }
        try {
            String m13487k = m13487k();
            if (C3257g.m13225a(m13487k)) {
                C3251a.m13168a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            if (C3256f.m13206a(z10 ? 1 : 0, new RunnableC3255e(406, new Object[]{m13487k, Boolean.valueOf(z11), Boolean.valueOf(z10)})) && z10) {
                f13819o.close();
                if (!r6.block(3000L)) {
                    C3251a.m13168a("crashsdk", "timeout to wait for uploading");
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* renamed from: a */
    private static boolean m13432a(String str, RunnableC3255e runnableC3255e) {
        boolean z10;
        FileChannel fileChannel;
        Exception e10;
        synchronized (f13820p) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e11) {
                    C3257g.m13220a(e11);
                }
            }
            Object r52 = 0;
            r5 = null;
            FileLock lock = null;
            z10 = false;
            try {
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r52 = file;
                        C3257g.m13218a((Closeable) r52);
                        throw th;
                    }
                } catch (Exception e12) {
                    try {
                        C3257g.m13220a(e12);
                        fileChannel = null;
                    } catch (Exception e13) {
                        fileChannel = null;
                        e10 = e13;
                        C3257g.m13220a(e10);
                        C3257g.m13218a(fileChannel);
                        return z10;
                    }
                }
                if (fileChannel != null) {
                    try {
                        lock = fileChannel.lock();
                    } catch (Exception e14) {
                        try {
                            C3257g.m13220a(e14);
                        } catch (Exception e15) {
                            e10 = e15;
                            C3257g.m13220a(e10);
                            C3257g.m13218a(fileChannel);
                            return z10;
                        }
                    }
                }
                try {
                    z10 = runnableC3255e.m13201a();
                    C3257g.m13218a(fileChannel);
                } finally {
                    if (lock != null) {
                        try {
                            lock.release();
                        } catch (Exception e16) {
                            C3257g.m13220a(e16);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z10;
    }

    /* renamed from: a */
    private static boolean m13433a(String str, d dVar) {
        String m13212a = C3257g.m13212a(new File(str), 64, false);
        if (m13212a == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(m13212a);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.f13838b = Long.parseLong(matcher.group(2));
                    dVar.f13839c = Integer.parseInt(matcher.group(3));
                    dVar.f13840d = Integer.parseInt(matcher.group(4));
                    dVar.f13837a = parseLong;
                }
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* renamed from: a */
    public static boolean m13435a(StringBuffer stringBuffer, String str, long j10, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j11;
        boolean z10;
        boolean m13431a;
        if (f13808c.get()) {
            C3251a.m13170b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z11 = f13806ag || C3259b.m13307L();
        if (!z11 && !C3254d.m13198e()) {
            C3251a.m13172c("DEBUG", C3254d.m13195b());
            return false;
        }
        if (!m13464d(str)) {
            C3251a.m13173d("DEBUG", "custom log sample miss: " + str);
            return false;
        }
        if (m13437aa()) {
            C3251a.m13170b("Processing native crash, skip generate custom log: " + str);
            return false;
        }
        if (stringBuffer == null || str == null) {
            return false;
        }
        String str3 = C3264g.m13579Y() + m13488k(str);
        Object r11 = (j10 & 32) != 0 ? 1 : 0;
        if (z11) {
            long nativeClientCreateConnection = C3259b.f13741d ? JNIBridge.nativeClientCreateConnection(str3, "custom", str, r11) : 0L;
            if (nativeClientCreateConnection == 0) {
                C3251a.m13173d("DEBUG", "skip custom log: " + str);
                return false;
            }
            j11 = nativeClientCreateConnection;
        } else {
            if (m13434a(m13481h(), str, (boolean) r11)) {
                return false;
            }
            C3264g.m13584a();
            m13428a(false);
            j11 = 0;
        }
        synchronized (f13821q) {
            z10 = r11;
            m13431a = m13431a(str3, j11, stringBuffer, str, j10, arrayList, arrayList2, arrayList3, str2);
        }
        if (m13431a && !z11) {
            m13449b(m13481h(), str, z10);
        }
        if (j11 != 0) {
            JNIBridge.nativeClientCloseConnection(j11);
        }
        if (!m13431a) {
            return false;
        }
        if (!z11) {
            m13502r(str3);
        }
        if (!z11) {
            str3 = m13412a(m13491m(str3));
        }
        m13448b(str3, str);
        if (!z10 || z11) {
            return true;
        }
        try {
            m13436a(true, false);
            return true;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m13434a(String str, String str2, boolean z10) {
        if (!m13496o(str2)) {
            return false;
        }
        C3258h.m13262a(str, str2, true, z10);
        C3251a.m13170b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    /* renamed from: a */
    private static void m13420a(a aVar, String str, long j10) {
        String nativeDumpThreads;
        String str2 = null;
        if (C3259b.f13741d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
            nativeDumpThreads = JNIBridge.nativeDumpThreads(str, j10);
            if (f13806ag || nativeDumpThreads == null || nativeDumpThreads.length() >= 512 || !nativeDumpThreads.startsWith(Operator.Operation.DIVISION) || nativeDumpThreads.indexOf(10) >= 0) {
                str2 = nativeDumpThreads;
            } else {
                if (!new File(nativeDumpThreads).exists()) {
                    str2 = "Can not found " + nativeDumpThreads;
                }
                String str3 = str2;
                str2 = nativeDumpThreads;
                nativeDumpThreads = str3;
            }
        } else {
            nativeDumpThreads = "Native not initialized, skip dump!";
        }
        if (nativeDumpThreads != null) {
            try {
                aVar.write(nativeDumpThreads.getBytes(Request.DEFAULT_CHARSET));
                aVar.write("\n".getBytes(Request.DEFAULT_CHARSET));
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
            m13421a((OutputStream) aVar);
        } else if (str2 != null && !f13806ag) {
            m13439b(aVar, str2, LogType.ANR);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            C3257g.m13220a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13431a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13431a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static String m13415a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13423a(OutputStream outputStream, String str, String str2, int i10, boolean z10, boolean z11) {
        f13812h = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i10);
            objArr[3] = Integer.valueOf(z10 ? 1 : 0);
            objArr[4] = Integer.valueOf(z11 ? 1 : 0);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        f13812h = true;
        m13421a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13422a(OutputStream outputStream, String str, String str2) {
        f13812h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes(Request.DEFAULT_CHARSET));
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        f13812h = true;
    }

    /* renamed from: a */
    public static void m13418a(Context context) {
        try {
            if (m13402V()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, C3256f.m13202a(3));
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:347|(3:382|383|(15:386|387|388|(1:352)|353|354|355|356|(1:358)|359|(1:363)|364|(1:367)|369|(1:375)(2:373|374)))|349|(1:352)|353|354|355|356|(0)|359|(2:361|363)|364|(1:367)|369|(2:371|375)(1:376)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:398|(3:433|434|(15:437|438|439|(1:403)|404|405|406|407|(1:409)|410|(1:414)|415|(1:418)|420|(1:426)(2:424|425)))|400|(1:403)|404|405|406|407|(0)|410|(2:412|414)|415|(1:418)|420|(2:422|426)(1:427)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:82|(3:117|118|(15:121|122|123|(1:87)|88|89|90|91|(1:93)|94|(1:98)|99|(1:102)|104|(1:110)(2:108|109)))|84|(1:87)|88|89|90|91|(0)|94|(2:96|98)|99|(1:102)|104|(2:106|110)(1:111)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:11|(4:13|(6:16|17|18|19|(1:21)(1:23)|14)|28|22)|(3:64|65|(15:68|69|70|(1:33)|34|35|36|37|(1:39)|40|(1:44)|45|(1:48)|50|(1:57)(2:54|55)))|30|(1:33)|34|35|36|37|(0)|40|(2:42|44)|45|(1:48)|50|(2:52|57)(1:58)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:214|(1:218)|(3:253|254|(15:257|258|259|(1:223)|224|225|226|227|(1:229)|230|(1:234)|235|(1:238)|240|(1:246)(2:244|245)))|220|(1:223)|224|225|226|227|(0)|230|(2:232|234)|235|(1:238)|240|(2:242|246)(1:247)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:159|160|(1:164)|(3:199|200|(15:203|204|205|(1:169)|170|171|172|173|(1:175)|176|(1:180)|181|(1:184)|186|(1:192)(2:190|191)))|166|(1:169)|170|171|172|173|(0)|176|(2:178|180)|181|(1:184)|186|(2:188|192)(1:193)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:517|518|(2:520|(1:522))|(3:557|558|(16:561|562|563|564|(1:527)|528|529|530|531|(0)|534|(2:536|538)|539|(1:542)|544|(0)(0)))|524|(0)|528|529|530|531|(0)|534|(0)|539|(0)|544|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:458|459|(1:461)|463|(1:467)|(3:502|503|(16:506|507|508|509|(1:472)|473|474|475|476|(1:478)|479|(1:483)|484|(1:487)|489|(1:495)(2:493|494)))|469|(1:472)|473|474|475|476|(0)|479|(2:481|483)|484|(1:487)|489|(2:491|495)(1:496)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013f, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0107, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ba, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0381, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0382, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x043e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x043f, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0406, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0407, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0292, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0293, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x025a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x025b, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0313, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0314, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x02db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02dc, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x05f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x05f9, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x05c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x05c1, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0080, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a2 A[Catch: all -> 0x03b9, TryCatch #19 {all -> 0x03b9, blocks: (B:173:0x0386, B:176:0x0391, B:178:0x03a2, B:180:0x03a6, B:181:0x03a9, B:184:0x03b1), top: B:172:0x0386 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0427 A[Catch: all -> 0x043e, TryCatch #20 {all -> 0x043e, blocks: (B:227:0x040b, B:230:0x0416, B:232:0x0427, B:234:0x042b, B:235:0x042e, B:238:0x0436), top: B:226:0x040b }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0434 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0488 A[Catch: all -> 0x055c, TryCatch #44 {all -> 0x055c, blocks: (B:267:0x0458, B:270:0x046a, B:272:0x0470, B:274:0x0488, B:275:0x048b, B:278:0x04b9, B:282:0x04b6, B:159:0x034a, B:277:0x04b0), top: B:150:0x0203, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x052a A[Catch: all -> 0x0541, TryCatch #26 {all -> 0x0541, blocks: (B:296:0x050e, B:299:0x0519, B:301:0x052a, B:303:0x052e, B:304:0x0531, B:307:0x0539), top: B:295:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x027b A[Catch: all -> 0x0292, TryCatch #36 {all -> 0x0292, blocks: (B:356:0x025f, B:359:0x026a, B:361:0x027b, B:363:0x027f, B:364:0x0282, B:367:0x028a), top: B:355:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:376:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02fc A[Catch: all -> 0x0313, TryCatch #38 {all -> 0x0313, blocks: (B:407:0x02e0, B:410:0x02eb, B:412:0x02fc, B:414:0x0300, B:415:0x0303, B:418:0x030b), top: B:406:0x02e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:427:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x00b7, TryCatch #17 {all -> 0x00b7, blocks: (B:37:0x0084, B:40:0x008f, B:42:0x00a0, B:44:0x00a4, B:45:0x00a7, B:48:0x00af), top: B:36:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x05e1 A[Catch: all -> 0x05f8, TryCatch #18 {all -> 0x05f8, blocks: (B:476:0x05c5, B:479:0x05d0, B:481:0x05e1, B:483:0x05e5, B:484:0x05e8, B:487:0x05f0), top: B:475:0x05c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:496:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x063e A[ADDED_TO_REGION, DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0656 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0668 A[Catch: all -> 0x067f, DONT_GENERATE, FINALLY_INSNS, TryCatch #22 {all -> 0x067f, blocks: (B:531:0x064c, B:534:0x0657, B:536:0x0668, B:538:0x066c, B:539:0x066f, B:542:0x0677), top: B:530:0x064c }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0675 A[ADDED_TO_REGION, DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x068c A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:551:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127 A[Catch: all -> 0x013e, TryCatch #21 {all -> 0x013e, blocks: (B:91:0x010b, B:94:0x0116, B:96:0x0127, B:98:0x012b, B:99:0x012e, B:102:0x0136), top: B:90:0x010b }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [long] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:436:0x0218 -> B:331:0x0220). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:439:0x021d -> B:331:0x0220). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13512a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3262e.m13512a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    /* renamed from: a */
    private static void m13425a(Throwable th) {
        try {
            C3251a.m13173d("DEBUG", m13416a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m13427a(Calendar calendar) {
        if (C3264g.m13574T()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j10 = timeInMillis2 - timeInMillis;
            C3256f.m13207a(0, new RunnableC3255e(415, new Object[]{Long.valueOf(timeInMillis2)}), j10 <= 3600000 ? 1000 + j10 : 3600000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StringBuilder m13416a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z10 = str == null;
            int i11 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i11++;
                sb2.append("  at ");
                sb2.append(stackTraceElement.toString());
                sb2.append("\n");
                if (!z10 && stackTraceElement.getMethodName().contains(str)) {
                    sb2.delete(0, sb2.length());
                    z10 = true;
                    i11 = 0;
                }
            }
            i10 = i11;
        }
        if (i10 == 0) {
            sb2.append("  (no java stack)\n");
        }
        return sb2;
    }

    /* renamed from: a */
    public static boolean m13430a(ParcelFileDescriptor parcelFileDescriptor) {
        if (f13805af) {
            C3251a.m13173d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        }
        if (!C3259b.f13741d) {
            C3251a.m13173d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (f13804ae != null) {
            C3251a.m13172c("crashsdk", "Has already set host fd!");
        }
        f13804ae = parcelFileDescriptor;
        int fd2 = parcelFileDescriptor.getFd();
        int nativeCmd = (int) JNIBridge.nativeCmd(13, fd2, null, null);
        f13806ag = nativeCmd != -1;
        return fd2 == -1 || nativeCmd != -1;
    }
}
