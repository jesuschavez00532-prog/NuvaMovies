package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;
import org.android.agoo.common.Config;

/* renamed from: com.umeng.commonsdk.config.g */
/* loaded from: classes3.dex */
public class C3440g implements InterfaceC3438e {
    @Override // com.umeng.commonsdk.config.InterfaceC3438e
    /* renamed from: a */
    public void mo14558a(String str, Object obj, String[] strArr) {
        if (str != null && str.length() > 0) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong == -1) {
                    UMRTLog.m14568e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                    return;
                }
                UMRTLog.m14569i(Config.TAG, "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
                if (obj != null && (obj instanceof C3435b)) {
                    for (int i10 = 0; i10 < strArr.length; i10++) {
                        try {
                            String str2 = strArr[i10];
                            if (C3437d.m14559a(str2)) {
                                ((C3435b) obj).mo14556a(str2, Boolean.valueOf(C3434a.m14548a(parseLong, i10)));
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused2) {
                UMRTLog.m14568e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
            }
        }
    }
}
