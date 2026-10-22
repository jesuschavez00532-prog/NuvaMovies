package p278p1;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p1.l */
/* loaded from: classes.dex */
public final class C6172l implements InterfaceC6170j {

    /* renamed from: c */
    private final Map f24266c;

    /* renamed from: d */
    private volatile Map f24267d;

    /* renamed from: p1.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d */
        private static final String f24268d;

        /* renamed from: e */
        private static final Map f24269e;

        /* renamed from: a */
        private boolean f24270a = true;

        /* renamed from: b */
        private Map f24271b = f24269e;

        /* renamed from: c */
        private boolean f24272c = true;

        static {
            String m24653g = m24653g();
            f24268d = m24653g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m24653g)) {
                hashMap.put(HttpHeaders.HEAD_KEY_USER_AGENT, Collections.singletonList(new b(m24653g)));
            }
            f24269e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        private Map m24650d() {
            HashMap hashMap = new HashMap(this.f24271b.size());
            for (Map.Entry entry : this.f24271b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        private void m24651e() {
            if (this.f24270a) {
                this.f24270a = false;
                this.f24271b = m24650d();
            }
        }

        /* renamed from: f */
        private List m24652f(String str) {
            List list = (List) this.f24271b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f24271b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        /* renamed from: g */
        static String m24653g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        /* renamed from: a */
        public a m24654a(String str, String str2) {
            return m24655b(str, new b(str2));
        }

        /* renamed from: b */
        public a m24655b(String str, InterfaceC6171k interfaceC6171k) {
            if (this.f24272c && HttpHeaders.HEAD_KEY_USER_AGENT.equalsIgnoreCase(str)) {
                return m24657h(str, interfaceC6171k);
            }
            m24651e();
            m24652f(str).add(interfaceC6171k);
            return this;
        }

        /* renamed from: c */
        public C6172l m24656c() {
            this.f24270a = true;
            return new C6172l(this.f24271b);
        }

        /* renamed from: h */
        public a m24657h(String str, InterfaceC6171k interfaceC6171k) {
            m24651e();
            if (interfaceC6171k == null) {
                this.f24271b.remove(str);
            } else {
                List m24652f = m24652f(str);
                m24652f.clear();
                m24652f.add(interfaceC6171k);
            }
            if (this.f24272c && HttpHeaders.HEAD_KEY_USER_AGENT.equalsIgnoreCase(str)) {
                this.f24272c = false;
            }
            return this;
        }
    }

    /* renamed from: p1.l$b */
    /* loaded from: classes.dex */
    static final class b implements InterfaceC6171k {

        /* renamed from: a */
        private final String f24273a;

        b(String str) {
            this.f24273a = str;
        }

        @Override // p278p1.InterfaceC6171k
        /* renamed from: a */
        public String mo24647a() {
            return this.f24273a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f24273a.equals(((b) obj).f24273a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24273a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f24273a + "'}";
        }
    }

    C6172l(Map map) {
        this.f24266c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m24648b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String mo24647a = ((InterfaceC6171k) list.get(i10)).mo24647a();
            if (!TextUtils.isEmpty(mo24647a)) {
                sb2.append(mo24647a);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    private Map m24649c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f24266c.entrySet()) {
            String m24648b = m24648b((List) entry.getValue());
            if (!TextUtils.isEmpty(m24648b)) {
                hashMap.put(entry.getKey(), m24648b);
            }
        }
        return hashMap;
    }

    @Override // p278p1.InterfaceC6170j
    /* renamed from: a */
    public Map mo24646a() {
        if (this.f24267d == null) {
            synchronized (this) {
                if (this.f24267d == null) {
                    this.f24267d = Collections.unmodifiableMap(m24649c());
                }
            }
        }
        return this.f24267d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6172l) {
            return this.f24266c.equals(((C6172l) obj).f24266c);
        }
        return false;
    }

    public int hashCode() {
        return this.f24266c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f24266c + '}';
    }
}
