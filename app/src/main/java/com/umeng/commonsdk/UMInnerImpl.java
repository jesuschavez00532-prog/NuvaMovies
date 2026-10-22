package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.C3456d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3465c;
import com.umeng.commonsdk.internal.utils.C3473k;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3520d;

/* loaded from: classes3.dex */
public class UMInnerImpl {

    /* renamed from: a */
    public static final /* synthetic */ int f15087a = 0;
    private static boolean isInternal;

    public static synchronized void initAndSendInternal(final Context context) {
        synchronized (UMInnerImpl.class) {
            if (context != null) {
                try {
                    if (!isInternal) {
                        new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.2
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                        try {
                                            if (FieldManager.allow(C3520d.f15673aq) && !C3465c.m14666a(context).m14668a()) {
                                                C3465c.m14666a(context).m14669b();
                                            }
                                        } catch (Throwable th) {
                                            ULog.m14798e(UMModuleRegister.INNER, "e is " + th);
                                        }
                                        try {
                                            C3473k.m14691b(context);
                                        } catch (Throwable th2) {
                                            ULog.m14798e(UMModuleRegister.INNER, "e is " + th2);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    UMCrashManager.reportCrash(context, th3);
                                }
                            }
                        }).start();
                        isInternal = true;
                        sendInternal(context);
                    }
                } finally {
                }
            }
        }
    }

    private static synchronized void sendInternal(final Context context) {
        synchronized (UMInnerImpl.class) {
            if (context != null) {
                try {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                    try {
                                        C3456d.m14631b(context);
                                    } catch (Throwable th) {
                                        ULog.m14798e(UMModuleRegister.INNER, "e is " + th);
                                    }
                                }
                            } catch (Throwable th2) {
                                UMCrashManager.reportCrash(context, th2);
                            }
                        }
                    }).start();
                    isInternal = true;
                } finally {
                }
            }
        }
    }
}
