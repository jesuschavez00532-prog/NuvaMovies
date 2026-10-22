package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3366dg;
import com.umeng.analytics.pro.AbstractC3376dq;
import com.umeng.analytics.pro.AbstractC3377dr;
import com.umeng.analytics.pro.C3337ce;
import com.umeng.analytics.pro.C3346cn;
import com.umeng.analytics.pro.C3352ct;
import com.umeng.analytics.pro.C3353cu;
import com.umeng.analytics.pro.C3360da;
import com.umeng.analytics.pro.C3361db;
import com.umeng.analytics.pro.C3367dh;
import com.umeng.analytics.pro.C3369dj;
import com.umeng.analytics.pro.C3371dl;
import com.umeng.analytics.pro.C3372dm;
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

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
/* loaded from: classes3.dex */
public class C3513b implements InterfaceC3340ch<C3513b, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3352ct> f15530d;

    /* renamed from: e */
    private static final long f15531e = -6496538196005191531L;

    /* renamed from: f */
    private static final C3371dl f15532f = new C3371dl("IdSnapshot");

    /* renamed from: g */
    private static final C3361db f15533g = new C3361db("identity", (byte) 11, 1);

    /* renamed from: h */
    private static final C3361db f15534h = new C3361db("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C3361db f15535i = new C3361db("version", (byte) 8, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f15536j;

    /* renamed from: k */
    private static final int f15537k = 0;

    /* renamed from: l */
    private static final int f15538l = 1;

    /* renamed from: a */
    public String f15539a;

    /* renamed from: b */
    public long f15540b;

    /* renamed from: c */
    public int f15541c;

    /* renamed from: m */
    private byte f15542m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3513b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3513b c3513b) {
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
                        } else if (b10 == 8) {
                            c3513b.f15541c = abstractC3366dg.mo14173w();
                            c3513b.m14982c(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 10) {
                        c3513b.f15540b = abstractC3366dg.mo14174x();
                        c3513b.m14980b(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 11) {
                    c3513b.f15539a = abstractC3366dg.mo14176z();
                    c3513b.m14977a(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
            abstractC3366dg.mo14161k();
            if (c3513b.m14986g()) {
                if (c3513b.m14989j()) {
                    c3513b.m14990k();
                    return;
                }
                throw new C3367dh("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            throw new C3367dh("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3513b c3513b) {
            c3513b.m14990k();
            abstractC3366dg.mo14144a(C3513b.f15532f);
            if (c3513b.f15539a != null) {
                abstractC3366dg.mo14139a(C3513b.f15533g);
                abstractC3366dg.mo14145a(c3513b.f15539a);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14139a(C3513b.f15534h);
            abstractC3366dg.mo14138a(c3513b.f15540b);
            abstractC3366dg.mo14151c();
            abstractC3366dg.mo14139a(C3513b.f15535i);
            abstractC3366dg.mo14137a(c3513b.f15541c);
            abstractC3366dg.mo14151c();
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
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
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3513b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3513b c3513b) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14145a(c3513b.f15539a);
            c3372dm.mo14138a(c3513b.f15540b);
            c3372dm.mo14137a(c3513b.f15541c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3513b c3513b) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3513b.f15539a = c3372dm.mo14176z();
            c3513b.m14977a(true);
            c3513b.f15540b = c3372dm.mo14174x();
            c3513b.m14980b(true);
            c3513b.f15541c = c3372dm.mo14173w();
            c3513b.m14982c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
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
        f15536j = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new C3352ct("identity", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3352ct("ts", (byte) 1, new C3353cu((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new C3352ct("version", (byte) 1, new C3353cu((byte) 8)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f15530d = unmodifiableMap;
        C3352ct.m14126a(C3513b.class, unmodifiableMap);
    }

    public C3513b() {
        this.f15542m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3513b deepCopy() {
        return new C3513b(this);
    }

    /* renamed from: b */
    public String m14979b() {
        return this.f15539a;
    }

    /* renamed from: c */
    public void m14981c() {
        this.f15539a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f15539a = null;
        m14980b(false);
        this.f15540b = 0L;
        m14982c(false);
        this.f15541c = 0;
    }

    /* renamed from: d */
    public boolean m14983d() {
        if (this.f15539a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public long m14984e() {
        return this.f15540b;
    }

    /* renamed from: f */
    public void m14985f() {
        this.f15542m = C3337ce.m14044b(this.f15542m, 0);
    }

    /* renamed from: g */
    public boolean m14986g() {
        return C3337ce.m14040a(this.f15542m, 0);
    }

    /* renamed from: h */
    public int m14987h() {
        return this.f15541c;
    }

    /* renamed from: i */
    public void m14988i() {
        this.f15542m = C3337ce.m14044b(this.f15542m, 1);
    }

    /* renamed from: j */
    public boolean m14989j() {
        return C3337ce.m14040a(this.f15542m, 1);
    }

    /* renamed from: k */
    public void m14990k() {
        if (this.f15539a != null) {
            return;
        }
        throw new C3367dh("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f15536j.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdSnapshot(");
        sb2.append("identity:");
        String str = this.f15539a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("ts:");
        sb2.append(this.f15540b);
        sb2.append(", ");
        sb2.append("version:");
        sb2.append(this.f15541c);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f15536j.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* renamed from: d */
        private static final Map<String, e> f15546d = new HashMap();

        /* renamed from: e */
        private final short f15548e;

        /* renamed from: f */
        private final String f15549f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f15546d.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f15548e = s10;
            this.f15549f = str;
        }

        /* renamed from: a */
        public static e m14997a(int i10) {
            if (i10 == 1) {
                return IDENTITY;
            }
            if (i10 == 2) {
                return TS;
            }
            if (i10 != 3) {
                return null;
            }
            return VERSION;
        }

        /* renamed from: b */
        public static e m14999b(int i10) {
            e m14997a = m14997a(i10);
            if (m14997a != null) {
                return m14997a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15549f;
        }

        /* renamed from: a */
        public static e m14998a(String str) {
            return f15546d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15548e;
        }
    }

    /* renamed from: a */
    public C3513b m14976a(String str) {
        this.f15539a = str;
        return this;
    }

    /* renamed from: b */
    public void m14980b(boolean z10) {
        this.f15542m = C3337ce.m14032a(this.f15542m, 0, z10);
    }

    /* renamed from: c */
    public void m14982c(boolean z10) {
        this.f15542m = C3337ce.m14032a(this.f15542m, 1, z10);
    }

    public C3513b(String str, long j10, int i10) {
        this();
        this.f15539a = str;
        this.f15540b = j10;
        m14980b(true);
        this.f15541c = i10;
        m14982c(true);
    }

    /* renamed from: a */
    public void m14977a(boolean z10) {
        if (z10) {
            return;
        }
        this.f15539a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m14997a(i10);
    }

    /* renamed from: a */
    public C3513b m14975a(long j10) {
        this.f15540b = j10;
        m14980b(true);
        return this;
    }

    /* renamed from: a */
    public C3513b m14974a(int i10) {
        this.f15541c = i10;
        m14982c(true);
        return this;
    }

    /* renamed from: a */
    private void m14968a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public C3513b(C3513b c3513b) {
        this.f15542m = (byte) 0;
        this.f15542m = c3513b.f15542m;
        if (c3513b.m14983d()) {
            this.f15539a = c3513b.f15539a;
        }
        this.f15540b = c3513b.f15540b;
        this.f15541c = c3513b.f15541c;
    }

    /* renamed from: a */
    private void m14967a(ObjectInputStream objectInputStream) {
        try {
            this.f15542m = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
