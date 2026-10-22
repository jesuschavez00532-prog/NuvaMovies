package p215l0;

import android.content.SharedPreferences;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5313a {

    /* renamed from: a */
    private static SharedPreferences f21639a;

    /* renamed from: a */
    public static void m21447a(String str) {
        SharedPreferences sharedPreferences;
        if (str != null && (sharedPreferences = f21639a) != null) {
            sharedPreferences.edit().putString("networksdk_target_cookie_name", str).apply();
        }
    }
}
