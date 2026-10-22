package p211kc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Locale;

/* renamed from: kc.b */
/* loaded from: classes.dex */
public abstract class AbstractC5147b {
    /* renamed from: a */
    public static boolean m20812a() {
        if ("zh".equals(Locale.getDefault().getLanguage())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20813b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }
}
