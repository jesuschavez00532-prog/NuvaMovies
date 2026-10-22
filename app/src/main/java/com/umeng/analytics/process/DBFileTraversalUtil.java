package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class DBFileTraversalUtil {

    /* renamed from: a */
    private static ExecutorService f14932a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private static FileLockUtil f14933b = new FileLockUtil();

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC3406a {
        /* renamed from: a */
        void mo14447a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final InterfaceC3406a interfaceC3406a) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f14932a.execute(new Runnable() { // from class: com.umeng.analytics.process.DBFileTraversalUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        for (File file2 : file.listFiles()) {
                            if (file2.getName().endsWith(InterfaceC3410a.f14955d)) {
                                DBFileTraversalUtil.f14933b.doFileOperateion(file2, fileLockCallback);
                                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> file: " + file2.getName());
                            }
                        }
                        InterfaceC3406a interfaceC3406a2 = interfaceC3406a;
                        if (interfaceC3406a2 != null) {
                            interfaceC3406a2.mo14447a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> end *** ");
                }
            });
        }
    }
}
