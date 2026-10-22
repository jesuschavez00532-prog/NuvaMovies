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

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
/* loaded from: classes3.dex */
public class C3516e implements InterfaceC3340ch<C3516e, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3352ct> f15587d;

    /* renamed from: e */
    private static final long f15588e = 7501688097813630241L;

    /* renamed from: f */
    private static final C3371dl f15589f = new C3371dl("ImprintValue");

    /* renamed from: g */
    private static final C3361db f15590g = new C3361db("value", (byte) 11, 1);

    /* renamed from: h */
    private static final C3361db f15591h = new C3361db("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C3361db f15592i = new C3361db("guid", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f15593j;

    /* renamed from: k */
    private static final int f15594k = 0;

    /* renamed from: a */
    public String f15595a;

    /* renamed from: b */
    public long f15596b;

    /* renamed from: c */
    public String f15597c;

    /* renamed from: l */
    private byte f15598l;

    /* renamed from: m */
    private e[] f15599m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3516e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3516e c3516e) {
            abstractC3366dg.mo14160j();
            while (true) {
                C3361db mo14162l = abstractC3366dg.mo14162l();
                byte b10 = mo14162l.f14486b;
                if (b10 == 0) {
                    abstractC3366dg.mo14161k();
                    c3516e.m15096k();
                    return;
                }
                short s10 = mo14162l.f14487c;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        } else if (b10 == 11) {
                            c3516e.f15597c = abstractC3366dg.mo14176z();
                            c3516e.m15088c(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 10) {
                        c3516e.f15596b = abstractC3366dg.mo14174x();
                        c3516e.m15086b(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 11) {
                    c3516e.f15595a = abstractC3366dg.mo14176z();
                    c3516e.m15083a(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3516e c3516e) {
            c3516e.m15096k();
            abstractC3366dg.mo14144a(C3516e.f15589f);
            if (c3516e.f15595a != null && c3516e.m15089d()) {
                abstractC3366dg.mo14139a(C3516e.f15590g);
                abstractC3366dg.mo14145a(c3516e.f15595a);
                abstractC3366dg.mo14151c();
            }
            if (c3516e.m15092g()) {
                abstractC3366dg.mo14139a(C3516e.f15591h);
                abstractC3366dg.mo14138a(c3516e.f15596b);
                abstractC3366dg.mo14151c();
            }
            if (c3516e.f15597c != null && c3516e.m15095j()) {
                abstractC3366dg.mo14139a(C3516e.f15592i);
                abstractC3366dg.mo14145a(c3516e.f15597c);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
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
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3516e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3516e c3516e) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            BitSet bitSet = new BitSet();
            if (c3516e.m15089d()) {
                bitSet.set(0);
            }
            if (c3516e.m15092g()) {
                bitSet.set(1);
            }
            if (c3516e.m15095j()) {
                bitSet.set(2);
            }
            c3372dm.m14217a(bitSet, 3);
            if (c3516e.m15089d()) {
                c3372dm.mo14145a(c3516e.f15595a);
            }
            if (c3516e.m15092g()) {
                c3372dm.mo14138a(c3516e.f15596b);
            }
            if (c3516e.m15095j()) {
                c3372dm.mo14145a(c3516e.f15597c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3516e c3516e) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            BitSet m14218b = c3372dm.m14218b(3);
            if (m14218b.get(0)) {
                c3516e.f15595a = c3372dm.mo14176z();
                c3516e.m15083a(true);
            }
            if (m14218b.get(1)) {
                c3516e.f15596b = c3372dm.mo14174x();
                c3516e.m15086b(true);
            }
            if (m14218b.get(2)) {
                c3516e.f15597c = c3372dm.mo14176z();
                c3516e.m15088c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
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
        f15593j = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VALUE, (e) new C3352ct("value", (byte) 2, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3352ct("ts", (byte) 2, new C3353cu((byte) 10)));
        enumMap.put((EnumMap) e.GUID, (e) new C3352ct("guid", (byte) 2, new C3353cu((byte) 11)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f15587d = unmodifiableMap;
        C3352ct.m14126a(C3516e.class, unmodifiableMap);
    }

    public C3516e() {
        this.f15598l = (byte) 0;
        this.f15599m = new e[]{e.VALUE, e.TS, e.GUID};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3516e deepCopy() {
        return new C3516e(this);
    }

    /* renamed from: b */
    public String m15085b() {
        return this.f15595a;
    }

    /* renamed from: c */
    public void m15087c() {
        this.f15595a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f15595a = null;
        m15086b(false);
        this.f15596b = 0L;
        this.f15597c = null;
    }

    /* renamed from: d */
    public boolean m15089d() {
        if (this.f15595a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public long m15090e() {
        return this.f15596b;
    }

    /* renamed from: f */
    public void m15091f() {
        this.f15598l = C3337ce.m14044b(this.f15598l, 0);
    }

    /* renamed from: g */
    public boolean m15092g() {
        return C3337ce.m14040a(this.f15598l, 0);
    }

    /* renamed from: h */
    public String m15093h() {
        return this.f15597c;
    }

    /* renamed from: i */
    public void m15094i() {
        this.f15597c = null;
    }

    /* renamed from: j */
    public boolean m15095j() {
        if (this.f15597c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m15096k() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f15593j.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ImprintValue(");
        if (m15089d()) {
            sb2.append("value:");
            String str = this.f15595a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            sb2.append(", ");
        }
        sb2.append("ts:");
        sb2.append(this.f15596b);
        sb2.append(", ");
        sb2.append("guid:");
        String str2 = this.f15597c;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f15593j.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");


        /* renamed from: d */
        private static final Map<String, e> f15603d = new HashMap();

        /* renamed from: e */
        private final short f15605e;

        /* renamed from: f */
        private final String f15606f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f15603d.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f15605e = s10;
            this.f15606f = str;
        }

        /* renamed from: a */
        public static e m15103a(int i10) {
            if (i10 == 1) {
                return VALUE;
            }
            if (i10 == 2) {
                return TS;
            }
            if (i10 != 3) {
                return null;
            }
            return GUID;
        }

        /* renamed from: b */
        public static e m15105b(int i10) {
            e m15103a = m15103a(i10);
            if (m15103a != null) {
                return m15103a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15606f;
        }

        /* renamed from: a */
        public static e m15104a(String str) {
            return f15603d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15605e;
        }
    }

    /* renamed from: a */
    public C3516e m15082a(String str) {
        this.f15595a = str;
        return this;
    }

    /* renamed from: b */
    public void m15086b(boolean z10) {
        this.f15598l = C3337ce.m14032a(this.f15598l, 0, z10);
    }

    /* renamed from: c */
    public void m15088c(boolean z10) {
        if (z10) {
            return;
        }
        this.f15597c = null;
    }

    /* renamed from: a */
    public void m15083a(boolean z10) {
        if (z10) {
            return;
        }
        this.f15595a = null;
    }

    /* renamed from: b */
    public C3516e m15084b(String str) {
        this.f15597c = str;
        return this;
    }

    public C3516e(long j10, String str) {
        this();
        this.f15596b = j10;
        m15086b(true);
        this.f15597c = str;
    }

    /* renamed from: a */
    public C3516e m15081a(long j10) {
        this.f15596b = j10;
        m15086b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m15103a(i10);
    }

    /* renamed from: a */
    private void m15074a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public C3516e(C3516e c3516e) {
        this.f15598l = (byte) 0;
        this.f15599m = new e[]{e.VALUE, e.TS, e.GUID};
        this.f15598l = c3516e.f15598l;
        if (c3516e.m15089d()) {
            this.f15595a = c3516e.f15595a;
        }
        this.f15596b = c3516e.f15596b;
        if (c3516e.m15095j()) {
            this.f15597c = c3516e.f15597c;
        }
    }

    /* renamed from: a */
    private void m15073a(ObjectInputStream objectInputStream) {
        try {
            this.f15598l = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
