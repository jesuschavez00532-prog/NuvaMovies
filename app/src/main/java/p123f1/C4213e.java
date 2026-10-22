package p123f1;

import android.content.Context;
import android.content.SharedPreferences;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.cache.CacheEntity;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p421z0.C7734h;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public final class C4213e {

    /* renamed from: b */
    public static final b f18477b = new b(null);

    /* renamed from: c */
    private static final InterfaceC1312h f18478c;

    /* renamed from: a */
    private final SharedPreferences f18479a;

    /* renamed from: f1.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f18480a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4213e invoke() {
            return new C4213e("bbconfig", null);
        }
    }

    /* renamed from: f1.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C4213e m17613a() {
            return (C4213e) C4213e.f18478c.getValue();
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f18480a);
        f18478c = m5965b;
    }

    public /* synthetic */ C4213e(String str, AbstractC5864g abstractC5864g) {
        this(str);
    }

    /* renamed from: b */
    public final Object m17610b(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (obj instanceof Integer) {
            return Integer.valueOf(this.f18479a.getInt(str, ((Number) obj).intValue()));
        }
        if (obj instanceof String) {
            return this.f18479a.getString(str, (String) obj);
        }
        if (obj instanceof Float) {
            return Float.valueOf(this.f18479a.getFloat(str, ((Number) obj).floatValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(this.f18479a.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(this.f18479a.getLong(str, ((Number) obj).longValue()));
        }
        throw new IllegalArgumentException("不支持该类型的数据");
    }

    /* renamed from: c */
    public final void m17611c(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences.Editor edit = this.f18479a.edit();
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

    private C4213e(String str) {
        Context m29893j = C7734h.f28449q.m29905a().m29893j();
        AbstractC5868k.m23671c(m29893j);
        SharedPreferences sharedPreferences = m29893j.getSharedPreferences(str, 0);
        AbstractC5868k.m23673e(sharedPreferences, "BigBee.mInstance.mContex…me, Context.MODE_PRIVATE)");
        this.f18479a = sharedPreferences;
    }
}
