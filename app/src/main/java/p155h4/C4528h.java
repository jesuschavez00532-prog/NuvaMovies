package p155h4;

import android.os.Build;
import android.util.Log;

/* renamed from: h4.h */
/* loaded from: classes.dex */
public final class C4528h extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z10) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return C4529i.class;
            }
            return C4529i.class;
        }
        return super.loadClass(str, z10);
    }
}
