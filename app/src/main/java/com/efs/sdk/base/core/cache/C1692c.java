package com.efs.sdk.base.core.cache;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import java.io.File;

/* renamed from: com.efs.sdk.base.core.cache.c */
/* loaded from: classes.dex */
public final class C1692c implements InterfaceC1693d {
    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7662a(String str) {
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7660a(LogDto logDto) {
        C1708f c1708f;
        C1708f c1708f2;
        if (logDto.getData() == null) {
            return;
        }
        String fileName = FileUtil.getFileName(logDto);
        File file = new File(C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()), fileName);
        FileUtil.write(file, logDto.getData());
        try {
            if (ControllerCenter.getGlobalEnvStruct().isEnablePaBackup() && "patrace".equals(logDto.getLogType())) {
                File file2 = new File(ControllerCenter.getGlobalEnvStruct().mAppContext.getApplicationInfo().dataDir + File.separator + "apm_backup_files", fileName);
                FileUtil.copy(file, file2);
                if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
                    Log.m7722d("efs.base", "backup patrace file to " + file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        c1708f = C1708f.a.f7163a;
        c1708f.f7161c.m7710b();
        c1708f2 = C1708f.a.f7163a;
        c1708f2.f7161c.m7711c();
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7661a(File file) {
        FileUtil.move(file, C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final boolean mo7663a(File file, LogDto logDto) {
        if (!file.exists()) {
            return false;
        }
        logDto.setFile(file);
        logDto.setSendImediately(true);
        logDto.setLogBodyType(1);
        return true;
    }
}
