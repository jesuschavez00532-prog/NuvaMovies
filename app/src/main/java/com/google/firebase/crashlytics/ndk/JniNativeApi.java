package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p395x5.C7503f;

/* loaded from: classes.dex */
class JniNativeApi implements InterfaceC2626e {

    /* renamed from: b */
    private static final boolean f10027b;

    /* renamed from: c */
    private static final FilenameFilter f10028c = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m10862g;
            m10862g = JniNativeApi.m10862g(file, str);
            return m10862g;
        }
    };

    /* renamed from: a */
    private final Context f10029a;

    static {
        boolean z10;
        try {
            System.loadLibrary("crashlytics");
            z10 = true;
        } catch (UnsatisfiedLinkError e10) {
            C7503f.m28716f().m28719d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e10.getLocalizedMessage());
            z10 = false;
        }
        f10027b = z10;
    }

    public JniNativeApi(Context context) {
        this.f10029a = context;
    }

    /* renamed from: c */
    public static void m10858c(List list, PackageInfo packageInfo) {
        String[] strArr;
        String[] strArr2;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            strArr2 = applicationInfo.splitSourceDirs;
            Collections.addAll(list, strArr2);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", m10860e(packageInfo)));
        if (!file.exists()) {
            C7503f.m28716f().m28717b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f10028c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        C7503f.m28716f().m28717b("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            C7503f.m28716f().m28717b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    /* renamed from: d */
    private static int m10859d() {
        if (Build.VERSION.SDK_INT >= 24) {
            return 9216;
        }
        return EventType.AUTH_FAIL;
    }

    /* renamed from: e */
    private static String m10860e(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }

    /* renamed from: f */
    public static boolean m10861f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m10862g(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.InterfaceC2626e
    /* renamed from: a */
    public boolean mo10863a(String str, AssetManager assetManager) {
        String[] m10864h = m10864h(Build.CPU_ABI);
        if (m10864h.length < 2) {
            return false;
        }
        String str2 = m10864h[0];
        String str3 = m10864h[1];
        if (!f10027b || !nativeInit(new String[]{str2, str3, str}, assetManager)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String[] m10864h(String str) {
        try {
            PackageInfo packageInfo = this.f10029a.getPackageManager().getPackageInfo(this.f10029a.getPackageName(), m10859d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (m10861f()) {
                m10858c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e10) {
            C7503f.m28716f().m28720e("Unable to compose package paths", e10);
            throw new RuntimeException(e10);
        }
    }
}
