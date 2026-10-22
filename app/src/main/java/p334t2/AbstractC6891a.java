package p334t2;

import com.p077uc.crashsdk.C3261d;
import com.p077uc.crashsdk.export.ICrashClient;
import com.umeng.umcrash.UMCrashCallback;
import java.lang.reflect.Field;
import p231m2.AbstractC5584b;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6891a {
    /* renamed from: a */
    public static void m26815a(UMCrashCallback uMCrashCallback) {
        try {
            Field declaredField = C3261d.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            C3261d.m13373a(new C6892b((ICrashClient) declaredField.get(null), uMCrashCallback));
        } catch (Exception e10) {
            e10.printStackTrace();
            AbstractC5584b.m22679a(e10, "FIX UM CRASH CLIENT FAIL");
        }
    }
}
