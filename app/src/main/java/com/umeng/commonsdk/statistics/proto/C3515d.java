package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3366dg;
import com.umeng.analytics.pro.AbstractC3376dq;
import com.umeng.analytics.pro.AbstractC3377dr;
import com.umeng.analytics.pro.C3337ce;
import com.umeng.analytics.pro.C3346cn;
import com.umeng.analytics.pro.C3352ct;
import com.umeng.analytics.pro.C3353cu;
import com.umeng.analytics.pro.C3355cw;
import com.umeng.analytics.pro.C3357cy;
import com.umeng.analytics.pro.C3360da;
import com.umeng.analytics.pro.C3361db;
import com.umeng.analytics.pro.C3363dd;
import com.umeng.analytics.pro.C3367dh;
import com.umeng.analytics.pro.C3369dj;
import com.umeng.analytics.pro.C3371dl;
import com.umeng.analytics.pro.C3372dm;
import com.umeng.analytics.pro.C3373dn;
import com.umeng.analytics.pro.C3378ds;
import com.umeng.analytics.pro.InterfaceC3340ch;
import com.umeng.analytics.pro.InterfaceC3347co;
import com.umeng.analytics.pro.InterfaceC3374do;
import com.umeng.analytics.pro.InterfaceC3375dp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.d */
/* loaded from: classes3.dex */
public class C3515d implements InterfaceC3340ch<C3515d, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3352ct> f15568d;

    /* renamed from: e */
    private static final long f15569e = 2846460275012375038L;

    /* renamed from: f */
    private static final C3371dl f15570f = new C3371dl("Imprint");

    /* renamed from: g */
    private static final C3361db f15571g = new C3361db("property", C3373dn.f14523k, 1);

    /* renamed from: h */
    private static final C3361db f15572h = new C3361db("version", (byte) 8, 2);

    /* renamed from: i */
    private static final C3361db f15573i = new C3361db("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f15574j;

    /* renamed from: k */
    private static final int f15575k = 0;

    /* renamed from: a */
    public Map<String, C3516e> f15576a;

    /* renamed from: b */
    public int f15577b;

    /* renamed from: c */
    public String f15578c;

    /* renamed from: l */
    private byte f15579l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3515d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3515d c3515d) {
            abstractC3366dg.mo14160j();
            while (true) {
                C3361db mo14162l = abstractC3366dg.mo14162l();
                byte b10 = mo14162l.f14486b;
                if (b10 == 0) {
                    break;
                }
                short s10 = mo14162l.f14487c;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        } else if (b10 == 11) {
                            c3515d.f15578c = abstractC3366dg.mo14176z();
                            c3515d.m15054c(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 8) {
                        c3515d.f15577b = abstractC3366dg.mo14173w();
                        c3515d.m15052b(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 13) {
                    C3363dd mo14164n = abstractC3366dg.mo14164n();
                    c3515d.f15576a = new HashMap(mo14164n.f14492c * 2);
                    for (int i10 = 0; i10 < mo14164n.f14492c; i10++) {
                        String mo14176z = abstractC3366dg.mo14176z();
                        C3516e c3516e = new C3516e();
                        c3516e.read(abstractC3366dg);
                        c3515d.f15576a.put(mo14176z, c3516e);
                    }
                    abstractC3366dg.mo14165o();
                    c3515d.m15049a(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
            abstractC3366dg.mo14161k();
            if (c3515d.m15059h()) {
                c3515d.m15063l();
                return;
            }
            throw new C3367dh("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3515d c3515d) {
            c3515d.m15063l();
            abstractC3366dg.mo14144a(C3515d.f15570f);
            if (c3515d.f15576a != null) {
                abstractC3366dg.mo14139a(C3515d.f15571g);
                abstractC3366dg.mo14141a(new C3363dd((byte) 11, (byte) 12, c3515d.f15576a.size()));
                for (Map.Entry<String, C3516e> entry : c3515d.f15576a.entrySet()) {
                    abstractC3366dg.mo14145a(entry.getKey());
                    entry.getValue().write(abstractC3366dg);
                }
                abstractC3366dg.mo14155e();
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14139a(C3515d.f15572h);
            abstractC3366dg.mo14137a(c3515d.f15577b);
            abstractC3366dg.mo14151c();
            if (c3515d.f15578c != null) {
                abstractC3366dg.mo14139a(C3515d.f15573i);
                abstractC3366dg.mo14145a(c3515d.f15578c);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    /* loaded from: classes3.dex */
    private static class b implements InterfaceC3375dp {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3375dp
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo13975b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3515d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3515d c3515d) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14137a(c3515d.f15576a.size());
            for (Map.Entry<String, C3516e> entry : c3515d.f15576a.entrySet()) {
                c3372dm.mo14145a(entry.getKey());
                entry.getValue().write(c3372dm);
            }
            c3372dm.mo14137a(c3515d.f15577b);
            c3372dm.mo14145a(c3515d.f15578c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3515d c3515d) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            C3363dd c3363dd = new C3363dd((byte) 11, (byte) 12, c3372dm.mo14173w());
            c3515d.f15576a = new HashMap(c3363dd.f14492c * 2);
            for (int i10 = 0; i10 < c3363dd.f14492c; i10++) {
                String mo14176z = c3372dm.mo14176z();
                C3516e c3516e = new C3516e();
                c3516e.read(c3372dm);
                c3515d.f15576a.put(mo14176z, c3516e);
            }
            c3515d.m15049a(true);
            c3515d.f15577b = c3372dm.mo14173w();
            c3515d.m15052b(true);
            c3515d.f15578c = c3372dm.mo14176z();
            c3515d.m15054c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    /* loaded from: classes3.dex */
    private static class d implements InterfaceC3375dp {
        private d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3375dp
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo13975b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f15574j = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new C3352ct("property", (byte) 1, new C3355cw(C3373dn.f14523k, new C3353cu((byte) 11), new C3357cy((byte) 12, C3516e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new C3352ct("version", (byte) 1, new C3353cu((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3352ct("checksum", (byte) 1, new C3353cu((byte) 11)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f15568d = unmodifiableMap;
        C3352ct.m14126a(C3515d.class, unmodifiableMap);
    }

    public C3515d() {
        this.f15579l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3515d deepCopy() {
        return new C3515d(this);
    }

    /* renamed from: b */
    public int m15050b() {
        Map<String, C3516e> map = this.f15576a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3516e> m15053c() {
        return this.f15576a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f15576a = null;
        m15052b(false);
        this.f15577b = 0;
        this.f15578c = null;
    }

    /* renamed from: d */
    public void m15055d() {
        this.f15576a = null;
    }

    /* renamed from: e */
    public boolean m15056e() {
        if (this.f15576a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m15057f() {
        return this.f15577b;
    }

    /* renamed from: g */
    public void m15058g() {
        this.f15579l = C3337ce.m14044b(this.f15579l, 0);
    }

    /* renamed from: h */
    public boolean m15059h() {
        return C3337ce.m14040a(this.f15579l, 0);
    }

    /* renamed from: i */
    public String m15060i() {
        return this.f15578c;
    }

    /* renamed from: j */
    public void m15061j() {
        this.f15578c = null;
    }

    /* renamed from: k */
    public boolean m15062k() {
        if (this.f15578c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m15063l() {
        if (this.f15576a != null) {
            if (this.f15578c != null) {
                return;
            }
            throw new C3367dh("Required field 'checksum' was not present! Struct: " + toString());
        }
        throw new C3367dh("Required field 'property' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f15574j.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Imprint(");
        sb2.append("property:");
        Map<String, C3516e> map = this.f15576a;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        sb2.append(", ");
        sb2.append("version:");
        sb2.append(this.f15577b);
        sb2.append(", ");
        sb2.append("checksum:");
        String str = this.f15578c;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f15574j.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f15583d = new HashMap();

        /* renamed from: e */
        private final short f15585e;

        /* renamed from: f */
        private final String f15586f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f15583d.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f15585e = s10;
            this.f15586f = str;
        }

        /* renamed from: a */
        public static e m15070a(int i10) {
            if (i10 == 1) {
                return PROPERTY;
            }
            if (i10 == 2) {
                return VERSION;
            }
            if (i10 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static e m15072b(int i10) {
            e m15070a = m15070a(i10);
            if (m15070a != null) {
                return m15070a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15586f;
        }

        /* renamed from: a */
        public static e m15071a(String str) {
            return f15583d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15585e;
        }
    }

    /* renamed from: a */
    public void m15048a(String str, C3516e c3516e) {
        if (this.f15576a == null) {
            this.f15576a = new HashMap();
        }
        this.f15576a.put(str, c3516e);
    }

    /* renamed from: b */
    public void m15052b(boolean z10) {
        this.f15579l = C3337ce.m14032a(this.f15579l, 0, z10);
    }

    /* renamed from: c */
    public void m15054c(boolean z10) {
        if (z10) {
            return;
        }
        this.f15578c = null;
    }

    public C3515d(Map<String, C3516e> map, int i10, String str) {
        this();
        this.f15576a = map;
        this.f15577b = i10;
        m15052b(true);
        this.f15578c = str;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m15070a(i10);
    }

    /* renamed from: a */
    public C3515d m15047a(Map<String, C3516e> map) {
        this.f15576a = map;
        return this;
    }

    /* renamed from: a */
    public void m15049a(boolean z10) {
        if (z10) {
            return;
        }
        this.f15576a = null;
    }

    /* renamed from: a */
    public C3515d m15045a(int i10) {
        this.f15577b = i10;
        m15052b(true);
        return this;
    }

    public C3515d(C3515d c3515d) {
        this.f15579l = (byte) 0;
        this.f15579l = c3515d.f15579l;
        if (c3515d.m15056e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, C3516e> entry : c3515d.f15576a.entrySet()) {
                hashMap.put(entry.getKey(), new C3516e(entry.getValue()));
            }
            this.f15576a = hashMap;
        }
        this.f15577b = c3515d.f15577b;
        if (c3515d.m15062k()) {
            this.f15578c = c3515d.f15578c;
        }
    }

    /* renamed from: a */
    public C3515d m15046a(String str) {
        this.f15578c = str;
        return this;
    }

    /* renamed from: a */
    private void m15039a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: a */
    private void m15038a(ObjectInputStream objectInputStream) {
        try {
            this.f15579l = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
