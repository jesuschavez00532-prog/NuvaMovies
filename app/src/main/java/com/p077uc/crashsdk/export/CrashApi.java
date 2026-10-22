package com.p077uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.p077uc.crashsdk.C3250a;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3261d;
import com.p077uc.crashsdk.C3262e;
import com.p077uc.crashsdk.C3264g;
import com.p077uc.crashsdk.JNIBridge;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3254d;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.C3258h;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class CrashApi {

    /* renamed from: a */
    private static CrashApi f13844a = null;

    /* renamed from: c */
    private static boolean f13845c = true;

    /* renamed from: d */
    private static boolean f13846d;

    /* renamed from: b */
    private boolean f13847b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z10, boolean z11, boolean z12) {
        this.f13847b = false;
        Context m13517a = m13517a(context);
        m13523b(m13517a);
        C3259b.f13744g = z11;
        C3259b.f13745h = z12;
        if (C3259b.m13307L()) {
            m13523b(m13517a);
            m13519a(m13517a, customInfo, versionInfo, iCrashClient);
            if (z10) {
                m13518a();
            }
            if (C3259b.f13744g && C3262e.m13469e("libcrashsdk.so")) {
                C3259b.f13743f = true;
                m13522b();
                return;
            }
            return;
        }
        if (customInfo != null && versionInfo != null) {
            C3264g.m13585a(customInfo);
            try {
                m13519a(m13517a, customInfo, versionInfo, iCrashClient);
            } catch (Throwable th) {
                m13520a(th);
            }
            if (z10) {
                try {
                    m13518a();
                } catch (Throwable th2) {
                    m13520a(th2);
                }
            }
            try {
                C3259b.m13308M();
                C3258h.m13249a();
                C3254d.m13192a();
                C3257g.m13243j();
            } catch (Throwable th3) {
                C3257g.m13220a(th3);
            }
            try {
                if (!C3259b.m13328a(m13517a)) {
                    C3251a.m13173d("crashsdk", "registerLifecycleCallbacks failed!");
                }
            } catch (Throwable th4) {
                C3257g.m13220a(th4);
            }
            try {
                C3250a.m13164n();
                try {
                    C3262e.m13381A();
                } catch (Throwable th5) {
                    C3257g.m13229b(th5);
                }
                C3262e.m13382B();
            } catch (Throwable th6) {
                C3257g.m13220a(th6);
            }
            try {
                if (C3264g.m13614s() && C3259b.m13301F() && !this.f13847b) {
                    C3262e.m13387G();
                    this.f13847b = true;
                    return;
                }
                return;
            } catch (Throwable th7) {
                C3257g.m13229b(th7);
                return;
            }
        }
        C3251a.m13173d("crashsdk", "VersionInfo and CustomInfo can not be null!");
        throw null;
    }

    /* renamed from: a */
    private static void m13518a() {
        if (C3259b.f13727a) {
            C3251a.m13170b("Has enabled java log!");
            return;
        }
        C3262e.m13504s();
        C3262e.m13495o();
        C3259b.f13727a = true;
    }

    /* renamed from: b */
    private static void m13522b() {
        synchronized (C3259b.f13742e) {
            if (C3259b.f13744g && C3259b.f13743f) {
                if (C3259b.f13739b) {
                    C3251a.m13170b("Has enabled native log!");
                    return;
                }
                m13524c();
                C3262e.m13384D();
                C3259b.f13739b = true;
                JNIBridge.cmd(6);
                C3264g.m13599d();
            }
        }
    }

    /* renamed from: c */
    private static void m13524c() {
        if (C3259b.f13741d) {
            return;
        }
        C3264g.m13596b();
        JNIBridge.cmd(5);
        C3264g.m13597c();
        C3259b.f13741d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z10, boolean z11, boolean z12) {
        CrashApi crashApi;
        synchronized (CrashApi.class) {
            if (f13844a == null) {
                f13844a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z10, z11, z12);
            }
            crashApi = f13844a;
        }
        return crashApi;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10) {
        return createInstanceEx(context, str, z10, null);
    }

    public static CrashApi getInstance() {
        return f13844a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str != null && str2 != null) {
            return C3250a.m13147b(str, str2);
        }
        throw null;
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        dumpFileInfo.getClass();
        String str2 = dumpFileInfo.mCategory;
        if (str2 != null && (str = dumpFileInfo.mFileTobeDump) != null) {
            int i10 = dumpFileInfo.mLogType;
            if ((1048849 & i10) == 0) {
                return 0;
            }
            return C3250a.m13134a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i10, dumpFileInfo.mDeleteAfterDump);
        }
        throw null;
    }

    public void addHeaderInfo(String str, String str2) {
        str.getClass();
        C3250a.m13143a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (m13521a("addStatInfo")) {
            return false;
        }
        if (!C3257g.m13225a(str)) {
            if (str.length() <= 24) {
                if (str2 != null && str2.length() > 512) {
                    str2 = str2.substring(0, 512);
                }
                return C3258h.m13261a(str, str2);
            }
            throw new IllegalArgumentException("key is too long!");
        }
        throw null;
    }

    public void crashSoLoaded() {
        if (m13521a("crashSoLoaded")) {
            return;
        }
        C3259b.f13743f = true;
        m13522b();
        synchronized (C3259b.f13742e) {
            if (C3259b.f13745h && C3259b.f13743f && !C3259b.f13740c) {
                if (!C3259b.f13741d) {
                    m13524c();
                    C3264g.m13599d();
                }
                C3262e.m13509x();
                C3259b.f13740c = true;
            }
        }
        C3250a.m13164n();
        C3262e.m13492m();
    }

    public int createCachedInfo(String str, int i10, int i11) {
        str.getClass();
        if (i10 > 0) {
            if ((1048849 & i11) == 0) {
                return 0;
            }
            return C3250a.m13132a(str, i10, i11);
        }
        throw new IllegalArgumentException("capacity must > 0!");
    }

    public void disableLog(int i10) {
        synchronized (C3259b.f13742e) {
            C3259b.m13337b(i10);
            if (LogType.isForJava(i10) && C3259b.f13727a) {
                C3262e.m13505t();
                C3259b.f13727a = false;
            }
            if (LogType.isForNative(i10)) {
                if (C3259b.f13739b) {
                    JNIBridge.cmd(9);
                    C3259b.f13739b = false;
                } else {
                    C3259b.f13744g = false;
                }
            }
            if (LogType.isForANR(i10)) {
                C3259b.m13326a(false);
            }
            if (LogType.isForUnexp(i10)) {
                if (C3259b.f13740c) {
                    if (C3262e.m13511z()) {
                        C3259b.f13740c = false;
                    }
                } else {
                    C3259b.f13745h = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb2;
        customLogInfo.getClass();
        if (customLogInfo.mData != null && (str = customLogInfo.mLogType) != null) {
            if (!str.contains("_") && !customLogInfo.mLogType.contains(" ")) {
                ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
                if (arrayList == null || arrayList.size() <= 0) {
                    sb2 = null;
                } else {
                    sb2 = new StringBuilder();
                    Iterator<Integer> it = customLogInfo.mDumpTids.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().intValue());
                        sb2.append(" ");
                    }
                }
                long j10 = customLogInfo.mAddHeader ? 1L : 0L;
                if (customLogInfo.mAddFooter) {
                    j10 |= 2;
                }
                if (customLogInfo.mAddLogcat) {
                    j10 |= 4;
                }
                if (customLogInfo.mAddThreadsDump) {
                    j10 |= 8;
                }
                if (customLogInfo.mAddBuildId) {
                    j10 |= 16;
                }
                if (customLogInfo.mUploadNow) {
                    j10 |= 32;
                }
                return C3262e.m13435a(customLogInfo.mData, customLogInfo.mLogType, j10, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb2 != null ? sb2.toString() : null);
            }
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        }
        throw new NullPointerException("mData or mLogType is null!");
    }

    public boolean generateTraces(String str, long j10) {
        if (m13521a("generateTraces")) {
            return false;
        }
        if (!C3259b.f13741d) {
            C3251a.m13173d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (JNIBridge.nativeCmd(12, j10, str, null) != 1) {
            return false;
        }
        return true;
    }

    public String getCrashLogUploadUrl() {
        if (m13521a("getCrashLogUploadUrl")) {
            return null;
        }
        return C3262e.m13487k();
    }

    public ParcelFileDescriptor getHostFd() {
        return C3262e.m13385E();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return C3262e.m13385E();
    }

    public int getLastExitType() {
        if (m13521a("getLastExitType")) {
            return 1;
        }
        return C3259b.m13304I();
    }

    public int getLastExitTypeEx() {
        if (m13521a("getLastExitTypeEx")) {
            return 1;
        }
        return C3259b.m13305J();
    }

    public Throwable getUncaughtException() {
        return C3262e.m13507v();
    }

    public int getUnexpReason() {
        if (m13521a("getUnexpReason")) {
            return 100;
        }
        return C3262e.m13508w();
    }

    public void onExit() {
        C3259b.m13365w();
    }

    public boolean registerCallback(int i10, ValueCallback<Bundle> valueCallback) {
        valueCallback.getClass();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return C3261d.m13378b(valueCallback);
                    }
                    throw new IllegalArgumentException("Unknown event type: " + i10);
                }
                return C3261d.m13380d(valueCallback);
            }
            return C3261d.m13379c(valueCallback);
        }
        return C3261d.m13377a(valueCallback);
    }

    public int registerInfoCallback(String str, int i10) {
        str.getClass();
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return C3250a.m13133a(str, i10, null, 0L, 0);
    }

    public int registerThread(int i10, String str) {
        return C3250a.m13131a(i10, str);
    }

    public int reportCrashStats(boolean z10) {
        if (m13521a("reportCrashStats")) {
            return 0;
        }
        if (C3264g.m13570P()) {
            C3251a.m13167a("CrashApi::reportCrashStats. currentProcessOnly: " + z10);
        }
        C3262e.m13462d(z10);
        return C3262e.m13466e(z10);
    }

    public int resetCrashStats(boolean z10) {
        if (m13521a("resetCrashStats")) {
            return 0;
        }
        if (C3264g.m13570P()) {
            C3251a.m13167a("CrashApi::resetCrashStats. currentProcessOnly: " + z10);
        }
        return C3262e.m13471f(z10);
    }

    public void setForeground(boolean z10) {
        C3259b.m13339b(z10);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3262e.m13430a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3262e.m13430a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (m13521a("setNewInstall")) {
            return;
        }
        C3259b.m13364v();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        customInfo.getClass();
        return C3264g.m13595b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (m13521a("updateUnexpInfo")) {
            return false;
        }
        return C3250a.m13146a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        versionInfo.getClass();
        C3264g.m13587a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (m13521a("uploadCrashLogs")) {
            return;
        }
        C3262e.m13436a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10, Bundle bundle) {
        return createInstanceEx(context, str, z10, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f13844a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f13845c = bundle.getBoolean("useApplicationContext", true);
        Context m13517a = m13517a(context);
        m13523b(m13517a);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = false;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z10;
        bundle.putString("crver", "2.0");
        CustomInfo m13581a = C3264g.m13581a(customInfo, bundle);
        VersionInfo m13582a = C3264g.m13582a(bundle);
        boolean z11 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_JAVA, true);
        boolean z12 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_NATIVE, true);
        boolean z13 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_UNEXP, C3259b.m13301F());
        boolean z14 = bundle.getBoolean(UMCrash.KEY_ENABLE_ANR, true);
        CrashApi createInstance = createInstance(m13517a, m13581a, m13582a, iCrashClient, z11, z12, z13);
        createInstance.disableLog(805306368);
        C3259b.m13326a(z14);
        if (z12 || z13) {
            if (C3262e.m13469e("libcrashsdk.so")) {
                createInstance.crashSoLoaded();
            } else {
                C3251a.m13173d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i10 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i10 >= 0 && C3259b.m13301F()) {
            C3262e.m13442b(i10);
        }
        return createInstance;
    }

    public int registerInfoCallback(String str, int i10, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return C3250a.m13133a(str, i10, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        bundle.getClass();
        return updateCustomInfo(C3264g.m13581a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        bundle.getClass();
        updateVersionInfo(C3264g.m13582a(bundle));
    }

    /* renamed from: a */
    private static void m13519a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        C3261d.m13373a(iCrashClient);
        C3264g.m13586a(customInfo, versionInfo);
        if (C3259b.m13307L()) {
            return;
        }
        C3262e.m13497p();
        C3262e.m13418a(context);
        C3262e.m13443b(context);
    }

    public int addDumpFile(String str, String str2, int i10, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i10);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    /* renamed from: a */
    private static Context m13517a(Context context) {
        if (context != null) {
            if (!f13845c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            C3251a.m13173d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
        C3251a.m13173d("crashsdk", "context can not be null!");
        throw null;
    }

    /* renamed from: b */
    private static void m13523b(Context context) {
        try {
            if (f13846d) {
                return;
            }
            C3257g.m13217a(context);
            C3250a.f13621a = context.getPackageName();
            f13846d = true;
        } catch (Throwable th) {
            m13520a(th);
        }
    }

    /* renamed from: a */
    private static void m13520a(Throwable th) {
        new C3262e().m13512a(Thread.currentThread(), th, true);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    /* renamed from: a */
    private static boolean m13521a(String str) {
        if (!C3259b.m13307L()) {
            return false;
        }
        C3251a.m13173d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
