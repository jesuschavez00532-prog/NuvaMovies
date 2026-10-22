package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3366dg;
import com.umeng.analytics.pro.AbstractC3376dq;
import com.umeng.analytics.pro.AbstractC3377dr;
import com.umeng.analytics.pro.C3346cn;
import com.umeng.analytics.pro.C3352ct;
import com.umeng.analytics.pro.C3353cu;
import com.umeng.analytics.pro.C3354cv;
import com.umeng.analytics.pro.C3355cw;
import com.umeng.analytics.pro.C3357cy;
import com.umeng.analytics.pro.C3360da;
import com.umeng.analytics.pro.C3361db;
import com.umeng.analytics.pro.C3362dc;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.c */
/* loaded from: classes3.dex */
public class C3514c implements InterfaceC3340ch<C3514c, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3352ct> f15550d;

    /* renamed from: e */
    private static final long f15551e = -5764118265293965743L;

    /* renamed from: f */
    private static final C3371dl f15552f = new C3371dl("IdTracking");

    /* renamed from: g */
    private static final C3361db f15553g = new C3361db("snapshots", C3373dn.f14523k, 1);

    /* renamed from: h */
    private static final C3361db f15554h = new C3361db("journals", C3373dn.f14525m, 2);

    /* renamed from: i */
    private static final C3361db f15555i = new C3361db("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f15556j;

    /* renamed from: a */
    public Map<String, C3513b> f15557a;

    /* renamed from: b */
    public List<C3512a> f15558b;

    /* renamed from: c */
    public String f15559c;

    /* renamed from: k */
    private e[] f15560k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<C3514c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3514c c3514c) {
            abstractC3366dg.mo14160j();
            while (true) {
                C3361db mo14162l = abstractC3366dg.mo14162l();
                byte b10 = mo14162l.f14486b;
                if (b10 == 0) {
                    abstractC3366dg.mo14161k();
                    c3514c.m15028n();
                    return;
                }
                short s10 = mo14162l.f14487c;
                int i10 = 0;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        } else if (b10 == 11) {
                            c3514c.f15559c = abstractC3366dg.mo14176z();
                            c3514c.m15017c(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 15) {
                        C3362dc mo14166p = abstractC3366dg.mo14166p();
                        c3514c.f15558b = new ArrayList(mo14166p.f14489b);
                        while (i10 < mo14166p.f14489b) {
                            C3512a c3512a = new C3512a();
                            c3512a.read(abstractC3366dg);
                            c3514c.f15558b.add(c3512a);
                            i10++;
                        }
                        abstractC3366dg.mo14167q();
                        c3514c.m15015b(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 13) {
                    C3363dd mo14164n = abstractC3366dg.mo14164n();
                    c3514c.f15557a = new HashMap(mo14164n.f14492c * 2);
                    while (i10 < mo14164n.f14492c) {
                        String mo14176z = abstractC3366dg.mo14176z();
                        C3513b c3513b = new C3513b();
                        c3513b.read(abstractC3366dg);
                        c3514c.f15557a.put(mo14176z, c3513b);
                        i10++;
                    }
                    abstractC3366dg.mo14165o();
                    c3514c.m15013a(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3514c c3514c) {
            c3514c.m15028n();
            abstractC3366dg.mo14144a(C3514c.f15552f);
            if (c3514c.f15557a != null) {
                abstractC3366dg.mo14139a(C3514c.f15553g);
                abstractC3366dg.mo14141a(new C3363dd((byte) 11, (byte) 12, c3514c.f15557a.size()));
                for (Map.Entry<String, C3513b> entry : c3514c.f15557a.entrySet()) {
                    abstractC3366dg.mo14145a(entry.getKey());
                    entry.getValue().write(abstractC3366dg);
                }
                abstractC3366dg.mo14155e();
                abstractC3366dg.mo14151c();
            }
            if (c3514c.f15558b != null && c3514c.m15024j()) {
                abstractC3366dg.mo14139a(C3514c.f15554h);
                abstractC3366dg.mo14140a(new C3362dc((byte) 12, c3514c.f15558b.size()));
                Iterator<C3512a> it = c3514c.f15558b.iterator();
                while (it.hasNext()) {
                    it.next().write(abstractC3366dg);
                }
                abstractC3366dg.mo14156f();
                abstractC3366dg.mo14151c();
            }
            if (c3514c.f15559c != null && c3514c.m15027m()) {
                abstractC3366dg.mo14139a(C3514c.f15555i);
                abstractC3366dg.mo14145a(c3514c.f15559c);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
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
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<C3514c> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, C3514c c3514c) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14137a(c3514c.f15557a.size());
            for (Map.Entry<String, C3513b> entry : c3514c.f15557a.entrySet()) {
                c3372dm.mo14145a(entry.getKey());
                entry.getValue().write(c3372dm);
            }
            BitSet bitSet = new BitSet();
            if (c3514c.m15024j()) {
                bitSet.set(0);
            }
            if (c3514c.m15027m()) {
                bitSet.set(1);
            }
            c3372dm.m14217a(bitSet, 2);
            if (c3514c.m15024j()) {
                c3372dm.mo14137a(c3514c.f15558b.size());
                Iterator<C3512a> it = c3514c.f15558b.iterator();
                while (it.hasNext()) {
                    it.next().write(c3372dm);
                }
            }
            if (c3514c.m15027m()) {
                c3372dm.mo14145a(c3514c.f15559c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, C3514c c3514c) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            C3363dd c3363dd = new C3363dd((byte) 11, (byte) 12, c3372dm.mo14173w());
            c3514c.f15557a = new HashMap(c3363dd.f14492c * 2);
            for (int i10 = 0; i10 < c3363dd.f14492c; i10++) {
                String mo14176z = c3372dm.mo14176z();
                C3513b c3513b = new C3513b();
                c3513b.read(c3372dm);
                c3514c.f15557a.put(mo14176z, c3513b);
            }
            c3514c.m15013a(true);
            BitSet m14218b = c3372dm.m14218b(2);
            if (m14218b.get(0)) {
                C3362dc c3362dc = new C3362dc((byte) 12, c3372dm.mo14173w());
                c3514c.f15558b = new ArrayList(c3362dc.f14489b);
                for (int i11 = 0; i11 < c3362dc.f14489b; i11++) {
                    C3512a c3512a = new C3512a();
                    c3512a.read(c3372dm);
                    c3514c.f15558b.add(c3512a);
                }
                c3514c.m15015b(true);
            }
            if (m14218b.get(1)) {
                c3514c.f15559c = c3372dm.mo14176z();
                c3514c.m15017c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
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
        f15556j = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new C3352ct("snapshots", (byte) 1, new C3355cw(C3373dn.f14523k, new C3353cu((byte) 11), new C3357cy((byte) 12, C3513b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new C3352ct("journals", (byte) 2, new C3354cv(C3373dn.f14525m, new C3357cy((byte) 12, C3512a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3352ct("checksum", (byte) 2, new C3353cu((byte) 11)));
        Map<e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f15550d = unmodifiableMap;
        C3352ct.m14126a(C3514c.class, unmodifiableMap);
    }

    public C3514c() {
        this.f15560k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3514c deepCopy() {
        return new C3514c(this);
    }

    /* renamed from: b */
    public int m15014b() {
        Map<String, C3513b> map = this.f15557a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3513b> m15016c() {
        return this.f15557a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        this.f15557a = null;
        this.f15558b = null;
        this.f15559c = null;
    }

    /* renamed from: d */
    public void m15018d() {
        this.f15557a = null;
    }

    /* renamed from: e */
    public boolean m15019e() {
        if (this.f15557a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m15020f() {
        List<C3512a> list = this.f15558b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: g */
    public Iterator<C3512a> m15021g() {
        List<C3512a> list = this.f15558b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: h */
    public List<C3512a> m15022h() {
        return this.f15558b;
    }

    /* renamed from: i */
    public void m15023i() {
        this.f15558b = null;
    }

    /* renamed from: j */
    public boolean m15024j() {
        if (this.f15558b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public String m15025k() {
        return this.f15559c;
    }

    /* renamed from: l */
    public void m15026l() {
        this.f15559c = null;
    }

    /* renamed from: m */
    public boolean m15027m() {
        if (this.f15559c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void m15028n() {
        if (this.f15557a != null) {
            return;
        }
        throw new C3367dh("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f15556j.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdTracking(");
        sb2.append("snapshots:");
        Map<String, C3513b> map = this.f15557a;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        if (m15024j()) {
            sb2.append(", ");
            sb2.append("journals:");
            List<C3512a> list = this.f15558b;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (m15027m()) {
            sb2.append(", ");
            sb2.append("checksum:");
            String str = this.f15559c;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f15556j.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    /* loaded from: classes3.dex */
    public enum e implements InterfaceC3347co {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f15564d = new HashMap();

        /* renamed from: e */
        private final short f15566e;

        /* renamed from: f */
        private final String f15567f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f15564d.put(eVar.mo13983b(), eVar);
            }
        }

        e(short s10, String str) {
            this.f15566e = s10;
            this.f15567f = str;
        }

        /* renamed from: a */
        public static e m15035a(int i10) {
            if (i10 == 1) {
                return SNAPSHOTS;
            }
            if (i10 == 2) {
                return JOURNALS;
            }
            if (i10 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static e m15037b(int i10) {
            e m15035a = m15035a(i10);
            if (m15035a != null) {
                return m15035a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15567f;
        }

        /* renamed from: a */
        public static e m15036a(String str) {
            return f15564d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15566e;
        }
    }

    /* renamed from: a */
    public void m15012a(String str, C3513b c3513b) {
        if (this.f15557a == null) {
            this.f15557a = new HashMap();
        }
        this.f15557a.put(str, c3513b);
    }

    /* renamed from: b */
    public void m15015b(boolean z10) {
        if (z10) {
            return;
        }
        this.f15558b = null;
    }

    /* renamed from: c */
    public void m15017c(boolean z10) {
        if (z10) {
            return;
        }
        this.f15559c = null;
    }

    public C3514c(Map<String, C3513b> map) {
        this();
        this.f15557a = map;
    }

    public C3514c(C3514c c3514c) {
        this.f15560k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (c3514c.m15019e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, C3513b> entry : c3514c.f15557a.entrySet()) {
                hashMap.put(entry.getKey(), new C3513b(entry.getValue()));
            }
            this.f15557a = hashMap;
        }
        if (c3514c.m15024j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C3512a> it = c3514c.f15558b.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3512a(it.next()));
            }
            this.f15558b = arrayList;
        }
        if (c3514c.m15027m()) {
            this.f15559c = c3514c.f15559c;
        }
    }

    /* renamed from: a */
    public C3514c m15010a(Map<String, C3513b> map) {
        this.f15557a = map;
        return this;
    }

    /* renamed from: a */
    public void m15013a(boolean z10) {
        if (z10) {
            return;
        }
        this.f15557a = null;
    }

    /* renamed from: a */
    public void m15011a(C3512a c3512a) {
        if (this.f15558b == null) {
            this.f15558b = new ArrayList();
        }
        this.f15558b.add(c3512a);
    }

    /* renamed from: a */
    public C3514c m15009a(List<C3512a> list) {
        this.f15558b = list;
        return this;
    }

    /* renamed from: a */
    public C3514c m15008a(String str) {
        this.f15559c = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i10) {
        return e.m15035a(i10);
    }

    /* renamed from: a */
    private void m15001a(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: a */
    private void m15000a(ObjectInputStream objectInputStream) {
        try {
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
