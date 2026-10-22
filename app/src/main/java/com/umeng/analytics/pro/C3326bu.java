package com.umeng.analytics.pro;

import com.umeng.ccg.C3417a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bu */
/* loaded from: classes3.dex */
public class C3326bu implements InterfaceC3340ch<C3326bu, e>, Serializable, Cloneable {

    /* renamed from: A */
    private static final int f14285A = 2;

    /* renamed from: B */
    private static final int f14286B = 3;

    /* renamed from: k */
    public static final Map<e, C3352ct> f14287k;

    /* renamed from: l */
    private static final long f14288l = 420342210744516016L;

    /* renamed from: m */
    private static final C3371dl f14289m = new C3371dl("UMEnvelope");

    /* renamed from: n */
    private static final C3361db f14290n = new C3361db("version", (byte) 11, 1);

    /* renamed from: o */
    private static final C3361db f14291o = new C3361db("address", (byte) 11, 2);

    /* renamed from: p */
    private static final C3361db f14292p = new C3361db(C3417a.f15002x, (byte) 11, 3);

    /* renamed from: q */
    private static final C3361db f14293q = new C3361db("serial_num", (byte) 8, 4);

    /* renamed from: r */
    private static final C3361db f14294r = new C3361db("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    private static final C3361db f14295s = new C3361db("length", (byte) 8, 6);

    /* renamed from: t */
    private static final C3361db f14296t = new C3361db("entity", (byte) 11, 7);

    /* renamed from: u */
    private static final C3361db f14297u = new C3361db("guid", (byte) 11, 8);

    /* renamed from: v */
    private static final C3361db f14298v = new C3361db("checksum", (byte) 11, 9);

    /* renamed from: w */
    private static final C3361db f14299w = new C3361db("codex", (byte) 8, 10);

    /* renamed from: x */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f14300x;

    /* renamed from: y */
    private static final int f14301y = 0;

    /* renamed from: z */
    private static final int f14302z = 1;

    /* renamed from: C */
    private byte f14303C;

    /* renamed from: D */
    private e[] f14304D;

    /* renamed from: a */
    public String f14305a;

    /* renamed from: b */
    public String f14306b;

    /* renamed from: c */
    public String f14307c;

    /* renamed from: d */
    public int f14308d;

    /* renamed from: e */
    public int f14309e;

    /* renamed from: f */
    public int f14310f;

    /* renamed from: g */
    public ByteBuffer f14311g;

    /* renamed from: h */
    public String f14312h;

    /* renamed from: i */
    public String f14313i;

    /* renamed from: j */
    public int f14314j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.bu$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3326bu> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3326bu c3326bu) {
            abstractC3366dg.mo14160j();
            while (true) {
                C3361db mo14162l = abstractC3366dg.mo14162l();
                byte b10 = mo14162l.f14486b;
                if (b10 == 0) {
                    abstractC3366dg.mo14161k();
                    if (c3326bu.m13956m()) {
                        if (c3326bu.m13959p()) {
                            if (c3326bu.m13962s()) {
                                c3326bu.m13921G();
                                return;
                            }
                            throw new C3367dh("Required field 'length' was not found in serialized data! Struct: " + toString());
                        }
                        throw new C3367dh("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    throw new C3367dh("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                }
                switch (mo14162l.f14487c) {
                    case 1:
                        if (b10 == 11) {
                            c3326bu.f14305a = abstractC3366dg.mo14176z();
                            c3326bu.m13927a(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 2:
                        if (b10 == 11) {
                            c3326bu.f14306b = abstractC3366dg.mo14176z();
                            c3326bu.m13931b(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 3:
                        if (b10 == 11) {
                            c3326bu.f14307c = abstractC3366dg.mo14176z();
                            c3326bu.m13935c(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 4:
                        if (b10 == 8) {
                            c3326bu.f14308d = abstractC3366dg.mo14173w();
                            c3326bu.m13938d(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 5:
                        if (b10 == 8) {
                            c3326bu.f14309e = abstractC3366dg.mo14173w();
                            c3326bu.m13943e(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 6:
                        if (b10 == 8) {
                            c3326bu.f14310f = abstractC3366dg.mo14173w();
                            c3326bu.m13945f(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 7:
                        if (b10 == 11) {
                            c3326bu.f14311g = abstractC3366dg.mo14133A();
                            c3326bu.m13946g(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 8:
                        if (b10 == 11) {
                            c3326bu.f14312h = abstractC3366dg.mo14176z();
                            c3326bu.m13949h(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 9:
                        if (b10 == 11) {
                            c3326bu.f14313i = abstractC3366dg.mo14176z();
                            c3326bu.m13951i(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    case 10:
                        if (b10 == 8) {
                            c3326bu.f14314j = abstractC3366dg.mo14173w();
                            c3326bu.m13952j(true);
                            break;
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                            break;
                        }
                    default:
                        C3369dj.m14213a(abstractC3366dg, b10);
                        break;
                }
                abstractC3366dg.mo14163m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3326bu c3326bu) {
            c3326bu.m13921G();
            abstractC3366dg.mo14144a(C3326bu.f14289m);
            if (c3326bu.f14305a != null) {
                abstractC3366dg.mo14139a(C3326bu.f14290n);
                abstractC3366dg.mo14145a(c3326bu.f14305a);
                abstractC3366dg.mo14151c();
            }
            if (c3326bu.f14306b != null) {
                abstractC3366dg.mo14139a(C3326bu.f14291o);
                abstractC3366dg.mo14145a(c3326bu.f14306b);
                abstractC3366dg.mo14151c();
            }
            if (c3326bu.f14307c != null) {
                abstractC3366dg.mo14139a(C3326bu.f14292p);
                abstractC3366dg.mo14145a(c3326bu.f14307c);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14139a(C3326bu.f14293q);
            abstractC3366dg.mo14137a(c3326bu.f14308d);
            abstractC3366dg.mo14151c();
            abstractC3366dg.mo14139a(C3326bu.f14294r);
            abstractC3366dg.mo14137a(c3326bu.f14309e);
            abstractC3366dg.mo14151c();
            abstractC3366dg.mo14139a(C3326bu.f14295s);
            abstractC3366dg.mo14137a(c3326bu.f14310f);
            abstractC3366dg.mo14151c();
            if (c3326bu.f14311g != null) {
                abstractC3366dg.mo14139a(C3326bu.f14296t);
                abstractC3366dg.mo14146a(c3326bu.f14311g);
                abstractC3366dg.mo14151c();
            }
            if (c3326bu.f14312h != null) {
                abstractC3366dg.mo14139a(C3326bu.f14297u);
                abstractC3366dg.mo14145a(c3326bu.f14312h);
                abstractC3366dg.mo14151c();
            }
            if (c3326bu.f14313i != null) {
                abstractC3366dg.mo14139a(C3326bu.f14298v);
                abstractC3366dg.mo14145a(c3326bu.f14313i);
                abstractC3366dg.mo14151c();
            }
            if (c3326bu.m13920F()) {
                abstractC3366dg.mo14139a(C3326bu.f14299w);
                abstractC3366dg.mo14137a(c3326bu.f14314j);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.bu$b */
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
    /* renamed from: com.umeng.analytics.pro.bu$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3326bu> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3326bu c3326bu) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14145a(c3326bu.f14305a);
            c3372dm.mo14145a(c3326bu.f14306b);
            c3372dm.mo14145a(c3326bu.f14307c);
            c3372dm.mo14137a(c3326bu.f14308d);
            c3372dm.mo14137a(c3326bu.f14309e);
            c3372dm.mo14137a(c3326bu.f14310f);
            c3372dm.mo14146a(c3326bu.f14311g);
            c3372dm.mo14145a(c3326bu.f14312h);
            c3372dm.mo14145a(c3326bu.f14313i);
            BitSet bitSet = new BitSet();
            if (c3326bu.m13920F()) {
                bitSet.set(0);
            }
            c3372dm.m14217a(bitSet, 1);
            if (c3326bu.m13920F()) {
                c3372dm.mo14137a(c3326bu.f14314j);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3326bu c3326bu) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3326bu.f14305a = c3372dm.mo14176z();
            c3326bu.m13927a(true);
            c3326bu.f14306b = c3372dm.mo14176z();
            c3326bu.m13931b(true);
            c3326bu.f14307c = c3372dm.mo14176z();
            c3326bu.m13935c(true);
            c3326bu.f14308d = c3372dm.mo14173w();
            c3326bu.m13938d(true);
            c3326bu.f14309e = c3372dm.mo14173w();
            c3326bu.m13943e(true);
            c3326bu.f14310f = c3372dm.mo14173w();
            c3326bu.m13945f(true);
            c3326bu.f14311g = c3372dm.mo14133A();
            c3326bu.m13946g(true);
            c3326bu.f14312h = c3372dm.mo14176z();
            c3326bu.m13949h(true);
            c3326bu.f14313i = c3372dm.mo14176z();
            c3326bu.m13951i(true);
            if (c3372dm.m14218b(1).get(0)) {
                c3326bu.f14314j = c3372dm.mo14173w();
                c3326bu.m13952j(true);
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.bu$d */
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
        f14300x = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new C3352ct("version", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new C3352ct("address", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new C3352ct(C3417a.f15002x, (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new C3352ct("serial_num", (byte) 1, new C3353cu((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new C3352ct("ts_secs", (byte) 1, new C3353cu((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new C3352ct("length", (byte) 1, new C3353cu((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new C3352ct("entity", (byte) 1, new C3353cu((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new C3352ct("guid", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3352ct("checksum", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new C3352ct("codex", (byte) 2, new C3353cu((byte) 8)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f14287k = unmodifiableMap;
        C3352ct.m14126a(C3326bu.class, unmodifiableMap);
    }

    public C3326bu() {
        this.f14303C = (byte) 0;
        this.f14304D = new e[]{e.CODEX};
    }

    /* renamed from: A */
    public String m13915A() {
        return this.f14313i;
    }

    /* renamed from: B */
    public void m13916B() {
        this.f14313i = null;
    }

    /* renamed from: C */
    public boolean m13917C() {
        if (this.f14313i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public int m13918D() {
        return this.f14314j;
    }

    /* renamed from: E */
    public void m13919E() {
        this.f14303C = C3337ce.m14044b(this.f14303C, 3);
    }

    /* renamed from: F */
    public boolean m13920F() {
        return C3337ce.m14040a(this.f14303C, 3);
    }

    /* renamed from: G */
    public void m13921G() {
        if (this.f14305a != null) {
            if (this.f14306b != null) {
                if (this.f14307c != null) {
                    if (this.f14311g != null) {
                        if (this.f14312h != null) {
                            if (this.f14313i != null) {
                                return;
                            }
                            throw new C3367dh("Required field 'checksum' was not present! Struct: " + toString());
                        }
                        throw new C3367dh("Required field 'guid' was not present! Struct: " + toString());
                    }
                    throw new C3367dh("Required field 'entity' was not present! Struct: " + toString());
                }
                throw new C3367dh("Required field 'signature' was not present! Struct: " + toString());
            }
            throw new C3367dh("Required field 'address' was not present! Struct: " + toString());
        }
        throw new C3367dh("Required field 'version' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3326bu deepCopy() {
        return new C3326bu(this);
    }

    /* renamed from: b */
    public String m13930b() {
        return this.f14305a;
    }

    /* renamed from: c */
    public void m13934c() {
        this.f14305a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f14305a = null;
        this.f14306b = null;
        this.f14307c = null;
        m13938d(false);
        this.f14308d = 0;
        m13943e(false);
        this.f14309e = 0;
        m13945f(false);
        this.f14310f = 0;
        this.f14311g = null;
        this.f14312h = null;
        this.f14313i = null;
        m13952j(false);
        this.f14314j = 0;
    }

    /* renamed from: d */
    public boolean m13939d() {
        return this.f14305a != null;
    }

    /* renamed from: e */
    public String m13942e() {
        return this.f14306b;
    }

    /* renamed from: f */
    public void m13944f() {
        this.f14306b = null;
    }

    /* renamed from: g */
    public boolean m13947g() {
        return this.f14306b != null;
    }

    /* renamed from: h */
    public String m13948h() {
        return this.f14307c;
    }

    /* renamed from: i */
    public void m13950i() {
        this.f14307c = null;
    }

    /* renamed from: j */
    public boolean m13953j() {
        return this.f14307c != null;
    }

    /* renamed from: k */
    public int m13954k() {
        return this.f14308d;
    }

    /* renamed from: l */
    public void m13955l() {
        this.f14303C = C3337ce.m14044b(this.f14303C, 0);
    }

    /* renamed from: m */
    public boolean m13956m() {
        return C3337ce.m14040a(this.f14303C, 0);
    }

    /* renamed from: n */
    public int m13957n() {
        return this.f14309e;
    }

    /* renamed from: o */
    public void m13958o() {
        this.f14303C = C3337ce.m14044b(this.f14303C, 1);
    }

    /* renamed from: p */
    public boolean m13959p() {
        return C3337ce.m14040a(this.f14303C, 1);
    }

    /* renamed from: q */
    public int m13960q() {
        return this.f14310f;
    }

    /* renamed from: r */
    public void m13961r() {
        this.f14303C = C3337ce.m14044b(this.f14303C, 2);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f14300x.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    /* renamed from: s */
    public boolean m13962s() {
        return C3337ce.m14040a(this.f14303C, 2);
    }

    /* renamed from: t */
    public byte[] m13963t() {
        m13925a(C3341ci.m14075c(this.f14311g));
        ByteBuffer byteBuffer = this.f14311g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UMEnvelope(");
        sb2.append("version:");
        String str = this.f14305a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(", ");
        sb2.append("address:");
        String str2 = this.f14306b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
        sb2.append("signature:");
        String str3 = this.f14307c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("serial_num:");
        sb2.append(this.f14308d);
        sb2.append(", ");
        sb2.append("ts_secs:");
        sb2.append(this.f14309e);
        sb2.append(", ");
        sb2.append("length:");
        sb2.append(this.f14310f);
        sb2.append(", ");
        sb2.append("entity:");
        ByteBuffer byteBuffer = this.f14311g;
        if (byteBuffer == null) {
            sb2.append("null");
        } else {
            C3341ci.m14071a(byteBuffer, sb2);
        }
        sb2.append(", ");
        sb2.append("guid:");
        String str4 = this.f14312h;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(", ");
        sb2.append("checksum:");
        String str5 = this.f14313i;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        if (m13920F()) {
            sb2.append(", ");
            sb2.append("codex:");
            sb2.append(this.f14314j);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public ByteBuffer m13964u() {
        return this.f14311g;
    }

    /* renamed from: v */
    public void m13965v() {
        this.f14311g = null;
    }

    /* renamed from: w */
    public boolean m13966w() {
        if (this.f14311g != null) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f14300x.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: x */
    public String m13967x() {
        return this.f14312h;
    }

    /* renamed from: y */
    public void m13968y() {
        this.f14312h = null;
    }

    /* renamed from: z */
    public boolean m13969z() {
        if (this.f14312h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.umeng.analytics.pro.bu$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, C3417a.f15002x),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* renamed from: k */
        private static final Map<String, e> f14325k = new HashMap();

        /* renamed from: l */
        private final short f14327l;

        /* renamed from: m */
        private final String f14328m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f14325k.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f14327l = s10;
            this.f14328m = str;
        }

        /* renamed from: a */
        public static e m13979a(int i10) {
            switch (i10) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static e m13981b(int i10) {
            e m13979a = m13979a(i10);
            if (m13979a != null) {
                return m13979a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f14328m;
        }

        /* renamed from: a */
        public static e m13980a(String str) {
            return f14325k.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f14327l;
        }
    }

    /* renamed from: a */
    public C3326bu m13924a(String str) {
        this.f14305a = str;
        return this;
    }

    /* renamed from: b */
    public C3326bu m13929b(String str) {
        this.f14306b = str;
        return this;
    }

    /* renamed from: c */
    public C3326bu m13933c(String str) {
        this.f14307c = str;
        return this;
    }

    /* renamed from: d */
    public void m13938d(boolean z10) {
        this.f14303C = C3337ce.m14032a(this.f14303C, 0, z10);
    }

    /* renamed from: e */
    public void m13943e(boolean z10) {
        this.f14303C = C3337ce.m14032a(this.f14303C, 1, z10);
    }

    /* renamed from: f */
    public void m13945f(boolean z10) {
        this.f14303C = C3337ce.m14032a(this.f14303C, 2, z10);
    }

    /* renamed from: g */
    public void m13946g(boolean z10) {
        if (z10) {
            return;
        }
        this.f14311g = null;
    }

    /* renamed from: h */
    public void m13949h(boolean z10) {
        if (z10) {
            return;
        }
        this.f14312h = null;
    }

    /* renamed from: i */
    public void m13951i(boolean z10) {
        if (z10) {
            return;
        }
        this.f14313i = null;
    }

    /* renamed from: j */
    public void m13952j(boolean z10) {
        this.f14303C = C3337ce.m14032a(this.f14303C, 3, z10);
    }

    /* renamed from: a */
    public void m13927a(boolean z10) {
        if (z10) {
            return;
        }
        this.f14305a = null;
    }

    /* renamed from: b */
    public void m13931b(boolean z10) {
        if (z10) {
            return;
        }
        this.f14306b = null;
    }

    /* renamed from: c */
    public void m13935c(boolean z10) {
        if (z10) {
            return;
        }
        this.f14307c = null;
    }

    /* renamed from: d */
    public C3326bu m13937d(String str) {
        this.f14312h = str;
        return this;
    }

    /* renamed from: e */
    public C3326bu m13941e(String str) {
        this.f14313i = str;
        return this;
    }

    public C3326bu(String str, String str2, String str3, int i10, int i11, int i12, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f14305a = str;
        this.f14306b = str2;
        this.f14307c = str3;
        this.f14308d = i10;
        m13938d(true);
        this.f14309e = i11;
        m13943e(true);
        this.f14310f = i12;
        m13945f(true);
        this.f14311g = byteBuffer;
        this.f14312h = str4;
        this.f14313i = str5;
    }

    /* renamed from: a */
    public C3326bu m13923a(int i10) {
        this.f14308d = i10;
        m13938d(true);
        return this;
    }

    /* renamed from: b */
    public C3326bu m13928b(int i10) {
        this.f14309e = i10;
        m13943e(true);
        return this;
    }

    /* renamed from: c */
    public C3326bu m13932c(int i10) {
        this.f14310f = i10;
        m13945f(true);
        return this;
    }

    /* renamed from: d */
    public C3326bu m13936d(int i10) {
        this.f14314j = i10;
        m13952j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m13979a(i10);
    }

    /* renamed from: a */
    public C3326bu m13926a(byte[] bArr) {
        m13925a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public C3326bu m13925a(ByteBuffer byteBuffer) {
        this.f14311g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m13914a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: a */
    private void m13913a(ObjectInputStream objectInputStream) {
        try {
            this.f14303C = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public C3326bu(C3326bu c3326bu) {
        this.f14303C = (byte) 0;
        this.f14304D = new e[]{e.CODEX};
        this.f14303C = c3326bu.f14303C;
        if (c3326bu.m13939d()) {
            this.f14305a = c3326bu.f14305a;
        }
        if (c3326bu.m13947g()) {
            this.f14306b = c3326bu.f14306b;
        }
        if (c3326bu.m13953j()) {
            this.f14307c = c3326bu.f14307c;
        }
        this.f14308d = c3326bu.f14308d;
        this.f14309e = c3326bu.f14309e;
        this.f14310f = c3326bu.f14310f;
        if (c3326bu.m13966w()) {
            this.f14311g = C3341ci.m14076d(c3326bu.f14311g);
        }
        if (c3326bu.m13969z()) {
            this.f14312h = c3326bu.f14312h;
        }
        if (c3326bu.m13917C()) {
            this.f14313i = c3326bu.f14313i;
        }
        this.f14314j = c3326bu.f14314j;
    }
}
