package com.umeng.commonsdk.stateless;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.C3521a;
import java.io.File;
import java.util.LinkedList;

/* renamed from: com.umeng.commonsdk.stateless.b */
/* loaded from: classes3.dex */
public class C3478b {

    /* renamed from: a */
    public static final int f15365a = 273;

    /* renamed from: b */
    private static Context f15366b = null;

    /* renamed from: c */
    private static HandlerThread f15367c = null;

    /* renamed from: d */
    private static Handler f15368d = null;

    /* renamed from: f */
    private static final int f15370f = 274;

    /* renamed from: g */
    private static final int f15371g = 275;

    /* renamed from: h */
    private static final int f15372h = 512;

    /* renamed from: i */
    private static a f15373i;

    /* renamed from: j */
    private static IntentFilter f15374j;

    /* renamed from: k */
    private static volatile boolean f15375k;

    /* renamed from: e */
    private static Object f15369e = new Object();

    /* renamed from: l */
    private static LinkedList<String> f15376l = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.commonsdk.stateless.b$a */
    /* loaded from: classes3.dex */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i10, String str) {
            if ((i10 & 8) == 8) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                C3478b.m14696a(C3478b.f15370f);
            }
        }
    }

    public C3478b(Context context) {
        synchronized (f15369e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f15366b = applicationContext;
                    if (applicationContext != null && f15367c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f15367c = handlerThread;
                        handlerThread.start();
                        if (f15373i == null) {
                            String str = f15366b.getFilesDir() + File.separator + C3477a.f15360f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            f15373i = aVar;
                            aVar.startWatching();
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f15368d == null) {
                            f15368d = new Handler(f15367c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i10 = message.what;
                                    if (i10 != 512) {
                                        switch (i10) {
                                            case C3478b.f15365a /* 273 */:
                                                C3478b.m14710l();
                                                return;
                                            case C3478b.f15370f /* 274 */:
                                                C3478b.m14712n();
                                                return;
                                            case C3478b.f15371g /* 275 */:
                                                C3478b.m14714p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    C3478b.m14715q();
                                }
                            };
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14697a(boolean z10) {
        f15375k = z10;
        if (z10) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            m14700b(f15370f);
        } else {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
        }
    }

    /* renamed from: b */
    public static void m14700b(int i10) {
        Handler handler;
        try {
            if (!f15375k || (handler = f15368d) == null || handler.hasMessages(i10)) {
                return;
            }
            Message obtainMessage = f15368d.obtainMessage();
            obtainMessage.what = i10;
            f15368d.sendMessage(obtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15366b, th);
        }
    }

    /* renamed from: c */
    public static void m14701c() {
        m14700b(f15371g);
    }

    /* renamed from: d */
    public static void m14702d() {
        m14700b(512);
    }

    /* renamed from: i */
    private static void m14707i() {
        File[] m14734c = C3480d.m14734c(f15366b);
        if (m14734c != null) {
            if (f15376l.size() > 0) {
                f15376l.clear();
            }
            for (File file : m14734c) {
                f15376l.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: j */
    private static String m14708j() {
        String str = null;
        try {
            String peek = f15376l.peek();
            if (peek != null) {
                try {
                    f15376l.removeFirst();
                    return peek;
                } catch (Throwable unused) {
                    str = peek;
                    return str;
                }
            }
            return peek;
        } catch (Throwable unused2) {
        }
    }

    @TargetApi(9)
    /* renamed from: k */
    private static void m14709k() {
        String pollFirst;
        byte[] bArr;
        String str;
        String str2;
        if (f15376l.size() <= 0) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            pollFirst = f15376l.pollFirst();
            if (!TextUtils.isEmpty(pollFirst)) {
                File file = new File(pollFirst);
                if (!file.exists()) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                } else {
                    C3479c c3479c = new C3479c(f15366b);
                    try {
                        bArr = C3480d.m14727a(pollFirst);
                    } catch (Exception unused) {
                        bArr = null;
                    }
                    String name = file.getName();
                    if (!TextUtils.isEmpty(name)) {
                        str = name.substring(0, 1);
                    } else {
                        str = C3325bt.f14196aN;
                    }
                    String m14733c = C3480d.m14733c(C3480d.m14735d(name));
                    if (SdkVersion.SDK_TYPE == 0) {
                        c3479c.m14717a();
                    } else {
                        C3477a.f15361g = C3477a.f15364j;
                        c3479c.m14719b();
                    }
                    if (C3521a.f15707c.equalsIgnoreCase(m14733c)) {
                        str2 = C3521a.f15705a;
                    } else {
                        str2 = C3477a.f15362h;
                    }
                    if (c3479c.m14718a(bArr, m14733c, str2, str) && !file.delete()) {
                        file.delete();
                    }
                }
            }
        } while (pollFirst != null);
        f15376l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static void m14710l() {
        File m14721a;
        byte[] bArr;
        String str;
        if (!f15375k || f15366b == null) {
            return;
        }
        do {
            try {
                m14721a = C3480d.m14721a(f15366b);
                if (m14721a != null && m14721a.getParentFile() != null && !TextUtils.isEmpty(m14721a.getParentFile().getName())) {
                    C3479c c3479c = new C3479c(f15366b);
                    String str2 = new String(Base64.decode(m14721a.getParentFile().getName(), 0));
                    if (!C3452a.f15261a.equalsIgnoreCase(str2) && !C3452a.f15262b.equalsIgnoreCase(str2) && !C3452a.f15256H.equalsIgnoreCase(str2)) {
                        ULog.m14804i("walle", "[stateless] handleProcessNext, pathUrl is " + str2);
                        try {
                            bArr = C3480d.m14727a(m14721a.getAbsolutePath());
                        } catch (Exception unused) {
                            bArr = null;
                        }
                        String str3 = C3325bt.f14196aN;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str2)) {
                            str3 = C3325bt.f14190aH;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str2) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str2) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str2)) {
                            str3 = C3325bt.f14186aD;
                        }
                        if (SdkVersion.SDK_TYPE == 0) {
                            c3479c.m14717a();
                        } else {
                            C3477a.f15361g = C3477a.f15364j;
                            c3479c.m14719b();
                        }
                        if (C3521a.f15707c.equalsIgnoreCase(str2)) {
                            str = C3521a.f15705a;
                        } else {
                            str = C3477a.f15362h;
                        }
                        if (c3479c.m14718a(bArr, str2, str, str3)) {
                            ULog.m14804i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(m14721a.getAbsolutePath());
                            if (!file.delete()) {
                                ULog.m14804i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                            }
                        } else {
                            ULog.m14804i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                    new File(m14721a.getAbsolutePath()).delete();
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f15366b, th);
            }
        } while (m14721a != null);
        m14711m();
    }

    /* renamed from: m */
    private static void m14711m() {
        try {
            File file = new File(f15366b.getFilesDir() + File.separator + C3477a.f15359e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                C3480d.m14726a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m14712n() {
        if (f15375k && f15366b != null) {
            m14707i();
            m14709k();
            m14701c();
        }
    }

    /* renamed from: o */
    private static void m14713o() {
        try {
            File file = new File(f15366b.getFilesDir() + File.separator + C3477a.f15359e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                m14700b(f15365a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m14714p() {
        m14713o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m14715q() {
    }

    /* renamed from: a */
    public static boolean m14698a() {
        synchronized (f15369e) {
            return f15373i != null;
        }
    }

    /* renamed from: b */
    public static void m14699b() {
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m14700b(f15370f);
    }

    /* renamed from: a */
    public static void m14696a(int i10) {
        Handler handler;
        if (!f15375k || (handler = f15368d) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i10;
        f15368d.sendMessage(obtainMessage);
    }
}
