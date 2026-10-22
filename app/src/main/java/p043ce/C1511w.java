package p043ce;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.w */
/* loaded from: classes3.dex */
public final class C1511w implements Map, Serializable, InterfaceC5974a {

    /* renamed from: a */
    public static final C1511w f5685a = new C1511w();

    private C1511w() {
    }

    /* renamed from: a */
    public boolean m7023a(Void r22) {
        AbstractC5868k.m23674f(r22, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set m7025c() {
        return C1512x.f5686a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m7023a((Void) obj);
    }

    /* renamed from: d */
    public Set m7026d() {
        return C1512x.f5686a;
    }

    /* renamed from: e */
    public int m7027e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m7025c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Collection m7028f() {
        return C1510v.f5684a;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m7026d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m7027e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m7028f();
    }
}
