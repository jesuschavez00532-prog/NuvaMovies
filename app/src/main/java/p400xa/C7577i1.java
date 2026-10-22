package p400xa;

import android.content.SharedPreferences;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.cache.CacheEntity;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p287pb.AbstractApplicationC6253c;

/* renamed from: xa.i1 */
/* loaded from: classes2.dex */
public final class C7577i1 {

    /* renamed from: b */
    public static final f f27838b = new f(null);

    /* renamed from: c */
    private static final InterfaceC1312h f27839c;

    /* renamed from: d */
    private static final InterfaceC1312h f27840d;

    /* renamed from: e */
    private static final InterfaceC1312h f27841e;

    /* renamed from: f */
    private static final InterfaceC1312h f27842f;

    /* renamed from: g */
    private static final InterfaceC1312h f27843g;

    /* renamed from: a */
    private final SharedPreferences f27844a;

    /* renamed from: xa.i1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f27845a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7577i1 invoke() {
            return new C7577i1("sortSharedPreferences", null);
        }
    }

    /* renamed from: xa.i1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f27846a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7577i1 invoke() {
            return new C7577i1("cache.config", null);
        }
    }

    /* renamed from: xa.i1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f27847a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7577i1 invoke() {
            return new C7577i1("config", null);
        }
    }

    /* renamed from: xa.i1$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f27848a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7577i1 invoke() {
            return new C7577i1("tv_brasil", null);
        }
    }

    /* renamed from: xa.i1$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f27849a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7577i1 invoke() {
            return new C7577i1("version", null);
        }
    }

    /* renamed from: xa.i1$f */
    /* loaded from: classes2.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7577i1 m29082a() {
            return (C7577i1) C7577i1.f27839c.getValue();
        }

        /* renamed from: b */
        public final C7577i1 m29083b() {
            return (C7577i1) C7577i1.f27841e.getValue();
        }

        /* renamed from: c */
        public final C7577i1 m29084c() {
            return (C7577i1) C7577i1.f27842f.getValue();
        }

        /* renamed from: d */
        public final C7577i1 m29085d() {
            return (C7577i1) C7577i1.f27840d.getValue();
        }

        /* renamed from: e */
        public final C7577i1 m29086e() {
            return (C7577i1) C7577i1.f27843g.getValue();
        }
    }

    static {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        m5965b = AbstractC1314j.m5965b(a.f27845a);
        f27839c = m5965b;
        m5965b2 = AbstractC1314j.m5965b(d.f27848a);
        f27840d = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(b.f27846a);
        f27841e = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(c.f27847a);
        f27842f = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(e.f27849a);
        f27843g = m5965b5;
    }

    public /* synthetic */ C7577i1(String str, AbstractC5864g abstractC5864g) {
        this(str);
    }

    /* renamed from: f */
    public final Object m29074f(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        if (obj instanceof Integer) {
            return Integer.valueOf(this.f27844a.getInt(str, ((Number) obj).intValue()));
        }
        if (obj instanceof String) {
            return this.f27844a.getString(str, (String) obj);
        }
        if (obj instanceof Float) {
            return Float.valueOf(this.f27844a.getFloat(str, ((Number) obj).floatValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(this.f27844a.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(this.f27844a.getLong(str, ((Number) obj).longValue()));
        }
        throw new IllegalArgumentException("不支持该类型的数据");
    }

    /* renamed from: g */
    public final SharedPreferences m29075g() {
        return this.f27844a;
    }

    /* renamed from: h */
    public final void m29076h(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences.Editor edit = this.f27844a.edit();
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

    private C7577i1(String str) {
        SharedPreferences sharedPreferences = AbstractApplicationC6253c.f24484b.m24887a().getSharedPreferences(str, 0);
        AbstractC5868k.m23673e(sharedPreferences, "BaseApp.context.getShare…me, Context.MODE_PRIVATE)");
        this.f27844a = sharedPreferences;
    }
}
