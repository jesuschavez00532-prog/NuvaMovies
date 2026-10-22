package org.repackage.com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.taobao.accs.common.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class IdentifierIdClient {

    /* renamed from: A */
    private static int f23909A = 13;

    /* renamed from: B */
    private static IdentifierIdObserver f23910B = null;

    /* renamed from: C */
    private static IdentifierIdObserver f23911C = null;

    /* renamed from: D */
    private static IdentifierIdObserver f23912D = null;

    /* renamed from: E */
    private static IdentifierIdObserver f23913E = null;

    /* renamed from: F */
    private static HandlerThread f23914F = null;

    /* renamed from: G */
    private static Handler f23915G = null;

    /* renamed from: H */
    private static String f23916H = null;

    /* renamed from: I */
    private static String f23917I = null;

    /* renamed from: J */
    private static String f23918J = null;

    /* renamed from: K */
    private static String f23919K = null;

    /* renamed from: L */
    private static String f23920L = null;

    /* renamed from: M */
    private static String f23921M = null;

    /* renamed from: N */
    private static String f23922N = null;

    /* renamed from: O */
    private static volatile IdentifierIdClient f23923O = null;

    /* renamed from: P */
    private static volatile DataBaseOperation f23924P = null;

    /* renamed from: R */
    private static int f23925R = 0;

    /* renamed from: S */
    private static int f23926S = 0;

    /* renamed from: T */
    private static int f23927T = 0;

    /* renamed from: U */
    private static int f23928U = 0;

    /* renamed from: V */
    private static int f23929V = 0;

    /* renamed from: W */
    private static int f23930W = 0;

    /* renamed from: X */
    private static int f23931X = 0;

    /* renamed from: Y */
    private static int f23932Y = 0;

    /* renamed from: Z */
    private static int f23933Z = 0;

    /* renamed from: a */
    public static final String f23934a = "persist.sys.identifierid";

    /* renamed from: aa */
    private static int f23935aa = 0;

    /* renamed from: ab */
    private static int f23936ab = 0;

    /* renamed from: ac */
    private static int f23937ac = 0;

    /* renamed from: b */
    private static final String f23938b = "VMS_SDK_Client";

    /* renamed from: c */
    private static final String f23939c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: d */
    private static final String f23940d = "persist.sys.identifierid.supported";

    /* renamed from: e */
    private static final String f23941e = "com.vivo.vms";

    /* renamed from: f */
    private static final String f23942f = "appid";

    /* renamed from: g */
    private static final String f23943g = "type";

    /* renamed from: h */
    private static final String f23944h = "OAID";

    /* renamed from: i */
    private static final String f23945i = "VAID";

    /* renamed from: j */
    private static final String f23946j = "OAIDSTATUS";

    /* renamed from: k */
    private static Object f23947k = new Object();

    /* renamed from: l */
    private static final int f23948l = 0;

    /* renamed from: m */
    private static final int f23949m = 1;

    /* renamed from: n */
    private static final int f23950n = 2;

    /* renamed from: o */
    private static final int f23951o = 3;

    /* renamed from: p */
    private static final int f23952p = 4;

    /* renamed from: q */
    private static final int f23953q = 5;

    /* renamed from: r */
    private static final int f23954r = 6;

    /* renamed from: s */
    private static final int f23955s = 7;

    /* renamed from: t */
    private static final int f23956t = 8;

    /* renamed from: u */
    private static final int f23957u = 9;

    /* renamed from: v */
    private static final int f23958v = 10;

    /* renamed from: w */
    private static final int f23959w = 11;

    /* renamed from: x */
    private static final int f23960x = 2000;

    /* renamed from: y */
    private static Context f23961y;

    /* renamed from: z */
    private static boolean f23962z;

    /* renamed from: Q */
    private final int f23963Q;

    private IdentifierIdClient() {
        m24271D();
        f23924P = new DataBaseOperation(f23961y);
        this.f23963Q = m24286c(f23961y);
    }

    /* renamed from: C */
    private void m24270C() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new Runnable() { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                if (IdentifierIdClient.f23925R + IdentifierIdClient.f23926S + IdentifierIdClient.f23931X + IdentifierIdClient.f23935aa + IdentifierIdClient.f23927T + IdentifierIdClient.f23928U + IdentifierIdClient.f23933Z + IdentifierIdClient.f23935aa + IdentifierIdClient.f23929V + IdentifierIdClient.f23930W + IdentifierIdClient.f23936ab + IdentifierIdClient.f23937ac > 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("oaid", IdentifierIdClient.this.m24274a(IdentifierIdClient.f23925R, IdentifierIdClient.f23926S, IdentifierIdClient.f23931X, IdentifierIdClient.f23932Y));
                    contentValues.put("vaid", IdentifierIdClient.this.m24274a(IdentifierIdClient.f23927T, IdentifierIdClient.f23928U, IdentifierIdClient.f23933Z, IdentifierIdClient.f23935aa));
                    contentValues.put("aaid", IdentifierIdClient.this.m24274a(IdentifierIdClient.f23929V, IdentifierIdClient.f23930W, IdentifierIdClient.f23936ab, IdentifierIdClient.f23937ac));
                    IdentifierIdClient.f23924P.m24267a(7, "vivo", new ContentValues[]{contentValues});
                    int unused = IdentifierIdClient.f23925R = IdentifierIdClient.f23926S = IdentifierIdClient.f23927T = IdentifierIdClient.f23928U = IdentifierIdClient.f23929V = IdentifierIdClient.f23930W = 0;
                    int unused2 = IdentifierIdClient.f23931X = IdentifierIdClient.f23932Y = IdentifierIdClient.f23933Z = IdentifierIdClient.f23935aa = IdentifierIdClient.f23936ab = IdentifierIdClient.f23937ac = 0;
                }
            }
        }, 600L, 600L, TimeUnit.SECONDS);
    }

    /* renamed from: D */
    private static void m24271D() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f23914F = handlerThread;
        handlerThread.start();
        f23915G = new Handler(f23914F.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 11) {
                    int i10 = message.getData().getInt("type");
                    try {
                        String m24265a = IdentifierIdClient.f23924P.m24265a(i10, message.getData().getString(IdentifierIdClient.f23942f));
                        if (i10 == 0) {
                            String unused = IdentifierIdClient.f23916H = m24265a;
                            IdentifierIdClient.m24288c(8, IdentifierIdClient.f23916H);
                        } else if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        String unused2 = IdentifierIdClient.f23920L = m24265a;
                                    } else if (i10 == 5) {
                                        if (m24265a != null) {
                                            String unused3 = IdentifierIdClient.f23921M = m24265a;
                                        } else {
                                            Log.e(IdentifierIdClient.f23938b, "get guid failed");
                                        }
                                    }
                                } else if (m24265a != null) {
                                    String unused4 = IdentifierIdClient.f23919K = m24265a;
                                } else {
                                    Log.e(IdentifierIdClient.f23938b, "get udid failed");
                                }
                            } else {
                                if (m24265a != null) {
                                    String unused5 = IdentifierIdClient.f23918J = m24265a;
                                } else {
                                    Log.e(IdentifierIdClient.f23938b, "get aaid failed");
                                }
                                IdentifierIdClient.m24288c(10, IdentifierIdClient.f23918J);
                            }
                        } else {
                            if (m24265a != null) {
                                String unused6 = IdentifierIdClient.f23917I = m24265a;
                            } else {
                                Log.e(IdentifierIdClient.f23938b, "get vaid failed");
                            }
                            IdentifierIdClient.m24288c(9, IdentifierIdClient.f23917I);
                        }
                    } catch (Exception e10) {
                        Log.e(IdentifierIdClient.f23938b, "readException:" + e10.toString());
                    }
                    synchronized (IdentifierIdClient.f23947k) {
                        IdentifierIdClient.f23947k.notify();
                    }
                    return;
                }
                Log.e(IdentifierIdClient.f23938b, "message type valid");
            }
        };
    }

    /* renamed from: E */
    private static void m24272E() {
        boolean z10;
        if (!"1".equals(m24276a(f23940d, MessageService.MSG_DB_READY_REPORT)) && !"1".equals(m24276a(f23934a, MessageService.MSG_DB_READY_REPORT))) {
            z10 = false;
        } else {
            z10 = true;
        }
        f23962z = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m24326g() {
        String str = f23918J;
        if (str != null) {
            m24288c(2, str);
            return f23918J;
        }
        m24294e(2, "vivo");
        if (f23912D == null) {
            m24279a(f23961y, 2, "vivo");
        }
        m24288c(2, f23918J);
        return f23918J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m24327h() {
        String str = f23918J;
        if (str != null) {
            m24288c(2, str);
            return f23918J;
        }
        m24291d(2, "vivo");
        if (f23912D == null) {
            m24279a(f23961y, 2, "vivo");
        }
        m24288c(2, f23918J);
        return f23918J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m24328i() {
        m24294e(4, null);
        return f23920L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public String m24329j() {
        String str = f23921M;
        if (str != null) {
            return str;
        }
        m24294e(5, "vivo");
        return f23921M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public String m24330k() {
        String str = f23921M;
        if (str != null) {
            return str;
        }
        m24291d(5, "vivo");
        return f23921M;
    }

    /* renamed from: c */
    private static int m24286c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f23941e, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m24323d() {
        String str = f23916H;
        if (str != null) {
            m24288c(0, str);
            return f23916H;
        }
        m24291d(0, null);
        if (f23910B == null) {
            m24279a(f23961y, 0, null);
        }
        m24288c(0, f23916H);
        return f23916H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m24324e() {
        String str = f23917I;
        if (str != null) {
            m24288c(1, str);
            return f23917I;
        }
        m24294e(1, "vivo");
        if (f23911C == null) {
            m24279a(f23961y, 1, "vivo");
        }
        m24288c(1, f23917I);
        return f23917I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m24325f() {
        String str = f23917I;
        if (str != null) {
            m24288c(1, str);
            return f23917I;
        }
        m24291d(1, "vivo");
        if (f23911C == null) {
            m24279a(f23961y, 1, "vivo");
        }
        m24288c(1, f23917I);
        return f23917I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m24274a(int i10, int i11, int i12, int i13) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i10);
        stringBuffer.append(",");
        stringBuffer.append(i11);
        stringBuffer.append(";");
        stringBuffer.append(i12);
        stringBuffer.append(",");
        stringBuffer.append(i13);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static IdentifierIdClient m24283b(Context context) {
        if (m24280a()) {
            return m24278a(context);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static IdentifierIdClient m24278a(Context context) {
        if (f23961y == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f23961y = context;
        }
        if (f23923O == null) {
            synchronized (IdentifierIdClient.class) {
                if (f23923O == null) {
                    f23923O = new IdentifierIdClient();
                    f23923O.m24270C();
                }
            }
        }
        return f23923O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m24320b() {
        String str = f23919K;
        if (str != null) {
            return str;
        }
        m24294e(3, null);
        return f23919K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m24322c() {
        String str = f23916H;
        if (str != null) {
            m24288c(0, str);
            return f23916H;
        }
        m24294e(0, null);
        if (f23910B == null) {
            m24279a(f23961y, 0, null);
        }
        m24288c(0, f23916H);
        return f23916H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List m24321b(List<String> list) {
        if (this.f23963Q < f23909A) {
            return null;
        }
        if (list != null && list.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String[] split = list.get(i10).split(":");
                    if (split.length == 2) {
                        arrayList.add(Boolean.valueOf(f23924P.m24266a(6, "vivo", split[0], split[1])));
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                Log.e(f23938b, "delete OAIDBLACK failure");
                return null;
            }
        }
        Log.e(f23938b, "List is null when delete OAIDBLACK");
        return null;
    }

    /* renamed from: d */
    private void m24291d(int i10, String str) {
        m24318a(i10, str);
    }

    /* renamed from: e */
    private void m24294e(int i10, String str) {
        synchronized (f23947k) {
            m24318a(i10, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f23947k.wait(2000L);
            } catch (InterruptedException unused) {
                Log.e(f23938b, "queryId: lock error");
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d(f23938b, "query timeout");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m24280a() {
        if (!f23962z) {
            m24272E();
        }
        return f23962z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m24288c(int i10, String str) {
        if (i10 == 0) {
            if (str == null) {
                f23926S++;
                return;
            } else {
                f23925R++;
                return;
            }
        }
        if (i10 == 1) {
            if (str == null) {
                f23928U++;
                return;
            } else {
                f23927T++;
                return;
            }
        }
        if (i10 == 2) {
            if (str == null) {
                f23930W++;
                return;
            } else {
                f23929V++;
                return;
            }
        }
        switch (i10) {
            case 8:
                if (str == null) {
                    f23932Y++;
                    return;
                } else {
                    f23931X++;
                    return;
                }
            case 9:
                if (str == null) {
                    f23935aa++;
                    return;
                } else {
                    f23933Z++;
                    return;
                }
            case 10:
                if (str == null) {
                    f23937ac++;
                    return;
                } else {
                    f23936ab++;
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m24319a(List<String> list) {
        if (this.f23963Q < f23909A) {
            return false;
        }
        if (list != null && list.size() != 0) {
            try {
                ContentValues[] contentValuesArr = new ContentValues[list.size()];
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ContentValues contentValues = new ContentValues();
                    String[] split = list.get(i10).split(":");
                    if (split.length != 2) {
                        return false;
                    }
                    String str = split[0];
                    String str2 = split[1];
                    contentValues.put(Constants.KEY_PACKAGE_NAME, str);
                    contentValues.put("uid", str2);
                    contentValues.put("value", format);
                    contentValuesArr[i10] = contentValues;
                }
                return f23924P.m24267a(6, "vivo", contentValuesArr);
            } catch (Exception unused) {
                Log.e(f23938b, "insert OAIDBLACK failure");
                return false;
            }
        }
        Log.e(f23938b, "List is null when insert OAIDBLACK");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24318a(int i10, String str) {
        Message obtainMessage = f23915G.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        if (i10 == 1 || i10 == 2 || i10 == 6) {
            bundle.putString(f23942f, str);
        }
        obtainMessage.setData(bundle);
        f23915G.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    private static String m24276a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, MessageService.MSG_DB_READY_REPORT);
            } catch (Exception e10) {
                Log.e(f23938b, "getProperty: invoke is error" + e10.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static synchronized void m24279a(Context context, int i10, String str) {
        synchronized (IdentifierIdClient.class) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (f23912D == null) {
                            f23912D = new IdentifierIdObserver(f23923O, 2, str);
                            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, f23912D);
                        }
                    }
                } else if (f23911C == null) {
                    f23911C = new IdentifierIdObserver(f23923O, 1, str);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f23911C);
                }
            } else if (f23910B == null) {
                f23910B = new IdentifierIdObserver(f23923O, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f23910B);
            }
        }
    }
}
