package p361v0;

import android.content.Context;
import android.content.SharedPreferences;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;

/* renamed from: v0.f */
/* loaded from: classes.dex */
public final class C7193f {

    /* renamed from: a */
    public static final C7193f f26903a = new C7193f();

    private C7193f() {
    }

    /* renamed from: a */
    public final Object m27828a(Context context, String str, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences sharedPreferences = context.getSharedPreferences("advert", 0);
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Number) obj).floatValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Number) obj).longValue()));
        }
        throw new IllegalArgumentException("不支持该类型的数据");
    }

    /* renamed from: b */
    public final Object m27829b(Context context, String str, String str2, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str2, CacheEntity.KEY);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str2, ((Number) obj).intValue()));
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str2, (String) obj);
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str2, ((Number) obj).floatValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str2, ((Number) obj).longValue()));
        }
        throw new IllegalArgumentException("不支持该类型的数据");
    }

    /* renamed from: c */
    public final void m27830c(Context context, String str, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences.Editor edit = context.getSharedPreferences("advert", 0).edit();
        if (obj instanceof Integer) {
            edit.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Number) obj).longValue());
        } else {
            throw new IllegalArgumentException("不支持该类型的数据");
        }
        edit.apply();
    }

    /* renamed from: d */
    public final void m27831d(Context context, String str, String str2, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str2, CacheEntity.KEY);
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if (obj instanceof Integer) {
            edit.putInt(str2, ((Number) obj).intValue());
        } else if (obj instanceof String) {
            edit.putString(str2, (String) obj);
        } else if (obj instanceof Float) {
            edit.putFloat(str2, ((Number) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str2, ((Number) obj).longValue());
        } else {
            throw new IllegalArgumentException("不支持该类型的数据");
        }
        edit.apply();
    }
}
