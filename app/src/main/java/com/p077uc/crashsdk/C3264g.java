package com.p077uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import com.p077uc.crashsdk.export.CustomInfo;
import com.p077uc.crashsdk.export.VersionInfo;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3254d;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.C3258h;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.youth.banner.BannerConfig;
import java.io.File;
import java.lang.reflect.Field;

/* renamed from: com.uc.crashsdk.g */
/* loaded from: classes3.dex */
public class C3264g {

    /* renamed from: a */
    public static RuntimeException f13853a = null;

    /* renamed from: b */
    public static RuntimeException f13854b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f13855c = true;

    /* renamed from: d */
    private static CustomInfo f13856d;

    /* renamed from: e */
    private static VersionInfo f13857e;

    /* renamed from: g */
    private static String f13859g;

    /* renamed from: h */
    private static String f13860h;

    /* renamed from: i */
    private static String f13861i;

    /* renamed from: j */
    private static String f13862j;

    /* renamed from: f */
    private static final Object f13858f = new Object();

    /* renamed from: k */
    private static final Object f13863k = new Object();

    /* renamed from: A */
    public static String m13555A() {
        return f13856d.mCrashRateUploadUrl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m13556B() {
        return f13856d.mLogMaxBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m13557C() {
        return f13856d.mLogMaxUploadBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static long m13558D() {
        return f13856d.mMaxUploadBytesPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m13559E() {
        return f13856d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m13560F() {
        return f13856d.mMaxUploadCustomLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m13561G() {
        return f13856d.mMaxCustomLogCountPerTypePerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m13562H() {
        return f13856d.mInfoUpdateInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m13563I() {
        return f13856d.mInfoSaveFrequency;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m13564J() {
        return f13856d.mReservedJavaFileHandleCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static int m13565K() {
        return f13856d.mFdDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m13566L() {
        return f13856d.mThreadsDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static boolean m13567M() {
        return f13856d.mAutoDetectLifeCycle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m13568N() {
        return f13856d.mMonitorBattery;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m13569O() {
        return f13856d.mAnrTraceStrategy;
    }

    /* renamed from: P */
    public static boolean m13570P() {
        CustomInfo customInfo = f13856d;
        if (customInfo != null && !customInfo.mDebug) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static boolean m13571Q() {
        CustomInfo customInfo = f13856d;
        if (customInfo != null && !customInfo.mPrintStackInfos) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static boolean m13572R() {
        return f13856d.mEnableStatReport;
    }

    /* renamed from: S */
    public static boolean m13573S() {
        return f13856d.mIsInternational;
    }

    /* renamed from: T */
    public static boolean m13574T() {
        return f13856d.mAddPvForNewDay;
    }

    /* renamed from: U */
    public static String m13575U() {
        if (C3257g.m13225a(f13857e.mVersion)) {
            return C3250a.m13135a();
        }
        return m13583a(f13857e.mVersion);
    }

    /* renamed from: V */
    public static String m13576V() {
        if (C3257g.m13225a(f13857e.mSubVersion)) {
            return "release";
        }
        return f13857e.mSubVersion;
    }

    /* renamed from: W */
    public static String m13577W() {
        if (C3257g.m13225a(f13857e.mBuildId)) {
            return m13593ae();
        }
        return m13583a(f13857e.mBuildId);
    }

    /* renamed from: X */
    public static String m13578X() {
        if (f13860h == null) {
            f13860h = C3257g.m13227b() + File.separatorChar + f13856d.mTagFilesFolderName + File.separatorChar;
        }
        return f13860h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static String m13579Y() {
        if (f13861i == null) {
            f13861i = C3257g.m13227b() + File.separatorChar + f13856d.mCrashLogsFolderName + File.separatorChar;
        }
        return f13861i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static String m13580Z() {
        if (f13862j == null) {
            if (!C3257g.m13225a(f13856d.mLogsBackupPathName)) {
                String trim = f13856d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!trim.endsWith(str)) {
                    trim = trim + str;
                }
                f13862j = trim;
            } else {
                f13862j = (C3257g.m13227b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f13856d.mCrashLogsFolderName + File.separatorChar;
            }
        }
        return f13862j;
    }

    /* renamed from: a */
    public static void m13586a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f13856d = customInfo2;
        m13598c(customInfo2);
        if (!f13856d.mZipLog) {
            f13853a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f13856d.mEncryptLog) {
            f13854b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f13857e = new VersionInfo(versionInfo);
        if (C3259b.m13307L()) {
            return;
        }
        try {
            m13584a();
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* renamed from: aa */
    public static boolean m13589aa() {
        return f13856d.mEnableCrpStat;
    }

    /* renamed from: ab */
    public static boolean m13590ab() {
        return f13856d.mEnableStatToWPKDirect;
    }

    /* renamed from: ac */
    public static String m13591ac() {
        return f13856d.mUserId;
    }

    /* renamed from: ad */
    public static String m13592ad() {
        return f13856d.mChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r1 == null) goto L17;
     */
    /* renamed from: ae */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m13593ae() {
        /*
            java.lang.String r0 = com.p077uc.crashsdk.C3264g.f13859g
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = com.p077uc.crashsdk.p078a.C3257g.m13232c()     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r1.getEntry(r0)     // Catch: java.lang.Throwable -> L38
            long r2 = r0.getCrc()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = java.lang.Long.toHexString(r2)     // Catch: java.lang.Throwable -> L38
            com.p077uc.crashsdk.C3264g.f13859g = r0     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "version unique build id: "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = com.p077uc.crashsdk.C3264g.f13859g     // Catch: java.lang.Throwable -> L38
            r0.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "crashsdk"
            com.p077uc.crashsdk.p078a.C3251a.m13168a(r2, r0)     // Catch: java.lang.Throwable -> L38
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L48
        L38:
            r0 = move-exception
            goto L3e
        L3a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L3e:
            java.lang.String r2 = ""
            com.p077uc.crashsdk.C3264g.f13859g = r2     // Catch: java.lang.Throwable -> L4b
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L48
            goto L34
        L48:
            java.lang.String r0 = com.p077uc.crashsdk.C3264g.f13859g
            return r0
        L4b:
            r0 = move-exception
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.lang.Throwable -> L51
        L51:
            goto L53
        L52:
            throw r0
        L53:
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3264g.m13593ae():java.lang.String");
    }

    /* renamed from: af */
    private static void m13594af() {
        if (C3259b.f13741d) {
            JNIBridge.nativeSet(24, 1L, C3250a.f13622b, null);
        }
    }

    /* renamed from: b */
    public static void m13596b() {
        JNIBridge.set(103, C3257g.m13227b());
        JNIBridge.set(104, f13856d.mTagFilesFolderName);
        JNIBridge.set(105, f13856d.mCrashLogsFolderName);
        JNIBridge.set(106, m13580Z());
        JNIBridge.set(107, C3262e.m13481h());
        JNIBridge.set(108, C3259b.m13323a());
        JNIBridge.set(109, m13575U());
        JNIBridge.set(110, m13576V());
        JNIBridge.set(111, m13577W());
        JNIBridge.set(112, "240515102041");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, C3262e.m13499q());
        JNIBridge.set(5, f13856d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f13856d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f13856d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f13856d.mNativeCrashLogFileName);
        JNIBridge.set(101, f13856d.mUnexpCrashLogFileName);
        JNIBridge.set(35, f13856d.mEnableMemoryGroup);
        JNIBridge.set(36, f13856d.mEnableLibcMallocDetail);
        JNIBridge.set(131, f13856d.mLibcMallocDetailConfig);
        JNIBridge.set(102, f13856d.mAppId);
        JNIBridge.set(38, f13856d.mCrashRateUploadUrl);
        JNIBridge.set(39, f13856d.mCrashSDKAuthUrl);
    }

    /* renamed from: c */
    private static void m13598c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long m13440b = C3262e.m13440b();
            if (m13440b >= 1) {
                customInfo.mMaxBuiltinLogFilesCount = 200;
                customInfo.mMaxCustomLogFilesCount = 100;
                customInfo.mMaxUploadBytesPerDay = 268435456L;
                customInfo.mMaxUploadBuiltinLogCountPerDay = BannerConfig.TIME;
                customInfo.mMaxUploadCustomLogCountPerDay = BannerConfig.TIME;
                customInfo.mMaxCustomLogCountPerTypePerDay = 100;
                customInfo.mMaxAnrLogCountPerProcess = 100;
                customInfo.mAnrTraceStrategy = 2;
                if (m13440b >= 2) {
                    customInfo.mSyncUploadSetupCrashLogs = true;
                    customInfo.mSyncUploadLogs = true;
                    if (m13440b >= 3) {
                        customInfo.mBackupLogs = true;
                        customInfo.mPrintStackInfos = true;
                        customInfo.mDebug = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    /* renamed from: d */
    public static void m13599d() {
        JNIBridge.set(23, f13856d.mIsInternational);
        if (C3259b.m13303H()) {
            JNIBridge.set(34, true);
        }
        if (C3262e.m13484i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f13856d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f13856d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(C3259b.m13297B());
        JNIBridge.set(2, C3259b.m13301F());
        C3250a.m13155e();
        C3250a.m13157g();
        C3250a.m13159i();
        C3250a.m13161k();
        JNIBridge.set(113, C3250a.f13621a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f13856d.mThreadsDumpMinLimit);
        JNIBridge.set(122, C3250a.m13135a());
        JNIBridge.set(33, C3250a.m13152c());
        m13594af();
        C3259b.m13306K();
        C3259b.m13299D();
        C3257g.m13244k();
    }

    /* renamed from: e */
    public static String m13600e() {
        return f13856d.mAppId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m13601f() {
        if (C3257g.m13230b(f13856d.mJavaCrashLogFileName) || C3257g.m13230b(f13856d.mNativeCrashLogFileName)) {
            return true;
        }
        return C3257g.m13230b(f13856d.mUnexpCrashLogFileName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m13602g() {
        return f13856d.mJavaCrashLogFileName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m13603h() {
        return f13856d.mCrashRestartInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m13604i() {
        return f13856d.mCallJavaDefaultHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m13605j() {
        return f13856d.mEnableKillProcessAfterCrash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static boolean m13606k() {
        return f13856d.mDumpHprofDataForJavaOOM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static boolean m13607l() {
        return f13856d.mRenameFileToDefaultName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m13608m() {
        return f13856d.mMaxBuiltinLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m13609n() {
        return f13856d.mMaxCustomLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m13610o() {
        return f13856d.mMaxJavaLogcatLineCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m13611p() {
        return f13856d.mUnexpDelayMillSeconds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m13612q() {
        return f13856d.mUnexpSubTypes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m13613r() {
        return f13856d.mBackupLogs;
    }

    /* renamed from: s */
    public static boolean m13614s() {
        return f13856d.mSyncUploadSetupCrashLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static boolean m13615t() {
        return f13856d.mSyncUploadLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static boolean m13616u() {
        return f13856d.mOmitJavaCrash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m13617v() {
        return f13856d.mAutoDeleteOldVersionStats;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static boolean m13618w() {
        return f13856d.mZipLog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static String m13619x() {
        return f13856d.mZippedLogExtension;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static boolean m13620y() {
        return f13856d.mEncryptLog;
    }

    /* renamed from: z */
    public static String m13621z() {
        return f13856d.mCrashLogUploadUrl;
    }

    /* renamed from: a */
    public static void m13585a(CustomInfo customInfo) {
        boolean z10 = f13855c;
        if (!z10 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z10 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    /* renamed from: a */
    public static void m13587a(VersionInfo versionInfo) {
        synchronized (f13858f) {
            f13857e = new VersionInfo(versionInfo);
            C3262e.m13454c();
            if (C3259b.f13741d) {
                JNIBridge.set(109, m13575U());
                JNIBridge.set(110, m13576V());
                JNIBridge.set(111, m13577W());
                JNIBridge.set(112, "240515102041");
                JNIBridge.cmd(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13584a() {
        C3259b.m13367y();
        C3259b.m13366x();
        if (f13856d.mBackupLogs) {
            File file = new File(m13580Z());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    /* renamed from: c */
    public static void m13597c() {
        JNIBridge.set(11, m13571Q());
        JNIBridge.set(12, f13856d.mBackupLogs);
        JNIBridge.set(13, f13856d.mCrashRestartInterval);
        JNIBridge.set(14, f13856d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f13856d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f13856d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f13856d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, m13570P());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f13856d.mOmitNativeCrash);
        JNIBridge.set(32, f13856d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f13856d.mDisableSignals);
        JNIBridge.set(9, f13856d.mDisableBackgroundSignals);
        CustomInfo customInfo = f13856d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f13856d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    /* renamed from: a */
    private static String m13583a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", Operator.Operation.MINUS);
    }

    /* renamed from: b */
    public static int m13595b(CustomInfo customInfo) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        synchronized (f13863k) {
            i10 = 0;
            if (customInfo != null) {
                m13598c(customInfo);
                if (f13856d == null) {
                    f13856d = new CustomInfo();
                }
                CustomInfo customInfo2 = f13856d;
                boolean z12 = true;
                if (m13588a(customInfo.mAppId, customInfo2.mAppId)) {
                    i11 = 0;
                    z10 = false;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (C3259b.f13741d) {
                        JNIBridge.set(102, str);
                    }
                    i11 = 1;
                    z10 = true;
                }
                if (!m13588a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i11++;
                }
                if (!m13588a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (C3259b.f13741d) {
                        JNIBridge.set(100, str2);
                    }
                    i11++;
                    z10 = true;
                }
                if (!m13588a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (C3259b.f13741d) {
                        JNIBridge.set(101, str3);
                    }
                    i11++;
                    z10 = true;
                }
                if (z10) {
                    C3262e.m13454c();
                    if (C3259b.f13741d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z13 = customInfo2.mPrintStackInfos;
                boolean z14 = customInfo.mPrintStackInfos;
                if (z13 != z14) {
                    customInfo2.mPrintStackInfos = z14;
                    if (C3259b.f13741d) {
                        JNIBridge.set(11, z14);
                    }
                    i11++;
                }
                boolean z15 = customInfo2.mDebug;
                boolean z16 = customInfo.mDebug;
                if (z15 != z16) {
                    customInfo2.mDebug = z16;
                    if (C3259b.f13741d) {
                        JNIBridge.set(18, z16);
                    }
                    i11++;
                }
                boolean z17 = customInfo2.mBackupLogs;
                boolean z18 = customInfo.mBackupLogs;
                if (z17 != z18) {
                    customInfo2.mBackupLogs = z18;
                    if (C3259b.f13741d) {
                        JNIBridge.set(12, z18);
                    }
                    i11++;
                }
                boolean z19 = customInfo2.mOmitNativeCrash;
                boolean z20 = customInfo.mOmitNativeCrash;
                if (z19 != z20) {
                    customInfo2.mOmitNativeCrash = z20;
                    if (C3259b.f13741d) {
                        JNIBridge.set(21, z20);
                    }
                    i11++;
                }
                int i12 = customInfo2.mCrashRestartInterval;
                int i13 = customInfo.mCrashRestartInterval;
                if (i12 != i13) {
                    customInfo2.mCrashRestartInterval = i13;
                    if (C3259b.f13741d) {
                        JNIBridge.set(13, i13);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        C3259b.m13308M();
                    }
                    i11++;
                }
                int i14 = customInfo2.mMaxBuiltinLogFilesCount;
                int i15 = customInfo.mMaxBuiltinLogFilesCount;
                if (i14 != i15) {
                    customInfo2.mMaxBuiltinLogFilesCount = i15;
                    if (C3259b.f13741d) {
                        JNIBridge.set(14, i15);
                    }
                    i11++;
                }
                int i16 = customInfo2.mMaxNativeLogcatLineCount;
                int i17 = customInfo.mMaxNativeLogcatLineCount;
                if (i16 != i17) {
                    customInfo2.mMaxNativeLogcatLineCount = i17;
                    if (C3259b.f13741d) {
                        JNIBridge.set(15, i17);
                    }
                    i11++;
                }
                int i18 = customInfo2.mMaxJavaLogcatLineCount;
                int i19 = customInfo.mMaxJavaLogcatLineCount;
                if (i18 != i19) {
                    customInfo2.mMaxJavaLogcatLineCount = i19;
                    i11++;
                }
                int i20 = customInfo2.mMaxUnexpLogcatLineCount;
                int i21 = customInfo.mMaxUnexpLogcatLineCount;
                if (i20 != i21) {
                    customInfo2.mMaxUnexpLogcatLineCount = i21;
                    if (C3259b.f13741d) {
                        JNIBridge.set(16, i21);
                    }
                    i11++;
                }
                int i22 = customInfo2.mMaxAnrLogcatLineCount;
                int i23 = customInfo.mMaxAnrLogcatLineCount;
                if (i22 != i23) {
                    customInfo2.mMaxAnrLogcatLineCount = i23;
                    if (C3259b.f13741d) {
                        JNIBridge.set(31, i23);
                    }
                    i11++;
                }
                boolean z21 = customInfo2.mZipLog;
                boolean z22 = customInfo.mZipLog;
                if (z21 != z22) {
                    customInfo2.mZipLog = z22;
                    if (!z22) {
                        C3251a.m13173d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f13853a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i11++;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m13588a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z12 = z11;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i11++;
                }
                if (z12 && C3259b.f13741d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i24 = customInfo2.mLogMaxBytesLimit;
                int i25 = customInfo.mLogMaxBytesLimit;
                if (i24 != i25) {
                    customInfo2.mLogMaxBytesLimit = i25;
                    if (C3259b.f13741d) {
                        JNIBridge.set(4, i25);
                    }
                    i11++;
                }
                boolean z23 = customInfo2.mEncryptLog;
                boolean z24 = customInfo.mEncryptLog;
                if (z23 != z24) {
                    customInfo2.mEncryptLog = z24;
                    if (z24) {
                        C3251a.m13173d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f13854b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i11++;
                }
                boolean z25 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z26 = customInfo.mSyncUploadSetupCrashLogs;
                if (z25 != z26) {
                    customInfo2.mSyncUploadSetupCrashLogs = z26;
                    i11++;
                }
                boolean z27 = customInfo2.mSyncUploadLogs;
                boolean z28 = customInfo.mSyncUploadLogs;
                if (z27 != z28) {
                    customInfo2.mSyncUploadLogs = z28;
                    i11++;
                }
                int i26 = customInfo2.mMaxCustomLogFilesCount;
                int i27 = customInfo.mMaxCustomLogFilesCount;
                if (i26 != i27) {
                    customInfo2.mMaxCustomLogFilesCount = i27;
                    i11++;
                }
                boolean z29 = customInfo2.mOmitJavaCrash;
                boolean z30 = customInfo.mOmitJavaCrash;
                if (z29 != z30) {
                    customInfo2.mOmitJavaCrash = z30;
                    i11++;
                }
                int i28 = customInfo2.mLogMaxUploadBytesLimit;
                int i29 = customInfo.mLogMaxUploadBytesLimit;
                if (i28 != i29) {
                    customInfo2.mLogMaxUploadBytesLimit = i29;
                    i11++;
                }
                long j10 = customInfo2.mMaxUploadBytesPerDay;
                long j11 = customInfo.mMaxUploadBytesPerDay;
                if (j10 != j11) {
                    customInfo2.mMaxUploadBytesPerDay = j11;
                    i11++;
                }
                int i30 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i31 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i30 != i31) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i31;
                    i11++;
                }
                int i32 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i33 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i32 != i33) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i33;
                    i11++;
                }
                int i34 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i35 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i34 != i35) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i35;
                    i11++;
                }
                int i36 = customInfo2.mMaxAnrLogCountPerProcess;
                int i37 = customInfo.mMaxAnrLogCountPerProcess;
                if (i36 != i37) {
                    customInfo2.mMaxAnrLogCountPerProcess = i37;
                    if (C3259b.f13741d) {
                        JNIBridge.set(32, f13856d.mMaxAnrLogCountPerProcess);
                    }
                    i11++;
                }
                boolean z31 = customInfo2.mCallJavaDefaultHandler;
                boolean z32 = customInfo.mCallJavaDefaultHandler;
                if (z31 != z32) {
                    customInfo2.mCallJavaDefaultHandler = z32;
                    i11++;
                }
                boolean z33 = customInfo2.mEnableKillProcessAfterCrash;
                boolean z34 = customInfo.mEnableKillProcessAfterCrash;
                if (z33 != z34) {
                    customInfo2.mEnableKillProcessAfterCrash = z34;
                    i11++;
                }
                boolean z35 = customInfo2.mCallNativeDefaultHandler;
                boolean z36 = customInfo.mCallNativeDefaultHandler;
                if (z35 != z36) {
                    customInfo2.mCallNativeDefaultHandler = z36;
                    i11++;
                    if (C3259b.f13741d) {
                        JNIBridge.set(5, f13856d.mCallNativeDefaultHandler);
                    }
                }
                boolean z37 = customInfo2.mDumpUserSolibBuildId;
                boolean z38 = customInfo.mDumpUserSolibBuildId;
                if (z37 != z38) {
                    customInfo2.mDumpUserSolibBuildId = z38;
                    i11++;
                    if (C3259b.f13741d) {
                        JNIBridge.set(6, f13856d.mDumpUserSolibBuildId);
                    }
                }
                boolean z39 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z40 = customInfo.mDumpHprofDataForJavaOOM;
                if (z39 != z40) {
                    customInfo2.mDumpHprofDataForJavaOOM = z40;
                    i11++;
                }
                boolean z41 = customInfo2.mRenameFileToDefaultName;
                boolean z42 = customInfo.mRenameFileToDefaultName;
                if (z41 != z42) {
                    customInfo2.mRenameFileToDefaultName = z42;
                    i11++;
                }
                boolean z43 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z44 = customInfo.mAutoDeleteOldVersionStats;
                if (z43 != z44) {
                    customInfo2.mAutoDeleteOldVersionStats = z44;
                    i11++;
                }
                int i38 = customInfo2.mFdDumpMinLimit;
                int i39 = customInfo.mFdDumpMinLimit;
                if (i38 != i39) {
                    customInfo2.mFdDumpMinLimit = i39;
                    if (C3259b.f13741d) {
                        JNIBridge.set(10, i39);
                    }
                    i11++;
                }
                int i40 = customInfo2.mThreadsDumpMinLimit;
                int i41 = customInfo.mThreadsDumpMinLimit;
                if (i40 != i41) {
                    customInfo2.mThreadsDumpMinLimit = i41;
                    if (C3259b.f13741d) {
                        JNIBridge.set(22, i41);
                    }
                    i11++;
                }
                int i42 = customInfo2.mInfoUpdateInterval;
                int i43 = customInfo.mInfoUpdateInterval;
                if (i42 != i43) {
                    if (i42 <= 0 && i43 > 0) {
                        C3250a.m13146a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i11++;
                }
                int i44 = customInfo2.mInfoSaveFrequency;
                int i45 = customInfo.mInfoSaveFrequency;
                if (i44 != i45) {
                    customInfo2.mInfoSaveFrequency = i45;
                    i11++;
                }
                long j12 = customInfo2.mDisableBackgroundSignals;
                long j13 = customInfo.mDisableBackgroundSignals;
                if (j12 != j13) {
                    customInfo2.mDisableBackgroundSignals = j13;
                    if (C3259b.f13741d) {
                        JNIBridge.set(9, j13);
                    }
                    i11++;
                }
                boolean z45 = customInfo2.mEnableStatReport;
                boolean z46 = customInfo.mEnableStatReport;
                if (z45 != z46) {
                    customInfo2.mEnableStatReport = z46;
                    if (z46) {
                        C3262e.m13382B();
                    }
                    i11++;
                }
                boolean z47 = customInfo2.mEnableCrpStat;
                boolean z48 = customInfo.mEnableCrpStat;
                if (z47 != z48) {
                    customInfo2.mEnableCrpStat = z48;
                    i11++;
                }
                boolean z49 = customInfo2.mEnableStatToWPKDirect;
                boolean z50 = customInfo.mEnableStatToWPKDirect;
                if (z49 != z50) {
                    customInfo2.mEnableStatToWPKDirect = z50;
                    i11++;
                }
                boolean z51 = customInfo2.mIsInternational;
                boolean z52 = customInfo.mIsInternational;
                if (z51 != z52) {
                    customInfo2.mIsInternational = z52;
                    if (C3259b.f13741d) {
                        JNIBridge.set(23, z52);
                    }
                    C3262e.m13490l();
                    C3254d.m13196c();
                    C3258h.m13283k();
                    i11++;
                }
                boolean z53 = customInfo2.mAutoDetectLifeCycle;
                boolean z54 = customInfo.mAutoDetectLifeCycle;
                if (z53 != z54) {
                    customInfo2.mAutoDetectLifeCycle = z54;
                    if (z54) {
                        C3259b.m13298C();
                    }
                    i11++;
                }
                boolean z55 = customInfo2.mMonitorBattery;
                boolean z56 = customInfo.mMonitorBattery;
                if (z55 != z56) {
                    customInfo2.mMonitorBattery = z56;
                    C3262e.m13457c(C3259b.m13297B());
                    i11++;
                }
                int i46 = customInfo2.mUnexpSubTypes;
                int i47 = customInfo.mUnexpSubTypes;
                if (i46 != i47) {
                    customInfo2.mUnexpSubTypes = i47;
                    i11++;
                }
                boolean z57 = customInfo2.mEnableMemoryGroup;
                boolean z58 = customInfo.mEnableMemoryGroup;
                if (z57 != z58) {
                    customInfo2.mEnableMemoryGroup = z58;
                    if (C3259b.f13741d) {
                        JNIBridge.set(35, z58);
                    }
                    i11++;
                }
                boolean z59 = customInfo2.mEnableLibcMallocDetail;
                boolean z60 = customInfo.mEnableLibcMallocDetail;
                if (z59 != z60) {
                    customInfo2.mEnableLibcMallocDetail = z60;
                    if (C3259b.f13741d) {
                        JNIBridge.set(36, z60);
                    }
                    i11++;
                }
                String str4 = customInfo2.mLibcMallocDetailConfig;
                String str5 = customInfo.mLibcMallocDetailConfig;
                if (str4 != str5) {
                    customInfo2.mLibcMallocDetailConfig = str5;
                    if (C3259b.f13741d) {
                        JNIBridge.set(131, str5);
                    }
                    i11++;
                }
                if (!m13588a(customInfo.mUserId, customInfo2.mUserId)) {
                    customInfo2.mUserId = customInfo.mUserId;
                    i11++;
                }
                if (!m13588a(customInfo.mChannel, customInfo2.mChannel)) {
                    customInfo2.mChannel = customInfo.mChannel;
                    i11++;
                }
                if (!m13588a(customInfo2.mCrashLogUploadUrl, customInfo.mCrashLogUploadUrl)) {
                    customInfo2.mCrashLogUploadUrl = customInfo.mCrashLogUploadUrl;
                    i11++;
                }
                if (!m13588a(customInfo2.mCrashRateUploadUrl, customInfo.mCrashRateUploadUrl)) {
                    String str6 = customInfo.mCrashRateUploadUrl;
                    customInfo2.mCrashRateUploadUrl = str6;
                    i11++;
                    if (C3259b.f13741d) {
                        JNIBridge.set(38, str6);
                    }
                }
                if (!m13588a(customInfo2.mCrashSDKAuthUrl, customInfo.mCrashSDKAuthUrl)) {
                    String str7 = customInfo.mCrashSDKAuthUrl;
                    customInfo2.mCrashSDKAuthUrl = str7;
                    i11++;
                    if (C3259b.f13741d) {
                        JNIBridge.set(39, str7);
                    }
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* renamed from: a */
    public static CustomInfo m13581a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = f13856d;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e10) {
                        C3257g.m13220a(e10);
                        StringBuilder sb2 = new StringBuilder("Field ");
                        sb2.append(str);
                        sb2.append(" must be a ");
                        sb2.append(field.getType().getName());
                        sb2.append(", but give a ");
                        sb2.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    /* renamed from: a */
    public static VersionInfo m13582a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f13857e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!C3257g.m13225a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C3257g.m13225a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C3257g.m13225a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C3257g.m13225a(string4)) {
            C3250a.f13622b = string4;
            m13594af();
        }
        return versionInfo;
    }

    /* renamed from: a */
    private static boolean m13588a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
