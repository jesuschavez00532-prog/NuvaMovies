package p230m1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: m1.g */
/* loaded from: classes.dex */
class C5574g {

    /* renamed from: a */
    private final a f22577a = new a();

    /* renamed from: b */
    private final Map f22578b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Object f22579a;

        /* renamed from: b */
        private List f22580b;

        /* renamed from: c */
        a f22581c;

        /* renamed from: d */
        a f22582d;

        a() {
            this(null);
        }

        /* renamed from: a */
        public void m22629a(Object obj) {
            if (this.f22580b == null) {
                this.f22580b = new ArrayList();
            }
            this.f22580b.add(obj);
        }

        /* renamed from: b */
        public Object m22630b() {
            int m22631c = m22631c();
            if (m22631c > 0) {
                return this.f22580b.remove(m22631c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m22631c() {
            List list = this.f22580b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f22582d = this;
            this.f22581c = this;
            this.f22579a = obj;
        }
    }

    /* renamed from: b */
    private void m22622b(a aVar) {
        m22624e(aVar);
        a aVar2 = this.f22577a;
        aVar.f22582d = aVar2;
        aVar.f22581c = aVar2.f22581c;
        m22625g(aVar);
    }

    /* renamed from: c */
    private void m22623c(a aVar) {
        m22624e(aVar);
        a aVar2 = this.f22577a;
        aVar.f22582d = aVar2.f22582d;
        aVar.f22581c = aVar2;
        m22625g(aVar);
    }

    /* renamed from: e */
    private static void m22624e(a aVar) {
        a aVar2 = aVar.f22582d;
        aVar2.f22581c = aVar.f22581c;
        aVar.f22581c.f22582d = aVar2;
    }

    /* renamed from: g */
    private static void m22625g(a aVar) {
        aVar.f22581c.f22582d = aVar;
        aVar.f22582d.f22581c = aVar;
    }

    /* renamed from: a */
    public Object m22626a(InterfaceC5580m interfaceC5580m) {
        a aVar = (a) this.f22578b.get(interfaceC5580m);
        if (aVar == null) {
            aVar = new a(interfaceC5580m);
            this.f22578b.put(interfaceC5580m, aVar);
        } else {
            interfaceC5580m.mo22645a();
        }
        m22622b(aVar);
        return aVar.m22630b();
    }

    /* renamed from: d */
    public void m22627d(InterfaceC5580m interfaceC5580m, Object obj) {
        a aVar = (a) this.f22578b.get(interfaceC5580m);
        if (aVar == null) {
            aVar = new a(interfaceC5580m);
            m22623c(aVar);
            this.f22578b.put(interfaceC5580m, aVar);
        } else {
            interfaceC5580m.mo22645a();
        }
        aVar.m22629a(obj);
    }

    /* renamed from: f */
    public Object m22628f() {
        for (a aVar = this.f22577a.f22582d; !aVar.equals(this.f22577a); aVar = aVar.f22582d) {
            Object m22630b = aVar.m22630b();
            if (m22630b != null) {
                return m22630b;
            }
            m22624e(aVar);
            this.f22578b.remove(aVar.f22579a);
            ((InterfaceC5580m) aVar.f22579a).mo22645a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f22577a.f22581c;
        boolean z10 = false;
        while (!aVar.equals(this.f22577a)) {
            sb2.append('{');
            sb2.append(aVar.f22579a);
            sb2.append(':');
            sb2.append(aVar.m22631c());
            sb2.append("}, ");
            aVar = aVar.f22581c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
