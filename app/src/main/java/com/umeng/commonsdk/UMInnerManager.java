package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class UMInnerManager {
    private static Class<?> innerImplClazz;
    private static Method sendInternalMethod;

    static {
        try {
            int i10 = UMInnerImpl.f15087a;
            innerImplClazz = UMInnerImpl.class;
            Method declaredMethod = UMInnerImpl.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                sendInternalMethod = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    public static void sendInnerPackage(Context context) {
        Method method;
        if (context != null && UMUtils.isMainProgress(context)) {
            if (SdkVersion.SDK_TYPE != 1) {
                Class<?> cls = innerImplClazz;
                if (cls != null && (method = sendInternalMethod) != null) {
                    try {
                        method.invoke(cls, context);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            UMConfigureInternation.sendInternal(context);
        }
    }
}
