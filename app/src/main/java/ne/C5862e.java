package ne;

import be.AbstractC1324t;
import be.C1318n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5643b;
import me.InterfaceC5644c;
import me.InterfaceC5645d;
import me.InterfaceC5646e;
import me.InterfaceC5647f;
import me.InterfaceC5648g;
import me.InterfaceC5649h;
import me.InterfaceC5650i;
import me.InterfaceC5651j;
import me.InterfaceC5659k;
import me.InterfaceC5660l;
import me.InterfaceC5661m;
import me.InterfaceC5662n;
import me.InterfaceC5663o;
import me.InterfaceC5664p;
import me.InterfaceC5665q;
import me.InterfaceC5666r;
import me.InterfaceC5667s;
import me.InterfaceC5668t;
import me.InterfaceC5669u;
import me.InterfaceC5670v;
import me.InterfaceC5671w;
import p043ce.AbstractC1485b0;
import p043ce.AbstractC1487c0;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1501m;
import p226le.AbstractC5553a;
import p359ue.AbstractC7167u;
import se.InterfaceC6865b;

/* renamed from: ne.e */
/* loaded from: classes3.dex */
public final class C5862e implements InterfaceC6865b, InterfaceC5861d {

    /* renamed from: b */
    public static final a f23396b = new a(null);

    /* renamed from: c */
    private static final Map f23397c;

    /* renamed from: d */
    private static final HashMap f23398d;

    /* renamed from: e */
    private static final HashMap f23399e;

    /* renamed from: f */
    private static final HashMap f23400f;

    /* renamed from: g */
    private static final Map f23401g;

    /* renamed from: a */
    private final Class f23402a;

    /* renamed from: ne.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    static {
        List m6988g;
        int m6992k;
        Map m6941i;
        int m6932a;
        String m27753W = null;
        String m27753W2 = null;
        int i10 = 0;
        m6988g = AbstractC1500l.m6988g(InterfaceC5642a.class, InterfaceC5660l.class, InterfaceC5664p.class, InterfaceC5665q.class, InterfaceC5666r.class, InterfaceC5667s.class, InterfaceC5668t.class, InterfaceC5669u.class, InterfaceC5670v.class, InterfaceC5671w.class, InterfaceC5643b.class, InterfaceC5644c.class, InterfaceC5645d.class, InterfaceC5646e.class, InterfaceC5647f.class, InterfaceC5648g.class, InterfaceC5649h.class, InterfaceC5650i.class, InterfaceC5651j.class, InterfaceC5659k.class, InterfaceC5661m.class, InterfaceC5662n.class, InterfaceC5663o.class);
        m6992k = AbstractC1501m.m6992k(m6988g, 10);
        ArrayList arrayList = new ArrayList(m6992k);
        for (Object obj : m6988g) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            arrayList.add(AbstractC1324t.m5980a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        m6941i = AbstractC1487c0.m6941i(arrayList);
        f23397c = m6941i;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f23398d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f23399e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC5868k.m23673e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            AbstractC5868k.m23673e(str, "kotlinName");
            m27753W2 = AbstractC7167u.m27753W(str, '.', null, 2, null);
            sb2.append(m27753W2);
            sb2.append("CompanionObject");
            C1318n m5980a = AbstractC1324t.m5980a(sb2.toString(), str + ".Companion");
            hashMap3.put(m5980a.m5969c(), m5980a.m5970d());
        }
        for (Map.Entry entry : f23397c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f23400f = hashMap3;
        m6932a = AbstractC1485b0.m6932a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m6932a);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m27753W = AbstractC7167u.m27753W((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m27753W);
        }
        f23401g = linkedHashMap;
    }

    public C5862e(Class cls) {
        AbstractC5868k.m23674f(cls, "jClass");
        this.f23402a = cls;
    }

    @Override // ne.InterfaceC5861d
    /* renamed from: a */
    public Class mo23666a() {
        return this.f23402a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C5862e) && AbstractC5868k.m23669a(AbstractC5553a.m22515a(this), AbstractC5553a.m22515a((InterfaceC6865b) obj))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC5553a.m22515a(this).hashCode();
    }

    public String toString() {
        return mo23666a().toString() + " (Kotlin reflection is not available)";
    }
}
