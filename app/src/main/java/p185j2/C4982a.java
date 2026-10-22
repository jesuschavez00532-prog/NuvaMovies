package p185j2;

import android.content.Context;
import android.content.SharedPreferences;
import com.lzy.okgo.cache.CacheEntity;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public final class C4982a {

    /* renamed from: a */
    public static final C4982a f20721a = new C4982a();

    /* renamed from: j2.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private SharedPreferences f20722a;

        /* renamed from: b */
        private SharedPreferences.Editor f20723b;

        /* renamed from: a */
        public final void m20336a() {
            SharedPreferences.Editor editor = this.f20723b;
            if (editor != null) {
                editor.apply();
            }
        }

        /* renamed from: b */
        public final a m20337b(Context context) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            this.f20722a = context.getSharedPreferences("cache.config", 0);
            return this;
        }

        /* renamed from: c */
        public final a m20338c(String str, Object obj) {
            SharedPreferences.Editor editor;
            SharedPreferences.Editor editor2;
            AbstractC5868k.m23674f(str, CacheEntity.KEY);
            if (this.f20723b == null) {
                SharedPreferences sharedPreferences = this.f20722a;
                if (sharedPreferences != null) {
                    editor2 = sharedPreferences.edit();
                } else {
                    editor2 = null;
                }
                this.f20723b = editor2;
            }
            if (obj instanceof Integer) {
                SharedPreferences.Editor editor3 = this.f20723b;
                if (editor3 != null) {
                    editor3.putInt(str, ((Number) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                SharedPreferences.Editor editor4 = this.f20723b;
                if (editor4 != null) {
                    editor4.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof String) {
                SharedPreferences.Editor editor5 = this.f20723b;
                if (editor5 != null) {
                    editor5.putString(str, (String) obj);
                }
            } else if (obj instanceof Float) {
                SharedPreferences.Editor editor6 = this.f20723b;
                if (editor6 != null) {
                    editor6.putFloat(str, ((Number) obj).floatValue());
                }
            } else if ((obj instanceof Long) && (editor = this.f20723b) != null) {
                editor.putLong(str, ((Number) obj).longValue());
            }
            return this;
        }

        /* renamed from: d */
        public final Object m20339d(String str, Object obj) {
            Object valueOf;
            AbstractC5868k.m23674f(str, CacheEntity.KEY);
            if (obj instanceof Integer) {
                SharedPreferences sharedPreferences = this.f20722a;
                if (sharedPreferences != null) {
                    valueOf = Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
                    return valueOf;
                }
                return null;
            }
            if (obj instanceof Boolean) {
                SharedPreferences sharedPreferences2 = this.f20722a;
                if (sharedPreferences2 != null) {
                    valueOf = Boolean.valueOf(sharedPreferences2.getBoolean(str, ((Boolean) obj).booleanValue()));
                    return valueOf;
                }
                return null;
            }
            if (obj instanceof String) {
                SharedPreferences sharedPreferences3 = this.f20722a;
                if (sharedPreferences3 != null) {
                    valueOf = sharedPreferences3.getString(str, (String) obj);
                    return valueOf;
                }
                return null;
            }
            if (obj instanceof Float) {
                SharedPreferences sharedPreferences4 = this.f20722a;
                if (sharedPreferences4 != null) {
                    valueOf = Float.valueOf(sharedPreferences4.getFloat(str, ((Number) obj).floatValue()));
                    return valueOf;
                }
                return null;
            }
            if (obj instanceof Long) {
                SharedPreferences sharedPreferences5 = this.f20722a;
                if (sharedPreferences5 != null) {
                    valueOf = Long.valueOf(sharedPreferences5.getLong(str, ((Number) obj).longValue()));
                    return valueOf;
                }
                return null;
            }
            return obj;
        }

        /* renamed from: e */
        public final a m20340e(String str) {
            SharedPreferences.Editor editor;
            AbstractC5868k.m23674f(str, CacheEntity.KEY);
            if (this.f20723b == null) {
                SharedPreferences sharedPreferences = this.f20722a;
                if (sharedPreferences != null) {
                    editor = sharedPreferences.edit();
                } else {
                    editor = null;
                }
                this.f20723b = editor;
            }
            SharedPreferences.Editor editor2 = this.f20723b;
            if (editor2 != null) {
                editor2.remove(str);
            }
            return this;
        }
    }

    private C4982a() {
    }

    /* renamed from: a */
    public final Object m20333a(Context context, String str, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return new a().m20337b(context).m20339d(str, obj);
    }

    /* renamed from: b */
    public final a m20334b(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        return new a().m20337b(context);
    }

    /* renamed from: c */
    public final void m20335c(Context context, String str, Object obj) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        new a().m20337b(context).m20338c(str, obj).m20336a();
    }
}
