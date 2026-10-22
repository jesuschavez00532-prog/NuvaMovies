package p365v4;

import android.os.Build;

/* renamed from: v4.e */
/* loaded from: classes.dex */
abstract class AbstractC7206e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m27903a() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }
}
