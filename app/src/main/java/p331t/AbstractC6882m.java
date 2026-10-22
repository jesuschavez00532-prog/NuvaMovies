package p331t;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: t.m */
/* loaded from: classes.dex */
public abstract class AbstractC6882m {
    /* renamed from: a */
    public static boolean m26795a(Context context) {
        Object systemService;
        boolean isUserUnlocked;
        if (Build.VERSION.SDK_INT >= 24) {
            systemService = context.getSystemService((Class<Object>) UserManager.class);
            isUserUnlocked = ((UserManager) systemService).isUserUnlocked();
            return isUserUnlocked;
        }
        return true;
    }
}
