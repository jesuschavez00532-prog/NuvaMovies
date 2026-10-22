package com.efs.sdk.base.core.cache;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.lzy.okgo.OkGo;
import com.titans.entity.CdnType;
import java.io.File;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.efs.sdk.base.core.cache.b */
/* loaded from: classes.dex */
public final class HandlerC1691b extends Handler implements Runnable {

    /* renamed from: a */
    boolean f7078a;

    /* renamed from: b */
    boolean f7079b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.cache.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final HandlerC1691b f7080a = new HandlerC1691b(0);
    }

    /* synthetic */ HandlerC1691b(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1691b m7658a() {
        return a.f7080a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            Log.m7738w("efs.cache", "disk listener not support command: " + message.what);
            return;
        }
        WorkThreadUtil.submit(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        CacheManager.getInstance();
        File m7750h = C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (m7750h.exists()) {
            for (File file : FileUtil.listFiles(m7750h)) {
                if (CacheManager.m7654a(file.getName())) {
                    CacheManager.m7653a(file);
                }
            }
        }
        CacheManager.getInstance();
        File m7751i = C1713a.m7751i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (m7751i.exists()) {
            for (File file2 : FileUtil.listFiles(m7751i)) {
                if (CacheManager.m7654a(file2.getName())) {
                    CacheManager.m7653a(file2);
                }
            }
        }
        long parseLong = Long.parseLong(C1698b.m7679a().m7691a("disk_bytes", "4194304"));
        long folderSize = FileUtil.getFolderSize(C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + FileUtil.getFolderSize(C1713a.m7746d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        boolean z11 = true;
        if (folderSize < parseLong) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7078a = z10;
        if (!z10) {
            Log.m7738w("efs.cache", "Cache Limited! curr " + folderSize + "byte, max " + parseLong + " byte.");
        }
        long parseLong2 = Long.parseLong(C1698b.m7679a().m7691a("apm_codelog_store_max", CdnType.DIGITAL_TYPE_PCDN)) * IjkMediaMeta.AV_CH_SIDE_RIGHT * IjkMediaMeta.AV_CH_SIDE_RIGHT;
        long folderSize2 = FileUtil.getFolderSize(C1713a.m7751i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + FileUtil.getFolderSize(C1713a.m7747e(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        if (folderSize2 >= parseLong2) {
            z11 = false;
        }
        this.f7079b = z11;
        if (!z11) {
            Log.m7738w("efs.cache", "code log. Cache Limited! curr " + folderSize2 + "byte, max " + parseLong2 + " byte.");
        }
        sendEmptyMessageDelayed(2, 600000L);
    }

    private HandlerC1691b() {
        super(C1720a.f7206a.getLooper());
        this.f7078a = true;
        this.f7079b = true;
        sendEmptyMessageDelayed(2, OkGo.DEFAULT_MILLISECONDS);
    }
}
