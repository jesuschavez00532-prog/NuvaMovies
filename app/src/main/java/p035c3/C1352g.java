package p035c3;

import android.content.SharedPreferences;
import com.lzy.okgo.cache.CacheEntity;
import ne.AbstractC5868k;
import p363v2.C7197a;

/* renamed from: c3.g */
/* loaded from: classes.dex */
public final class C1352g {

    /* renamed from: a */
    public static final C1352g f5080a;

    /* renamed from: b */
    private static final String f5081b;

    /* renamed from: c */
    private static SharedPreferences f5082c;

    static {
        C1352g c1352g = new C1352g();
        f5080a = c1352g;
        f5081b = c1352g.getClass().getSimpleName();
    }

    private C1352g() {
    }

    /* renamed from: a */
    public final String m6122a(String str) {
        String str2 = null;
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (f5082c == null) {
            f5082c = C7197a.f26917a.m27844a().getSharedPreferences("log", 0);
        }
        SharedPreferences sharedPreferences = f5082c;
        if (sharedPreferences != null) {
            str2 = sharedPreferences.getString(str, "");
        } else {
            str2 = null;
        }
        String m6112a = AbstractC1346a.m6112a(str2);
        AbstractC5868k.m23673e(m6112a, "decrypt(sp?.getString(key, \"\"))");
        return m6112a;
    }

    /* renamed from: b */
    public final void m6123b(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "value");
        if (f5082c == null) {
            f5082c = C7197a.f26917a.m27844a().getSharedPreferences("log", 0);
        }
        SharedPreferences sharedPreferences = f5082c;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(str, str2)) != null) {
            putString.apply();
        }
    }

    /* renamed from: c */
    public final void m6124c(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "value");
        if (f5082c == null) {
            f5082c = C7197a.f26917a.m27844a().getSharedPreferences("log", 0);
        }
        SharedPreferences sharedPreferences = f5082c;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(str, AbstractC1346a.m6114c(str2))) != null) {
            putString.apply();
        }
    }
}
