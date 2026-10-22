package com.bytedance.boost_multidex;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Monitor {
    private static final boolean enableLog = true;
    private static Monitor sMonitor;
    private ScheduledExecutorService mExecutor = Executors.newScheduledThreadPool(1);
    private String mProcessName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Monitor get() {
        return sMonitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScheduledExecutorService getExecutor() {
        return this.mExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void doAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.boost_multidex.Monitor.1
            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                Monitor.this.getExecutor().schedule(runnable, 5000L, TimeUnit.MILLISECONDS);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void doBeforeHandleOpt() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getProcessName() {
        return this.mProcessName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logDebug(String str) {
        Log.d(Constants.TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logError(String str) {
        Log.println(6, Constants.TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
        Log.e(Constants.TAG, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logInfo(String str) {
        Log.i(Constants.TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logWarning(String str) {
        Log.w(Constants.TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void reportAfterInstall(long j10, long j11, long j12, String str) {
        Log.println(4, Constants.TAG, "Cost time: " + j10 + ", free space: " + j11 + ", reduced space: " + j12 + ", holder: " + str);
    }

    public Monitor setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.mExecutor = scheduledExecutorService;
        return this;
    }

    public Monitor setProcessName(String str) {
        this.mProcessName = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
        Log.e(Constants.TAG, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
        Log.w(Constants.TAG, str, th);
    }
}
