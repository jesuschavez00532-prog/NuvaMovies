package com.efs.sdk.base.core.p051b;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.efs.sdk.base.core.b.h */
/* loaded from: classes.dex */
public final class C1677h {

    /* renamed from: b */
    static FileLock f7059b;

    /* renamed from: a */
    volatile int f7060a;

    /* renamed from: com.efs.sdk.base.core.b.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1677h f7063a = new C1677h(0);

        /* renamed from: a */
        public static /* synthetic */ C1677h m7645a() {
            return f7063a;
        }
    }

    /* synthetic */ C1677h(byte b10) {
        this();
    }

    /* renamed from: a */
    public final boolean m7644a() {
        if (this.f7060a == 2) {
            return true;
        }
        if (this.f7060a != 0) {
            return false;
        }
        m7643a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        return false;
    }

    private C1677h() {
        this.f7060a = 0;
        m7643a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    /* renamed from: a */
    private synchronized void m7643a(final Context context) {
        Log.m7738w("efs.send_log", "tryFileLock start! ");
        this.f7060a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.b.h.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock lock;
                try {
                    File m7741a = C1713a.m7741a(context);
                    if (!m7741a.exists()) {
                        m7741a.mkdirs();
                    }
                    File file = new File(m7741a.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        C1677h.f7059b = lock;
                    } while (!lock.isValid());
                    Log.m7738w("efs.send_log", "tryFileLock sendlock sucess! processname: " + ProcessUtil.getCurrentProcessName());
                    C1677h.this.f7060a = 2;
                } catch (Exception e10) {
                    Log.m7738w("efs.send_log", "tryFileLock fail! " + e10.getMessage());
                    C1677h.this.f7060a = 0;
                }
            }
        }).start();
    }
}
