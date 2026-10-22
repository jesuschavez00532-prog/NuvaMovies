package com.bytedance.boost_multidex;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class OptimizeService extends IntentService {
    static volatile boolean sAlreadyOpt;
    File mDexDir;
    File mOptDexDir;
    File mRootDir;
    File mZipDir;

    public OptimizeService() {
        super("OptimizeService");
        if (Monitor.get() == null) {
            Monitor.init(null);
        }
        Monitor.get().logDebug("Starting OptimizeService");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012a A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:8:0x0034, B:10:0x003a, B:12:0x004e, B:14:0x0091, B:16:0x0104, B:18:0x012a, B:36:0x0139, B:20:0x016e, B:25:0x020c, B:27:0x0220, B:29:0x0227, B:34:0x01fa, B:42:0x00ba, B:45:0x00c4, B:48:0x00ce, B:53:0x0248, B:54:0x024f, B:22:0x01a3, B:24:0x01ad), top: B:7:0x0034, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleOptimize() {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.handleOptimize():void");
    }

    public static void startOptimizeService(Context context) {
        context.startService(new Intent(context, (Class<?>) OptimizeService.class));
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            File filesDir = getFilesDir();
            if (!filesDir.exists()) {
                Utility.mkdirChecked(filesDir);
            }
            File ensureDirCreated = Utility.ensureDirCreated(filesDir, Constants.BOOST_MULTIDEX_DIR_NAME);
            this.mRootDir = ensureDirCreated;
            this.mDexDir = Utility.ensureDirCreated(ensureDirCreated, Constants.DEX_DIR_NAME);
            this.mOptDexDir = Utility.ensureDirCreated(this.mRootDir, Constants.ODEX_DIR_NAME);
            this.mZipDir = Utility.ensureDirCreated(this.mRootDir, Constants.ZIP_DIR_NAME);
        } catch (IOException e10) {
            Monitor.get().logError("fail to create files", e10);
            sAlreadyOpt = true;
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                handleOptimize();
            } catch (IOException e10) {
                Monitor.get().logError("fail to handle opt", e10);
            }
        }
    }
}
