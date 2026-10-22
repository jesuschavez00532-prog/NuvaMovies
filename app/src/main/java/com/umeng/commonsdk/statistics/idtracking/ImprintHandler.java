package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3349cq;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.InterfaceC3505d;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.C3515d;
import com.umeng.commonsdk.statistics.proto.C3516e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class ImprintHandler implements FileLockCallback {

    /* renamed from: a */
    private static final String f15429a = "ImprintHandler";

    /* renamed from: k */
    private static Context f15436k = null;

    /* renamed from: l */
    private static FileLockUtil f15437l = null;

    /* renamed from: m */
    private static final int f15438m = 0;

    /* renamed from: n */
    private static final int f15439n = 1;

    /* renamed from: e */
    private InterfaceC3505d f15442e;

    /* renamed from: h */
    private C3488a f15443h = new C3488a();

    /* renamed from: i */
    private C3515d f15444i = null;

    /* renamed from: b */
    private static Object f15430b = new Object();

    /* renamed from: c */
    private static final String f15431c = C3309bd.m13860b().m13863b(C3309bd.f14096c);

    /* renamed from: d */
    private static final byte[] f15432d = "pbl0".getBytes();

    /* renamed from: f */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f15433f = new HashMap();

    /* renamed from: g */
    private static Object f15434g = new Object();

    /* renamed from: j */
    private static ImprintHandler f15435j = null;

    /* renamed from: o */
    private static Map<String, UMImprintPreProcessCallback> f15440o = new HashMap();

    /* renamed from: p */
    private static Object f15441p = new Object();

    private ImprintHandler(Context context) {
        f15436k = context.getApplicationContext();
    }

    /* renamed from: a */
    private static void m14846a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f15434g) {
            try {
                int i10 = 0;
                if (f15433f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f15433f.get(str);
                    int size = arrayList.size();
                    ULog.m14801i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i10 < size) {
                        if (uMImprintChangeCallback == arrayList.get(i10)) {
                            ULog.m14801i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i10++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.m14801i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    ULog.m14801i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i10 < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i10)) {
                            ULog.m14801i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i10++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.m14801i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f15433f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f15436k, th);
            }
        }
    }

    /* renamed from: b */
    private static void m14848b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (f15434g) {
            try {
                if (f15433f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f15433f.get(str);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        ULog.m14801i("--->>> removeCallback: before remove: callbacks size is: " + size);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            if (uMImprintChangeCallback == arrayList.get(i10)) {
                                ULog.m14801i("--->>> removeCallback: remove index " + i10);
                                arrayList.remove(i10);
                                break;
                            }
                            i10++;
                        }
                        ULog.m14801i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            ULog.m14801i("--->>> removeCallback: remove key from map: key = " + str);
                            f15433f.remove(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    private boolean m14849c(C3515d c3515d) {
        if (!c3515d.m15060i().equals(m14853a(c3515d))) {
            return false;
        }
        for (C3516e c3516e : c3515d.m15053c().values()) {
            String m15093h = c3516e.m15093h();
            if (!TextUtils.isEmpty(m15093h)) {
                byte[] reverseHexString = DataHelper.reverseHexString(m15093h);
                byte[] m14857a = m14857a(c3516e);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (reverseHexString[i10] != m14857a[i10]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private C3515d m14850d(C3515d c3515d) {
        Map<String, C3516e> m15053c = c3515d.m15053c();
        if (m15053c.containsKey(C3325bt.f14264f)) {
            m15053c.remove(C3325bt.f14264f);
            this.f15443h.m14865a(C3325bt.f14264f);
            c3515d.m15045a(c3515d.m15057f());
            c3515d.m15046a(m14853a(c3515d));
        }
        return c3515d;
    }

    /* renamed from: e */
    private C3515d m14851e(C3515d c3515d) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z10;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, C3516e> m15053c = c3515d.m15053c();
        ArrayList<String> arrayList3 = new ArrayList(m15053c.size() / 2);
        Iterator<Map.Entry<String, C3516e>> it = m15053c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, C3516e> next = it.next();
            if (!next.getValue().m15089d()) {
                arrayList3.add(next.getKey());
            } else {
                String key = next.getKey();
                String str = next.getValue().f15595a;
                synchronized (f15441p) {
                    z10 = !TextUtils.isEmpty(key) && f15440o.containsKey(key) && (uMImprintPreProcessCallback = f15440o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                }
                if (z10) {
                    arrayList3.add(key);
                }
                synchronized (f15434g) {
                    if (!TextUtils.isEmpty(key) && f15433f.containsKey(key) && (arrayList2 = f15433f.get(key)) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            arrayList2.get(i10).onImprintValueChanged(key, str);
                        }
                    }
                }
            }
        }
        for (String str2 : arrayList3) {
            synchronized (f15434g) {
                if (!TextUtils.isEmpty(str2) && f15433f.containsKey(str2) && (arrayList = f15433f.get(str2)) != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        arrayList.get(i11).onImprintValueChanged(str2, null);
                    }
                }
            }
            m15053c.remove(str2);
        }
        return c3515d;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (f15435j == null) {
                f15435j = new ImprintHandler(context);
                f15437l = new FileLockUtil();
                f15437l.doFileOperateion(new File(f15436k.getFilesDir(), f15431c), f15435j, 0);
            }
            imprintHandler = f15435j;
        }
        return imprintHandler;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m14846a(str, uMImprintChangeCallback);
        }
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintPreProcessCallback != null) {
            synchronized (f15441p) {
                try {
                    if (!f15440o.containsKey(str)) {
                        f15440o.put(str, uMImprintPreProcessCallback);
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                    }
                } finally {
                }
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m14848b(str, uMImprintChangeCallback);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    /* loaded from: classes3.dex */
    public static class C3488a {

        /* renamed from: a */
        private Map<String, String> f15445a = new HashMap();

        C3488a() {
        }

        /* renamed from: b */
        private synchronized void m14862b(C3515d c3515d) {
            C3516e c3516e;
            if (c3515d != null) {
                if (c3515d.m15056e()) {
                    Map<String, C3516e> m15053c = c3515d.m15053c();
                    for (String str : m15053c.keySet()) {
                        if (!TextUtils.isEmpty(str) && (c3516e = m15053c.get(str)) != null) {
                            String m15085b = c3516e.m15085b();
                            if (!TextUtils.isEmpty(m15085b)) {
                                this.f15445a.put(str, m15085b);
                                if (AnalyticsConstants.UM_DEBUG) {
                                    Log.i(ImprintHandler.f15429a, "imKey is " + str + ", imValue is " + m15085b);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public synchronized void m14865a(String str) {
            Map<String, String> map = this.f15445a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f15445a.containsKey(str)) {
                this.f15445a.remove(str);
            }
        }

        C3488a(C3515d c3515d) {
            m14864a(c3515d);
        }

        /* renamed from: a */
        public void m14864a(C3515d c3515d) {
            if (c3515d == null) {
                return;
            }
            m14862b(c3515d);
        }

        /* renamed from: a */
        public synchronized String m14863a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f15445a.size() > 0) {
                String str3 = this.f15445a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i10) {
        if (i10 == 0) {
            f15435j.m14852e();
        } else if (i10 == 1) {
            f15435j.m14845a(file);
        }
        return true;
    }

    /* renamed from: d */
    public void m14861d() {
        if (this.f15444i == null || f15437l == null) {
            return;
        }
        File file = new File(f15436k.getFilesDir(), f15431c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    UMCrashManager.reportCrash(f15436k, e10);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f15437l.doFileOperateion(file, f15435j, 1);
    }

    /* renamed from: c */
    public C3488a m14860c() {
        return this.f15443h;
    }

    /* renamed from: b */
    public void m14859b(C3515d c3515d) {
        C3515d m14844a;
        boolean z10;
        if (c3515d == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m14567d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!m14849c(c3515d)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        String str = AnalyticsConstants.f15384OS;
        HashMap hashMap = new HashMap();
        synchronized (this) {
            C3515d c3515d2 = this.f15444i;
            C3515d m14850d = m14850d(c3515d);
            String str2 = null;
            String m15060i = c3515d2 == null ? null : c3515d2.m15060i();
            if (c3515d2 == null) {
                m14844a = m14851e(m14850d);
            } else {
                m14844a = m14844a(c3515d2, m14850d, hashMap);
            }
            this.f15444i = m14844a;
            if (m14844a != null) {
                str2 = m14844a.m15060i();
            }
            z10 = !m14847a(m15060i, str2);
        }
        C3515d c3515d3 = this.f15444i;
        if (c3515d3 != null && z10) {
            this.f15443h.m14864a(c3515d3);
            InterfaceC3505d interfaceC3505d = this.f15442e;
            if (interfaceC3505d != null) {
                interfaceC3505d.onImprintChanged(this.f15443h);
            }
        }
        if (hashMap.size() > 0) {
            synchronized (f15434g) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && f15433f.containsKey(key)) {
                        ULog.m14801i("--->>> target imprint key is: " + key + "; value is: " + value);
                        ArrayList<UMImprintChangeCallback> arrayList = f15433f.get(key);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                arrayList.get(i10).onImprintValueChanged(key, value);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m14855a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f15441p) {
            try {
                if (f15440o.containsKey(str)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f15433f.remove(str);
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.Context] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14852e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f15436k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f15431c
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f15430b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            return
        L18:
            r0 = 0
            android.content.Context r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f15436k     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.io.FileInputStream r2 = r3.openFileInput(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L59
        L23:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L5e
            goto L34
        L27:
            r3 = move-exception
            goto L30
        L29:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L5a
        L2e:
            r3 = move-exception
            r2 = r0
        L30:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L59
            goto L23
        L34:
            if (r0 == 0) goto L57
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.analytics.pro.ck r3 = new com.umeng.analytics.pro.ck     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r3.m14084a(r2, r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r5.f15444i = r2     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f15443h     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r0.m14864a(r2)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f15444i     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            com.umeng.commonsdk.statistics.proto.d r0 = r5.m14850d(r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r5.f15444i = r0     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            goto L57
        L53:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5e
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            return
        L59:
            r0 = move-exception
        L5a:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            goto L62
        L61:
            throw r0
        L62:
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m14852e():void");
    }

    /* renamed from: a */
    public void m14854a(InterfaceC3505d interfaceC3505d) {
        this.f15442e = interfaceC3505d;
    }

    /* renamed from: a */
    public String m14853a(C3515d c3515d) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c3515d.m15053c()).entrySet()) {
            sb2.append((String) entry.getKey());
            if (((C3516e) entry.getValue()).m15089d()) {
                sb2.append(((C3516e) entry.getValue()).m15085b());
            }
        }
        sb2.append(c3515d.f15577b);
        return HelperUtils.MD5(sb2.toString()).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public byte[] m14857a(C3516e c3516e) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(c3516e.m15090e());
        byte[] array = allocate.array();
        byte[] bArr = f15432d;
        byte[] bArr2 = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            bArr2[i10] = (byte) (array[i10] ^ bArr[i10]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public byte[] m14856a() {
        try {
            synchronized (this) {
                C3515d c3515d = this.f15444i;
                if (c3515d == null) {
                    return null;
                }
                if (c3515d.m15050b() <= 0) {
                    return null;
                }
                return new C3349cq().m14096a(this.f15444i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15436k, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized C3515d m14858b() {
        return this.f15444i;
    }

    /* renamed from: a */
    private boolean m14847a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    private C3515d m14844a(C3515d c3515d, C3515d c3515d2, Map<String, String> map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList<UMImprintChangeCallback> arrayList;
        if (c3515d2 == null) {
            return c3515d;
        }
        Map<String, C3516e> m15053c = c3515d.m15053c();
        for (Map.Entry<String, C3516e> entry : c3515d2.m15053c().entrySet()) {
            int i10 = 0;
            if (entry.getValue().m15089d()) {
                String key = entry.getKey();
                String str = entry.getValue().f15595a;
                synchronized (f15441p) {
                    if (!TextUtils.isEmpty(key) && f15440o.containsKey(key) && (uMImprintPreProcessCallback = f15440o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i10 = 1;
                    }
                }
                if (i10 == 0) {
                    m15053c.put(entry.getKey(), entry.getValue());
                    synchronized (f15434g) {
                        if (!TextUtils.isEmpty(key) && f15433f.containsKey(key) && f15433f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f15434g) {
                    if (!TextUtils.isEmpty(key2) && f15433f.containsKey(key2) && (arrayList = f15433f.get(key2)) != null) {
                        while (i10 < arrayList.size()) {
                            arrayList.get(i10).onImprintValueChanged(key2, null);
                            i10++;
                        }
                    }
                }
                m15053c.remove(key2);
                this.f15443h.m14865a(key2);
            }
        }
        c3515d.m15045a(c3515d2.m15057f());
        c3515d.m15046a(m14853a(c3515d));
        return c3515d;
    }

    /* renamed from: a */
    private void m14845a(File file) {
        if (this.f15444i == null) {
            return;
        }
        try {
            synchronized (f15430b) {
                byte[] m14096a = new C3349cq().m14096a(this.f15444i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(m14096a);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
