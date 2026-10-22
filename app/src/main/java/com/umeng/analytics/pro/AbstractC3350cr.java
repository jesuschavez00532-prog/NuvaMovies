package com.umeng.analytics.pro;

import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.AbstractC3350cr;
import com.umeng.analytics.pro.InterfaceC3347co;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.cr */
/* loaded from: classes3.dex */
public abstract class AbstractC3350cr<T extends AbstractC3350cr<?, ?>, F extends InterfaceC3347co> implements InterfaceC3340ch<T, F> {

    /* renamed from: c */
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> f14414c;

    /* renamed from: a */
    protected Object f14415a;

    /* renamed from: b */
    protected F f14416b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.cr$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3376dq<AbstractC3350cr> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, AbstractC3350cr abstractC3350cr) {
            abstractC3350cr.f14416b = null;
            abstractC3350cr.f14415a = null;
            abstractC3366dg.mo14160j();
            C3361db mo14162l = abstractC3366dg.mo14162l();
            Object m14106a = abstractC3350cr.m14106a(abstractC3366dg, mo14162l);
            abstractC3350cr.f14415a = m14106a;
            if (m14106a != null) {
                abstractC3350cr.f14416b = (F) abstractC3350cr.m14103a(mo14162l.f14487c);
            }
            abstractC3366dg.mo14163m();
            abstractC3366dg.mo14162l();
            abstractC3366dg.mo14161k();
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, AbstractC3350cr abstractC3350cr) {
            if (abstractC3350cr.m14102a() != null && abstractC3350cr.m14111b() != null) {
                abstractC3366dg.mo14144a(abstractC3350cr.m14118d());
                abstractC3366dg.mo14139a(abstractC3350cr.m14116c(abstractC3350cr.f14416b));
                abstractC3350cr.m14110a(abstractC3366dg);
                abstractC3366dg.mo14151c();
                abstractC3366dg.mo14153d();
                abstractC3366dg.mo14150b();
                return;
            }
            throw new C3367dh("Cannot write a TUnion with no set value!");
        }
    }

    /* renamed from: com.umeng.analytics.pro.cr$b */
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
    /* renamed from: com.umeng.analytics.pro.cr$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC3377dr<AbstractC3350cr> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, AbstractC3350cr abstractC3350cr) {
            abstractC3350cr.f14416b = null;
            abstractC3350cr.f14415a = null;
            short mo14172v = abstractC3366dg.mo14172v();
            Object m14107a = abstractC3350cr.m14107a(abstractC3366dg, mo14172v);
            abstractC3350cr.f14415a = m14107a;
            if (m14107a != null) {
                abstractC3350cr.f14416b = (F) abstractC3350cr.m14103a(mo14172v);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, AbstractC3350cr abstractC3350cr) {
            if (abstractC3350cr.m14102a() != null && abstractC3350cr.m14111b() != null) {
                abstractC3366dg.mo14147a(abstractC3350cr.f14416b.mo13982a());
                abstractC3350cr.m14113b(abstractC3366dg);
                return;
            }
            throw new C3367dh("Cannot write a TUnion with no set value!");
        }
    }

    /* renamed from: com.umeng.analytics.pro.cr$d */
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
        f14414c = hashMap;
        hashMap.put(AbstractC3376dq.class, new b());
        hashMap.put(AbstractC3377dr.class, new d());
    }

    protected AbstractC3350cr() {
        this.f14416b = null;
        this.f14415a = null;
    }

    /* renamed from: a */
    private static Object m14098a(Object obj) {
        if (obj instanceof InterfaceC3340ch) {
            return ((InterfaceC3340ch) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return C3341ci.m14076d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return m14099a((List) obj);
        }
        if (obj instanceof Set) {
            return m14101a((Set) obj);
        }
        return obj instanceof Map ? m14100a((Map<Object, Object>) obj) : obj;
    }

    /* renamed from: a */
    protected abstract F m14103a(short s10);

    /* renamed from: a */
    protected abstract Object m14106a(AbstractC3366dg abstractC3366dg, C3361db c3361db);

    /* renamed from: a */
    protected abstract Object m14107a(AbstractC3366dg abstractC3366dg, short s10);

    /* renamed from: a */
    protected abstract void m14110a(AbstractC3366dg abstractC3366dg);

    /* renamed from: b */
    public Object m14111b() {
        return this.f14415a;
    }

    /* renamed from: b */
    protected abstract void m14112b(F f10, Object obj);

    /* renamed from: b */
    protected abstract void m14113b(AbstractC3366dg abstractC3366dg);

    /* renamed from: c */
    protected abstract C3361db m14116c(F f10);

    /* renamed from: c */
    public boolean m14117c() {
        return this.f14416b != null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public final void clear() {
        this.f14416b = null;
        this.f14415a = null;
    }

    /* renamed from: d */
    protected abstract C3371dl m14118d();

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        f14414c.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Operator.Operation.LESS_THAN);
        sb2.append(getClass().getSimpleName());
        sb2.append(" ");
        if (m14102a() != null) {
            Object m14111b = m14111b();
            sb2.append(m14116c(m14102a()).f14485a);
            sb2.append(":");
            if (m14111b instanceof ByteBuffer) {
                C3341ci.m14071a((ByteBuffer) m14111b, sb2);
            } else {
                sb2.append(m14111b.toString());
            }
        }
        sb2.append(Operator.Operation.GREATER_THAN);
        return sb2.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        f14414c.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: b */
    public boolean m14115b(F f10) {
        return this.f14416b == f10;
    }

    /* renamed from: b */
    public boolean m14114b(int i10) {
        return m14115b((AbstractC3350cr<T, F>) m14103a((short) i10));
    }

    protected AbstractC3350cr(F f10, Object obj) {
        m14109a((AbstractC3350cr<T, F>) f10, obj);
    }

    protected AbstractC3350cr(AbstractC3350cr<T, F> abstractC3350cr) {
        if (abstractC3350cr.getClass().equals(getClass())) {
            this.f14416b = abstractC3350cr.f14416b;
            this.f14415a = m14098a(abstractC3350cr.f14415a);
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: a */
    private static Map m14100a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(m14098a(entry.getKey()), m14098a(entry.getValue()));
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Set m14101a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m14098a(it.next()));
        }
        return hashSet;
    }

    /* renamed from: a */
    private static List m14099a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m14098a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public F m14102a() {
        return this.f14416b;
    }

    /* renamed from: a */
    public Object m14105a(F f10) {
        if (f10 == this.f14416b) {
            return m14111b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f10 + " because union's set field is " + this.f14416b);
    }

    /* renamed from: a */
    public Object m14104a(int i10) {
        return m14105a((AbstractC3350cr<T, F>) m14103a((short) i10));
    }

    /* renamed from: a */
    public void m14109a(F f10, Object obj) {
        m14112b(f10, obj);
        this.f14416b = f10;
        this.f14415a = obj;
    }

    /* renamed from: a */
    public void m14108a(int i10, Object obj) {
        m14109a((AbstractC3350cr<T, F>) m14103a((short) i10), obj);
    }
}
