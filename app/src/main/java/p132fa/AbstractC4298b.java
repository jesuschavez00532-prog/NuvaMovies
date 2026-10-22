package p132fa;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fa.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4298b {

    /* renamed from: a */
    private static SharedPreferences f18624a;

    /* renamed from: a */
    public static int m17989a(String str) {
        SharedPreferences sharedPreferences = f18624a;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, 0);
    }

    /* renamed from: b */
    public static int m17990b(String str, int i10) {
        SharedPreferences sharedPreferences = f18624a;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, i10);
    }

    /* renamed from: c */
    public static void m17991c(Context context) {
        if (f18624a == null) {
            f18624a = context.getSharedPreferences("FTV_SETTING", 0);
        }
    }

    /* renamed from: d */
    public static boolean m17992d(String str, int i10) {
        SharedPreferences sharedPreferences = f18624a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().putInt(str, i10).commit();
        }
        return false;
    }
}
