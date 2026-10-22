package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.efs.sdk.memoryinfo.c */
/* loaded from: classes.dex */
public final class C1743c {
    final String activity;

    /* renamed from: bg */
    final String f7287bg;

    /* renamed from: n */
    final long f7288n;

    /* renamed from: o */
    final long f7289o;

    /* renamed from: p */
    final long f7290p;

    /* renamed from: q */
    final long f7291q;

    /* renamed from: r */
    final float f7292r;

    /* renamed from: s */
    final long f7293s;

    /* renamed from: t */
    final long f7294t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1743c(Context context) {
        String str;
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        if (UMMemoryMonitor.get().isForeground()) {
            str = "fg";
        } else {
            str = "bg";
        }
        this.f7287bg = str;
        this.f7288n = memoryInfo.getTotalPss() * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        this.f7289o = memoryInfo.dalvikPss * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        this.f7290p = memoryInfo.nativePss * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        this.f7293s = C1746f.m7815a(memoryInfo) * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.f7291q = freeMemory;
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory != 0) {
            this.f7292r = (((float) freeMemory) * 1.0f) / ((float) maxMemory);
        } else {
            this.f7292r = 1.0f;
        }
        this.f7294t = C1746f.m7814a() * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
