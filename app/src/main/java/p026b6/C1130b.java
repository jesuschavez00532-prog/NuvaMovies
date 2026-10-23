package p026b6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007a6.AbstractC0074g;
import p395x5.C7503f;

/* renamed from: b6.b */
/* loaded from: classes.dex */
class C1130b {

    /* renamed from: a */
    private final Map f4420a = new HashMap();

    /* renamed from: b */
    private final int f4421b;

    /* renamed from: c */
    private final int f4422c;

    public C1130b(int i10, int i11) {
        this.f4421b = i10;
        this.f4422c = i11;
    }

    /* renamed from: b */
    private String m5115b(String str) {
        if (str != null) {
            return m5116c(str, this.f4422c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m5116c(String str, int i10) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i10) {
                return trim.substring(0, i10);
            }
            return trim;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized Map m5117a() {
        return Collections.unmodifiableMap(new HashMap(this.f4420a));
    }

    /* renamed from: d */
    public synchronized boolean m5118d(String str, String str2) {
        String m5115b = m5115b(str);
        if (this.f4420a.size() >= this.f4421b && !this.f4420a.containsKey(m5115b)) {
            C7503f.m28716f().m28725k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f4421b);
            return false;
        }
        String m5116c = m5116c(str2, this.f4422c);
        if (AbstractC0074g.m248A((String) this.f4420a.get(m5115b), m5116c)) {
            return false;
        }
        Map map = this.f4420a;
        if (str2 == null) {
            m5116c = "";
        }
        map.put(m5115b, m5116c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m5119e(Map map) {
        String m5116c = null;
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String m5115b = m5115b((String) entry.getKey());
            if (this.f4420a.size() >= this.f4421b && !this.f4420a.containsKey(m5115b)) {
                i10++;
            }
            String str = (String) entry.getValue();
            Map map2 = this.f4420a;
            if (str == null) {
                m5116c = "";
            } else {
                m5116c = m5116c(str, this.f4422c);
            }
            map2.put(m5115b, m5116c);
        }
        if (i10 > 0) {
            C7503f.m28716f().m28725k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f4421b);
        }
    }
}
