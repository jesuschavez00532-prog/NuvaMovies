package com.efs.sdk.base.core.cache;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p051b.HandlerC1672c;
import com.efs.sdk.base.core.util.FileUtil;
import java.io.File;

/* renamed from: com.efs.sdk.base.core.cache.f */
/* loaded from: classes.dex */
public final class C1695f implements IFileFilter {
    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final boolean filter(File file) {
        LogDto createLogDtoByName;
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
            createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
        } else {
            createLogDtoByName = FileUtil.createLogDtoByName(name);
        }
        if (createLogDtoByName == null) {
            CacheManager.getInstance().onChangeDtoError(file);
            return true;
        }
        if (!"wa".equals(createLogDtoByName.getLogType()) && !HandlerC1672c.m7631a().m7637a(createLogDtoByName.getLogType(), file.length())) {
            return true;
        }
        return false;
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final void finish() {
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final boolean hasTask() {
        return false;
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public final void finish(boolean z10, boolean z11) {
    }
}
