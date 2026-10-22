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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.a */
/* loaded from: classes3.dex */
public class C3512a implements InterfaceC3340ch<C3512a, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final Map<e, C3352ct> f15507e;

    /* renamed from: f */
    private static final long f15508f = 9132678615281394583L;

    /* renamed from: g */
    private static final C3371dl f15509g = new C3371dl("IdJournal");

    /* renamed from: h */
    private static final C3361db f15510h = new C3361db("domain", (byte) 11, 1);

    /* renamed from: i */
    private static final C3361db f15511i = new C3361db("old_id", (byte) 11, 2);

    /* renamed from: j */
    private static final C3361db f15512j = new C3361db("new_id", (byte) 11, 3);

    /* renamed from: k */
    private static final C3361db f15513k = new C3361db("ts", (byte) 10, 4);

    /* renamed from: l */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f15514l;

    /* renamed from: m */
    private static final int f15515m = 0;

    /* renamed from: a */
    public String f15516a;

    /* renamed from: b */
    public String f15517b;

    /* renamed from: c */
    public String f15518c;

    /* renamed from: d */
    public long f15519d;

    /* renamed from: n */
    private byte f15520n;

    /* renamed from: o */
    private e[] f15521o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3512a> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3512a c3512a) {
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
                            if (s10 != 4) {
                                C3369dj.m14213a(abstractC3366dg, b10);
                            } else if (b10 == 10) {
                                c3512a.f15519d = abstractC3366dg.mo14174x();
                                c3512a.m14946d(true);
                            } else {
                                C3369dj.m14213a(abstractC3366dg, b10);
                            }
                        } else if (b10 == 11) {
                            c3512a.f15518c = abstractC3366dg.mo14176z();
                            c3512a.m14945c(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 11) {
                        c3512a.f15517b = abstractC3366dg.mo14176z();
                        c3512a.m14942b(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 11) {
                    c3512a.f15516a = abstractC3366dg.mo14176z();
                    c3512a.m14939a(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
            abstractC3366dg.mo14161k();
            if (c3512a.m14956m()) {
                c3512a.m14957n();
                return;
            }
            throw new C3367dh("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3512a c3512a) {
            c3512a.m14957n();
            abstractC3366dg.mo14144a(C3512a.f15509g);
            if (c3512a.f15516a != null) {
                abstractC3366dg.mo14139a(C3512a.f15510h);
                abstractC3366dg.mo14145a(c3512a.f15516a);
                abstractC3366dg.mo14151c();
            }
            if (c3512a.f15517b != null && c3512a.m14950g()) {
                abstractC3366dg.mo14139a(C3512a.f15511i);
                abstractC3366dg.mo14145a(c3512a.f15517b);
                abstractC3366dg.mo14151c();
            }
            if (c3512a.f15518c != null) {
                abstractC3366dg.mo14139a(C3512a.f15512j);
                abstractC3366dg.mo14145a(c3512a.f15518c);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14139a(C3512a.f15513k);
            abstractC3366dg.mo14138a(c3512a.f15519d);
            abstractC3366dg.mo14151c();
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
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
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3512a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3512a c3512a) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14145a(c3512a.f15516a);
            c3372dm.mo14145a(c3512a.f15518c);
            c3372dm.mo14138a(c3512a.f15519d);
            BitSet bitSet = new BitSet();
            if (c3512a.m14950g()) {
                bitSet.set(0);
            }
            c3372dm.m14217a(bitSet, 1);
            if (c3512a.m14950g()) {
                c3372dm.mo14145a(c3512a.f15517b);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3512a c3512a) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3512a.f15516a = c3372dm.mo14176z();
            c3512a.m14939a(true);
            c3512a.f15518c = c3372dm.mo14176z();
            c3512a.m14945c(true);
            c3512a.f15519d = c3372dm.mo14174x();
            c3512a.m14946d(true);
            if (c3372dm.m14218b(1).get(0)) {
                c3512a.f15517b = c3372dm.mo14176z();
                c3512a.m14942b(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
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
        f15514l = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new C3352ct("domain", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new C3352ct("old_id", (byte) 2, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new C3352ct("new_id", (byte) 1, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3352ct("ts", (byte) 1, new C3353cu((byte) 10)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f15507e = unmodifiableMap;
        C3352ct.m14126a(C3512a.class, unmodifiableMap);
    }

    public C3512a() {
        this.f15520n = (byte) 0;
        this.f15521o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3512a deepCopy() {
        return new C3512a(this);
    }

    /* renamed from: b */
    public String m14941b() {
        return this.f15516a;
    }

    /* renamed from: c */
    public void m14944c() {
        this.f15516a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f15516a = null;
        this.f15517b = null;
        this.f15518c = null;
        m14946d(false);
        this.f15519d = 0L;
    }

    /* renamed from: d */
    public boolean m14947d() {
        return this.f15516a != null;
    }

    /* renamed from: e */
    public String m14948e() {
        return this.f15517b;
    }

    /* renamed from: f */
    public void m14949f() {
        this.f15517b = null;
    }

    /* renamed from: g */
    public boolean m14950g() {
        if (this.f15517b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public String m14951h() {
        return this.f15518c;
    }

    /* renamed from: i */
    public void m14952i() {
        this.f15518c = null;
    }

    /* renamed from: j */
    public boolean m14953j() {
        if (this.f15518c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public long m14954k() {
        return this.f15519d;
    }

    /* renamed from: l */
    public void m14955l() {
        this.f15520n = C3337ce.m14044b(this.f15520n, 0);
    }

    /* renamed from: m */
    public boolean m14956m() {
        return C3337ce.m14040a(this.f15520n, 0);
    }

    /* renamed from: n */
    public void m14957n() {
        if (this.f15516a != null) {
            if (this.f15518c != null) {
                return;
            }
            throw new C3367dh("Required field 'new_id' was not present! Struct: " + toString());
        }
        throw new C3367dh("Required field 'domain' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f15514l.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdJournal(");
        sb2.append("domain:");
        String str = this.f15516a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (m14950g()) {
            sb2.append(", ");
            sb2.append("old_id:");
            String str2 = this.f15517b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(", ");
        sb2.append("new_id:");
        String str3 = this.f15518c;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(", ");
        sb2.append("ts:");
        sb2.append(this.f15519d);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f15514l.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* renamed from: e */
        private static final Map<String, e> f15526e = new HashMap();

        /* renamed from: f */
        private final short f15528f;

        /* renamed from: g */
        private final String f15529g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f15526e.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f15528f = s10;
            this.f15529g = str;
        }

        /* renamed from: a */
        public static e m14964a(int i10) {
            if (i10 == 1) {
                return DOMAIN;
            }
            if (i10 == 2) {
                return OLD_ID;
            }
            if (i10 == 3) {
                return NEW_ID;
            }
            if (i10 != 4) {
                return null;
            }
            return TS;
        }

        /* renamed from: b */
        public static e m14966b(int i10) {
            e m14964a = m14964a(i10);
            if (m14964a != null) {
                return m14964a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15529g;
        }

        /* renamed from: a */
        public static e m14965a(String str) {
            return f15526e.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15528f;
        }
    }

    /* renamed from: a */
    public C3512a m14938a(String str) {
        this.f15516a = str;
        return this;
    }

    /* renamed from: b */
    public C3512a m14940b(String str) {
        this.f15517b = str;
        return this;
    }

    /* renamed from: c */
    public C3512a m14943c(String str) {
        this.f15518c = str;
        return this;
    }

    /* renamed from: d */
    public void m14946d(boolean z10) {
        this.f15520n = C3337ce.m14032a(this.f15520n, 0, z10);
    }

    /* renamed from: a */
    public void m14939a(boolean z10) {
        if (z10) {
            return;
        }
        this.f15516a = null;
    }

    /* renamed from: b */
    public void m14942b(boolean z10) {
        if (z10) {
            return;
        }
        this.f15517b = null;
    }

    /* renamed from: c */
    public void m14945c(boolean z10) {
        if (z10) {
            return;
        }
        this.f15518c = null;
    }

    public C3512a(String str, String str2, long j10) {
        this();
        this.f15516a = str;
        this.f15518c = str2;
        this.f15519d = j10;
        m14946d(true);
    }

    /* renamed from: a */
    public C3512a m14937a(long j10) {
        this.f15519d = j10;
        m14946d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m14964a(i10);
    }

    /* renamed from: a */
    private void m14929a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public C3512a(C3512a c3512a) {
        this.f15520n = (byte) 0;
        this.f15521o = new e[]{e.OLD_ID};
        this.f15520n = c3512a.f15520n;
        if (c3512a.m14947d()) {
            this.f15516a = c3512a.f15516a;
        }
        if (c3512a.m14950g()) {
            this.f15517b = c3512a.f15517b;
        }
        if (c3512a.m14953j()) {
            this.f15518c = c3512a.f15518c;
        }
        this.f15519d = c3512a.f15519d;
    }

    /* renamed from: a */
    private void m14928a(ObjectInputStream objectInputStream) {
        try {
            this.f15520n = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
