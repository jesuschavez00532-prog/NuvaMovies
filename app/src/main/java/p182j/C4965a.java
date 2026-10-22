package p182j;

import java.util.HashMap;
import java.util.Map;
import p182j.C4966b;

/* renamed from: j.a */
/* loaded from: classes.dex */
public class C4965a extends C4966b {

    /* renamed from: e */
    private HashMap f20675e = new HashMap();

    public boolean contains(Object obj) {
        return this.f20675e.containsKey(obj);
    }

    @Override // p182j.C4966b
    /* renamed from: g */
    protected C4966b.c mo20295g(Object obj) {
        return (C4966b.c) this.f20675e.get(obj);
    }

    @Override // p182j.C4966b
    /* renamed from: n */
    public Object mo20296n(Object obj, Object obj2) {
        C4966b.c mo20295g = mo20295g(obj);
        if (mo20295g != null) {
            return mo20295g.f20681b;
        }
        this.f20675e.put(obj, m20302k(obj, obj2));
        return null;
    }

    @Override // p182j.C4966b
    /* renamed from: o */
    public Object mo20297o(Object obj) {
        Object mo20297o = super.mo20297o(obj);
        this.f20675e.remove(obj);
        return mo20297o;
    }

    /* renamed from: p */
    public Map.Entry m20298p(Object obj) {
        if (contains(obj)) {
            return ((C4966b.c) this.f20675e.get(obj)).f20683d;
        }
        return null;
    }
}
