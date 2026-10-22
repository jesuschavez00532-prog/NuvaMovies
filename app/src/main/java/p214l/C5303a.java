package p214l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C5303a extends C5311i implements Map {

    /* renamed from: h */
    AbstractC5310h f21575h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5310h {
        a() {
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: a */
        protected void mo21351a() {
            C5303a.this.clear();
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: b */
        protected Object mo21352b(int i10, int i11) {
            return C5303a.this.f21632b[(i10 << 1) + i11];
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: c */
        protected Map mo21353c() {
            return C5303a.this;
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: d */
        protected int mo21354d() {
            return C5303a.this.f21633c;
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: e */
        protected int mo21355e(Object obj) {
            return C5303a.this.m21431f(obj);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: f */
        protected int mo21356f(Object obj) {
            return C5303a.this.m21433h(obj);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: g */
        protected void mo21357g(Object obj, Object obj2) {
            C5303a.this.put(obj, obj2);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: h */
        protected void mo21358h(int i10) {
            C5303a.this.mo17198k(i10);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: i */
        protected Object mo21359i(int i10, Object obj) {
            return C5303a.this.mo17199l(i10, obj);
        }
    }

    public C5303a() {
    }

    /* renamed from: n */
    private AbstractC5310h m21349n() {
        if (this.f21575h == null) {
            this.f21575h = new a();
        }
        return this.f21575h;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return m21349n().m21419l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return m21349n().m21420m();
    }

    /* renamed from: o */
    public boolean m21350o(Collection collection) {
        return AbstractC5310h.m21418p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m21429c(this.f21633c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return m21349n().m21421n();
    }

    public C5303a(int i10) {
        super(i10);
    }

    public C5303a(C5311i c5311i) {
        super(c5311i);
    }
}
