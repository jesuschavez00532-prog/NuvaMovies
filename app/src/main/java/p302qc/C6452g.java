package p302qc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;

/* renamed from: qc.g */
/* loaded from: classes3.dex */
public final class C6452g extends HashMap {
    /* renamed from: a */
    public /* bridge */ boolean m25273a(String str) {
        return super.containsKey(str);
    }

    /* renamed from: b */
    public Object m25274b(String str) {
        int m27734D;
        Object obj;
        Object obj2;
        boolean m27763v;
        if (str == null) {
            return null;
        }
        Object obj3 = super.get(str);
        if (obj3 == null) {
            m27734D = AbstractC7167u.m27734D(str, '?', 0, false, 6, null);
            if (m27734D > 0) {
                obj2 = str.substring(0, m27734D);
                AbstractC5868k.m23673e(obj2, "this as java.lang.String…ing(startIndex, endIndex)");
                obj = super.get(obj2);
                if (obj != null) {
                    return obj;
                }
            } else {
                obj = obj3;
                obj2 = null;
            }
            for (String str2 : keySet()) {
                if (str2 != null) {
                    m27763v = AbstractC7167u.m27763v(str2, "\\", false, 2, null);
                    if (m27763v) {
                        Pattern compile = Pattern.compile(str2);
                        if (compile.matcher(str).find()) {
                            return super.get(str2);
                        }
                        if (obj2 != null && compile.matcher(str).find()) {
                            return super.get(str2);
                        }
                    } else {
                        continue;
                    }
                }
            }
            return obj;
        }
        return obj3;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof String;
        }
        if (!z10) {
            return false;
        }
        return m25273a((String) obj);
    }

    /* renamed from: d */
    public /* bridge */ Set m25275d() {
        return super.entrySet();
    }

    /* renamed from: e */
    public /* bridge */ Set m25276e() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return m25275d();
    }

    /* renamed from: f */
    public /* bridge */ Object m25277f(String str, Object obj) {
        return super.getOrDefault(str, obj);
    }

    /* renamed from: g */
    public /* bridge */ int m25278g() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof String;
        }
        if (!z10) {
            return null;
        }
        return m25274b((String) obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof String;
        }
        if (!z10) {
            return obj2;
        }
        return m25277f((String) obj, obj2);
    }

    /* renamed from: h */
    public /* bridge */ Collection m25279h() {
        return super.values();
    }

    /* renamed from: i */
    public /* bridge */ Object m25280i(String str) {
        return super.remove(str);
    }

    /* renamed from: j */
    public /* bridge */ boolean m25281j(String str, Object obj) {
        return super.remove(str, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return m25276e();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return m25280i((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m25278g();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return m25279h();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj == null ? true : obj instanceof String) {
            return m25281j((String) obj, obj2);
        }
        return false;
    }
}
