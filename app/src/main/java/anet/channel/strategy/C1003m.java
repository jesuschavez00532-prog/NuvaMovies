package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.m */
/* loaded from: classes.dex */
public class C1003m {

    /* renamed from: a */
    private static File f4180a;

    /* renamed from: b */
    private static volatile boolean f4181b;

    /* renamed from: c */
    private static Comparator<File> f4182c = new C1004n();

    C1003m() {
    }

    /* renamed from: a */
    public static void m4765a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f4180a = file;
                if (!m4767a(file)) {
                    ALog.m4787e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f4180a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f4180a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f4180a = file2;
                    if (!m4767a(file2)) {
                        ALog.m4787e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f4180a.getAbsolutePath());
                    }
                }
                ALog.m4788i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f4180a.getAbsolutePath());
                if (f4181b) {
                    m4764a();
                    f4181b = false;
                } else {
                    m4769c();
                }
            } catch (Throwable th) {
                ALog.m4786e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized File[] m4768b() {
        synchronized (C1003m.class) {
            File file = f4180a;
            if (file == null) {
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, f4182c);
            }
            return listFiles;
        }
    }

    /* renamed from: c */
    static synchronized void m4769c() {
        synchronized (C1003m.class) {
            File[] m4768b = m4768b();
            if (m4768b == null) {
                return;
            }
            int i10 = 0;
            for (File file : m4768b) {
                if (!file.isDirectory()) {
                    if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                        file.delete();
                    } else if (file.getName().startsWith("WIFI")) {
                        int i11 = i10 + 1;
                        if (i10 > 10) {
                            file.delete();
                        }
                        i10 = i11;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m4767a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* renamed from: a */
    public static File m4762a(String str) {
        m4767a(f4180a);
        return new File(f4180a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m4764a() {
        synchronized (C1003m.class) {
            ALog.m4788i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
            File file = f4180a;
            if (file == null) {
                ALog.m4790w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
                f4181b = true;
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
            ALog.m4788i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m4766a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (C1003m.class) {
            SerializeHelper.persist(serializable, m4762a(str), strategyStatObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized <T> T m4763a(String str, StrategyStatObject strategyStatObject) {
        T t10;
        synchronized (C1003m.class) {
            t10 = (T) SerializeHelper.restore(m4762a(str), strategyStatObject);
        }
        return t10;
    }
}
